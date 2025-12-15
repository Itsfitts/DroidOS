# Code Update: Clean IME Handoff (Internal Switch)

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/NullInputMethodService.kt

### Update Class Body
**Action:** Replace the entire class content.
**Reason:** Adds a BroadcastReceiver to listen for the "Switch" command and execute it using internal permissions (`setInputMethod`). This prevents the system "zombie keyboard" state.

```kotlin
package com.example.coverscreentester

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.inputmethodservice.InputMethodService
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.os.Build

class NullInputMethodService : InputMethodService() {

    // Receiver to handle "Restore" requests from the OverlayService
    private val receiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            if (intent.action == "com.example.coverscreentester.RESTORE_IME") {
                val targetIme = intent.getStringExtra("target_ime")
                if (!targetIme.isNullOrEmpty()) {
                    try {
                        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                        // Using the Service's Token proves we are the active IME and have permission to switch
                        val token = window?.window?.attributes?.token
                        if (token != null) {
                            imm.setInputMethod(token, targetIme)
                        }
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            }
        }
    }

    override fun onCreate() {
        super.onCreate()
        val filter = IntentFilter("com.example.coverscreentester.RESTORE_IME")
        // Register receiver with appropriate flags for newer Android versions
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(receiver, filter, Context.RECEIVER_NOT_EXPORTED)
        } else {
            registerReceiver(receiver, filter)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        try {
            unregisterReceiver(receiver)
        } catch (e: Exception) {}
    }

    override fun onCreateInputView(): View {
        // Return a view with 0 height to make the keyboard invisible
        val view = View(this)
        view.layoutParams = android.view.ViewGroup.LayoutParams(0, 0)
        return view
    }
    
    override fun onEvaluateInputViewShown(): Boolean {
        // Tell system we don't want to show a standard UI
        return true
    }
}
```

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/OverlayService.kt

### Replacement Block: setSoftKeyboardBlocking
**Action:** Replace the `setSoftKeyboardBlocking` function.
**Reason:** Removes `pm disable`. Uses the new Broadcast mechanism to request a clean switch, followed by Shell commands as a backup.

```kotlin
    private fun setSoftKeyboardBlocking(enabled: Boolean) {
        if (shellService == null) {
            showToast("Shizuku required for Keyboard Blocking")
            return
        }

        Thread {
            try {
                val myPackage = packageName
                val nullImeComponent = "$myPackage/.NullInputMethodService"

                if (enabled) {
                    // --- BLOCKING (Enable & Switch) ---
                    
                    // 1. Save current IME
                    val output = shellService?.runCommand("settings get secure default_input_method") ?: ""
                    val current = output.trim()
                    if (current.isNotEmpty() && !current.contains("NullInputMethodService")) {
                        previousImeId = current
                    }

                    // 2. Ensure Enabled
                    shellService?.runCommand("pm enable $nullImeComponent")
                    shellService?.runCommand("ime enable $nullImeComponent")
                    
                    // 3. Switch via Shell
                    shellService?.runCommand("ime set $nullImeComponent")
                    
                    // 4. Force setting to 0 (Hide Soft KB)
                    shellService?.runCommand("settings put secure show_ime_with_hard_keyboard 0")
                    
                    handler.post { showToast("Keyboard Blocked") }
                    
                } else {
                    // --- UNBLOCKING (Clean Handoff) ---
                    
                    // 1. Force System to Show Soft Keyboard
                    shellService?.runCommand("settings put secure show_ime_with_hard_keyboard 1")

                    // 2. Find Target IME
                    var targetIme = previousImeId
                    if (targetIme.isNullOrEmpty()) {
                        val list = shellService?.runCommand("ime list -s -a") ?: ""
                        targetIme = list.lines().firstOrNull { it.contains("com.google.android.inputmethod.latin") } // Gboard
                            ?: list.lines().firstOrNull { it.contains("com.sec.android.inputmethod") } // Samsung
                            ?: list.lines().firstOrNull { it.contains("honeyboard") } // Samsung Newer
                    }

                    if (!targetIme.isNullOrEmpty()) {
                        // 3. Request Internal Handoff (The Clean Way)
                        // If NullKeyboard is running, this tells it to switch smoothly
                        val intent = Intent("com.example.coverscreentester.RESTORE_IME")
                        intent.putExtra("target_ime", targetIme)
                        intent.setPackage(packageName)
                        sendBroadcast(intent)
                        
                        // 4. Shell Backup (Just in case NullKeyboard wasn't running)
                        Thread.sleep(100)
                        shellService?.runCommand("ime enable $targetIme")
                        shellService?.runCommand("ime set $targetIme")
                        
                        handler.post { showToast("Restored: $targetIme") }
                    } else {
                        shellService?.runCommand("ime reset")
                        handler.post { showToast("Keyboard Reset") }
                    }
                }
            } catch (e: Exception) {
                handler.post { showToast("Toggle Failed: ${e.message}") }
            }
        }.start()
    }
```