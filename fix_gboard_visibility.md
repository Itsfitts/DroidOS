# Code Update: Force Gboard Visibility on Restore

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/OverlayService.kt

### Replacement Block: setSoftKeyboardBlocking
**Action:** Replace the `setSoftKeyboardBlocking` function.
**Reason:** Moves the "Show Keyboard" setting command to the *end* of the unblock sequence and runs it multiple times. This fixes the issue where Gboard loads but stays hidden.

```kotlin
    private fun setSoftKeyboardBlocking(enabled: Boolean) {
        if (shellService == null) {
            showToast("Shizuku required for Keyboard Blocking")
            return
        }

        // 1. Update Preference IMMEDIATELY so Accessibility Events don't fight us
        prefs.prefBlockSoftKeyboard = enabled
        if (!enabled) {
            handler.removeCallbacks(blockingHeartbeat)
        }

        Thread {
            try {
                // Find correct ID dynamically
                val listOutput = shellService?.runCommand("ime list -a -s") ?: ""
                val myImeId = listOutput.lines().firstOrNull { 
                    it.contains(packageName) && it.contains("NullInputMethodService") 
                }?.trim()

                if (myImeId.isNullOrEmpty()) {
                    handler.post { showToast("Error: Null Keyboard not found.") }
                    return@Thread
                }

                if (enabled) {
                    // --- BLOCKING (Switch to Null) ---
                    val current = shellService?.runCommand("settings get secure default_input_method")?.trim() ?: ""
                    if (current.isNotEmpty() && !current.contains("NullInputMethodService")) {
                        previousImeId = current
                    }

                    shellService?.runCommand("ime enable $myImeId")
                    shellService?.runCommand("ime set $myImeId")
                    shellService?.runCommand("settings put secure show_ime_with_hard_keyboard 0")

                    // Verify
                    Thread.sleep(500)
                    val newDefault = shellService?.runCommand("settings get secure default_input_method")?.trim() ?: ""
                    
                    if (newDefault.contains("NullInputMethodService")) {
                        handler.post { showToast("Blocked: Null Keyboard Active") }
                        handler.post(blockingHeartbeat) // Start maintenance loop
                    } else {
                        handler.post { 
                            showToast("Select 'DroidOS Null Keyboard'")
                            try {
                                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as android.view.inputmethod.InputMethodManager
                                imm.showInputMethodPicker()
                            } catch(e: Exception){}
                        }
                    }
                    
                } else {
                    // --- UNBLOCKING (Restore Gboard) ---
                    
                    // 1. Determine Target
                    var targetIme = previousImeId
                    if (targetIme.isNullOrEmpty()) {
                        val list = shellService?.runCommand("ime list -s") ?: ""
                        targetIme = list.lines().firstOrNull { it.contains("com.google.android.inputmethod.latin") } 
                            ?: list.lines().firstOrNull { it.contains("com.sec.android.inputmethod") }
                            ?: list.lines().firstOrNull { it.contains("honeyboard") }
                    }

                    // 2. Perform Switch
                    if (!targetIme.isNullOrEmpty()) {
                        val intent = Intent("com.example.coverscreentester.RESTORE_IME")
                        intent.setPackage(packageName)
                        intent.putExtra("target_ime", targetIme)
                        sendBroadcast(intent)
                        
                        shellService?.runCommand("ime enable $targetIme")
                        shellService?.runCommand("ime set $targetIme")
                        
                        handler.post { showToast("Restored: $targetIme") }
                    } else {
                        handler.post { 
                            showToast("Select your normal keyboard")
                            try {
                                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as android.view.inputmethod.InputMethodManager
                                imm.showInputMethodPicker()
                            } catch(e: Exception){}
                        }
                    }

                    // 3. CRITICAL: Force Visibility AFTER Switch
                    // We run this twice to beat any system race conditions
                    Thread.sleep(200)
                    shellService?.runCommand("settings put secure show_ime_with_hard_keyboard 1")
                    
                    Thread.sleep(500)
                    shellService?.runCommand("settings put secure show_ime_with_hard_keyboard 1")
                }
            } catch (e: Exception) {
                handler.post { showToast("Error: ${e.message}") }
            }
        }.start()
    }
```