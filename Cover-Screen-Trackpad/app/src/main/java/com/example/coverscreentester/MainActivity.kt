package com.example.coverscreentester

import android.accessibilityservice.AccessibilityServiceInfo
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.view.accessibility.AccessibilityManager
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import rikka.shizuku.Shizuku

class MainActivity : AppCompatActivity(), Shizuku.OnRequestPermissionResultListener {

    private lateinit var tvStep1: TextView
    private lateinit var tvStep2: TextView
    private lateinit var tvStep3: TextView
    private lateinit var tvStep4: TextView
    private lateinit var tvStep5: TextView
    private lateinit var tvStepNullKeyboardTitle: TextView

    private lateinit var btnStart: Button
    private lateinit var btnSettings: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        // UI Binding
        tvStep1 = findViewById(R.id.tvStep1Title)
        tvStep2 = findViewById(R.id.tvStep2Title)
        tvStep3 = findViewById(R.id.tvStep3Title)
        tvStep4 = findViewById(R.id.tvStep4Title)
        tvStep5 = findViewById(R.id.tvStep5Title)
        tvStepNullKeyboardTitle = findViewById(R.id.tvStepNullKeyboardTitle)

        val btnStep1 = findViewById<Button>(R.id.btnStep1Trigger)
        val btnStep2 = findViewById<Button>(R.id.btnStep2Unblock)
        val btnStep3 = findViewById<Button>(R.id.btnStep3Enable)
        val btnStep4 = findViewById<Button>(R.id.btnStep4Overlay)
        val btnStep5 = findViewById<Button>(R.id.btnStep5Shizuku)
        val btnStepNullKeyboardEnable = findViewById<Button>(R.id.btnStepNullKeyboardEnable)

        btnStart = findViewById(R.id.btnStartApp)
        btnSettings = findViewById(R.id.btnOpenSettings)

        // Step 1: Trigger (Open Accessibility)
        btnStep1.setOnClickListener {
            startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS))
        }

        // Step 2: Unblock (Open App Info)
        btnStep2.setOnClickListener {
            val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
            intent.data = Uri.parse("package:$packageName")
            startActivity(intent)
        }

        // Step 3: Enable (Open Accessibility)
        btnStep3.setOnClickListener {
            startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS))
        }

        // Step 3.5: Enable Null Keyboard (NEW)
        btnStepNullKeyboardEnable.setOnClickListener {
            val intent = Intent(Settings.ACTION_INPUT_METHOD_SETTINGS)
            startActivity(intent)
        }

        // Step 4: Overlay
        btnStep4.setOnClickListener {
            startActivity(Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:$packageName")))
        }

        // Step 5: Shizuku
        try {
            Shizuku.addRequestPermissionResultListener(this)
        } catch (e: Exception) {}
        
        btnStep5.setOnClickListener {
            try {
                if (Shizuku.getBinder() == null) {
                    Toast.makeText(this, "Shizuku not running!", Toast.LENGTH_SHORT).show()
                } else {
                    Shizuku.requestPermission(0)
                }
            } catch (e: Exception) {
                Toast.makeText(this, "Shizuku Error: ${e.message}", Toast.LENGTH_SHORT).show()
            }
        }

        // LAUNCH BUTTON
        btnStart.setOnClickListener {
            if (checkCriticalPermissions()) {
                launchOverlayService()
            }
        }

        // SETTINGS BUTTON
        btnSettings.setOnClickListener {
            if (checkCriticalPermissions()) {
                val intent = Intent(this, OverlayService::class.java)
                intent.action = "OPEN_MENU"
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                    startForegroundService(intent)
                } else {
                    startService(intent)
                }
                finish()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        
        // --- AUTO LAUNCH LOGIC ---
        // If all permissions are granted, skip the landing page and start the service.
        if (checkCriticalPermissions()) {
            launchOverlayService()
            return
        }
        
        updateStatusUI()
    }

    private fun launchOverlayService() {
        val intent = Intent(this, OverlayService::class.java)
        // Start/Restart Service
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            startForegroundService(intent)
        } else {
            startService(intent)
        }
        finish()
    }

    private fun updateStatusUI() {
        // 1. Accessibility Check (Covers Steps 1, 2, 3)
        val isAccessibilityReady = isAccessibilityEnabled()
        if (isAccessibilityReady) {
            tvStep1.setTextColor(getColor(android.R.color.darker_gray))
            tvStep2.setTextColor(getColor(android.R.color.darker_gray))
            tvStep3.setTextColor(getColor(android.R.color.holo_green_light))
        } else {
            tvStep1.setTextColor(getColor(android.R.color.white))
            tvStep2.setTextColor(getColor(android.R.color.white))
            tvStep3.setTextColor(getColor(android.R.color.holo_red_light))
        }

        // 2. Overlay Check
        val isOverlayReady = Settings.canDrawOverlays(this)
        tvStep4.setTextColor(if (isOverlayReady) getColor(android.R.color.holo_green_light) else getColor(android.R.color.holo_red_light))

        // 3. Shizuku Check
        var isShizukuReady = false
        try {
            if (Shizuku.getBinder() != null && Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED) {
                isShizukuReady = true
            }
        } catch (e: Exception) {}
        tvStep5.setTextColor(if (isShizukuReady) getColor(android.R.color.holo_green_light) else getColor(android.R.color.holo_red_light))

        // 4. Update Start Button
        if (isAccessibilityReady && isOverlayReady && isShizukuReady) {
            btnStart.isEnabled = true
            btnStart.alpha = 1.0f
            btnStart.text = "LAUNCH DROIDOS TRACKPAD"
            btnSettings.isEnabled = true
        } else {
            btnStart.isEnabled = false
            btnStart.alpha = 0.5f
            btnStart.text = "PERMISSIONS REQUIRED"
            btnSettings.isEnabled = false
        }
    }

    private fun checkCriticalPermissions(): Boolean {
        // 1. Overlay
        if (!Settings.canDrawOverlays(this)) {
            Toast.makeText(this, "Missing Overlay Permission", Toast.LENGTH_SHORT).show()
            return false
        }

        // 2. Accessibility
        if (!isAccessibilityEnabled()) {
            Toast.makeText(this, "Missing Accessibility Permission", Toast.LENGTH_SHORT).show()
            return false
        }

        // 3. Shizuku
        try {
            if (Shizuku.getBinder() == null) {
                Toast.makeText(this, "Shizuku not running", Toast.LENGTH_SHORT).show()
                return false
            }
            if (Shizuku.checkSelfPermission() != PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "Shizuku Permission Denied", Toast.LENGTH_SHORT).show()
                return false
            }
        } catch (e: Exception) {
            return false
        }

        return true
    }

    private fun isAccessibilityEnabled(): Boolean {
        val am = getSystemService(Context.ACCESSIBILITY_SERVICE) as AccessibilityManager
        val enabledServices = am.getEnabledAccessibilityServiceList(AccessibilityServiceInfo.FEEDBACK_ALL_MASK)
        for (service in enabledServices) {
            if (service.resolveInfo.serviceInfo.packageName == packageName) {
                return true
            }
        }
        return false
    }

    override fun onRequestPermissionResult(requestCode: Int, grantResult: Int) {
        if (grantResult == PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(this, "Shizuku Granted", Toast.LENGTH_SHORT).show()
            updateStatusUI()
            // If this was the last missing permission, onResume will handle launch, 
            // or we can trigger updateStatusUI to enable the button.
        }
    }
    
    override fun onDestroy() {
        super.onDestroy()
        try {
            Shizuku.removeRequestPermissionResultListener(this)
        } catch (e: Exception) {}
    }
}
