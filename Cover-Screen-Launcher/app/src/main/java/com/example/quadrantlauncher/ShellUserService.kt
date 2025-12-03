package com.example.quadrantlauncher

import android.content.Context
import android.os.IBinder
import android.os.Build
import android.util.Log
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.ArrayList
import java.util.regex.Pattern

class ShellUserService : IShellService.Stub() {

    private val TAG = "ShellUserService"

    /**
     * Get the IDisplayManager Binder service via reflection.
     * This is how Extinguish controls brightness - by calling hidden APIs directly.
     */
    private fun getDisplayManagerService(): Any? {
        return try {
            // Get ServiceManager.getService("display") via reflection
            val serviceManagerClass = Class.forName("android.os.ServiceManager")
            val getServiceMethod = serviceManagerClass.getMethod("getService", String::class.java)
            val displayBinder = getServiceMethod.invoke(null, "display") as? IBinder
            
            if (displayBinder == null) {
                Log.e(TAG, "Failed to get display service binder")
                return null
            }
            
            // Get IDisplayManager.Stub.asInterface(binder)
            val stubClass = Class.forName("android.hardware.display.IDisplayManager\$Stub")
            val asInterfaceMethod = stubClass.getMethod("asInterface", IBinder::class.java)
            
            asInterfaceMethod.invoke(null, displayBinder)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to get IDisplayManager", e)
            null
        }
    }

    /**
     * Call IDisplayManager.setTemporaryBrightness(displayId, brightness)
     * This is the hidden API that actually controls the backlight hardware.
     * 
     * For Android 14 (API 34): setTemporaryBrightness(int displayId, float brightness)
     * For older versions: setTemporaryBrightness(int brightness) - takes int 0-255
     */
    private fun setTemporaryBrightnessViaDisplayManager(brightness: Float): Boolean {
        return try {
            val displayManager = getDisplayManagerService() ?: return false
            val displayManagerClass = displayManager.javaClass
            
            // Try the newer API first (Android 14+): setTemporaryBrightness(int displayId, float brightness)
            try {
                val method = displayManagerClass.getMethod(
                    "setTemporaryBrightness",
                    Int::class.javaPrimitiveType,
                    Float::class.javaPrimitiveType
                )
                method.invoke(displayManager, 0, brightness) // displayId 0 = default display
                Log.d(TAG, "setTemporaryBrightness(displayId=0, brightness=$brightness) via new API")
                return true
            } catch (e: NoSuchMethodException) {
                Log.d(TAG, "New API not found, trying older API")
            }
            
            // Try older API: setTemporaryBrightness(int brightness) where int is 0-255
            try {
                val method = displayManagerClass.getMethod(
                    "setTemporaryBrightness",
                    Int::class.javaPrimitiveType
                )
                val intBrightness = if (brightness < 0) -1 else (brightness * 255).toInt()
                method.invoke(displayManager, intBrightness)
                Log.d(TAG, "setTemporaryBrightness($intBrightness) via old API")
                return true
            } catch (e: NoSuchMethodException) {
                Log.e(TAG, "No setTemporaryBrightness method found")
            }
            
            false
        } catch (e: Exception) {
            Log.e(TAG, "setTemporaryBrightness failed", e)
            false
        }
    }

    /**
     * Call IDisplayManager.setBrightness(displayId, brightness)
     * This persists the brightness setting.
     */
    private fun setBrightnessViaDisplayManager(brightness: Float): Boolean {
        return try {
            val displayManager = getDisplayManagerService() ?: return false
            val displayManagerClass = displayManager.javaClass
            
            val method = displayManagerClass.getMethod(
                "setBrightness",
                Int::class.javaPrimitiveType,
                Float::class.javaPrimitiveType
            )
            method.invoke(displayManager, 0, brightness) // displayId 0 = default display
            Log.d(TAG, "setBrightness(displayId=0, brightness=$brightness)")
            true
        } catch (e: Exception) {
            Log.e(TAG, "setBrightness failed", e)
            false
        }
    }

    override fun setBrightness(brightness: Int) {
        Log.d(TAG, "setBrightness called with value: $brightness")
        
        try {
            // Step 1: Disable auto brightness via shell (this still works)
            Runtime.getRuntime().exec("settings put system screen_brightness_mode 0").waitFor()
            Log.d(TAG, "Auto brightness disabled")
            
            // Step 2: Use IDisplayManager hidden API to set brightness
            // This is the Extinguish secret - it bypasses Settings database validation
            val floatBrightness = if (brightness < 0) {
                // -1 means minimum/off - use a very small positive value or 0
                // Android 14 IDisplayManager accepts -1.0f to turn off backlight
                -1.0f
            } else {
                brightness.toFloat() / 255.0f
            }
            
            // Try setTemporaryBrightness first (immediate effect)
            val tempResult = setTemporaryBrightnessViaDisplayManager(floatBrightness)
            Log.d(TAG, "setTemporaryBrightness result: $tempResult")
            
            // Also try setBrightness (persistent)
            val persistResult = setBrightnessViaDisplayManager(floatBrightness)
            Log.d(TAG, "setBrightness result: $persistResult")
            
            // Fallback: try the shell method for settings (may not work for -1)
            if (!tempResult && !persistResult) {
                Log.d(TAG, "DisplayManager APIs failed, trying shell fallback")
                Runtime.getRuntime().exec("settings put system screen_brightness $brightness").waitFor()
            }
            
            Log.d(TAG, "Brightness sequence completed for value: $brightness")
        } catch (e: Exception) {
            Log.e(TAG, "setBrightness failed", e)
        }
    }

    override fun forceStop(packageName: String) {
        try { Runtime.getRuntime().exec("am force-stop $packageName").waitFor() } catch (e: Exception) {}
    }

    override fun runCommand(command: String) {
        try { Runtime.getRuntime().exec(command).waitFor() } catch (e: Exception) {}
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
        } catch (e: Exception) {}
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
                    if (matcher.find()) { val pkg: String? = matcher.group(1); if (pkg != null && !packages.contains(pkg)) packages.add(pkg) }
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
                    if (matcher.find()) { val pkg: String? = matcher.group(1); if (pkg != null && !packages.contains(pkg)) packages.add(pkg) }
                }
            }
            reader.close(); process.waitFor()
        } catch (e: Exception) {}
        return packages
    }

    override fun getWindowLayouts(displayId: Int): List<String> { return ArrayList<String>() }
    override fun getTaskId(packageName: String): Int { return -1 }
    override fun moveTaskToBack(taskId: Int) {}
}
