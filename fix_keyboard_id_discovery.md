# Code Update: Dynamic IME ID Discovery

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/OverlayService.kt

### Replacement Block: setSoftKeyboardBlocking
**Action:** Replace the `setSoftKeyboardBlocking` function.
**Reason:** Uses `ime list -a -s` to find the exact ID assigned by Android to the Null Keyboard. This prevents "Invalid ID" errors that cause silent failures during switching.

```kotlin
    private fun setSoftKeyboardBlocking(enabled: Boolean) {
        if (shellService == null) {
            showToast("Shizuku required for Keyboard Blocking")
            return
        }

        Thread {
            try {
                if (enabled) {
                    // --- BLOCKING (Switch to Null) ---
                    
                    // 1. FIND THE REAL ID
                    // We query the system for all installed IMEs and find ours.
                    // This is safer than constructing the string manually.
                    val listOutput = shellService?.runCommand("ime list -a -s") ?: ""
                    val myImeId = listOutput.lines().firstOrNull { 
                        it.contains(packageName) && it.contains("NullInputMethodService") 
                    }?.trim()

                    if (myImeId.isNullOrEmpty()) {
                        handler.post { showToast("Error: Null Keyboard not installed/found.") }
                        return@Thread
                    }

                    // 2. Save current Default (to restore later)
                    val current = shellService?.runCommand("settings get secure default_input_method")?.trim() ?: ""
                    if (current.isNotEmpty() && current != myImeId) {
                        previousImeId = current
                    }

                    // 3. Enable and Set
                    shellService?.runCommand("ime enable $myImeId")
                    shellService?.runCommand("ime set $myImeId")
                    
                    // 4. Force Settings Sync (Optional but helps on Samsung)
                    // We explicitly tell the system to hide the soft keyboard layer
                    shellService?.runCommand("settings put secure show_ime_with_hard_keyboard 0")

                    // 5. Verify Success
                    Thread.sleep(300)
                    val newDefault = shellService?.runCommand("settings get secure default_input_method")?.trim()
                    if (newDefault == myImeId) {
                        handler.post { showToast("Blocked: Null Keyboard Active") }
                    } else {
                        handler.post { showToast("Switch Failed. Please enable 'DroidOS Null Keyboard' in Settings manually once.") }
                    }
                    
                } else {
                    // --- UNBLOCKING (Restore Previous) ---
                    
                    shellService?.runCommand("settings put secure show_ime_with_hard_keyboard 1")
                    
                    var targetIme = previousImeId
                    if (targetIme.isNullOrEmpty()) {
                        // Fallback: Find Gboard or Samsung Keyboard
                        val list = shellService?.runCommand("ime list -s") ?: ""
                        targetIme = list.lines().firstOrNull { it.contains("com.google.android.inputmethod.latin") } 
                            ?: list.lines().firstOrNull { it.contains("com.sec.android.inputmethod") }
                            ?: list.lines().firstOrNull { it.contains("honeyboard") }
                    }

                    if (!targetIme.isNullOrEmpty()) {
                        // We use Broadcast if we are currently the active keyboard (clean handoff)
                        // But since we are unblocking, we might as well blast the shell command too.
                        val intent = Intent("com.example.coverscreentester.RESTORE_IME")
                        intent.setPackage(packageName)
                        intent.putExtra("target_ime", targetIme)
                        sendBroadcast(intent)
                        
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
                handler.post { showToast("Error: ${e.message}") }
            }
        }.start()
    }
```
