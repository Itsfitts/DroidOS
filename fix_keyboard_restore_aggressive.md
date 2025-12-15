# Code Update: Aggressive Keyboard Restoration

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/OverlayService.kt

### Replacement Block: setSoftKeyboardBlocking
**Action:** Replace the `setSoftKeyboardBlocking` function.
**Reason:** Adds a "Disable" step for the Null Keyboard and runs the `settings put` command twice to ensure the system respects the "Show Keyboard" flag.

```kotlin
    private fun setSoftKeyboardBlocking(enabled: Boolean) {
        if (shellService == null) {
            showToast("Shizuku required for Keyboard Blocking")
            return
        }

        Thread {
            try {
                val nullImeId = "$packageName/.NullInputMethodService"

                if (enabled) {
                    // --- BLOCKING ---
                    // 1. Save current IME
                    val output = shellService?.runCommand("settings get secure default_input_method") ?: ""
                    val current = output.trim()
                    if (current.isNotEmpty() && !current.contains("NullInputMethodService")) {
                        previousImeId = current
                    }

                    // 2. Enable & Set Null Keyboard
                    shellService?.runCommand("ime enable $nullImeId")
                    shellService?.runCommand("ime set $nullImeId")
                    
                    // 3. Hide Soft Keyboard Overlay (Optional but cleaner)
                    shellService?.runCommand("settings put secure show_ime_with_hard_keyboard 0")
                    
                    handler.post { showToast("Keyboard Blocked") }
                    
                } else {
                    // --- UNBLOCKING ---
                    
                    // 1. FORCE SHOW SETTING (First Attempt)
                    shellService?.runCommand("settings put secure show_ime_with_hard_keyboard 1")
                    
                    // 2. Find Target IME
                    var targetIme = previousImeId
                    if (targetIme.isNullOrEmpty()) {
                        val list = shellService?.runCommand("ime list -s -a") ?: ""
                        targetIme = list.lines().firstOrNull { it.contains("com.google.android.inputmethod.latin") } // Gboard
                            ?: list.lines().firstOrNull { it.contains("com.sec.android.inputmethod") } // Samsung
                            ?: list.lines().firstOrNull { it.contains("honeyboard") } // Samsung Newer
                    }

                    // 3. Restore Target
                    if (!targetIme.isNullOrEmpty()) {
                        shellService?.runCommand("ime enable $targetIme") // Ensure enabled
                        shellService?.runCommand("ime set $targetIme")
                        handler.post { showToast("Restored: $targetIme") }
                    } else {
                        shellService?.runCommand("ime reset")
                        handler.post { showToast("Keyboard Reset") }
                    }

                    // 4. DISABLE Null Keyboard (Forces OS to drop it)
                    shellService?.runCommand("ime disable $nullImeId")

                    // 5. FORCE SHOW SETTING (Second Attempt - Critical)
                    // We run this again because switching IMEs can sometimes reset this flag on Samsung devices.
                    Thread.sleep(200)
                    shellService?.runCommand("settings put secure show_ime_with_hard_keyboard 1")
                }
            } catch (e: Exception) {
                handler.post { showToast("Toggle Failed: ${e.message}") }
            }
        }.start()
    }
```
