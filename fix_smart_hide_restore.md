# Code Update: Smart Hide/Restore Feature

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/OverlayService.kt

### Add Smart Restore State Variables
**Action:** Add new state variables to `OverlayService.kt`.
**Reason:** To remember the visibility state of the trackpad and keyboard when they are hidden.

```kotlin
    private var isPreviewMode = false
    private var previousImeId: String? = null
    
    // --- SMART RESTORE STATE ---
    private var pendingRestoreTrackpad = false
    private var pendingRestoreKeyboard = false
    private var hasPendingRestore = false
```

### Replace `handleBubbleTap` and `keyboardHandle`
**Action:** Replace the `handleBubbleTap` and `keyboardHandle` methods in `OverlayService.kt`, and add the new `performSmartHide` and `performSmartRestore` methods.
**Reason:** Implements the core logic for the "Smart Hide/Restore" feature.

```kotlin
    private fun handleBubbleTap() {
        val anythingVisible = isTrackpadVisible || isCustomKeyboardVisible
        if (anythingVisible) {
            performSmartHide()
        } else {
            performSmartRestore()
        }
    }
    
    // --- SMART VISIBILITY LOGIC ---
    fun performSmartHide() {
        pendingRestoreTrackpad = isTrackpadVisible
        pendingRestoreKeyboard = isCustomKeyboardVisible
        hasPendingRestore = true
        
        // Hide components (Automation logic inside toggleCustomKeyboard will handle screen off if enabled)
        if (isCustomKeyboardVisible) toggleCustomKeyboard()
        if (isTrackpadVisible) toggleTrackpad()
        
        handler.post { Toast.makeText(this, "Hidden (Tap Bubble to Restore)", Toast.LENGTH_SHORT).show() }
    }

    fun performSmartRestore() {
        if (!hasPendingRestore) {
            // Fallback: Just show Trackpad if no state saved
            if (!isTrackpadVisible) toggleTrackpad()
            return
        }
        
        if (pendingRestoreTrackpad && !isTrackpadVisible) toggleTrackpad()
        if (pendingRestoreKeyboard && !isCustomKeyboardVisible) toggleCustomKeyboard()
        
        hasPendingRestore = false
    }

    private fun keyboardHandle(event: MotionEvent): Boolean { 
        if (event.action == MotionEvent.ACTION_UP) {
            performSmartHide()
        } 
        return true 
    }
```

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/TrackpadMenuManager.kt

### Update `getMainItems`
**Action:** Update the "Toggle Keyboard" menu item in `getMainItems`.
**Reason:** To use the smart hide logic when the keyboard is visible.

```kotlin
        list.add(TrackpadMenuAdapter.MenuItem("Toggle Keyboard", R.drawable.ic_tab_keyboard, TrackpadMenuAdapter.Type.ACTION) { 
            if (service.isCustomKeyboardVisible) service.performSmartHide()
            else service.toggleCustomKeyboard()
        })
```