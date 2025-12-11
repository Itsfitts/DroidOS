## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/OverlayService.kt

### 1. Update executeHardkeyAction function
// Find the executeHardkeyAction function and replace the "left_click" and "right_click" cases within the when(actionId) block.
// This ensures that if the event comes from the Tap Detection Timer (which sends ACTION_UP only), we trigger a full click if no drag was active.

```kotlin
    private fun executeHardkeyAction(actionId: String, keyEventAction: Int = KeyEvent.ACTION_UP) {
        when (actionId) {
            "none" -> { /* Do nothing */ }
            
            "left_click" -> {
                if (keyEventAction == KeyEvent.ACTION_DOWN) {
                    if (!volUpDragActive) { // Re-using state var to track physical press state
                        volUpDragActive = true
                        startKeyDrag(MotionEvent.BUTTON_PRIMARY)
                    }
                } else {
                    // Handle UP event (Release)
                    if (volUpDragActive) {
                        // Case A: We were holding/dragging (Direct Mode) -> Finish Drag
                        volUpDragActive = false
                        stopKeyDrag(MotionEvent.BUTTON_PRIMARY)
                    } else {
                        // Case B: We were NOT dragging (Timer/Tap Mode) -> Atomic Click
                        performClick(false) // Left Click
                    }
                }
            }
            
            "right_click" -> {
                 if (keyEventAction == KeyEvent.ACTION_DOWN) {
                    if (!volDownDragActive) {
                        volDownDragActive = true
                        startKeyDrag(MotionEvent.BUTTON_SECONDARY)
                    }
                } else {
                    // Handle UP event (Release)
                    if (volDownDragActive) {
                        // Case A: We were holding/dragging (Direct Mode) -> Finish Drag
                        volDownDragActive = false
                        stopKeyDrag(MotionEvent.BUTTON_SECONDARY)
                    } else {
                        // Case B: We were NOT dragging (Timer/Tap Mode) -> Atomic Click
                        performClick(true) // Right Click
                    }
                }
            }
            
            "scroll_up" -> {
// ... rest of the function remains unchanged ...
```