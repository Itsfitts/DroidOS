package com.example.com.katsuyamaki.coverscreenlauncher

import java.lang.reflect.Method

object ShizukuHelper {

    // Access hidden 'newProcess' method via reflection
    private val newProcessMethod: Method by lazy {
        val clazz = Class.forName("rikka.shizuku.Shizuku")
        val method = clazz.getDeclaredMethod(
            "newProcess",
            Array<String>::class.java,
            Array<String>::class.java,
            String::class.java
        )
        method.isAccessible = true
        method
    }

    /**
     * Executes a generic shell command using Shizuku.
     * Useful for 'wm size', 'wm density', or 'am start/stop'.
     */
    fun executeShellCommand(command: String) {
        try {
            val cmd = arrayOf("sh", "-c", command)
            val process = newProcessMethod.invoke(null, cmd, null, null) as Process
            process.waitFor()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /**
     * Convenience method to force-stop an app.
     */
    fun killApp(packageName: String) {
        executeShellCommand("am force-stop $packageName")
    }
}
