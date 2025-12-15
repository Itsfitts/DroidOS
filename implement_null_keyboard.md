# Code Update: Implement Null Keyboard for Reliable Blocking

## File: Cover-Screen-Trackpad/app/src/main/res/xml/method.xml

**Action:** Create file.
**Reason:** Required configuration file for any Android Input Method Service.

```xml
<?xml version="1.0" encoding="utf-8"?>
<input-method xmlns:android="[http://schemas.android.com/apk/res/android](http://schemas.android.com/apk/res/android)" />
```

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/NullInputMethodService.kt
**Action:** Create file.
**Reason:** A minimal keyboard service that renders nothing, effectively hiding the UI while keeping the input connection alive.
```kotlin
package com.example.coverscreentester

import android.inputmethodservice.InputMethodService
import android.view.View

class NullInputMethodService : InputMethodService() {
    override fun onCreateInputView(): View {
        // Return a view with 0 height to make the keyboard invisible
        val view = View(this)
        view.layoutParams = android.view.ViewGroup.LayoutParams(0, 0)
        return view
    }
    
    override fun onEvaluateInputViewShown(): Boolean {
        // Tell system we don't want to show a standard UI
        // We handle visibility ourselves (by being 0 height)
        return true
    }
}
```

## File: Cover-Screen-Trackpad/app/src/main/AndroidManifest.xml
### Add Service Declaration
**Action:** Add the service block inside the `<application>` tag (e.g., after OverlayService).
**Reason:** Registers the keyboard with the system.
```xml
        <service
            android:name=".NullInputMethodService"
            android:label="DroidOS Null Keyboard"
            android:permission="android.permission.BIND_INPUT_METHOD"
            android:exported="true">
            <intent-filter>
                <action android:name="android.view.InputMethod" />
            </intent-filter>
            <meta-data
                android:name="android.view.im"
                android:resource="@xml/method" />
        </service>
```

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/OverlayService.kt
### 1. Add Previous IME Variable
**Action:** Add this variable to the class properties.
```kotlin
    private var previousImeId: String? = null
```

### 2. Update setSoftKeyboardBlocking
**Action:** Replace the `setSoftKeyboardBlocking` function.
**Reason:** Uses Shizuku to force-switch the active keyboard to our Null IME, guaranteeing the soft keyboard stays hidden.
```kotlin
    private fun setSoftKeyboardBlocking(enabled: Boolean) {
        if (shellService == null) {
            showToast("Shizuku required for Keyboard Blocking")
            return
        }

        Thread {
            try {
                if (enabled) {
                    // 1. Get current default IME so we can restore it later
                    val output = shellService?.runCommand("settings get secure default_input_method") ?: ""
                    val current = output.trim()
                    
                    // Don't save if we are already the null keyboard (prevents overwriting the backup)
                    if (current.isNotEmpty() && !current.contains("NullInputMethodService")) {
                        previousImeId = current
                    }

                    // 2. Enable our IME (Required before setting)
                    val myImeId = "$packageName/.NullInputMethodService"
                    shellService?.runCommand("ime enable $myImeId")
                    
                    // 3. Set as Active
                    shellService?.runCommand("ime set $myImeId")
                    
                    handler.post { showToast("Keyboard Blocked (Null IME)") }
                } else {
                    // Restore previous
                    if (previousImeId != null && previousImeId!!.isNotEmpty()) {
                        shellService?.runCommand("ime set $previousImeId")
                        handler.post { showToast("Keyboard Restored") }
                    } else {
                        // Fallback: Let system pick default
                        shellService?.runCommand("ime reset")
                        handler.post { showToast("Keyboard Reset") }
                    }
                }
            } catch (e: Exception) {
                handler.post { showToast("Keyboard Toggle Failed: ${e.message}") }
            }
        }.start()
    }
```

### 3. Disable Old Heartbeat
**Action:** Replace `blockingHeartbeat` with an empty runnable.
**Reason:** We no longer need to constantly enforce settings since the IME switch is persistent.
```kotlin
    private val blockingHeartbeat = object : Runnable {
        override fun run() {
            // No-op: Null Keyboard handles blocking natively
        }
    }
```
