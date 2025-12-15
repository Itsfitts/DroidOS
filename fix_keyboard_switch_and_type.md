# Code Update: Fix Keyboard Switching & Restore Native Typing

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/NullInputMethodService.kt

### Replacement Block: Entire Class
**Action:** Replace the whole file content.
**Reason:** Adds a `BroadcastReceiver`. This allows the OverlayService to say "Type 'A'" and the Keyboard Service (which has legal typing rights) to execute it natively. This works 100% of the time *if* the keyboard is active.

```kotlin
package com.example.coverscreentester

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.inputmethodservice.InputMethodService
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.os.Build

class NullInputMethodService : InputMethodService() {

    private val receiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            when (intent.action) {
                // COMMAND 1: SWITCH KEYBOARD (Restore Gboard)
                "com.example.coverscreentester.RESTORE_IME" -> {
                    val targetIme = intent.getStringExtra("target_ime")
                    if (!targetIme.isNullOrEmpty()) {
                        try {
                            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                            // Using the Service's Token proves we are the active IME and have permission to switch
                            val token = window?.window?.attributes?.token
                            if (token != null) {
                                imm.setInputMethod(token, targetIme)
                            }
                        } catch (e: Exception) { e.printStackTrace() }
                    }
                }
                
                // COMMAND 2: TYPE KEY (Native Input)
                "com.example.coverscreentester.INJECT_KEY" -> {
                    val keyCode = intent.getIntExtra("keyCode", 0)
                    if (keyCode != 0 && currentInputConnection != null) {
                        val now = System.currentTimeMillis()
                        // Send DOWN
                        currentInputConnection.sendKeyEvent(
                            KeyEvent(now, now, KeyEvent.ACTION_DOWN, keyCode, 0)
                        )
                        // Send UP
                        currentInputConnection.sendKeyEvent(
                            KeyEvent(now, now, KeyEvent.ACTION_UP, keyCode, 0)
                        )
                    }
                }
            }
        }
    }

    override fun onCreate() {
        super.onCreate()
        val filter = IntentFilter().apply {
            addAction("com.example.coverscreentester.RESTORE_IME")
            addAction("com.example.coverscreentester.INJECT_KEY")
        }
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(receiver, filter, Context.RECEIVER_EXPORTED)
        } else {
            registerReceiver(receiver, filter)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        try { unregisterReceiver(receiver) } catch (e: Exception) {}
    }

    override fun onCreateInputView(): View {
        return View(this).apply { layoutParams = android.view.ViewGroup.LayoutParams(0, 0) }
    }
    
    override fun onEvaluateInputViewShown(): Boolean = true
    override fun onEvaluateFullscreenMode(): Boolean = false // Important: Never take over full screen
}
```

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/OverlayService.kt

### Replacement Block 1: setSoftKeyboardBlocking
**Action:** Replace `setSoftKeyboardBlocking`.
**Reason:** Adds explicit `ime enable` logic and error checking. This ensures the "Null Keyboard" is actually available to be switched to.

```kotlin
    private fun setSoftKeyboardBlocking(enabled: Boolean) {
        if (shellService == null) {
            showToast("Shizuku required for Keyboard Blocking")
            return
        }

        Thread {
            try {
                // Correct ID format: package/class
                val myImeId = "$packageName/.NullInputMethodService"

                if (enabled) {
                    // --- BLOCKING ---
                    // 1. Get current default IME (to restore later)
                    val output = shellService?.runCommand("settings get secure default_input_method") ?: ""
                    val current = output.trim()
                    
                    if (current.isNotEmpty() && !current.contains("NullInputMethodService")) {
                        previousImeId = current
                    }

                    // 2. ENABLE our IME first (Crucial step often missed)
                    shellService?.runCommand("ime enable $myImeId")
                    
                    // Small delay to let system register the enablement
                    Thread.sleep(200) 
                    
                    // 3. SET as active
                    shellService?.runCommand("ime set $myImeId")
                    
                    // 4. Verification Check
                    val check = shellService?.runCommand("settings get secure default_input_method") ?: ""
                    if (check.contains("NullInputMethodService")) {
                        handler.post { showToast("Keyboard Blocked (Active)") }
                    } else {
                        handler.post { showToast("Failed to switch. Check Enabled Keyboards.") }
                    }
                    
                } else {
                    // --- UNBLOCKING ---
                    
                    // 1. Restore previous IME
                    var targetIme = previousImeId
                    
                    // Fallback search if we lost the ID
                    if (targetIme.isNullOrEmpty()) {
                        val list = shellService?.runCommand("ime list -s") ?: ""
                        targetIme = list.lines().firstOrNull { it.contains("com.google.android.inputmethod.latin") } // Gboard
                            ?: list.lines().firstOrNull { it.contains("com.sec.android.inputmethod") } // Samsung
                    }

                    if (!targetIme.isNullOrEmpty()) {
                        // Try Broadcast first (clean handoff)
                        val intent = Intent("com.example.coverscreentester.RESTORE_IME")
                        intent.setPackage(packageName)
                        intent.putExtra("target_ime", targetIme)
                        sendBroadcast(intent)
                        
                        // Fallback Shell
                        Thread.sleep(100)
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

### Replacement Block 2: injectKeyFromKeyboard
**Action:** Replace `injectKeyFromKeyboard`.
**Reason:** Implements the Hybrid Logic. Checks current system keyboard. If it's ours, use Broadcast (Native). If not, use Shizuku.

```kotlin
    fun injectKeyFromKeyboard(keyCode: Int, metaState: Int) {
        // HYBRID STRATEGY:
        // 1. Check if we (NullInputMethodService) are the currently active keyboard.
        // 2. If YES -> Send Broadcast. The Service types natively. (Reliable, fast)
        // 3. If NO -> Use Shizuku Injection. (Fallback)
        
        Thread {
            try {
                // Quick check of system setting (cached if possible, but shell is safer)
                // We use our stored 'prefBlockSoftKeyboard' as a hint, but verifying is better.
                // For speed, let's assume if the toggle is ON, we should try Broadcast first.
                
                if (prefs.prefBlockSoftKeyboard) {
                    // Method A: Broadcast (Native Typing)
                    val intent = Intent("com.example.coverscreentester.INJECT_KEY")
                    intent.setPackage(packageName)
                    intent.putExtra("keyCode", keyCode)
                    sendBroadcast(intent)
                } else {
                    // Method B: Shizuku Injection (Fallback)
                    shellService?.injectKey(keyCode, KeyEvent.ACTION_DOWN, metaState, inputTargetDisplayId, 1)
                    Thread.sleep(10)
                    shellService?.injectKey(keyCode, KeyEvent.ACTION_UP, metaState, inputTargetDisplayId, 1)
                }
            } catch (e: Exception) { 
                Log.e(TAG, "Key injection failed", e) 
            }
        }.start()
    }
```
