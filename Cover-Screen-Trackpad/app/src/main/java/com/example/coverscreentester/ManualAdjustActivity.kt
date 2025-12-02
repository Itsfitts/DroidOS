package com.example.coverscreentester

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ManualAdjustActivity : Activity() {

    private var isMoveMode = true
    private var isKeyboardTarget = false
    private val STEP_SIZE = 10

    private lateinit var textMode: TextView
    private lateinit var btnToggle: Button
    private lateinit var btnToggleTarget: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manual_adjust)

        textMode = findViewById(R.id.text_mode)
        btnToggle = findViewById(R.id.btn_toggle_mode)
        btnToggleTarget = findViewById(R.id.btn_toggle_target)
        
        updateModeUI()

        btnToggle.setOnClickListener {
            isMoveMode = !isMoveMode
            updateModeUI()
        }
        
        btnToggleTarget.setOnClickListener {
            isKeyboardTarget = !isKeyboardTarget
            updateModeUI()
        }

        findViewById<Button>(R.id.btn_up).setOnClickListener { sendAdjust(0, -STEP_SIZE) }
        findViewById<Button>(R.id.btn_down).setOnClickListener { sendAdjust(0, STEP_SIZE) }
        findViewById<Button>(R.id.btn_left).setOnClickListener { sendAdjust(-STEP_SIZE, 0) }
        findViewById<Button>(R.id.btn_right).setOnClickListener { sendAdjust(STEP_SIZE, 0) }
        
        // New Center Reset
        findViewById<Button>(R.id.btn_center).setOnClickListener {
            val intent = Intent(this, OverlayService::class.java)
            intent.action = "RESET_POSITION"
            startService(intent)
        }

        // New Rotate
        findViewById<Button>(R.id.btn_rotate).setOnClickListener {
            val intent = Intent(this, OverlayService::class.java)
            intent.action = "ROTATE"
            startService(intent)
        }
        
        findViewById<Button>(R.id.btn_back).setOnClickListener { finish() }
    }

    private fun updateModeUI() {
        val targetText = if (isKeyboardTarget) "KEYBOARD" else "TRACKPAD"
        val actionText = if (isMoveMode) "POSITION" else "SIZE"
        
        textMode.text = "$targetText: $actionText"
        
        if (isKeyboardTarget) {
            textMode.setTextColor(Color.MAGENTA)
            btnToggleTarget.text = "Switch to Trackpad"
        } else {
            textMode.setTextColor(if (isMoveMode) Color.GREEN else Color.CYAN)
            btnToggleTarget.text = "Switch to Keyboard"
        }
        
        btnToggle.text = if (isMoveMode) "Switch to Resize" else "Switch to Position"
    }

    private fun sendAdjust(xChange: Int, yChange: Int) {
        val intent = Intent(this, OverlayService::class.java)
        intent.action = "MANUAL_ADJUST"
        
        intent.putExtra("TARGET", if (isKeyboardTarget) "KEYBOARD" else "TRACKPAD")
        
        if (isMoveMode) {
            intent.putExtra("DX", xChange)
            intent.putExtra("DY", yChange)
        } else {
            intent.putExtra("DW", xChange)
            intent.putExtra("DH", yChange)
        }
        
        startService(intent)
    }
}
