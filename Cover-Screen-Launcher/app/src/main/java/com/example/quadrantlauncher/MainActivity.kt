package com.example.quadrantlauncher

import android.accessibilityservice.AccessibilityServiceInfo
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.provider.Settings
import android.view.accessibility.AccessibilityManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import rikka.shizuku.Shizuku

class MainActivity : AppCompatActivity() {

    companion object {
        const val SELECTED_APP_PACKAGE = "com.example.quadrantlauncher.SELECTED_APP_PACKAGE"
    }

    data class AppInfo(
        val label: String,
        val packageName: String,
        var isFavorite: Boolean = false,
        var isMinimized: Boolean = false
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Redirect to PermissionActivity if essential permissions are missing
        if (!hasAllPermissions()) {
            val intent = Intent(this, PermissionActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
            return
        }

        // If all good, show status
        Toast.makeText(this, "Launcher is active", Toast.LENGTH_SHORT).show()
        finish()
    }

    private fun hasAllPermissions(): Boolean {
        // 1. Overlay
        if (!Settings.canDrawOverlays(this)) return false

        // 2. Shizuku
        val shizukuGranted = try {
            Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED
        } catch (e: Exception) {
            false
        }
        if (!shizukuGranted) return false

        // 3. Accessibility
        if (!isAccessibilityServiceEnabled(this, FloatingLauncherService::class.java)) return false

        // 4. Notifications removed (Not strictly required for service to run)

        return true
    }

    private fun isAccessibilityServiceEnabled(context: Context, service: Class<*>): Boolean {
        val am = context.getSystemService(Context.ACCESSIBILITY_SERVICE) as AccessibilityManager
        val enabledServices = am.getEnabledAccessibilityServiceList(AccessibilityServiceInfo.FEEDBACK_ALL_MASK)
        for (enabledService in enabledServices) {
            val serviceInfo = enabledService.resolveInfo.serviceInfo
            if (serviceInfo.packageName == context.packageName && serviceInfo.name == service.name) {
                return true
            }
        }
        return false
    }
}
