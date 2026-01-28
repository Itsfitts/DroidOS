package com.example.coverscreentester

import android.content.BroadcastReceiver
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.inputmethodservice.InputMethodService
import android.os.Build
import android.os.SystemClock
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.inputmethod.InputConnection
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView

/**
 * DroidOS Input Dock (formerly Null Keyboard).
 * Provides a minimal toolbar for essential actions while keeping the screen clear.
 * Acts as the injection target for the DroidOS Overlay Trackpad/Keyboard.
 */
class DockInputMethodService : InputMethodService() {

    companion object {
        private const val TAG = "DockIME"
        // Keep the original broadcast action for backward compatibility with OverlayService
        private const val BROADCAST_ACTION_TEXT = "com.example.coverscreentester.INJECT_TEXT"
        private const val BROADCAST_ACTION_KEY = "com.example.coverscreentester.INJECT_KEY"
        private const val BROADCAST_ACTION_DELETE = "com.example.coverscreentester.INJECT_DELETE"
    }

    private var dockView: View? = null

    // Receiver to handle text injection from the Overlay Trackpad
    private val inputReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            val ic = currentInputConnection ?: return
            
            when (intent?.action) {
                BROADCAST_ACTION_TEXT -> {
                    val text = intent.getStringExtra("text")
                    if (!text.isNullOrEmpty()) ic.commitText(text, 1)
                }
                BROADCAST_ACTION_KEY -> {
                    val code = intent.getIntExtra("keyCode", 0)
                    val metaState = intent.getIntExtra("metaState", 0)
                    if (code > 0) sendKeyEventWithMeta(ic, code, metaState)
                }
                BROADCAST_ACTION_DELETE -> {
                    val length = intent.getIntExtra("length", 1)
                    if (length > 0) ic.deleteSurroundingText(length, 0)
                }
            }
        }
    }

    override fun onCreate() {
        super.onCreate()
        val filter = IntentFilter().apply {
            addAction(BROADCAST_ACTION_TEXT)
            addAction(BROADCAST_ACTION_KEY)
            addAction(BROADCAST_ACTION_DELETE)
        }
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(inputReceiver, filter, Context.RECEIVER_NOT_EXPORTED)
        } else {
            registerReceiver(inputReceiver, filter)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        try { unregisterReceiver(inputReceiver) } catch (e: Exception) {}
    }

    override fun onCreateInputView(): View {
        try {
            val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            dockView = inflater.inflate(R.layout.layout_input_dock, null)
            setupDockListeners(dockView!!)
            return dockView!!
        } catch (e: Exception) {
            // Safety Fallback: Return 0-size view if XML fails (prevents OverlayService crash)
            android.util.Log.e(TAG, "Failed to inflate Dock UI", e)
            return View(this).apply { 
                layoutParams = android.view.ViewGroup.LayoutParams(0, 0)
                visibility = View.GONE
            }
        }
    }

    // =================================================================================
    // FUNCTION: setupDockListeners
    // SUMMARY: Sets up click handlers for all dock buttons.
    //          Uses SHORT action names because OverlayService registers for exact
    //          matches like "TOGGLE_CUSTOM_KEYBOARD", not prefixed versions.
    // =================================================================================
    private fun setupDockListeners(view: View) {
        val btnKeyboard = view.findViewById<View>(R.id.btn_dock_keyboard)
        val btnVoice = view.findViewById<View>(R.id.btn_dock_voice)
        val btnPaste = view.findViewById<View>(R.id.btn_dock_paste)
        val btnSwitch = view.findViewById<View>(R.id.btn_dock_switch)
        val btnHide = view.findViewById<View>(R.id.btn_dock_hide)

        // 1. Open DroidOS Overlay Keyboard
        // FIX: Use SHORT action - OverlayService listens for "TOGGLE_CUSTOM_KEYBOARD" not prefixed
        btnKeyboard?.setOnClickListener {
            android.util.Log.d(TAG, "Dock KB pressed -> TOGGLE_CUSTOM_KEYBOARD")
            val intent = Intent("TOGGLE_CUSTOM_KEYBOARD")
            intent.setPackage(packageName)
            intent.putExtra("FORCE_SHOW", true)
            intent.addFlags(Intent.FLAG_RECEIVER_FOREGROUND)
            sendBroadcast(intent)
        }

        // 2. Voice Input
        // FIX: Use SHORT action - OverlayService listens for "REQUEST_VOICE_INPUT"
        btnVoice?.setOnClickListener {
            android.util.Log.d(TAG, "Dock MIC pressed -> REQUEST_VOICE_INPUT")
            val intent = Intent("REQUEST_VOICE_INPUT")
            intent.setPackage(packageName)
            intent.addFlags(Intent.FLAG_RECEIVER_FOREGROUND)
            sendBroadcast(intent)
        }

        // 3. Paste
        btnPaste?.setOnClickListener {
            android.util.Log.d(TAG, "Dock PST pressed -> pasting clipboard")
            val clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            if (clipboard.hasPrimaryClip()) {
                val item = clipboard.primaryClip?.getItemAt(0)
                val text = item?.text
                if (!text.isNullOrEmpty()) {
                    currentInputConnection?.commitText(text, 1)
                }
            }
        }

        // 4. Switch IME
        btnSwitch?.setOnClickListener {
            android.util.Log.d(TAG, "Dock IME pressed -> showing picker")
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.showInputMethodPicker()
        }

        // 5. Hide Dock
        btnHide?.setOnClickListener {
            android.util.Log.d(TAG, "Dock X pressed -> hiding")
            requestHideSelf(0)
        }
    }
    // =================================================================================
    // END BLOCK: setupDockListeners
    // =================================================================================

    // Helper: Send key with meta state
    private fun sendKeyEventWithMeta(ic: InputConnection, keyCode: Int, metaState: Int) {
        val eventTime = SystemClock.uptimeMillis()
        val downEvent = KeyEvent(eventTime, eventTime, KeyEvent.ACTION_DOWN, keyCode, 0, metaState, 0, 0, KeyEvent.FLAG_SOFT_KEYBOARD or KeyEvent.FLAG_KEEP_TOUCH_MODE, android.view.InputDevice.SOURCE_KEYBOARD)
        val upEvent = KeyEvent(eventTime, eventTime, KeyEvent.ACTION_UP, keyCode, 0, metaState, 0, 0, KeyEvent.FLAG_SOFT_KEYBOARD or KeyEvent.FLAG_KEEP_TOUCH_MODE, android.view.InputDevice.SOURCE_KEYBOARD)
        ic.sendKeyEvent(downEvent)
        ic.sendKeyEvent(upEvent)
    }

    // Ensure we keep the connection active
    override fun onEvaluateInputViewShown(): Boolean {
        return true
    }
}
