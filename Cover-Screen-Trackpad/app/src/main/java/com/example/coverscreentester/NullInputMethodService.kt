package com.example.coverscreentester

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.inputmethodservice.InputMethodService
import android.os.Build
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputConnection
import android.view.inputmethod.EditorInfo

class NullInputMethodService : InputMethodService() {

    // Receiver to handle commands from OverlayService (DroidOS Keyboard)
    private val inputReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            val ic = currentInputConnection ?: return
            
            when (intent?.action) {
                "com.example.coverscreentester.INJECT_TEXT" -> {
                    val text = intent.getStringExtra("text")
                    if (!text.isNullOrEmpty()) {
                        ic.commitText(text, 1)
                    }
                }
                "com.example.coverscreentester.INJECT_KEY" -> {
                    val code = intent.getIntExtra("keyCode", 0)
                    if (code > 0) {
                        sendDownUpKeyEvents(code)
                    }
                }
                "com.example.coverscreentester.INJECT_DELETE" -> {
                    val length = intent.getIntExtra("length", 1)
                    if (length > 0) {
                        ic.deleteSurroundingText(length, 0)
                    }
                }
            }
        }
    }

    override fun onCreate() {
        super.onCreate()
        // Register receiver for OverlayService communication
        val filter = IntentFilter().apply {
            addAction("com.example.coverscreentester.INJECT_TEXT")
            addAction("com.example.coverscreentester.INJECT_KEY")
            addAction("com.example.coverscreentester.INJECT_DELETE")
        }
        
        if (Build.VERSION.SDK_INT >= 33) { // TIRAMISU
            registerReceiver(inputReceiver, filter, Context.RECEIVER_NOT_EXPORTED)
        } else {
            registerReceiver(inputReceiver, filter)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(inputReceiver)
    }

    override fun onCreateInputView(): View {
        // Return a zero-sized view to satisfy the system but show nothing
        return View(this).apply {
            layoutParams = android.view.ViewGroup.LayoutParams(0, 0)
            visibility = View.GONE
        }
    }
    
    override fun onCreateCandidatesView(): View? {
        return null // No suggestions
    }

    override fun onEvaluateInputViewShown(): Boolean {
        // Return true so the system thinks the keyboard is "active" and connects the InputConnection
        return true
    }
}
