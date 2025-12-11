# Code Update: Google Play Compliant Permissions Page

## File: Cover-Screen-Trackpad/app/src/main/res/layout/activity_main.xml

### Description
Replaces the complex dashboard with a simple, policy-compliant disclosure page. It explains the use of Accessibility Services and provides the necessary navigation buttons.

### Code
Replace the **entire file content** with:

```xml
<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#121212"
    android:fillViewport="true">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:gravity="center"
        android:padding="32dp">

        <ImageView
            android:layout_width="80dp"
            android:layout_height="80dp"
            android:src=" @mipmap/ic_trackpad_adaptive"
            android:layout_marginBottom="24dp"
            android:contentDescription="App Icon" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Accessibility Permission Required"
            android:textSize="22sp"
            android:textStyle="bold"
            android:textColor="#FFFFFF"
            android:gravity="center"
            android:layout_marginBottom="24dp"/>

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="This app uses the AccessibilityService API to provide a mouse trackpad and cursor on your screen.\n\nIt intercepts touch gestures on the overlay to inject mouse clicks and movement into the system.\n\nNo personal data is collected, stored, or transmitted via this service."
            android:textColor="#DDDDDD"
            android:textSize="16sp"
            android:lineSpacingMultiplier="1.2"
            android:gravity="start"
            android:background="#1E1E1E"
            android:padding="16dp"
            android:layout_marginBottom="32dp"/>

        <Button
            android:id=" @+id/btn_fix_restricted"
            android:layout_width="match_parent"
            android:layout_height="56dp"
            android:text="1. Allow Restricted Settings"
            android:backgroundTint="#FF5722"
            android:textColor="#FFFFFF"
            android:textStyle="bold"
            android:layout_marginBottom="16dp"
            android:elevation="4dp"/>

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="If the app was sideloaded, you must first allow restricted settings in the App Info menu (3-dots > Allow Restricted Settings)."
            android:textColor="#888888"
            android:textSize="12sp"
            android:gravity="center"
            android:layout_marginBottom="24dp"/>

        <Button
            android:id=" @+id/btn_open_accessibility"
            android:layout_width="match_parent"
            android:layout_height="56dp"
            android:text="2. Enable Accessibility Service"
            android:backgroundTint="#3DDC84"
            android:textColor="#000000"
            android:textStyle="bold"
            android:elevation="4dp"/>

    </LinearLayout>
</ScrollView>

File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/MainActivity.kt
Description
Updates the activity to handle only the two permission-related buttons. It retains the auto-start ("Headless") logic but simplifies the UI initialization to match the new layout.
Code
Replace the entire file content with:
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 1. Check Permissions
        val isShizukuReady = safeCheckShizuku()
        val isAccessibilityReady = isAccessibilityEnabled()

        // 2. Headless Mode: If ready, start service and close
        if (isShizukuReady && isAccessibilityReady) {
            startOverlayService()
            finish()
            return
        }

        // 3. Setup Mode: Show Disclosure UI
        setContentView(R.layout.activity_main)
        setupUI()
        
        // Auto-request Shizuku if missing
        if (!isShizukuReady) {
            requestShizukuSafely()
        }
    }

    private fun setupUI() {
        // Button 1: Fix Restricted Settings (App Info)
        findViewById<Button>(R.id.btn_fix_restricted).setOnClickListener {
            try {
                val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
                val uri = Uri.fromParts("package", packageName, null)
                intent.data = uri
                startActivity(intent)
                Toast.makeText(this, "Tap 3 dots (top-right) -> Allow Restricted Settings", Toast.LENGTH_LONG).show()
            } catch (e: Exception) {
                Toast.makeText(this, "Could not open App Info", Toast.LENGTH_SHORT).show()
            }
        }

        // Button 2: Enable Accessibility
        findViewById<Button>(R.id.btn_open_accessibility).setOnClickListener {
            try {
                startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS))
                Toast.makeText(this, "Find 'DroidOS Trackpad' and enable it.", Toast.LENGTH_LONG).show()
            } catch (e: Exception) {
                Toast.makeText(this, "Could not open Settings", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun safeCheckShizuku(): Boolean {
        return try {
            if (!Shizuku.pingBinder()) return false
            Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED
        } catch (e: Throwable) {
            false
        }
    }

    private fun requestShizukuSafely() {
        try {
            if (Shizuku.pingBinder() && Shizuku.checkSelfPermission() != PackageManager.PERMISSION_GRANTED) {
                Shizuku.requestPermission(0)
            }
        } catch (e: Throwable) {
            // Ignore
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
