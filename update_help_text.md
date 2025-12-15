# Code Update: Update Help Text and Bubble Behavior Description

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/TrackpadMenuManager.kt

### Replacement Block: getHelpItems
**Action:** Replace the `getHelpItems` function.
**Reason:** Updates the instructions to match the actual control scheme (Vol Down for Right Click) and the new Bubble behavior (Tap toggles both, Long Press opens menu).

```kotlin
    private fun getHelpItems(): List<TrackpadMenuAdapter.MenuItem> {
        val list = ArrayList<TrackpadMenuAdapter.MenuItem>()
        
        list.add(TrackpadMenuAdapter.MenuItem("INSTRUCTIONS", 0, TrackpadMenuAdapter.Type.HEADER))
        
        val text = 
            "TRACKPAD CONTROLS\n" +
            "• Tap: Left Click\n" +
            "• Vol Down: Right Click (Default)\n" +
            "• Hold + Slide: Drag & Drop\n" +
            "• Edge (Top/Bottom): V-Scroll\n" +
            "• Edge (Left/Right): H-Scroll\n\n" +
            "KEYBOARD OVERLAY\n" +
            "• Drag Top Bar: Move Window\n" +
            "• Drag Bottom-Right: Resize\n" +
            "• Hold Corner: Toggle Key/Mouse\n\n" +
            "HARDWARE KEYS\n" +
            "• Map Volume Keys in 'Keybinds' tab\n" +
            "  to Click, Scroll, or Screen Off."
            
        list.add(TrackpadMenuAdapter.MenuItem(text, 0, TrackpadMenuAdapter.Type.INFO))
        
        list.add(TrackpadMenuAdapter.MenuItem("LAUNCHER BUBBLE", 0, TrackpadMenuAdapter.Type.HEADER))
        val text2 = 
            "• Tap: Toggle Trackpad & Keyboard\n" +
            "• Long Press: Open this Menu\n" +
            "• Drag: Move Bubble Position"
        list.add(TrackpadMenuAdapter.MenuItem(text2, 0, TrackpadMenuAdapter.Type.INFO))
        
        return list
    }

```