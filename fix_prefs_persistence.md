# Code Update: Fix Preference Persistence

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/OverlayService.kt

### Replacement Block 1: loadPrefs
**Action:** Replace `loadPrefs` function.
**Reason:** Reads all preference values from SharedPreferences into the `prefs` object at startup. Previously it only loaded a few flags.

```kotlin
    private fun loadPrefs() { 
        val p = getSharedPreferences("TrackpadPrefs", Context.MODE_PRIVATE)
        prefs.cursorSpeed = p.getFloat("cursor_speed", 2.5f)
        prefs.scrollSpeed = p.getFloat("scroll_speed", 1.0f)
        prefs.prefTapScroll = p.getBoolean("tap_scroll", true)
        prefs.prefVibrate = p.getBoolean("vibrate", true)
        prefs.prefReverseScroll = p.getBoolean("reverse_scroll", true)
        prefs.prefAlpha = p.getInt("alpha", 200)
        prefs.prefBgAlpha = p.getInt("bg_alpha", 0)
        prefs.prefKeyboardAlpha = p.getInt("keyboard_alpha", 200)
        prefs.prefHandleSize = p.getInt("handle_size", 60)
        prefs.prefVPosLeft = p.getBoolean("v_pos_left", false)
        prefs.prefHPosTop = p.getBoolean("h_pos_top", false)
        prefs.prefAnchored = p.getBoolean("anchored", false)
        prefs.prefHandleTouchSize = p.getInt("handle_touch_size", 80)
        prefs.prefScrollTouchSize = p.getInt("scroll_touch_size", 80)
        prefs.prefScrollVisualSize = p.getInt("scroll_visual_size", 4)
        prefs.prefCursorSize = p.getInt("cursor_size", 50)
        prefs.prefKeyScale = p.getInt("keyboard_key_scale", 100)
        prefs.prefUseAltScreenOff = p.getBoolean("use_alt_screen_off", true)
        prefs.prefAutomationEnabled = p.getBoolean("automation_enabled", true)
        prefs.prefBubbleX = p.getInt("bubble_x", 50)
        prefs.prefBubbleY = p.getInt("bubble_y", 300)
        prefs.prefBubbleSize = p.getInt("bubble_size", 100)
        prefs.prefBubbleIconIndex = p.getInt("bubble_icon_index", 0)
        prefs.prefBubbleAlpha = p.getInt("bubble_alpha", 255)
        
        prefs.prefPersistentService = p.getBoolean("persistent_service", false)
        prefs.prefBlockSoftKeyboard = p.getBoolean("block_soft_kb", false)
        
        prefs.hardkeyVolUpTap = p.getString("hardkey_vol_up_tap", "left_click") ?: "left_click"
        prefs.hardkeyVolUpDouble = p.getString("hardkey_vol_up_double", "none") ?: "none"
        prefs.hardkeyVolUpHold = p.getString("hardkey_vol_up_hold", "left_click") ?: "left_click"
        prefs.hardkeyVolDownTap = p.getString("hardkey_vol_down_tap", "right_click") ?: "right_click"
        prefs.hardkeyVolDownDouble = p.getString("hardkey_vol_down_double", "display_toggle") ?: "display_toggle"
        prefs.hardkeyVolDownHold = p.getString("hardkey_vol_down_hold", "alt_position") ?: "alt_position"
        prefs.hardkeyPowerDouble = p.getString("hardkey_power_double", "none") ?: "none"
        
        prefs.doubleTapMs = p.getInt("double_tap_ms", 300)
        prefs.holdDurationMs = p.getInt("hold_duration_ms", 400)
    }

### Replacement Block 2: savePrefs
**Action:** Replace `savePrefs` function.
**Reason:** Writes all prefs values to SharedPreferences. This ensures that changes made in the Overlay Menu are actually saved to disk, so they persist when components (like the Keyboard) reload.
```kotlin
    private fun savePrefs() { 
        val e = getSharedPreferences("TrackpadPrefs", Context.MODE_PRIVATE).edit()
        
        e.putFloat("cursor_speed", prefs.cursorSpeed)
        e.putFloat("scroll_speed", prefs.scrollSpeed)
        e.putBoolean("tap_scroll", prefs.prefTapScroll)
        e.putBoolean("vibrate", prefs.prefVibrate)
        e.putBoolean("reverse_scroll", prefs.prefReverseScroll)
        e.putInt("alpha", prefs.prefAlpha)
        e.putInt("bg_alpha", prefs.prefBgAlpha)
        e.putInt("keyboard_alpha", prefs.prefKeyboardAlpha)
        e.putInt("handle_size", prefs.prefHandleSize)
        e.putBoolean("v_pos_left", prefs.prefVPosLeft)
        e.putBoolean("h_pos_top", prefs.prefHPosTop)
        e.putBoolean("anchored", prefs.prefAnchored)
        e.putInt("handle_touch_size", prefs.prefHandleTouchSize)
        e.putInt("scroll_touch_size", prefs.prefScrollTouchSize)
        e.putInt("scroll_visual_size", prefs.prefScrollVisualSize)
        e.putInt("cursor_size", prefs.prefCursorSize)
        e.putInt("keyboard_key_scale", prefs.prefKeyScale)
        e.putBoolean("use_alt_screen_off", prefs.prefUseAltScreenOff)
        e.putBoolean("automation_enabled", prefs.prefAutomationEnabled)
        e.putInt("bubble_x", prefs.prefBubbleX)
        e.putInt("bubble_y", prefs.prefBubbleY)
        e.putInt("bubble_size", prefs.prefBubbleSize)
        e.putInt("bubble_icon_index", prefs.prefBubbleIconIndex)
        e.putInt("bubble_alpha", prefs.prefBubbleAlpha)
        
        e.putBoolean("persistent_service", prefs.prefPersistentService)
        e.putBoolean("block_soft_kb", prefs.prefBlockSoftKeyboard)
        
        e.putString("hardkey_vol_up_tap", prefs.hardkeyVolUpTap)
        e.putString("hardkey_vol_up_double", prefs.hardkeyVolUpDouble)
        e.putString("hardkey_vol_up_hold", prefs.hardkeyVolUpHold)
        e.putString("hardkey_vol_down_tap", prefs.hardkeyVolDownTap)
        e.putString("hardkey_vol_down_double", prefs.hardkeyVolDownDouble)
        e.putString("hardkey_vol_down_hold", prefs.hardkeyVolDownHold)
        e.putString("hardkey_power_double", prefs.hardkeyPowerDouble)
        
        e.putInt("double_tap_ms", prefs.doubleTapMs)
        e.putInt("hold_duration_ms", prefs.holdDurationMs)
        
        e.apply() 
    }
```