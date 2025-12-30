# Fix Trackpad and Launcher (Clean Apply)

## 1. Reset OverlayService.kt
First, we must discard the corrupted changes (duplicates) to ensure a clean slate for the edit.

```bash
git checkout Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/OverlayService.kt
```

## 2. Update OverlayService.kt (Add Logic)
Now we add the BroadcastReceiver and lifecycle methods to the clean file using precise anchors.

### File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/OverlayService.kt

#### Step 2.1: Add Receiver Class and Methods
**Location:** Top of the class.
**Anchor:** `class OverlayService : AccessibilityService(), DisplayManager.DisplayListener {`
<<<<
class OverlayService : AccessibilityService(), DisplayManager.DisplayListener {

    private val TAG = "OverlayService"
====
class OverlayService : AccessibilityService(), DisplayManager.DisplayListener {

    // === RECEIVER & ACTIONS - START ===
    private val commandReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            when (intent?.action) {
                "com.example.coverscreentester.SOFT_RESTART" -> {
                    Log.d("OverlayService", "Received SOFT_RESTART")
                    performSoftRestart()
                }
                "com.example.coverscreentester.ENFORCE_ZORDER" -> {
                    Log.d("OverlayService", "Received ENFORCE_ZORDER")
                    enforceZOrder()
                }
            }
        }
    }

    private fun performSoftRestart() {
        try {
            if (trackpadLayout != null && windowManager != null) {
                // Remove and re-add to refresh z-order
                try {
                    windowManager?.removeView(trackpadLayout)
                } catch (e: Exception) {
                    Log.e("OverlayService", "Remove view failed", e)
                }
                
                // Slight delay to ensure system processes removal
                Handler(Looper.getMainLooper()).postDelayed({
                    try {
                        windowManager?.addView(trackpadLayout, trackpadParams)
                        Toast.makeText(this, "Trackpad Refreshed", Toast.LENGTH_SHORT).show()
                    } catch (e: Exception) {
                        Log.e("OverlayService", "Add view failed", e)
                    }
                }, 100)
            }
        } catch (e: Exception) {
            Log.e("OverlayService", "Restart failed", e)
        }
    }

    private fun enforceZOrder() {
        try {
            if (trackpadLayout != null && windowManager != null) {
                // Updating layout params forces WindowManager to re-evaluate z-order
                windowManager?.updateViewLayout(trackpadLayout, trackpadParams)
                Log.d("OverlayService", "Z-Order Enforced")
            }
        } catch (e: Exception) {
            Log.e("OverlayService", "Z-Order failed", e)
        }
    }
    // === RECEIVER & ACTIONS - END ===

    private val TAG = "OverlayService"
>>>>

#### Step 2.2: Register in onCreate
**Location:** Inside `onCreate` method.
**Anchor:** `super.onCreate()`
<<<<
    override fun onCreate() {
        super.onCreate()

        try { displayManager = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager; displayManager?.registerDisplayListener(this, handler) } catch (e: Exception) {}
====
    override fun onCreate() {
        super.onCreate()

        // Register Receiver
        val filter = IntentFilter().apply {
            addAction("com.example.coverscreentester.SOFT_RESTART")
            addAction("com.example.coverscreentester.ENFORCE_ZORDER")
        }
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(commandReceiver, filter, Context.RECEIVER_EXPORTED)
        } else {
            registerReceiver(commandReceiver, filter)
        }

        try { displayManager = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager; displayManager?.registerDisplayListener(this, handler) } catch (e: Exception) {}
>>>>

#### Step 2.3: Unregister in onDestroy
**Location:** Inside `onDestroy` method.
**Anchor:** `super.onDestroy()`
<<<<
    override fun onDestroy() {
        super.onDestroy()
        // VIRTUAL DISPLAY KEEP-ALIVE: Release wake lock on destroy
====
    override fun onDestroy() {
        super.onDestroy()
        try {
            unregisterReceiver(commandReceiver)
        } catch (e: Exception) {
            // Ignore if not registered
        }

        // VIRTUAL DISPLAY KEEP-ALIVE: Release wake lock on destroy
>>>>

## 3. Update FloatingLauncherService.kt
We need to point the launcher to the correct trackpad package.

### File: Cover-Screen-Launcher/app/src/main/java/com/example/quadrantlauncher/FloatingLauncherService.kt
<<<<
    private val PACKAGE_TRACKPAD = "com.katsuyamaki.DroidOSTrackpadKeyboard"
====
    private val PACKAGE_TRACKPAD = "com.example.coverscreentester"
>>>>
