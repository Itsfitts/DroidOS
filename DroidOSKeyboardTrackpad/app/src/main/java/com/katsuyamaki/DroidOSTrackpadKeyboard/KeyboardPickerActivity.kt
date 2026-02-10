package com.katsuyamaki.DroidOSTrackpadKeyboard

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.view.inputmethod.InputMethodManager
import android.widget.Toast

class KeyboardPickerActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Don't set content view - just show dialog immediately
        showCustomKeyboardPicker()
    }
    
    private fun showCustomKeyboardPicker() {
        try {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            val enabledIMEs = imm.enabledInputMethodList
            
            if (enabledIMEs.isEmpty()) {
                Toast.makeText(this, "No keyboards enabled", Toast.LENGTH_SHORT).show()
                openKeyboardSettings()
                return
            }
            
            // Build list of keyboard names and their IDs
            val names = enabledIMEs.map { 
                it.loadLabel(packageManager).toString() 
            }.toTypedArray()
            
            val ids = enabledIMEs.map { it.id }
            
            // Find current keyboard
            val currentId = Settings.Secure.getString(contentResolver, Settings.Secure.DEFAULT_INPUT_METHOD)
            val currentIndex = ids.indexOf(currentId).coerceAtLeast(0)
            
            AlertDialog.Builder(this, android.R.style.Theme_DeviceDefault_Dialog_Alert)
                .setTitle("Select Keyboard")
                .setSingleChoiceItems(names, currentIndex) { dialog, which ->
                    val selectedName = names[which]
                    val selectedId = ids[which]
                    
                    if (which == currentIndex) {
                        Toast.makeText(this, "$selectedName is already active", Toast.LENGTH_SHORT).show()
                        dialog.dismiss()
                        finish()
                        return@setSingleChoiceItems
                    }
                    
                    // Send broadcast to OverlayService to switch keyboard via Shizuku
                    val switchIntent = Intent("com.katsuyamaki.DroidOSTrackpadKeyboard.SWITCH_KEYBOARD")
                    switchIntent.setPackage(packageName)
                    switchIntent.putExtra("IME_ID", selectedId)
                    switchIntent.putExtra("IME_NAME", selectedName)
                    sendBroadcast(switchIntent)
                    
                    Toast.makeText(this, "Switching to $selectedName...", Toast.LENGTH_SHORT).show()
                    dialog.dismiss()
                    finish()
                }
                .setNegativeButton("Cancel") { dialog, _ ->
                    dialog.dismiss()
                    finish()
                }
                .setNeutralButton("Settings") { dialog, _ ->
                    dialog.dismiss()
                    openKeyboardSettings()
                }
                .setOnCancelListener {
                    finish()
                }
                .show()
                
        } catch (e: Exception) {
            e.printStackTrace()
            Toast.makeText(this, "Error loading keyboards", Toast.LENGTH_SHORT).show()
            openKeyboardSettings()
        }
    }
    
    private fun openKeyboardSettings() {
        try {
            val intent = Intent(Settings.ACTION_INPUT_METHOD_SETTINGS)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(this, "Could not open settings", Toast.LENGTH_SHORT).show()
        }
        finish()
    }
}
