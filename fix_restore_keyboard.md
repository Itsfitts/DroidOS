# Code Update: Fix Keyboard Restoration (Force Show)

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/OverlayService.kt

### Replacement Block: setSoftKeyboardBlocking
**Action:** Replace the `setSoftKeyboardBlocking` function.
**Reason:** Forces `show_ime_with_hard_keyboard` to `1` when disabling logic. Also adds a smarter fallback search to find Gboard or Samsung Keyboard if the saved ID is lost.

```kotlin
    private fun setSoftKeyboardBlocking(enabled: Boolean) {
        if (shellService == null) {
            showToast("Shizuku required for Keyboard Blocking")
            return
        }

        Thread {
            try {
                if (enabled) {
                    // --- BLOCKING LOGIC ---
                    
                    // 1. Save current IME (if it's not us/null)
                    val output = shellService?.runCommand("settings get secure default_input_method") ?: ""
                    val current = output.trim()
                    
                    // Don't save if we are already the null keyboard (prevents overwriting the backup)
                    if (current.isNotEmpty() && !current.contains("NullInputMethodService")) {
                        previousImeId = current
                    }

                    // 2. Enable & Set Null Keyboard
                    val myImeId = "$packageName/.NullInputMethodService"
                    shellService?.runCommand("ime enable $myImeId")
                    shellService?.runCommand("ime set $myImeId")
                    
                    // 3. Optional: Ensure hard keyboard setting doesn't fight us
                    // (Actually, keeping it 0 is safer while blocked)
                    shellService?.runCommand("settings put secure show_ime_with_hard_keyboard 0")
                    
                    handler.post { showToast("Keyboard Blocked (Null IME)") }
                    
                } else {
                    // --- RESTORE LOGIC ---
                    
                    // 1. CRITICAL: Force System to Show Soft Keyboard
                    // This fixes the issue where Gboard is selected but stays hidden
                    shellService?.runCommand("settings put secure show_ime_with_hard_keyboard 1")
                    
                    // 2. Determine target IME
                    var targetIme = previousImeId
                    
                    // Fallback: If we lost the ID, try to find Gboard or Samsung
                    if (targetIme.isNullOrEmpty()) {
                        val list = shellService?.runCommand("ime list -s") ?: ""
                        targetIme = list.lines().firstOrNull { it.contains("com.google.android.inputmethod.latin") } // Gboard
                            ?: list.lines().firstOrNull { it.contains("com.sec.android.inputmethod") } // Samsung
                            ?: list.lines().firstOrNull { it.contains("com.samsung.android.honeyboard") } // Samsung Newer
                    }

                    // 3. Apply Restore
                    if (!targetIme.isNullOrEmpty()) {
                        shellService?.runCommand("ime set $targetIme")
                        handler.post { showToast("Restored: $targetIme") }
                    } else {
                        // Last Resort: Reset prompts the picker
                        shellService?.runCommand("ime reset")
                        handler.post { showToast("Keyboard Reset (Check Settings)") }
                    }
                }
            } catch (e: Exception) {
                handler.post { showToast("Keyboard Toggle Failed: ${e.message}") }
            }
        }.start()
    }
```
