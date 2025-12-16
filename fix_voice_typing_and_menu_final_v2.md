# Code Update: Fix Voice Typing and Menu Refactoring

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/MainActivity.kt

### `MainActivity`
**Action:** Replace the entire class.
**Reason:** To fix a crash on startup by safely checking for Shizuku's readiness and using a listener for asynchronous connection.

```kotlin
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
```

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/OverlayService.kt

### `triggerAggressiveBlocking` & `onAccessibilityEvent`
**Action:** Replace both functions.
**Reason:** Proactively manage the system's "Hardware Keyboard" behavior when Voice Typing is detected.

```kotlin
    private var isVoiceActive = false

    // =========================
    // BLOCKING TRIGGER (Global)
    // =========================
    private fun triggerAggressiveBlocking() {
        if (!prefs.prefBlockSoftKeyboard || shellService == null) return
        
        Thread {
            try {
                // 1. VOICE DETECTED? ABORT BLOCKING
                // If we know voice is active, force the system to ALLOW soft keyboards (so voice UI shows)
                if (isVoiceActive) {
                    shellService?.runCommand("settings put secure show_ime_with_hard_keyboard 1")
                    return@Thread
                }

                // 2. STANDARD BLOCKING LOGIC
                shellService?.runCommand("settings put secure show_ime_with_hard_keyboard 0")
                shellService?.injectDummyHardwareKey(0) 
                if (currentDisplayId != 0) shellService?.injectDummyHardwareKey(currentDisplayId)
                
                // Extra ID 1 Pulse for safety
                shellService?.injectKey(KeyEvent.KEYCODE_UNKNOWN, KeyEvent.ACTION_DOWN, 0, 0, 1)
                shellService?.injectKey(KeyEvent.KEYCODE_UNKNOWN, KeyEvent.ACTION_UP, 0, 0, 1)
                
            } catch(e: Exception){}
        }.start()
    }

    // =========================
    // ACCESSIBILITY EVENT (DEBUG FOCUS WATCHDOG)
    // =========================
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        if (event == null) return
        
        // EXCEPTION: Google Voice Typing Detection
        val pkg = event.packageName?.toString() ?: ""
        
        // Check for Google App (Voice) or Gboard (Voice Subtype)
        if (pkg.contains("google.android.googlequicksearchbox") || 
            pkg.contains("com.google.android.voicesearch") ||
            pkg.contains("com.google.android.tts")) {
            
            isVoiceActive = true
            
            // Immediately force settings to allow Voice UI
            if (prefs.prefBlockSoftKeyboard && shellService != null) {
                Thread { 
                    shellService?.runCommand("settings put secure show_ime_with_hard_keyboard 1") 
                }.start()
            }
            return
        } else if (event.eventType == AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED) {
            // If we switched to a standard app window, disable voice flag
            isVoiceActive = false
        }
        
        // Catch Focus, Window State, and Window Content changes
        if (event.eventType == AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED || 
            event.eventType == AccessibilityEvent.TYPE_VIEW_FOCUSED ||
            event.eventType == AccessibilityEvent.TYPE_WINDOWS_CHANGED) {
            
            if (prefs.prefBlockSoftKeyboard && !isVoiceActive) {
                triggerAggressiveBlocking()
                
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        if (softKeyboardController.showMode != AccessibilityService.SHOW_MODE_HIDDEN) {
                            softKeyboardController.showMode = AccessibilityService.SHOW_MODE_HIDDEN
                        }
                    } catch(e: Exception){}
                }
            }
        }
    }
```

### `switchReceiver` & `onCreate`
**Action:** Update to handle `VOICE_TYPE_TRIGGERED`.
**Reason:** To manually flag that voice is starting, ensuring the system catches the start event immediately.

```kotlin
    private val switchReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            when (intent?.action) {
                "SWITCH_DISPLAY" -> switchDisplay() 
                "CYCLE_INPUT_TARGET" -> cycleInputTarget()
                "RESET_CURSOR" -> resetCursorCenter()
                "TOGGLE_DEBUG" -> toggleDebugMode()
                "FORCE_KEYBOARD" -> toggleCustomKeyboard()
                "TOGGLE_CUSTOM_KEYBOARD" -> toggleCustomKeyboard()
                "OPEN_MENU" -> { menuManager?.show(); enforceZOrder() }
                "SET_TRACKPAD_VISIBILITY" -> {
                    val visible = intent.getBooleanExtra("VISIBLE", true)
                    val menuDisplayId = intent.getIntExtra("MENU_DISPLAY_ID", -1)
                    if (visible) setTrackpadVisibility(true) 
                    else { if (menuDisplayId == -1 || menuDisplayId == currentDisplayId) setTrackpadVisibility(false) }
                }
                "SET_PREVIEW_MODE" -> setPreviewMode(intent.getBooleanExtra("PREVIEW_MODE", false))
                
                // NEW: Manual Trigger from Keyboard Button
                "VOICE_TYPE_TRIGGERED" -> {
                    isVoiceActive = true
                    triggerAggressiveBlocking() // Run logic to UNBLOCK
                }
                
                Intent.ACTION_SCREEN_ON -> triggerAggressiveBlocking()
            }
        }
    }

    override fun onCreate() {
        super.onCreate()
        try { displayManager = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager; displayManager?.registerDisplayListener(this, handler) } catch (e: Exception) {}
        loadPrefs()
        val filter = IntentFilter().apply { 
            addAction("CYCLE_INPUT_TARGET")
            addAction("RESET_CURSOR")
            addAction("TOGGLE_DEBUG")
            addAction("FORCE_KEYBOARD")
            addAction("TOGGLE_CUSTOM_KEYBOARD")
            addAction("SET_TRACKPAD_VISIBILITY")
            addAction("SET_PREVIEW_MODE") 
            addAction("OPEN_MENU")
            addAction("VOICE_TYPE_TRIGGERED")
            addAction(Intent.ACTION_SCREEN_ON)
        }
        ContextCompat.registerReceiver(this, switchReceiver, filter, ContextCompat.RECEIVER_NOT_EXPORTED)
        
        if (Build.VERSION.SDK_INT >= 24) {
            try { softKeyboardController.showMode = AccessibilityService.SHOW_MODE_AUTO } catch(e: Exception){}
        }
    }
```

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/KeyboardOverlay.kt

### `triggerVoiceTyping`
**Action:** Replace the `triggerVoiceTyping` function.
**Reason:** To broadcast `VOICE_TYPE_TRIGGERED` to the service immediately before switching the IME.

```kotlin
    private fun triggerVoiceTyping() {
        if (shellService == null) return
        
        // 1. Notify Service to stop blocking IMMEDIATELY
        val intent = android.content.Intent("VOICE_TYPE_TRIGGERED")
        intent.setPackage(context.packageName)
        context.sendBroadcast(intent)
        
        // 2. Perform Switch
        Thread {
            try {
                // Fetch IME list and find Google Voice
                val output = shellService.runCommand("ime list -a -s")
                val voiceIme = output.lines().find { it.contains("google", true) && it.contains("voice", true) }
                    ?: output.lines().find { it.contains("voice", true) }
                
                if (voiceIme != null) {
                    shellService.runCommand("ime set $voiceIme")
                } else {
                    Log.w(TAG, "Voice IME not found")
                }
            } catch (e: Exception) { Log.e(TAG, "Voice Switch Failed", e) }
        }.start()
    }
```