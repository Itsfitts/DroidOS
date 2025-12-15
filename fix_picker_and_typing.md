# Code Update: Fix Picker Launch & Restore Typing

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/OverlayService.kt

### Replacement Block: injectKey Helper
**Action:** Replace the `injectKey` helper function (near the top/middle of class).
**Reason:** Reverts Device ID from `-1` (Virtual) back to `1` (Physical). Gboard ignores virtual keys when it detects a hardware keyboard connection (which we simulate).

```kotlin
    // =========================
    // KEY INJECTION
    // =========================
    private fun injectKey(keyCode: Int, action: Int = KeyEvent.ACTION_DOWN, metaState: Int = 0) {
        // FIXED: Use ID 1 (Physical). ID -1 (Virtual) is ignored by Gboard 
        // when our "Dummy Hardware Keyboard" signal is active.
        shellService?.injectKey(keyCode, action, metaState, inputTargetDisplayId, 1)
    }
```

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/TrackpadMenuManager.kt

### Replacement Block: getTuneItems
**Action:** Replace the `getTuneItems` function.
**Reason:** 
1. Forces `show_ime_with_hard_keyboard 1` before opening the picker (Fixes "Stuck" blocker).
2. Uses a `postDelayed` to show the picker after the menu closes, preventing UI conflicts.

```kotlin
    // =========================
    // GET TUNE ITEMS - Keyboard configuration settings
    // Contains Keyboard Opacity, Scale, and Auto Display Off
    // =========================
    private fun getTuneItems(): List<TrackpadMenuAdapter.MenuItem> {
        val list = ArrayList<TrackpadMenuAdapter.MenuItem>()
        val p = service.prefs
        
        list.add(TrackpadMenuAdapter.MenuItem("KEYBOARD SETTINGS", 0, TrackpadMenuAdapter.Type.HEADER))
        
        // Manual Soft Keyboard Blocker
        list.add(TrackpadMenuAdapter.MenuItem("Block Soft Keyboard", android.R.drawable.ic_lock_lock, TrackpadMenuAdapter.Type.TOGGLE, if(p.prefBlockSoftKeyboard) 1 else 0) { v -> 
            service.updatePref("block_soft_kb", v) 
        })

        // NEW: Manual System Picker Link (The "Escape Hatch")
        list.add(TrackpadMenuAdapter.MenuItem("Change Keyboard (System)", android.R.drawable.ic_menu_agenda, TrackpadMenuAdapter.Type.ACTION) { 
            // 1. Force Unblock (Fixes "Stuck" state)
            Thread { 
                service.shellService?.runCommand("settings put secure show_ime_with_hard_keyboard 1")
            }.start()

            // 2. Close Menu First
            hide() 
            
            // 3. Show Picker (Delayed to allow menu to fade)
            // Using service.handler ensures it runs on the main thread
            android.os.Handler(android.os.Looper.getMainLooper()).postDelayed({
                try {
                    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as android.view.inputmethod.InputMethodManager
                    imm.showInputMethodPicker()
                } catch(e: Exception) {
                    android.widget.Toast.makeText(context, "Failed to open picker", android.widget.Toast.LENGTH_SHORT).show()
                }
            }, 300)
        })
        
        list.add(TrackpadMenuAdapter.MenuItem("Keyboard Opacity", R.drawable.ic_tab_tune, TrackpadMenuAdapter.Type.SLIDER, p.prefKeyboardAlpha, 255) { v -> service.updatePref("keyboard_alpha", v) })
        list.add(TrackpadMenuAdapter.MenuItem("Keyboard Scale", R.drawable.ic_tab_tune, TrackpadMenuAdapter.Type.SLIDER, p.prefKeyScale, 200) { v -> service.updatePref("keyboard_key_scale", v) })
        list.add(TrackpadMenuAdapter.MenuItem("Auto Display Off", R.drawable.ic_tab_tune, TrackpadMenuAdapter.Type.TOGGLE, if(p.prefAutomationEnabled) 1 else 0) { v -> service.updatePref("automation_enabled", v) })
        return list
    }
```