package com.example.quadrantlauncher

import android.os.IBinder
import android.os.Build
import android.util.Log
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.ArrayList
import java.util.regex.Pattern

class ShellUserService : IShellService.Stub() {

    private val TAG = "ShellUserService"

    override fun forceStop(packageName: String) {
        try { Runtime.getRuntime().exec("am force-stop $packageName").waitFor() } catch (e: Exception) { Log.e(TAG, "Failed to kill", e) }
    }

    override fun runCommand(command: String) {
        try { Runtime.getRuntime().exec(command).waitFor() } catch (e: Exception) { Log.e(TAG, "Command failed: $command", e) }
    }

    override fun runCommandWithOutput(command: String): String {
        val output = StringBuilder()
        try {
            val process = Runtime.getRuntime().exec(command)
            val reader = BufferedReader(InputStreamReader(process.inputStream))
            var line: String?
            while (reader.readLine().also { line = it } != null) {
                output.append(line).append("\n")
            }
            reader.close()
            process.waitFor()
        } catch (e: Exception) {
            Log.e(TAG, "CommandWithOutput failed", e)
            return "Error: ${e.message}"
        }
        return output.toString()
    }

    override fun setScreenOff(displayIndex: Int, turnOff: Boolean) {
        try {
            val scClass = if (Build.VERSION.SDK_INT >= 34) {
                try { Class.forName("com.android.server.display.DisplayControl") } catch (e: Exception) { Class.forName("android.view.SurfaceControl") }
            } else { Class.forName("android.view.SurfaceControl") }

            val getIdsMethod = scClass.getMethod("getPhysicalDisplayIds")
            val physicalIds = getIdsMethod.invoke(null) as LongArray
            if (physicalIds.isEmpty()) return

            val targetId = if (displayIndex >= 0 && displayIndex < physicalIds.size) physicalIds[displayIndex] else physicalIds[0]
            val getTokenMethod = scClass.getMethod("getPhysicalDisplayToken", Long::class.javaPrimitiveType)
            val token = getTokenMethod.invoke(null, targetId) as? IBinder ?: return

            val mode = if (turnOff) 0 else 2 
            val ctrlClass = Class.forName("android.view.SurfaceControl")
            val setPowerMethod = ctrlClass.getMethod("setDisplayPowerMode", IBinder::class.java, Int::class.javaPrimitiveType)
            setPowerMethod.invoke(null, token, mode)
        } catch (e: Exception) { Log.e(TAG, "Failed to set screen power", e) }
    }

    override fun repositionTask(packageName: String, left: Int, top: Int, right: Int, bottom: Int) {
        try {
            val process = Runtime.getRuntime().exec("dumpsys activity top")
            val reader = BufferedReader(InputStreamReader(process.inputStream))
            var line: String?; var targetTaskId = -1
            while (reader.readLine().also { line = it } != null) {
                val l = line!!.trim()
                if (l.startsWith("TASK") && l.contains(packageName)) {
                    val match = Regex("id=(\\d+)").find(l)
                    if (match != null) { targetTaskId = match.groupValues[1].toInt(); break }
                }
            }
            reader.close(); process.waitFor()
            if (targetTaskId != -1) {
                Runtime.getRuntime().exec("am task set-windowing-mode $targetTaskId 5").waitFor()
                Runtime.getRuntime().exec("am task resize $targetTaskId $left $top $right $bottom").waitFor()
            }
        } catch (e: Exception) {}
    }

    override fun getVisiblePackages(displayId: Int): List<String> {
        val packages = ArrayList<String>()
        try {
            val process = Runtime.getRuntime().exec("dumpsys activity activities")
            val reader = BufferedReader(InputStreamReader(process.inputStream))
            var line: String?; var currentScanningDisplayId = -1
            val recordPattern = Pattern.compile("u\\d+\\s+([a-zA-Z0-9_.]+)/")
            while (reader.readLine().also { line = it } != null) {
                val l = line!!.trim()
                if (l.startsWith("Display #")) {
                    val displayMatch = Regex("Display #(\\d+)").find(l)
                    if (displayMatch != null) currentScanningDisplayId = displayMatch.groupValues[1].toInt()
                    continue
                }
                if (currentScanningDisplayId == displayId && l.contains("ActivityRecord{")) {
                    val matcher = recordPattern.matcher(l)
                    if (matcher.find()) { val pkg = matcher.group(1); if (pkg != null && !packages.contains(pkg) && isUserApp(pkg)) packages.add(pkg) }
                }
            }
            reader.close(); process.waitFor()
        } catch (e: Exception) {}
        return packages
    }

    override fun getAllRunningPackages(): List<String> {
        val packages = ArrayList<String>()
        try {
            val process = Runtime.getRuntime().exec("dumpsys activity activities")
            val reader = BufferedReader(InputStreamReader(process.inputStream))
            var line: String?; val recordPattern = Pattern.compile("ActivityRecord\\{[0-9a-f]+ u\\d+ ([a-zA-Z0-9_.]+)/")
            while (reader.readLine().also { line = it } != null) {
                val l = line!!.trim()
                if (l.contains("ActivityRecord{")) {
                    val matcher = recordPattern.matcher(l)
                    if (matcher.find()) { val pkg = matcher.group(1); if (pkg != null && !packages.contains(pkg) && isUserApp(pkg)) packages.add(pkg) }
                }
            }
            reader.close(); process.waitFor()
        } catch (e: Exception) {}
        return packages
    }

    override fun getWindowLayouts(displayId: Int): List<String> {
        val results = ArrayList<String>()
        try {
            val process = Runtime.getRuntime().exec("dumpsys window windows")
            val reader = BufferedReader(InputStreamReader(process.inputStream))
            var line: String?; var pendingPkg: String? = null; var isVisible = false; var isBaseApp = false
            val windowPattern = Pattern.compile("Window\\{[0-9a-f]+ u\\d+ ([^\\}/ ]+)")
            val framePattern = Pattern.compile("(?:frame|mFrame)=\\[(-?\\d+),(-?\\d+)\\]\\[(-?\\d+),(-?\\d+)\\]")
            while (reader.readLine().also { line = it } != null) {
                val l = line!!.trim()
                if (l.startsWith("Window #")) {
                    pendingPkg = null; isVisible = false; isBaseApp = false
                    val matcher = windowPattern.matcher(l)
                    if (matcher.find()) { val pkg = matcher.group(1); if (isUserApp(pkg)) pendingPkg = pkg }
                    continue
                }
                if (pendingPkg == null) continue
                if (l.contains("mViewVisibility=0x0")) isVisible = true
                if (l.contains("ty=BASE_APPLICATION") || l.contains("type=BASE_APPLICATION")) isBaseApp = true
                if (isVisible && isBaseApp && (l.contains("frame=") || l.contains("mFrame="))) {
                    val matcher = framePattern.matcher(l)
                    if (matcher.find()) {
                        try {
                            val left = matcher.group(1).toInt(); val top = matcher.group(2).toInt()
                            val right = matcher.group(3).toInt(); val bottom = matcher.group(4).toInt()
                            if ((right - left) > 10 && (bottom - top) > 10) { results.add("$pendingPkg|$left,$top,$right,$bottom"); pendingPkg = null }
                        } catch (e: Exception) {}
                    }
                }
            }
            reader.close(); process.waitFor()
        } catch (e: Exception) {}
        return results
    }

    override fun getTaskId(packageName: String): Int {
        var taskId = -1
        try {
            val cmd = arrayOf("sh", "-c", "dumpsys activity activities | grep -E 'Task id|$packageName'")
            val process = Runtime.getRuntime().exec(cmd)
            val reader = BufferedReader(InputStreamReader(process.inputStream))
            var line: String?
            while (reader.readLine().also { line = it } != null) {
                val l = line!!.trim()
                if (l.contains(packageName)) {
                    if (l.startsWith("* Task{") || l.startsWith("Task{")) {
                         val match = Regex("#(\\d+)").find(l)
                         if (match != null) { taskId = match.groupValues[1].toInt(); break }
                    }
                    if (l.contains("ActivityRecord")) {
                         val match = Regex("t(\\d+)").find(l)
                         if (match != null) { taskId = match.groupValues[1].toInt(); break }
                    }
                }
            }
            reader.close(); process.waitFor()
        } catch (e: Exception) {}
        return taskId
    }

    override fun moveTaskToBack(taskId: Int) {
        try {
            val atmClass = Class.forName("android.app.ActivityTaskManager")
            val serviceMethod = atmClass.getMethod("getService")
            val atm = serviceMethod.invoke(null)
            val moveMethod = atm.javaClass.getMethod("moveTaskToBack", Int::class.javaPrimitiveType, Boolean::class.javaPrimitiveType)
            moveMethod.invoke(atm, taskId, true)
        } catch (e: Exception) {
            try {
                val am = Class.forName("android.app.ActivityManagerNative").getMethod("getDefault").invoke(null)
                val moveMethod = am.javaClass.getMethod("moveTaskToBack", Int::class.javaPrimitiveType, Boolean::class.javaPrimitiveType)
                moveMethod.invoke(am, taskId, true)
            } catch (e2: Exception) {}
        }
    }

    // --- BRIGHTNESS IMPLEMENTATION ---
    override fun setSystemBrightness(brightness: Int) {
        try {
            if (brightness == -1) {
                Runtime.getRuntime().exec("settings put system screen_brightness_min 0").waitFor()
                Runtime.getRuntime().exec("settings put system screen_brightness_mode 0").waitFor()
                // IMPORTANT: Insert -1 into provider directly to bypass CLI checks
                val p = Runtime.getRuntime().exec(arrayOf("content", "insert", "--uri", "content://settings/system", "--bind", "name:s:screen_brightness", "--bind", "value:i:-1"))
                p.waitFor()
                Runtime.getRuntime().exec("settings put system screen_brightness_float 0.0").waitFor()
            } else {
                Runtime.getRuntime().exec("settings put system screen_brightness $brightness").waitFor()
                val floatVal = brightness.toFloat() / 255.0f
                Runtime.getRuntime().exec("settings put system screen_brightness_float $floatVal").waitFor()
            }
        } catch (e: Exception) { Log.e(TAG, "Failed to set brightness", e) }
    }

    override fun getSystemBrightness(): Int {
        return try {
            val p = Runtime.getRuntime().exec("settings get system screen_brightness")
            val reader = BufferedReader(InputStreamReader(p.inputStream))
            reader.readLine()?.trim()?.toIntOrNull() ?: 128
        } catch (e: Exception) { 128 }
    }
    
    override fun getSystemBrightnessFloat(): Float {
        return try {
            val p = Runtime.getRuntime().exec("settings get system screen_brightness_float")
            val reader = BufferedReader(InputStreamReader(p.inputStream))
            reader.readLine()?.trim()?.toFloatOrNull() ?: 0.5f
        } catch (e: Exception) { 0.5f }
    }

    override fun setAutoBrightness(enabled: Boolean) {
        val mode = if (enabled) 1 else 0
        try { Runtime.getRuntime().exec("settings put system screen_brightness_mode $mode").waitFor() } catch (e: Exception) {}
    }

    override fun isAutoBrightness(): Boolean {
        return try {
            val p = Runtime.getRuntime().exec("settings get system screen_brightness_mode")
            val reader = BufferedReader(InputStreamReader(p.inputStream))
            val line = reader.readLine()?.trim()
            line == "1"
        } catch (e: Exception) { true }
    }

    private fun isUserApp(pkg: String): Boolean {
        if (pkg.startsWith("com.android")) return false
        if (pkg == "com.sec.android.app.launcher") return false
        if (pkg == "com.example.quadrantlauncher") return false
        if (pkg == "com.example.coverscreentester") return false
        if (pkg == "com.katsuyamaki.trackpad") return false
        return true
    }
}
