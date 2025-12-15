# Code Update: Robust Keyboard Picker Activity

## File: Cover-Screen-Trackpad/app/src/main/java/com/example/coverscreentester/KeyboardPickerActivity.kt

### Replacement Block: Entire Class
**Action:** Replace the entire class.
**Reason:** Ensures the activity is fully resumed and visible (transparently) before launching the picker. Adds a 1-second delay before `finish()` to prevent the system from cancelling the dialog request.

```kotlin
package com.example.coverscreentester

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.inputmethod.InputMethodManager

class KeyboardPickerActivity : Activity() {
    
    private var isPickerLaunched = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // 1. Set a transparent view to ensure window attachment
        val view = View(this)
        view.setBackgroundColor(0x00000000) // Fully transparent
        view.isClickable = true
        // Close if user taps the empty space (cancelled picker)
        view.setOnClickListener { finish() }
        setContentView(view)
    }

    override fun onResume() {
        super.onResume()
        
        // 2. Launch Picker only once, slightly delayed to ensure Window Focus
        if (!isPickerLaunched) {
            Handler(Looper.getMainLooper()).postDelayed({
                try {
                    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.showInputMethodPicker()
                    isPickerLaunched = true
                    
                    // 3. Close self after a delay allows the dialog to take over
                    // If we close too fast, the system dialog might be cancelled.
                    Handler(Looper.getMainLooper()).postDelayed({
                        finish()
                    }, 1000)
                    
                } catch (e: Exception) {
                    e.printStackTrace()
                    finish()
                }
            }, 200)
        }
    }
}
```

## File: Cover-Screen-Trackpad/app/src/main/AndroidManifest.xml

### Update Activity Tag
**Action:** Update the `KeyboardPickerActivity` entry.
**Reason:** Adds `singleInstance` to prevent multiple invisible activities from stacking up if clicked repeatedly.
```xml
        <activity
            android:name=".KeyboardPickerActivity"
            android:theme="@android:style/Theme.Translucent.NoTitleBar"
            android:excludeFromRecents="true"
            android:taskAffinity=""
            android:launchMode="singleInstance"
            android:exported="false" />
```