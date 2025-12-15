# Code Update: Use PM Disable to Force Keyboard Release

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/OverlayService.kt

### Replacement Block: setSoftKeyboardBlocking
**Action:** Replace the `setSoftKeyboardBlocking` function.
**Reason:** Uses `pm disable` to forcibly invalidate the Null Keyboard component. This mimics the "kill app" effect, forcing Android to immediately fall back to the next valid keyboard (Gboard).

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

                    // 2. ENABLE the component (in case it was disabled)
                    shellService?.runCommand("pm enable $nullImeComponent")
                    
                    // 3. Enable & Set as active IME
                    shellService?.runCommand("ime enable $nullImeComponent")
                    shellService?.runCommand("ime set $nullImeComponent")
                    
                    // 4. Force setting to 0 (Hide Soft KB)
                    shellService?.runCommand("settings put secure show_ime_with_hard_keyboard 0")
                    
                    handler.post { showToast("Keyboard Blocked") }
                    
                } else {
                    // --- UNBLOCKING (Disable & Fallback) ---
                    
                    // 1. DISABLE the component
                    // This is the "Nuclear Option": It makes the system think the keyboard app "died"
                    // forcing an immediate fallback to the next valid keyboard (Gboard).
                    shellService?.runCommand("pm disable $nullImeComponent")
                    
                    // 2. Force System to Show Soft Keyboard (Critical)
                    shellService?.runCommand("settings put secure show_ime_with_hard_keyboard 1")

                    // 3. Optional: Explicitly restore previous IME (just to be safe)
                    if (!previousImeId.isNullOrEmpty()) {
                        shellService?.runCommand("ime set $previousImeId")
                    } else {
                        shellService?.runCommand("ime reset")
                    }
                    
                    handler.post { showToast("Keyboard Restored") }
                }
            } catch (e: Exception) {
                handler.post { showToast("Toggle Failed: ${e.message}") }
            }
        }.start()
    }
```
