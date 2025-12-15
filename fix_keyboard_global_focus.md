# Code Update: Make Keyboard Input Global (Remove Display Lock)

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/ShellUserService.kt

### Replacement Block: injectKey
**Action:** Replace the `injectKey` function.
**Reason:** Removes `setDisplayId` for KeyEvents. This makes the input "Global," allowing Android's WindowManager to route it to the currently focused app automatically, solving the buffering/focus issue.

```kotlin
    // --- INPUT INJECTION ---
    override fun injectKey(keyCode: Int, action: Int, metaState: Int, displayId: Int, deviceId: Int) {
        if (!this::inputManager.isInitialized) return
        val now = SystemClock.uptimeMillis()
        
        // Use ID 1 to match the "Dummy Hardware Keyboard" signal
        val forcedDeviceId = 1 
        val finalScanCode = 1
        val finalFlags = 8 // FLAG_FROM_SYSTEM
        
        val event = KeyEvent(
            now, now, action, keyCode, 0, metaState, 
            forcedDeviceId, finalScanCode, finalFlags, 
            InputDevice.SOURCE_KEYBOARD
        )
        
        try {
            // CRITICAL FIX: DO NOT set Display ID for KeyEvents.
            // Hardware keyboards are global. Setting a display ID restricts the event
            // to that specific display stack. If the OS thinks focus is elsewhere (even slightly),
            // the event is dropped or buffered.
            // By skipping this, we let Android route it to the "Current Focus".
            
            // val method = InputEvent::class.java.getMethod("setDisplayId", Int::class.javaPrimitiveType)
            // method.invoke(event, displayId)
            
            injectInputEventMethod.invoke(inputManager, event, INJECT_MODE_ASYNC)
        } catch (e: Exception) {
            // Fallback
            if (action == KeyEvent.ACTION_DOWN) execShell("input keyevent $keyCode")
        }
    }
```
