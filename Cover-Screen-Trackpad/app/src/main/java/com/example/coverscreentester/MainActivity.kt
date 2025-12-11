package com.example.coverscreentester

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.view.Display
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import rikka.shizuku.Shizuku

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 1. Check Permissions First
        val isShizukuReady = Shizuku.pingBinder() && 
                             Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED
        val isAccessibilityReady = isAccessibilityEnabled()

        // 2. Decide: Auto-Start or Show UI?
        // If everything is ready, just launch the service and exit (Headless Mode)
        if (isShizukuReady && isAccessibilityReady) {
            startOverlayService()
            finish()
            return
        }

        // 3. Setup Mode: Show UI
        setContentView(R.layout.activity_main)
        setupUI()
    }

    private fun setupUI() {
        // Status Text
        val statusText = findViewById<TextView>(R.id.text_status)
        updateStatusText(statusText)

        // Fix Permissions Button (New)
        findViewById<Button>(R.id.btn_app_info).setOnClickListener {
            try {
                val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
                val uri = Uri.fromParts("package", packageName, null)
                intent.data = uri
                startActivity(intent)
                Toast.makeText(this, "Go to: 3 Dots (Top Right) > Allow Restricted Settings", Toast.LENGTH_LONG).show()
            } catch (e: Exception) {
                Toast.makeText(this, "Error opening App Info", Toast.LENGTH_SHORT).show()
            }
        }

        // Shizuku Request
        if (Shizuku.checkSelfPermission() != PackageManager.PERMISSION_GRANTED) {
            Shizuku.requestPermission(0)
        }

        // Toggle/Enable Button
        findViewById<Button>(R.id.btn_toggle).setOnClickListener {
            if (!isAccessibilityEnabled()) {
                Toast.makeText(this, "Please Enable Accessibility Service", Toast.LENGTH_LONG).show()
                startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS))
            } else {
                startOverlayService()
                Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
        
        // Wire up other buttons to prevent crashes if clicked in Setup Mode
        findViewById<Button>(R.id.btn_close).setOnClickListener { finish() }
        findViewById<Button>(R.id.btn_help).setOnClickListener { 
            Toast.makeText(this, "Please enable permissions first.", Toast.LENGTH_SHORT).show() 
        }
        // Disable complex buttons in setup mode
        findViewById<Button>(R.id.btn_profiles).isEnabled = false
        findViewById<Button>(R.id.btn_settings).isEnabled = false
    }

    private fun updateStatusText(textView: TextView) {
        if (!isAccessibilityEnabled()) {
            textView.text = "Status: Accessibility Service Disabled"
            textView.setTextColor(0xFFFF0000.toInt()) // Red
        } else if (Shizuku.checkSelfPermission() != PackageManager.PERMISSION_GRANTED) {
            textView.text = "Status: Shizuku Permission Missing"
            textView.setTextColor(0xFFFFFF00.toInt()) // Yellow
        } else {
            textView.text = "Status: Ready"
            textView.setTextColor(0xFF00FF00.toInt()) // Green
        }
    }

    private fun isAccessibilityEnabled(): Boolean {
        val expectedComponentName = ComponentName(this, OverlayService::class.java)
        val enabledServicesSetting = Settings.Secure.getString(
            contentResolver,
            Settings.Secure.ENABLED_ACCESSIBILITY_SERVICES
        ) ?: return false
        
        val colonSplitter = android.text.TextUtils.SimpleStringSplitter(':')
        colonSplitter.setString(enabledServicesSetting)
        
        while (colonSplitter.hasNext()) {
            val componentNameString = colonSplitter.next()
            val enabledComponent = ComponentName.unflattenFromString(componentNameString)
            if (enabledComponent != null && enabledComponent == expectedComponentName) {
                return true
            }
        }
        return false
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
        } catch (e: Exception) { e.printStackTrace() }

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