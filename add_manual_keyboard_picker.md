# Code Update: Add Manual Keyboard Picker to Menu

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/TrackpadMenuManager.kt

### Update getTuneItems
**Action:** Replace the `getTuneItems` function.
**Reason:** Adds a direct link to the Android Input Method Picker, allowing manual correction of keyboard states.

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
            try {
                val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as android.view.inputmethod.InputMethodManager
                imm.showInputMethodPicker()
                hide() // Hide our menu so the system dialog is visible
            } catch(e: Exception) {
                android.widget.Toast.makeText(context, "Failed to open picker", android.widget.Toast.LENGTH_SHORT).show()
            }
        })
        
        list.add(TrackpadMenuAdapter.MenuItem("Keyboard Opacity", R.drawable.ic_tab_tune, TrackpadMenuAdapter.Type.SLIDER, p.prefKeyboardAlpha, 255) { v -> service.updatePref("keyboard_alpha", v) })
        list.add(TrackpadMenuAdapter.MenuItem("Keyboard Scale", R.drawable.ic_tab_tune, TrackpadMenuAdapter.Type.SLIDER, p.prefKeyScale, 200) { v -> service.updatePref("keyboard_key_scale", v) })
        list.add(TrackpadMenuAdapter.MenuItem("Auto Display Off", R.drawable.ic_tab_tune, TrackpadMenuAdapter.Type.TOGGLE, if(p.prefAutomationEnabled) 1 else 0) { v -> service.updatePref("automation_enabled", v) })
        return list
    }
```