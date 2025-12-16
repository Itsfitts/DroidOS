# Code Update: Fix Voice Typing and Menu Refactoring

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/OverlayService.kt

### Step 1: Add the `isVoiceActive` variable and update `triggerAggressiveBlocking`.
**Action:** Add the `isVoiceActive` variable and replace the `triggerAggressiveBlocking` function.
**Reason:** To proactively manage the system's "Hardware Keyboard" behavior when Voice is detected, preventing the keyboard from being blocked.

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
```

### Step 2: Update `onAccessibilityEvent` to auto-detect Voice Windows.
**Action:** Replace the `onAccessibilityEvent` function.
**Reason:** To detect Google Voice windows and disable blocking, allowing Voice Typing to appear.

```kotlin
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
                // Trigger blocking only if Voice is NOT active
                triggerAggressiveBlocking()
                
                // Re-enforce Accessibility Hidden Mode if it got reset
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

### Step 3: Add `VOICE_TYPE_TRIGGERED` to the Broadcast Receiver.
**Action:** Add the `VOICE_TYPE_TRIGGERED` action to the `switchReceiver` object definition.
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
                    triggerAggressiveBlocking() // Will run the "allow" logic because isVoiceActive is true
                }
                
                Intent.ACTION_SCREEN_ON -> triggerAggressiveBlocking()
            }
        }
    }
```

### Step 4: Update `onCreate` to register the new action.
**Action:** Add `addAction("VOICE_TYPE_TRIGGERED")` to the `filter.apply` block inside `onCreate`.
**Reason:** To register the new action so the Broadcast Receiver can handle it.

```kotlin
        val filter = IntentFilter().apply { 
            addAction("CYCLE_INPUT_TARGET")
            addAction("RESET_CURSOR")
            addAction("TOGGLE_DEBUG")
            addAction("FORCE_KEYBOARD")
            addAction("TOGGLE_CUSTOM_KEYBOARD")
            addAction("SET_TRACKPAD_VISIBILITY")
            addAction("SET_PREVIEW_MODE") 
            addAction("OPEN_MENU")
            addAction("VOICE_TYPE_TRIGGERED") // <--- Add this
            addAction(Intent.ACTION_SCREEN_ON)
        }
```

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/KeyboardOverlay.kt

### Step 1: Update `triggerVoiceTyping` to broadcast the start event.
**Action:** Replace the `triggerVoiceTyping` function.
**Reason:** To broadcast `VOICE_TYPE_TRIGGERED` to the service immediately before switching the IME, ensuring that the service is aware of the voice typing activation.

```kotlin
    private fun triggerVoiceTyping() {
        if (shellService == null) return
        
        // 1. Notify Service to stop blocking
        val intent = android.content.Intent("VOICE_TYPE_TRIGGERED")
        intent.setPackage(context.packageName)
        context.sendBroadcast(intent)
        
        // 2. Perform Switch
        Thread {
            try {
                val output = shellService.runCommand("ime list -a -s")
                val voiceIme = output.lines().find { it.contains("google", true) && it.contains("voice", true) }
                    ?: output.lines().find { it.contains("voice", true) }
                if (voiceIme != null) {
                    shellService.runCommand("ime set $voiceIme")
                } else {
                    Log.w(TAG, "Voice IME not found in output: $output")
                }
            } catch (e: Exception) { Log.e(TAG, "Voice Switch Failed", e) }
        }.start()
    }
```

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/TrackpadMenuManager.kt

### `getTuneItems`
**Action:** Replace the `getTuneItems` function.
**Reason:** Moved the "Block Soft Keyboard" toggle to the bottom of the "Keyboard Settings" list and renamed it to "Cover Screen KB Blocker".

```kotlin
    // =========================
    // GET TUNE ITEMS - Keyboard configuration settings
    // =========================
    private fun getTuneItems(): List<TrackpadMenuAdapter.MenuItem> {
        val list = ArrayList<TrackpadMenuAdapter.MenuItem>()
        val p = service.prefs
        
        list.add(TrackpadMenuAdapter.MenuItem("KEYBOARD SETTINGS", 0, TrackpadMenuAdapter.Type.HEADER))
        
        // NEW: Launch Proxy Activity for Picker
        list.add(TrackpadMenuAdapter.MenuItem("Change Keyboard (System)", android.R.drawable.ic_menu_agenda, TrackpadMenuAdapter.Type.ACTION) { 
            service.forceSystemKeyboardVisible()
            hide() // Close menu
            
            try {
                val intent = android.content.Intent(context, KeyboardPickerActivity::class.java)
                intent.addFlags(android.content.Intent.FLAG_ACTIVITY_NEW_TASK)
                context.startActivity(intent)
            } catch(e: Exception) {
                android.widget.Toast.makeText(context, "Error launching picker", android.widget.Toast.LENGTH_SHORT).show()
            }
        })
        
        list.add(TrackpadMenuAdapter.MenuItem("Keyboard Opacity", R.drawable.ic_tab_tune, TrackpadMenuAdapter.Type.SLIDER, p.prefKeyboardAlpha, 255) { v -> service.updatePref("keyboard_alpha", v) })
        list.add(TrackpadMenuAdapter.MenuItem("Keyboard Scale", R.drawable.ic_tab_tune, TrackpadMenuAdapter.Type.SLIDER, p.prefKeyScale, 200) { v -> service.updatePref("keyboard_key_scale", v) })
        list.add(TrackpadMenuAdapter.MenuItem("Auto Display Off", android.R.drawable.ic_tab_tune, TrackpadMenuAdapter.Type.TOGGLE, if(p.prefAutomationEnabled) 1 else 0) { v -> service.updatePref("automation_enabled", v) })

        // MOVED & RENAMED: Cover Screen KB Blocker
        list.add(TrackpadMenuAdapter.MenuItem("Cover Screen KB Blocker", android.R.drawable.ic_lock_lock, TrackpadMenuAdapter.Type.TOGGLE, if(p.prefBlockSoftKeyboard) 1 else 0) { v -> 
            service.updatePref("block_soft_kb", v) 
        })

        return list
    }
```