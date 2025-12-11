package com.example.coverscreentester

import android.content.ComponentName
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

    // Listener just to show a toast, DOES NOT START ANYTHING AUTOMATICALLY
    private val binderReceivedListener = Shizuku.OnBinderReceivedListener {
        runOnUiThread {
            Toast.makeText(this, "Shizuku Connected!", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. SETUP UI ONLY. NO CHECKS.
        setupUI()

        // 2. Add Listener safely
        try {
            Shizuku.addBinderReceivedListener(binderReceivedListener)
        } catch (e: Throwable) {
            // Ignore if Shizuku not installed
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        try {
            Shizuku.removeBinderReceivedListener(binderReceivedListener)
        } catch (e: Throwable) {}
    }

    private fun setupUI() {
        // Button 1: App Info
        findViewById<Button>(R.id.btn_fix_restricted).setOnClickListener {
            try {
                val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
                val uri = Uri.fromParts("package", packageName, null)
                intent.data = uri
                startActivity(intent)
            } catch (e: Exception) {
                Toast.makeText(this, "Error opening App Info", Toast.LENGTH_SHORT).show()
            }
        }

        // Button 2: Accessibility
        findViewById<Button>(R.id.btn_open_accessibility).setOnClickListener {
            try {
                startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS))
            } catch (e: Exception) {
                Toast.makeText(this, "Error opening Accessibility", Toast.LENGTH_SHORT).show()
            }
        }

        // NEW: "CHECK & START" BUTTON
        // This is the ONLY place logic runs.
        // We add it dynamically to be sure it appears.
        val btnStart = Button(this).apply {
            text = "3. CHECK PERMISSIONS & START"
            backgroundTintList = getColorStateList(android.R.color.holo_blue_light)
            setTextColor(getColor(android.R.color.black))
            setOnClickListener { manualStartCheck() }
        }
        
        // Find a valid container to add the button
        val rootLayout = findViewById<android.widget.LinearLayout>(R.id.root_layout_container) 
        if (rootLayout != null) {
            rootLayout.addView(btnStart)
        } else {
            // Fallback: Add to the first child of content (usually the ScrollView's LinearLayout)
            (findViewById<android.view.ViewGroup>(android.R.id.content).getChildAt(0) as? android.view.ViewGroup)?.addView(btnStart)
        }
    }

    private fun manualStartCheck() {
        // 1. Check Overlay Permission
        if (!Settings.canDrawOverlays(this)) {
            Toast.makeText(this, "⚠️ Grant 'Display Over Apps' Permission", Toast.LENGTH_LONG).show()
            try {
                val intent = Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:$packageName"))
                startActivity(intent)
            } catch(e: Exception) {}
            return
        }

        // 2. Check Shizuku (TRY-CATCH IS MANDATORY)
        try {
            if (!Shizuku.pingBinder()) {
                Toast.makeText(this, "⚠️ Shizuku Not Running!", Toast.LENGTH_SHORT).show()
            } else if (Shizuku.checkSelfPermission() != PackageManager.PERMISSION_GRANTED) {
                Shizuku.requestPermission(0)
                return
            }
        } catch (e: Throwable) {
            Toast.makeText(this, "⚠️ Shizuku Error: ${e.message}", Toast.LENGTH_LONG).show()
        }

        // 3. Start Service
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

