# Code Update: Fix Invalid ScanCode and Restore Display Targeting

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/ShellUserService.kt

### Replacement Block: injectKey
**Action:** Replace the `injectKey` function.
**Reason:** Sets `scanCode` to 0 (valid generic) to prevent Android dropping the events. Restores `setDisplayId` to ensure input reaches the correct screen.

```kotlin
    // --- INPUT INJECTION ---
    override fun injectKey(keyCode: Int, action: Int, metaState: Int, displayId: Int, deviceId: Int) {
        if (!this::inputManager.isInitialized) return
        val now = SystemClock.uptimeMillis()
        
        // CRITICAL CONFIGURATION:
        // Device ID = 1 (Mimics the "Hardware Keyboard" we use to block soft-kb)
        // Scan Code = 0 (Generic/Ignore). Setting this to 1 caused the buffering/reject issue.
        val forcedDeviceId = 1 
        val finalScanCode = 0 
        val finalFlags = 8 // FLAG_FROM_SYSTEM
        
        val event = KeyEvent(
            now, now, action, keyCode, 0, metaState, 
            forcedDeviceId, finalScanCode, finalFlags, 
            InputDevice.SOURCE_KEYBOARD
        )
        
        try {
            // Restore Display Targeting
            // We MUST target the display where the user is looking.
            val method = InputEvent::class.java.getMethod("setDisplayId", Int::class.javaPrimitiveType)
            method.invoke(event, displayId)
            
            injectInputEventMethod.invoke(inputManager, event, INJECT_MODE_ASYNC)
        } catch (e: Exception) {
            // Fallback
            if (action == KeyEvent.ACTION_DOWN) execShell("input keyevent $keyCode")
        }
    }
```
