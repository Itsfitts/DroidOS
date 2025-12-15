# Code Update: Cleanup Debug Toasts and Rename Menu Items

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/OverlayService.kt

### Replacement Block 1: executeHardkeyAction (Launcher Bubble Case)
**Action:** Replace the `toggle_bubble` case.
**Reason:** Removes the success toast ("Force Switch to...").

```kotlin
            // "Launcher Bubble" Keybind Action - Force Toggle with Debounce
            "toggle_bubble" -> if (isUp) {
                // Set manual switch timestamp to block auto-move for a few seconds
                lastManualSwitchTime = System.currentTimeMillis()
                
                val targetId = if (currentDisplayId == 0) 1 else 0
                
                try {
                    // showToast("Force Switch to $targetId") // Removed debug toast
                    setupUI(targetId)
                    resetBubblePosition()
                    menuManager?.show()
                    enforceZOrder()
                } catch (e: Exception) {
                    showToast("Error: ${e.message}")
                }
            }
```

### Replacement Block 2: onDisplayChanged
**Action:** Replace the `onDisplayChanged` function.
**Reason:** Removes "Phone Opened/Closed" debug toasts.

```kotlin
    override fun onDisplayChanged(displayId: Int) {
        // We only monitor the Main Screen (0) state changes to determine "Open/Closed"
        if (displayId == 0) {
            val display = displayManager?.getDisplay(0)
            val isDebounced = (System.currentTimeMillis() - lastManualSwitchTime > 5000)
            
            if (display != null && isDebounced) {
                // CASE A: Phone Opened (Display 0 turned ON) -> Move to Main (0)
                if (display.state == Display.STATE_ON && currentDisplayId != 0) {
                    handler.postDelayed({
                        try {
                            if (System.currentTimeMillis() - lastManualSwitchTime > 5000) {
                                setupUI(0)
                                resetBubblePosition()
                                // showToast("Phone Opened: Moved to Main Screen") // Removed debug toast
                            }
                        } catch(e: Exception) {}
                    }, 500)
                }
                // CASE B: Phone Closed (Display 0 turned OFF/DOZE) -> Move to Cover (1)
                else if (display.state != Display.STATE_ON && currentDisplayId == 0) {
                    handler.postDelayed({
                        try {
                            // Double-check state (ensure it didn't just flicker)
                            val d0 = displayManager?.getDisplay(0)
                            if (d0?.state != Display.STATE_ON && 
                                System.currentTimeMillis() - lastManualSwitchTime > 5000) {
                                
                                setupUI(1)
                                // We don't reset bubble pos here to avoid it jumping if you just locked the screen
                                // But we do ensure menu is hidden if it was open
                                menuManager?.hide() 
                                // showToast("Phone Closed: Moved to Cover Screen") // Removed debug toast
                            }
                        } catch(e: Exception) {}
                    }, 500)
                }
            }
        }
    }
```

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/TrackpadMenuManager.kt

### Replacement Block: getMainItems
**Action:** Replace the `getMainItems` function.
**Reason:** Renames items and comments out requested buttons.

```kotlin
    // =========================
    // GET MAIN ITEMS - Generates main menu items list
    // =========================
    private fun getMainItems(): List<TrackpadMenuAdapter.MenuItem> {
        val list = ArrayList<TrackpadMenuAdapter.MenuItem>()
        val p = service.prefs
        
        list.add(TrackpadMenuAdapter.MenuItem("MAIN CONTROLS", 0, TrackpadMenuAdapter.Type.HEADER))
        
        // --- COMMENTED OUT PER REQUEST ---
        /*
        list.add(TrackpadMenuAdapter.MenuItem("Switch Screen (0 <-> 1)", android.R.drawable.ic_menu_rotate, TrackpadMenuAdapter.Type.ACTION) { 
            service.switchDisplay() 
            hide()
        })
        */
        // ---------------------------------

        list.add(TrackpadMenuAdapter.MenuItem("Reset Bubble Position", android.R.drawable.ic_menu_myplaces, TrackpadMenuAdapter.Type.ACTION) { 
            service.resetBubblePosition()
            hide()
        })
        
        // --- COMMENTED OUT PER REQUEST ---
        /*
        list.add(TrackpadMenuAdapter.MenuItem("Move Trackpad Here", R.drawable.ic_tab_move, TrackpadMenuAdapter.Type.ACTION) { service.forceMoveToCurrentDisplay(); hide() })
        */
        
        // Renamed: "Target: ..." -> "Toggle Remote Display"
        list.add(TrackpadMenuAdapter.MenuItem("Toggle Remote Display", R.drawable.ic_cursor, TrackpadMenuAdapter.Type.ACTION) { service.cycleInputTarget(); loadTab(TAB_MAIN) })
        
        // --- ANCHOR TOGGLE: Locks trackpad and keyboard position/size ---
        list.add(TrackpadMenuAdapter.MenuItem("Anchor (Lock Position)", 
            if(p.prefAnchored) R.drawable.ic_lock_closed else R.R.drawable.ic_lock_open, 
            TrackpadMenuAdapter.Type.TOGGLE, 
            if(p.prefAnchored) 1 else 0) { v ->
            service.updatePref("anchored", v)
            loadTab(TAB_MAIN)  // Refresh to update icon
        })
        // --- END ANCHOR TOGGLE ---
        
        list.add(TrackpadMenuAdapter.MenuItem("Toggle Keyboard", R.drawable.ic_tab_keyboard, TrackpadMenuAdapter.Type.ACTION) { service.toggleCustomKeyboard() })
        list.add(TrackpadMenuAdapter.MenuItem("Reset Cursor", android.R.drawable.ic_menu_rotate, TrackpadMenuAdapter.Type.ACTION) { service.resetCursorCenter() })
        
        // Renamed: "Hide App" -> "Hide All"
        list.add(TrackpadMenuAdapter.MenuItem("Hide All", android.R.drawable.ic_menu_close_clear_cancel, TrackpadMenuAdapter.Type.ACTION) { service.hideApp() })
        
        // Renamed: "Force Kill Service" -> "Close/Restart App"
        list.add(TrackpadMenuAdapter.MenuItem("Close/Restart App", android.R.drawable.ic_delete, TrackpadMenuAdapter.Type.ACTION) { service.forceExit() })
        return list
    }
```
