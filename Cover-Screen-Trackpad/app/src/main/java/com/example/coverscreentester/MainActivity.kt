package com.example.coverscreentester

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.hardware.display.DisplayManager
import android.os.Build
import android.os.Bundle
import android.view.Display
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import rikka.shizuku.Shizuku

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        if (Shizuku.checkSelfPermission() != PackageManager.PERMISSION_GRANTED) {
            Shizuku.requestPermission(0)
            Toast.makeText(this, "Please grant Shizuku permission", Toast.LENGTH_LONG).show()
            finish()
            return
        }

        val displayManager = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager
        val displayId = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            display?.displayId ?: displayManager.getDisplay(Display.DEFAULT_DISPLAY).displayId
        } else {
            windowManager.defaultDisplay.displayId
        }

        val intent = Intent(this, OverlayService::class.java).apply {
            action = "OPEN_MENU"
            putExtra("DISPLAY_ID", displayId)
            putExtra("FORCE_MOVE", true) 
        }
        
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(intent)
        } else {
            startService(intent)
        }

        finish()
    }
}
