package com.example.coverscreentester

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.view.Display
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import rikka.shizuku.Shizuku

class MainActivity : AppCompatActivity() {

    // Listener to handle Shizuku connection asynchronously
    private val binderReceivedListener = Shizuku.OnBinderReceivedListener {
        if (checkAllPermissions()) {
            startOverlayService()
            finish()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Register the listener immediately
        Shizuku.addBinderReceivedListener(binderReceivedListener)

        // 1. AUTO-START CHECK (Instant)
        // Wrapped in try-catch to prevent crashes if Shizuku isn't ready
        try {
            if (Shizuku.pingBinder() && checkAllPermissions()) {
                startOverlayService()
                finish()
                return
            }
        } catch (e: Exception) {
            // Ignore error, wait for listener
        }

        // 2. Show Landing Page (Fallback)
        setContentView(R.layout.activity_main)
        setupUI()
    }

    override fun onDestroy() {
        super.onDestroy()
        Shizuku.removeBinderReceivedListener(binderReceivedListener)
    }

    // Helper: Returns true ONLY if Overlay + Shizuku are both ready
    private fun checkAllPermissions(): Boolean {
        // A. Check Overlay
        if (!Settings.canDrawOverlays(this)) return false
        
        // B. Check Shizuku
        return try {
            if (!Shizuku.pingBinder()) return false
            Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED
        } catch (e: Throwable) {
            false
        }
    }

    private fun setupUI() {
        findViewById<Button>(R.id.btn_fix_restricted).setOnClickListener {
            try {
                val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
                val uri = Uri.fromParts("package", packageName, null)
                intent.data = uri
                startActivity(intent)
                Toast.makeText(this, "Tap 3 dots (top-right) -> Allow Restricted Settings", Toast.LENGTH_LONG).show()
            } catch (e: Exception) {
                Toast.makeText(this, "Error opening App Info", Toast.LENGTH_SHORT).show()
            }
        }

        findViewById<Button>(R.id.btn_open_accessibility).setOnClickListener {
            try {
                startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS))
            } catch (e: Exception) {
                Toast.makeText(this, "Error opening Accessibility", Toast.LENGTH_SHORT).show()
            }
        }

        findViewById<Button>(R.id.btn_start_check).setOnClickListener {
            manualStartCheck()
        }
    }

    private fun manualStartCheck() {
        if (!Settings.canDrawOverlays(this)) {
            Toast.makeText(this, "⚠️ Please Grant 'Display Over Apps'", Toast.LENGTH_LONG).show()
            try {
                val intent = Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:$packageName"))
                startActivity(intent)
            } catch(e: Exception) {}
            return
        }

        try {
            if (!Shizuku.pingBinder()) {
                Toast.makeText(this, "⚠️ Shizuku Not Running!", Toast.LENGTH_SHORT).show()
                return
            }
            if (Shizuku.checkSelfPermission() != PackageManager.PERMISSION_GRANTED) {
                Shizuku.requestPermission(0)
                return
            }
        } catch (e: Throwable) {
            Toast.makeText(this, "⚠️ Shizuku Error: ${e.message}", Toast.LENGTH_LONG).show()
            return
        }

        startOverlayService()
        finish()
    }

    private fun startOverlayService() {
        var targetDisplayId = Display.DEFAULT_DISPLAY
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                display?.let { targetDisplayId = it.displayId }
            } else {
                @Suppress("DEPRECATION")
                targetDisplayId = windowManager.defaultDisplay.displayId
            }
        } catch (e: Exception) {}

        val intent = Intent(this, OverlayService::class.java).apply {
            action = "OPEN_MENU"
            putExtra("DISPLAY_ID", targetDisplayId)
            putExtra("FORCE_MOVE", true)
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(intent)
        } else {
            startService(intent)
        }
    }
}