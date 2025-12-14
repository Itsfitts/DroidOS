package com.example.coverscreentester

import android.inputmethodservice.InputMethodService
import android.view.View

class NullInputMethodService : InputMethodService() {
    override fun onCreateInputView(): View {
        // Return a view with 0 height to make the keyboard invisible
        val view = View(this)
        view.layoutParams = android.view.ViewGroup.LayoutParams(0, 0)
        return view
    }
    
    override fun onEvaluateInputViewShown(): Boolean {
        super.onEvaluateInputViewShown()
        // Tell system we don't want to show a standard UI
        // We handle visibility ourselves (by being 0 height)
        return true
    }
}
