# Code Update: Fix Text Buffering by Unifying Device ID

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/ShellUserService.kt

### Replacement Block: injectKey
**Action:** Replace the `injectKey` function.
**Reason:** Forces all key events to use `deviceId = 1` and `scanCode = 1`. This aligns the typed text with the "dummy hardware key" signal, preventing Android from buffering the input as "secondary/virtual" data.

```kotlin
    // --- INPUT INJECTION ---
    override fun injectKey(keyCode: Int, action: Int, metaState: Int, displayId: Int, deviceId: Int) {
        if (!this::inputManager.isInitialized) return
        val now = SystemClock.uptimeMillis()
        
        // CRITICAL FIX: Force Device ID 1 (Physical/External)
        // This ensures the OS treats this input as coming from the "Hardware Keyboard" 
        // that we used to suppress the soft keyboard.
        val forcedDeviceId = 1 
        val finalScanCode = 1
        val finalFlags = 8 // FLAG_FROM_SYSTEM
        
        val event = KeyEvent(
            now, now, action, keyCode, 0, metaState, 
            forcedDeviceId, finalScanCode, finalFlags, 
            InputDevice.SOURCE_KEYBOARD
        )
        
        try {
            val method = InputEvent::class.java.getMethod("setDisplayId", Int::class.javaPrimitiveType)
            method.invoke(event, displayId)
            injectInputEventMethod.invoke(inputManager, event, INJECT_MODE_ASYNC)
        } catch (e: Exception) {
            // Fallback for critical keys if reflection fails
            if (action == KeyEvent.ACTION_DOWN) execShell("input keyevent $keyCode")
        }
    }
```

### Replacement Block: injectDummyHardwareKey
**Action:** Replace `injectDummyHardwareKey` function.
**Reason:** Ensures the "Keep Alive" signal also uses the exact same `deviceId = 1` signature.

```kotlin
    // Trigger to force system to update "Hardware Keyboard" status immediately
    override fun injectDummyHardwareKey(displayId: Int) {
         if (!this::inputManager.isInitialized) return
         val now = SystemClock.uptimeMillis()
         
         // Use SAME ID (1) as the text injection to maintain consistency
         val eventDown = KeyEvent(now, now, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_SHIFT_LEFT, 0, 0, 1, 1, 8, InputDevice.SOURCE_KEYBOARD)
         val eventUp = KeyEvent(now, now, KeyEvent.ACTION_UP, KeyEvent.KEYCODE_SHIFT_LEFT, 0, 0, 1, 1, 8, InputDevice.SOURCE_KEYBOARD)
         
         try {
            val method = InputEvent::class.java.getMethod("setDisplayId", Int::class.javaPrimitiveType)
            method.invoke(eventDown, displayId)
            method.invoke(eventUp, displayId)
            
            injectInputEventMethod.invoke(inputManager, eventDown, INJECT_MODE_ASYNC)
            injectInputEventMethod.invoke(inputManager, eventUp, INJECT_MODE_ASYNC)
         } catch(e: Exception) {}
    }
```
