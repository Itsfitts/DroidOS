# Code Update: Robust Typing & Keyboard Switch Fallback

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/OverlayService.kt

### Replacement Block 1: injectKeyFromKeyboard
**Action:** Replace the `injectKeyFromKeyboard` function.
**Reason:** Checks the *actual* system default keyboard to determine the typing method. If the Null Keyboard isn't active (even if we *wanted* it to be), it falls back to Shizuku injection so you can still type.

```kotlin
    fun injectKeyFromKeyboard(keyCode: Int, metaState: Int) {
        Thread {
            try {
                // 1. CHECK ACTUAL SYSTEM STATE
                // Don't trust our internal boolean. Trust the Android Settings.
                val currentIme = android.provider.Settings.Secure.getString(contentResolver, "default_input_method") ?: ""
                val isNullKeyboardActive = currentIme.contains(packageName) && currentIme.contains("NullInputMethodService")

                if (isNullKeyboardActive) {
                    // STRATEGY A: NATIVE (Cleanest)
                    // Only works if we successfully switched to our keyboard
                    val intent = Intent("com.example.coverscreentester.INJECT_KEY")
                    intent.setPackage(packageName)
                    intent.putExtra("keyCode", keyCode)
                    sendBroadcast(intent)
                } else {
                    // STRATEGY B: SHIZUKU INJECTION (Fallback / Gboard Active)
                    // Works even if switching failed. Uses Device ID 1 to mimic hardware.
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

### Replacement Block 2: setSoftKeyboardBlocking
**Action:** Replace the `setSoftKeyboardBlocking` function.
**Reason:** Tries to switch via Shell. If that fails (verified by checking settings), it launches the System Picker dialog as a fallback.
```kotlin
    private fun setSoftKeyboardBlocking(enabled: Boolean) {
        if (shellService == null) {
            showToast("Shizuku required for Keyboard Blocking")
            return
        }

        Thread {
            try {
                // 1. Find correct ID dynamically
                val listOutput = shellService?.runCommand("ime list -a -s") ?: ""
                val myImeId = listOutput.lines().firstOrNull { 
                    it.contains(packageName) && it.contains("NullInputMethodService") 
                }?.trim()

                if (myImeId.isNullOrEmpty()) {
                    handler.post { showToast("Error: Null Keyboard not found. Please re-install.") }
                    return@Thread
                }

                if (enabled) {
                    // --- BLOCKING (Switch to Null) ---
                    
                    // Save current (if not us)
                    val current = shellService?.runCommand("settings get secure default_input_method")?.trim() ?: ""
                    if (current.isNotEmpty() && !current.contains("NullInputMethodService")) {
                        previousImeId = current
                    }

                    // Attempt Shell Switch
                    shellService?.runCommand("ime enable $myImeId")
                    shellService?.runCommand("ime set $myImeId")
                    shellService?.runCommand("settings put secure show_ime_with_hard_keyboard 0")

                    // Verify & Fallback
                    Thread.sleep(500)
                    val newDefault = shellService?.runCommand("settings get secure default_input_method")?.trim() ?: ""
                    
                    if (newDefault.contains("NullInputMethodService")) {
                        handler.post { showToast("Blocked: Null Keyboard Active") }
                    } else {
                        // FALLBACK: Open Picker
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
                    
                    shellService?.runCommand("settings put secure show_ime_with_hard_keyboard 1")
                    
                    // Determine Target
                    var targetIme = previousImeId
                    if (targetIme.isNullOrEmpty()) {
                        val list = shellService?.runCommand("ime list -s") ?: ""
                        targetIme = list.lines().firstOrNull { it.contains("com.google.android.inputmethod.latin") } 
                            ?: list.lines().firstOrNull { it.contains("com.sec.android.inputmethod") }
                            ?: list.lines().firstOrNull { it.contains("honeyboard") }
                    }

                    if (!targetIme.isNullOrEmpty()) {
                        // Try Broadcast first (Clean Handoff)
                        val intent = Intent("com.example.coverscreentester.RESTORE_IME")
                        intent.setPackage(packageName)
                        intent.putExtra("target_ime", targetIme)
                        sendBroadcast(intent)
                        
                        // Blast Shell too just in case
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
                }
            } catch (e: Exception) {
                handler.post { showToast("Error: ${e.message}") }
            }
        }.start()
    }