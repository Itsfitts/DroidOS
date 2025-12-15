# Code Update: Keyboard Picker Activity & Device ID Fix

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/KeyboardPickerActivity.kt

**Action:** Create new file.
**Reason:** Android requires an active Activity window to launch the Input Method Picker. A Service cannot do it.

```kotlin
package com.example.coverscreentester

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.inputmethod.InputMethodManager

class KeyboardPickerActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Transparent activity
        
        // Use a handler to ensure window is attached before calling picker
        Handler(Looper.getMainLooper()).postDelayed({
            try {
                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.showInputMethodPicker()
            } catch (e: Exception) {
                e.printStackTrace()
            }
            // Close self after launching picker
            finish()
        }, 100)
    }
}
```

## File: Cover-Screen-Trackpad/app/src/main/AndroidManifest.xml

### Add Activity
**Action:** Add the new activity inside `<application>` tag.
**Reason:** Registers the helper activity.
```xml
        <activity
            android:name=".KeyboardPickerActivity"
            android:theme="@android:style/Theme.Translucent.NoTitleBar"
            android:excludeFromRecents="true"
            android:taskAffinity=""
            android:exported="false" />
```

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/TrackpadMenuManager.kt

### Replacement Block: getTuneItems
**Action:** Replace the `getTuneItems` function.
**Reason:** Updates the "Change Keyboard" button to launch the new Activity instead of failing silently.
```kotlin
    // =========================
    // GET TUNE ITEMS - Keyboard configuration settings
    // =========================
    private fun getTuneItems(): List<TrackpadMenuAdapter.MenuItem> {
        val list = ArrayList<TrackpadMenuAdapter.MenuItem>()
        val p = service.prefs
        
        list.add(TrackpadMenuAdapter.MenuItem("KEYBOARD SETTINGS", 0, TrackpadMenuAdapter.Type.HEADER))
        
        list.add(TrackpadMenuAdapter.MenuItem("Block Soft Keyboard", android.R.drawable.ic_lock_lock, TrackpadMenuAdapter.Type.TOGGLE, if(p.prefBlockSoftKeyboard) 1 else 0) { v -> 
            service.updatePref("block_soft_kb", v) 
        })

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
        list.add(TrackpadMenuAdapter.MenuItem("Auto Display Off", R.drawable.ic_tab_tune, TrackpadMenuAdapter.Type.TOGGLE, if(p.prefAutomationEnabled) 1 else 0) { v -> service.updatePref("automation_enabled", v) })
        return list
    }
```

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/OverlayService.kt

### Replacement Block: injectKey Helper
**Action:** Replace `injectKey` helper.
**Reason:** Change Device ID for unblocked mode to `-1`. ID `0` is sometimes treated as a "null device" by Gboard, while `-1` is the standard "Virtual/Injected" source.
```kotlin
    // =========================
    // KEY INJECTION
    // =========================
    private fun injectKey(keyCode: Int, action: Int = KeyEvent.ACTION_DOWN, metaState: Int = 0) {
        // Dynamic Device ID:
        // Blocking ON: Use 1 (Physical) to maintain "Hardware Keyboard" state.
        // Blocking OFF: Use -1 (Virtual). ID 0 is often ignored by Gboard. -1 is standard software injection.
        val deviceId = if (prefs.prefBlockSoftKeyboard) 1 else -1
        shellService?.injectKey(keyCode, action, metaState, inputTargetDisplayId, deviceId)
    }
```