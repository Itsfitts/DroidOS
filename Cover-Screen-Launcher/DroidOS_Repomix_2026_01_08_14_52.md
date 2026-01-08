This file is a merged representation of a subset of the codebase, containing files not matching ignore patterns, combined into a single document by Repomix.

# File Summary

## Purpose
This file contains a packed representation of a subset of the repository's contents that is considered the most important context.
It is designed to be easily consumable by AI systems for analysis, code review,
or other automated processes.

## File Format
The content is organized as follows:
1. This summary section
2. Repository information
3. Directory structure
4. Repository files (if enabled)
5. Multiple file entries, each consisting of:
  a. A header with the file path (## File: path/to/file)
  b. The full contents of the file in a code block

## Usage Guidelines
- This file should be treated as read-only. Any changes should be made to the
  original repository files, not this packed version.
- When processing this file, use the file path to distinguish
  between different files in the repository.
- Be aware that this file may contain sensitive information. Handle it with
  the same level of security as you would the original repository.

## Notes
- Some files may have been excluded based on .gitignore rules and Repomix's configuration
- Binary files are not included in this packed representation. Please refer to the Repository Structure section for a complete list of file paths, including binary files
- Files matching these patterns are excluded: **/.gradle/**, **/build/**, **/.idea/**, **/*.iml, **/local.properties, **/**logcat**, **/build_log.txt, **/*.png, **/*.webp, **/**dictionary.txt, **/*.jar, **/*.aar, **/captures/**, **/*Repomix*.md
- Files matching patterns in .gitignore are excluded
- Files matching default ignore patterns are excluded
- Files are sorted by Git change count (files with more changes are at the bottom)

# Directory Structure
```
app/
  src/
    main/
      aidl/
        com/
          example/
            quadrantlauncher/
              IShellService.aidl
              IShellService.aidl.minimize
      java/
        com/
          example/
            quadrantlauncher/
              AppPreferences.kt
              FloatingLauncherService.kt
              FloatingLauncherService.kt.displayoff
              FloatingLauncherService.kt.minimize
              IconPickerActivity.kt
              MainActivity.kt
              MenuActivity.kt
              PermissionActivity.kt
              QuadrantActivity.kt
              ShellUserService.kt
              ShellUserService.kt.displayoff
              ShellUserService.kt.minimize
              ShizukuBinder.java
              ShizukuHelper.kt
              SplitActivity.kt
              TriSplitActivity.kt
      res/
        drawable/
          bg_bubble.xml
          bg_drawer.xml
          bg_item_active.xml
          bg_item_press.xml
          ic_block.xml
          ic_box_outline.xml
          ic_cover_final_scale.xml
          ic_launcher_foreground_scaled.xml
          ic_lock_closed.xml
          ic_lock_open.xml
          ic_mode_dpi.xml
          ic_mode_profiles.xml
          ic_mode_resolution.xml
          ic_scaler_bubble.xml
          ic_scaler_cover_final.xml
          ic_scaler_cover_tiny.xml
          ic_star_border.xml
          ic_star_filled.xml
          ic_window_split.xml
          ic_wolf_cover.xml
          ic_wolf_main.xml
          scaler_bubble.xml
          scaler_cover.xml
          scaler_main.xml
        layout/
          activity_main.xml
          activity_menu.xml
          activity_permissions.xml
          activity_quadrant.xml
          activity_split.xml
          activity_tri_split.xml
          item_app_rofi.xml
          item_custom_resolution.xml
          item_dpi_custom.xml
          item_font_size.xml
          item_height_setting.xml
          item_icon_setting.xml
          item_layout_option.xml
          item_profile_rich.xml
          item_selected_app.xml
          item_width_setting.xml
          layout_bubble.xml
          layout_rofi_drawer.xml
          list_item_app.xml
        mipmap-anydpi-v26/
          ic_bubble_icon.xml
          ic_bubble.xml
          ic_cover_tiny.xml
          ic_cover_v2.xml
          ic_launcher_adaptive.xml
          ic_launcher_cover_final.xml
          ic_launcher_round.xml
          ic_launcher.xml
        values/
          colors.xml
          strings.xml
          themes.xml
        values-night/
          themes.xml
        xml/
          accessibility_service_config.xml
          backup_rules.xml
          data_extraction_rules.xml
      AndroidManifest.xml
  .gitignore
  build.gradle.kts
  proguard-rules.pro
gradle/
  wrapper/
    gradle-wrapper.properties
  libs.versions.toml
.gitignore
build.gradle.kts
gradle.properties
gradlew
gradlew.bat
multidex-keep.txt
README.md
settings.gradle.kts
```

# Files

## File: app/src/main/aidl/com/example/quadrantlauncher/IShellService.aidl
```
package com.example.quadrantlauncher;

interface IShellService {
    void forceStop(String packageName);
    void runCommand(String command);
    void setScreenOff(int displayIndex, boolean turnOff);
    void repositionTask(String packageName, String className, int left, int top, int right, int bottom);
    List<String> getVisiblePackages(int displayId);
    List<String> getWindowLayouts(int displayId);
    List<String> getAllRunningPackages();
    int getTaskId(String packageName, String className);
    void moveTaskToBack(int taskId);

    // Brightness Control
    void setSystemBrightness(int brightness);
    int getSystemBrightness();
    float getSystemBrightnessFloat();
    void setAutoBrightness(boolean enabled);
    boolean isAutoBrightness();
    
    // Legacy / Direct Hardware Control
    boolean setBrightnessViaDisplayManager(int displayId, float brightness);

    // NEW: Alternate Display Off Logic (Targeted)
    void setBrightness(int displayId, int value);
}
```

## File: app/src/main/aidl/com/example/quadrantlauncher/IShellService.aidl.minimize
```
package com.example.quadrantlauncher;

interface IShellService {
    void forceStop(String packageName);
    void runCommand(String command);
    void setScreenOff(int displayIndex, boolean turnOff);
    void repositionTask(String packageName, int left, int top, int right, int bottom);
    List<String> getVisiblePackages(int displayId);
    List<String> getWindowLayouts(int displayId);
    List<String> getAllRunningPackages();
    int getTaskId(String packageName);
    void moveTaskToBack(int taskId);
    void setSystemBrightness(int brightness);
    int getSystemBrightness();
    float getSystemBrightnessFloat();
    void setAutoBrightness(boolean enabled);
    boolean isAutoBrightness();
    boolean setBrightnessViaDisplayManager(int displayId, float brightness);
    void setBrightness(int value);
}
```

## File: app/src/main/java/com/example/quadrantlauncher/AppPreferences.kt
```kotlin
package com.example.quadrantlauncher

import android.content.Context

object AppPreferences {

    private const val PREFS_NAME = "AppLauncherPrefs"
    private const val KEY_FAVORITES = "KEY_FAVORITES"
    private const val KEY_LAST_LAYOUT = "KEY_LAST_LAYOUT"
    private const val KEY_LAST_CUSTOM_LAYOUT_NAME = "KEY_LAST_CUSTOM_LAYOUT_NAME"
    private const val KEY_PROFILES = "KEY_PROFILES"
    private const val KEY_CUSTOM_LAYOUTS = "KEY_CUSTOM_LAYOUTS"
    private const val KEY_FONT_SIZE = "KEY_FONT_SIZE"
    private const val KEY_ICON_URI = "KEY_ICON_URI"
    
    // Settings
    private const val KEY_KILL_ON_EXECUTE = "KEY_KILL_ON_EXECUTE"
    private const val KEY_TARGET_DISPLAY_INDEX = "KEY_TARGET_DISPLAY_INDEX"
    private const val KEY_IS_INSTANT_MODE = "KEY_IS_INSTANT_MODE"
    private const val KEY_LAST_QUEUE = "KEY_LAST_QUEUE"
    private const val KEY_SHOW_SHIZUKU_WARNING = "KEY_SHOW_SHIZUKU_WARNING"
    private const val KEY_REORDER_TIMEOUT = "KEY_REORDER_TIMEOUT"
    private const val KEY_USE_ALT_SCREEN_OFF = "KEY_USE_ALT_SCREEN_OFF" // New
    private const val KEY_AUTO_RESTART_TRACKPAD = "KEY_AUTO_RESTART_TRACKPAD"

    // === BLACKLIST STORAGE - START ===
    // Stores blacklisted apps using "packageName:activityName" format
    // This allows us to blacklist "com.google.android.googlequicksearchbox:.SearchActivity"
    // while keeping "com.google.android.googlequicksearchbox:robin.main.MainActivity" (Gemini) available
    private const val KEY_BLACKLIST = "KEY_BLACKLIST"
    // === BLACKLIST STORAGE - END ===

    // Reorder Methods
    private const val KEY_REORDER_METHOD_DRAG = "KEY_REORDER_METHOD_DRAG"
    private const val KEY_REORDER_METHOD_TAP = "KEY_REORDER_METHOD_TAP"
    private const val KEY_REORDER_METHOD_SCROLL = "KEY_REORDER_METHOD_SCROLL"
    
    // Drawer Geometry
    private const val KEY_DRAWER_HEIGHT = "KEY_DRAWER_HEIGHT"
    private const val KEY_DRAWER_WIDTH = "KEY_DRAWER_WIDTH"
    private const val KEY_AUTO_RESIZE_KEYBOARD = "KEY_AUTO_RESIZE_KEYBOARD"
    
    // Custom Resolutions
    private const val KEY_CUSTOM_RESOLUTION_NAMES = "KEY_CUSTOM_RESOLUTION_NAMES"

    private fun getPrefs(context: Context) =
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    fun savePackage(context: Context, key: String, packageName: String) {
        getPrefs(context).edit().putString(key, packageName).apply()
    }

    fun loadPackage(context: Context, key: String): String? {
        return getPrefs(context).getString(key, null)
    }

    fun getSimpleName(pkg: String?): String {
        if (pkg == null) return "Select App"
        val name = pkg.substringAfterLast('.')
        return if (name.isNotEmpty()) name else pkg
    }

    fun getFavorites(context: Context): MutableSet<String> {
        return getPrefs(context).getStringSet(KEY_FAVORITES, mutableSetOf()) ?: mutableSetOf()
    }

    fun isFavorite(context: Context, packageName: String): Boolean {
        return getFavorites(context).contains(packageName)
    }

    fun toggleFavorite(context: Context, packageName: String): Boolean {
        val favorites = getFavorites(context)
        val newSet = HashSet(favorites)
        val isAdded: Boolean
        if (newSet.contains(packageName)) {
            newSet.remove(packageName)
            isAdded = false
        } else {
            newSet.add(packageName)
            isAdded = true
        }
        getPrefs(context).edit().putStringSet(KEY_FAVORITES, newSet).apply()
        return isAdded
    }
    
    // --- GLOBAL LAYOUT PREFS ---
    fun saveLastLayout(context: Context, layoutId: Int) {
        getPrefs(context).edit().putInt(KEY_LAST_LAYOUT, layoutId).apply()
    }

    fun getLastLayout(context: Context): Int {
        return getPrefs(context).getInt(KEY_LAST_LAYOUT, 2)
    }
    
    fun saveLastCustomLayoutName(context: Context, name: String?) {
        getPrefs(context).edit().putString(KEY_LAST_CUSTOM_LAYOUT_NAME, name).apply()
    }

    fun getLastCustomLayoutName(context: Context): String? {
        return getPrefs(context).getString(KEY_LAST_CUSTOM_LAYOUT_NAME, null)
    }

    // --- PER-DISPLAY SETTINGS ---
    
    fun saveDisplayResolution(context: Context, displayId: Int, resIndex: Int) {
        getPrefs(context).edit().putInt("RES_D$displayId", resIndex).apply()
    }

    fun getDisplayResolution(context: Context, displayId: Int): Int {
        return getPrefs(context).getInt("RES_D$displayId", 0)
    }

    fun saveDisplayDpi(context: Context, displayId: Int, dpi: Int) {
        getPrefs(context).edit().putInt("DPI_D$displayId", dpi).apply()
    }

    fun getDisplayDpi(context: Context, displayId: Int): Int {
        return getPrefs(context).getInt("DPI_D$displayId", -1)
    }

    // --- PROFILES ---
    fun getProfileNames(context: Context): MutableSet<String> {
        return getPrefs(context).getStringSet(KEY_PROFILES, mutableSetOf()) ?: mutableSetOf()
    }

    fun saveProfile(context: Context, name: String, layout: Int, resIndex: Int, dpi: Int, apps: List<String>) {
        val names = getProfileNames(context)
        val newNames = HashSet(names)
        newNames.add(name)
        getPrefs(context).edit().putStringSet(KEY_PROFILES, newNames).apply()
        val appString = apps.joinToString(",")
        val data = "$layout|$resIndex|$dpi|$appString"
        getPrefs(context).edit().putString("PROFILE_$name", data).apply()
    }

    fun getProfileData(context: Context, name: String): String? {
        return getPrefs(context).getString("PROFILE_$name", null)
    }

    fun deleteProfile(context: Context, name: String) {
        val names = getProfileNames(context)
        val newNames = HashSet(names)
        newNames.remove(name)
        getPrefs(context).edit().putStringSet(KEY_PROFILES, newNames).remove("PROFILE_$name").apply()
    }

    fun renameProfile(context: Context, oldName: String, newName: String): Boolean {
        if (oldName == newName) return false
        if (newName.isEmpty()) return false
        val names = getProfileNames(context)
        if (!names.contains(oldName)) return false
        val data = getProfileData(context, oldName) ?: return false
        val newNames = HashSet(names)
        newNames.remove(oldName)
        newNames.add(newName)
        getPrefs(context).edit().putStringSet(KEY_PROFILES, newNames).apply()
        getPrefs(context).edit().putString("PROFILE_$newName", data).remove("PROFILE_$oldName").apply()
        return true
    }

    // --- CUSTOM LAYOUTS ---
    fun getCustomLayoutNames(context: Context): MutableSet<String> {
        return getPrefs(context).getStringSet(KEY_CUSTOM_LAYOUTS, mutableSetOf()) ?: mutableSetOf()
    }

    fun saveCustomLayout(context: Context, name: String, rectsData: String) {
        val names = getCustomLayoutNames(context)
        val newNames = HashSet(names)
        newNames.add(name)
        getPrefs(context).edit().putStringSet(KEY_CUSTOM_LAYOUTS, newNames).apply()
        getPrefs(context).edit().putString("LAYOUT_$name", rectsData).apply()
    }

    fun getCustomLayoutData(context: Context, name: String): String? {
        return getPrefs(context).getString("LAYOUT_$name", null)
    }
    
    fun deleteCustomLayout(context: Context, name: String) {
        val names = getCustomLayoutNames(context)
        val newNames = HashSet(names)
        newNames.remove(name)
        getPrefs(context).edit().putStringSet(KEY_CUSTOM_LAYOUTS, newNames).remove("LAYOUT_$name").apply()
    }
    
    fun renameCustomLayout(context: Context, oldName: String, newName: String): Boolean {
        if (oldName == newName) return false
        if (newName.isEmpty()) return false
        val names = getCustomLayoutNames(context)
        if (!names.contains(oldName)) return false
        val data = getCustomLayoutData(context, oldName) ?: return false
        val newNames = HashSet(names)
        newNames.remove(oldName)
        newNames.add(newName)
        getPrefs(context).edit().putStringSet(KEY_CUSTOM_LAYOUTS, newNames).apply()
        getPrefs(context).edit().putString("LAYOUT_$newName", data).remove("LAYOUT_$oldName").apply()
        return true
    }
    
    // --- CUSTOM RESOLUTIONS ---
    fun getCustomResolutionNames(context: Context): MutableSet<String> {
        return getPrefs(context).getStringSet(KEY_CUSTOM_RESOLUTION_NAMES, mutableSetOf()) ?: mutableSetOf()
    }

    fun saveCustomResolution(context: Context, name: String, value: String) {
        val names = getCustomResolutionNames(context)
        val newNames = HashSet(names)
        newNames.add(name)
        getPrefs(context).edit().putStringSet(KEY_CUSTOM_RESOLUTION_NAMES, newNames).apply()
        getPrefs(context).edit().putString("RES_$name", value).apply()
    }
    
    fun getCustomResolutionValue(context: Context, name: String): String? {
        return getPrefs(context).getString("RES_$name", null)
    }

    fun deleteCustomResolution(context: Context, name: String) {
        val names = getCustomResolutionNames(context)
        val newNames = HashSet(names)
        newNames.remove(name)
        getPrefs(context).edit().putStringSet(KEY_CUSTOM_RESOLUTION_NAMES, newNames).remove("RES_$name").apply()
    }
    
    fun renameCustomResolution(context: Context, oldName: String, newName: String): Boolean {
        if (oldName == newName) return false
        if (newName.isEmpty()) return false
        val names = getCustomResolutionNames(context)
        if (!names.contains(oldName)) return false
        val data = getCustomResolutionValue(context, oldName) ?: return false
        val newNames = HashSet(names)
        newNames.remove(oldName)
        newNames.add(newName)
        getPrefs(context).edit().putStringSet(KEY_CUSTOM_RESOLUTION_NAMES, newNames).apply()
        getPrefs(context).edit().putString("RES_$newName", data).remove("RES_$oldName").apply()
        return true
    }

    // --- FONT SIZE & ICONS & DRAWER ---
    fun saveFontSize(context: Context, size: Float) {
        getPrefs(context).edit().putFloat(KEY_FONT_SIZE, size).apply()
    }

    fun getFontSize(context: Context): Float {
        return getPrefs(context).getFloat(KEY_FONT_SIZE, 16f)
    }

    fun saveIconUri(context: Context, uri: String) {
        getPrefs(context).edit().putString(KEY_ICON_URI, uri).apply()
    }

    fun getIconUri(context: Context): String? {
        return getPrefs(context).getString(KEY_ICON_URI, null)
    }
    
    fun setDrawerHeightPercent(context: Context, percent: Int) {
        getPrefs(context).edit().putInt(KEY_DRAWER_HEIGHT, percent).apply()
    }
    
    fun getDrawerHeightPercent(context: Context): Int {
        return getPrefs(context).getInt(KEY_DRAWER_HEIGHT, 70)
    }
    
    fun setDrawerWidthPercent(context: Context, percent: Int) {
        getPrefs(context).edit().putInt(KEY_DRAWER_WIDTH, percent).apply()
    }
    
    fun getDrawerWidthPercent(context: Context): Int {
        return getPrefs(context).getInt(KEY_DRAWER_WIDTH, 90)
    }
    
    fun setAutoResizeKeyboard(context: Context, enable: Boolean) {
        getPrefs(context).edit().putBoolean(KEY_AUTO_RESIZE_KEYBOARD, enable).apply()
    }
    
    fun getAutoResizeKeyboard(context: Context): Boolean {
        return getPrefs(context).getBoolean(KEY_AUTO_RESIZE_KEYBOARD, true)
    }

    // --- SETTINGS ---
    fun setKillOnExecute(context: Context, kill: Boolean) {
        getPrefs(context).edit().putBoolean(KEY_KILL_ON_EXECUTE, kill).apply()
    }

    fun getKillOnExecute(context: Context): Boolean {
        // Default is FALSE for Kill On Execute
        return getPrefs(context).getBoolean(KEY_KILL_ON_EXECUTE, false)
    }

    fun setAutoRestartTrackpad(context: Context, enable: Boolean) {
        getPrefs(context).edit().putBoolean(KEY_AUTO_RESTART_TRACKPAD, enable).apply()
    }

    fun getAutoRestartTrackpad(context: Context): Boolean {
        return getPrefs(context).getBoolean(KEY_AUTO_RESTART_TRACKPAD, false) // Default Off
    }

    fun setTargetDisplayIndex(context: Context, index: Int) {
        getPrefs(context).edit().putInt(KEY_TARGET_DISPLAY_INDEX, index).apply()
    }

    fun getTargetDisplayIndex(context: Context): Int {
        return getPrefs(context).getInt(KEY_TARGET_DISPLAY_INDEX, 1)
    }

    fun setInstantMode(context: Context, enable: Boolean) {
        getPrefs(context).edit().putBoolean(KEY_IS_INSTANT_MODE, enable).apply()
    }

    fun getInstantMode(context: Context): Boolean {
        // Default is TRUE for Instant Mode
        return getPrefs(context).getBoolean(KEY_IS_INSTANT_MODE, true)
    }
    
    fun saveLastQueue(context: Context, apps: List<String>) {
        val str = apps.joinToString(",")
        getPrefs(context).edit().putString(KEY_LAST_QUEUE, str).apply()
    }
    
    fun getLastQueue(context: Context): List<String> {
        val str = getPrefs(context).getString(KEY_LAST_QUEUE, "") ?: ""
        if (str.isEmpty()) return emptyList()
        return str.split(",").filter { it.isNotEmpty() }
    }
    
    fun setShowShizukuWarning(context: Context, enable: Boolean) {
        getPrefs(context).edit().putBoolean(KEY_SHOW_SHIZUKU_WARNING, enable).apply()
    }

    fun getShowShizukuWarning(context: Context): Boolean {
        return getPrefs(context).getBoolean(KEY_SHOW_SHIZUKU_WARNING, true)
    }
    
    fun setUseAltScreenOff(context: Context, enable: Boolean) {
        getPrefs(context).edit().putBoolean(KEY_USE_ALT_SCREEN_OFF, enable).apply()
    }

    fun getUseAltScreenOff(context: Context): Boolean {
        // Default false (use standard SurfaceControl method)
        return getPrefs(context).getBoolean(KEY_USE_ALT_SCREEN_OFF, false)
    }
    
    // --- REORDER PREFERENCES ---
    fun setReorderTimeout(context: Context, seconds: Int) {
        getPrefs(context).edit().putInt(KEY_REORDER_TIMEOUT, seconds).apply()
    }
    
    fun getReorderTimeout(context: Context): Int {
        return getPrefs(context).getInt(KEY_REORDER_TIMEOUT, 2) // Default 2 seconds
    }
    
    fun setReorderDrag(context: Context, enable: Boolean) {
        getPrefs(context).edit().putBoolean(KEY_REORDER_METHOD_DRAG, enable).apply()
    }
    
    fun getReorderDrag(context: Context): Boolean {
        // CHANGED: Default to FALSE so Tap works out of box
        return getPrefs(context).getBoolean(KEY_REORDER_METHOD_DRAG, false)
    }
    
    fun setReorderTap(context: Context, enable: Boolean) {
        getPrefs(context).edit().putBoolean(KEY_REORDER_METHOD_TAP, enable).apply()
    }
    
    fun getReorderTap(context: Context): Boolean {
        return getPrefs(context).getBoolean(KEY_REORDER_METHOD_TAP, true) // Default Enabled
    }
    
    fun setReorderScroll(context: Context, enable: Boolean) {
        getPrefs(context).edit().putBoolean(KEY_REORDER_METHOD_SCROLL, enable).apply()
    }
    
    fun getReorderScroll(context: Context): Boolean {
        return getPrefs(context).getBoolean(KEY_REORDER_METHOD_SCROLL, true) // Default Enabled
    }

    // === BLACKLIST METHODS - START ===
    fun getBlacklist(context: Context): Set<String> {
        return getPrefs(context).getStringSet(KEY_BLACKLIST, emptySet()) ?: emptySet()
    }

    fun isBlacklisted(context: Context, identifier: String): Boolean {
        return getBlacklist(context).contains(identifier)
    }

    fun addToBlacklist(context: Context, identifier: String) {
        val current = getBlacklist(context).toMutableSet()
        current.add(identifier)
        getPrefs(context).edit().putStringSet(KEY_BLACKLIST, current).apply()
    }

    fun removeFromBlacklist(context: Context, identifier: String) {
        val current = getBlacklist(context).toMutableSet()
        current.remove(identifier)
        getPrefs(context).edit().putStringSet(KEY_BLACKLIST, current).apply()
    }

    fun toggleBlacklist(context: Context, identifier: String): Boolean {
        return if (isBlacklisted(context, identifier)) {
            removeFromBlacklist(context, identifier)
            false
        } else {
            addToBlacklist(context, identifier)
            true
        }
    }
    // === BLACKLIST METHODS - END ===
}
```

## File: app/src/main/java/com/example/quadrantlauncher/FloatingLauncherService.kt
```kotlin
package com.example.quadrantlauncher

import android.accessibilityservice.AccessibilityService
import android.app.ActivityManager
import android.app.Service
import android.view.accessibility.AccessibilityEvent
import android.content.BroadcastReceiver
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.ServiceConnection
import android.content.pm.PackageManager
import android.graphics.BitmapFactory
import android.graphics.PixelFormat
import android.graphics.Rect
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.net.Uri
import android.hardware.display.DisplayManager
import android.media.ImageReader
import android.os.Build
import android.os.Handler
import android.os.IBinder
import android.os.Looper
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.util.DisplayMetrics
import android.util.Log
import android.view.*
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import android.widget.TextView
import androidx.core.app.NotificationCompat
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import rikka.shizuku.Shizuku
import java.text.SimpleDateFormat
import java.util.*
import java.lang.reflect.Method
import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.hypot
import kotlin.math.min

class FloatingLauncherService : AccessibilityService() {

    private var virtualDisplay: android.hardware.display.VirtualDisplay? = null
    private var virtualImageReader: ImageReader? = null // Keeps surface alive
    private val ACTION_TOGGLE_VIRTUAL = "com.katsuyamaki.DroidOSLauncher.TOGGLE_VIRTUAL_DISPLAY"

    // === RECEIVER - START ===
    private val launcherReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            when (intent?.action) {
                "com.katsuyamaki.DroidOSTrackpadKeyboard.MOVE_TO_DISPLAY" -> {
                    val targetId = intent.getIntExtra("displayId", 0)
                    Log.d(TAG, "Launcher moving to Display: $targetId")
                    uiHandler.post {
                        currentDisplayId = targetId
                        // Re-initialize window on new display
                        if (windowManager != null && bubbleView != null) {
                            try { windowManager.removeView(bubbleView) } catch(e: Exception) {}
                        }
                        initWindow()
                    }
                }
            }
        }
    }
    // === RECEIVER - END ===

    private val TAG = "FloatingLauncherService"

    companion object {
        // === MODE CONSTANTS - START ===
        // Defines the different drawer modes/tabs
        const val MODE_SEARCH = 0      // App picker tab
        const val MODE_LAYOUTS = 2     // Layout selection (skips 1)
        const val MODE_RESOLUTION = 3  // Resolution settings
        const val MODE_DPI = 4         // DPI settings
        const val MODE_BLACKLIST = 5   // Blacklist management tab
        const val MODE_PROFILES = 6    // Profiles tab
        const val MODE_SETTINGS = 7    // Settings tab
        // === MODE CONSTANTS - END ===
        
        const val LAYOUT_FULL = 1
        const val LAYOUT_SIDE_BY_SIDE = 2
        const val LAYOUT_TOP_BOTTOM = 5
        const val LAYOUT_TRI_EVEN = 3
        const val LAYOUT_CORNERS = 4
        const val LAYOUT_TRI_SIDE_MAIN_SIDE = 6
        const val LAYOUT_QUAD_ROW_EVEN = 7
        const val LAYOUT_CUSTOM_DYNAMIC = 99

        const val CHANNEL_ID = "OverlayServiceChannel"
        const val TAG = "FloatingService"
        const val DEBUG_TAG = "DROIDOS_DEBUG"
        const val ACTION_OPEN_DRAWER = "com.katsuyamaki.DroidOSLauncher.OPEN_DRAWER"
        const val ACTION_UPDATE_ICON = "com.katsuyamaki.DroidOSLauncher.UPDATE_ICON"
        const val ACTION_CYCLE_DISPLAY = "com.katsuyamaki.DroidOSLauncher.CYCLE_DISPLAY"
        const val HIGHLIGHT_COLOR = 0xFF00A0E9.toInt()
    }

    private lateinit var windowManager: WindowManager
    // Track the specific WM used to add the bubble to ensure we can remove it later
    private var attachedWindowManager: WindowManager? = null 
    private var displayManager: DisplayManager? = null
    
    private var displayContext: Context? = null
    private var currentDisplayId = 0
    private var lastPhysicalDisplayId = Display.DEFAULT_DISPLAY 
    
    // Debounce for display switch to prevent flickering
    private var lastManualSwitchTime = 0L
    private var switchRunnable: Runnable? = null

    // === EXECUTION DEBOUNCE - START ===
    // Prevents multiple rapid executions
    private var lastExecuteTime = 0L
    private val EXECUTE_DEBOUNCE_MS = 2000L  // 2 second minimum between executions
    // === EXECUTION DEBOUNCE - END ===

    private val displayListener = object : DisplayManager.DisplayListener {
        override fun onDisplayAdded(displayId: Int) {}
        override fun onDisplayRemoved(displayId: Int) {
            if (displayId == currentDisplayId) {
                // If current display disconnects (e.g. glasses), revert to Default
                performDisplayChange(Display.DEFAULT_DISPLAY)
            }
        }
        override fun onDisplayChanged(displayId: Int) {
            // Logic to detect Fold/Unfold events monitoring Display 0 (Main)
            if (displayId == 0) {
                val display = displayManager?.getDisplay(0)
                // Only auto-switch if user hasn't manually switched recently
                val isDebounced = (System.currentTimeMillis() - lastManualSwitchTime > 2000)
                
                if (display != null && isDebounced) {
                    // Cancel any pending switch to prevent double-execution
                    if (switchRunnable != null) {
                        uiHandler.removeCallbacks(switchRunnable!!)
                    }

                    // CASE A: Phone Opened (Display 0 turned ON) -> Move to Main
                    if (display.state == Display.STATE_ON && currentDisplayId != 0) {
                        switchRunnable = Runnable { 
                            try { performDisplayChange(0) } catch(e: Exception) {} 
                        }
                        uiHandler.postDelayed(switchRunnable!!, 500)
                    } 
                    // CASE B: Phone Closed (Display 0 turned OFF/DOZE) -> Move to Cover (1)
                    else if (display.state != Display.STATE_ON && currentDisplayId == 0) {
                        switchRunnable = Runnable {
                            try { 
                                val d0 = displayManager?.getDisplay(0)
                                if (d0?.state != Display.STATE_ON) { 
                                    performDisplayChange(1) 
                                }
                            } catch(e: Exception) {}
                        }
                        uiHandler.postDelayed(switchRunnable!!, 500)
                    }
                }
            }
        }
    }

    private var bubbleView: View? = null
    private var drawerView: View? = null
    private var debugStatusView: TextView? = null
    
    private lateinit var bubbleParams: WindowManager.LayoutParams
    private lateinit var drawerParams: WindowManager.LayoutParams

    private var isExpanded = false
    private val selectedAppsQueue = mutableListOf<MainActivity.AppInfo>()
    private val allAppsList = mutableListOf<MainActivity.AppInfo>()
    private val displayList = mutableListOf<Any>()
    
    private var activeProfileName: String? = null
    private var currentMode = MODE_SEARCH
    private var selectedLayoutType = 2
    private var selectedResolutionIndex = 0
    private var currentDpiSetting = -1
    private var currentFontSize = 16f
    
    private var activeCustomRects: List<Rect>? = null
    private var activeCustomLayoutName: String? = null
    
    private var killAppOnExecute = true
    private var autoRestartTrackpad = false // NEW VARIABLE
    private var targetDisplayIndex = 1 
    private var isScreenOffState = false
    private var isInstantMode = true 
    private var showShizukuWarning = true 
    private var useAltScreenOff = false
    
    private var isVirtualDisplayActive = false
    private var currentDrawerHeightPercent = 70
    private var currentDrawerWidthPercent = 90
    private var autoResizeEnabled = true
    
    private var reorderSelectionIndex = -1
    private var isReorderDragEnabled = true
    private var isReorderTapEnabled = true
    
    private val PACKAGE_BLANK = "internal.blank.spacer"
    private val PACKAGE_TRACKPAD = "com.katsuyamaki.DroidOSTrackpadKeyboard"
    
    private var shellService: IShellService? = null
    private var isBound = false
    lateinit var uiHandler: Handler // Declare uiHandler here
    override fun onCreate() {
        super.onCreate()
        
        // Register ADB Receiver
        val filter = IntentFilter().apply {
            addAction("com.katsuyamaki.DroidOSTrackpadKeyboard.MOVE_TO_DISPLAY")
        }
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(launcherReceiver, filter, Context.RECEIVER_EXPORTED)
        } else {
            registerReceiver(launcherReceiver, filter)
        }

        uiHandler = Handler(Looper.getMainLooper())
    }

    private val shizukuBinderListener = Shizuku.OnBinderReceivedListener { if (Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED) bindShizuku() }
    private val shizukuPermissionListener = Shizuku.OnRequestPermissionResultListener { _, grantResult -> if (grantResult == PackageManager.PERMISSION_GRANTED) bindShizuku() }

    private val commandReceiver = object : BroadcastReceiver() {        override fun onReceive(context: Context?, intent: Intent?) {
            val action = intent?.action
            if (action == ACTION_OPEN_DRAWER) { 
                if (isScreenOffState) wakeUp() else if (!isExpanded) toggleDrawer() 
            } 
            else if (action == ACTION_UPDATE_ICON) { 
                updateBubbleIcon()
                if (currentMode == MODE_SETTINGS) switchMode(MODE_SETTINGS) 
            }
            else if (action == ACTION_CYCLE_DISPLAY) {
                switchDisplay()
            }
            else if (action == Intent.ACTION_SCREEN_ON) {
                if (isScreenOffState) {
                    wakeUp()
                }
            } else if (action == ACTION_TOGGLE_VIRTUAL) {
                toggleVirtualDisplay()
            }
        }
    }
    // === SWIPE CALLBACK - START ===
    // Handles swipe gestures for various modes including blacklist
    private val swipeCallback = object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) {
        override fun getMovementFlags(r: RecyclerView, v: RecyclerView.ViewHolder): Int {
            val pos = v.adapterPosition; if (pos == RecyclerView.NO_POSITION || pos >= displayList.size) return 0
            val item = displayList[pos]
            val isSwipeable = when (currentMode) {
                MODE_LAYOUTS -> (item is LayoutOption && item.type == LAYOUT_CUSTOM_DYNAMIC && item.isCustomSaved)
                MODE_RESOLUTION -> (item is ResolutionOption && item.index >= 100)
                MODE_PROFILES -> (item is ProfileOption && !item.isCurrent)
                MODE_SEARCH -> true
                MODE_BLACKLIST -> true
                else -> false
            }
            return if (isSwipeable) makeMovementFlags(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) else 0
        }
        override fun onMove(r: RecyclerView, v: RecyclerView.ViewHolder, t: RecyclerView.ViewHolder): Boolean = false
        override fun onSwiped(v: RecyclerView.ViewHolder, direction: Int) {
            val pos = v.adapterPosition; if (pos == RecyclerView.NO_POSITION) return
            dismissKeyboardAndRestore()
            if (currentMode == MODE_PROFILES) { val item = displayList.getOrNull(pos) as? ProfileOption ?: return; AppPreferences.deleteProfile(this@FloatingLauncherService, item.name); safeToast("Deleted ${item.name}"); switchMode(MODE_PROFILES); return }
            if (currentMode == MODE_LAYOUTS) { val item = displayList.getOrNull(pos) as? LayoutOption ?: return; AppPreferences.deleteCustomLayout(this@FloatingLauncherService, item.name); safeToast("Deleted ${item.name}"); switchMode(MODE_LAYOUTS); return }
            if (currentMode == MODE_RESOLUTION) { val item = displayList.getOrNull(pos) as? ResolutionOption ?: return; AppPreferences.deleteCustomResolution(this@FloatingLauncherService, item.name); safeToast("Deleted ${item.name}"); switchMode(MODE_RESOLUTION); return }
            if (currentMode == MODE_SEARCH) {
                val item = displayList.getOrNull(pos) as? MainActivity.AppInfo ?: return
                if (item.packageName == PACKAGE_BLANK) { (drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view).adapter as RofiAdapter).notifyItemChanged(pos); return }
                // Left swipe = blacklist app
                if (direction == ItemTouchHelper.LEFT) {
                    val identifier = item.getIdentifier()
                    AppPreferences.addToBlacklist(this@FloatingLauncherService, identifier)
                    safeToast("${item.label} blacklisted")
                    loadInstalledApps()
                    refreshSearchList()
                }
                // Right swipe = toggle favorite (legacy behavior)
                else if (direction == ItemTouchHelper.RIGHT) {
                    toggleFavorite(item)
                    refreshSearchList()
                }
            }
            if (currentMode == MODE_BLACKLIST) {
                val item = displayList.getOrNull(pos) as? MainActivity.AppInfo ?: return
                // Left swipe = remove from blacklist
                if (direction == ItemTouchHelper.LEFT) {
                    val identifier = item.getIdentifier()
                    AppPreferences.removeFromBlacklist(this@FloatingLauncherService, identifier)
                    safeToast("${item.label} removed from blacklist")
                    loadInstalledApps()
                    loadBlacklistedApps()
                }
            }
        }
    }
    // === SWIPE CALLBACK - END ===

    private val selectedAppsDragCallback = object : ItemTouchHelper.SimpleCallback(ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT, ItemTouchHelper.UP or ItemTouchHelper.DOWN) {
        override fun isLongPressDragEnabled(): Boolean = isReorderDragEnabled
        override fun onMove(r: RecyclerView, v: RecyclerView.ViewHolder, t: RecyclerView.ViewHolder): Boolean { Collections.swap(selectedAppsQueue, v.adapterPosition, t.adapterPosition); r.adapter?.notifyItemMoved(v.adapterPosition, t.adapterPosition); return true }
        override fun onSwiped(v: RecyclerView.ViewHolder, direction: Int) { dismissKeyboardAndRestore(); val pos = v.adapterPosition; if (pos != RecyclerView.NO_POSITION) { val app = selectedAppsQueue[pos]; if (app.packageName != PACKAGE_BLANK) { Thread { try { shellService?.forceStop(app.packageName) } catch(e: Exception) {} }.start(); safeToast("Killed ${app.label}") }; selectedAppsQueue.removeAt(pos); if (reorderSelectionIndex != -1) endReorderMode(false); updateSelectedAppsDock(); drawerView?.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged(); if (isInstantMode) applyLayoutImmediate() } }
        override fun clearView(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder) { super.clearView(recyclerView, viewHolder); val pkgs = selectedAppsQueue.map { it.packageName }; AppPreferences.saveLastQueue(this@FloatingLauncherService, pkgs); if (isInstantMode) applyLayoutImmediate() }
    }

    // === SWIPE DETECTOR - START ===
    // Detects horizontal swipe gestures for blacklist/favorite actions
    // Left swipe = blacklist, Long press = favorite
    private inner class SwipeDetector : GestureDetector.SimpleOnGestureListener() {
        private val SWIPE_THRESHOLD = 100
        private val SWIPE_VELOCITY_THRESHOLD = 100

        override fun onFling(
            e1: MotionEvent?,
            e2: MotionEvent,
            velocityX: Float,
            velocityY: Float
        ): Boolean {
            if (e1 == null) return false

            val diffX = e2.x - e1.x
            val diffY = e2.y - e1.y

            if (Math.abs(diffX) > Math.abs(diffY)) {
                if (Math.abs(diffX) > SWIPE_THRESHOLD && Math.abs(velocityX) > SWIPE_VELOCITY_THRESHOLD) {
                    if (diffX < 0) {
                        return true // Left swipe detected
                    }
                }
            }
            return false
        }
    }
    // === SWIPE DETECTOR - END ===

    private val userServiceConnection = object : ServiceConnection {
        override fun onServiceConnected(name: ComponentName?, binder: IBinder?) {
            shellService = IShellService.Stub.asInterface(binder)
            isBound = true
            updateExecuteButtonColor(true)
            updateBubbleIcon()
            safeToast("Shizuku Connected")

            // NEW: Auto-Restart Trackpad if enabled
            if (autoRestartTrackpad) {
                uiHandler.postDelayed({ restartTrackpad() }, 1000) // Delay to ensure stability
            }
        }
        override fun onServiceDisconnected(name: ComponentName?) { shellService = null; isBound = false; updateExecuteButtonColor(false); updateBubbleIcon() }
    }


    private fun restartTrackpad() {
        safeToast("Restarting Trackpad...")
        Thread {
            try {
                // Target Component for Accessibility Service
                val targetComponent = "com.katsuyamaki.DroidOSTrackpadKeyboard/com.example.coverscreentester.OverlayService"
                
                // 1. Kill the App (Hard Reset for Z-Order)
                shellService?.runCommand("am force-stop com.katsuyamaki.DroidOSTrackpadKeyboard")
                shellService?.runCommand("am force-stop com.example.coverscreentester") // Legacy cleanup
                
                Thread.sleep(1200) // Wait for system to clear window tokens


                // 2. RESTORE PERMISSIONS (System disables services on force-stop)
                // [FIX] Read using Android API because runCommand returns Unit (void)
                val currentServices = android.provider.Settings.Secure.getString(
                    contentResolver, 
                    android.provider.Settings.Secure.ENABLED_ACCESSIBILITY_SERVICES
                ) ?: ""
                
                if (!currentServices.contains("OverlayService")) {
                    Log.d(TAG, "Service was disabled by system. Re-enabling...")
                    
                    val newServices = if (currentServices.isEmpty()) {
                        targetComponent
                    } else {
                        "$currentServices:$targetComponent"
                    }

                    
                    // Inject updated list back to Settings
                    shellService?.runCommand("settings put secure enabled_accessibility_services $newServices")
                    shellService?.runCommand("settings put secure accessibility_enabled 1")
                }
                

                // 3. Launch with "Force Start" flag
                uiHandler.post {
                    // We manually construct the launch intent to add the extra
                    val launchIntent = packageManager.getLaunchIntentForPackage("com.katsuyamaki.DroidOSTrackpadKeyboard")
                        ?: packageManager.getLaunchIntentForPackage("com.example.coverscreentester")
                        
                    if (launchIntent != null) {
                        launchIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
                        launchIntent.putExtra("force_start", true) // Signal to skip permissions page
                        startActivity(launchIntent)
                        safeToast("Launching Trackpad...")
                    } else {
                        launchTrackpad() // Fallback
                    }
                }

            } catch (e: Exception) {
                Log.e(TAG, "Restart Sequence Failed", e)
                uiHandler.post { launchTrackpad() }
            }
        }.start()
    }


    private fun launchShizuku() { try { val intent = packageManager.getLaunchIntentForPackage("moe.shizuku.privileged.api"); if (intent != null) { intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); startActivity(intent) } else { safeToast("Shizuku app not found") } } catch(e: Exception) { safeToast("Failed to launch Shizuku") } }

    // AccessibilityService required overrides
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {}
    override fun onInterrupt() {}

    // AccessibilityService entry point - called when user enables service in Settings
    override fun onServiceConnected() {
        super.onServiceConnected()
        Log.d(TAG, "Accessibility Service Connected")

        // Initialize WindowManager
        windowManager = getSystemService(WINDOW_SERVICE) as WindowManager
        displayManager = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager
        displayManager?.registerDisplayListener(displayListener, uiHandler)

        // Register receivers
        val filter = IntentFilter().apply {
            addAction(ACTION_OPEN_DRAWER)
            addAction(ACTION_UPDATE_ICON)
            addAction(ACTION_CYCLE_DISPLAY)
            addAction(Intent.ACTION_SCREEN_ON)
            addAction(Intent.ACTION_SCREEN_OFF)
        }
        if (Build.VERSION.SDK_INT >= 33) registerReceiver(commandReceiver, filter, Context.RECEIVER_EXPORTED) else registerReceiver(commandReceiver, filter)

        // Shizuku setup
        try { Shizuku.addBinderReceivedListener(shizukuBinderListener); Shizuku.addRequestPermissionResultListener(shizukuPermissionListener) } catch (e: Exception) {}
        try { if (rikka.shizuku.Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED) bindShizuku() } catch (e: Exception) {}

        // Load preferences
        loadInstalledApps(); currentFontSize = AppPreferences.getFontSize(this)
        killAppOnExecute = AppPreferences.getKillOnExecute(this); targetDisplayIndex = AppPreferences.getTargetDisplayIndex(this)
        autoRestartTrackpad = AppPreferences.getAutoRestartTrackpad(this) // NEW LOAD
        isInstantMode = AppPreferences.getInstantMode(this); showShizukuWarning = AppPreferences.getShowShizukuWarning(this)
        useAltScreenOff = AppPreferences.getUseAltScreenOff(this); isReorderDragEnabled = AppPreferences.getReorderDrag(this)
        isReorderTapEnabled = AppPreferences.getReorderTap(this); currentDrawerHeightPercent = AppPreferences.getDrawerHeightPercent(this)
        currentDrawerWidthPercent = AppPreferences.getDrawerWidthPercent(this); autoResizeEnabled = AppPreferences.getAutoResizeKeyboard(this)

        // Build UI
        val targetDisplayId = targetDisplayIndex
        setupDisplayContext(targetDisplayId)
        setupBubble()
        setupDrawer()
        selectedLayoutType = AppPreferences.getLastLayout(this)
        activeCustomLayoutName = AppPreferences.getLastCustomLayoutName(this)
        if (selectedLayoutType == LAYOUT_CUSTOM_DYNAMIC && activeCustomLayoutName != null) {
            val data = AppPreferences.getCustomLayoutData(this, activeCustomLayoutName!!)
            if (data != null) {
                val rects = mutableListOf<Rect>()
                val rectParts = data.split("|")
                for (rp in rectParts) {
                    val coords = rp.split(",")
                    if (coords.size == 4) rects.add(Rect(coords[0].toInt(), coords[1].toInt(), coords[2].toInt(), coords[3].toInt()))
                }
                activeCustomRects = rects
            }
        }
        updateGlobalFontSize()
        updateBubbleIcon()
        loadDisplaySettings(currentDisplayId)

        safeToast("Launcher Ready")
    }

    /* * FUNCTION: onStartCommand
     * SUMMARY: Updated to strictly handle display migration. If an ID is passed,
     * it forces the bubble to move to that display context immediately.
     */
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Priority: 1. Explicit ID from Intent (Triggered by Icon Click) 2. Last saved Physical ID
        val targetDisplayId = intent?.getIntExtra("DISPLAY_ID", currentDisplayId) ?: currentDisplayId

        Log.d(TAG, "onStartCommand: Target Display $targetDisplayId (Current: $currentDisplayId)")

        if (bubbleView != null) {
            // If we are already running but the target display changed, move the bubble
            if (targetDisplayId != currentDisplayId) {
                try {
                    windowManager.removeView(bubbleView)
                    if (isExpanded) windowManager.removeView(drawerView)
                } catch (e: Exception) {
                    Log.e(TAG, "Error removing views for migration", e)
                }
                setupDisplayContext(targetDisplayId)
                setupBubble()
                setupDrawer()
                updateBubbleIcon()
                loadDisplaySettings(currentDisplayId)
                isExpanded = false
                safeToast("Recalled to Display $targetDisplayId")
            }
        } else {
            // First time initialization
            try {
                setupDisplayContext(targetDisplayId)
                setupBubble()
                setupDrawer()
                selectedLayoutType = AppPreferences.getLastLayout(this)
                activeCustomLayoutName = AppPreferences.getLastCustomLayoutName(this)
                updateGlobalFontSize()
                updateBubbleIcon()
                loadDisplaySettings(currentDisplayId)

                if (selectedLayoutType == LAYOUT_CUSTOM_DYNAMIC && activeCustomLayoutName != null) {
                    val data = AppPreferences.getCustomLayoutData(this, activeCustomLayoutName!!)
                    if (data != null) {
                        val rects = mutableListOf<Rect>()
                        val rectParts = data.split("|")
                        for (rp in rectParts) {
                            val coords = rp.split(",")
                            if (coords.size == 4) rects.add(Rect(coords[0].toInt(), coords[1].toInt(), coords[2].toInt(), coords[3].toInt()))
                        }
                        activeCustomRects = rects
                    }
                }

                if (rikka.shizuku.Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED) bindShizuku()
            } catch (e: Exception) {
                Log.e(TAG, "Setup failed", e)
                stopSelf()
            }
        }
        return START_NOT_STICKY
    }
    
    private fun loadDisplaySettings(displayId: Int) { selectedResolutionIndex = AppPreferences.getDisplayResolution(this, displayId); currentDpiSetting = AppPreferences.getDisplayDpi(this, displayId) }

    override fun onDestroy() {
        super.onDestroy()
        try { unregisterReceiver(launcherReceiver) } catch(e: Exception) {}
        isScreenOffState = false
        wakeUp()
        try { Shizuku.removeBinderReceivedListener(shizukuBinderListener); Shizuku.removeRequestPermissionResultListener(shizukuPermissionListener); unregisterReceiver(commandReceiver) } catch (e: Exception) {}
        
        // Robust cleanup using attached manager
        try { 
            if (bubbleView != null) {
                val wm = attachedWindowManager ?: windowManager
                wm.removeView(bubbleView) 
            }
        } catch (e: Exception) {}
        
        try { 
            if (isExpanded) windowManager.removeView(drawerView) 
        } catch (e: Exception) {}

        if (isBound) { try { ShizukuBinder.unbind(ComponentName(packageName, ShellUserService::class.java.name), userServiceConnection); isBound = false } catch (e: Exception) {} }
    }
    
    // === SAFE TOAST FUNCTION - START ===
    // Displays toast message and updates debug status view
    private fun safeToast(msg: String) { 
        uiHandler.post { 
            try { Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show() } catch(e: Exception) { }
            if (debugStatusView != null) debugStatusView?.text = msg 
        }
    }
    // === SAFE TOAST FUNCTION - END ===

    // === DEBUG APP IDENTIFICATION - START ===
    // Visual debug function to show package/activity when apps are opened/modified/identified
    // This displays in the bright green text area above the app queue in the launcher drawer
    private fun debugShowAppIdentification(action: String, pkg: String, className: String?) {
        val basePkg = if (pkg.contains(":")) pkg.substringBefore(":") else pkg
        val suffix = if (pkg.contains(":")) pkg.substringAfter(":") else null
        
        // Get short class name for display
        val shortCls = when {
            className.isNullOrEmpty() -> "NO_CLASS"
            className == "null" -> "NO_CLASS"
            else -> className.substringAfterLast(".")
        }
        
        val debugText = buildString {
            append("[$action] ")
            append("pkg=${basePkg.substringAfterLast(".")}")  // Show only last part of package
            if (suffix != null) append(":$suffix")
            append(" cls=$shortCls")
        }
        
        uiHandler.post {
            debugStatusView?.text = debugText
            // Also log full details
            Log.d(DEBUG_TAG, "[$action] FULL: pkg=$pkg cls=$className")
        }
    }
    // === DEBUG APP IDENTIFICATION - END ===
    
    private fun vibrate() {
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                val vibratorManager = getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as VibratorManager
                val vibrator = vibratorManager.defaultVibrator
                vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE))
            } else {
                val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibrator.vibrate(50)
            }
        } catch (e: Exception) {}
    }

    private fun setupDisplayContext(displayId: Int) {
        val dm = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager
        val display = dm.getDisplay(displayId)
        if (display == null) { 
            windowManager = getSystemService(WINDOW_SERVICE) as WindowManager
            return 
        }
        currentDisplayId = displayId
        
        val baseContext = createDisplayContext(display)
        // Use TYPE_ACCESSIBILITY_OVERLAY (2032) for AccessibilityService
        displayContext = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            baseContext.createWindowContext(2032, null)
        } else {
            baseContext
        }
        
        windowManager = displayContext!!.getSystemService(Context.WINDOW_SERVICE) as WindowManager
    }
    private fun refreshDisplayId() { val id = displayContext?.display?.displayId ?: Display.DEFAULT_DISPLAY; currentDisplayId = id }
    private fun startForegroundService() { val channelId = if (android.os.Build.VERSION.SDK_INT >= 26) { val channel = android.app.NotificationChannel(CHANNEL_ID, "Floating Launcher", android.app.NotificationManager.IMPORTANCE_LOW); getSystemService(android.app.NotificationManager::class.java).createNotificationChannel(channel); CHANNEL_ID } else ""; val notification = NotificationCompat.Builder(this, channelId).setContentTitle("CoverScreen Launcher Active").setSmallIcon(R.drawable.ic_launcher_bubble).setPriority(NotificationCompat.PRIORITY_MIN).build(); if (android.os.Build.VERSION.SDK_INT >= 34) startForeground(1, notification, android.content.pm.ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE) else startForeground(1, notification) }
    private fun bindShizuku() { try { val component = ComponentName(packageName, ShellUserService::class.java.name); ShizukuBinder.bind(component, userServiceConnection, true, 1) } catch (e: Exception) { Log.e(TAG, "Bind Shizuku Failed", e) } }
    private fun updateExecuteButtonColor(isReady: Boolean) { uiHandler.post { val executeBtn = drawerView?.findViewById<ImageView>(R.id.icon_execute); if (isReady) executeBtn?.setColorFilter(Color.GREEN) else executeBtn?.setColorFilter(Color.RED) } }

    private fun setupBubble() {
        val context = displayContext ?: this
        val themeContext = ContextThemeWrapper(context, R.style.Theme_QuadrantLauncher)
        bubbleView = LayoutInflater.from(themeContext).inflate(R.layout.layout_bubble, null)
        bubbleView?.isClickable = true; bubbleView?.isFocusable = true 
        
        // Z-ORDER UPDATE: Try ACCESSIBILITY_OVERLAY (2032) + FLAG_LAYOUT_NO_LIMITS
        val targetType = if (Build.VERSION.SDK_INT >= 26) 2032 else WindowManager.LayoutParams.TYPE_PHONE 
        
        bubbleParams = WindowManager.LayoutParams(
            WindowManager.LayoutParams.WRAP_CONTENT, 
            WindowManager.LayoutParams.WRAP_CONTENT, 
            targetType, 
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or 
            WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN or 
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS or 
            WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH, 
            PixelFormat.TRANSLUCENT
        )
        bubbleParams.gravity = Gravity.TOP or Gravity.START; bubbleParams.x = 50; bubbleParams.y = 200
        
        // ... (Keep existing OnTouchListener logic here) ...
        var velocityTracker: VelocityTracker? = null
        bubbleView?.setOnTouchListener(object : View.OnTouchListener {
            var initialX = 0; var initialY = 0; var initialTouchX = 0f; var initialTouchY = 0f; var isDrag = false
            override fun onTouch(v: View, event: MotionEvent): Boolean {
                if (velocityTracker == null) velocityTracker = VelocityTracker.obtain(); velocityTracker?.addMovement(event)
                when (event.action) {
                    MotionEvent.ACTION_DOWN -> { initialX = bubbleParams.x; initialY = bubbleParams.y; initialTouchX = event.rawX; initialTouchY = event.rawY; isDrag = false; return true }
                    MotionEvent.ACTION_MOVE -> { if (Math.abs(event.rawX - initialTouchX) > 10 || Math.abs(event.rawY - initialTouchY) > 10) isDrag = true; if (isDrag) { bubbleParams.x = initialX + (event.rawX - initialTouchX).toInt(); bubbleParams.y = initialY + (event.rawY - initialTouchY).toInt(); windowManager.updateViewLayout(bubbleView, bubbleParams) }; return true }
                    MotionEvent.ACTION_UP -> { velocityTracker?.computeCurrentVelocity(1000); val vX = velocityTracker?.xVelocity ?: 0f; val vY = velocityTracker?.yVelocity ?: 0f; val totalVel = hypot(vX.toDouble(), vY.toDouble()); if (isDrag && totalVel > 2500) { safeToast("Closing..."); stopSelf(); return true }; if (!isDrag) { if (!isBound && showShizukuWarning) { if (Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED) { bindShizuku() } else { safeToast("Shizuku NOT Connected. Opening Shizuku..."); launchShizuku() } } else { toggleDrawer() } }; velocityTracker?.recycle(); velocityTracker = null; return true }
                    MotionEvent.ACTION_CANCEL -> { velocityTracker?.recycle(); velocityTracker = null }
                }
                return false
            }
        })

        // Z-ORDER UPDATE: Try High Z-Order, Fallback to App Overlay if denied
        try {
            windowManager.addView(bubbleView, bubbleParams)
            attachedWindowManager = windowManager
        } catch (e: Exception) {
            try {
                bubbleParams.type = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY
                windowManager.addView(bubbleView, bubbleParams)
                attachedWindowManager = windowManager
            } catch (e2: Exception) {
                Log.e(TAG, "Error adding bubble", e2)
            }
        }
    }
    
    private fun updateBubbleIcon() { val iconView = bubbleView?.findViewById<ImageView>(R.id.bubble_icon) ?: return; if (!isBound && showShizukuWarning) { uiHandler.post { iconView.setImageResource(android.R.drawable.ic_dialog_alert); iconView.setColorFilter(Color.RED); iconView.imageTintList = null }; return }; uiHandler.post { try { val uriStr = AppPreferences.getIconUri(this); if (uriStr != null) { val uri = Uri.parse(uriStr); val input = contentResolver.openInputStream(uri); val bitmap = BitmapFactory.decodeStream(input); input?.close(); if (bitmap != null) { iconView.setImageBitmap(bitmap); iconView.imageTintList = null; iconView.clearColorFilter() } else { iconView.setImageResource(R.drawable.ic_launcher_bubble); iconView.imageTintList = null; iconView.clearColorFilter() } } else { iconView.setImageResource(R.drawable.ic_launcher_bubble); iconView.imageTintList = null; iconView.clearColorFilter() } } catch (e: Exception) { iconView.setImageResource(R.drawable.ic_launcher_bubble); iconView.imageTintList = null; iconView.clearColorFilter() } } }
    private fun dismissKeyboardAndRestore() { val searchBar = drawerView?.findViewById<EditText>(R.id.rofi_search_bar); if (searchBar != null && searchBar.hasFocus()) { searchBar.clearFocus(); val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager; imm.hideSoftInputFromWindow(searchBar.windowToken, 0) }; val dpiInput = drawerView?.findViewById<EditText>(R.id.input_dpi_value); if (dpiInput != null && dpiInput.hasFocus()) { dpiInput.clearFocus(); val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager; imm.hideSoftInputFromWindow(dpiInput.windowToken, 0) }; updateDrawerHeight(false) }

    private fun setupDrawer() {
        val context = displayContext ?: this
        val themeContext = ContextThemeWrapper(context, R.style.Theme_QuadrantLauncher)
        drawerView = LayoutInflater.from(themeContext).inflate(R.layout.layout_rofi_drawer, null)
        drawerView!!.fitsSystemWindows = true 
        
        // Z-ORDER UPDATE: Match Bubble settings
        val targetType = if (Build.VERSION.SDK_INT >= 26) 2032 else WindowManager.LayoutParams.TYPE_PHONE 

        drawerParams = WindowManager.LayoutParams(
            WindowManager.LayoutParams.MATCH_PARENT, 
            WindowManager.LayoutParams.MATCH_PARENT, 
            targetType, 
            WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN or 
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, 
            PixelFormat.TRANSLUCENT
        )
        drawerParams.gravity = Gravity.TOP or Gravity.START; drawerParams.x = 0; drawerParams.y = 0
        drawerParams.softInputMode = WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING
        
        // FIXED: Ensure container is defined and logical
        val container = drawerView?.findViewById<LinearLayout>(R.id.drawer_container)
        if (container != null) {
            val lp = container.layoutParams as? FrameLayout.LayoutParams
            if (lp != null) { lp.gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL; lp.topMargin = 100; container.layoutParams = lp }

            debugStatusView = TextView(context)
            debugStatusView?.text = "Ready"
            debugStatusView?.setTextColor(Color.GREEN)
            debugStatusView?.textSize = 10f
            debugStatusView?.gravity = Gravity.CENTER
            container.addView(debugStatusView, 0)
        }

        val searchBar = drawerView!!.findViewById<EditText>(R.id.rofi_search_bar); val mainRecycler = drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view); val selectedRecycler = drawerView!!.findViewById<RecyclerView>(R.id.selected_apps_recycler); val executeBtn = drawerView!!.findViewById<ImageView>(R.id.icon_execute)
        if (isBound) executeBtn.setColorFilter(Color.GREEN) else executeBtn.setColorFilter(Color.RED)
        // === MODE ICON CLICK LISTENERS - START ===
        // Sets up click listeners for mode switching icons in drawer
        drawerView!!.findViewById<ImageView>(R.id.icon_search_mode).setOnClickListener { dismissKeyboardAndRestore(); switchMode(MODE_SEARCH) }
        drawerView!!.findViewById<ImageView>(R.id.icon_mode_window).setOnClickListener { dismissKeyboardAndRestore(); switchMode(MODE_LAYOUTS) }
        drawerView!!.findViewById<ImageView>(R.id.icon_mode_resolution).setOnClickListener { dismissKeyboardAndRestore(); switchMode(MODE_RESOLUTION) }
        drawerView!!.findViewById<ImageView>(R.id.icon_mode_dpi).setOnClickListener { dismissKeyboardAndRestore(); switchMode(MODE_DPI) }
        drawerView!!.findViewById<ImageView>(R.id.icon_mode_blacklist)?.setOnClickListener { dismissKeyboardAndRestore(); switchMode(MODE_BLACKLIST) }
        drawerView!!.findViewById<ImageView>(R.id.icon_mode_profiles).setOnClickListener { dismissKeyboardAndRestore(); switchMode(MODE_PROFILES) }
        drawerView!!.findViewById<ImageView>(R.id.icon_mode_settings).setOnClickListener { dismissKeyboardAndRestore(); switchMode(MODE_SETTINGS) }
        // === MODE ICON CLICK LISTENERS - END ===
        executeBtn.setOnClickListener { executeLaunch(selectedLayoutType, closeDrawer = true) }
        searchBar.addTextChangedListener(object : TextWatcher { override fun afterTextChanged(s: Editable?) { filterList(s.toString()) }; override fun beforeTextChanged(s: CharSequence?, st: Int, c: Int, a: Int) {}; override fun onTextChanged(s: CharSequence?, st: Int, b: Int, c: Int) {} })
        searchBar.imeOptions = EditorInfo.IME_ACTION_DONE
        searchBar.setOnEditorActionListener { v, actionId, event -> if (actionId == EditorInfo.IME_ACTION_DONE) { dismissKeyboardAndRestore(); return@setOnEditorActionListener true }; false }
        searchBar.setOnKeyListener { _, keyCode, event -> if (keyCode == KeyEvent.KEYCODE_DEL && event.action == KeyEvent.ACTION_DOWN) { if (searchBar.text.isEmpty() && selectedAppsQueue.isNotEmpty()) { val lastIndex = selectedAppsQueue.size - 1; selectedAppsQueue.removeAt(lastIndex); updateSelectedAppsDock(); mainRecycler.adapter?.notifyDataSetChanged(); return@setOnKeyListener true } }; if (keyCode == KeyEvent.KEYCODE_BACK && event.action == KeyEvent.ACTION_UP) { if (searchBar.hasFocus()) { dismissKeyboardAndRestore(); return@setOnKeyListener true } }; return@setOnKeyListener false }
        searchBar.setOnFocusChangeListener { _, hasFocus -> if (autoResizeEnabled) { updateDrawerHeight(hasFocus) } }
        mainRecycler.layoutManager = LinearLayoutManager(themeContext); mainRecycler.adapter = RofiAdapter(); val itemTouchHelper = ItemTouchHelper(swipeCallback); itemTouchHelper.attachToRecyclerView(mainRecycler)
        mainRecycler.addOnScrollListener(object : RecyclerView.OnScrollListener() { override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) { if (newState == RecyclerView.SCROLL_STATE_DRAGGING) { dismissKeyboardAndRestore() } } })
        mainRecycler.setOnTouchListener { v, event -> if (event.action == MotionEvent.ACTION_DOWN) { dismissKeyboardAndRestore() }; false }
        selectedRecycler.layoutManager = LinearLayoutManager(themeContext, LinearLayoutManager.HORIZONTAL, false); selectedRecycler.adapter = SelectedAppsAdapter(); val dockTouchHelper = ItemTouchHelper(selectedAppsDragCallback); dockTouchHelper.attachToRecyclerView(selectedRecycler)
        drawerView!!.setOnClickListener { toggleDrawer() }
        drawerView!!.isFocusableInTouchMode = true
        drawerView!!.setOnKeyListener { _, keyCode, event -> if (keyCode == KeyEvent.KEYCODE_BACK && event.action == KeyEvent.ACTION_UP) { toggleDrawer(); true } else if (keyCode == KeyEvent.KEYCODE_VOLUME_UP && isScreenOffState) { wakeUp(); true } else false }
    }

    /**
     * Initializes or re-initializes the window and all its components.
     * This is called when the service starts or when the target display changes.
     */
    private fun initWindow() {
        setupDisplayContext(currentDisplayId)
        setupBubble()
        setupDrawer()
        updateBubbleIcon()
        loadDisplaySettings(currentDisplayId)
    }
    
    private fun startReorderMode(index: Int) { if (!isReorderTapEnabled) return; if (index < 0 || index >= selectedAppsQueue.size) return; val prevIndex = reorderSelectionIndex; reorderSelectionIndex = index; val adapter = drawerView!!.findViewById<RecyclerView>(R.id.selected_apps_recycler).adapter; if (prevIndex != -1) adapter?.notifyItemChanged(prevIndex); adapter?.notifyItemChanged(reorderSelectionIndex); safeToast("Tap another app to Swap") }
    private fun swapReorderItem(targetIndex: Int) { if (reorderSelectionIndex == -1) return; Collections.swap(selectedAppsQueue, reorderSelectionIndex, targetIndex); val adapter = drawerView!!.findViewById<RecyclerView>(R.id.selected_apps_recycler).adapter; adapter?.notifyItemChanged(reorderSelectionIndex); adapter?.notifyItemChanged(targetIndex); endReorderMode(true) }
    private fun endReorderMode(triggerInstantMode: Boolean) { val prevIndex = reorderSelectionIndex; reorderSelectionIndex = -1; val adapter = drawerView!!.findViewById<RecyclerView>(R.id.selected_apps_recycler).adapter; if (prevIndex != -1) adapter?.notifyItemChanged(prevIndex); if (triggerInstantMode && isInstantMode) applyLayoutImmediate() }
    
    private fun updateDrawerHeight(isKeyboardMode: Boolean) {
        val container = drawerView?.findViewById<LinearLayout>(R.id.drawer_container) ?: return
        val dm = DisplayMetrics(); windowManager.defaultDisplay.getRealMetrics(dm); val screenH = dm.heightPixels; val screenW = dm.widthPixels
        val lp = container.layoutParams as? FrameLayout.LayoutParams; val topMargin = lp?.topMargin ?: 100
        var finalHeight = (screenH * (currentDrawerHeightPercent / 100f)).toInt()
        if (isKeyboardMode) { finalHeight = (screenH * 0.40f).toInt(); val maxAvailable = screenH - topMargin - 20; if (finalHeight > maxAvailable) finalHeight = maxAvailable }
        val newW = (screenW * (currentDrawerWidthPercent / 100f)).toInt()
        if (container.layoutParams.height != finalHeight || container.layoutParams.width != newW) { container.layoutParams.width = newW; container.layoutParams.height = finalHeight; container.requestLayout(); if (drawerParams.y != 0) { drawerParams.y = 0; windowManager.updateViewLayout(drawerView, drawerParams) } }
    }

    // === TOGGLE DRAWER - START ===
    // Opens/closes the launcher drawer overlay
    // Updates debug display with queue state when opening
    private fun toggleDrawer() {
        if (isExpanded) { 
            try { windowManager.removeView(drawerView) } catch(e: Exception) {}
            bubbleView?.visibility = View.VISIBLE
            isExpanded = false 
        } else { 
            updateDrawerHeight(false)
            
            // Z-ORDER UPDATE: Try adding with High Priority, Fallback if fails
            try { 
                windowManager.addView(drawerView, drawerParams) 
            } catch(e: Exception) {
                try {
                    drawerParams.type = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY
                    windowManager.addView(drawerView, drawerParams)
                } catch(e2: Exception) {}
            }
            
            bubbleView?.visibility = View.GONE
            isExpanded = true
            switchMode(MODE_SEARCH)
            
            val et = drawerView?.findViewById<EditText>(R.id.rofi_search_bar)
            et?.setText("")
            et?.clearFocus()
            updateSelectedAppsDock()
            
            // Show current queue state in debug view when drawer opens
            showQueueDebugState()
            
            if (isInstantMode) fetchRunningApps() 
        }
    }
    // === TOGGLE DRAWER - END ===
    
    // === SHOW QUEUE DEBUG STATE - START ===
    private fun showQueueDebugState() {
        if (selectedAppsQueue.isEmpty()) {
            debugStatusView?.text = "[DRAWER] Queue empty"
        } else {
            val queueInfo = selectedAppsQueue.mapIndexed { i, app ->
                val shortCls = when {
                    app.className.isNullOrEmpty() -> "NO_CLS"
                    app.className == "null" -> "NO_CLS"
                    app.className == "default" -> "BAD_CLS"
                    else -> app.className!!.substringAfterLast(".")
                }
                val shortPkg = app.packageName.substringAfterLast(".")
                "$i:$shortPkg($shortCls)"
            }.joinToString(" | ")
            debugStatusView?.text = "[Q] $queueInfo"
            
            // Also log full details
            selectedAppsQueue.forEachIndexed { i, app ->
                Log.d(DEBUG_TAG, "Queue[$i]: ${app.label} pkg=${app.packageName} cls=${app.className}")
            }
        }
    }
    // === SHOW QUEUE DEBUG STATE - END ===
    private fun updateGlobalFontSize() { val searchBar = drawerView?.findViewById<EditText>(R.id.rofi_search_bar); searchBar?.textSize = currentFontSize; drawerView?.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged() }

// This ensures that the internal list always has two separate entries for the Google package.
// We force the standard one to be "Google" and the assistant one to be "Gemini".

    // === LOAD INSTALLED APPS - START ===
    // Loads all launcher apps with proper className capture
    private fun loadInstalledApps() {
        val pm = packageManager
        val intent = Intent(Intent.ACTION_MAIN, null).apply { addCategory(Intent.CATEGORY_LAUNCHER) }
        val riList = pm.queryIntentActivities(intent, 0)
        allAppsList.clear()
        allAppsList.add(MainActivity.AppInfo(" (Blank Space)", PACKAGE_BLANK, null))

        val blacklist = AppPreferences.getBlacklist(this)

        for (ri in riList) {
            val pkg = ri.activityInfo.packageName
            // Get the FULL activity class name - this is critical for tiling
            val cls = ri.activityInfo.name
            
            if (pkg == PACKAGE_TRACKPAD || pkg == packageName) continue

            var label = ri.loadLabel(pm).toString()
            
            // Standalone Gemini app (com.google.android.apps.bard)
            if (pkg == "com.google.android.apps.bard") {
                label = "Gemini"
            }
            // Google Quick Search Box with Gemini/Assistant activity
            else if (pkg == "com.google.android.googlequicksearchbox" &&
                (cls.lowercase().contains("assistant") || 
                 cls.lowercase().contains("gemini") ||
                 cls.lowercase().contains("bard"))) {
                label = "Gemini (Google)"
            }

            // Validate className - must not be null, empty, or "default"
            val validClassName = if (cls.isNullOrEmpty() || cls == "default") {
                Log.w(DEBUG_TAG, "App $label ($pkg) has invalid className: $cls")
                null
            } else {
                cls
            }

            val app = MainActivity.AppInfo(
                label = label, 
                packageName = pkg, 
                className = validClassName,
                isFavorite = AppPreferences.isFavorite(this, pkg)
            )

            if (!blacklist.contains(app.getIdentifier())) {
                allAppsList.add(app)
            }
            
            Log.d(DEBUG_TAG, "Loaded: $label pkg=$pkg cls=$validClassName")
        }
        allAppsList.sortBy { it.label.lowercase() }
        Log.d(TAG, "Loaded ${allAppsList.size} apps total")
    }
    // === LOAD INSTALLED APPS - END ===

    // === LOAD BLACKLISTED APPS - START ===
    // Loads all blacklisted apps for display in blacklist tab
    // Reconstructs AppInfo objects from blacklist identifiers
    private fun loadBlacklistedApps() {
        displayList.clear()

        val pm = packageManager
        val blacklist = AppPreferences.getBlacklist(this)

        for (identifier in blacklist) {
            try {
                val parts = identifier.split(":")
                val pkg = parts[0]
                val activity = if (parts.size > 1) parts[1] else null

                // Determine label
                val label = when {
                    identifier.contains("gemini") -> "Gemini"
                    pkg == "com.google.android.googlequicksearchbox" -> "Google"
                    else -> {
                        try {
                            pm.getApplicationLabel(pm.getApplicationInfo(pkg, 0)).toString()
                        } catch (e: Exception) {
                            identifier
                        }
                    }
                }

                val app = MainActivity.AppInfo(label, pkg, activity, false, false)
                displayList.add(app)
            } catch (e: Exception) {
                Log.e(TAG, "Failed to load blacklisted app: $identifier", e)
            }
        }

        displayList.sortBy { (it as? MainActivity.AppInfo)?.label?.lowercase() }
        drawerView?.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged()
    }
    // === LOAD BLACKLISTED APPS - END ===


    private fun launchTrackpad() {
        // [FIX] Robust Launch Strategy: Service -> Activity -> Broadcast
        // 1. Try to start the Service directly (Fastest, maintains state)
        try {
            val serviceIntent = Intent()
            serviceIntent.component = ComponentName(
                "com.katsuyamaki.DroidOSTrackpadKeyboard", 
                "com.example.coverscreentester.OverlayService" 
            )
            if (Build.VERSION.SDK_INT >= 26) startForegroundService(serviceIntent) else startService(serviceIntent)
            safeToast("Starting Trackpad Service...")
            return
        } catch (e: Exception) {
            // Service start failed (likely Background Restrictions) -> Proceed to Step 2
        }

        // 2. Try to Launch the Main Activity (Guaranteed to wake app)
        try {
            val launchIntent = packageManager.getLaunchIntentForPackage("com.katsuyamaki.DroidOSTrackpadKeyboard")
            if (launchIntent != null) {
                launchIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(launchIntent)
                safeToast("Launching Trackpad App...")
                return
            }
        } catch (e: Exception) {
            // New package not found -> Proceed to Step 3
        }

        // 3. Legacy Fallback (Old Package Name)
        try {
            val oldIntent = Intent()
            oldIntent.component = ComponentName(
                "com.example.coverscreentester", 
                "com.example.coverscreentester.OverlayService"
            )
            if (Build.VERSION.SDK_INT >= 26) startForegroundService(oldIntent) else startService(oldIntent)
            return
        } catch (e: Exception) {
            // Legacy Service failed -> Try Legacy Activity
            try {
                val oldLaunchIntent = packageManager.getLaunchIntentForPackage("com.example.coverscreentester")
                if (oldLaunchIntent != null) {
                    oldLaunchIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    startActivity(oldLaunchIntent)
                    return
                }
            } catch (e2: Exception) {}
        }

        // 4. Final Resort: Broadcast (Only works if app is already alive)
        val broadcastNew = Intent("com.katsuyamaki.DroidOSTrackpadKeyboard.SET_TRACKPAD_VISIBILITY")
        broadcastNew.setPackage("com.katsuyamaki.DroidOSTrackpadKeyboard")
        broadcastNew.putExtra("VISIBLE", true)
        sendBroadcast(broadcastNew)
        
        safeToast("Trackpad not found or failed to launch.")
    }

    private fun isTrackpadRunning(): Boolean { try { val am = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager; val runningApps = am.runningAppProcesses; if (runningApps != null) { for (info in runningApps) { if (info.processName == PACKAGE_TRACKPAD) return true } } } catch (e: Exception) {}; return false }
    private fun getLayoutName(type: Int): String { return when(type) { LAYOUT_FULL -> "1 App - Full"; LAYOUT_SIDE_BY_SIDE -> "Split"; LAYOUT_TOP_BOTTOM -> "Top/Bot"; LAYOUT_TRI_EVEN -> "Tri-Split"; LAYOUT_CORNERS -> "Quadrant"; LAYOUT_TRI_SIDE_MAIN_SIDE -> "3 Apps - Side/Main/Side"; LAYOUT_QUAD_ROW_EVEN -> "4 Apps - Row"; LAYOUT_CUSTOM_DYNAMIC -> "Custom"; else -> "Unknown" } }
    private fun getRatioName(index: Int): String { return when(index) { 1 -> "1:1"; 2 -> "16:9"; 3 -> "32:9"; else -> "Default" } }
    private fun getTargetDimensions(index: Int): Pair<Int, Int>? { return when(index) { 1 -> 1422 to 1500; 2 -> 1920 to 1080; 3 -> 3840 to 1080; else -> null } }
    private fun getResolutionCommand(index: Int): String { return when(index) { 1 -> "wm size 1422x1500 -d $currentDisplayId"; 2 -> "wm size 1920x1080 -d $currentDisplayId"; 3 -> "wm size 3840x1080 -d $currentDisplayId"; else -> "wm size reset -d $currentDisplayId" } }
    private fun sortAppQueue() { selectedAppsQueue.sortWith(compareBy { it.isMinimized }) }
    private fun updateSelectedAppsDock() { val dock = drawerView!!.findViewById<RecyclerView>(R.id.selected_apps_recycler); if (selectedAppsQueue.isEmpty()) { dock.visibility = View.GONE } else { dock.visibility = View.VISIBLE; dock.adapter?.notifyDataSetChanged(); dock.scrollToPosition(selectedAppsQueue.size - 1) } }
    private fun refreshSearchList() { val query = drawerView?.findViewById<EditText>(R.id.rofi_search_bar)?.text?.toString() ?: ""; filterList(query) }
    private fun filterList(query: String) {
        if (currentMode != MODE_SEARCH) return; val actualQuery = query.substringAfterLast(",").trim(); displayList.clear()
        val filtered = if (actualQuery.isEmpty()) { allAppsList } else { allAppsList.filter { it.label.contains(actualQuery, ignoreCase = true) } }
        val sorted = filtered.sortedWith(compareBy<MainActivity.AppInfo> { it.packageName != PACKAGE_BLANK }.thenByDescending { it.isFavorite }.thenBy { it.label.lowercase() }); displayList.addAll(sorted); drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged()
    }
    // === ADD TO SELECTION - START ===
    // Adds app to the selection queue, handles removal if already selected
    // Uses proper package name extraction for force-stop and launch operations
    private fun addToSelection(app: MainActivity.AppInfo) {
        dismissKeyboardAndRestore()
        val et = drawerView!!.findViewById<EditText>(R.id.rofi_search_bar)
        
        // Handle blank spacer
        if (app.packageName == PACKAGE_BLANK) { 
            selectedAppsQueue.add(app)
            sortAppQueue()
            updateSelectedAppsDock()
            drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged()
            if (isInstantMode) applyLayoutImmediate()
            return 
        }
        
        // Debug: show what app is being selected
        debugShowAppIdentification("SELECT", app.packageName, app.className)
        
        // Check if app is already in queue (by matching both package and class for precision)
        val existing = selectedAppsQueue.find { 
            it.packageName == app.packageName && it.className == app.className 
        }
        
        if (existing != null) { 
            // Remove from queue
            selectedAppsQueue.remove(existing)
            
            // Force stop using BASE package name (shell commands need base pkg)
            val basePkg = if (app.packageName.contains(":")) app.packageName.substringBefore(":") else app.packageName
            Thread { 
                try { 
                    shellService?.forceStop(basePkg) 
                } catch(e: Exception) {
                    Log.e(TAG, "forceStop failed for $basePkg", e)
                } 
            }.start()
            
            safeToast("Removed ${app.label}")
            sortAppQueue()
            updateSelectedAppsDock()
            drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged()
            et.setText("")
            if (isInstantMode) applyLayoutImmediate() 
        } else { 
            // Add to queue and launch if instant mode
            app.isMinimized = false
            selectedAppsQueue.add(app)
            sortAppQueue()
            updateSelectedAppsDock()
            drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged()
            et.setText("")
            
            if (isInstantMode) { 
                // Launch using both API and Shell for reliability
                launchViaApi(app.packageName, app.className, null)
                launchViaShell(app.packageName, app.className, null)
                
                // Delayed layout application to allow app to start
                uiHandler.postDelayed({ applyLayoutImmediate() }, 200)
                uiHandler.postDelayed({ applyLayoutImmediate() }, 800) 
            } 
        }
    }
    // === ADD TO SELECTION - END ===

    private fun toggleFavorite(app: MainActivity.AppInfo) { val newState = AppPreferences.toggleFavorite(this, app.packageName); app.isFavorite = newState; allAppsList.find { it.packageName == app.packageName }?.isFavorite = newState }


    // === LAUNCH VIA API - START ===
    // Launches app using Android API with launch bounds
    private fun launchViaApi(pkg: String, className: String?, bounds: Rect?) {
        try {
            val basePkg = if (pkg.contains(":")) pkg.substringBefore(":") else pkg

            debugShowAppIdentification("LAUNCH_API", basePkg, className)

            val intent: Intent?

            if (!className.isNullOrEmpty() && className != "null" && className != "default") {
                intent = Intent()
                intent.setClassName(basePkg, className)
                intent.action = Intent.ACTION_MAIN
                intent.addCategory(Intent.CATEGORY_LAUNCHER)
                Log.d(TAG, "launchViaApi: explicit component $basePkg/$className")
            } else {
                intent = packageManager.getLaunchIntentForPackage(basePkg)
                Log.d(TAG, "launchViaApi: default intent for $basePkg")
            }

            if (intent == null) {
                Log.w(TAG, "launchViaApi: No intent for $basePkg, trying shell")
                launchViaShell(basePkg, className, bounds)
                return
            }

            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)

            val options = android.app.ActivityOptions.makeBasic()
            options.setLaunchDisplayId(currentDisplayId)

            if (bounds != null) {
                options.setLaunchBounds(bounds)
                Log.d(TAG, "launchViaApi: bounds=$bounds")
            }

            startActivity(intent, options.toBundle())
            Log.d(TAG, "launchViaApi: SUCCESS $basePkg")

        } catch (e: Exception) {
            Log.e(TAG, "launchViaApi FAILED, trying shell", e)
            launchViaShell(pkg, className, bounds)
        }
    }
    // === LAUNCH VIA API - END ===


    // === LAUNCH VIA SHELL - START ===
    // Launches app via shell with freeform windowing mode
    private fun launchViaShell(pkg: String, className: String?, bounds: Rect?) {
        try {
            val basePkg = if (pkg.contains(":")) pkg.substringBefore(":") else pkg

            debugShowAppIdentification("LAUNCH_SHELL", basePkg, className)

            val component = if (!className.isNullOrEmpty() && className != "null" && className != "default") {
                "$basePkg/$className"
            } else {
                null
            }

            // Build launch command with freeform mode (--windowingMode 5)
            val cmd = if (component != null) {
                "am start -n $component --display $currentDisplayId --windowingMode 5 --user 0"
            } else {
                "am start -p $basePkg -a android.intent.action.MAIN -c android.intent.category.LAUNCHER --display $currentDisplayId --windowingMode 5 --user 0"
            }

            Log.d(TAG, "launchViaShell: $cmd")

            Thread {
                try {
                    shellService?.runCommand(cmd)
                    Log.d(TAG, "launchViaShell: SUCCESS")
                } catch (e: Exception) {
                    Log.e(TAG, "launchViaShell: FAILED", e)
                }
            }.start()

        } catch (e: Exception) {
            Log.e(TAG, "launchViaShell FAILED: $pkg", e)
        }
    }
    // === LAUNCH VIA SHELL - END ===

    
    private fun toggleVirtualDisplay() {
        if (virtualDisplay == null) {
            val dm = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager
            
            // 1. Create ImageReader to act as the screen buffer
            virtualImageReader = ImageReader.newInstance(1920, 1080, PixelFormat.RGBA_8888, 2)
            
            // 2. Set flags (Public allows other apps/system to see it; Presentation allows secondary content)
            val flags = DisplayManager.VIRTUAL_DISPLAY_FLAG_PRESENTATION or DisplayManager.VIRTUAL_DISPLAY_FLAG_PUBLIC
            
            // 3. Create Display with Surface
            virtualDisplay = dm.createVirtualDisplay(
                "DroidOS-Virtual", 
                1920, 1080, 320, 
                virtualImageReader?.surface, 
                flags
            )
            
            Toast.makeText(this, "Virtual Display Created (1080p)", Toast.LENGTH_SHORT).show()
        } else {
            // Optional: Destroy if toggled again? For now, just warn.
            Toast.makeText(this, "Virtual Display Already Active", Toast.LENGTH_SHORT).show()
        }
    }

    fun switchDisplay() {
        val dm = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager
        
        // 1. Determine where the Bubble actually is (Source of Truth)
        var actualCurrentId = currentDisplayId
        // Safe check for view location
        if (bubbleView != null && bubbleView?.isAttachedToWindow == true) {
             bubbleView?.display?.let { actualCurrentId = it.displayId }
        }

        var targetId = actualCurrentId

        // 2. Logic: Physical <-> Virtual
        if (actualCurrentId == 0 || actualCurrentId == 1) {
            // CASE: We are on a Physical Display -> Go to Virtual
            
            // Find the first display that ISN'T 0 or 1
            val virtualDisplay = dm.displays.firstOrNull { it.displayId != 0 && it.displayId != 1 }
            
            if (virtualDisplay != null) {
                targetId = virtualDisplay.displayId
            } else {
                // Fallback: If no virtual display exists, just toggle normally so button works
                targetId = if (actualCurrentId == 0) 1 else 0
                Toast.makeText(this, "No Virtual Display Active", Toast.LENGTH_SHORT).show()
            }
        } else {
            // CASE: We are on Virtual -> Go back to ACTIVE Physical Display
            
            val d0 = dm.getDisplay(0)
            val d1 = dm.getDisplay(1)
            
            // Check states to see which screen is actually awake
            val isZeroOn = d0?.state == Display.STATE_ON
            val isOneOn = d1?.state == Display.STATE_ON
            
            if (isZeroOn) {
                targetId = 0
            } else if (isOneOn) {
                targetId = 1
            } else {
                // If both are reported off (unlikely while using phone), default to Main
                targetId = 0
            }
        }

        // 3. Execute Switch if target is different
        if (targetId != actualCurrentId) {
            performDisplayChange(targetId)
        }
    }
    private fun performDisplayChange(newId: Int) {
        lastManualSwitchTime = System.currentTimeMillis()
        val dm = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager
        val targetDisplay = dm.getDisplay(newId) ?: return
        
        // 1. CLEANUP using the captured manager
        try { 
            if (bubbleView != null) {
                // Use the specific manager that added it, fallback to current
                val wm = attachedWindowManager ?: windowManager
                wm.removeView(bubbleView)
            }
        } catch (e: Exception) { Log.e(TAG, "Failed to remove bubble", e) }
        
        try {
            if (drawerView != null && isExpanded) {
                windowManager.removeView(drawerView)
            }
        } catch (e: Exception) {}

        // 2. SWITCH
        currentDisplayId = newId
        setupDisplayContext(currentDisplayId)
        targetDisplayIndex = currentDisplayId
        AppPreferences.setTargetDisplayIndex(this, targetDisplayIndex)
        
        // 3. REBUILD
        setupBubble()
        setupDrawer()
        
        loadDisplaySettings(currentDisplayId)
        updateBubbleIcon()
        isExpanded = false
        safeToast("Switched to Display $currentDisplayId (${targetDisplay.name})")
    }
    private fun toggleVirtualDisplay(enable: Boolean) { isVirtualDisplayActive = enable; Thread { try { if (enable) { shellService?.runCommand("settings put global overlay_display_devices \"1920x1080/320\""); uiHandler.post { safeToast("Creating Virtual Display... Wait a moment, then Switch Display.") } } else { shellService?.runCommand("settings delete global overlay_display_devices"); uiHandler.post { safeToast("Destroying Virtual Display...") } } } catch (e: Exception) { Log.e(TAG, "Virtual Display Toggle Failed", e) } }.start(); if (currentMode == MODE_SETTINGS) uiHandler.postDelayed({ switchMode(MODE_SETTINGS) }, 500) }

    // --- v2.0 SCREEN OFF LOGIC ---
    private fun performScreenOff() {
        vibrate()
        isScreenOffState = true
        safeToast("Screen Off: Double press Power Button to turn on")
        
        if (useAltScreenOff) {
             Thread {
                 try {
                     if (shellService != null) {
                         shellService?.setBrightness(0, -1)
                         uiHandler.post { safeToast("Pixels OFF (Alternate Mode)") }
                     } else {
                         safeToast("Service Disconnected!")
                     }
                 } catch (e: Exception) {
                     Log.e(TAG, "Binder Call Failed", e)
                     safeToast("Error: ${e.message}")
                 }
            }.start()
        } else {
            Thread { try { shellService?.setScreenOff(0, true) } catch (e: Exception) {} }.start()
            safeToast("Screen OFF (SurfaceControl)")
        }
    }
    
    private fun wakeUp() {
        vibrate()
        isScreenOffState = false
        
        Thread { try { shellService?.setBrightness(0, 128) } catch (e: Exception) {} }.start()
        Thread { try { shellService?.setScreenOff(0, false) } catch (e: Exception) {} }.start()

        safeToast("Screen On")
        if (currentMode == MODE_SETTINGS) drawerView?.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged()
    }

    private fun applyLayoutImmediate() { executeLaunch(selectedLayoutType, closeDrawer = false) }



    // === FETCH RUNNING APPS - START ===
    // Fetches visible and running apps from system, merges with saved queue
    // Handles Gemini/Google trampoline case where Gemini runs inside Google Quick Search Box task
    // Key insight: Gemini (com.google.android.apps.bard) shows up as com.google.android.googlequicksearchbox
    // in system visibility reports because it trampolines through Google's SearchActivity
    private fun fetchRunningApps() {
        if (shellService == null) return

        Thread {
            try {
                val visiblePackages = shellService!!.getVisiblePackages(currentDisplayId)
                val allRunning = shellService!!.getAllRunningPackages()
                val lastQueue = AppPreferences.getLastQueue(this)

                Log.d(DEBUG_TAG, "fetchRunningApps: visible=${visiblePackages.joinToString()}")
                Log.d(DEBUG_TAG, "fetchRunningApps: lastQueue=${lastQueue.joinToString()}")

                uiHandler.post {
                    selectedAppsQueue.clear()

                    // === PHASE 1: Restore apps from saved queue ===
                    for (identifier in lastQueue) {
                        if (identifier == PACKAGE_BLANK) {
                            selectedAppsQueue.add(MainActivity.AppInfo(" (Blank Space)", PACKAGE_BLANK, null))
                        } else {
                            // Find by identifier (handles both package-only and package:suffix formats)
                            val appInfo = findAppByIdentifier(identifier)

                            if (appInfo != null) {
                                val basePkg = appInfo.getBasePackage()

                                // Check if running - handle Gemini special case
                                val isRunning = if (basePkg == "com.google.android.apps.bard") {
                                    // Gemini trampolines through Google Quick Search Box
                                    allRunning.contains(basePkg) ||
                                    allRunning.contains("com.google.android.googlequicksearchbox")
                                } else {
                                    allRunning.contains(basePkg)
                                }

                                if (isRunning) {
                                    // Check visibility - handle Gemini special case
                                    val isVisible = if (basePkg == "com.google.android.apps.bard") {
                                        visiblePackages.contains(basePkg) ||
                                        visiblePackages.contains("com.google.android.googlequicksearchbox")
                                    } else {
                                        visiblePackages.contains(basePkg)
                                    }

                                    appInfo.isMinimized = !isVisible
                                    selectedAppsQueue.add(appInfo)
                                    Log.d(DEBUG_TAG, "fetchRunningApps: Restored ${appInfo.label} minimized=${appInfo.isMinimized}")
                                }
                            } else {
                                Log.w(DEBUG_TAG, "fetchRunningApps: Could not find app for identifier=$identifier")
                            }
                        }
                    }

                    // === PHASE 2: Add newly visible apps not already in queue ===
                    for (pkg in visiblePackages) {
                        // Skip if it's Google Quick Search Box - we handle Gemini specifically
                        // and don't want to auto-add Google if the user has Gemini in queue
                        val isGoogleQSB = pkg == "com.google.android.googlequicksearchbox"

                        // Check if already in queue by package or related package
                        val alreadyInQueue = selectedAppsQueue.any { queuedApp ->
                            val queuedBasePkg = queuedApp.getBasePackage()
                            when {
                                // Direct match
                                queuedBasePkg == pkg -> true
                                // Gemini is in queue, and we see Google QSB (trampoline case)
                                isGoogleQSB && queuedBasePkg == "com.google.android.apps.bard" -> true
                                // Google QSB is in queue, and we see Google QSB
                                isGoogleQSB && queuedBasePkg == "com.google.android.googlequicksearchbox" -> true
                                else -> false
                            }
                        }

                        if (!alreadyInQueue) {
                            val appInfo = allAppsList.find { it.packageName == pkg }
                            if (appInfo != null) {
                                appInfo.isMinimized = false
                                selectedAppsQueue.add(appInfo)
                                Log.d(DEBUG_TAG, "fetchRunningApps: Added new visible ${appInfo.label}")
                            }
                        }
                    }

                    sortAppQueue()
                    updateSelectedAppsDock()
                    drawerView?.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged()
                }
            } catch (e: Exception) {
                Log.e(TAG, "Fetch failed", e)
            }
        }.start()
    }
    // === FETCH RUNNING APPS - END ===

    // === FIND APP BY IDENTIFIER - START ===
    // Finds an AppInfo from allAppsList by its identifier
    // Handles both simple package names and compound identifiers (package:suffix)
    // Also handles the getIdentifier() format used for saving
    private fun findAppByIdentifier(identifier: String): MainActivity.AppInfo? {
        // First, try exact getIdentifier() match
        val exactMatch = allAppsList.find { it.getIdentifier() == identifier }
        if (exactMatch != null) return exactMatch

        // If identifier contains ":", try matching the components
        if (identifier.contains(":")) {
            val basePkg = identifier.substringBefore(":")
            val suffix = identifier.substringAfter(":")

            // Special case: "com.google.android.googlequicksearchbox:gemini" -> find Gemini app
            if (basePkg == "com.google.android.googlequicksearchbox" && suffix == "gemini") {
                // Look for the standalone Gemini app first
                val geminiStandalone = allAppsList.find { it.packageName == "com.google.android.apps.bard" }
                if (geminiStandalone != null) return geminiStandalone

                // Fall back to Google QSB with Gemini activity
                val geminiInGoogle = allAppsList.find {
                    it.packageName == basePkg &&
                    (it.className?.lowercase()?.contains("gemini") == true ||
                     it.className?.lowercase()?.contains("assistant") == true ||
                     it.className?.lowercase()?.contains("bard") == true)
                }
                if (geminiInGoogle != null) return geminiInGoogle
            }

            // Try matching by base package
            val byBasePkg = allAppsList.find { it.packageName == basePkg }
            if (byBasePkg != null) return byBasePkg
        }

        // Simple package name match
        return allAppsList.find { it.packageName == identifier }
    }
    // === FIND APP BY IDENTIFIER - END ===


    private fun selectLayout(opt: LayoutOption) { dismissKeyboardAndRestore(); selectedLayoutType = opt.type; activeCustomRects = opt.customRects; if (opt.type == LAYOUT_CUSTOM_DYNAMIC) { activeCustomLayoutName = opt.name; AppPreferences.saveLastCustomLayoutName(this, opt.name) } else { activeCustomLayoutName = null; AppPreferences.saveLastCustomLayoutName(this, null) }; AppPreferences.saveLastLayout(this, opt.type); drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged(); if (isInstantMode) applyLayoutImmediate() }
    private fun saveCurrentAsCustom() { Thread { try { val rawLayouts = shellService!!.getWindowLayouts(currentDisplayId); if (rawLayouts.isEmpty()) { safeToast("Found 0 active app windows"); return@Thread }; val rectStrings = mutableListOf<String>(); for (line in rawLayouts) { val parts = line.split("|"); if (parts.size == 2) { rectStrings.add(parts[1]) } }; if (rectStrings.isEmpty()) { safeToast("Found 0 valid frames"); return@Thread }; val count = rectStrings.size; var baseName = "$count Apps - Custom"; val existingNames = AppPreferences.getCustomLayoutNames(this); var counter = 1; var finalName = "$baseName $counter"; while (existingNames.contains(finalName)) { counter++; finalName = "$baseName $counter" }; AppPreferences.saveCustomLayout(this, finalName, rectStrings.joinToString("|")); safeToast("Saved: $finalName"); uiHandler.post { switchMode(MODE_LAYOUTS) } } catch (e: Exception) { Log.e(TAG, "Failed to save custom layout", e); safeToast("Error saving: ${e.message}") } }.start() }
    private fun applyResolution(opt: ResolutionOption) { dismissKeyboardAndRestore(); if (opt.index != -1) { selectedResolutionIndex = opt.index; AppPreferences.saveDisplayResolution(this, currentDisplayId, opt.index) }; drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged(); if (isInstantMode && opt.index != -1) { Thread { val resCmd = getResolutionCommand(selectedResolutionIndex); shellService?.runCommand(resCmd); Thread.sleep(1500); uiHandler.post { applyLayoutImmediate() } }.start() } }
    private fun selectDpi(value: Int) { currentDpiSetting = if (value == -1) -1 else value.coerceIn(50, 600); AppPreferences.saveDisplayDpi(this, currentDisplayId, currentDpiSetting); Thread { try { if (currentDpiSetting == -1) { shellService?.runCommand("wm density reset -d $currentDisplayId") } else { val dpiCmd = "wm density $currentDpiSetting -d $currentDisplayId"; shellService?.runCommand(dpiCmd) } } catch(e: Exception) { e.printStackTrace() } }.start() }
    private fun changeFontSize(newSize: Float) { currentFontSize = newSize.coerceIn(10f, 30f); AppPreferences.saveFontSize(this, currentFontSize); updateGlobalFontSize(); if (currentMode == MODE_SETTINGS) { switchMode(MODE_SETTINGS) } }
    private fun changeDrawerHeight(delta: Int) { currentDrawerHeightPercent = (currentDrawerHeightPercent + delta).coerceIn(30, 100); AppPreferences.setDrawerHeightPercent(this, currentDrawerHeightPercent); updateDrawerHeight(false); if (currentMode == MODE_SETTINGS) { drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged() } }
    private fun changeDrawerWidth(delta: Int) { currentDrawerWidthPercent = (currentDrawerWidthPercent + delta).coerceIn(30, 100); AppPreferences.setDrawerWidthPercent(this, currentDrawerWidthPercent); updateDrawerHeight(false); if (currentMode == MODE_SETTINGS) { drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged() } }
    private fun pickIcon() { toggleDrawer(); try { refreshDisplayId(); val intent = Intent(this, IconPickerActivity::class.java); intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); val metrics = windowManager.maximumWindowMetrics; val w = 1000; val h = (metrics.bounds.height() * 0.7).toInt(); val x = (metrics.bounds.width() - w) / 2; val y = (metrics.bounds.height() - h) / 2; val options = android.app.ActivityOptions.makeBasic(); options.setLaunchDisplayId(currentDisplayId); options.setLaunchBounds(Rect(x, y, x+w, y+h)); startActivity(intent, options.toBundle()) } catch (e: Exception) { safeToast("Error launching picker: ${e.message}") } }
    private fun saveProfile() { var name = drawerView?.findViewById<EditText>(R.id.rofi_search_bar)?.text?.toString()?.trim(); if (name.isNullOrEmpty()) { val timestamp = SimpleDateFormat("HH:mm", Locale.getDefault()).format(Date()); name = "Profile_$timestamp" }; val pkgs = selectedAppsQueue.map { it.packageName }; AppPreferences.saveProfile(this, name, selectedLayoutType, selectedResolutionIndex, currentDpiSetting, pkgs); safeToast("Saved: $name"); drawerView?.findViewById<EditText>(R.id.rofi_search_bar)?.setText(""); switchMode(MODE_PROFILES) }
    private fun loadProfile(name: String) { val data = AppPreferences.getProfileData(this, name) ?: return; try { val parts = data.split("|"); selectedLayoutType = parts[0].toInt(); selectedResolutionIndex = parts[1].toInt(); currentDpiSetting = parts[2].toInt(); val pkgList = parts[3].split(","); selectedAppsQueue.clear(); for (pkg in pkgList) { if (pkg.isNotEmpty()) { if (pkg == PACKAGE_BLANK) { selectedAppsQueue.add(MainActivity.AppInfo(" (Blank Space)", PACKAGE_BLANK, null)) } else { val app = allAppsList.find { it.packageName == pkg }; if (app != null) selectedAppsQueue.add(app) } } }; AppPreferences.saveLastLayout(this, selectedLayoutType); AppPreferences.saveDisplayResolution(this, currentDisplayId, selectedResolutionIndex); AppPreferences.saveDisplayDpi(this, currentDisplayId, currentDpiSetting); activeProfileName = name; updateSelectedAppsDock(); safeToast("Loaded: $name"); drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged(); if (isInstantMode) applyLayoutImmediate() } catch (e: Exception) { Log.e(TAG, "Failed to load profile", e) } }
    
    // === EXECUTE LAUNCH - START ===
    // Main execution function that launches and tiles all selected apps
    private fun executeLaunch(layoutType: Int, closeDrawer: Boolean) {
        // Debounce - prevent rapid re-execution
        val now = System.currentTimeMillis()
        if (now - lastExecuteTime < EXECUTE_DEBOUNCE_MS) {
            Log.d(TAG, "executeLaunch: DEBOUNCED (too soon since last execution)")
            return
        }
        lastExecuteTime = now

        if (closeDrawer) toggleDrawer()
        refreshDisplayId()
        
        // Save queue
        val identifiers = selectedAppsQueue.map { it.getIdentifier() }
        AppPreferences.saveLastQueue(this, identifiers)
        
        Thread { 
            try { 
                // Apply resolution
                val resCmd = getResolutionCommand(selectedResolutionIndex)
                shellService?.runCommand(resCmd)
                
                // Apply DPI
                if (currentDpiSetting > 0) { 
                    shellService?.runCommand("wm density $currentDpiSetting -d $currentDisplayId")
                } else if (currentDpiSetting == -1) { 
                    shellService?.runCommand("wm density reset -d $currentDisplayId")
                }
                
                Thread.sleep(800)
                
                // Get screen dimensions
                var w = 0
                var h = 0
                val targetDim = getTargetDimensions(selectedResolutionIndex)
                if (targetDim != null) { 
                    w = targetDim.first
                    h = targetDim.second 
                } else { 
                    val dm = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager
                    val display = dm.getDisplay(currentDisplayId)
                    if (display != null) { 
                        val metrics = DisplayMetrics()
                        display.getRealMetrics(metrics)
                        w = metrics.widthPixels
                        h = metrics.heightPixels 
                    } else { 
                        val bounds = windowManager.maximumWindowMetrics.bounds
                        w = bounds.width()
                        h = bounds.height() 
                    } 
                }
                
                Log.d(TAG, "executeLaunch: Screen dimensions ${w}x${h}")
                
                // Build tile rectangles
                val rects = mutableListOf<Rect>()
                when (layoutType) { 
                    LAYOUT_FULL -> rects.add(Rect(0, 0, w, h))
                    LAYOUT_SIDE_BY_SIDE -> {
                        rects.add(Rect(0, 0, w/2, h))
                        rects.add(Rect(w/2, 0, w, h))
                    }
                    LAYOUT_TOP_BOTTOM -> {
                        rects.add(Rect(0, 0, w, h/2))
                        rects.add(Rect(0, h/2, w, h))
                    }
                    LAYOUT_TRI_EVEN -> {
                        val third = w / 3
                        rects.add(Rect(0, 0, third, h))
                        rects.add(Rect(third, 0, third * 2, h))
                        rects.add(Rect(third * 2, 0, w, h))
                    }
                    LAYOUT_CORNERS -> {
                        rects.add(Rect(0, 0, w/2, h/2))
                        rects.add(Rect(w/2, 0, w, h/2))
                        rects.add(Rect(0, h/2, w/2, h))
                        rects.add(Rect(w/2, h/2, w, h))
                    }
                    LAYOUT_TRI_SIDE_MAIN_SIDE -> {
                        val quarter = w / 4
                        rects.add(Rect(0, 0, quarter, h))
                        rects.add(Rect(quarter, 0, quarter * 3, h))
                        rects.add(Rect(quarter * 3, 0, w, h))
                    }
                    LAYOUT_QUAD_ROW_EVEN -> {
                        val quarter = w / 4
                        rects.add(Rect(0, 0, quarter, h))
                        rects.add(Rect(quarter, 0, quarter * 2, h))
                        rects.add(Rect(quarter * 2, 0, quarter * 3, h))
                        rects.add(Rect(quarter * 3, 0, w, h))
                    }
                    LAYOUT_CUSTOM_DYNAMIC -> {
                        if (activeCustomRects != null) {
                            rects.addAll(activeCustomRects!!)
                        } else {
                            rects.add(Rect(0, 0, w/2, h))
                            rects.add(Rect(w/2, 0, w, h))
                        }
                    }
                }
                
                Log.d(TAG, "executeLaunch: ${rects.size} tiles for ${selectedAppsQueue.size} apps")
                
                if (selectedAppsQueue.isEmpty()) {
                    uiHandler.post { safeToast("No apps in queue") }
                    return@Thread
                }
                
                // Handle minimized apps
                val minimizedApps = selectedAppsQueue.filter { it.isMinimized }
                for (app in minimizedApps) { 
                    if (app.packageName != PACKAGE_BLANK) { 
                        try { 
                            val basePkg = app.getBasePackage()
                            val tid = shellService?.getTaskId(basePkg, app.className) ?: -1
                            Log.d(TAG, "Minimize: ${app.label} taskId=$tid")
                            if (tid != -1) shellService?.moveTaskToBack(tid) 
                        } catch (e: Exception) { 
                            Log.e(TAG, "Failed to minimize ${app.packageName}", e) 
                        } 
                    } 
                }
                
                // Get active apps
                val activeApps = selectedAppsQueue.filter { !it.isMinimized }
                Log.d(TAG, "executeLaunch: ${activeApps.size} active apps")
                
                // Kill apps if enabled
                if (killAppOnExecute) { 
                    for (app in activeApps) { 
                        if (app.packageName != PACKAGE_BLANK) { 
                            val basePkg = app.getBasePackage()
                            Log.d(TAG, "Killing: $basePkg")
                            shellService?.forceStop(basePkg)
                        } 
                    }
                    Thread.sleep(400) 
                } else { 
                    Thread.sleep(100) 
                }
                
// === LAUNCH AND TILE APPS - START ===
                // Launches each active app with staggered timing and repositions to tile bounds
                // Special handling for Gemini: captures task ID immediately after launch before trampoline
                // Trampoline apps redirect to different activities, making the original task disappear
                // from am stack list. By capturing immediately, we cache the correct task ID.
                for (i in 0 until minOf(activeApps.size, rects.size)) {
                    val app = activeApps[i]
                    val bounds = rects[i]

                    if (app.packageName == PACKAGE_BLANK) {
                        Log.d(TAG, "Tile[$i]: Skipping blank")
                        continue
                    }

                    val basePkg = app.getBasePackage()
                    val cls = app.className

                    Log.d(TAG, "=== TILE[$i]: ${app.label} -> $bounds ===")

                    uiHandler.post {
                        debugShowAppIdentification("TILE[$i]", basePkg, cls)
                    }

                    // Stagger app launches by 800ms
                    val baseDelay = i * 800L

                    // Check if this is a Gemini app that needs immediate task capture
                    val isGeminiApp = basePkg.contains("bard") || basePkg.contains("gemini")

                    // Launch the app
                    uiHandler.postDelayed({
                        launchViaShell(basePkg, cls, bounds)
                        
                        // === GEMINI IMMEDIATE TASK CAPTURE - START ===
                        // For Gemini: capture task ID immediately after launch (before trampoline)
                        // The BardEntryPointActivity only exists briefly in am stack list
                        // We need to capture it within ~500-1000ms before it redirects
                        if (isGeminiApp) {
                            Thread {
                                try {
                                    // Try to capture the task ID quickly, before trampoline completes
                                    // Retry up to 5 times with 200ms intervals
                                    for (attempt in 1..5) {
                                        Thread.sleep(200)
                                        val taskId = shellService?.getTaskId(basePkg, cls) ?: -1
                                        Log.d(TAG, "Gemini immediate capture attempt $attempt: taskId=$taskId")
                                        
                                        // If we got a valid task ID that's not a trampoline target,
                                        // the cache should be populated now by getTaskId
                                        if (taskId > 0) {
                                            Log.d(TAG, "Gemini task captured early: taskId=$taskId")
                                            break
                                        }
                                    }
                                } catch (e: Exception) {
                                    Log.e(TAG, "Gemini immediate capture failed", e)
                                }
                            }.start()
                        }
                        // === GEMINI IMMEDIATE TASK CAPTURE - END ===
                    }, baseDelay)

                    // Reposition after app has time to start
                    // Normal apps: 3 seconds, Gemini: 5 seconds (to allow for trampoline)
                    val repositionDelay = if (isGeminiApp) {
                        5000L  // 5 seconds for Gemini
                    } else {
                        3000L  // 3 seconds for normal apps
                    }

                    uiHandler.postDelayed({
                        Thread {
                            try {
                                Log.d(TAG, "Tile[$i]: Repositioning ${app.label}")
                                shellService?.repositionTask(basePkg, cls, bounds.left, bounds.top, bounds.right, bounds.bottom)
                            } catch (e: Exception) {
                                Log.e(TAG, "Tile[$i]: Reposition failed", e)
                            }
                        }.start()
                    }, baseDelay + repositionDelay)

                    // Second attempt for reliability (7 seconds for Gemini, 5 for others)
                    val secondAttemptDelay = if (isGeminiApp) {
                        7000L
                    } else {
                        5000L
                    }

                    uiHandler.postDelayed({
                        Thread {
                            try {
                                Log.d(TAG, "Tile[$i]: Second reposition ${app.label}")
                                shellService?.repositionTask(basePkg, cls, bounds.left, bounds.top, bounds.right, bounds.bottom)
                            } catch (e: Exception) {
                                Log.e(TAG, "Tile[$i]: Second reposition failed", e)
                            }
                        }.start()
                    }, baseDelay + secondAttemptDelay)
                }
                // === LAUNCH AND TILE APPS - END ===                
                // Clear queue after execution if closing drawer
                if (closeDrawer) { 
                    uiHandler.post { 
                        selectedAppsQueue.clear()
                        updateSelectedAppsDock() 
                    } 
                }
                
                uiHandler.postDelayed({
                    safeToast("Tiling complete")
                }, (activeApps.size * 300 + 5500L))
                
            } catch (e: Exception) { 
                Log.e(TAG, "Execute Failed", e)
                uiHandler.post { safeToast("Execute Failed: ${e.message}") }
            } 
        }.start()
        
        drawerView?.findViewById<EditText>(R.id.rofi_search_bar)?.setText("") 
    }
    // === EXECUTE LAUNCH - END ===
    
    private fun calculateGCD(a: Int, b: Int): Int { return if (b == 0) a else calculateGCD(b, a % b) }

    // === SWITCH MODE - START ===
    // Switches between different drawer tabs/modes
    // Handles UI updates for search bar, icons, and list content
    private fun switchMode(mode: Int) {
        currentMode = mode
        val searchBar = drawerView!!.findViewById<EditText>(R.id.rofi_search_bar); val searchIcon = drawerView!!.findViewById<ImageView>(R.id.icon_search_mode); val iconWin = drawerView!!.findViewById<ImageView>(R.id.icon_mode_window); val iconRes = drawerView!!.findViewById<ImageView>(R.id.icon_mode_resolution); val iconDpi = drawerView!!.findViewById<ImageView>(R.id.icon_mode_dpi); val iconBlacklist = drawerView!!.findViewById<ImageView>(R.id.icon_mode_blacklist); val iconProf = drawerView!!.findViewById<ImageView>(R.id.icon_mode_profiles); val iconSet = drawerView!!.findViewById<ImageView>(R.id.icon_mode_settings); val executeBtn = drawerView!!.findViewById<ImageView>(R.id.icon_execute)
        searchIcon.setColorFilter(if(mode==MODE_SEARCH) Color.WHITE else Color.GRAY); iconWin.setColorFilter(if(mode==MODE_LAYOUTS) Color.WHITE else Color.GRAY); iconRes.setColorFilter(if(mode==MODE_RESOLUTION) Color.WHITE else Color.GRAY); iconDpi.setColorFilter(if(mode==MODE_DPI) Color.WHITE else Color.GRAY); iconBlacklist?.setColorFilter(if(mode==MODE_BLACKLIST) Color.WHITE else Color.GRAY); iconProf.setColorFilter(if(mode==MODE_PROFILES) Color.WHITE else Color.GRAY); iconSet.setColorFilter(if(mode==MODE_SETTINGS) Color.WHITE else Color.GRAY)
        executeBtn.visibility = if (isInstantMode) View.GONE else View.VISIBLE; displayList.clear(); val dock = drawerView!!.findViewById<RecyclerView>(R.id.selected_apps_recycler); dock.visibility = if (mode == MODE_SEARCH && selectedAppsQueue.isNotEmpty()) View.VISIBLE else View.GONE

        when (mode) {
            MODE_SEARCH -> { searchBar.hint = "Search apps..."; refreshSearchList() }
            MODE_LAYOUTS -> { 
                searchBar.hint = "Select Layout"; displayList.add(ActionOption("Save Current Arrangement") { saveCurrentAsCustom() }); displayList.add(LayoutOption("1 App - Full Screen", LAYOUT_FULL)); displayList.add(LayoutOption("2 Apps - Side by Side", LAYOUT_SIDE_BY_SIDE)); displayList.add(LayoutOption("2 Apps - Top & Bottom", LAYOUT_TOP_BOTTOM)); displayList.add(LayoutOption("3 Apps - Even", LAYOUT_TRI_EVEN)); displayList.add(LayoutOption("3 Apps - Side/Main/Side (25/50/25)", LAYOUT_TRI_SIDE_MAIN_SIDE)); displayList.add(LayoutOption("4 Apps - Corners", LAYOUT_CORNERS)); displayList.add(LayoutOption("4 Apps - Row (Even)", LAYOUT_QUAD_ROW_EVEN));
                val customNames = AppPreferences.getCustomLayoutNames(this).sorted(); for (name in customNames) { val data = AppPreferences.getCustomLayoutData(this, name); if (data != null) { try { val rects = mutableListOf<Rect>(); val rectParts = data.split("|"); for (rp in rectParts) { val coords = rp.split(","); if (coords.size == 4) { rects.add(Rect(coords[0].toInt(), coords[1].toInt(), coords[2].toInt(), coords[3].toInt())) } }; displayList.add(LayoutOption(name, LAYOUT_CUSTOM_DYNAMIC, true, rects)) } catch(e: Exception) {} } } 
            }
            MODE_RESOLUTION -> {
                searchBar.hint = "Select Resolution"; displayList.add(CustomResInputOption); val savedResNames = AppPreferences.getCustomResolutionNames(this).sorted(); for (name in savedResNames) { val value = AppPreferences.getCustomResolutionValue(this, name) ?: continue; displayList.add(ResolutionOption(name, "wm size  -d $currentDisplayId", 100 + savedResNames.indexOf(name))) }; displayList.add(ResolutionOption("Default (Reset)", "wm size reset -d $currentDisplayId", 0)); displayList.add(ResolutionOption("1:1 Square (1422x1500)", "wm size 1422x1500 -d $currentDisplayId", 1)); displayList.add(ResolutionOption("16:9 Landscape (1920x1080)", "wm size 1920x1080 -d $currentDisplayId", 2)); displayList.add(ResolutionOption("32:9 Ultrawide (3840x1080)", "wm size 3840x1080 -d $currentDisplayId", 3))
            }
            MODE_DPI -> { searchBar.hint = "Adjust Density (DPI)"; displayList.add(ActionOption("Reset Density (Default)") { selectDpi(-1) }); var savedDpi = currentDpiSetting; if (savedDpi <= 0) { savedDpi = displayContext?.resources?.configuration?.densityDpi ?: 160 }; displayList.add(DpiOption(savedDpi)) }
            MODE_BLACKLIST -> { searchBar.hint = "Blacklisted Apps"; loadBlacklistedApps(); executeBtn.visibility = View.GONE }
            MODE_PROFILES -> { searchBar.hint = "Enter Profile Name..."; displayList.add(ProfileOption("Save Current as New", true, 0,0,0, emptyList())); val profileNames = AppPreferences.getProfileNames(this).sorted(); for (pName in profileNames) { val data = AppPreferences.getProfileData(this, pName); if (data != null) { try { val parts = data.split("|"); val lay = parts[0].toInt(); val res = parts[1].toInt(); val d = parts[2].toInt(); val pkgs = parts[3].split(",").filter { it.isNotEmpty() }; displayList.add(ProfileOption(pName, false, lay, res, d, pkgs)) } catch(e: Exception) {} } } }
            MODE_SETTINGS -> {
                searchBar.hint = "Settings"
                // [FIX] Use restartTrackpad() (Hard Kill) to ensure Z-Order is reset properly.
                // launchTrackpad() alone is too gentle and doesn't reset the window stack.
                displayList.add(ActionOption("Launch/Reset Trackpad") { 
                    if (isBound && shellService != null) {
                        restartTrackpad() 
                    } else {
                        launchTrackpad()
                    }
                })


                displayList.add(ActionOption("Switch Display (Current $currentDisplayId)") { switchDisplay() })
                displayList.add(ToggleOption("Virtual Display (1080p)", isVirtualDisplayActive) { toggleVirtualDisplay(it) })
                displayList.add(HeightOption(currentDrawerHeightPercent))
                displayList.add(WidthOption(currentDrawerWidthPercent))
                displayList.add(ToggleOption("Auto-Shrink for Keyboard", autoResizeEnabled) { autoResizeEnabled = it; AppPreferences.setAutoResizeKeyboard(this, it) })
                displayList.add(FontSizeOption(currentFontSize))
                displayList.add(IconOption("Launcher Icon (Tap to Change)"))
                displayList.add(ToggleOption("Reorder: Drag & Drop", isReorderDragEnabled) { isReorderDragEnabled = it; AppPreferences.setReorderDrag(this, it) })
                displayList.add(ToggleOption("Reorder: Tap to Swap (Long Press)", isReorderTapEnabled) { isReorderTapEnabled = it; AppPreferences.setReorderTap(this, it) })
                displayList.add(ToggleOption("Instant Mode (Live Changes)", isInstantMode) { isInstantMode = it; AppPreferences.setInstantMode(this, it); executeBtn.visibility = if (it) View.GONE else View.VISIBLE; if (it) fetchRunningApps() })
                displayList.add(ToggleOption("Kill App on Execute", killAppOnExecute) { killAppOnExecute = it; AppPreferences.setKillOnExecute(this, it) })
                
                // --- V2.0 MENU ITEMS RESTORED ---
                
                
                // STANDARD MODE TOGGLE
                displayList.add(ToggleOption("Screen Off (Standard)", isScreenOffState && !useAltScreenOff) { 
                    if (it) {
                        if (isScreenOffState) wakeUp() // Reset if already off
                        useAltScreenOff = false
                        AppPreferences.setUseAltScreenOff(this, false)
                        performScreenOff()
                    } else {
                        wakeUp()
                    }
                })

                // ALTERNATE MODE TOGGLE
                displayList.add(ToggleOption("Screen Off (Alternate)", isScreenOffState && useAltScreenOff) { 
                    if (it) {
                        if (isScreenOffState) wakeUp() // Reset if already off
                        useAltScreenOff = true
                        AppPreferences.setUseAltScreenOff(this, true)
                        performScreenOff()
                    } else {
                        wakeUp()
                    }
                })
                
                displayList.add(ToggleOption("Auto-Start Trackpad", autoRestartTrackpad) { autoRestartTrackpad = it; AppPreferences.setAutoRestartTrackpad(this, it); if (it) safeToast("Trackpad will restart on next Launcher startup") })
                displayList.add(ToggleOption("Shizuku Warning (Icon Alert)", showShizukuWarning) { showShizukuWarning = it; AppPreferences.setShowShizukuWarning(this, it); updateBubbleIcon() })

                // NEW: Kill App Button (Added at the very bottom)
                displayList.add(ActionOption("Close DroidOS Launcher") {
                    safeToast("Closing Launcher...")
                    stopSelf() // Stop the service
                    android.os.Process.killProcess(android.os.Process.myPid()) // Force kill process
                })
            }
        }
        drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged()
    }
    // === SWITCH MODE - END ===

    object CustomResInputOption
    data class LayoutOption(val name: String, val type: Int, val isCustomSaved: Boolean = false, val customRects: List<Rect>? = null)
    data class ResolutionOption(val name: String, val command: String, val index: Int)
    data class DpiOption(val currentDpi: Int)
    data class ProfileOption(val name: String, val isCurrent: Boolean, val layout: Int, val resIndex: Int, val dpi: Int, val apps: List<String>)
    data class FontSizeOption(val currentSize: Float)
    data class HeightOption(val currentPercent: Int)
    data class WidthOption(val currentPercent: Int)
    data class IconOption(val name: String)
    data class ActionOption(val name: String, val action: () -> Unit)
    data class ToggleOption(val name: String, var isEnabled: Boolean, val onToggle: (Boolean) -> Unit)
    data class TimeoutOption(val seconds: Int)

    inner class SelectedAppsAdapter : RecyclerView.Adapter<SelectedAppsAdapter.Holder>() {
        inner class Holder(v: View) : RecyclerView.ViewHolder(v) { val icon: ImageView = v.findViewById(R.id.selected_app_icon) }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder { return Holder(LayoutInflater.from(parent.context).inflate(R.layout.item_selected_app, parent, false)) }

        // === SELECTED APPS ADAPTER BIND - START ===
        override fun onBindViewHolder(holder: Holder, position: Int) { 
            val app = selectedAppsQueue[position]
            holder.icon.clearColorFilter()
            
            if (app.packageName == PACKAGE_BLANK) { 
                holder.icon.setImageResource(R.drawable.ic_box_outline) 
            } else { 
                try { 
                    // Use packageName directly - it should be the real package, not a modified identifier
                    val iconPkg = app.packageName
                    Log.d(DEBUG_TAG, "Loading icon for position $position: ${app.label} pkg=$iconPkg")
                    holder.icon.setImageDrawable(packageManager.getApplicationIcon(iconPkg)) 
                } catch (e: Exception) { 
                    Log.e(DEBUG_TAG, "Failed to load icon for ${app.packageName}", e)
                    holder.icon.setImageResource(R.drawable.ic_launcher_bubble) 
                }
                holder.icon.alpha = if (app.isMinimized) 0.4f else 1.0f 
            }
            
            holder.itemView.setOnClickListener { 
                try { 
                    dismissKeyboardAndRestore()
                    if (reorderSelectionIndex != -1) { 
                        if (position == reorderSelectionIndex) { 
                            endReorderMode(false) 
                        } else { 
                            swapReorderItem(position) 
                        } 
                    } else { 
                        if (app.packageName != PACKAGE_BLANK) { 
                            app.isMinimized = !app.isMinimized
                            notifyItemChanged(position)
                            if (isInstantMode) applyLayoutImmediate() 
                        } 
                    } 
                } catch(e: Exception) {
                    Log.e(DEBUG_TAG, "Click handler error", e)
                } 
            }
            
            holder.itemView.setOnLongClickListener { 
                if (isReorderTapEnabled) { 
                    startReorderMode(position)
                    true 
                } else { 
                    false 
                } 
            }
        }
        // === SELECTED APPS ADAPTER BIND - END ===
        override fun getItemCount() = selectedAppsQueue.size
    }

    inner class RofiAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
        inner class AppHolder(v: View) : RecyclerView.ViewHolder(v) { val icon: ImageView = v.findViewById(R.id.rofi_app_icon); val text: TextView = v.findViewById(R.id.rofi_app_text); val star: ImageView = v.findViewById(R.id.rofi_app_star) }
        inner class LayoutHolder(v: View) : RecyclerView.ViewHolder(v) { val nameInput: EditText = v.findViewById(R.id.layout_name); val btnSave: ImageView = v.findViewById(R.id.btn_save_profile); val btnExtinguish: ImageView = v.findViewById(R.id.btn_extinguish_item) }
        inner class DpiHolder(v: View) : RecyclerView.ViewHolder(v) { val btnMinus: ImageView = v.findViewById(R.id.btn_dpi_minus); val btnPlus: ImageView = v.findViewById(R.id.btn_dpi_plus); val input: EditText = v.findViewById(R.id.input_dpi_value) }
        inner class FontSizeHolder(v: View) : RecyclerView.ViewHolder(v) { val btnMinus: ImageView = v.findViewById(R.id.btn_font_minus); val btnPlus: ImageView = v.findViewById(R.id.btn_font_plus); val textVal: TextView = v.findViewById(R.id.text_font_value) }
        inner class HeightHolder(v: View) : RecyclerView.ViewHolder(v) { val btnMinus: ImageView = v.findViewById(R.id.btn_height_minus); val btnPlus: ImageView = v.findViewById(R.id.btn_height_plus); val textVal: TextView = v.findViewById(R.id.text_height_value) }
        inner class WidthHolder(v: View) : RecyclerView.ViewHolder(v) { val btnMinus: ImageView = v.findViewById(R.id.btn_width_minus); val btnPlus: ImageView = v.findViewById(R.id.btn_width_plus); val textVal: TextView = v.findViewById(R.id.text_width_value) }
        inner class ProfileRichHolder(v: View) : RecyclerView.ViewHolder(v) { val name: EditText = v.findViewById(R.id.profile_name_text); val details: TextView = v.findViewById(R.id.profile_details_text); val iconsContainer: LinearLayout = v.findViewById(R.id.profile_icons_container); val btnSave: ImageView = v.findViewById(R.id.btn_save_profile_rich) }
        inner class IconSettingHolder(v: View) : RecyclerView.ViewHolder(v) { val preview: ImageView = v.findViewById(R.id.icon_setting_preview) }
        inner class CustomResInputHolder(v: View) : RecyclerView.ViewHolder(v) { val inputW: EditText = v.findViewById(R.id.input_res_w); val inputH: EditText = v.findViewById(R.id.input_res_h); val btnSave: ImageView = v.findViewById(R.id.btn_save_res) }

        override fun getItemViewType(position: Int): Int { return when (displayList[position]) { is MainActivity.AppInfo -> 0; is LayoutOption -> 1; is ResolutionOption -> 1; is DpiOption -> 2; is ProfileOption -> 4; is FontSizeOption -> 3; is IconOption -> 5; is ToggleOption -> 1; is ActionOption -> 6; is HeightOption -> 7; is WidthOption -> 8; is CustomResInputOption -> 9; else -> 0 } }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder { return when (viewType) { 0 -> AppHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_app_rofi, parent, false)); 1 -> LayoutHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout_option, parent, false)); 2 -> DpiHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_dpi_custom, parent, false)); 3 -> FontSizeHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_font_size, parent, false)); 4 -> ProfileRichHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_profile_rich, parent, false)); 5 -> IconSettingHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_icon_setting, parent, false)); 6 -> LayoutHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout_option, parent, false)); 7 -> HeightHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_height_setting, parent, false)); 8 -> WidthHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_width_setting, parent, false)); 9 -> CustomResInputHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_custom_resolution, parent, false)); else -> AppHolder(View(parent.context)) } }
        private fun startRename(editText: EditText) { editText.isEnabled = true; editText.isFocusable = true; editText.isFocusableInTouchMode = true; editText.requestFocus(); val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager; imm.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT) }
        private fun endRename(editText: EditText) { editText.isFocusable = false; editText.isFocusableInTouchMode = false; editText.isEnabled = false; val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager; imm.hideSoftInputFromWindow(editText.windowToken, 0) }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            val item = displayList[position]
            if (holder is AppHolder) holder.text.textSize = currentFontSize
            if (holder is LayoutHolder) holder.nameInput.textSize = currentFontSize
            if (holder is ProfileRichHolder) holder.name.textSize = currentFontSize

            // === APP HOLDER BINDING - START ===
            // Handles app item display with proper package name extraction for icons
            if (holder is AppHolder && item is MainActivity.AppInfo) {
                holder.text.text = item.label
                if (item.packageName == PACKAGE_BLANK) {
                    holder.icon.setImageResource(R.drawable.ic_box_outline)
                } else {
                    try {
                        // Extract base package name (remove ":suffix" if present)
                        val basePkg = if (item.packageName.contains(":")) item.packageName.substringBefore(":") else item.packageName
                        holder.icon.setImageDrawable(packageManager.getApplicationIcon(basePkg))
                    } catch (e: Exception) {
                        holder.icon.setImageResource(R.drawable.ic_launcher_bubble)
                    }
                }
                val isSelected = selectedAppsQueue.any { it.packageName == item.packageName }
                if (isSelected) holder.itemView.setBackgroundResource(R.drawable.bg_item_active)
                else holder.itemView.setBackgroundResource(R.drawable.bg_item_press)
                holder.star.visibility = if (item.isFavorite) View.VISIBLE else View.GONE
                holder.itemView.setOnClickListener { addToSelection(item) }
                holder.itemView.setOnLongClickListener { toggleFavorite(item); refreshSearchList(); true }
            }
            // === APP HOLDER BINDING - END ===
            else if (holder is ProfileRichHolder && item is ProfileOption) { holder.name.setText(item.name); holder.iconsContainer.removeAllViews(); if (!item.isCurrent) { for (pkg in item.apps.take(5)) { val iv = ImageView(holder.itemView.context); val lp = LinearLayout.LayoutParams(60, 60); lp.marginEnd = 8; iv.layoutParams = lp; if (pkg == PACKAGE_BLANK) { iv.setImageResource(R.drawable.ic_box_outline) } else { try { iv.setImageDrawable(packageManager.getApplicationIcon(pkg)) } catch (e: Exception) { iv.setImageResource(R.drawable.ic_launcher_bubble) } }; holder.iconsContainer.addView(iv) }; val info = "${getLayoutName(item.layout)} | ${getRatioName(item.resIndex)} | ${item.dpi}dpi"; holder.details.text = info; holder.details.visibility = View.VISIBLE; holder.btnSave.visibility = View.GONE; if (activeProfileName == item.name) { holder.itemView.setBackgroundResource(R.drawable.bg_item_active) } else { holder.itemView.setBackgroundResource(0) }; holder.itemView.setOnClickListener { dismissKeyboardAndRestore(); loadProfile(item.name) }; holder.itemView.setOnLongClickListener { startRename(holder.name); true }; val saveProfileName = { val newName = holder.name.text.toString().trim(); if (newName.isNotEmpty() && newName != item.name) { if (AppPreferences.renameProfile(holder.itemView.context, item.name, newName)) { safeToast("Renamed to $newName"); switchMode(MODE_PROFILES) } }; endRename(holder.name) }; holder.name.setOnEditorActionListener { v, actionId, _ -> if (actionId == EditorInfo.IME_ACTION_DONE) { saveProfileName(); holder.name.clearFocus(); val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager; imm.hideSoftInputFromWindow(holder.name.windowToken, 0); updateDrawerHeight(false); true } else false }; holder.name.setOnFocusChangeListener { v, hasFocus -> if (autoResizeEnabled) updateDrawerHeight(hasFocus); if (!hasFocus) saveProfileName() } } else { holder.iconsContainer.removeAllViews(); holder.details.visibility = View.GONE; holder.btnSave.visibility = View.VISIBLE; holder.itemView.setBackgroundResource(0); holder.name.isEnabled = true; holder.name.isFocusable = true; holder.name.isFocusableInTouchMode = true; holder.itemView.setOnClickListener { saveProfile() }; holder.btnSave.setOnClickListener { saveProfile() } } }
            else if (holder is LayoutHolder) {
                holder.btnSave.visibility = View.GONE; holder.btnExtinguish.visibility = View.GONE
                if (item is LayoutOption) { holder.nameInput.setText(item.name); val isSelected = if (item.type == LAYOUT_CUSTOM_DYNAMIC) { item.type == selectedLayoutType && item.name == activeCustomLayoutName } else { item.type == selectedLayoutType && activeCustomLayoutName == null }; if (isSelected) holder.itemView.setBackgroundResource(R.drawable.bg_item_active) else holder.itemView.setBackgroundResource(R.drawable.bg_item_press); holder.itemView.setOnClickListener { selectLayout(item) }; if (item.isCustomSaved) { holder.itemView.setOnLongClickListener { startRename(holder.nameInput); true }; val saveLayoutName = { val newName = holder.nameInput.text.toString().trim(); if (newName.isNotEmpty() && newName != item.name) { if (AppPreferences.renameCustomLayout(holder.itemView.context, item.name, newName)) { safeToast("Renamed to $newName"); if (activeCustomLayoutName == item.name) { activeCustomLayoutName = newName; AppPreferences.saveLastCustomLayoutName(holder.itemView.context, newName) }; switchMode(MODE_LAYOUTS) } }; endRename(holder.nameInput) }; holder.nameInput.setOnEditorActionListener { v, actionId, _ -> if (actionId == EditorInfo.IME_ACTION_DONE) { saveLayoutName(); true } else false }; holder.nameInput.setOnFocusChangeListener { v, hasFocus -> if (!hasFocus) saveLayoutName() } } else { holder.nameInput.isEnabled = false; holder.nameInput.isFocusable = false; holder.nameInput.setTextColor(Color.WHITE) } }
                else if (item is ResolutionOption) { 
                    holder.nameInput.setText(item.name); if (item.index >= 100) { holder.nameInput.isEnabled = false; holder.nameInput.setTextColor(Color.WHITE); holder.itemView.setOnLongClickListener { startRename(holder.nameInput); true }; val saveResName = { val newName = holder.nameInput.text.toString().trim(); if (newName.isNotEmpty() && newName != item.name) { if (AppPreferences.renameCustomResolution(holder.itemView.context, item.name, newName)) { safeToast("Renamed to $newName"); switchMode(MODE_RESOLUTION) } }; endRename(holder.nameInput) }; holder.nameInput.setOnEditorActionListener { v, actionId, _ -> if (actionId == EditorInfo.IME_ACTION_DONE) { saveResName(); true } else false }; holder.nameInput.setOnFocusChangeListener { v, hasFocus -> if (!hasFocus) saveResName() } } else { holder.nameInput.isEnabled = false; holder.nameInput.isFocusable = false; holder.nameInput.setTextColor(Color.WHITE) }; val isSelected = (item.index == selectedResolutionIndex); if (isSelected) holder.itemView.setBackgroundResource(R.drawable.bg_item_active) else holder.itemView.setBackgroundResource(R.drawable.bg_item_press); holder.itemView.setOnClickListener { applyResolution(item) } 
                }
                else if (item is IconOption) { holder.nameInput.setText(item.name); holder.nameInput.isEnabled = false; holder.nameInput.setTextColor(Color.WHITE); holder.itemView.setBackgroundResource(R.drawable.bg_item_press); holder.itemView.setOnClickListener { pickIcon() } }
                else if (item is ToggleOption) { holder.nameInput.setText(item.name); holder.nameInput.isEnabled = false; holder.nameInput.setTextColor(Color.WHITE); if (item.isEnabled) holder.itemView.setBackgroundResource(R.drawable.bg_item_active) else holder.itemView.setBackgroundResource(R.drawable.bg_item_press); holder.itemView.setOnClickListener { dismissKeyboardAndRestore(); item.isEnabled = !item.isEnabled; item.onToggle(item.isEnabled); notifyItemChanged(position) } } 
                else if (item is ActionOption) { holder.nameInput.setText(item.name); holder.nameInput.isEnabled = false; holder.nameInput.setTextColor(Color.WHITE); holder.itemView.setBackgroundResource(R.drawable.bg_item_press); holder.itemView.setOnClickListener { dismissKeyboardAndRestore(); item.action() } }
            }
            else if (holder is CustomResInputHolder) {
                holder.btnSave.setOnClickListener { val wStr = holder.inputW.text.toString().trim(); val hStr = holder.inputH.text.toString().trim(); if (wStr.isNotEmpty() && hStr.isNotEmpty()) { val w = wStr.toIntOrNull(); val h = hStr.toIntOrNull(); if (w != null && h != null && w > 0 && h > 0) { val gcdVal = calculateGCD(w, h); val wRatio = w / gcdVal; val hRatio = h / gcdVal; val resString = "${w}x${h}"; val name = "$wRatio:$hRatio Custom ($resString)"; AppPreferences.saveCustomResolution(holder.itemView.context, name, resString); safeToast("Added $name"); dismissKeyboardAndRestore(); switchMode(MODE_RESOLUTION) } else { safeToast("Invalid numbers") } } else { safeToast("Input W and H") } }
                holder.inputW.setOnFocusChangeListener { _, hasFocus -> if (autoResizeEnabled) updateDrawerHeight(hasFocus) }; holder.inputH.setOnFocusChangeListener { _, hasFocus -> if (autoResizeEnabled) updateDrawerHeight(hasFocus) }
            }
            else if (holder is IconSettingHolder && item is IconOption) { try { val uriStr = AppPreferences.getIconUri(holder.itemView.context); if (uriStr != null) { val uri = Uri.parse(uriStr); val input = contentResolver.openInputStream(uri); val bitmap = BitmapFactory.decodeStream(input); input?.close(); holder.preview.setImageBitmap(bitmap) } else { holder.preview.setImageResource(R.drawable.ic_launcher_bubble) } } catch(e: Exception) { holder.preview.setImageResource(R.drawable.ic_launcher_bubble) }; holder.itemView.setOnClickListener { pickIcon() } }
            else if (holder is DpiHolder && item is DpiOption) { 
                holder.input.setText(item.currentDpi.toString()); holder.input.setOnEditorActionListener { v, actionId, _ -> if (actionId == EditorInfo.IME_ACTION_DONE) { val valInt = v.text.toString().toIntOrNull(); if (valInt != null) { selectDpi(valInt); safeToast("DPI set to $valInt") }; dismissKeyboardAndRestore(); true } else false }; holder.input.setOnFocusChangeListener { _, hasFocus -> if (autoResizeEnabled) updateDrawerHeight(hasFocus); if (!hasFocus) { val valInt = holder.input.text.toString().toIntOrNull(); if (valInt != null && valInt != item.currentDpi) { selectDpi(valInt) } } }; holder.btnMinus.setOnClickListener { val v = holder.input.text.toString().toIntOrNull() ?: 160; val newVal = (v - 5).coerceAtLeast(50); holder.input.setText(newVal.toString()); selectDpi(newVal) }; holder.btnPlus.setOnClickListener { val v = holder.input.text.toString().toIntOrNull() ?: 160; val newVal = (v + 5).coerceAtMost(600); holder.input.setText(newVal.toString()); selectDpi(newVal) } 
            }
            else if (holder is FontSizeHolder && item is FontSizeOption) { holder.textVal.text = item.currentSize.toInt().toString(); holder.btnMinus.setOnClickListener { changeFontSize(item.currentSize - 1) }; holder.btnPlus.setOnClickListener { changeFontSize(item.currentSize + 1) } }
            else if (holder is HeightHolder && item is HeightOption) { holder.textVal.text = item.currentPercent.toString(); holder.btnMinus.setOnClickListener { changeDrawerHeight(-5) }; holder.btnPlus.setOnClickListener { changeDrawerHeight(5) } }
            else if (holder is WidthHolder && item is WidthOption) { holder.textVal.text = item.currentPercent.toString(); holder.btnMinus.setOnClickListener { changeDrawerWidth(-5) }; holder.btnPlus.setOnClickListener { changeDrawerWidth(5) } }
        }
        override fun getItemCount() = displayList.size
    }
}
```

## File: app/src/main/java/com/example/quadrantlauncher/FloatingLauncherService.kt.displayoff
```
package com.example.quadrantlauncher

import android.app.ActivityManager
import android.app.Service
import android.content.BroadcastReceiver
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.ServiceConnection
import android.content.pm.PackageManager
import android.graphics.BitmapFactory
import android.graphics.PixelFormat
import android.graphics.Rect
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.net.Uri
import android.hardware.display.DisplayManager
import android.os.Build
import android.os.Handler
import android.os.IBinder
import android.os.Looper
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.util.DisplayMetrics
import android.util.Log
import android.view.*
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import android.widget.TextView
import androidx.core.app.NotificationCompat
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import rikka.shizuku.Shizuku
import java.text.SimpleDateFormat
import java.util.*
import java.lang.reflect.Method
import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.hypot
import kotlin.math.min

class FloatingLauncherService : Service() {

    companion object {
        const val MODE_SEARCH = 0
        const val MODE_LAYOUTS = 2
        const val MODE_RESOLUTION = 3
        const val MODE_DPI = 4
        const val MODE_PROFILES = 5
        const val MODE_SETTINGS = 6
        
        const val LAYOUT_FULL = 1
        const val LAYOUT_SIDE_BY_SIDE = 2
        const val LAYOUT_TOP_BOTTOM = 5
        const val LAYOUT_TRI_EVEN = 3
        const val LAYOUT_CORNERS = 4
        const val LAYOUT_TRI_SIDE_MAIN_SIDE = 6
        const val LAYOUT_QUAD_ROW_EVEN = 7
        const val LAYOUT_CUSTOM_DYNAMIC = 99

        const val CHANNEL_ID = "OverlayServiceChannel"
        const val TAG = "FloatingService"
        const val DEBUG_TAG = "DROIDOS_DEBUG"
        const val ACTION_OPEN_DRAWER = "com.example.quadrantlauncher.OPEN_DRAWER"
        const val ACTION_UPDATE_ICON = "com.example.quadrantlauncher.UPDATE_ICON"
        const val HIGHLIGHT_COLOR = 0xFF00A0E9.toInt()
    }

    private lateinit var windowManager: WindowManager
    private var displayContext: Context? = null
    private var currentDisplayId = 0
    private var lastPhysicalDisplayId = Display.DEFAULT_DISPLAY 

    private var bubbleView: View? = null
    private var drawerView: View? = null
    private var debugStatusView: TextView? = null
    
    private lateinit var bubbleParams: WindowManager.LayoutParams
    private lateinit var drawerParams: WindowManager.LayoutParams

    private var isExpanded = false
    private val selectedAppsQueue = mutableListOf<MainActivity.AppInfo>()
    private val allAppsList = mutableListOf<MainActivity.AppInfo>()
    private val displayList = mutableListOf<Any>()
    
    private var activeProfileName: String? = null
    private var currentMode = MODE_SEARCH
    private var selectedLayoutType = 2
    private var selectedResolutionIndex = 0
    private var currentDpiSetting = -1
    private var currentFontSize = 16f
    
    private var activeCustomRects: List<Rect>? = null
    private var activeCustomLayoutName: String? = null
    
    private var killAppOnExecute = true
    private var targetDisplayIndex = 1 
    private var isScreenOffState = false
    private var isInstantMode = true 
    private var showShizukuWarning = true 
    private var useAltScreenOff = false
    
    private var savedBrightness: Int = -1
    private var savedAutoBrightness: Boolean = true
    
    private var isVirtualDisplayActive = false
    private var currentDrawerHeightPercent = 70
    private var currentDrawerWidthPercent = 90
    private var autoResizeEnabled = true
    
    private var reorderSelectionIndex = -1
    private var isReorderDragEnabled = true
    private var isReorderTapEnabled = true
    
    private val PACKAGE_BLANK = "internal.blank.spacer"
    private val PACKAGE_TRACKPAD = "com.katsuyamaki.DroidOSTrackpadKeyboard"
    
    private var shellService: IShellService? = null
    private var isBound = false
    private val uiHandler = Handler(Looper.getMainLooper())

    private val shizukuBinderListener = Shizuku.OnBinderReceivedListener { if (Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED) bindShizuku() }
    private val shizukuPermissionListener = Shizuku.OnRequestPermissionResultListener { _, grantResult -> if (grantResult == PackageManager.PERMISSION_GRANTED) bindShizuku() }

    private val commandReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            val action = intent?.action
            if (action == ACTION_OPEN_DRAWER) { 
                if (isScreenOffState) wakeUp() else if (!isExpanded) toggleDrawer() 
            } 
            else if (action == ACTION_UPDATE_ICON) { 
                updateBubbleIcon()
                if (currentMode == MODE_SETTINGS) switchMode(MODE_SETTINGS) 
            }
            else if (action == Intent.ACTION_SCREEN_ON) {
                if (isScreenOffState) {
                    wakeUp()
                }
            }
        }
    }
    
    private val swipeCallback = object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) {
        override fun getMovementFlags(r: RecyclerView, v: RecyclerView.ViewHolder): Int {
            val pos = v.adapterPosition; if (pos == RecyclerView.NO_POSITION || pos >= displayList.size) return 0
            val item = displayList[pos]
            val isSwipeable = when (currentMode) {
                MODE_LAYOUTS -> (item is LayoutOption && item.type == LAYOUT_CUSTOM_DYNAMIC && item.isCustomSaved)
                MODE_RESOLUTION -> (item is ResolutionOption && item.index >= 100)
                MODE_PROFILES -> (item is ProfileOption && !item.isCurrent)
                MODE_SEARCH -> true
                else -> false
            }
            return if (isSwipeable) makeMovementFlags(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) else 0
        }
        override fun onMove(r: RecyclerView, v: RecyclerView.ViewHolder, t: RecyclerView.ViewHolder): Boolean = false
        override fun onSwiped(v: RecyclerView.ViewHolder, direction: Int) {
            val pos = v.adapterPosition; if (pos == RecyclerView.NO_POSITION) return
            dismissKeyboardAndRestore()
            if (currentMode == MODE_PROFILES) { val item = displayList.getOrNull(pos) as? ProfileOption ?: return; AppPreferences.deleteProfile(this@FloatingLauncherService, item.name); safeToast("Deleted ${item.name}"); switchMode(MODE_PROFILES); return }
            if (currentMode == MODE_LAYOUTS) { val item = displayList.getOrNull(pos) as? LayoutOption ?: return; AppPreferences.deleteCustomLayout(this@FloatingLauncherService, item.name); safeToast("Deleted ${item.name}"); switchMode(MODE_LAYOUTS); return }
            if (currentMode == MODE_RESOLUTION) { val item = displayList.getOrNull(pos) as? ResolutionOption ?: return; AppPreferences.deleteCustomResolution(this@FloatingLauncherService, item.name); safeToast("Deleted ${item.name}"); switchMode(MODE_RESOLUTION); return }
            if (currentMode == MODE_SEARCH) { val item = displayList.getOrNull(pos) as? MainActivity.AppInfo ?: return; if (item.packageName == PACKAGE_BLANK) { (drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view).adapter as RofiAdapter).notifyItemChanged(pos); return }; if (direction == ItemTouchHelper.LEFT && !item.isFavorite) toggleFavorite(item) else if (direction == ItemTouchHelper.RIGHT && item.isFavorite) toggleFavorite(item); refreshSearchList() }
        }
    }

    private val selectedAppsDragCallback = object : ItemTouchHelper.SimpleCallback(ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT, ItemTouchHelper.UP or ItemTouchHelper.DOWN) {
        override fun isLongPressDragEnabled(): Boolean = isReorderDragEnabled
        
        override fun onMove(r: RecyclerView, v: RecyclerView.ViewHolder, t: RecyclerView.ViewHolder): Boolean { 
            Collections.swap(selectedAppsQueue, v.adapterPosition, t.adapterPosition)
            r.adapter?.notifyItemMoved(v.adapterPosition, t.adapterPosition)
            return true 
        }

        override fun onSwiped(v: RecyclerView.ViewHolder, direction: Int) { 
            dismissKeyboardAndRestore()
            val pos = v.adapterPosition
            if (pos != RecyclerView.NO_POSITION) { 
                val app = selectedAppsQueue[pos]
                if (app.packageName != PACKAGE_BLANK) { 
                    Thread { try { shellService?.forceStop(app.packageName) } catch(e: Exception) {} }.start()
                    safeToast("Killed ${app.label}") 
                }
                selectedAppsQueue.removeAt(pos)
                if (reorderSelectionIndex != -1) endReorderMode(false)
                updateSelectedAppsDock()
                drawerView?.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged()
                if (isInstantMode) applyLayoutImmediate() 
            } 
        }

        // Fix 1: Detect drag completion to trigger update
        override fun clearView(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder) {
            super.clearView(recyclerView, viewHolder)
            // Save the new order to prefs
            val pkgs = selectedAppsQueue.map { it.packageName }
            AppPreferences.saveLastQueue(this@FloatingLauncherService, pkgs)
            
            // Trigger layout update immediately if in Instant Mode
            if (isInstantMode) applyLayoutImmediate()
        }
    }

    private val userServiceConnection = object : ServiceConnection {
        override fun onServiceConnected(name: ComponentName?, binder: IBinder?) { shellService = IShellService.Stub.asInterface(binder); isBound = true; updateExecuteButtonColor(true); updateBubbleIcon(); safeToast("Shizuku Connected") }
        override fun onServiceDisconnected(name: ComponentName?) { shellService = null; isBound = false; updateExecuteButtonColor(false); updateBubbleIcon() }
    }

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onCreate() {
        super.onCreate()
        startForegroundService()
        try { Shizuku.addBinderReceivedListener(shizukuBinderListener); Shizuku.addRequestPermissionResultListener(shizukuPermissionListener) } catch (e: Exception) {}
        
        val filter = IntentFilter().apply { 
            addAction(ACTION_OPEN_DRAWER)
            addAction(ACTION_UPDATE_ICON)
            addAction(Intent.ACTION_SCREEN_ON)
            addAction(Intent.ACTION_SCREEN_OFF)
        }
        
        if (Build.VERSION.SDK_INT >= 33) registerReceiver(commandReceiver, filter, Context.RECEIVER_EXPORTED) else registerReceiver(commandReceiver, filter)
        try { if (rikka.shizuku.Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED) bindShizuku() } catch (e: Exception) {}
        
        loadInstalledApps(); currentFontSize = AppPreferences.getFontSize(this)
        killAppOnExecute = AppPreferences.getKillOnExecute(this); targetDisplayIndex = AppPreferences.getTargetDisplayIndex(this)
        isInstantMode = AppPreferences.getInstantMode(this); showShizukuWarning = AppPreferences.getShowShizukuWarning(this)
        useAltScreenOff = AppPreferences.getUseAltScreenOff(this); isReorderDragEnabled = AppPreferences.getReorderDrag(this)
        isReorderTapEnabled = AppPreferences.getReorderTap(this); currentDrawerHeightPercent = AppPreferences.getDrawerHeightPercent(this)
        currentDrawerWidthPercent = AppPreferences.getDrawerWidthPercent(this); autoResizeEnabled = AppPreferences.getAutoResizeKeyboard(this)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val targetDisplayId = intent?.getIntExtra("DISPLAY_ID", Display.DEFAULT_DISPLAY) ?: Display.DEFAULT_DISPLAY
        if (bubbleView != null && targetDisplayId != currentDisplayId) { try { windowManager.removeView(bubbleView); if (isExpanded) windowManager.removeView(drawerView) } catch (e: Exception) {}; setupDisplayContext(targetDisplayId); setupBubble(); setupDrawer(); updateBubbleIcon(); loadDisplaySettings(currentDisplayId); isExpanded = false; safeToast("Moved to Display $targetDisplayId") } 
        else if (bubbleView == null) { try { setupDisplayContext(targetDisplayId); setupBubble(); setupDrawer(); selectedLayoutType = AppPreferences.getLastLayout(this); activeCustomLayoutName = AppPreferences.getLastCustomLayoutName(this); updateGlobalFontSize(); updateBubbleIcon(); loadDisplaySettings(currentDisplayId); if (selectedLayoutType == LAYOUT_CUSTOM_DYNAMIC && activeCustomLayoutName != null) { val data = AppPreferences.getCustomLayoutData(this, activeCustomLayoutName!!); if (data != null) { val rects = mutableListOf<Rect>(); val rectParts = data.split("|"); for (rp in rectParts) { val coords = rp.split(","); if (coords.size == 4) rects.add(Rect(coords[0].toInt(), coords[1].toInt(), coords[2].toInt(), coords[3].toInt())) }; activeCustomRects = rects } }; try { if (shellService == null && rikka.shizuku.Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED) bindShizuku() } catch (e: Exception) {} } catch (e: Exception) { stopSelf() } }
        return START_NOT_STICKY
    }
    
    private fun loadDisplaySettings(displayId: Int) { selectedResolutionIndex = AppPreferences.getDisplayResolution(this, displayId); currentDpiSetting = AppPreferences.getDisplayDpi(this, displayId) }

    override fun onDestroy() {
        super.onDestroy()
        isScreenOffState = false
        wakeUp()
        try { Shizuku.removeBinderReceivedListener(shizukuBinderListener); Shizuku.removeRequestPermissionResultListener(shizukuPermissionListener); unregisterReceiver(commandReceiver) } catch (e: Exception) {}
        try { if (bubbleView != null) windowManager.removeView(bubbleView); if (isExpanded) windowManager.removeView(drawerView) } catch (e: Exception) {}
        if (isBound) { try { ShizukuBinder.unbind(ComponentName(packageName, ShellUserService::class.java.name), userServiceConnection); isBound = false } catch (e: Exception) {} }
    }
    
    private fun safeToast(msg: String) { 
        uiHandler.post { 
            try { Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show() } catch(e: Exception) { }
            if (debugStatusView != null) debugStatusView?.text = msg 
        }
    }
    
    private fun vibrate() {
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                val vibratorManager = getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as VibratorManager
                val vibrator = vibratorManager.defaultVibrator
                vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE))
            } else {
                val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibrator.vibrate(50)
            }
        } catch (e: Exception) {}
    }

    private fun setupDisplayContext(displayId: Int) {
        val displayManager = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager; val display = displayManager.getDisplay(displayId)
        if (display == null) { windowManager = getSystemService(WINDOW_SERVICE) as WindowManager; return }
        currentDisplayId = displayId; displayContext = createDisplayContext(display); windowManager = displayContext!!.getSystemService(Context.WINDOW_SERVICE) as WindowManager
    }
    private fun refreshDisplayId() { val id = displayContext?.display?.displayId ?: Display.DEFAULT_DISPLAY; currentDisplayId = id }
    private fun startForegroundService() { val channelId = if (android.os.Build.VERSION.SDK_INT >= 26) { val channel = android.app.NotificationChannel(CHANNEL_ID, "Floating Launcher", android.app.NotificationManager.IMPORTANCE_LOW); getSystemService(android.app.NotificationManager::class.java).createNotificationChannel(channel); CHANNEL_ID } else ""; val notification = NotificationCompat.Builder(this, channelId).setContentTitle("CoverScreen Launcher Active").setSmallIcon(R.drawable.ic_launcher_bubble).setPriority(NotificationCompat.PRIORITY_MIN).build(); if (android.os.Build.VERSION.SDK_INT >= 34) startForeground(1, notification, android.content.pm.ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE) else startForeground(1, notification) }
    private fun bindShizuku() { try { val component = ComponentName(packageName, ShellUserService::class.java.name); ShizukuBinder.bind(component, userServiceConnection, true, 1) } catch (e: Exception) { Log.e(TAG, "Bind Shizuku Failed", e) } }
    private fun updateExecuteButtonColor(isReady: Boolean) { uiHandler.post { val executeBtn = drawerView?.findViewById<ImageView>(R.id.icon_execute); if (isReady) executeBtn?.setColorFilter(Color.GREEN) else executeBtn?.setColorFilter(Color.RED) } }

    private fun setupBubble() {
        val context = displayContext ?: this
        val themeContext = ContextThemeWrapper(context, R.style.Theme_QuadrantLauncher)
        bubbleView = LayoutInflater.from(themeContext).inflate(R.layout.layout_bubble, null)
        bubbleView?.isClickable = true; bubbleView?.isFocusable = true 
        bubbleParams = WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY, WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN or WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH, PixelFormat.TRANSLUCENT)
        bubbleParams.gravity = Gravity.TOP or Gravity.START; bubbleParams.x = 50; bubbleParams.y = 200
        var velocityTracker: VelocityTracker? = null
        bubbleView?.setOnTouchListener(object : View.OnTouchListener {
            var initialX = 0; var initialY = 0; var initialTouchX = 0f; var initialTouchY = 0f; var isDrag = false
            override fun onTouch(v: View, event: MotionEvent): Boolean {
                if (velocityTracker == null) velocityTracker = VelocityTracker.obtain(); velocityTracker?.addMovement(event)
                when (event.action) {
                    MotionEvent.ACTION_DOWN -> { initialX = bubbleParams.x; initialY = bubbleParams.y; initialTouchX = event.rawX; initialTouchY = event.rawY; isDrag = false; return true }
                    MotionEvent.ACTION_MOVE -> { if (Math.abs(event.rawX - initialTouchX) > 10 || Math.abs(event.rawY - initialTouchY) > 10) isDrag = true; if (isDrag) { bubbleParams.x = initialX + (event.rawX - initialTouchX).toInt(); bubbleParams.y = initialY + (event.rawY - initialTouchY).toInt(); windowManager.updateViewLayout(bubbleView, bubbleParams) }; return true }
                    MotionEvent.ACTION_UP -> { velocityTracker?.computeCurrentVelocity(1000); val vX = velocityTracker?.xVelocity ?: 0f; val vY = velocityTracker?.yVelocity ?: 0f; val totalVel = hypot(vX.toDouble(), vY.toDouble()); if (isDrag && totalVel > 2500) { safeToast("Closing..."); stopSelf(); return true }; if (!isDrag) { if (!isBound && showShizukuWarning) { if (Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED) { bindShizuku() } else { safeToast("Shizuku NOT Connected. Opening Shizuku..."); launchShizuku() } } else { toggleDrawer() } }; velocityTracker?.recycle(); velocityTracker = null; return true }
                    MotionEvent.ACTION_CANCEL -> { velocityTracker?.recycle(); velocityTracker = null }
                }
                return false
            }
        })
        windowManager.addView(bubbleView, bubbleParams)
    }
    
    private fun launchShizuku() { try { val intent = packageManager.getLaunchIntentForPackage("moe.shizuku.privileged.api"); if (intent != null) { intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); startActivity(intent) } else { safeToast("Shizuku app not found") } } catch(e: Exception) { safeToast("Failed to launch Shizuku") } }
    private fun updateBubbleIcon() { val iconView = bubbleView?.findViewById<ImageView>(R.id.bubble_icon) ?: return; if (!isBound && showShizukuWarning) { uiHandler.post { iconView.setImageResource(android.R.drawable.ic_dialog_alert); iconView.setColorFilter(Color.RED); iconView.imageTintList = null }; return }; uiHandler.post { try { val uriStr = AppPreferences.getIconUri(this); if (uriStr != null) { val uri = Uri.parse(uriStr); val input = contentResolver.openInputStream(uri); val bitmap = BitmapFactory.decodeStream(input); input?.close(); if (bitmap != null) { iconView.setImageBitmap(bitmap); iconView.imageTintList = null; iconView.clearColorFilter() } else { iconView.setImageResource(R.drawable.ic_launcher_bubble); iconView.imageTintList = null; iconView.clearColorFilter() } } else { iconView.setImageResource(R.drawable.ic_launcher_bubble); iconView.imageTintList = null; iconView.clearColorFilter() } } catch (e: Exception) { iconView.setImageResource(R.drawable.ic_launcher_bubble); iconView.imageTintList = null; iconView.clearColorFilter() } } }
    private fun dismissKeyboardAndRestore() { val searchBar = drawerView?.findViewById<EditText>(R.id.rofi_search_bar); if (searchBar != null && searchBar.hasFocus()) { searchBar.clearFocus(); val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager; imm.hideSoftInputFromWindow(searchBar.windowToken, 0) }; val dpiInput = drawerView?.findViewById<EditText>(R.id.input_dpi_value); if (dpiInput != null && dpiInput.hasFocus()) { dpiInput.clearFocus(); val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager; imm.hideSoftInputFromWindow(dpiInput.windowToken, 0) }; updateDrawerHeight(false) }

    private fun setupDrawer() {
        val context = displayContext ?: this
        val themeContext = ContextThemeWrapper(context, R.style.Theme_QuadrantLauncher)
        drawerView = LayoutInflater.from(themeContext).inflate(R.layout.layout_rofi_drawer, null)
        drawerView!!.fitsSystemWindows = true 
        drawerParams = WindowManager.LayoutParams(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY, WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN, PixelFormat.TRANSLUCENT)
        drawerParams.gravity = Gravity.TOP or Gravity.START; drawerParams.x = 0; drawerParams.y = 0
        drawerParams.softInputMode = WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING
        
        val container = drawerView?.findViewById<LinearLayout>(R.id.drawer_container)
        if (container != null) { 
            val lp = container.layoutParams as? FrameLayout.LayoutParams
            if (lp != null) { lp.gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL; lp.topMargin = 100; container.layoutParams = lp }
            
            debugStatusView = TextView(context)
            debugStatusView?.text = "Ready"
            debugStatusView?.setTextColor(Color.GREEN)
            debugStatusView?.textSize = 10f
            debugStatusView?.gravity = Gravity.CENTER
            container.addView(debugStatusView, 0)
        }

        val searchBar = drawerView!!.findViewById<EditText>(R.id.rofi_search_bar); val mainRecycler = drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view); val selectedRecycler = drawerView!!.findViewById<RecyclerView>(R.id.selected_apps_recycler); val executeBtn = drawerView!!.findViewById<ImageView>(R.id.icon_execute)
        if (isBound) executeBtn.setColorFilter(Color.GREEN) else executeBtn.setColorFilter(Color.RED)
        drawerView!!.findViewById<ImageView>(R.id.icon_search_mode).setOnClickListener { dismissKeyboardAndRestore(); switchMode(MODE_SEARCH) }
        drawerView!!.findViewById<ImageView>(R.id.icon_mode_window).setOnClickListener { dismissKeyboardAndRestore(); switchMode(MODE_LAYOUTS) }
        drawerView!!.findViewById<ImageView>(R.id.icon_mode_resolution).setOnClickListener { dismissKeyboardAndRestore(); switchMode(MODE_RESOLUTION) }
        drawerView!!.findViewById<ImageView>(R.id.icon_mode_dpi).setOnClickListener { dismissKeyboardAndRestore(); switchMode(MODE_DPI) }
        drawerView!!.findViewById<ImageView>(R.id.icon_mode_profiles).setOnClickListener { dismissKeyboardAndRestore(); switchMode(MODE_PROFILES) }
        drawerView!!.findViewById<ImageView>(R.id.icon_mode_settings).setOnClickListener { dismissKeyboardAndRestore(); switchMode(MODE_SETTINGS) }
        executeBtn.setOnClickListener { executeLaunch(selectedLayoutType, closeDrawer = true) }
        searchBar.addTextChangedListener(object : TextWatcher { override fun afterTextChanged(s: Editable?) { filterList(s.toString()) }; override fun beforeTextChanged(s: CharSequence?, st: Int, c: Int, a: Int) {}; override fun onTextChanged(s: CharSequence?, st: Int, b: Int, c: Int) {} })
        searchBar.imeOptions = EditorInfo.IME_ACTION_DONE
        searchBar.setOnEditorActionListener { v, actionId, event -> if (actionId == EditorInfo.IME_ACTION_DONE) { dismissKeyboardAndRestore(); return@setOnEditorActionListener true }; false }
        searchBar.setOnKeyListener { _, keyCode, event -> if (keyCode == KeyEvent.KEYCODE_DEL && event.action == KeyEvent.ACTION_DOWN) { if (searchBar.text.isEmpty() && selectedAppsQueue.isNotEmpty()) { val lastIndex = selectedAppsQueue.size - 1; selectedAppsQueue.removeAt(lastIndex); updateSelectedAppsDock(); mainRecycler.adapter?.notifyDataSetChanged(); return@setOnKeyListener true } }; if (keyCode == KeyEvent.KEYCODE_BACK && event.action == KeyEvent.ACTION_UP) { if (searchBar.hasFocus()) { dismissKeyboardAndRestore(); return@setOnKeyListener true } }; return@setOnKeyListener false }
        searchBar.setOnFocusChangeListener { _, hasFocus -> if (autoResizeEnabled) { updateDrawerHeight(hasFocus) } }
        mainRecycler.layoutManager = LinearLayoutManager(themeContext); mainRecycler.adapter = RofiAdapter(); val itemTouchHelper = ItemTouchHelper(swipeCallback); itemTouchHelper.attachToRecyclerView(mainRecycler)
        mainRecycler.addOnScrollListener(object : RecyclerView.OnScrollListener() { override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) { if (newState == RecyclerView.SCROLL_STATE_DRAGGING) { dismissKeyboardAndRestore() } } })
        mainRecycler.setOnTouchListener { v, event -> if (event.action == MotionEvent.ACTION_DOWN) { dismissKeyboardAndRestore() }; false }
        selectedRecycler.layoutManager = LinearLayoutManager(themeContext, LinearLayoutManager.HORIZONTAL, false); selectedRecycler.adapter = SelectedAppsAdapter(); val dockTouchHelper = ItemTouchHelper(selectedAppsDragCallback); dockTouchHelper.attachToRecyclerView(selectedRecycler)
        drawerView!!.setOnClickListener { toggleDrawer() }
        drawerView!!.isFocusableInTouchMode = true
        drawerView!!.setOnKeyListener { _, keyCode, event -> if (keyCode == KeyEvent.KEYCODE_BACK && event.action == KeyEvent.ACTION_UP) { toggleDrawer(); true } else if (keyCode == KeyEvent.KEYCODE_VOLUME_UP && isScreenOffState) { wakeUp(); true } else false }
    }
    
    private fun startReorderMode(index: Int) { if (!isReorderTapEnabled) return; if (index < 0 || index >= selectedAppsQueue.size) return; val prevIndex = reorderSelectionIndex; reorderSelectionIndex = index; val adapter = drawerView!!.findViewById<RecyclerView>(R.id.selected_apps_recycler).adapter; if (prevIndex != -1) adapter?.notifyItemChanged(prevIndex); adapter?.notifyItemChanged(reorderSelectionIndex); safeToast("Tap another app to Swap") }
    private fun swapReorderItem(targetIndex: Int) { if (reorderSelectionIndex == -1) return; Collections.swap(selectedAppsQueue, reorderSelectionIndex, targetIndex); val adapter = drawerView!!.findViewById<RecyclerView>(R.id.selected_apps_recycler).adapter; adapter?.notifyItemChanged(reorderSelectionIndex); adapter?.notifyItemChanged(targetIndex); endReorderMode(true) }
    private fun endReorderMode(triggerInstantMode: Boolean) { val prevIndex = reorderSelectionIndex; reorderSelectionIndex = -1; val adapter = drawerView!!.findViewById<RecyclerView>(R.id.selected_apps_recycler).adapter; if (prevIndex != -1) adapter?.notifyItemChanged(prevIndex); if (triggerInstantMode && isInstantMode) applyLayoutImmediate() }
    
    private fun updateDrawerHeight(isKeyboardMode: Boolean) {
        val container = drawerView?.findViewById<LinearLayout>(R.id.drawer_container) ?: return
        val dm = DisplayMetrics(); windowManager.defaultDisplay.getRealMetrics(dm); val screenH = dm.heightPixels; val screenW = dm.widthPixels
        val lp = container.layoutParams as? FrameLayout.LayoutParams; val topMargin = lp?.topMargin ?: 100
        var finalHeight = (screenH * (currentDrawerHeightPercent / 100f)).toInt()
        if (isKeyboardMode) { finalHeight = (screenH * 0.40f).toInt(); val maxAvailable = screenH - topMargin - 20; if (finalHeight > maxAvailable) finalHeight = maxAvailable }
        val newW = (screenW * (currentDrawerWidthPercent / 100f)).toInt()
        if (container.layoutParams.height != finalHeight || container.layoutParams.width != newW) { container.layoutParams.width = newW; container.layoutParams.height = finalHeight; container.requestLayout(); if (drawerParams.y != 0) { drawerParams.y = 0; windowManager.updateViewLayout(drawerView, drawerParams) } }
    }

    private fun toggleDrawer() {
        if (isExpanded) { try { windowManager.removeView(drawerView) } catch(e: Exception) {}; bubbleView?.visibility = View.VISIBLE; isExpanded = false } else { setupDisplayContext(currentDisplayId); updateDrawerHeight(false); try { windowManager.addView(drawerView, drawerParams) } catch(e: Exception) {}; bubbleView?.visibility = View.GONE; isExpanded = true; switchMode(MODE_SEARCH); val et = drawerView?.findViewById<EditText>(R.id.rofi_search_bar); et?.setText(""); et?.clearFocus(); updateSelectedAppsDock(); if (isInstantMode) fetchRunningApps() }
    }
    private fun updateGlobalFontSize() { val searchBar = drawerView?.findViewById<EditText>(R.id.rofi_search_bar); searchBar?.textSize = currentFontSize; drawerView?.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged() }
    private fun loadInstalledApps() { val pm = packageManager; val intent = Intent(Intent.ACTION_MAIN, null).apply { addCategory(Intent.CATEGORY_LAUNCHER) }; val riList = pm.queryIntentActivities(intent, 0); allAppsList.clear(); allAppsList.add(MainActivity.AppInfo(" (Blank Space)", PACKAGE_BLANK)); for (ri in riList) { val pkg = ri.activityInfo.packageName; if (pkg == PACKAGE_TRACKPAD) continue; val app = MainActivity.AppInfo(ri.loadLabel(pm).toString(), pkg, AppPreferences.isFavorite(this, pkg)); allAppsList.add(app) }; allAppsList.sortBy { it.label.lowercase() } }
    
    private fun launchTrackpad() {
        if (isTrackpadRunning()) { safeToast("Trackpad is already active"); return }
        try { val intent = packageManager.getLaunchIntentForPackage(PACKAGE_TRACKPAD); if (intent != null) { intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP); val dm = DisplayMetrics(); val display = displayContext?.display ?: windowManager.defaultDisplay; display.getRealMetrics(dm); val w = dm.widthPixels; val h = dm.heightPixels; val targetW = (w * 0.5f).toInt(); val targetH = (h * 0.5f).toInt(); val left = (w - targetW) / 2; val top = (h - targetH) / 2; val bounds = Rect(left, top, left + targetW, top + targetH); val options = android.app.ActivityOptions.makeBasic(); options.setLaunchDisplayId(currentDisplayId); options.setLaunchBounds(Rect(left, top, left + targetW, top + targetH)); try { val method = android.app.ActivityOptions::class.java.getMethod("setLaunchWindowingMode", Int::class.javaPrimitiveType); method.invoke(options, 5) } catch (e: Exception) {}; startActivity(intent, options.toBundle()); toggleDrawer(); if (shellService != null) { uiHandler.postDelayed({ Thread { try { shellService?.repositionTask(PACKAGE_TRACKPAD, left, top, left+targetW, top+targetH) } catch(e: Exception) { Log.e(TAG, "Shell launch failed", e) } }.start() }, 400) } } else { safeToast("Trackpad App not found") } } catch (e: Exception) { safeToast("Error launching Trackpad") }
    }

    private fun isTrackpadRunning(): Boolean { try { val am = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager; val runningApps = am.runningAppProcesses; if (runningApps != null) { for (info in runningApps) { if (info.processName == PACKAGE_TRACKPAD) return true } } } catch (e: Exception) {}; return false }
    private fun getLayoutName(type: Int): String { return when(type) { LAYOUT_FULL -> "1 App - Full"; LAYOUT_SIDE_BY_SIDE -> "Split"; LAYOUT_TOP_BOTTOM -> "Top/Bot"; LAYOUT_TRI_EVEN -> "Tri-Split"; LAYOUT_CORNERS -> "Quadrant"; LAYOUT_TRI_SIDE_MAIN_SIDE -> "3 Apps - Side/Main/Side"; LAYOUT_QUAD_ROW_EVEN -> "4 Apps - Row"; LAYOUT_CUSTOM_DYNAMIC -> "Custom"; else -> "Unknown" } }
    private fun getRatioName(index: Int): String { return when(index) { 1 -> "1:1"; 2 -> "16:9"; 3 -> "32:9"; else -> "Default" } }
    private fun getTargetDimensions(index: Int): Pair<Int, Int>? { return when(index) { 1 -> 1422 to 1500; 2 -> 1920 to 1080; 3 -> 3840 to 1080; else -> null } }
    private fun getResolutionCommand(index: Int): String { return when(index) { 1 -> "wm size 1422x1500 -d $currentDisplayId"; 2 -> "wm size 1920x1080 -d $currentDisplayId"; 3 -> "wm size 3840x1080 -d $currentDisplayId"; else -> "wm size reset -d $currentDisplayId" } }
    private fun sortAppQueue() { selectedAppsQueue.sortWith(compareBy { it.isMinimized }) }
    private fun updateSelectedAppsDock() { val dock = drawerView!!.findViewById<RecyclerView>(R.id.selected_apps_recycler); if (selectedAppsQueue.isEmpty()) { dock.visibility = View.GONE } else { dock.visibility = View.VISIBLE; dock.adapter?.notifyDataSetChanged(); dock.scrollToPosition(selectedAppsQueue.size - 1) } }
    private fun refreshSearchList() { val query = drawerView?.findViewById<EditText>(R.id.rofi_search_bar)?.text?.toString() ?: ""; filterList(query) }
    private fun filterList(query: String) {
        if (currentMode != MODE_SEARCH) return; val actualQuery = query.substringAfterLast(",").trim(); displayList.clear()
        val filtered = if (actualQuery.isEmpty()) { allAppsList } else { allAppsList.filter { it.label.contains(actualQuery, ignoreCase = true) } }
        val sorted = filtered.sortedWith(compareBy<MainActivity.AppInfo> { it.packageName != PACKAGE_BLANK }.thenByDescending { it.isFavorite }.thenBy { it.label.lowercase() }); displayList.addAll(sorted); drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged()
    }
    private fun addToSelection(app: MainActivity.AppInfo) {
        dismissKeyboardAndRestore(); val et = drawerView!!.findViewById<EditText>(R.id.rofi_search_bar)
        if (app.packageName == PACKAGE_BLANK) { selectedAppsQueue.add(app); sortAppQueue(); updateSelectedAppsDock(); drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged(); if (isInstantMode) applyLayoutImmediate(); return }
        val existing = selectedAppsQueue.find { it.packageName == app.packageName }; if (existing != null) { selectedAppsQueue.remove(existing); Thread { try { shellService?.forceStop(app.packageName) } catch(e: Exception) {} }.start(); safeToast("Removed ${app.label}"); sortAppQueue(); updateSelectedAppsDock(); drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged(); et.setText(""); if (isInstantMode) applyLayoutImmediate() } 
        else { app.isMinimized = false; selectedAppsQueue.add(app); sortAppQueue(); updateSelectedAppsDock(); drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged(); et.setText(""); if (isInstantMode) { launchViaApi(app.packageName, null); launchViaShell(app.packageName); uiHandler.postDelayed({ applyLayoutImmediate() }, 200); uiHandler.postDelayed({ applyLayoutImmediate() }, 800) } }
    }
    private fun toggleFavorite(app: MainActivity.AppInfo) { val newState = AppPreferences.toggleFavorite(this, app.packageName); app.isFavorite = newState; allAppsList.find { it.packageName == app.packageName }?.isFavorite = newState }
    private fun launchViaApi(pkg: String, bounds: Rect?) { try { val intent = packageManager.getLaunchIntentForPackage(pkg) ?: return; intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP); val options = android.app.ActivityOptions.makeBasic(); options.setLaunchDisplayId(currentDisplayId); if (bounds != null) options.setLaunchBounds(bounds); startActivity(intent, options.toBundle()) } catch (e: Exception) {} }
    private fun launchViaShell(pkg: String) { try { val intent = packageManager.getLaunchIntentForPackage(pkg) ?: return; if (shellService != null) { val component = intent.component?.flattenToShortString() ?: pkg; val cmd = "am start -n $component -a android.intent.action.MAIN -c android.intent.category.LAUNCHER --display $currentDisplayId --windowingMode 5 --user 0"; Thread { shellService?.runCommand(cmd) }.start() } } catch (e: Exception) {} }
    
    private fun cycleDisplay() {
        val dm = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager; val displays = dm.displays
        if (isVirtualDisplayActive) { val virtualDisp = displays.firstOrNull { it.displayId >= 2 }; if (virtualDisp != null) { val targetId = if (currentDisplayId == virtualDisp.displayId) { if (displays.any { it.displayId == lastPhysicalDisplayId }) lastPhysicalDisplayId else Display.DEFAULT_DISPLAY } else { lastPhysicalDisplayId = currentDisplayId; virtualDisp.displayId }; performDisplayChange(targetId); return } }
        val currentIdx = displays.indexOfFirst { it.displayId == currentDisplayId }; val nextIdx = if (currentIdx == -1) 0 else (currentIdx + 1) % displays.size; performDisplayChange(displays[nextIdx].displayId)
    }
    private fun performDisplayChange(newId: Int) {
        val dm = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager; val targetDisplay = dm.getDisplay(newId) ?: return; try { if (bubbleView != null && bubbleView!!.isAttachedToWindow) windowManager.removeView(bubbleView); if (drawerView != null && drawerView!!.isAttachedToWindow) windowManager.removeView(drawerView) } catch (e: Exception) {}; currentDisplayId = newId; setupDisplayContext(currentDisplayId); targetDisplayIndex = currentDisplayId; AppPreferences.setTargetDisplayIndex(this, targetDisplayIndex); setupBubble(); setupDrawer(); loadDisplaySettings(currentDisplayId); updateBubbleIcon(); isExpanded = false; safeToast("Switched to Display $currentDisplayId (${targetDisplay.name})")
    }
    private fun toggleVirtualDisplay(enable: Boolean) { isVirtualDisplayActive = enable; Thread { try { if (enable) { shellService?.runCommand("settings put global overlay_display_devices \"1920x1080/320\""); uiHandler.post { safeToast("Creating Virtual Display... Wait a moment, then Switch Display.") } } else { shellService?.runCommand("settings delete global overlay_display_devices"); uiHandler.post { safeToast("Destroying Virtual Display...") } } } catch (e: Exception) { Log.e(TAG, "Virtual Display Toggle Failed", e) } }.start(); if (currentMode == MODE_SETTINGS) uiHandler.postDelayed({ switchMode(MODE_SETTINGS) }, 500) }

    private fun performScreenOff() {
        vibrate()
        isScreenOffState = true
        safeToast("Screen Off: Double press Power Button to turn on")
        
        if (useAltScreenOff) {
             Thread {
                 try {
                     if (shellService != null) {
                         shellService?.setBrightness(0, -1)
                         uiHandler.post { safeToast("Pixels OFF (Alternate Mode)") }
                     } else {
                         safeToast("Service Disconnected!")
                     }
                 } catch (e: Exception) {
                     Log.e(TAG, "Binder Call Failed", e)
                     safeToast("Error: ${e.message}")
                 }
            }.start()
        } else {
            Thread { try { shellService?.setScreenOff(0, true) } catch (e: Exception) {} }.start()
            safeToast("Screen OFF (SurfaceControl)")
        }
    }
    
    private fun wakeUp() {
        vibrate()
        isScreenOffState = false
        
        Thread { try { shellService?.setBrightness(0, 128) } catch (e: Exception) {} }.start()
        Thread { try { shellService?.setScreenOff(0, false) } catch (e: Exception) {} }.start()

        safeToast("Screen On")
        if (currentMode == MODE_SETTINGS) drawerView?.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged()
    }

    private fun applyLayoutImmediate() { executeLaunch(selectedLayoutType, closeDrawer = false) }
    private fun fetchRunningApps() { if (shellService == null) return; Thread { try { val visiblePackages = shellService!!.getVisiblePackages(currentDisplayId); val allRunning = shellService!!.getAllRunningPackages(); val lastQueue = AppPreferences.getLastQueue(this); uiHandler.post { selectedAppsQueue.clear(); for (pkg in lastQueue) { if (pkg == PACKAGE_BLANK) { selectedAppsQueue.add(MainActivity.AppInfo(" (Blank Space)", PACKAGE_BLANK)) } else if (allRunning.contains(pkg)) { val appInfo = allAppsList.find { it.packageName == pkg }; if (appInfo != null) { appInfo.isMinimized = !visiblePackages.contains(pkg); selectedAppsQueue.add(appInfo) } } }; for (pkg in visiblePackages) { if (!lastQueue.contains(pkg)) { val appInfo = allAppsList.find { it.packageName == pkg }; if (appInfo != null) { appInfo.isMinimized = false; selectedAppsQueue.add(appInfo) } } }; sortAppQueue(); updateSelectedAppsDock(); drawerView?.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged(); safeToast("Instant Mode: Active") } } catch (e: Exception) { Log.e(TAG, "Error fetching apps", e) } }.start() }
    private fun selectLayout(opt: LayoutOption) { dismissKeyboardAndRestore(); selectedLayoutType = opt.type; activeCustomRects = opt.customRects; if (opt.type == LAYOUT_CUSTOM_DYNAMIC) { activeCustomLayoutName = opt.name; AppPreferences.saveLastCustomLayoutName(this, opt.name) } else { activeCustomLayoutName = null; AppPreferences.saveLastCustomLayoutName(this, null) }; AppPreferences.saveLastLayout(this, opt.type); drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged(); if (isInstantMode) applyLayoutImmediate() }
    private fun saveCurrentAsCustom() { Thread { try { val rawLayouts = shellService!!.getWindowLayouts(currentDisplayId); if (rawLayouts.isEmpty()) { safeToast("Found 0 active app windows"); return@Thread }; val rectStrings = mutableListOf<String>(); for (line in rawLayouts) { val parts = line.split("|"); if (parts.size == 2) { rectStrings.add(parts[1]) } }; if (rectStrings.isEmpty()) { safeToast("Found 0 valid frames"); return@Thread }; val count = rectStrings.size; var baseName = "$count Apps - Custom"; val existingNames = AppPreferences.getCustomLayoutNames(this); var counter = 1; var finalName = "$baseName $counter"; while (existingNames.contains(finalName)) { counter++; finalName = "$baseName $counter" }; AppPreferences.saveCustomLayout(this, finalName, rectStrings.joinToString("|")); safeToast("Saved: $finalName"); uiHandler.post { switchMode(MODE_LAYOUTS) } } catch (e: Exception) { Log.e(TAG, "Failed to save custom layout", e); safeToast("Error saving: ${e.message}") } }.start() }
    private fun applyResolution(opt: ResolutionOption) { dismissKeyboardAndRestore(); if (opt.index != -1) { selectedResolutionIndex = opt.index; AppPreferences.saveDisplayResolution(this, currentDisplayId, opt.index) }; drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged(); if (isInstantMode && opt.index != -1) { Thread { val resCmd = getResolutionCommand(selectedResolutionIndex); shellService?.runCommand(resCmd); Thread.sleep(1500); uiHandler.post { applyLayoutImmediate() } }.start() } }
    private fun selectDpi(value: Int) { currentDpiSetting = if (value == -1) -1 else value.coerceIn(50, 600); AppPreferences.saveDisplayDpi(this, currentDisplayId, currentDpiSetting); Thread { try { if (currentDpiSetting == -1) { shellService?.runCommand("wm density reset -d $currentDisplayId") } else { val dpiCmd = "wm density $currentDpiSetting -d $currentDisplayId"; shellService?.runCommand(dpiCmd) } } catch(e: Exception) { e.printStackTrace() } }.start() }
    private fun changeFontSize(newSize: Float) { currentFontSize = newSize.coerceIn(10f, 30f); AppPreferences.saveFontSize(this, currentFontSize); updateGlobalFontSize(); if (currentMode == MODE_SETTINGS) { switchMode(MODE_SETTINGS) } }
    private fun changeDrawerHeight(delta: Int) { currentDrawerHeightPercent = (currentDrawerHeightPercent + delta).coerceIn(30, 100); AppPreferences.setDrawerHeightPercent(this, currentDrawerHeightPercent); updateDrawerHeight(false); if (currentMode == MODE_SETTINGS) { drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged() } }
    private fun changeDrawerWidth(delta: Int) { currentDrawerWidthPercent = (currentDrawerWidthPercent + delta).coerceIn(30, 100); AppPreferences.setDrawerWidthPercent(this, currentDrawerWidthPercent); updateDrawerHeight(false); if (currentMode == MODE_SETTINGS) { drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged() } }
    private fun pickIcon() { toggleDrawer(); try { refreshDisplayId(); val intent = Intent(this, IconPickerActivity::class.java); intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); val metrics = windowManager.maximumWindowMetrics; val w = 1000; val h = (metrics.bounds.height() * 0.7).toInt(); val x = (metrics.bounds.width() - w) / 2; val y = (metrics.bounds.height() - h) / 2; val options = android.app.ActivityOptions.makeBasic(); options.setLaunchDisplayId(currentDisplayId); options.setLaunchBounds(Rect(x, y, x+w, y+h)); startActivity(intent, options.toBundle()) } catch (e: Exception) { safeToast("Error launching picker: ${e.message}") } }
    private fun saveProfile() { var name = drawerView?.findViewById<EditText>(R.id.rofi_search_bar)?.text?.toString()?.trim(); if (name.isNullOrEmpty()) { val timestamp = SimpleDateFormat("HH:mm", Locale.getDefault()).format(Date()); name = "Profile_$timestamp" }; val pkgs = selectedAppsQueue.map { it.packageName }; AppPreferences.saveProfile(this, name, selectedLayoutType, selectedResolutionIndex, currentDpiSetting, pkgs); safeToast("Saved: $name"); drawerView?.findViewById<EditText>(R.id.rofi_search_bar)?.setText(""); switchMode(MODE_PROFILES) }
    private fun loadProfile(name: String) { val data = AppPreferences.getProfileData(this, name) ?: return; try { val parts = data.split("|"); selectedLayoutType = parts[0].toInt(); selectedResolutionIndex = parts[1].toInt(); currentDpiSetting = parts[2].toInt(); val pkgList = parts[3].split(","); selectedAppsQueue.clear(); for (pkg in pkgList) { if (pkg.isNotEmpty()) { if (pkg == PACKAGE_BLANK) { selectedAppsQueue.add(MainActivity.AppInfo(" (Blank Space)", PACKAGE_BLANK)) } else { val app = allAppsList.find { it.packageName == pkg }; if (app != null) selectedAppsQueue.add(app) } } }; AppPreferences.saveLastLayout(this, selectedLayoutType); AppPreferences.saveDisplayResolution(this, currentDisplayId, selectedResolutionIndex); AppPreferences.saveDisplayDpi(this, currentDisplayId, currentDpiSetting); activeProfileName = name; updateSelectedAppsDock(); safeToast("Loaded: $name"); drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged(); if (isInstantMode) applyLayoutImmediate() } catch (e: Exception) { Log.e(TAG, "Failed to load profile", e) } }
    
    private fun executeLaunch(layoutType: Int, closeDrawer: Boolean) { 
        if (closeDrawer) toggleDrawer(); refreshDisplayId(); val pkgs = selectedAppsQueue.map { it.packageName }; AppPreferences.saveLastQueue(this, pkgs)
        Thread { try { val resCmd = getResolutionCommand(selectedResolutionIndex); shellService?.runCommand(resCmd); if (currentDpiSetting > 0) { val dpiCmd = "wm density $currentDpiSetting -d $currentDisplayId"; shellService?.runCommand(dpiCmd) } else { if (currentDpiSetting == -1) shellService?.runCommand("wm density reset -d $currentDisplayId") }; Thread.sleep(800); val targetDim = getTargetDimensions(selectedResolutionIndex); var w = 0; var h = 0; if (targetDim != null) { w = targetDim.first; h = targetDim.second } else { val dm = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager; val display = dm.getDisplay(currentDisplayId); if (display != null) { val metrics = DisplayMetrics(); display.getRealMetrics(metrics); w = metrics.widthPixels; h = metrics.heightPixels } else { val bounds = windowManager.maximumWindowMetrics.bounds; w = bounds.width(); h = bounds.height() } }; val rects = mutableListOf<Rect>(); when (layoutType) { LAYOUT_FULL -> { rects.add(Rect(0, 0, w, h)) }; LAYOUT_SIDE_BY_SIDE -> { rects.add(Rect(0, 0, w/2, h)); rects.add(Rect(w/2, 0, w, h)) }; LAYOUT_TOP_BOTTOM -> { rects.add(Rect(0, 0, w, h/2)); rects.add(Rect(0, h/2, w, h)) }; LAYOUT_TRI_EVEN -> { val third = w / 3; rects.add(Rect(0, 0, third, h)); rects.add(Rect(third, 0, third * 2, h)); rects.add(Rect(third * 2, 0, w, h)) }; LAYOUT_CORNERS -> { rects.add(Rect(0, 0, w/2, h/2)); rects.add(Rect(w/2, 0, w, h/2)); rects.add(Rect(0, h/2, w/2, h)); rects.add(Rect(w/2, h/2, w, h)) }; LAYOUT_TRI_SIDE_MAIN_SIDE -> { val quarter = w / 4; rects.add(Rect(0, 0, quarter, h)); rects.add(Rect(quarter, 0, quarter * 3, h)); rects.add(Rect(quarter * 3, 0, w, h)) }; LAYOUT_QUAD_ROW_EVEN -> { val quarter = w / 4; rects.add(Rect(0, 0, quarter, h)); rects.add(Rect(quarter, 0, quarter * 2, h)); rects.add(Rect(quarter * 2, 0, quarter * 3, h)); rects.add(Rect(quarter * 3, 0, w, h)) }; LAYOUT_CUSTOM_DYNAMIC -> { if (activeCustomRects != null) { rects.addAll(activeCustomRects!!) } else { rects.add(Rect(0, 0, w/2, h)); rects.add(Rect(w/2, 0, w, h)) } } }; if (selectedAppsQueue.isNotEmpty()) { val minimizedApps = selectedAppsQueue.filter { it.isMinimized }; for (app in minimizedApps) { if (app.packageName != PACKAGE_BLANK) { try { val tid = shellService?.getTaskId(app.packageName) ?: -1; if (tid != -1) shellService?.moveTaskToBack(tid) } catch (e: Exception) { Log.e(TAG, "Failed to minimize ${app.packageName}", e) } } }; val activeApps = selectedAppsQueue.filter { !it.isMinimized }; if (killAppOnExecute) { for (app in activeApps) { if (app.packageName != PACKAGE_BLANK) { shellService?.forceStop(app.packageName) } }; Thread.sleep(400) } else { Thread.sleep(100) }; val count = Math.min(activeApps.size, rects.size); for (i in 0 until count) { val pkg = activeApps[i].packageName; val bounds = rects[i]; if (pkg == PACKAGE_BLANK) continue; uiHandler.postDelayed({ launchViaApi(pkg, bounds) }, (i * 150).toLong()); uiHandler.postDelayed({ launchViaShell(pkg) }, (i * 150 + 50).toLong()); if (!killAppOnExecute) { uiHandler.postDelayed({ Thread { try { shellService?.repositionTask(pkg, bounds.left, bounds.top, bounds.right, bounds.bottom) } catch (e: Exception) {} }.start() }, (i * 150 + 150).toLong()) }; uiHandler.postDelayed({ Thread { try { shellService?.repositionTask(pkg, bounds.left, bounds.top, bounds.right, bounds.bottom) } catch (e: Exception) {} }.start() }, (i * 150 + 800).toLong()) }; if (closeDrawer) { uiHandler.post { selectedAppsQueue.clear(); updateSelectedAppsDock() } } } } catch (e: Exception) { Log.e(TAG, "Execute Failed", e); safeToast("Execute Failed: ${e.message}") } }.start(); drawerView?.findViewById<EditText>(R.id.rofi_search_bar)?.setText("") 
    }
 
    
    private fun calculateGCD(a: Int, b: Int): Int { return if (b == 0) a else calculateGCD(b, a % b) }

    private fun switchMode(mode: Int) {
        currentMode = mode
        val searchBar = drawerView!!.findViewById<EditText>(R.id.rofi_search_bar); val searchIcon = drawerView!!.findViewById<ImageView>(R.id.icon_search_mode); val iconWin = drawerView!!.findViewById<ImageView>(R.id.icon_mode_window); val iconRes = drawerView!!.findViewById<ImageView>(R.id.icon_mode_resolution); val iconDpi = drawerView!!.findViewById<ImageView>(R.id.icon_mode_dpi); val iconProf = drawerView!!.findViewById<ImageView>(R.id.icon_mode_profiles); val iconSet = drawerView!!.findViewById<ImageView>(R.id.icon_mode_settings); val executeBtn = drawerView!!.findViewById<ImageView>(R.id.icon_execute)
        searchIcon.setColorFilter(if(mode==MODE_SEARCH) Color.WHITE else Color.GRAY); iconWin.setColorFilter(if(mode==MODE_LAYOUTS) Color.WHITE else Color.GRAY); iconRes.setColorFilter(if(mode==MODE_RESOLUTION) Color.WHITE else Color.GRAY); iconDpi.setColorFilter(if(mode==MODE_DPI) Color.WHITE else Color.GRAY); iconProf.setColorFilter(if(mode==MODE_PROFILES) Color.WHITE else Color.GRAY); iconSet.setColorFilter(if(mode==MODE_SETTINGS) Color.WHITE else Color.GRAY)
        executeBtn.visibility = if (isInstantMode) View.GONE else View.VISIBLE; displayList.clear(); val dock = drawerView!!.findViewById<RecyclerView>(R.id.selected_apps_recycler); dock.visibility = if (mode == MODE_SEARCH && selectedAppsQueue.isNotEmpty()) View.VISIBLE else View.GONE
        
        when (mode) {
            MODE_SEARCH -> { searchBar.hint = "Search apps..."; refreshSearchList() }
            MODE_LAYOUTS -> { 
                searchBar.hint = "Select Layout"; displayList.add(ActionOption("Save Current Arrangement") { saveCurrentAsCustom() }); displayList.add(LayoutOption("1 App - Full Screen", LAYOUT_FULL)); displayList.add(LayoutOption("2 Apps - Side by Side", LAYOUT_SIDE_BY_SIDE)); displayList.add(LayoutOption("2 Apps - Top & Bottom", LAYOUT_TOP_BOTTOM)); displayList.add(LayoutOption("3 Apps - Even", LAYOUT_TRI_EVEN)); displayList.add(LayoutOption("3 Apps - Side/Main/Side (25/50/25)", LAYOUT_TRI_SIDE_MAIN_SIDE)); displayList.add(LayoutOption("4 Apps - Corners", LAYOUT_CORNERS)); displayList.add(LayoutOption("4 Apps - Row (Even)", LAYOUT_QUAD_ROW_EVEN));
                val customNames = AppPreferences.getCustomLayoutNames(this).sorted(); for (name in customNames) { val data = AppPreferences.getCustomLayoutData(this, name); if (data != null) { try { val rects = mutableListOf<Rect>(); val rectParts = data.split("|"); for (rp in rectParts) { val coords = rp.split(","); if (coords.size == 4) { rects.add(Rect(coords[0].toInt(), coords[1].toInt(), coords[2].toInt(), coords[3].toInt())) } }; displayList.add(LayoutOption(name, LAYOUT_CUSTOM_DYNAMIC, true, rects)) } catch(e: Exception) {} } } 
            }
            MODE_RESOLUTION -> {
                searchBar.hint = "Select Resolution"; displayList.add(CustomResInputOption); val savedResNames = AppPreferences.getCustomResolutionNames(this).sorted(); for (name in savedResNames) { val value = AppPreferences.getCustomResolutionValue(this, name) ?: continue; displayList.add(ResolutionOption(name, "wm size  -d $currentDisplayId", 100 + savedResNames.indexOf(name))) }; displayList.add(ResolutionOption("Default (Reset)", "wm size reset -d $currentDisplayId", 0)); displayList.add(ResolutionOption("1:1 Square (1422x1500)", "wm size 1422x1500 -d $currentDisplayId", 1)); displayList.add(ResolutionOption("16:9 Landscape (1920x1080)", "wm size 1920x1080 -d $currentDisplayId", 2)); displayList.add(ResolutionOption("32:9 Ultrawide (3840x1080)", "wm size 3840x1080 -d $currentDisplayId", 3))
            }
            MODE_DPI -> { searchBar.hint = "Adjust Density (DPI)"; displayList.add(ActionOption("Reset Density (Default)") { selectDpi(-1) }); var savedDpi = currentDpiSetting; if (savedDpi <= 0) { savedDpi = displayContext?.resources?.configuration?.densityDpi ?: 160 }; displayList.add(DpiOption(savedDpi)) }
            MODE_PROFILES -> { searchBar.hint = "Enter Profile Name..."; displayList.add(ProfileOption("Save Current as New", true, 0,0,0, emptyList())); val profileNames = AppPreferences.getProfileNames(this).sorted(); for (pName in profileNames) { val data = AppPreferences.getProfileData(this, pName); if (data != null) { try { val parts = data.split("|"); val lay = parts[0].toInt(); val res = parts[1].toInt(); val d = parts[2].toInt(); val pkgs = parts[3].split(",").filter { it.isNotEmpty() }; displayList.add(ProfileOption(pName, false, lay, res, d, pkgs)) } catch(e: Exception) {} } } }
            MODE_SETTINGS -> {
                searchBar.hint = "Settings"
                displayList.add(ActionOption("Launch DroidOS Trackpad") { launchTrackpad() }) 
                displayList.add(ActionOption("Switch Display (Current $currentDisplayId)") { cycleDisplay() })
                displayList.add(ToggleOption("Virtual Display (1080p)", isVirtualDisplayActive) { toggleVirtualDisplay(it) })
                displayList.add(HeightOption(currentDrawerHeightPercent))
                displayList.add(WidthOption(currentDrawerWidthPercent))
                displayList.add(ToggleOption("Auto-Shrink for Keyboard", autoResizeEnabled) { autoResizeEnabled = it; AppPreferences.setAutoResizeKeyboard(this, it) })
                displayList.add(FontSizeOption(currentFontSize))
                displayList.add(IconOption("Launcher Icon (Tap to Change)"))
                displayList.add(ToggleOption("Reorder: Drag & Drop", isReorderDragEnabled) { isReorderDragEnabled = it; AppPreferences.setReorderDrag(this, it) })
                displayList.add(ToggleOption("Reorder: Tap to Swap (Long Press)", isReorderTapEnabled) { isReorderTapEnabled = it; AppPreferences.setReorderTap(this, it) })
                displayList.add(ToggleOption("Instant Mode (Live Changes)", isInstantMode) { isInstantMode = it; AppPreferences.setInstantMode(this, it); executeBtn.visibility = if (it) View.GONE else View.VISIBLE; if (it) fetchRunningApps() })
                displayList.add(ToggleOption("Kill App on Execute", killAppOnExecute) { killAppOnExecute = it; AppPreferences.setKillOnExecute(this, it) })
                
                // STANDARD MODE TOGGLE
                displayList.add(ToggleOption("Screen Off (Standard)", isScreenOffState && !useAltScreenOff) { 
                    if (it) {
                        if (isScreenOffState) wakeUp() // Reset if already off
                        useAltScreenOff = false
                        AppPreferences.setUseAltScreenOff(this, false)
                        performScreenOff()
                    } else {
                        wakeUp()
                    }
                })

                // ALTERNATE MODE TOGGLE
                displayList.add(ToggleOption("Screen Off (Alternate)", isScreenOffState && useAltScreenOff) { 
                    if (it) {
                        if (isScreenOffState) wakeUp() // Reset if already off
                        useAltScreenOff = true
                        AppPreferences.setUseAltScreenOff(this, true)
                        performScreenOff()
                    } else {
                        wakeUp()
                    }
                })
                
                displayList.add(ToggleOption("Shizuku Warning (Icon Alert)", showShizukuWarning) { showShizukuWarning = it; AppPreferences.setShowShizukuWarning(this, it); updateBubbleIcon() })
            }
        }
        drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged()
    }
    
    object CustomResInputOption
    data class LayoutOption(val name: String, val type: Int, val isCustomSaved: Boolean = false, val customRects: List<Rect>? = null)
    data class ResolutionOption(val name: String, val command: String, val index: Int)
    data class DpiOption(val currentDpi: Int)
    data class ProfileOption(val name: String, val isCurrent: Boolean, val layout: Int, val resIndex: Int, val dpi: Int, val apps: List<String>)
    data class FontSizeOption(val currentSize: Float)
    data class HeightOption(val currentPercent: Int)
    data class WidthOption(val currentPercent: Int)
    data class IconOption(val name: String)
    data class ActionOption(val name: String, val action: () -> Unit)
    data class ToggleOption(val name: String, var isEnabled: Boolean, val onToggle: (Boolean) -> Unit)
    data class TimeoutOption(val seconds: Int)

    inner class SelectedAppsAdapter : RecyclerView.Adapter<SelectedAppsAdapter.Holder>() {
        inner class Holder(v: View) : RecyclerView.ViewHolder(v) { val icon: ImageView = v.findViewById(R.id.selected_app_icon) }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder { return Holder(LayoutInflater.from(parent.context).inflate(R.layout.item_selected_app, parent, false)) }
        override fun onBindViewHolder(holder: Holder, position: Int) { 
            val app = selectedAppsQueue[position]; if (position == reorderSelectionIndex) { holder.icon.setColorFilter(HIGHLIGHT_COLOR); holder.icon.alpha = 1.0f; holder.itemView.scaleX = 1.1f; holder.itemView.scaleY = 1.1f; holder.itemView.background = null } else { holder.icon.clearColorFilter(); holder.itemView.scaleX = 1.0f; holder.itemView.scaleY = 1.0f; holder.itemView.background = null; if (app.packageName == PACKAGE_BLANK) { holder.icon.setImageResource(R.drawable.ic_box_outline); holder.icon.alpha = 1.0f } else { try { holder.icon.setImageDrawable(packageManager.getApplicationIcon(app.packageName)) } catch (e: Exception) { holder.icon.setImageResource(R.drawable.ic_launcher_bubble) }; holder.icon.alpha = if (app.isMinimized) 0.4f else 1.0f } }
            holder.itemView.setOnClickListener { try { dismissKeyboardAndRestore(); if (reorderSelectionIndex != -1) { if (position == reorderSelectionIndex) { endReorderMode(false) } else { swapReorderItem(position) } } else { if (app.packageName != PACKAGE_BLANK) { app.isMinimized = !app.isMinimized; notifyItemChanged(position); if (isInstantMode) applyLayoutImmediate() } } } catch(e: Exception) {} }
            
            // Fix 2: Conditional Long Click Handler
            holder.itemView.setOnLongClickListener { 
                if (isReorderDragEnabled) {
                    false // Return false to let ItemTouchHelper take over for Drag
                } else if (isReorderTapEnabled) {
                    startReorderMode(position)
                    true // Consume event for Tap-to-Swap
                } else {
                    false
                }
            }
        }
        override fun getItemCount() = selectedAppsQueue.size
    }

    inner class RofiAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
        inner class AppHolder(v: View) : RecyclerView.ViewHolder(v) { val icon: ImageView = v.findViewById(R.id.rofi_app_icon); val text: TextView = v.findViewById(R.id.rofi_app_text); val star: ImageView = v.findViewById(R.id.rofi_app_star) }
        inner class LayoutHolder(v: View) : RecyclerView.ViewHolder(v) { val nameInput: EditText = v.findViewById(R.id.layout_name); val btnSave: ImageView = v.findViewById(R.id.btn_save_profile); val btnExtinguish: ImageView = v.findViewById(R.id.btn_extinguish_item) }
        inner class DpiHolder(v: View) : RecyclerView.ViewHolder(v) { val btnMinus: ImageView = v.findViewById(R.id.btn_dpi_minus); val btnPlus: ImageView = v.findViewById(R.id.btn_dpi_plus); val input: EditText = v.findViewById(R.id.input_dpi_value) }
        inner class FontSizeHolder(v: View) : RecyclerView.ViewHolder(v) { val btnMinus: ImageView = v.findViewById(R.id.btn_font_minus); val btnPlus: ImageView = v.findViewById(R.id.btn_font_plus); val textVal: TextView = v.findViewById(R.id.text_font_value) }
        inner class HeightHolder(v: View) : RecyclerView.ViewHolder(v) { val btnMinus: ImageView = v.findViewById(R.id.btn_height_minus); val btnPlus: ImageView = v.findViewById(R.id.btn_height_plus); val textVal: TextView = v.findViewById(R.id.text_height_value) }
        inner class WidthHolder(v: View) : RecyclerView.ViewHolder(v) { val btnMinus: ImageView = v.findViewById(R.id.btn_width_minus); val btnPlus: ImageView = v.findViewById(R.id.btn_width_plus); val textVal: TextView = v.findViewById(R.id.text_width_value) }
        inner class ProfileRichHolder(v: View) : RecyclerView.ViewHolder(v) { val name: EditText = v.findViewById(R.id.profile_name_text); val details: TextView = v.findViewById(R.id.profile_details_text); val iconsContainer: LinearLayout = v.findViewById(R.id.profile_icons_container); val btnSave: ImageView = v.findViewById(R.id.btn_save_profile_rich) }
        inner class IconSettingHolder(v: View) : RecyclerView.ViewHolder(v) { val preview: ImageView = v.findViewById(R.id.icon_setting_preview) }
        inner class CustomResInputHolder(v: View) : RecyclerView.ViewHolder(v) { val inputW: EditText = v.findViewById(R.id.input_res_w); val inputH: EditText = v.findViewById(R.id.input_res_h); val btnSave: ImageView = v.findViewById(R.id.btn_save_res) }

        override fun getItemViewType(position: Int): Int { return when (displayList[position]) { is MainActivity.AppInfo -> 0; is LayoutOption -> 1; is ResolutionOption -> 1; is DpiOption -> 2; is ProfileOption -> 4; is FontSizeOption -> 3; is IconOption -> 5; is ToggleOption -> 1; is ActionOption -> 6; is HeightOption -> 7; is WidthOption -> 8; is CustomResInputOption -> 9; else -> 0 } }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder { return when (viewType) { 0 -> AppHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_app_rofi, parent, false)); 1 -> LayoutHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout_option, parent, false)); 2 -> DpiHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_dpi_custom, parent, false)); 3 -> FontSizeHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_font_size, parent, false)); 4 -> ProfileRichHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_profile_rich, parent, false)); 5 -> IconSettingHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_icon_setting, parent, false)); 6 -> LayoutHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout_option, parent, false)); 7 -> HeightHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_height_setting, parent, false)); 8 -> WidthHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_width_setting, parent, false)); 9 -> CustomResInputHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_custom_resolution, parent, false)); else -> AppHolder(View(parent.context)) } }
        private fun startRename(editText: EditText) { editText.isEnabled = true; editText.isFocusable = true; editText.isFocusableInTouchMode = true; editText.requestFocus(); val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager; imm.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT) }
        private fun endRename(editText: EditText) { editText.isFocusable = false; editText.isFocusableInTouchMode = false; editText.isEnabled = false; val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager; imm.hideSoftInputFromWindow(editText.windowToken, 0) }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            val item = displayList[position]
            if (holder is AppHolder) holder.text.textSize = currentFontSize
            if (holder is LayoutHolder) holder.nameInput.textSize = currentFontSize
            if (holder is ProfileRichHolder) holder.name.textSize = currentFontSize

            if (holder is AppHolder && item is MainActivity.AppInfo) { holder.text.text = item.label; if (item.packageName == PACKAGE_BLANK) { holder.icon.setImageResource(R.drawable.ic_box_outline) } else { try { holder.icon.setImageDrawable(packageManager.getApplicationIcon(item.packageName)) } catch (e: Exception) { holder.icon.setImageResource(R.drawable.ic_launcher_bubble) } }; val isSelected = selectedAppsQueue.any { it.packageName == item.packageName }; if (isSelected) holder.itemView.setBackgroundResource(R.drawable.bg_item_active) else holder.itemView.setBackgroundResource(R.drawable.bg_item_press); holder.star.visibility = if (item.isFavorite) View.VISIBLE else View.GONE; holder.itemView.setOnClickListener { addToSelection(item) }; holder.itemView.setOnLongClickListener { toggleFavorite(item); refreshSearchList(); true } }
            else if (holder is ProfileRichHolder && item is ProfileOption) { holder.name.setText(item.name); holder.iconsContainer.removeAllViews(); if (!item.isCurrent) { for (pkg in item.apps.take(5)) { val iv = ImageView(holder.itemView.context); val lp = LinearLayout.LayoutParams(60, 60); lp.marginEnd = 8; iv.layoutParams = lp; if (pkg == PACKAGE_BLANK) { iv.setImageResource(R.drawable.ic_box_outline) } else { try { iv.setImageDrawable(packageManager.getApplicationIcon(pkg)) } catch (e: Exception) { iv.setImageResource(R.drawable.ic_launcher_bubble) } }; holder.iconsContainer.addView(iv) }; val info = "${getLayoutName(item.layout)} | ${getRatioName(item.resIndex)} | ${item.dpi}dpi"; holder.details.text = info; holder.details.visibility = View.VISIBLE; holder.btnSave.visibility = View.GONE; if (activeProfileName == item.name) { holder.itemView.setBackgroundResource(R.drawable.bg_item_active) } else { holder.itemView.setBackgroundResource(0) }; holder.itemView.setOnClickListener { dismissKeyboardAndRestore(); loadProfile(item.name) }; holder.itemView.setOnLongClickListener { startRename(holder.name); true }; val saveProfileName = { val newName = holder.name.text.toString().trim(); if (newName.isNotEmpty() && newName != item.name) { if (AppPreferences.renameProfile(holder.itemView.context, item.name, newName)) { safeToast("Renamed to $newName"); switchMode(MODE_PROFILES) } }; endRename(holder.name) }; holder.name.setOnEditorActionListener { v, actionId, _ -> if (actionId == EditorInfo.IME_ACTION_DONE) { saveProfileName(); holder.name.clearFocus(); val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager; imm.hideSoftInputFromWindow(holder.name.windowToken, 0); updateDrawerHeight(false); true } else false }; holder.name.setOnFocusChangeListener { v, hasFocus -> if (autoResizeEnabled) updateDrawerHeight(hasFocus); if (!hasFocus) saveProfileName() } } else { holder.iconsContainer.removeAllViews(); holder.details.visibility = View.GONE; holder.btnSave.visibility = View.VISIBLE; holder.itemView.setBackgroundResource(0); holder.name.isEnabled = true; holder.name.isFocusable = true; holder.name.isFocusableInTouchMode = true; holder.itemView.setOnClickListener { saveProfile() }; holder.btnSave.setOnClickListener { saveProfile() } } }
            else if (holder is LayoutHolder) {
                holder.btnSave.visibility = View.GONE; holder.btnExtinguish.visibility = View.GONE
                if (item is LayoutOption) { holder.nameInput.setText(item.name); val isSelected = if (item.type == LAYOUT_CUSTOM_DYNAMIC) { item.type == selectedLayoutType && item.name == activeCustomLayoutName } else { item.type == selectedLayoutType && activeCustomLayoutName == null }; if (isSelected) holder.itemView.setBackgroundResource(R.drawable.bg_item_active) else holder.itemView.setBackgroundResource(R.drawable.bg_item_press); holder.itemView.setOnClickListener { selectLayout(item) }; if (item.isCustomSaved) { holder.itemView.setOnLongClickListener { startRename(holder.nameInput); true }; val saveLayoutName = { val newName = holder.nameInput.text.toString().trim(); if (newName.isNotEmpty() && newName != item.name) { if (AppPreferences.renameCustomLayout(holder.itemView.context, item.name, newName)) { safeToast("Renamed to $newName"); if (activeCustomLayoutName == item.name) { activeCustomLayoutName = newName; AppPreferences.saveLastCustomLayoutName(holder.itemView.context, newName) }; switchMode(MODE_LAYOUTS) } }; endRename(holder.nameInput) }; holder.nameInput.setOnEditorActionListener { v, actionId, _ -> if (actionId == EditorInfo.IME_ACTION_DONE) { saveLayoutName(); true } else false }; holder.nameInput.setOnFocusChangeListener { v, hasFocus -> if (!hasFocus) saveLayoutName() } } else { holder.nameInput.isEnabled = false; holder.nameInput.isFocusable = false; holder.nameInput.setTextColor(Color.WHITE) } }
                else if (item is ResolutionOption) { 
                    holder.nameInput.setText(item.name); if (item.index >= 100) { holder.nameInput.isEnabled = false; holder.nameInput.setTextColor(Color.WHITE); holder.itemView.setOnLongClickListener { startRename(holder.nameInput); true }; val saveResName = { val newName = holder.nameInput.text.toString().trim(); if (newName.isNotEmpty() && newName != item.name) { if (AppPreferences.renameCustomResolution(holder.itemView.context, item.name, newName)) { safeToast("Renamed to $newName"); switchMode(MODE_RESOLUTION) } }; endRename(holder.nameInput) }; holder.nameInput.setOnEditorActionListener { v, actionId, _ -> if (actionId == EditorInfo.IME_ACTION_DONE) { saveResName(); true } else false }; holder.nameInput.setOnFocusChangeListener { v, hasFocus -> if (!hasFocus) saveResName() } } else { holder.nameInput.isEnabled = false; holder.nameInput.isFocusable = false; holder.nameInput.setTextColor(Color.WHITE) }; val isSelected = (item.index == selectedResolutionIndex); if (isSelected) holder.itemView.setBackgroundResource(R.drawable.bg_item_active) else holder.itemView.setBackgroundResource(R.drawable.bg_item_press); holder.itemView.setOnClickListener { applyResolution(item) } 
                }
                else if (item is IconOption) { holder.nameInput.setText(item.name); holder.nameInput.isEnabled = false; holder.nameInput.setTextColor(Color.WHITE); holder.itemView.setBackgroundResource(R.drawable.bg_item_press); holder.itemView.setOnClickListener { pickIcon() } }
                else if (item is ToggleOption) { holder.nameInput.setText(item.name); holder.nameInput.isEnabled = false; holder.nameInput.setTextColor(Color.WHITE); if (item.isEnabled) holder.itemView.setBackgroundResource(R.drawable.bg_item_active) else holder.itemView.setBackgroundResource(R.drawable.bg_item_press); holder.itemView.setOnClickListener { dismissKeyboardAndRestore(); item.isEnabled = !item.isEnabled; item.onToggle(item.isEnabled); notifyItemChanged(position) } } 
                else if (item is ActionOption) { holder.nameInput.setText(item.name); holder.nameInput.isEnabled = false; holder.nameInput.setTextColor(Color.WHITE); holder.itemView.setBackgroundResource(R.drawable.bg_item_press); holder.itemView.setOnClickListener { dismissKeyboardAndRestore(); item.action() } }
            }
            else if (holder is CustomResInputHolder) {
                holder.btnSave.setOnClickListener { val wStr = holder.inputW.text.toString().trim(); val hStr = holder.inputH.text.toString().trim(); if (wStr.isNotEmpty() && hStr.isNotEmpty()) { val w = wStr.toIntOrNull(); val h = hStr.toIntOrNull(); if (w != null && h != null && w > 0 && h > 0) { val gcdVal = calculateGCD(w, h); val wRatio = w / gcdVal; val hRatio = h / gcdVal; val resString = "${w}x${h}"; val name = "$wRatio:$hRatio Custom ($resString)"; AppPreferences.saveCustomResolution(holder.itemView.context, name, resString); safeToast("Added $name"); dismissKeyboardAndRestore(); switchMode(MODE_RESOLUTION) } else { safeToast("Invalid numbers") } } else { safeToast("Input W and H") } }
                holder.inputW.setOnFocusChangeListener { _, hasFocus -> if (autoResizeEnabled) updateDrawerHeight(hasFocus) }; holder.inputH.setOnFocusChangeListener { _, hasFocus -> if (autoResizeEnabled) updateDrawerHeight(hasFocus) }
            }
            else if (holder is IconSettingHolder && item is IconOption) { try { val uriStr = AppPreferences.getIconUri(holder.itemView.context); if (uriStr != null) { val uri = Uri.parse(uriStr); val input = contentResolver.openInputStream(uri); val bitmap = BitmapFactory.decodeStream(input); input?.close(); holder.preview.setImageBitmap(bitmap) } else { holder.preview.setImageResource(R.drawable.ic_launcher_bubble) } } catch(e: Exception) { holder.preview.setImageResource(R.drawable.ic_launcher_bubble) }; holder.itemView.setOnClickListener { pickIcon() } }
            else if (holder is DpiHolder && item is DpiOption) { 
                holder.input.setText(item.currentDpi.toString()); holder.input.setOnEditorActionListener { v, actionId, _ -> if (actionId == EditorInfo.IME_ACTION_DONE) { val valInt = v.text.toString().toIntOrNull(); if (valInt != null) { selectDpi(valInt); safeToast("DPI set to $valInt") }; dismissKeyboardAndRestore(); true } else false }; holder.input.setOnFocusChangeListener { _, hasFocus -> if (autoResizeEnabled) updateDrawerHeight(hasFocus); if (!hasFocus) { val valInt = holder.input.text.toString().toIntOrNull(); if (valInt != null && valInt != item.currentDpi) { selectDpi(valInt) } } }; holder.btnMinus.setOnClickListener { val v = holder.input.text.toString().toIntOrNull() ?: 160; val newVal = (v - 5).coerceAtLeast(50); holder.input.setText(newVal.toString()); selectDpi(newVal) }; holder.btnPlus.setOnClickListener { val v = holder.input.text.toString().toIntOrNull() ?: 160; val newVal = (v + 5).coerceAtMost(600); holder.input.setText(newVal.toString()); selectDpi(newVal) } 
            }
            else if (holder is FontSizeHolder && item is FontSizeOption) { holder.textVal.text = item.currentSize.toInt().toString(); holder.btnMinus.setOnClickListener { changeFontSize(item.currentSize - 1) }; holder.btnPlus.setOnClickListener { changeFontSize(item.currentSize + 1) } }
            else if (holder is HeightHolder && item is HeightOption) { holder.textVal.text = item.currentPercent.toString(); holder.btnMinus.setOnClickListener { changeDrawerHeight(-5) }; holder.btnPlus.setOnClickListener { changeDrawerHeight(5) } }
            else if (holder is WidthHolder && item is WidthOption) { holder.textVal.text = item.currentPercent.toString(); holder.btnMinus.setOnClickListener { changeDrawerWidth(-5) }; holder.btnPlus.setOnClickListener { changeDrawerWidth(5) } }
        }
        override fun getItemCount() = displayList.size
    }
}
```

## File: app/src/main/java/com/example/quadrantlauncher/FloatingLauncherService.kt.minimize
```
package com.example.quadrantlauncher

import android.app.ActivityManager
import android.app.Service
import android.content.BroadcastReceiver
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.ServiceConnection
import android.content.pm.PackageManager
import android.graphics.BitmapFactory
import android.graphics.PixelFormat
import android.graphics.Rect
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.net.Uri
import android.hardware.display.DisplayManager
import android.os.Build
import android.os.Handler
import android.os.IBinder
import android.os.Looper
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.util.DisplayMetrics
import android.util.Log
import android.view.*
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import android.widget.TextView
import androidx.core.app.NotificationCompat
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import rikka.shizuku.Shizuku
import java.text.SimpleDateFormat
import java.util.*
import java.lang.reflect.Method
import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.hypot

class FloatingLauncherService : Service() {

    companion object {
        const val MODE_SEARCH = 0
        const val MODE_LAYOUTS = 2
        const val MODE_RESOLUTION = 3
        const val MODE_DPI = 4
        const val MODE_PROFILES = 5
        const val MODE_SETTINGS = 6
        
        const val LAYOUT_FULL = 1
        const val LAYOUT_SIDE_BY_SIDE = 2
        const val LAYOUT_TOP_BOTTOM = 5
        const val LAYOUT_TRI_EVEN = 3
        const val LAYOUT_CORNERS = 4
        const val LAYOUT_TRI_SIDE_MAIN_SIDE = 6
        const val LAYOUT_QUAD_ROW_EVEN = 7
        const val LAYOUT_CUSTOM_DYNAMIC = 99

        const val CHANNEL_ID = "OverlayServiceChannel"
        const val TAG = "FloatingService"
        const val DEBUG_TAG = "DROIDOS_DEBUG"
        const val ACTION_OPEN_DRAWER = "com.example.quadrantlauncher.OPEN_DRAWER"
        const val ACTION_UPDATE_ICON = "com.example.quadrantlauncher.UPDATE_ICON"
        const val HIGHLIGHT_COLOR = 0xFF00A0E9.toInt()
    }

    private lateinit var windowManager: WindowManager
    private var displayContext: Context? = null
    private var currentDisplayId = 0
    private var lastPhysicalDisplayId = Display.DEFAULT_DISPLAY 

    private var bubbleView: View? = null
    private var drawerView: View? = null
    private var debugStatusView: TextView? = null
    
    private lateinit var bubbleParams: WindowManager.LayoutParams
    private lateinit var drawerParams: WindowManager.LayoutParams

    private var isExpanded = false
    private val selectedAppsQueue = mutableListOf<MainActivity.AppInfo>()
    private val allAppsList = mutableListOf<MainActivity.AppInfo>()
    private val displayList = mutableListOf<Any>()
    
    private var activeProfileName: String? = null
    private var currentMode = MODE_SEARCH
    private var selectedLayoutType = 2
    private var selectedResolutionIndex = 0
    private var currentDpiSetting = -1
    private var currentFontSize = 16f
    
    private var activeCustomRects: List<Rect>? = null
    private var activeCustomLayoutName: String? = null
    
    private var killAppOnExecute = true
    private var targetDisplayIndex = 1 
    private var isScreenOffState = false
    private var isInstantMode = true 
    private var showShizukuWarning = true 
    private var useAltScreenOff = false
    
    private var isVirtualDisplayActive = false
    private var currentDrawerHeightPercent = 70
    private var currentDrawerWidthPercent = 90
    private var autoResizeEnabled = true
    
    private var reorderSelectionIndex = -1
    private var isReorderDragEnabled = true
    private var isReorderTapEnabled = true
    
    private val PACKAGE_BLANK = "internal.blank.spacer"
    private val PACKAGE_TRACKPAD = "com.katsuyamaki.DroidOSTrackpadKeyboard"
    
    private var shellService: IShellService? = null
    private var isBound = false
    private val uiHandler = Handler(Looper.getMainLooper())

    private val shizukuBinderListener = Shizuku.OnBinderReceivedListener { if (Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED) bindShizuku() }
    private val shizukuPermissionListener = Shizuku.OnRequestPermissionResultListener { _, grantResult -> if (grantResult == PackageManager.PERMISSION_GRANTED) bindShizuku() }

    private val commandReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            val action = intent?.action
            if (action == ACTION_OPEN_DRAWER) { 
                if (isScreenOffState) wakeUp() else if (!isExpanded) toggleDrawer() 
            } 
            else if (action == ACTION_UPDATE_ICON) { 
                updateBubbleIcon()
                if (currentMode == MODE_SETTINGS) switchMode(MODE_SETTINGS) 
            }
            else if (action == Intent.ACTION_SCREEN_ON) {
                if (isScreenOffState) {
                    wakeUp()
                }
            }
        }
    }
    private val swipeCallback = object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) {
        override fun getMovementFlags(r: RecyclerView, v: RecyclerView.ViewHolder): Int {
            val pos = v.adapterPosition; if (pos == RecyclerView.NO_POSITION || pos >= displayList.size) return 0
            val item = displayList[pos]
            val isSwipeable = when (currentMode) {
                MODE_LAYOUTS -> (item is LayoutOption && item.type == LAYOUT_CUSTOM_DYNAMIC && item.isCustomSaved)
                MODE_RESOLUTION -> (item is ResolutionOption && item.index >= 100)
                MODE_PROFILES -> (item is ProfileOption && !item.isCurrent)
                MODE_SEARCH -> true
                else -> false
            }
            return if (isSwipeable) makeMovementFlags(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) else 0
        }
        override fun onMove(r: RecyclerView, v: RecyclerView.ViewHolder, t: RecyclerView.ViewHolder): Boolean = false
        override fun onSwiped(v: RecyclerView.ViewHolder, direction: Int) {
            val pos = v.adapterPosition; if (pos == RecyclerView.NO_POSITION) return
            dismissKeyboardAndRestore()
            if (currentMode == MODE_PROFILES) { val item = displayList.getOrNull(pos) as? ProfileOption ?: return; AppPreferences.deleteProfile(this@FloatingLauncherService, item.name); safeToast("Deleted ${item.name}"); switchMode(MODE_PROFILES); return }
            if (currentMode == MODE_LAYOUTS) { val item = displayList.getOrNull(pos) as? LayoutOption ?: return; AppPreferences.deleteCustomLayout(this@FloatingLauncherService, item.name); safeToast("Deleted ${item.name}"); switchMode(MODE_LAYOUTS); return }
            if (currentMode == MODE_RESOLUTION) { val item = displayList.getOrNull(pos) as? ResolutionOption ?: return; AppPreferences.deleteCustomResolution(this@FloatingLauncherService, item.name); safeToast("Deleted ${item.name}"); switchMode(MODE_RESOLUTION); return }
            if (currentMode == MODE_SEARCH) { val item = displayList.getOrNull(pos) as? MainActivity.AppInfo ?: return; if (item.packageName == PACKAGE_BLANK) { (drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view).adapter as RofiAdapter).notifyItemChanged(pos); return }; if (direction == ItemTouchHelper.LEFT && !item.isFavorite) toggleFavorite(item) else if (direction == ItemTouchHelper.RIGHT && item.isFavorite) toggleFavorite(item); refreshSearchList() }
        }
    }

    private val selectedAppsDragCallback = object : ItemTouchHelper.SimpleCallback(ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT, ItemTouchHelper.UP or ItemTouchHelper.DOWN) {
        override fun isLongPressDragEnabled(): Boolean = isReorderDragEnabled
        override fun onMove(r: RecyclerView, v: RecyclerView.ViewHolder, t: RecyclerView.ViewHolder): Boolean { Collections.swap(selectedAppsQueue, v.adapterPosition, t.adapterPosition); r.adapter?.notifyItemMoved(v.adapterPosition, t.adapterPosition); return true }
        override fun onSwiped(v: RecyclerView.ViewHolder, direction: Int) { dismissKeyboardAndRestore(); val pos = v.adapterPosition; if (pos != RecyclerView.NO_POSITION) { val app = selectedAppsQueue[pos]; if (app.packageName != PACKAGE_BLANK) { Thread { try { shellService?.forceStop(app.packageName) } catch(e: Exception) {} }.start(); safeToast("Killed ${app.label}") }; selectedAppsQueue.removeAt(pos); if (reorderSelectionIndex != -1) endReorderMode(false); updateSelectedAppsDock(); drawerView?.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged(); if (isInstantMode) applyLayoutImmediate() } }
        override fun clearView(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder) { super.clearView(recyclerView, viewHolder); val pkgs = selectedAppsQueue.map { it.packageName }; AppPreferences.saveLastQueue(this@FloatingLauncherService, pkgs); if (isInstantMode) applyLayoutImmediate() }
    }

    private val userServiceConnection = object : ServiceConnection {
        override fun onServiceConnected(name: ComponentName?, binder: IBinder?) { shellService = IShellService.Stub.asInterface(binder); isBound = true; updateExecuteButtonColor(true); updateBubbleIcon(); safeToast("Shizuku Connected") }
        override fun onServiceDisconnected(name: ComponentName?) { shellService = null; isBound = false; updateExecuteButtonColor(false); updateBubbleIcon() }
    }

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onCreate() {
        super.onCreate()
        startForegroundService()
        try { Shizuku.addBinderReceivedListener(shizukuBinderListener); Shizuku.addRequestPermissionResultListener(shizukuPermissionListener) } catch (e: Exception) {}
        val filter = IntentFilter().apply { 
            addAction(ACTION_OPEN_DRAWER)
            addAction(ACTION_UPDATE_ICON)
            addAction(Intent.ACTION_SCREEN_ON)
            addAction(Intent.ACTION_SCREEN_OFF)
        }
        if (Build.VERSION.SDK_INT >= 33) registerReceiver(commandReceiver, filter, Context.RECEIVER_EXPORTED) else registerReceiver(commandReceiver, filter)
        try { if (rikka.shizuku.Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED) bindShizuku() } catch (e: Exception) {}
        
        loadInstalledApps(); currentFontSize = AppPreferences.getFontSize(this)
        killAppOnExecute = AppPreferences.getKillOnExecute(this); targetDisplayIndex = AppPreferences.getTargetDisplayIndex(this)
        isInstantMode = AppPreferences.getInstantMode(this); showShizukuWarning = AppPreferences.getShowShizukuWarning(this)
        useAltScreenOff = AppPreferences.getUseAltScreenOff(this); isReorderDragEnabled = AppPreferences.getReorderDrag(this)
        isReorderTapEnabled = AppPreferences.getReorderTap(this); currentDrawerHeightPercent = AppPreferences.getDrawerHeightPercent(this)
        currentDrawerWidthPercent = AppPreferences.getDrawerWidthPercent(this); autoResizeEnabled = AppPreferences.getAutoResizeKeyboard(this)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val targetDisplayId = intent?.getIntExtra("DISPLAY_ID", Display.DEFAULT_DISPLAY) ?: Display.DEFAULT_DISPLAY
        if (bubbleView != null && targetDisplayId != currentDisplayId) { try { windowManager.removeView(bubbleView); if (isExpanded) windowManager.removeView(drawerView) } catch (e: Exception) {}; setupDisplayContext(targetDisplayId); setupBubble(); setupDrawer(); updateBubbleIcon(); loadDisplaySettings(currentDisplayId); isExpanded = false; safeToast("Moved to Display $targetDisplayId") } 
        else if (bubbleView == null) { try { setupDisplayContext(targetDisplayId); setupBubble(); setupDrawer(); selectedLayoutType = AppPreferences.getLastLayout(this); activeCustomLayoutName = AppPreferences.getLastCustomLayoutName(this); updateGlobalFontSize(); updateBubbleIcon(); loadDisplaySettings(currentDisplayId); if (selectedLayoutType == LAYOUT_CUSTOM_DYNAMIC && activeCustomLayoutName != null) { val data = AppPreferences.getCustomLayoutData(this, activeCustomLayoutName!!); if (data != null) { val rects = mutableListOf<Rect>(); val rectParts = data.split("|"); for (rp in rectParts) { val coords = rp.split(","); if (coords.size == 4) rects.add(Rect(coords[0].toInt(), coords[1].toInt(), coords[2].toInt(), coords[3].toInt())) }; activeCustomRects = rects } }; try { if (shellService == null && rikka.shizuku.Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED) bindShizuku() } catch (e: Exception) {} } catch (e: Exception) { stopSelf() } }
        return START_NOT_STICKY
    }
    
    private fun loadDisplaySettings(displayId: Int) { selectedResolutionIndex = AppPreferences.getDisplayResolution(this, displayId); currentDpiSetting = AppPreferences.getDisplayDpi(this, displayId) }

    override fun onDestroy() {
        super.onDestroy()
        isScreenOffState = false
        wakeUp()
        try { Shizuku.removeBinderReceivedListener(shizukuBinderListener); Shizuku.removeRequestPermissionResultListener(shizukuPermissionListener); unregisterReceiver(commandReceiver) } catch (e: Exception) {}
        try { if (bubbleView != null) windowManager.removeView(bubbleView); if (isExpanded) windowManager.removeView(drawerView) } catch (e: Exception) {}
        if (isBound) { try { ShizukuBinder.unbind(ComponentName(packageName, ShellUserService::class.java.name), userServiceConnection); isBound = false } catch (e: Exception) {} }
    }
    
    private fun safeToast(msg: String) { 
        uiHandler.post { 
            try { Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show() } catch(e: Exception) { }
            if (debugStatusView != null) debugStatusView?.text = msg 
        }
    }
    
    private fun vibrate() {
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                val vibratorManager = getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as VibratorManager
                val vibrator = vibratorManager.defaultVibrator
                vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE))
            } else {
                val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vibrator.vibrate(50)
            }
        } catch (e: Exception) {}
    }

    private fun setupDisplayContext(displayId: Int) {
        val displayManager = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager; val display = displayManager.getDisplay(displayId)
        if (display == null) { windowManager = getSystemService(WINDOW_SERVICE) as WindowManager; return }
        currentDisplayId = displayId; displayContext = createDisplayContext(display); windowManager = displayContext!!.getSystemService(Context.WINDOW_SERVICE) as WindowManager
    }
    private fun refreshDisplayId() { val id = displayContext?.display?.displayId ?: Display.DEFAULT_DISPLAY; currentDisplayId = id }
    private fun startForegroundService() { val channelId = if (android.os.Build.VERSION.SDK_INT >= 26) { val channel = android.app.NotificationChannel(CHANNEL_ID, "Floating Launcher", android.app.NotificationManager.IMPORTANCE_LOW); getSystemService(android.app.NotificationManager::class.java).createNotificationChannel(channel); CHANNEL_ID } else ""; val notification = NotificationCompat.Builder(this, channelId).setContentTitle("CoverScreen Launcher Active").setSmallIcon(R.drawable.ic_launcher_bubble).setPriority(NotificationCompat.PRIORITY_MIN).build(); if (android.os.Build.VERSION.SDK_INT >= 34) startForeground(1, notification, android.content.pm.ServiceInfo.FOREGROUND_SERVICE_TYPE_SPECIAL_USE) else startForeground(1, notification) }
    private fun bindShizuku() { try { val component = ComponentName(packageName, ShellUserService::class.java.name); ShizukuBinder.bind(component, userServiceConnection, true, 1) } catch (e: Exception) { Log.e(TAG, "Bind Shizuku Failed", e) } }
    private fun updateExecuteButtonColor(isReady: Boolean) { uiHandler.post { val executeBtn = drawerView?.findViewById<ImageView>(R.id.icon_execute); if (isReady) executeBtn?.setColorFilter(Color.GREEN) else executeBtn?.setColorFilter(Color.RED) } }

    private fun setupBubble() {
        val context = displayContext ?: this
        val themeContext = ContextThemeWrapper(context, R.style.Theme_QuadrantLauncher)
        bubbleView = LayoutInflater.from(themeContext).inflate(R.layout.layout_bubble, null)
        bubbleView?.isClickable = true; bubbleView?.isFocusable = true 
        bubbleParams = WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY, WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN or WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH, PixelFormat.TRANSLUCENT)
        bubbleParams.gravity = Gravity.TOP or Gravity.START; bubbleParams.x = 50; bubbleParams.y = 200
        var velocityTracker: VelocityTracker? = null
        bubbleView?.setOnTouchListener(object : View.OnTouchListener {
            var initialX = 0; var initialY = 0; var initialTouchX = 0f; var initialTouchY = 0f; var isDrag = false
            override fun onTouch(v: View, event: MotionEvent): Boolean {
                if (velocityTracker == null) velocityTracker = VelocityTracker.obtain(); velocityTracker?.addMovement(event)
                when (event.action) {
                    MotionEvent.ACTION_DOWN -> { initialX = bubbleParams.x; initialY = bubbleParams.y; initialTouchX = event.rawX; initialTouchY = event.rawY; isDrag = false; return true }
                    MotionEvent.ACTION_MOVE -> { if (Math.abs(event.rawX - initialTouchX) > 10 || Math.abs(event.rawY - initialTouchY) > 10) isDrag = true; if (isDrag) { bubbleParams.x = initialX + (event.rawX - initialTouchX).toInt(); bubbleParams.y = initialY + (event.rawY - initialTouchY).toInt(); windowManager.updateViewLayout(bubbleView, bubbleParams) }; return true }
                    MotionEvent.ACTION_UP -> { velocityTracker?.computeCurrentVelocity(1000); val vX = velocityTracker?.xVelocity ?: 0f; val vY = velocityTracker?.yVelocity ?: 0f; val totalVel = hypot(vX.toDouble(), vY.toDouble()); if (isDrag && totalVel > 2500) { safeToast("Closing..."); stopSelf(); return true }; if (!isDrag) { if (!isBound && showShizukuWarning) { if (Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED) { bindShizuku() } else { safeToast("Shizuku NOT Connected. Opening Shizuku..."); launchShizuku() } } else { toggleDrawer() } }; velocityTracker?.recycle(); velocityTracker = null; return true }
                    MotionEvent.ACTION_CANCEL -> { velocityTracker?.recycle(); velocityTracker = null }
                }
                return false
            }
        })
        windowManager.addView(bubbleView, bubbleParams)
    }
    
    private fun launchShizuku() { try { val intent = packageManager.getLaunchIntentForPackage("moe.shizuku.privileged.api"); if (intent != null) { intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); startActivity(intent) } else { safeToast("Shizuku app not found") } } catch(e: Exception) { safeToast("Failed to launch Shizuku") } }
    private fun updateBubbleIcon() { val iconView = bubbleView?.findViewById<ImageView>(R.id.bubble_icon) ?: return; if (!isBound && showShizukuWarning) { uiHandler.post { iconView.setImageResource(android.R.drawable.ic_dialog_alert); iconView.setColorFilter(Color.RED); iconView.imageTintList = null }; return }; uiHandler.post { try { val uriStr = AppPreferences.getIconUri(this); if (uriStr != null) { val uri = Uri.parse(uriStr); val input = contentResolver.openInputStream(uri); val bitmap = BitmapFactory.decodeStream(input); input?.close(); if (bitmap != null) { iconView.setImageBitmap(bitmap); iconView.imageTintList = null; iconView.clearColorFilter() } else { iconView.setImageResource(R.drawable.ic_launcher_bubble); iconView.imageTintList = null; iconView.clearColorFilter() } } else { iconView.setImageResource(R.drawable.ic_launcher_bubble); iconView.imageTintList = null; iconView.clearColorFilter() } } catch (e: Exception) { iconView.setImageResource(R.drawable.ic_launcher_bubble); iconView.imageTintList = null; iconView.clearColorFilter() } } }
    private fun dismissKeyboardAndRestore() { val searchBar = drawerView?.findViewById<EditText>(R.id.rofi_search_bar); if (searchBar != null && searchBar.hasFocus()) { searchBar.clearFocus(); val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager; imm.hideSoftInputFromWindow(searchBar.windowToken, 0) }; val dpiInput = drawerView?.findViewById<EditText>(R.id.input_dpi_value); if (dpiInput != null && dpiInput.hasFocus()) { dpiInput.clearFocus(); val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager; imm.hideSoftInputFromWindow(dpiInput.windowToken, 0) }; updateDrawerHeight(false) }

    private fun setupDrawer() {
        val context = displayContext ?: this
        val themeContext = ContextThemeWrapper(context, R.style.Theme_QuadrantLauncher)
        drawerView = LayoutInflater.from(themeContext).inflate(R.layout.layout_rofi_drawer, null)
        drawerView!!.fitsSystemWindows = true 
        drawerParams = WindowManager.LayoutParams(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY, WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN, PixelFormat.TRANSLUCENT)
        drawerParams.gravity = Gravity.TOP or Gravity.START; drawerParams.x = 0; drawerParams.y = 0
        drawerParams.softInputMode = WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING
        
        val container = drawerView?.findViewById<LinearLayout>(R.id.drawer_container)
        if (container != null) { 
            val lp = container.layoutParams as? FrameLayout.LayoutParams
            if (lp != null) { lp.gravity = Gravity.TOP or Gravity.CENTER_HORIZONTAL; lp.topMargin = 100; container.layoutParams = lp }
            
            debugStatusView = TextView(context)
            debugStatusView?.text = "Ready"
            debugStatusView?.setTextColor(Color.GREEN)
            debugStatusView?.textSize = 10f
            debugStatusView?.gravity = Gravity.CENTER
            container.addView(debugStatusView, 0)
        }

        val searchBar = drawerView!!.findViewById<EditText>(R.id.rofi_search_bar); val mainRecycler = drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view); val selectedRecycler = drawerView!!.findViewById<RecyclerView>(R.id.selected_apps_recycler); val executeBtn = drawerView!!.findViewById<ImageView>(R.id.icon_execute)
        if (isBound) executeBtn.setColorFilter(Color.GREEN) else executeBtn.setColorFilter(Color.RED)
        drawerView!!.findViewById<ImageView>(R.id.icon_search_mode).setOnClickListener { dismissKeyboardAndRestore(); switchMode(MODE_SEARCH) }
        drawerView!!.findViewById<ImageView>(R.id.icon_mode_window).setOnClickListener { dismissKeyboardAndRestore(); switchMode(MODE_LAYOUTS) }
        drawerView!!.findViewById<ImageView>(R.id.icon_mode_resolution).setOnClickListener { dismissKeyboardAndRestore(); switchMode(MODE_RESOLUTION) }
        drawerView!!.findViewById<ImageView>(R.id.icon_mode_dpi).setOnClickListener { dismissKeyboardAndRestore(); switchMode(MODE_DPI) }
        drawerView!!.findViewById<ImageView>(R.id.icon_mode_profiles).setOnClickListener { dismissKeyboardAndRestore(); switchMode(MODE_PROFILES) }
        drawerView!!.findViewById<ImageView>(R.id.icon_mode_settings).setOnClickListener { dismissKeyboardAndRestore(); switchMode(MODE_SETTINGS) }
        executeBtn.setOnClickListener { executeLaunch(selectedLayoutType, closeDrawer = true) }
        searchBar.addTextChangedListener(object : TextWatcher { override fun afterTextChanged(s: Editable?) { filterList(s.toString()) }; override fun beforeTextChanged(s: CharSequence?, st: Int, c: Int, a: Int) {}; override fun onTextChanged(s: CharSequence?, st: Int, b: Int, c: Int) {} })
        searchBar.imeOptions = EditorInfo.IME_ACTION_DONE
        searchBar.setOnEditorActionListener { v, actionId, event -> if (actionId == EditorInfo.IME_ACTION_DONE) { dismissKeyboardAndRestore(); return@setOnEditorActionListener true }; false }
        searchBar.setOnKeyListener { _, keyCode, event -> if (keyCode == KeyEvent.KEYCODE_DEL && event.action == KeyEvent.ACTION_DOWN) { if (searchBar.text.isEmpty() && selectedAppsQueue.isNotEmpty()) { val lastIndex = selectedAppsQueue.size - 1; selectedAppsQueue.removeAt(lastIndex); updateSelectedAppsDock(); mainRecycler.adapter?.notifyDataSetChanged(); return@setOnKeyListener true } }; if (keyCode == KeyEvent.KEYCODE_BACK && event.action == KeyEvent.ACTION_UP) { if (searchBar.hasFocus()) { dismissKeyboardAndRestore(); return@setOnKeyListener true } }; return@setOnKeyListener false }
        searchBar.setOnFocusChangeListener { _, hasFocus -> if (autoResizeEnabled) { updateDrawerHeight(hasFocus) } }
        mainRecycler.layoutManager = LinearLayoutManager(themeContext); mainRecycler.adapter = RofiAdapter(); val itemTouchHelper = ItemTouchHelper(swipeCallback); itemTouchHelper.attachToRecyclerView(mainRecycler)
        mainRecycler.addOnScrollListener(object : RecyclerView.OnScrollListener() { override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) { if (newState == RecyclerView.SCROLL_STATE_DRAGGING) { dismissKeyboardAndRestore() } } })
        mainRecycler.setOnTouchListener { v, event -> if (event.action == MotionEvent.ACTION_DOWN) { dismissKeyboardAndRestore() }; false }
        selectedRecycler.layoutManager = LinearLayoutManager(themeContext, LinearLayoutManager.HORIZONTAL, false); selectedRecycler.adapter = SelectedAppsAdapter(); val dockTouchHelper = ItemTouchHelper(selectedAppsDragCallback); dockTouchHelper.attachToRecyclerView(selectedRecycler)
        drawerView!!.setOnClickListener { toggleDrawer() }
        drawerView!!.isFocusableInTouchMode = true
        drawerView!!.setOnKeyListener { _, keyCode, event -> if (keyCode == KeyEvent.KEYCODE_BACK && event.action == KeyEvent.ACTION_UP) { toggleDrawer(); true } else if (keyCode == KeyEvent.KEYCODE_VOLUME_UP && isScreenOffState) { wakeUp(); true } else false }
    }
    
    private fun startReorderMode(index: Int) { if (!isReorderTapEnabled) return; if (index < 0 || index >= selectedAppsQueue.size) return; val prevIndex = reorderSelectionIndex; reorderSelectionIndex = index; val adapter = drawerView!!.findViewById<RecyclerView>(R.id.selected_apps_recycler).adapter; if (prevIndex != -1) adapter?.notifyItemChanged(prevIndex); adapter?.notifyItemChanged(reorderSelectionIndex); safeToast("Tap another app to Swap") }
    private fun swapReorderItem(targetIndex: Int) { if (reorderSelectionIndex == -1) return; Collections.swap(selectedAppsQueue, reorderSelectionIndex, targetIndex); val adapter = drawerView!!.findViewById<RecyclerView>(R.id.selected_apps_recycler).adapter; adapter?.notifyItemChanged(reorderSelectionIndex); adapter?.notifyItemChanged(targetIndex); endReorderMode(true) }
    private fun endReorderMode(triggerInstantMode: Boolean) { val prevIndex = reorderSelectionIndex; reorderSelectionIndex = -1; val adapter = drawerView!!.findViewById<RecyclerView>(R.id.selected_apps_recycler).adapter; if (prevIndex != -1) adapter?.notifyItemChanged(prevIndex); if (triggerInstantMode && isInstantMode) applyLayoutImmediate() }
    
    private fun updateDrawerHeight(isKeyboardMode: Boolean) {
        val container = drawerView?.findViewById<LinearLayout>(R.id.drawer_container) ?: return
        val dm = DisplayMetrics(); windowManager.defaultDisplay.getRealMetrics(dm); val screenH = dm.heightPixels; val screenW = dm.widthPixels
        val lp = container.layoutParams as? FrameLayout.LayoutParams; val topMargin = lp?.topMargin ?: 100
        var finalHeight = (screenH * (currentDrawerHeightPercent / 100f)).toInt()
        if (isKeyboardMode) { finalHeight = (screenH * 0.40f).toInt(); val maxAvailable = screenH - topMargin - 20; if (finalHeight > maxAvailable) finalHeight = maxAvailable }
        val newW = (screenW * (currentDrawerWidthPercent / 100f)).toInt()
        if (container.layoutParams.height != finalHeight || container.layoutParams.width != newW) { container.layoutParams.width = newW; container.layoutParams.height = finalHeight; container.requestLayout(); if (drawerParams.y != 0) { drawerParams.y = 0; windowManager.updateViewLayout(drawerView, drawerParams) } }
    }

    private fun toggleDrawer() {
        if (isExpanded) { try { windowManager.removeView(drawerView) } catch(e: Exception) {}; bubbleView?.visibility = View.VISIBLE; isExpanded = false } else { setupDisplayContext(currentDisplayId); updateDrawerHeight(false); try { windowManager.addView(drawerView, drawerParams) } catch(e: Exception) {}; bubbleView?.visibility = View.GONE; isExpanded = true; switchMode(MODE_SEARCH); val et = drawerView?.findViewById<EditText>(R.id.rofi_search_bar); et?.setText(""); et?.clearFocus(); updateSelectedAppsDock(); if (isInstantMode) fetchRunningApps() }
    }
    private fun updateGlobalFontSize() { val searchBar = drawerView?.findViewById<EditText>(R.id.rofi_search_bar); searchBar?.textSize = currentFontSize; drawerView?.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged() }
    private fun loadInstalledApps() { 
        val pm = packageManager; 
        val intent = Intent(Intent.ACTION_MAIN, null).apply { addCategory(Intent.CATEGORY_LAUNCHER) }; 
        val riList = pm.queryIntentActivities(intent, 0); 
        allAppsList.clear(); 
        allAppsList.add(MainActivity.AppInfo(" (Blank Space)", PACKAGE_BLANK)); 
        for (ri in riList) { 
            val pkg = ri.activityInfo.packageName; 
            if (pkg == PACKAGE_TRACKPAD || pkg == packageName) continue; 
            val app = MainActivity.AppInfo(ri.loadLabel(pm).toString(), pkg, AppPreferences.isFavorite(this, pkg)); 
            allAppsList.add(app) 
        }; 
        allAppsList.sortBy { it.label.lowercase() } 
    }
    
    private fun launchTrackpad() {
        if (isTrackpadRunning()) { safeToast("Trackpad is already active"); return }
        try { val intent = packageManager.getLaunchIntentForPackage(PACKAGE_TRACKPAD); if (intent != null) { intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP); val dm = DisplayMetrics(); val display = displayContext?.display ?: windowManager.defaultDisplay; display.getRealMetrics(dm); val w = dm.widthPixels; val h = dm.heightPixels; val targetW = (w * 0.5f).toInt(); val targetH = (h * 0.5f).toInt(); val left = (w - targetW) / 2; val top = (h - targetH) / 2; val bounds = Rect(left, top, left + targetW, top + targetH); val options = android.app.ActivityOptions.makeBasic(); options.setLaunchDisplayId(currentDisplayId); options.setLaunchBounds(bounds); try { val method = android.app.ActivityOptions::class.java.getMethod("setLaunchWindowingMode", Int::class.javaPrimitiveType); method.invoke(options, 5) } catch (e: Exception) {}; startActivity(intent, options.toBundle()); toggleDrawer(); if (shellService != null) { uiHandler.postDelayed({ Thread { try { shellService?.repositionTask(PACKAGE_TRACKPAD, left, top, left+targetW, top+targetH) } catch(e: Exception) { Log.e(TAG, "Shell launch failed", e) } }.start() }, 400) } } else { safeToast("Trackpad App not found") } } catch (e: Exception) { safeToast("Error launching Trackpad") }
    }

    private fun isTrackpadRunning(): Boolean { try { val am = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager; val runningApps = am.runningAppProcesses; if (runningApps != null) { for (info in runningApps) { if (info.processName == PACKAGE_TRACKPAD) return true } } } catch (e: Exception) {}; return false }
    private fun getLayoutName(type: Int): String { return when(type) { LAYOUT_FULL -> "1 App - Full"; LAYOUT_SIDE_BY_SIDE -> "Split"; LAYOUT_TOP_BOTTOM -> "Top/Bot"; LAYOUT_TRI_EVEN -> "Tri-Split"; LAYOUT_CORNERS -> "Quadrant"; LAYOUT_TRI_SIDE_MAIN_SIDE -> "3 Apps - Side/Main/Side"; LAYOUT_QUAD_ROW_EVEN -> "4 Apps - Row"; LAYOUT_CUSTOM_DYNAMIC -> "Custom"; else -> "Unknown" } }
    private fun getRatioName(index: Int): String { return when(index) { 1 -> "1:1"; 2 -> "16:9"; 3 -> "32:9"; else -> "Default" } }
    private fun getTargetDimensions(index: Int): Pair<Int, Int>? { return when(index) { 1 -> 1422 to 1500; 2 -> 1920 to 1080; 3 -> 3840 to 1080; else -> null } }
    private fun getResolutionCommand(index: Int): String { return when(index) { 1 -> "wm size 1422x1500 -d $currentDisplayId"; 2 -> "wm size 1920x1080 -d $currentDisplayId"; 3 -> "wm size 3840x1080 -d $currentDisplayId"; else -> "wm size reset -d $currentDisplayId" } }
    private fun sortAppQueue() { selectedAppsQueue.sortWith(compareBy { it.isMinimized }) }
    private fun updateSelectedAppsDock() { val dock = drawerView!!.findViewById<RecyclerView>(R.id.selected_apps_recycler); if (selectedAppsQueue.isEmpty()) { dock.visibility = View.GONE } else { dock.visibility = View.VISIBLE; dock.adapter?.notifyDataSetChanged(); dock.scrollToPosition(selectedAppsQueue.size - 1) } }
    private fun refreshSearchList() { val query = drawerView?.findViewById<EditText>(R.id.rofi_search_bar)?.text?.toString() ?: ""; filterList(query) }
    private fun filterList(query: String) {
        if (currentMode != MODE_SEARCH) return; val actualQuery = query.substringAfterLast(",").trim(); displayList.clear()
        val filtered = if (actualQuery.isEmpty()) { allAppsList } else { allAppsList.filter { it.label.contains(actualQuery, ignoreCase = true) } }
        val sorted = filtered.sortedWith(compareBy<MainActivity.AppInfo> { it.packageName != PACKAGE_BLANK }.thenByDescending { it.isFavorite }.thenBy { it.label.lowercase() }); displayList.addAll(sorted); drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged()
    }
    private fun addToSelection(app: MainActivity.AppInfo) {
        dismissKeyboardAndRestore(); val et = drawerView!!.findViewById<EditText>(R.id.rofi_search_bar)
        if (app.packageName == PACKAGE_BLANK) { selectedAppsQueue.add(app); sortAppQueue(); updateSelectedAppsDock(); drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged(); if (isInstantMode) applyLayoutImmediate(); return }
        val existing = selectedAppsQueue.find { it.packageName == app.packageName }; if (existing != null) { selectedAppsQueue.remove(existing); Thread { try { shellService?.forceStop(app.packageName) } catch(e: Exception) {} }.start(); safeToast("Removed ${app.label}"); sortAppQueue(); updateSelectedAppsDock(); drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged(); et.setText(""); if (isInstantMode) applyLayoutImmediate() } 
        else { app.isMinimized = false; selectedAppsQueue.add(app); sortAppQueue(); updateSelectedAppsDock(); drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged(); et.setText(""); if (isInstantMode) { launchViaApi(app.packageName, null); launchViaShell(app.packageName); uiHandler.postDelayed({ applyLayoutImmediate() }, 200); uiHandler.postDelayed({ applyLayoutImmediate() }, 800) } }
    }
    private fun toggleFavorite(app: MainActivity.AppInfo) { val newState = AppPreferences.toggleFavorite(this, app.packageName); app.isFavorite = newState; allAppsList.find { it.packageName == app.packageName }?.isFavorite = newState }
    private fun launchViaApi(pkg: String, bounds: Rect?) { try { val intent = packageManager.getLaunchIntentForPackage(pkg) ?: return; intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP); val options = android.app.ActivityOptions.makeBasic(); options.setLaunchDisplayId(currentDisplayId); if (bounds != null) options.setLaunchBounds(bounds); startActivity(intent, options.toBundle()) } catch (e: Exception) {} }
    private fun launchViaShell(pkg: String) { try { val intent = packageManager.getLaunchIntentForPackage(pkg) ?: return; if (shellService != null) { val component = intent.component?.flattenToShortString() ?: pkg; val cmd = "am start -n $component -a android.intent.action.MAIN -c android.intent.category.LAUNCHER --display $currentDisplayId --windowingMode 5 --user 0"; Thread { shellService?.runCommand(cmd) }.start() } } catch (e: Exception) {} }
    
    private fun cycleDisplay() {
        val dm = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager; val displays = dm.displays
        if (isVirtualDisplayActive) { val virtualDisp = displays.firstOrNull { it.displayId >= 2 }; if (virtualDisp != null) { val targetId = if (currentDisplayId == virtualDisp.displayId) { if (displays.any { it.displayId == lastPhysicalDisplayId }) lastPhysicalDisplayId else Display.DEFAULT_DISPLAY } else { lastPhysicalDisplayId = currentDisplayId; virtualDisp.displayId }; performDisplayChange(targetId); return } }
        val currentIdx = displays.indexOfFirst { it.displayId == currentDisplayId }; val nextIdx = if (currentIdx == -1) 0 else (currentIdx + 1) % displays.size; performDisplayChange(displays[nextIdx].displayId)
    }
    private fun performDisplayChange(newId: Int) {
        val dm = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager; val targetDisplay = dm.getDisplay(newId) ?: return; try { if (bubbleView != null && bubbleView!!.isAttachedToWindow) windowManager.removeView(bubbleView); if (drawerView != null && drawerView!!.isAttachedToWindow) windowManager.removeView(drawerView) } catch (e: Exception) {}; currentDisplayId = newId; setupDisplayContext(currentDisplayId); targetDisplayIndex = currentDisplayId; AppPreferences.setTargetDisplayIndex(this, targetDisplayIndex); setupBubble(); setupDrawer(); loadDisplaySettings(currentDisplayId); updateBubbleIcon(); isExpanded = false; safeToast("Switched to Display $currentDisplayId (${targetDisplay.name})")
    }
    private fun toggleVirtualDisplay(enable: Boolean) { isVirtualDisplayActive = enable; Thread { try { if (enable) { shellService?.runCommand("settings put global overlay_display_devices \"1920x1080/320\""); uiHandler.post { safeToast("Creating Virtual Display... Wait a moment, then Switch Display.") } } else { shellService?.runCommand("settings delete global overlay_display_devices"); uiHandler.post { safeToast("Destroying Virtual Display...") } } } catch (e: Exception) { Log.e(TAG, "Virtual Display Toggle Failed", e) } }.start(); if (currentMode == MODE_SETTINGS) uiHandler.postDelayed({ switchMode(MODE_SETTINGS) }, 500) }

    // --- v2.0 SCREEN OFF LOGIC ---
    private fun performScreenOff() {
        vibrate()
        isScreenOffState = true
        safeToast("Screen Off: Double press Power Button to turn on")
        
        if (useAltScreenOff) {
             // New Methodology: Fast Binder Call via Shizuku (v2.0)
             Thread {
                 try {
                     if (shellService != null) {
                         // -1 triggers the specific Extinguish logic in ShellUserService (v2.0: Single Arg)
                         shellService?.setBrightness(-1)
                         uiHandler.post { safeToast("Pixels OFF (Alternate Mode)") }
                     } else {
                         safeToast("Service Disconnected!")
                     }
                 } catch (e: Exception) {
                     Log.e(TAG, "Binder Call Failed", e)
                     safeToast("Error: ${e.message}")
                 }
            }.start()
        } else {
            // Default: SurfaceControl Power Off
            Thread { try { shellService?.setScreenOff(0, true) } catch (e: Exception) {} }.start()
            safeToast("Screen OFF (SurfaceControl)")
        }
    }
    
    private fun wakeUp() {
        vibrate()
        isScreenOffState = false
        
        // Restore brightness and power
        Thread { try { shellService?.setBrightness(128) } catch (e: Exception) {} }.start()
        Thread { try { shellService?.setScreenOff(0, false) } catch (e: Exception) {} }.start()

        safeToast("Screen On")
        if (currentMode == MODE_SETTINGS) drawerView?.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged()
    }

    private fun applyLayoutImmediate() { executeLaunch(selectedLayoutType, closeDrawer = false) }
    private fun fetchRunningApps() { if (shellService == null) return; Thread { try { val visiblePackages = shellService!!.getVisiblePackages(currentDisplayId); val allRunning = shellService!!.getAllRunningPackages(); val lastQueue = AppPreferences.getLastQueue(this); uiHandler.post { selectedAppsQueue.clear(); for (pkg in lastQueue) { if (pkg == PACKAGE_BLANK) { selectedAppsQueue.add(MainActivity.AppInfo(" (Blank Space)", PACKAGE_BLANK)) } else if (allRunning.contains(pkg)) { val appInfo = allAppsList.find { it.packageName == pkg }; if (appInfo != null) { appInfo.isMinimized = !visiblePackages.contains(pkg); selectedAppsQueue.add(appInfo) } } }; for (pkg in visiblePackages) { if (!lastQueue.contains(pkg)) { val appInfo = allAppsList.find { it.packageName == pkg }; if (appInfo != null) { appInfo.isMinimized = false; selectedAppsQueue.add(appInfo) } } }; sortAppQueue(); updateSelectedAppsDock(); drawerView?.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged(); safeToast("Instant Mode: Active") } } catch (e: Exception) { Log.e(TAG, "Error fetching apps", e) } }.start() }
    private fun selectLayout(opt: LayoutOption) { dismissKeyboardAndRestore(); selectedLayoutType = opt.type; activeCustomRects = opt.customRects; if (opt.type == LAYOUT_CUSTOM_DYNAMIC) { activeCustomLayoutName = opt.name; AppPreferences.saveLastCustomLayoutName(this, opt.name) } else { activeCustomLayoutName = null; AppPreferences.saveLastCustomLayoutName(this, null) }; AppPreferences.saveLastLayout(this, opt.type); drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged(); if (isInstantMode) applyLayoutImmediate() }
    private fun saveCurrentAsCustom() { Thread { try { val rawLayouts = shellService!!.getWindowLayouts(currentDisplayId); if (rawLayouts.isEmpty()) { safeToast("Found 0 active app windows"); return@Thread }; val rectStrings = mutableListOf<String>(); for (line in rawLayouts) { val parts = line.split("|"); if (parts.size == 2) { rectStrings.add(parts[1]) } }; if (rectStrings.isEmpty()) { safeToast("Found 0 valid frames"); return@Thread }; val count = rectStrings.size; var baseName = "$count Apps - Custom"; val existingNames = AppPreferences.getCustomLayoutNames(this); var counter = 1; var finalName = "$baseName $counter"; while (existingNames.contains(finalName)) { counter++; finalName = "$baseName $counter" }; AppPreferences.saveCustomLayout(this, finalName, rectStrings.joinToString("|")); safeToast("Saved: $finalName"); uiHandler.post { switchMode(MODE_LAYOUTS) } } catch (e: Exception) { Log.e(TAG, "Failed to save custom layout", e); safeToast("Error saving: ${e.message}") } }.start() }
    private fun applyResolution(opt: ResolutionOption) { dismissKeyboardAndRestore(); if (opt.index != -1) { selectedResolutionIndex = opt.index; AppPreferences.saveDisplayResolution(this, currentDisplayId, opt.index) }; drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged(); if (isInstantMode && opt.index != -1) { Thread { val resCmd = getResolutionCommand(selectedResolutionIndex); shellService?.runCommand(resCmd); Thread.sleep(1500); uiHandler.post { applyLayoutImmediate() } }.start() } }
    private fun selectDpi(value: Int) { currentDpiSetting = if (value == -1) -1 else value.coerceIn(50, 600); AppPreferences.saveDisplayDpi(this, currentDisplayId, currentDpiSetting); Thread { try { if (currentDpiSetting == -1) { shellService?.runCommand("wm density reset -d $currentDisplayId") } else { val dpiCmd = "wm density $currentDpiSetting -d $currentDisplayId"; shellService?.runCommand(dpiCmd) } } catch(e: Exception) { e.printStackTrace() } }.start() }
    private fun changeFontSize(newSize: Float) { currentFontSize = newSize.coerceIn(10f, 30f); AppPreferences.saveFontSize(this, currentFontSize); updateGlobalFontSize(); if (currentMode == MODE_SETTINGS) { switchMode(MODE_SETTINGS) } }
    private fun changeDrawerHeight(delta: Int) { currentDrawerHeightPercent = (currentDrawerHeightPercent + delta).coerceIn(30, 100); AppPreferences.setDrawerHeightPercent(this, currentDrawerHeightPercent); updateDrawerHeight(false); if (currentMode == MODE_SETTINGS) { drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged() } }
    private fun changeDrawerWidth(delta: Int) { currentDrawerWidthPercent = (currentDrawerWidthPercent + delta).coerceIn(30, 100); AppPreferences.setDrawerWidthPercent(this, currentDrawerWidthPercent); updateDrawerHeight(false); if (currentMode == MODE_SETTINGS) { drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged() } }
    private fun pickIcon() { toggleDrawer(); try { refreshDisplayId(); val intent = Intent(this, IconPickerActivity::class.java); intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); val metrics = windowManager.maximumWindowMetrics; val w = 1000; val h = (metrics.bounds.height() * 0.7).toInt(); val x = (metrics.bounds.width() - w) / 2; val y = (metrics.bounds.height() - h) / 2; val options = android.app.ActivityOptions.makeBasic(); options.setLaunchDisplayId(currentDisplayId); options.setLaunchBounds(Rect(x, y, x+w, y+h)); startActivity(intent, options.toBundle()) } catch (e: Exception) { safeToast("Error launching picker: ${e.message}") } }
    private fun saveProfile() { var name = drawerView?.findViewById<EditText>(R.id.rofi_search_bar)?.text?.toString()?.trim(); if (name.isNullOrEmpty()) { val timestamp = SimpleDateFormat("HH:mm", Locale.getDefault()).format(Date()); name = "Profile_$timestamp" }; val pkgs = selectedAppsQueue.map { it.packageName }; AppPreferences.saveProfile(this, name, selectedLayoutType, selectedResolutionIndex, currentDpiSetting, pkgs); safeToast("Saved: $name"); drawerView?.findViewById<EditText>(R.id.rofi_search_bar)?.setText(""); switchMode(MODE_PROFILES) }
    private fun loadProfile(name: String) { val data = AppPreferences.getProfileData(this, name) ?: return; try { val parts = data.split("|"); selectedLayoutType = parts[0].toInt(); selectedResolutionIndex = parts[1].toInt(); currentDpiSetting = parts[2].toInt(); val pkgList = parts[3].split(","); selectedAppsQueue.clear(); for (pkg in pkgList) { if (pkg.isNotEmpty()) { if (pkg == PACKAGE_BLANK) { selectedAppsQueue.add(MainActivity.AppInfo(" (Blank Space)", PACKAGE_BLANK)) } else { val app = allAppsList.find { it.packageName == pkg }; if (app != null) selectedAppsQueue.add(app) } } }; AppPreferences.saveLastLayout(this, selectedLayoutType); AppPreferences.saveDisplayResolution(this, currentDisplayId, selectedResolutionIndex); AppPreferences.saveDisplayDpi(this, currentDisplayId, currentDpiSetting); activeProfileName = name; updateSelectedAppsDock(); safeToast("Loaded: $name"); drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged(); if (isInstantMode) applyLayoutImmediate() } catch (e: Exception) { Log.e(TAG, "Failed to load profile", e) } }
    
    private fun executeLaunch(layoutType: Int, closeDrawer: Boolean) { 
        if (closeDrawer) toggleDrawer(); refreshDisplayId(); val pkgs = selectedAppsQueue.map { it.packageName }; AppPreferences.saveLastQueue(this, pkgs)
        Thread { try { val resCmd = getResolutionCommand(selectedResolutionIndex); shellService?.runCommand(resCmd); if (currentDpiSetting > 0) { val dpiCmd = "wm density $currentDpiSetting -d $currentDisplayId"; shellService?.runCommand(dpiCmd) } else { if (currentDpiSetting == -1) shellService?.runCommand("wm density reset -d $currentDisplayId") }; Thread.sleep(800); val targetDim = getTargetDimensions(selectedResolutionIndex); var w = 0; var h = 0; if (targetDim != null) { w = targetDim.first; h = targetDim.second } else { val dm = getSystemService(Context.DISPLAY_SERVICE) as DisplayManager; val display = dm.getDisplay(currentDisplayId); if (display != null) { val metrics = DisplayMetrics(); display.getRealMetrics(metrics); w = metrics.widthPixels; h = metrics.heightPixels } else { val bounds = windowManager.maximumWindowMetrics.bounds; w = bounds.width(); h = bounds.height() } }; val rects = mutableListOf<Rect>(); when (layoutType) { LAYOUT_FULL -> { rects.add(Rect(0, 0, w, h)) }; LAYOUT_SIDE_BY_SIDE -> { rects.add(Rect(0, 0, w/2, h)); rects.add(Rect(w/2, 0, w, h)) }; LAYOUT_TOP_BOTTOM -> { rects.add(Rect(0, 0, w, h/2)); rects.add(Rect(0, h/2, w, h)) }; LAYOUT_TRI_EVEN -> { val third = w / 3; rects.add(Rect(0, 0, third, h)); rects.add(Rect(third, 0, third * 2, h)); rects.add(Rect(third * 2, 0, w, h)) }; LAYOUT_CORNERS -> { rects.add(Rect(0, 0, w/2, h/2)); rects.add(Rect(w/2, 0, w, h/2)); rects.add(Rect(0, h/2, w/2, h)); rects.add(Rect(w/2, h/2, w, h)) }; LAYOUT_TRI_SIDE_MAIN_SIDE -> { val quarter = w / 4; rects.add(Rect(0, 0, quarter, h)); rects.add(Rect(quarter, 0, quarter * 3, h)); rects.add(Rect(quarter * 3, 0, w, h)) }; LAYOUT_QUAD_ROW_EVEN -> { val quarter = w / 4; rects.add(Rect(0, 0, quarter, h)); rects.add(Rect(quarter, 0, quarter * 2, h)); rects.add(Rect(quarter * 2, 0, quarter * 3, h)); rects.add(Rect(quarter * 3, 0, w, h)) }; LAYOUT_CUSTOM_DYNAMIC -> { if (activeCustomRects != null) { rects.addAll(activeCustomRects!!) } else { rects.add(Rect(0, 0, w/2, h)); rects.add(Rect(w/2, 0, w, h)) } } }; if (selectedAppsQueue.isNotEmpty()) { val minimizedApps = selectedAppsQueue.filter { it.isMinimized }; for (app in minimizedApps) { if (app.packageName != PACKAGE_BLANK) { try { val tid = shellService?.getTaskId(app.packageName) ?: -1; if (tid != -1) shellService?.moveTaskToBack(tid) } catch (e: Exception) { Log.e(TAG, "Failed to minimize ${app.packageName}", e) } } }; val activeApps = selectedAppsQueue.filter { !it.isMinimized }; if (killAppOnExecute) { for (app in activeApps) { if (app.packageName != PACKAGE_BLANK) { shellService?.forceStop(app.packageName) } }; Thread.sleep(400) } else { Thread.sleep(100) }; val count = Math.min(activeApps.size, rects.size); for (i in 0 until count) { val pkg = activeApps[i].packageName; val bounds = rects[i]; if (pkg == PACKAGE_BLANK) continue; uiHandler.postDelayed({ launchViaApi(pkg, bounds) }, (i * 150).toLong()); uiHandler.postDelayed({ launchViaShell(pkg) }, (i * 150 + 50).toLong()); if (!killAppOnExecute) { uiHandler.postDelayed({ Thread { try { shellService?.repositionTask(pkg, bounds.left, bounds.top, bounds.right, bounds.bottom) } catch (e: Exception) {} }.start() }, (i * 150 + 150).toLong()) }; uiHandler.postDelayed({ Thread { try { shellService?.repositionTask(pkg, bounds.left, bounds.top, bounds.right, bounds.bottom) } catch (e: Exception) {} }.start() }, (i * 150 + 800).toLong()) }; if (closeDrawer) { uiHandler.post { selectedAppsQueue.clear(); updateSelectedAppsDock() } } } } catch (e: Exception) { Log.e(TAG, "Execute Failed", e); safeToast("Execute Failed: ${e.message}") } }.start(); drawerView?.findViewById<EditText>(R.id.rofi_search_bar)?.setText("") 
    }
    
    private fun calculateGCD(a: Int, b: Int): Int { return if (b == 0) a else calculateGCD(b, a % b) }

    private fun switchMode(mode: Int) {
        currentMode = mode
        val searchBar = drawerView!!.findViewById<EditText>(R.id.rofi_search_bar); val searchIcon = drawerView!!.findViewById<ImageView>(R.id.icon_search_mode); val iconWin = drawerView!!.findViewById<ImageView>(R.id.icon_mode_window); val iconRes = drawerView!!.findViewById<ImageView>(R.id.icon_mode_resolution); val iconDpi = drawerView!!.findViewById<ImageView>(R.id.icon_mode_dpi); val iconProf = drawerView!!.findViewById<ImageView>(R.id.icon_mode_profiles); val iconSet = drawerView!!.findViewById<ImageView>(R.id.icon_mode_settings); val executeBtn = drawerView!!.findViewById<ImageView>(R.id.icon_execute)
        searchIcon.setColorFilter(if(mode==MODE_SEARCH) Color.WHITE else Color.GRAY); iconWin.setColorFilter(if(mode==MODE_LAYOUTS) Color.WHITE else Color.GRAY); iconRes.setColorFilter(if(mode==MODE_RESOLUTION) Color.WHITE else Color.GRAY); iconDpi.setColorFilter(if(mode==MODE_DPI) Color.WHITE else Color.GRAY); iconProf.setColorFilter(if(mode==MODE_PROFILES) Color.WHITE else Color.GRAY); iconSet.setColorFilter(if(mode==MODE_SETTINGS) Color.WHITE else Color.GRAY)
        executeBtn.visibility = if (isInstantMode) View.GONE else View.VISIBLE; displayList.clear(); val dock = drawerView!!.findViewById<RecyclerView>(R.id.selected_apps_recycler); dock.visibility = if (mode == MODE_SEARCH && selectedAppsQueue.isNotEmpty()) View.VISIBLE else View.GONE
        
        when (mode) {
            MODE_SEARCH -> { searchBar.hint = "Search apps..."; refreshSearchList() }
            MODE_LAYOUTS -> { 
                searchBar.hint = "Select Layout"; displayList.add(ActionOption("Save Current Arrangement") { saveCurrentAsCustom() }); displayList.add(LayoutOption("1 App - Full Screen", LAYOUT_FULL)); displayList.add(LayoutOption("2 Apps - Side by Side", LAYOUT_SIDE_BY_SIDE)); displayList.add(LayoutOption("2 Apps - Top & Bottom", LAYOUT_TOP_BOTTOM)); displayList.add(LayoutOption("3 Apps - Even", LAYOUT_TRI_EVEN)); displayList.add(LayoutOption("3 Apps - Side/Main/Side (25/50/25)", LAYOUT_TRI_SIDE_MAIN_SIDE)); displayList.add(LayoutOption("4 Apps - Corners", LAYOUT_CORNERS)); displayList.add(LayoutOption("4 Apps - Row (Even)", LAYOUT_QUAD_ROW_EVEN));
                val customNames = AppPreferences.getCustomLayoutNames(this).sorted(); for (name in customNames) { val data = AppPreferences.getCustomLayoutData(this, name); if (data != null) { try { val rects = mutableListOf<Rect>(); val rectParts = data.split("|"); for (rp in rectParts) { val coords = rp.split(","); if (coords.size == 4) { rects.add(Rect(coords[0].toInt(), coords[1].toInt(), coords[2].toInt(), coords[3].toInt())) } }; displayList.add(LayoutOption(name, LAYOUT_CUSTOM_DYNAMIC, true, rects)) } catch(e: Exception) {} } } 
            }
            MODE_RESOLUTION -> {
                searchBar.hint = "Select Resolution"; displayList.add(CustomResInputOption); val savedResNames = AppPreferences.getCustomResolutionNames(this).sorted(); for (name in savedResNames) { val value = AppPreferences.getCustomResolutionValue(this, name) ?: continue; displayList.add(ResolutionOption(name, "wm size  -d $currentDisplayId", 100 + savedResNames.indexOf(name))) }; displayList.add(ResolutionOption("Default (Reset)", "wm size reset -d $currentDisplayId", 0)); displayList.add(ResolutionOption("1:1 Square (1422x1500)", "wm size 1422x1500 -d $currentDisplayId", 1)); displayList.add(ResolutionOption("16:9 Landscape (1920x1080)", "wm size 1920x1080 -d $currentDisplayId", 2)); displayList.add(ResolutionOption("32:9 Ultrawide (3840x1080)", "wm size 3840x1080 -d $currentDisplayId", 3))
            }
            MODE_DPI -> { searchBar.hint = "Adjust Density (DPI)"; displayList.add(ActionOption("Reset Density (Default)") { selectDpi(-1) }); var savedDpi = currentDpiSetting; if (savedDpi <= 0) { savedDpi = displayContext?.resources?.configuration?.densityDpi ?: 160 }; displayList.add(DpiOption(savedDpi)) }
            MODE_PROFILES -> { searchBar.hint = "Enter Profile Name..."; displayList.add(ProfileOption("Save Current as New", true, 0,0,0, emptyList())); val profileNames = AppPreferences.getProfileNames(this).sorted(); for (pName in profileNames) { val data = AppPreferences.getProfileData(this, pName); if (data != null) { try { val parts = data.split("|"); val lay = parts[0].toInt(); val res = parts[1].toInt(); val d = parts[2].toInt(); val pkgs = parts[3].split(",").filter { it.isNotEmpty() }; displayList.add(ProfileOption(pName, false, lay, res, d, pkgs)) } catch(e: Exception) {} } } }
            MODE_SETTINGS -> {
                searchBar.hint = "Settings"
                displayList.add(ActionOption("Launch DroidOS Trackpad") { launchTrackpad() }) 
                displayList.add(ActionOption("Switch Display (Current $currentDisplayId)") { cycleDisplay() })
                displayList.add(ToggleOption("Virtual Display (1080p)", isVirtualDisplayActive) { toggleVirtualDisplay(it) })
                displayList.add(HeightOption(currentDrawerHeightPercent))
                displayList.add(WidthOption(currentDrawerWidthPercent))
                displayList.add(ToggleOption("Auto-Shrink for Keyboard", autoResizeEnabled) { autoResizeEnabled = it; AppPreferences.setAutoResizeKeyboard(this, it) })
                displayList.add(FontSizeOption(currentFontSize))
                displayList.add(IconOption("Launcher Icon (Tap to Change)"))
                displayList.add(ToggleOption("Reorder: Drag & Drop", isReorderDragEnabled) { isReorderDragEnabled = it; AppPreferences.setReorderDrag(this, it) })
                displayList.add(ToggleOption("Reorder: Tap to Swap (Long Press)", isReorderTapEnabled) { isReorderTapEnabled = it; AppPreferences.setReorderTap(this, it) })
                displayList.add(ToggleOption("Instant Mode (Live Changes)", isInstantMode) { isInstantMode = it; AppPreferences.setInstantMode(this, it); executeBtn.visibility = if (it) View.GONE else View.VISIBLE; if (it) fetchRunningApps() })
                displayList.add(ToggleOption("Kill App on Execute", killAppOnExecute) { killAppOnExecute = it; AppPreferences.setKillOnExecute(this, it) })
                
                // --- V2.0 MENU ITEMS RESTORED ---
                
                // STANDARD MODE TOGGLE
                displayList.add(ToggleOption("Screen Off (Standard)", isScreenOffState && !useAltScreenOff) { 
                    if (it) {
                        if (isScreenOffState) wakeUp() // Reset if already off
                        useAltScreenOff = false
                        AppPreferences.setUseAltScreenOff(this, false)
                        performScreenOff()
                    } else {
                        wakeUp()
                    }
                })

                // ALTERNATE MODE TOGGLE
                displayList.add(ToggleOption("Screen Off (Alternate)", isScreenOffState && useAltScreenOff) { 
                    if (it) {
                        if (isScreenOffState) wakeUp() // Reset if already off
                        useAltScreenOff = true
                        AppPreferences.setUseAltScreenOff(this, true)
                        performScreenOff()
                    } else {
                        wakeUp()
                    }
                })
                
                displayList.add(ToggleOption("Shizuku Warning (Icon Alert)", showShizukuWarning) { showShizukuWarning = it; AppPreferences.setShowShizukuWarning(this, it); updateBubbleIcon() })
            }
        }
        drawerView!!.findViewById<RecyclerView>(R.id.rofi_recycler_view)?.adapter?.notifyDataSetChanged()
    }
    
    object CustomResInputOption
    data class LayoutOption(val name: String, val type: Int, val isCustomSaved: Boolean = false, val customRects: List<Rect>? = null)
    data class ResolutionOption(val name: String, val command: String, val index: Int)
    data class DpiOption(val currentDpi: Int)
    data class ProfileOption(val name: String, val isCurrent: Boolean, val layout: Int, val resIndex: Int, val dpi: Int, val apps: List<String>)
    data class FontSizeOption(val currentSize: Float)
    data class HeightOption(val currentPercent: Int)
    data class WidthOption(val currentPercent: Int)
    data class IconOption(val name: String)
    data class ActionOption(val name: String, val action: () -> Unit)
    data class ToggleOption(val name: String, var isEnabled: Boolean, val onToggle: (Boolean) -> Unit)
    data class TimeoutOption(val seconds: Int)

    inner class SelectedAppsAdapter : RecyclerView.Adapter<SelectedAppsAdapter.Holder>() {
        inner class Holder(v: View) : RecyclerView.ViewHolder(v) { val icon: ImageView = v.findViewById(R.id.selected_app_icon) }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder { return Holder(LayoutInflater.from(parent.context).inflate(R.layout.item_selected_app, parent, false)) }
        override fun onBindViewHolder(holder: Holder, position: Int) { 
            val app = selectedAppsQueue[position]; if (position == reorderSelectionIndex) { holder.icon.setColorFilter(HIGHLIGHT_COLOR); holder.icon.alpha = 1.0f; holder.itemView.scaleX = 1.1f; holder.itemView.scaleY = 1.1f; holder.itemView.background = null } else { holder.icon.clearColorFilter(); holder.itemView.scaleX = 1.0f; holder.itemView.scaleY = 1.0f; holder.itemView.background = null; if (app.packageName == PACKAGE_BLANK) { holder.icon.setImageResource(R.drawable.ic_box_outline); holder.icon.alpha = 1.0f } else { try { holder.icon.setImageDrawable(packageManager.getApplicationIcon(app.packageName)) } catch (e: Exception) { holder.icon.setImageResource(R.drawable.ic_launcher_bubble) }; holder.icon.alpha = if (app.isMinimized) 0.4f else 1.0f } }
            holder.itemView.setOnClickListener { try { dismissKeyboardAndRestore(); if (reorderSelectionIndex != -1) { if (position == reorderSelectionIndex) { endReorderMode(false) } else { swapReorderItem(position) } } else { if (app.packageName != PACKAGE_BLANK) { app.isMinimized = !app.isMinimized; notifyItemChanged(position); if (isInstantMode) applyLayoutImmediate() } } } catch(e: Exception) {} }
            holder.itemView.setOnLongClickListener { if (isReorderTapEnabled) { startReorderMode(position); true } else { false } }
        }
        override fun getItemCount() = selectedAppsQueue.size
    }

    inner class RofiAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
        inner class AppHolder(v: View) : RecyclerView.ViewHolder(v) { val icon: ImageView = v.findViewById(R.id.rofi_app_icon); val text: TextView = v.findViewById(R.id.rofi_app_text); val star: ImageView = v.findViewById(R.id.rofi_app_star) }
        inner class LayoutHolder(v: View) : RecyclerView.ViewHolder(v) { val nameInput: EditText = v.findViewById(R.id.layout_name); val btnSave: ImageView = v.findViewById(R.id.btn_save_profile); val btnExtinguish: ImageView = v.findViewById(R.id.btn_extinguish_item) }
        inner class DpiHolder(v: View) : RecyclerView.ViewHolder(v) { val btnMinus: ImageView = v.findViewById(R.id.btn_dpi_minus); val btnPlus: ImageView = v.findViewById(R.id.btn_dpi_plus); val input: EditText = v.findViewById(R.id.input_dpi_value) }
        inner class FontSizeHolder(v: View) : RecyclerView.ViewHolder(v) { val btnMinus: ImageView = v.findViewById(R.id.btn_font_minus); val btnPlus: ImageView = v.findViewById(R.id.btn_font_plus); val textVal: TextView = v.findViewById(R.id.text_font_value) }
        inner class HeightHolder(v: View) : RecyclerView.ViewHolder(v) { val btnMinus: ImageView = v.findViewById(R.id.btn_height_minus); val btnPlus: ImageView = v.findViewById(R.id.btn_height_plus); val textVal: TextView = v.findViewById(R.id.text_height_value) }
        inner class WidthHolder(v: View) : RecyclerView.ViewHolder(v) { val btnMinus: ImageView = v.findViewById(R.id.btn_width_minus); val btnPlus: ImageView = v.findViewById(R.id.btn_width_plus); val textVal: TextView = v.findViewById(R.id.text_width_value) }
        inner class ProfileRichHolder(v: View) : RecyclerView.ViewHolder(v) { val name: EditText = v.findViewById(R.id.profile_name_text); val details: TextView = v.findViewById(R.id.profile_details_text); val iconsContainer: LinearLayout = v.findViewById(R.id.profile_icons_container); val btnSave: ImageView = v.findViewById(R.id.btn_save_profile_rich) }
        inner class IconSettingHolder(v: View) : RecyclerView.ViewHolder(v) { val preview: ImageView = v.findViewById(R.id.icon_setting_preview) }
        inner class CustomResInputHolder(v: View) : RecyclerView.ViewHolder(v) { val inputW: EditText = v.findViewById(R.id.input_res_w); val inputH: EditText = v.findViewById(R.id.input_res_h); val btnSave: ImageView = v.findViewById(R.id.btn_save_res) }

        override fun getItemViewType(position: Int): Int { return when (displayList[position]) { is MainActivity.AppInfo -> 0; is LayoutOption -> 1; is ResolutionOption -> 1; is DpiOption -> 2; is ProfileOption -> 4; is FontSizeOption -> 3; is IconOption -> 5; is ToggleOption -> 1; is ActionOption -> 6; is HeightOption -> 7; is WidthOption -> 8; is CustomResInputOption -> 9; else -> 0 } }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder { return when (viewType) { 0 -> AppHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_app_rofi, parent, false)); 1 -> LayoutHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout_option, parent, false)); 2 -> DpiHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_dpi_custom, parent, false)); 3 -> FontSizeHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_font_size, parent, false)); 4 -> ProfileRichHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_profile_rich, parent, false)); 5 -> IconSettingHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_icon_setting, parent, false)); 6 -> LayoutHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout_option, parent, false)); 7 -> HeightHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_height_setting, parent, false)); 8 -> WidthHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_width_setting, parent, false)); 9 -> CustomResInputHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_custom_resolution, parent, false)); else -> AppHolder(View(parent.context)) } }
        private fun startRename(editText: EditText) { editText.isEnabled = true; editText.isFocusable = true; editText.isFocusableInTouchMode = true; editText.requestFocus(); val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager; imm.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT) }
        private fun endRename(editText: EditText) { editText.isFocusable = false; editText.isFocusableInTouchMode = false; editText.isEnabled = false; val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager; imm.hideSoftInputFromWindow(editText.windowToken, 0) }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            val item = displayList[position]
            if (holder is AppHolder) holder.text.textSize = currentFontSize
            if (holder is LayoutHolder) holder.nameInput.textSize = currentFontSize
            if (holder is ProfileRichHolder) holder.name.textSize = currentFontSize

            if (holder is AppHolder && item is MainActivity.AppInfo) { holder.text.text = item.label; if (item.packageName == PACKAGE_BLANK) { holder.icon.setImageResource(R.drawable.ic_box_outline) } else { try { holder.icon.setImageDrawable(packageManager.getApplicationIcon(item.packageName)) } catch (e: Exception) { holder.icon.setImageResource(R.drawable.ic_launcher_bubble) } }; val isSelected = selectedAppsQueue.any { it.packageName == item.packageName }; if (isSelected) holder.itemView.setBackgroundResource(R.drawable.bg_item_active) else holder.itemView.setBackgroundResource(R.drawable.bg_item_press); holder.star.visibility = if (item.isFavorite) View.VISIBLE else View.GONE; holder.itemView.setOnClickListener { addToSelection(item) }; holder.itemView.setOnLongClickListener { toggleFavorite(item); refreshSearchList(); true } }
            else if (holder is ProfileRichHolder && item is ProfileOption) { holder.name.setText(item.name); holder.iconsContainer.removeAllViews(); if (!item.isCurrent) { for (pkg in item.apps.take(5)) { val iv = ImageView(holder.itemView.context); val lp = LinearLayout.LayoutParams(60, 60); lp.marginEnd = 8; iv.layoutParams = lp; if (pkg == PACKAGE_BLANK) { iv.setImageResource(R.drawable.ic_box_outline) } else { try { iv.setImageDrawable(packageManager.getApplicationIcon(pkg)) } catch (e: Exception) { iv.setImageResource(R.drawable.ic_launcher_bubble) } }; holder.iconsContainer.addView(iv) }; val info = "${getLayoutName(item.layout)} | ${getRatioName(item.resIndex)} | ${item.dpi}dpi"; holder.details.text = info; holder.details.visibility = View.VISIBLE; holder.btnSave.visibility = View.GONE; if (activeProfileName == item.name) { holder.itemView.setBackgroundResource(R.drawable.bg_item_active) } else { holder.itemView.setBackgroundResource(0) }; holder.itemView.setOnClickListener { dismissKeyboardAndRestore(); loadProfile(item.name) }; holder.itemView.setOnLongClickListener { startRename(holder.name); true }; val saveProfileName = { val newName = holder.name.text.toString().trim(); if (newName.isNotEmpty() && newName != item.name) { if (AppPreferences.renameProfile(holder.itemView.context, item.name, newName)) { safeToast("Renamed to $newName"); switchMode(MODE_PROFILES) } }; endRename(holder.name) }; holder.name.setOnEditorActionListener { v, actionId, _ -> if (actionId == EditorInfo.IME_ACTION_DONE) { saveProfileName(); holder.name.clearFocus(); val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager; imm.hideSoftInputFromWindow(holder.name.windowToken, 0); updateDrawerHeight(false); true } else false }; holder.name.setOnFocusChangeListener { v, hasFocus -> if (autoResizeEnabled) updateDrawerHeight(hasFocus); if (!hasFocus) saveProfileName() } } else { holder.iconsContainer.removeAllViews(); holder.details.visibility = View.GONE; holder.btnSave.visibility = View.VISIBLE; holder.itemView.setBackgroundResource(0); holder.name.isEnabled = true; holder.name.isFocusable = true; holder.name.isFocusableInTouchMode = true; holder.itemView.setOnClickListener { saveProfile() }; holder.btnSave.setOnClickListener { saveProfile() } } }
            else if (holder is LayoutHolder) {
                holder.btnSave.visibility = View.GONE; holder.btnExtinguish.visibility = View.GONE
                if (item is LayoutOption) { holder.nameInput.setText(item.name); val isSelected = if (item.type == LAYOUT_CUSTOM_DYNAMIC) { item.type == selectedLayoutType && item.name == activeCustomLayoutName } else { item.type == selectedLayoutType && activeCustomLayoutName == null }; if (isSelected) holder.itemView.setBackgroundResource(R.drawable.bg_item_active) else holder.itemView.setBackgroundResource(R.drawable.bg_item_press); holder.itemView.setOnClickListener { selectLayout(item) }; if (item.isCustomSaved) { holder.itemView.setOnLongClickListener { startRename(holder.nameInput); true }; val saveLayoutName = { val newName = holder.nameInput.text.toString().trim(); if (newName.isNotEmpty() && newName != item.name) { if (AppPreferences.renameCustomLayout(holder.itemView.context, item.name, newName)) { safeToast("Renamed to $newName"); if (activeCustomLayoutName == item.name) { activeCustomLayoutName = newName; AppPreferences.saveLastCustomLayoutName(holder.itemView.context, newName) }; switchMode(MODE_LAYOUTS) } }; endRename(holder.nameInput) }; holder.nameInput.setOnEditorActionListener { v, actionId, _ -> if (actionId == EditorInfo.IME_ACTION_DONE) { saveLayoutName(); true } else false }; holder.nameInput.setOnFocusChangeListener { v, hasFocus -> if (!hasFocus) saveLayoutName() } } else { holder.nameInput.isEnabled = false; holder.nameInput.isFocusable = false; holder.nameInput.setTextColor(Color.WHITE) } }
                else if (item is ResolutionOption) { 
                    holder.nameInput.setText(item.name); if (item.index >= 100) { holder.nameInput.isEnabled = false; holder.nameInput.setTextColor(Color.WHITE); holder.itemView.setOnLongClickListener { startRename(holder.nameInput); true }; val saveResName = { val newName = holder.nameInput.text.toString().trim(); if (newName.isNotEmpty() && newName != item.name) { if (AppPreferences.renameCustomResolution(holder.itemView.context, item.name, newName)) { safeToast("Renamed to $newName"); switchMode(MODE_RESOLUTION) } }; endRename(holder.nameInput) }; holder.nameInput.setOnEditorActionListener { v, actionId, _ -> if (actionId == EditorInfo.IME_ACTION_DONE) { saveResName(); true } else false }; holder.nameInput.setOnFocusChangeListener { v, hasFocus -> if (!hasFocus) saveResName() } } else { holder.nameInput.isEnabled = false; holder.nameInput.isFocusable = false; holder.nameInput.setTextColor(Color.WHITE) }; val isSelected = (item.index == selectedResolutionIndex); if (isSelected) holder.itemView.setBackgroundResource(R.drawable.bg_item_active) else holder.itemView.setBackgroundResource(R.drawable.bg_item_press); holder.itemView.setOnClickListener { applyResolution(item) } 
                }
                else if (item is IconOption) { holder.nameInput.setText(item.name); holder.nameInput.isEnabled = false; holder.nameInput.setTextColor(Color.WHITE); holder.itemView.setBackgroundResource(R.drawable.bg_item_press); holder.itemView.setOnClickListener { pickIcon() } }
                else if (item is ToggleOption) { holder.nameInput.setText(item.name); holder.nameInput.isEnabled = false; holder.nameInput.setTextColor(Color.WHITE); if (item.isEnabled) holder.itemView.setBackgroundResource(R.drawable.bg_item_active) else holder.itemView.setBackgroundResource(R.drawable.bg_item_press); holder.itemView.setOnClickListener { dismissKeyboardAndRestore(); item.isEnabled = !item.isEnabled; item.onToggle(item.isEnabled); notifyItemChanged(position) } } 
                else if (item is ActionOption) { holder.nameInput.setText(item.name); holder.nameInput.isEnabled = false; holder.nameInput.setTextColor(Color.WHITE); holder.itemView.setBackgroundResource(R.drawable.bg_item_press); holder.itemView.setOnClickListener { dismissKeyboardAndRestore(); item.action() } }
            }
            else if (holder is CustomResInputHolder) {
                holder.btnSave.setOnClickListener { val wStr = holder.inputW.text.toString().trim(); val hStr = holder.inputH.text.toString().trim(); if (wStr.isNotEmpty() && hStr.isNotEmpty()) { val w = wStr.toIntOrNull(); val h = hStr.toIntOrNull(); if (w != null && h != null && w > 0 && h > 0) { val gcdVal = calculateGCD(w, h); val wRatio = w / gcdVal; val hRatio = h / gcdVal; val resString = "${w}x${h}"; val name = "$wRatio:$hRatio Custom ($resString)"; AppPreferences.saveCustomResolution(holder.itemView.context, name, resString); safeToast("Added $name"); dismissKeyboardAndRestore(); switchMode(MODE_RESOLUTION) } else { safeToast("Invalid numbers") } } else { safeToast("Input W and H") } }
                holder.inputW.setOnFocusChangeListener { _, hasFocus -> if (autoResizeEnabled) updateDrawerHeight(hasFocus) }; holder.inputH.setOnFocusChangeListener { _, hasFocus -> if (autoResizeEnabled) updateDrawerHeight(hasFocus) }
            }
            else if (holder is IconSettingHolder && item is IconOption) { try { val uriStr = AppPreferences.getIconUri(holder.itemView.context); if (uriStr != null) { val uri = Uri.parse(uriStr); val input = contentResolver.openInputStream(uri); val bitmap = BitmapFactory.decodeStream(input); input?.close(); holder.preview.setImageBitmap(bitmap) } else { holder.preview.setImageResource(R.drawable.ic_launcher_bubble) } } catch(e: Exception) { holder.preview.setImageResource(R.drawable.ic_launcher_bubble) }; holder.itemView.setOnClickListener { pickIcon() } }
            else if (holder is DpiHolder && item is DpiOption) { 
                holder.input.setText(item.currentDpi.toString()); holder.input.setOnEditorActionListener { v, actionId, _ -> if (actionId == EditorInfo.IME_ACTION_DONE) { val valInt = v.text.toString().toIntOrNull(); if (valInt != null) { selectDpi(valInt); safeToast("DPI set to $valInt") }; dismissKeyboardAndRestore(); true } else false }; holder.input.setOnFocusChangeListener { _, hasFocus -> if (autoResizeEnabled) updateDrawerHeight(hasFocus); if (!hasFocus) { val valInt = holder.input.text.toString().toIntOrNull(); if (valInt != null && valInt != item.currentDpi) { selectDpi(valInt) } } }; holder.btnMinus.setOnClickListener { val v = holder.input.text.toString().toIntOrNull() ?: 160; val newVal = (v - 5).coerceAtLeast(50); holder.input.setText(newVal.toString()); selectDpi(newVal) }; holder.btnPlus.setOnClickListener { val v = holder.input.text.toString().toIntOrNull() ?: 160; val newVal = (v + 5).coerceAtMost(600); holder.input.setText(newVal.toString()); selectDpi(newVal) } 
            }
            else if (holder is FontSizeHolder && item is FontSizeOption) { holder.textVal.text = item.currentSize.toInt().toString(); holder.btnMinus.setOnClickListener { changeFontSize(item.currentSize - 1) }; holder.btnPlus.setOnClickListener { changeFontSize(item.currentSize + 1) } }
            else if (holder is HeightHolder && item is HeightOption) { holder.textVal.text = item.currentPercent.toString(); holder.btnMinus.setOnClickListener { changeDrawerHeight(-5) }; holder.btnPlus.setOnClickListener { changeDrawerHeight(5) } }
            else if (holder is WidthHolder && item is WidthOption) { holder.textVal.text = item.currentPercent.toString(); holder.btnMinus.setOnClickListener { changeDrawerWidth(-5) }; holder.btnPlus.setOnClickListener { changeDrawerWidth(5) } }
        }
        override fun getItemCount() = displayList.size
    }
}
```

## File: app/src/main/java/com/example/quadrantlauncher/IconPickerActivity.kt
```kotlin
package com.example.quadrantlauncher

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.result.contract.ActivityResultContracts

class IconPickerActivity : ComponentActivity() {

    private val pickImage = registerForActivityResult(ActivityResultContracts.OpenDocument()) { uri ->
        if (uri != null) {
            try {
                // Persist permission so we can read this after reboot
                contentResolver.takePersistableUriPermission(
                    uri, 
                    Intent.FLAG_GRANT_READ_URI_PERMISSION
                )
                AppPreferences.saveIconUri(this, uri.toString())
                
                // Notify Service to update
                sendBroadcast(Intent("com.example.quadrantlauncher.UPDATE_ICON"))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Invisible activity
        
        try {
            pickImage.launch(arrayOf("image/*"))
        } catch (e: Exception) {
            finish()
        }
    }
}
```

## File: app/src/main/java/com/example/quadrantlauncher/MainActivity.kt
```kotlin
package com.example.quadrantlauncher

import android.accessibilityservice.AccessibilityServiceInfo
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.accessibility.AccessibilityManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import rikka.shizuku.Shizuku

class MainActivity : AppCompatActivity() {

    companion object {
        const val SELECTED_APP_PACKAGE = "com.example.quadrantlauncher.SELECTED_APP_PACKAGE"
    }

    // === APP INFO DATA CLASS - START ===
    // Represents an installed app with package name, activity class, and state info
    // getIdentifier() returns a unique string for app identification including className when needed
    data class AppInfo(
        val label: String,
        val packageName: String,
        val className: String? = null,
        var isFavorite: Boolean = false,
        var isMinimized: Boolean = false
    ) {
        // Returns unique identifier for the app
        fun getIdentifier(): String {
            return if (!className.isNullOrEmpty() && packageName == "com.google.android.googlequicksearchbox") {
                if (className.lowercase().contains("assistant") || className.lowercase().contains("gemini")) {
                    "$packageName:gemini"
                } else {
                    packageName
                }
            } else {
                packageName
            }
        }
        
        // === GET BASE PACKAGE - START ===
        // Returns the base package name without any suffix
        // Use this for shell commands that need the actual Android package name
        fun getBasePackage(): String {
            return if (packageName.contains(":")) {
                packageName.substringBefore(":")
            } else {
                packageName
            }
        }
        // === GET BASE PACKAGE - END ===

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other !is AppInfo) return false
            return packageName == other.packageName && className == other.className && label == other.label
        }

        override fun hashCode(): Int {
            var result = packageName.hashCode()
            result = 31 * result + (className?.hashCode() ?: 0)
            result = 31 * result + label.hashCode()
            return result
        }
    }
    // === APP INFO DATA CLASS - END ===

    /* * FUNCTION: onCreate
     * SUMMARY: Detects the display ID where the app icon was clicked and
     * passes it to the service to ensure the bubble follows the user.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Redirect to PermissionActivity if essential permissions are missing
        if (!hasAllPermissions()) {
            val intent = Intent(this, PermissionActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
            return
        }

        // Determine which display this activity is running on
        val displayId = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            this.display?.displayId ?: 0
        } else {
            @Suppress("DEPRECATION")
            windowManager.defaultDisplay.displayId
        }

        Log.d("DroidOS_Main", "Launched on Display $displayId")

        // Start service and pass the current display ID to recall the bubble
        val serviceIntent = Intent(this, FloatingLauncherService::class.java)
        serviceIntent.putExtra("DISPLAY_ID", displayId)
        startService(serviceIntent)

        // Finish immediately so the launcher remains a service-only overlay
        finish()
    }

    private fun hasAllPermissions(): Boolean {
        // 1. Overlay
        if (!Settings.canDrawOverlays(this)) return false

        // 2. Shizuku
        val shizukuGranted = try {
            Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED
        } catch (e: Exception) {
            false
        }
        if (!shizukuGranted) return false

        // 3. Accessibility
        if (!isAccessibilityServiceEnabled(this, FloatingLauncherService::class.java)) return false

        // 4. Notifications removed (Not strictly required for service to run)

        return true
    }

    private fun isAccessibilityServiceEnabled(context: Context, service: Class<*>): Boolean {
        val am = context.getSystemService(Context.ACCESSIBILITY_SERVICE) as AccessibilityManager
        val enabledServices = am.getEnabledAccessibilityServiceList(AccessibilityServiceInfo.FEEDBACK_ALL_MASK)
        for (enabledService in enabledServices) {
            val serviceInfo = enabledService.resolveInfo.serviceInfo
            if (serviceInfo.packageName == context.packageName && serviceInfo.name == service.name) {
                return true
            }
        }
        return false
    }
}
```

## File: app/src/main/java/com/example/quadrantlauncher/MenuActivity.kt
```kotlin
package com.example.quadrantlauncher

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import rikka.shizuku.Shizuku

class MenuActivity : Activity(), Shizuku.OnRequestPermissionResultListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // --- NEW: PERMISSION CHECK LANDING PAGE LOGIC ---
        if (!hasRequiredPermissions()) {
            val intent = Intent(this, PermissionActivity::class.java)
            startActivity(intent)
            finish() // Close MenuActivity so user can't go back without perms
            return
        }
        // ------------------------------------------------

        // 1. Shizuku Permission Check (Existing logic can remain or be removed as double-check)
        checkShizukuPermission() 

        // 2. Main Layout Container (Dark Theme)
        val mainLayout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            layoutParams = LinearLayout.LayoutParams(MATCH_PARENT, MATCH_PARENT)
            setPadding(40, 60, 40, 40)
            setBackgroundColor(Color.parseColor("#1E1E1E")) // Dark Background
            gravity = Gravity.TOP
        }

        // --- TITLE HEADER ---
        val headerText = TextView(this).apply {
            text = "CoverScreen Launcher"
            textSize = 22f
            setTextColor(Color.LTGRAY)
            gravity = Gravity.CENTER_HORIZONTAL
            layoutParams = LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT).apply {
                bottomMargin = 50
            }
        }
        mainLayout.addView(headerText)

        // --- PROFILE ROW (Horizontal: Text + Save Icon) ---
        val profileRow = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            layoutParams = LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT).apply {
                bottomMargin = 60
            }
            gravity = Gravity.CENTER_VERTICAL
            // Add a subtle background to the row to make it distinct
            setBackgroundColor(Color.parseColor("#2D2D2D"))
            setPadding(20, 20, 20, 20)
        }

        // Profile Text (Left side)
        val profileText = TextView(this).apply {
            text = "Current: Default" 
            textSize = 18f
            setTextColor(Color.WHITE)
            // Weight 1 pushes the icon to the far right. 
            // Change to 0 and WRAP_CONTENT if you want icon immediately next to text.
            layoutParams = LinearLayout.LayoutParams(0, WRAP_CONTENT, 1f) 
        }

        // Save Icon (Right side)
        val saveBtn = ImageButton(this).apply {
            setImageResource(android.R.drawable.ic_menu_save)
            setBackgroundColor(Color.TRANSPARENT) // Transparent bg
            setColorFilter(Color.CYAN) // Cyan tint to make it pop
            setPadding(20, 0, 0, 0)
            setOnClickListener {
                Toast.makeText(this@MenuActivity, "Profile Saved (Placeholder)", Toast.LENGTH_SHORT).show()
                // TODO: Connect to AppPreferences.saveProfile logic
            }
        }

        profileRow.addView(profileText)
        profileRow.addView(saveBtn)
        mainLayout.addView(profileRow)

        // --- LAUNCHER BUTTONS ---
        
        // Button 1: 4-Quadrant
        val btnQuad = Button(this).apply {
            text = "Launch 4-Quadrant"
            setTextColor(Color.WHITE)
            setBackgroundColor(Color.parseColor("#444444"))
            layoutParams = LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT).apply {
                bottomMargin = 30
            }
            setOnClickListener {
                launchActivity(QuadrantActivity::class.java)
            }
        }

        // Button 2: Split-Screen
        val btnSplit = Button(this).apply {
            text = "Launch Split-Screen"
            setTextColor(Color.WHITE)
            setBackgroundColor(Color.parseColor("#444444"))
            layoutParams = LinearLayout.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
            setOnClickListener {
                launchActivity(TriSplitActivity::class.java)
            }
        }

        mainLayout.addView(btnQuad)
        mainLayout.addView(btnSplit)

        setContentView(mainLayout)
    }

    // Helper function to check all required permissions
    private fun hasRequiredPermissions(): Boolean {
        val hasOverlay = android.provider.Settings.canDrawOverlays(this)
        val hasShizuku = try { 
            rikka.shizuku.Shizuku.checkSelfPermission() == android.content.pm.PackageManager.PERMISSION_GRANTED 
        } catch(e: Exception) { false }
        
        val hasNotif = if (android.os.Build.VERSION.SDK_INT >= 33) {
            checkSelfPermission(android.Manifest.permission.POST_NOTIFICATIONS) == android.content.pm.PackageManager.PERMISSION_GRANTED
        } else true

        return hasOverlay && hasShizuku && hasNotif
    }

    private fun checkShizukuPermission() {
        if (Shizuku.isPreV11() || Shizuku.getVersion() < 11) {
            // Shizuku not running
        } else if (Shizuku.checkSelfPermission() != android.content.pm.PackageManager.PERMISSION_GRANTED) {
            Shizuku.requestPermission(0)
            Shizuku.addRequestPermissionResultListener(this)
        }
    }

    private fun launchActivity(cls: Class<*>) {
        try {
            val intent = Intent(this, cls)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(this, "Error: ${e.message}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onRequestPermissionResult(requestCode: Int, grantResult: Int) {
        if (grantResult == android.content.pm.PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(this, "Shizuku Granted", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Shizuku.removeRequestPermissionResultListener(this)
    }
}
```

## File: app/src/main/java/com/example/quadrantlauncher/PermissionActivity.kt
```kotlin
package com.example.quadrantlauncher

import android.accessibilityservice.AccessibilityServiceInfo
import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.view.accessibility.AccessibilityManager
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import rikka.shizuku.Shizuku

class PermissionActivity : Activity(), Shizuku.OnRequestPermissionResultListener {

    private lateinit var btnGrantOverlay: LinearLayout
    private lateinit var btnGrantShizuku: LinearLayout
    private lateinit var btnGrantAccessibility: LinearLayout
    
    private lateinit var iconOverlay: ImageView
    private lateinit var iconShizuku: ImageView
    private lateinit var iconAccessibility: ImageView
    
    private lateinit var btnContinue: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permissions)

        // Bind Views
        btnGrantOverlay = findViewById(R.id.btn_perm_overlay)
        btnGrantShizuku = findViewById(R.id.btn_perm_shizuku)
        btnGrantAccessibility = findViewById(R.id.btn_perm_accessibility)
        
        iconOverlay = findViewById(R.id.icon_status_overlay)
        iconShizuku = findViewById(R.id.icon_status_shizuku)
        iconAccessibility = findViewById(R.id.icon_status_accessibility)
        
        btnContinue = findViewById(R.id.btn_continue)

        // --- 1. OVERLAY PERMISSION ---
        btnGrantOverlay.setOnClickListener {
            val intent = Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:$packageName"))
            startActivityForResult(intent, 101)
        }

        // --- 2. SHIZUKU PERMISSION ---
        btnGrantShizuku.setOnClickListener {
            try {
                if (Shizuku.checkSelfPermission() != PackageManager.PERMISSION_GRANTED) {
                    Shizuku.requestPermission(0)
                } else {
                    Toast.makeText(this, "Shizuku already granted", Toast.LENGTH_SHORT).show()
                    refreshUI()
                }
            } catch (e: Exception) {
                Toast.makeText(this, "Shizuku not running. Please start Shizuku first.", Toast.LENGTH_LONG).show()
            }
        }

        // --- 3. ACCESSIBILITY PERMISSION (With Disclosure) ---
        btnGrantAccessibility.setOnClickListener {
            showAccessibilityDisclosure()
        }

        btnContinue.setOnClickListener {
            if (hasAllPermissions()) {
                startActivity(Intent(this, MenuActivity::class.java))
                finish()
            }
        }

        Shizuku.addRequestPermissionResultListener(this)
    }

    private fun showAccessibilityDisclosure() {
        AlertDialog.Builder(this, android.R.style.Theme_DeviceDefault_Dialog_Alert)
            .setTitle("Accessibility Service Required")
            .setMessage("This app uses the Accessibility Service API to display floating windows and perform global actions (like Home/Back) on top of other apps.\n\n" +
                        "No data is collected, stored, or shared. This permission is strictly used for the launcher functionality.")
            .setPositiveButton("Agree & Grant") { _, _ ->
                val intent = Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(intent)
                Toast.makeText(this, "Find 'Quadrant Launcher' and enable it", Toast.LENGTH_LONG).show()
            }
            .setNegativeButton("Not Now", null)
            .show()
    }

    override fun onResume() {
        super.onResume() 
        refreshUI()
    }

    override fun onDestroy() {
        super.onDestroy() 
        Shizuku.removeRequestPermissionResultListener(this)
    }

    override fun onRequestPermissionResult(requestCode: Int, grantResult: Int) {
        refreshUI()
    }

    private fun refreshUI() {
        val hasOverlay = Settings.canDrawOverlays(this)
        val hasShizuku = try { Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED } catch(e: Exception) { false }
        val hasAccessibility = isAccessibilityServiceEnabled(this, FloatingLauncherService::class.java)
        
        updateItem(btnGrantOverlay, iconOverlay, hasOverlay)
        updateItem(btnGrantShizuku, iconShizuku, hasShizuku)
        updateItem(btnGrantAccessibility, iconAccessibility, hasAccessibility)

        if (hasOverlay && hasShizuku && hasAccessibility) {
            btnContinue.isEnabled = true
            btnContinue.alpha = 1.0f
            btnContinue.text = "Start Launcher"
        } else {
            btnContinue.isEnabled = false
            btnContinue.alpha = 0.5f
            btnContinue.text = "Grant Permissions to Continue"
        }
    }

    private fun updateItem(container: LinearLayout, icon: ImageView, granted: Boolean) {
        if (granted) {
            icon.setImageResource(android.R.drawable.checkbox_on_background)
            icon.setColorFilter(Color.GREEN)
            container.isClickable = false
            container.alpha = 0.6f
        } else {
            icon.setImageResource(android.R.drawable.checkbox_off_background)
            icon.setColorFilter(Color.RED)
            container.isClickable = true
            container.alpha = 1.0f
        }
    }

    private fun hasAllPermissions(): Boolean {
        val hasOverlay = Settings.canDrawOverlays(this)
        val hasShizuku = try { Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED } catch(e: Exception) { false }
        val hasAccessibility = isAccessibilityServiceEnabled(this, FloatingLauncherService::class.java)
        return hasOverlay && hasShizuku && hasAccessibility
    }

    private fun isAccessibilityServiceEnabled(context: Context, service: Class<*>): Boolean {
        val am = context.getSystemService(Context.ACCESSIBILITY_SERVICE) as AccessibilityManager
        val enabledServices = am.getEnabledAccessibilityServiceList(AccessibilityServiceInfo.FEEDBACK_ALL_MASK)
        for (enabledService in enabledServices) {
            val serviceInfo = enabledService.resolveInfo.serviceInfo
            if (serviceInfo.packageName == context.packageName && serviceInfo.name == service.name) {
                return true
            }
        }
        return false
    }
}
```

## File: app/src/main/java/com/example/quadrantlauncher/QuadrantActivity.kt
```kotlin
package com.example.quadrantlauncher

import android.app.Activity
import android.app.ActivityOptions
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Rect
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import rikka.shizuku.Shizuku

class QuadrantActivity : AppCompatActivity() {

    companion object {
        const val Q1_KEY = "Q1_PACKAGE"
        const val Q2_KEY = "Q2_PACKAGE"
        const val Q3_KEY = "Q3_PACKAGE"
        const val Q4_KEY = "Q4_PACKAGE"
    }

    private var q1Package: String? = null
    private var q2Package: String? = null
    private var q3Package: String? = null
    private var q4Package: String? = null

    private lateinit var q1Button: Button
    private lateinit var q2Button: Button
    private lateinit var q3Button: Button
    private lateinit var q4Button: Button
    private lateinit var launchButton: Button

    private var currentQuadrant = -1
    private var hasShizukuPermission = false

    private val REQUEST_PERMISSION_RESULT_LISTENER =
        Shizuku.OnRequestPermissionResultListener { requestCode, grantResult ->
            if (requestCode == ShizukuHelper.SHIZUKU_PERMISSION_REQUEST_CODE) {
                hasShizukuPermission = grantResult == PackageManager.PERMISSION_GRANTED
                checkShizukuPermission() // Update status
            }
        }

    private val appSelectLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val packageName = result.data?.getStringExtra(MainActivity.SELECTED_APP_PACKAGE)
            if (packageName != null) {
                val simple = AppPreferences.getSimpleName(packageName)
                when (currentQuadrant) {
                    1 -> {
                        q1Package = packageName
                        q1Button.text = "Q1: $simple"
                        AppPreferences.savePackage(this, Q1_KEY, packageName)
                    }
                    2 -> {
                        q2Package = packageName
                        q2Button.text = "Q2: $simple"
                        AppPreferences.savePackage(this, Q2_KEY, packageName)
                    }
                    3 -> {
                        q3Package = packageName
                        q3Button.text = "Q3: $simple"
                        AppPreferences.savePackage(this, Q3_KEY, packageName)
                    }
                    4 -> {
                        q4Package = packageName
                        q4Button.text = "Q4: $simple"
                        AppPreferences.savePackage(this, Q4_KEY, packageName)
                    }
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Shizuku.addRequestPermissionResultListener(REQUEST_PERMISSION_RESULT_LISTENER)
        setContentView(R.layout.activity_quadrant)

        q1Button = findViewById(R.id.q1_button)
        q2Button = findViewById(R.id.q2_button)
        q3Button = findViewById(R.id.q3_button)
        q4Button = findViewById(R.id.q4_button)
        launchButton = findViewById(R.id.launch_button)

        loadSavedApps()

        q1Button.setOnClickListener { currentQuadrant = 1; launchAppPicker() }
        q2Button.setOnClickListener { currentQuadrant = 2; launchAppPicker() }
        q3Button.setOnClickListener { currentQuadrant = 3; launchAppPicker() }
        q4Button.setOnClickListener { currentQuadrant = 4; launchAppPicker() }

        launchButton.setOnClickListener {
            if (q1Package != null && q2Package != null &&
                q3Package != null && q4Package != null) {
                launchQuadrantApps()
            } else {
                Toast.makeText(this, "Select all 4 apps.", Toast.LENGTH_SHORT).show()
            }
        }
        checkShizukuPermission()
    }

    private fun loadSavedApps() {
        q1Package = AppPreferences.loadPackage(this, Q1_KEY)
        q1Button.text = "Q1: ${AppPreferences.getSimpleName(q1Package)}"
        q2Package = AppPreferences.loadPackage(this, Q2_KEY)
        q2Button.text = "Q2: ${AppPreferences.getSimpleName(q2Package)}"
        q3Package = AppPreferences.loadPackage(this, Q3_KEY)
        q3Button.text = "Q3: ${AppPreferences.getSimpleName(q3Package)}"
        q4Package = AppPreferences.loadPackage(this, Q4_KEY)
        q4Button.text = "Q4: ${AppPreferences.getSimpleName(q4Package)}"
    }

    override fun onDestroy() {
        super.onDestroy()
        Shizuku.removeRequestPermissionResultListener(REQUEST_PERMISSION_RESULT_LISTENER)
    }

    private fun checkShizukuPermission() {
        if (ShizukuHelper.isShizukuAvailable()) {
            if (ShizukuHelper.hasPermission()) {
                hasShizukuPermission = true
            } else {
                ShizukuHelper.requestPermission()
            }
        }
    }

    private fun launchAppPicker() {
        appSelectLauncher.launch(Intent(this, MainActivity::class.java))
    }

    private fun launchQuadrantApps() {
        val metrics = windowManager.maximumWindowMetrics
        val w = metrics.bounds.width()
        val h = metrics.bounds.height()

        val q1 = Rect(0, 0, w / 2, h / 2)
        val q2 = Rect(w / 2, 0, w, h / 2)
        val q3 = Rect(0, h / 2, w / 2, h)
        val q4 = Rect(w / 2, h / 2, w, h)

        // Kill all first (Synchronously wait for shell command)
        if (hasShizukuPermission) {
            // Launch in background thread to avoid freezing UI if kill takes time
            Thread {
                ShizukuHelper.killApp(q1Package!!)
                ShizukuHelper.killApp(q2Package!!)
                ShizukuHelper.killApp(q3Package!!)
                ShizukuHelper.killApp(q4Package!!)
                
                // IMPORTANT: Wait for OS to clean up windows
                try { Thread.sleep(400) } catch (e: InterruptedException) {}

                // Back to UI thread to launch
                runOnUiThread {
                    launchAppIntent(q1Package!!, q1)
                    launchAppIntent(q2Package!!, q2)
                    launchAppIntent(q3Package!!, q3)
                    launchAppIntent(q4Package!!, q4)
                }
            }.start()
        } else {
            // Fallback (wont work well for moving windows)
            launchAppIntent(q1Package!!, q1)
            launchAppIntent(q2Package!!, q2)
            launchAppIntent(q3Package!!, q3)
            launchAppIntent(q4Package!!, q4)
        }
    }

    private fun launchAppIntent(packageName: String, bounds: Rect) {
        try {
            val intent = packageManager.getLaunchIntentForPackage(packageName)
            if (intent == null) return

            // CLEAR_TOP helps reset the task state
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
            
            val options = ActivityOptions.makeBasic().setLaunchBounds(bounds)
            startActivity(intent, options.toBundle())
        } catch (e: Exception) {
            Log.e("Quadrant", "Launch failed for $packageName", e)
        }
    }
}
```

## File: app/src/main/java/com/example/quadrantlauncher/ShellUserService.kt
```kotlin
package com.example.quadrantlauncher

import android.content.ContentResolver
import android.content.Context
import android.content.ContextWrapper
import android.os.Binder
import android.os.IBinder
import android.provider.Settings
import android.util.Log
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.ArrayList
import java.util.regex.Pattern
import android.os.Build

class ShellUserService : IShellService.Stub() {

    private val TAG = "ShellUserService"

    companion object {
        const val POWER_MODE_OFF = 0
        const val POWER_MODE_NORMAL = 2

        @Volatile private var displayControlClass: Class<*>? = null
        @Volatile private var displayControlClassLoaded = false
    }

    // === GEMINI TASK CACHE - START ===
    // Cache for Gemini task ID since it trampolines and becomes invisible
    // The BardEntryPointActivity creates a task, then immediately redirects to Google QSB
    // After trampoline, the original task disappears from am stack list
    // We cache the exact task ID when found and reuse it for subsequent repositions
    private var cachedGeminiTaskId: Int = -1
    private var cachedGeminiTaskTime: Long = 0
    private val GEMINI_CACHE_VALIDITY_MS = 30000L  // Cache valid for 30 seconds
    // === GEMINI TASK CACHE - END ===

    private val surfaceControlClass: Class<*> by lazy {
        Class.forName("android.view.SurfaceControl")
    }

    private fun getDisplayControlClass(): Class<*>? {
        if (displayControlClassLoaded && displayControlClass != null) return displayControlClass
        
        return try {
            val classLoaderFactoryClass = Class.forName("com.android.internal.os.ClassLoaderFactory")
            val createClassLoaderMethod = classLoaderFactoryClass.getDeclaredMethod(
                "createClassLoader",
                String::class.java,
                String::class.java,
                String::class.java,
                ClassLoader::class.java,
                Int::class.javaPrimitiveType,
                Boolean::class.javaPrimitiveType,
                String::class.java
            )
            val classLoader = createClassLoaderMethod.invoke(
                null, "/system/framework/services.jar", null, null,
                ClassLoader.getSystemClassLoader(), 0, true, null
            ) as ClassLoader

            val loadedClass = classLoader.loadClass("com.android.server.display.DisplayControl").also {
                val loadMethod = Runtime::class.java.getDeclaredMethod(
                    "loadLibrary0",
                    Class::class.java,
                    String::class.java
                )
                loadMethod.isAccessible = true
                loadMethod.invoke(Runtime.getRuntime(), it, "android_servers")
            }
            
            displayControlClass = loadedClass
            displayControlClassLoaded = true
            loadedClass
        } catch (e: Exception) {
            Log.w(TAG, "DisplayControl not available", e)
            null
        }
    }

    private fun getAllPhysicalDisplayTokens(): List<IBinder> {
        val tokens = ArrayList<IBinder>()
        try {
            val physicalIds: LongArray = if (Build.VERSION.SDK_INT >= 34) {
                val controlClass = getDisplayControlClass()
                if (controlClass != null) {
                    controlClass.getMethod("getPhysicalDisplayIds").invoke(null) as LongArray
                } else {
                     try {
                        surfaceControlClass.getMethod("getPhysicalDisplayIds").invoke(null) as LongArray
                     } catch (e: Exception) { LongArray(0) }
                }
            } else {
                surfaceControlClass.getMethod("getPhysicalDisplayIds").invoke(null) as LongArray
            }

            if (physicalIds.isEmpty()) {
                getSurfaceControlInternalToken()?.let { tokens.add(it) }
                return tokens
            }

            for (id in physicalIds) {
                try {
                    val token: IBinder? = if (Build.VERSION.SDK_INT >= 34) {
                        val controlClass = getDisplayControlClass()
                        if (controlClass != null) {
                             controlClass.getMethod("getPhysicalDisplayToken", Long::class.javaPrimitiveType)
                                .invoke(null, id) as? IBinder
                        } else {
                            surfaceControlClass.getMethod("getPhysicalDisplayToken", Long::class.javaPrimitiveType)
                                .invoke(null, id) as? IBinder
                        }
                    } else {
                        surfaceControlClass.getMethod("getPhysicalDisplayToken", Long::class.javaPrimitiveType)
                            .invoke(null, id) as? IBinder
                    }
                    
                    if (token != null) tokens.add(token)
                } catch (e: Exception) {
                    Log.w(TAG, "Failed to get token for physical ID $id", e)
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "Critical failure getting display tokens", e)
        }
        return tokens
    }

    private fun getSurfaceControlInternalToken(): IBinder? {
        return try {
            if (Build.VERSION.SDK_INT < 29) {
                surfaceControlClass.getMethod("getBuiltInDisplay", Int::class.java).invoke(null, 0) as IBinder
            } else {
                surfaceControlClass.getMethod("getInternalDisplayToken").invoke(null) as IBinder
            }
        } catch (e: Exception) { null }
    }

    private fun setPowerModeOnToken(token: IBinder, mode: Int) {
        try {
            val method = surfaceControlClass.getMethod(
                "setDisplayPowerMode",
                IBinder::class.java,
                Int::class.javaPrimitiveType
            )
            method.invoke(null, token, mode)
        } catch (e: Exception) {
            Log.e(TAG, "setDisplayPowerMode failed for token $token", e)
        }
    }

    private fun setDisplayBrightnessOnToken(token: IBinder, brightness: Float): Boolean {
        try {
            val method = surfaceControlClass.getMethod(
                "setDisplayBrightness",
                IBinder::class.java,
                Float::class.javaPrimitiveType
            )
            method.invoke(null, token, brightness)
            return true
        } catch (e: Exception) {
             try {
                val method = surfaceControlClass.getMethod(
                    "setDisplayBrightness",
                    IBinder::class.java,
                    Float::class.javaPrimitiveType,
                    Float::class.javaPrimitiveType,
                    Float::class.javaPrimitiveType,
                    Float::class.javaPrimitiveType
                )
                method.invoke(null, token, brightness, brightness, brightness, brightness)
                return true
            } catch (e2: Exception) {
                return false
            }
        }
    }

    private fun setDisplayBrightnessInternal(displayId: Int, brightness: Float): Boolean {
        // Legacy shim for single-target calls
        val tokens = getAllPhysicalDisplayTokens()
        if (tokens.isNotEmpty()) return setDisplayBrightnessOnToken(tokens[0], brightness)
        return false
    }

    private val shLock = Object()
    private var _shProcess: Process? = null
    private val shProcess: Process
        get() = synchronized(shLock) {
            if (_shProcess?.isAlive == true) _shProcess!!
            else Runtime.getRuntime().exec(arrayOf("sh")).also { _shProcess = it }
        }

    private fun execShellCommand(command: String) {
        synchronized(shLock) {
            try {
                val output = shProcess.outputStream
                output.write("$command\n".toByteArray())
                output.flush()
            } catch (e: Exception) {
                Log.e(TAG, "Shell command failed", e)
            }
        }
    }

    // ============================================================
    // AIDL Interface Implementations
    // ============================================================

    
override fun setBrightness(displayId: Int, brightness: Int) {
        Log.d(TAG, "setBrightness(Global Broadcast, Value: $brightness)")
        val token = Binder.clearCallingIdentity()
        try {
            if (brightness < 0) {
                // === SCREEN OFF ===
                execShellCommand("settings put system screen_brightness_mode 0")
                
                // Get ALL tokens, but ONLY apply to the first 2 (Main + Cover)
                // This prevents killing the Glasses (which would be index 2+)
                val tokens = getAllPhysicalDisplayTokens()
                val safeTokens = tokens.take(2)
                
                for (t in safeTokens) {
                    setDisplayBrightnessOnToken(t, -1.0f)
                }
                
                execShellCommand("settings put system screen_brightness_float -1.0")
                execShellCommand("settings put system screen_brightness -1")
            } else {
                // === SCREEN ON ===
                val floatVal = brightness.toFloat() / 255.0f
                
                // Restore ALL tokens (safety, in case user replugged glasses)
                val tokens = getAllPhysicalDisplayTokens()
                for (t in tokens) {
                    setDisplayBrightnessOnToken(t, floatVal)
                }
                
                execShellCommand("settings put system screen_brightness_float $floatVal")
                execShellCommand("settings put system screen_brightness $brightness")
            }
        } catch (e: Exception) {
            Log.e(TAG, "setBrightness failed", e)
        } finally {
             Binder.restoreCallingIdentity(token)
        }
    }

    override fun setScreenOff(displayIndex: Int, turnOff: Boolean) {
        Log.d(TAG, "setScreenOff(Global Broadcast, TurnOff: $turnOff)")
        val token = Binder.clearCallingIdentity()
        try {
            val mode = if (turnOff) POWER_MODE_OFF else POWER_MODE_NORMAL
            
            // Same safety limit: Only affect first 2 physical screens
            val tokens = getAllPhysicalDisplayTokens()
            val safeTokens = tokens.take(2)
            
            for (t in safeTokens) {
                setPowerModeOnToken(t, mode)
            }
        } catch (e: Exception) {
            Log.e(TAG, "setScreenOff failed", e)
        } finally {
            Binder.restoreCallingIdentity(token)
        }
    }
    // --- V1.0 LOGIC: Window Management (Retained for Tiling/Minimizing) ---
    
    override fun forceStop(packageName: String) {
        val token = Binder.clearCallingIdentity()
        try { 
            val realPkg = if (packageName.endsWith(":gemini")) packageName.substringBefore(":") else packageName
            Runtime.getRuntime().exec("am force-stop $realPkg").waitFor() 
        } catch (e: Exception) {} finally { Binder.restoreCallingIdentity(token) }
    }

    override fun runCommand(command: String) {
        val token = Binder.clearCallingIdentity()
        try { Runtime.getRuntime().exec(command).waitFor() } catch (e: Exception) {} finally { Binder.restoreCallingIdentity(token) }
    }



    // === REPOSITION TASK - START ===
    // Repositions a task window to specified bounds using am task commands
    override fun repositionTask(packageName: String, className: String?, left: Int, top: Int, right: Int, bottom: Int) {
        Log.d(TAG, "repositionTask: pkg=$packageName cls=$className bounds=[$left,$top,$right,$bottom]")

        val tid = getTaskId(packageName, className)
        Log.d(TAG, "repositionTask: getTaskId returned $tid")

        if (tid == -1) {
            Log.w(TAG, "repositionTask: No task found for $packageName / $className")
            return
        }

        val token = Binder.clearCallingIdentity()
        try {
            // Set freeform windowing mode (mode 5)
            val modeCmd = "am task set-windowing-mode $tid 5"
            Log.d(TAG, "repositionTask: $modeCmd")
            val modeProc = Runtime.getRuntime().exec(arrayOf("sh", "-c", modeCmd))
            modeProc.waitFor()
            Thread.sleep(100)

            // Apply resize
            val resizeCmd = "am task resize $tid $left $top $right $bottom"
            Log.d(TAG, "repositionTask: $resizeCmd")
            val resizeProc = Runtime.getRuntime().exec(arrayOf("sh", "-c", resizeCmd))
            val exitCode = resizeProc.waitFor()

            Log.d(TAG, "repositionTask: resize exitCode=$exitCode for task $tid")

        } catch (e: Exception) {
            Log.e(TAG, "repositionTask: FAILED", e)
        } finally {
            Binder.restoreCallingIdentity(token)
        }
    }
    // === REPOSITION TASK - END ===



    // === GET VISIBLE PACKAGES - START ===
    // Returns list of packages that are actually visible on the specified display
    // Checks both mViewVisibility AND window frame bounds
    // Windows moved off-screen (left >= 10000) are considered not visible
    override fun getVisiblePackages(displayId: Int): List<String> {
        val list = ArrayList<String>()
        val token = Binder.clearCallingIdentity()
        try {
            Log.d(TAG, "getVisiblePackages: Checking display $displayId")
            val p = Runtime.getRuntime().exec("dumpsys window windows")
            val r = BufferedReader(InputStreamReader(p.inputStream))
            var line: String?
            var currentPkg: String? = null
            var isVisible = false
            var onCorrectDisplay = false
            var isOffScreen = false
            val windowPattern = Pattern.compile("Window\\{[0-9a-f]+ u\\d+ ([^\\}/ ]+)")
            // Pattern to match frame bounds like "frame=[50000,50000][50100,50100]" or "mFrame=[0,0][960,1080]"
            val framePattern = Pattern.compile("(?:frame|mFrame)=\\[(\\d+),(\\d+)\\]\\[(\\d+),(\\d+)\\]")

            while (r.readLine().also { line = it } != null) {
                val l = line!!.trim()

                // New window entry - reset state
                if (l.startsWith("Window #")) {
                    currentPkg = null
                    isVisible = false
                    onCorrectDisplay = false
                    isOffScreen = false
                    val matcher = windowPattern.matcher(l)
                    if (matcher.find()) currentPkg = matcher.group(1)
                }

                // Check display
                if (l.contains("displayId=$displayId") || l.contains("mDisplayId=$displayId")) {
                    onCorrectDisplay = true
                }

                // Check visibility flag
                if (l.contains("mViewVisibility=0x0")) {
                    isVisible = true
                }

                // Check frame bounds - if left >= 10000, window is off-screen (minimized)
                val frameMatcher = framePattern.matcher(l)
                if (frameMatcher.find()) {
                    try {
                        val left = frameMatcher.group(1)?.toIntOrNull() ?: 0
                        if (left >= 10000) {
                            isOffScreen = true
                            Log.d(TAG, "getVisiblePackages: $currentPkg is off-screen (left=$left)")
                        }
                    } catch (e: Exception) {}
                }

                // Add to list if truly visible (on correct display, view visible, NOT off-screen)
                if (currentPkg != null && isVisible && onCorrectDisplay && !isOffScreen) {
                    if (isUserApp(currentPkg!!) && !list.contains(currentPkg!!)) {
                        list.add(currentPkg!!)
                        Log.d(TAG, "getVisiblePackages: Found visible (window): $currentPkg")
                    }
                    currentPkg = null
                }
            }
            r.close()
            p.waitFor()
        } catch (e: Exception) {
            Log.e(TAG, "getVisiblePackages: Error", e)
        } finally {
            Binder.restoreCallingIdentity(token)
        }
        Log.d(TAG, "getVisiblePackages: display=$displayId result=${list.joinToString()}")
        return list
    }
    // === GET VISIBLE PACKAGES - END ===

    override fun getAllRunningPackages(): List<String> {
        val list = ArrayList<String>()
        val token = Binder.clearCallingIdentity()
        try {
            val p = Runtime.getRuntime().exec("dumpsys activity activities")
            val r = BufferedReader(InputStreamReader(p.inputStream))
            var line: String?
            val recordPattern = Pattern.compile("ActivityRecord\\{[0-9a-f]+ u\\d+ ([a-zA-Z0-9_.]+)/")
            while (r.readLine().also { line = it } != null) {
                if (line!!.contains("ActivityRecord{")) {
                    val m = recordPattern.matcher(line!!)
                    if (m.find()) { val pkg = m.group(1); if (pkg != null && !list.contains(pkg) && isUserApp(pkg)) list.add(pkg) }
                }
            }
        } catch (e: Exception) {} finally { Binder.restoreCallingIdentity(token) }
        return list
    }

override fun getWindowLayouts(displayId: Int): List<String> {
    val results = ArrayList<String>()
    val token = Binder.clearCallingIdentity()
    try {
        val p = Runtime.getRuntime().exec("dumpsys activity activities")
        val r = BufferedReader(InputStreamReader(p.inputStream))
        var line: String?
        
        var currentDisplayId = -1
        var currentTaskBounds: String? = null
        var foundPackages = mutableSetOf<String>()
        
        val displayPattern = Pattern.compile("Display #(\\d+)")
        val boundsPattern = Pattern.compile("bounds=\\[(\\d+),(\\d+)\\]\\[(\\d+),(\\d+)\\]")
        val rectPattern = Pattern.compile("mBounds=Rect\\((\\d+), (\\d+) - (\\d+), (\\d+)\\)")
        val activityPattern = Pattern.compile("ActivityRecord\\{[0-9a-f]+ u\\d+ ([a-zA-Z0-9_.]+)/")

        while (r.readLine().also { line = it } != null) {
            val l = line!!
            
            val displayMatcher = displayPattern.matcher(l)
            if (displayMatcher.find()) {
                currentDisplayId = displayMatcher.group(1)?.toIntOrNull() ?: -1
            }
            
            if (currentDisplayId != displayId) continue
            
            val boundsMatcher = boundsPattern.matcher(l)
            if (boundsMatcher.find()) {
                val left = boundsMatcher.group(1)
                val top = boundsMatcher.group(2)
                val right = boundsMatcher.group(3)
                val bottom = boundsMatcher.group(4)
                currentTaskBounds = "$left,$top,$right,$bottom"
            }
            
            val rectMatcher = rectPattern.matcher(l)
            if (rectMatcher.find()) {
                val left = rectMatcher.group(1)
                val top = rectMatcher.group(2)
                val right = rectMatcher.group(3)
                val bottom = rectMatcher.group(4)
                currentTaskBounds = "$left,$top,$right,$bottom"
            }
            
            if (l.contains("ActivityRecord{") && currentTaskBounds != null) {
                val activityMatcher = activityPattern.matcher(l)
                if (activityMatcher.find()) {
                    val pkg = activityMatcher.group(1)
                    if (pkg != null && isUserApp(pkg) && !foundPackages.contains(pkg)) {
                        results.add("$pkg|$currentTaskBounds")
                        foundPackages.add(pkg)
                    }
                }
            }
        }
        
        r.close()
        p.waitFor()
    } catch (e: Exception) {
        Log.e(TAG, "getWindowLayouts failed", e)
    } finally {
        Binder.restoreCallingIdentity(token)
    }
    return results
}


    // === GET TASK ID - START ===
    // Uses 'am stack list' to find task ID
    // PRIORITY: Full component match (pkg/cls) > package match > short activity match
    // Handles trampolining apps like Gemini which redirect to different packages
    // For Gemini: caches the exact task ID when found since it becomes invisible after trampoline

    // === GEMINI TASK CACHE - START ===
    // Cache for Gemini task ID since it trampolines and becomes invisible
    // The BardEntryPointActivity creates a task, then immediately redirects to Google QSB
    // After trampoline, the original task disappears from am stack list
    // We cache the exact task ID when found and reuse it for subsequent repositions
    // === GEMINI TASK CACHE - END ===

    // === GET TASK ID - START ===
    // Uses 'am stack list' to find task ID
    // PRIORITY: Full component match (pkg/cls) > package match > short activity match
    // Handles trampolining apps like Gemini which redirect to different packages
    // For Gemini: caches the exact task ID when found since it becomes invisible after trampoline

    override fun getTaskId(packageName: String, className: String?): Int {
        var exactTaskId = -1      // Best: full component match
        var packageTaskId = -1    // Good: package name match
        var fallbackTaskId = -1   // Last resort: short activity name match
        
        val token = Binder.clearCallingIdentity()
        try {
            Log.d(TAG, "getTaskId: Looking for pkg=$packageName cls=$className")
            
            // === GEMINI DETECTION ===
            val isGemini = packageName == "com.google.android.apps.bard" || 
                          (className?.contains("Bard") == true) ||
                          (className?.contains("bard") == true)
            
            // === GEMINI CACHE CHECK - START ===
            // For Gemini, we use a very short cache validity because the original task
            // gets destroyed quickly. After ~500ms, we should always search fresh
            // to find the trampoline target instead of the dead original task.
            if (isGemini && cachedGeminiTaskId > 0) {
                val cacheAge = System.currentTimeMillis() - cachedGeminiTaskTime
                // Use very short validity - 500ms max, not 30 seconds
                // After trampoline completes, the cached ID is useless
                val shortValidity = 500L
                if (cacheAge < shortValidity) {
                    Log.d(TAG, "getTaskId: Gemini using CACHED taskId=$cachedGeminiTaskId (age=${cacheAge}ms)")
                    return cachedGeminiTaskId
                } else {
                    Log.d(TAG, "getTaskId: Gemini cache too old (age=${cacheAge}ms > ${shortValidity}ms), searching fresh")
                    cachedGeminiTaskId = -1
                }
            }
            // === GEMINI CACHE CHECK - END ===
            
            if (isGemini) {
                Log.d(TAG, "getTaskId: Gemini detected, will check trampoline targets")
            }
            
            val cmd = arrayOf("sh", "-c", "am stack list")
            val p = Runtime.getRuntime().exec(cmd)
            val r = BufferedReader(InputStreamReader(p.inputStream))
            var line: String?
            
            // Build component string for exact matching
            val fullComponent = if (!className.isNullOrEmpty() && className != "null" && className != "default") {
                "$packageName/$className"
            } else {
                null
            }
            
            // Short activity name (fallback only)
            val shortActivity = className?.substringAfterLast(".")
            
            Log.d(TAG, "getTaskId: fullComponent=$fullComponent shortActivity=$shortActivity")
            
            while (r.readLine().also { line = it } != null) {
                val l = line!!.trim()
                
                if (!l.contains("taskId=") || !l.contains(":")) continue
                
                // Extract task ID from line
                val match = Regex("taskId=(\\d+):").find(l)
                if (match == null) continue
                
                val foundId = match.groupValues[1].toIntOrNull() ?: continue
                if (foundId <= 0) continue
                
                // PRIORITY 1: Exact full component match (highest priority)
                if (fullComponent != null && l.contains(fullComponent)) {
                    Log.d(TAG, "getTaskId: EXACT MATCH taskId=$foundId component=$fullComponent")
                    exactTaskId = foundId
                    // Keep searching - want most recent exact match
                }
                // PRIORITY 2: Package name match
                else if (l.contains("$packageName/")) {
                    Log.d(TAG, "getTaskId: PACKAGE MATCH taskId=$foundId pkg=$packageName")
                    packageTaskId = foundId
                }
                // PRIORITY 3: Gemini trampoline - check for Google Quick Search Box with Assistant activity
                // The actual Gemini UI runs in Google QSB with an assistant/robin activity
                // Avoid matching Android Auto ghost activities
                else if (isGemini && l.contains("com.google.android.googlequicksearchbox")) {
                    // Check if this is the actual assistant activity (not Auto ghost)
                    val isAssistantActivity = l.contains("assistant") || l.contains("robin") || l.contains("MainActivity")
                    val isAutoGhost = l.contains("auto") || l.contains("ghost")
                    
                    if (isAssistantActivity && !isAutoGhost) {
                        if (foundId > packageTaskId) {
                            Log.d(TAG, "getTaskId: GEMINI TRAMPOLINE MATCH taskId=$foundId (assistant activity)")
                            packageTaskId = foundId
                        }
                    } else {
                        Log.d(TAG, "getTaskId: GEMINI TRAMPOLINE SKIP taskId=$foundId (not assistant activity)")
                    }
                }

                // PRIORITY 4: Short activity name (ONLY if no better match exists)
                // Skip generic names that cause false positives
                else if (shortActivity != null && 
                         shortActivity != "MainActivity" &&  // Too generic
                         shortActivity != "default" &&       // Too generic
                         l.contains(shortActivity)) {
                    Log.d(TAG, "getTaskId: FALLBACK MATCH taskId=$foundId activity=$shortActivity")
                    fallbackTaskId = foundId
                }
            }
            r.close()
            p.waitFor()
            
            // Return best match in priority order
            val result = when {
                exactTaskId > 0 -> exactTaskId
                packageTaskId > 0 -> packageTaskId
                fallbackTaskId > 0 -> fallbackTaskId
                else -> -1
            }
            
            // === GEMINI TASK HANDLING - START ===
            // Gemini (com.google.android.apps.bard) is a trampolining app:
            // - BardEntryPointActivity creates a task, then DESTROYS it within ~40ms
            // - User is redirected to Google Quick Search Box
            // - The original task ID is useless because the task no longer exists
            // 
            // Strategy: Don't cache the destroyed task. Instead:
            // - If we have an exact match AND the task has activities, cache it
            // - If task has trampolined (no exact match), use the trampoline target
            // - For repositioning, the trampoline target (Google QSB) is what's actually running
            
            if (isGemini) {
                if (exactTaskId > 0) {
                    // We found an exact match - but is the task still alive?
                    // Check if this task actually has activities (not destroyed)
                    // For now, we'll cache it but with a very short validity
                    cachedGeminiTaskId = exactTaskId
                    cachedGeminiTaskTime = System.currentTimeMillis()
                    Log.d(TAG, "getTaskId: Gemini exact match found, CACHED taskId=$exactTaskId (may be short-lived)")
                } else if (packageTaskId > 0) {
                    // No exact match means trampoline completed
                    // The packageTaskId is the Google QSB task that Gemini is running in
                    // This is actually what we should reposition!
                    Log.d(TAG, "getTaskId: Gemini trampolined, using trampoline target taskId=$packageTaskId")
                    
                    // DON'T use cached ID - it's destroyed. Use the live trampoline target.
                    // Clear any stale cache
                    if (cachedGeminiTaskId > 0) {
                        Log.d(TAG, "getTaskId: Clearing stale Gemini cache (old=$cachedGeminiTaskId)")
                        cachedGeminiTaskId = -1
                    }
                    
                    return packageTaskId
                }
            }
            // === GEMINI TASK HANDLING - END ===
            
            Log.d(TAG, "getTaskId: Final result=$result (exact=$exactTaskId pkg=$packageTaskId fallback=$fallbackTaskId)")
            return result
            
        } catch (e: Exception) {
            Log.e(TAG, "getTaskId: FAILED", e)
            return -1
        } finally { 
            Binder.restoreCallingIdentity(token) 
        }
    }
    // === GET TASK ID - END ===

    // === GET TASK ID - END ===

    // === GET TASK ID - END ===

    // === DEBUG DUMP TASKS - START ===
    // Dumps raw task info for debugging
    fun debugDumpTasks(): String {
        val token = Binder.clearCallingIdentity()
        val result = StringBuilder()
        try {
            val cmd = arrayOf("sh", "-c", "dumpsys activity activities | head -100")
            val p = Runtime.getRuntime().exec(cmd)
            val r = BufferedReader(InputStreamReader(p.inputStream))
            var line: String?
            while (r.readLine().also { line = it } != null) {
                result.appendLine(line)
            }
            r.close()
            p.waitFor()
        } catch (e: Exception) {
            result.appendLine("ERROR: ${e.message}")
        } finally {
            Binder.restoreCallingIdentity(token)
        }
        return result.toString()
    }
    // === DEBUG DUMP TASKS - END ===

    // === MOVE TASK TO BACK / MINIMIZE TASK - START ===
    // Minimizes a task using Samsung's IMultiTaskingBinder from ActivityTaskManager
    // This is what Android's freeform minimize button uses on Samsung devices
    override fun moveTaskToBack(taskId: Int) {
        val token = Binder.clearCallingIdentity()
        try {
            Log.d(TAG, "moveTaskToBack: Minimizing taskId=$taskId via ATM.getMultiTaskingBinder()")

            var success = false

            try {
                // Get ActivityTaskManager service
                val atmClass = Class.forName("android.app.ActivityTaskManager")
                val getServiceMethod = atmClass.getMethod("getService")
                val atm = getServiceMethod.invoke(null)

                Log.d(TAG, "moveTaskToBack: Got ATM service")

                // Call getMultiTaskingBinder()
                val getMultiTaskingBinder = atm.javaClass.getMethod("getMultiTaskingBinder")
                val multiTaskingBinder = getMultiTaskingBinder.invoke(atm)

                if (multiTaskingBinder != null) {
                    Log.d(TAG, "moveTaskToBack: Got MultiTaskingBinder: ${multiTaskingBinder.javaClass.name}")

                    // Call minimizeTaskById(taskId)
                    val minimizeMethod = multiTaskingBinder.javaClass.getMethod(
                        "minimizeTaskById",
                        Int::class.javaPrimitiveType
                    )
                    minimizeMethod.invoke(multiTaskingBinder, taskId)

                    Log.d(TAG, "moveTaskToBack: minimizeTaskById($taskId) SUCCEEDED!")
                    success = true
                } else {
                    Log.w(TAG, "moveTaskToBack: getMultiTaskingBinder() returned null")
                }

            } catch (e: Exception) {
                Log.e(TAG, "moveTaskToBack: Samsung MultiTaskingBinder failed", e)
                e.printStackTrace()
            }

            // FALLBACK: Off-screen positioning (only if Samsung API failed)
            if (!success) {
                Log.w(TAG, "moveTaskToBack: Using off-screen fallback")
                val modeCmd = "am task set-windowing-mode $taskId 5"
                Runtime.getRuntime().exec(arrayOf("sh", "-c", modeCmd)).waitFor()
                Thread.sleep(100)
                val resizeCmd = "am task resize $taskId 99999 99999 100000 100000"
                Runtime.getRuntime().exec(arrayOf("sh", "-c", resizeCmd)).waitFor()
            }

        } catch (e: Exception) {
            Log.e(TAG, "moveTaskToBack: FAILED", e)
        } finally {
            Binder.restoreCallingIdentity(token)
        }
    }
    // === MOVE TASK TO BACK / MINIMIZE TASK - END ===

    private fun isUserApp(pkg: String): Boolean {
        if (pkg == "com.android.systemui") return false
        if (pkg == "com.android.launcher3") return false 
        if (pkg == "com.sec.android.app.launcher") return false 
        if (pkg == "com.katsuyamaki.DroidOSLauncher") return false
        if (pkg == "com.example.coverscreentester") return false
        if (pkg == "com.katsuyamaki.trackpad") return false
        if (pkg.contains("inputmethod")) return false
        if (pkg.contains("navigationbar")) return false
        if (pkg == "ScreenDecorOverlayCover") return false
        if (pkg == "RecentsTransitionOverlay") return false
        if (pkg == "FreeformContainer") return false
        if (pkg == "StatusBar") return false
        if (pkg == "NotificationShade") return false
        return true
    }

    // Interface compliance stubs
    override fun setSystemBrightness(brightness: Int) { execShellCommand("settings put system screen_brightness $brightness") }
    override fun getSystemBrightness(): Int = 128
    override fun getSystemBrightnessFloat(): Float = 0.5f
    override fun setAutoBrightness(enabled: Boolean) { execShellCommand("settings put system screen_brightness_mode ${if (enabled) 1 else 0}") }
    override fun isAutoBrightness(): Boolean = true
    override fun setBrightnessViaDisplayManager(displayId: Int, brightness: Float): Boolean = setDisplayBrightnessInternal(displayId, brightness)
}
```

## File: app/src/main/java/com/example/quadrantlauncher/ShellUserService.kt.displayoff
```
package com.example.quadrantlauncher

import android.os.IBinder
import android.os.Binder
import android.os.Build
import android.util.Log
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.ArrayList

class ShellUserService : IShellService.Stub() {

    private val TAG = "ShellUserService"

    companion object {
        const val POWER_MODE_OFF = 0
        const val POWER_MODE_NORMAL = 2
        
        @Volatile private var displayControlClass: Class<*>? = null
        @Volatile private var displayControlClassLoaded = false
    }

    private val surfaceControlClass: Class<*> by lazy {
        Class.forName("android.view.SurfaceControl")
    }

    private fun getDisplayControlClass(): Class<*>? {
        if (displayControlClassLoaded && displayControlClass != null) return displayControlClass
        
        return try {
            val classLoaderFactoryClass = Class.forName("com.android.internal.os.ClassLoaderFactory")
            val createClassLoaderMethod = classLoaderFactoryClass.getDeclaredMethod(
                "createClassLoader",
                String::class.java,
                String::class.java,
                String::class.java,
                ClassLoader::class.java,
                Int::class.javaPrimitiveType,
                Boolean::class.javaPrimitiveType,
                String::class.java
            )
            val classLoader = createClassLoaderMethod.invoke(
                null, "/system/framework/services.jar", null, null,
                ClassLoader.getSystemClassLoader(), 0, true, null
            ) as ClassLoader

            val loadedClass = classLoader.loadClass("com.android.server.display.DisplayControl").also {
                val loadMethod = Runtime::class.java.getDeclaredMethod(
                    "loadLibrary0",
                    Class::class.java,
                    String::class.java
                )
                loadMethod.isAccessible = true
                loadMethod.invoke(Runtime.getRuntime(), it, "android_servers")
            }
            
            displayControlClass = loadedClass
            displayControlClassLoaded = true
            loadedClass
        } catch (e: Exception) {
            Log.w(TAG, "DisplayControl not available", e)
            null
        }
    }

    private fun getAllPhysicalDisplayTokens(): List<IBinder> {
        val tokens = ArrayList<IBinder>()
        try {
            val physicalIds: LongArray = if (Build.VERSION.SDK_INT >= 34) {
                val controlClass = getDisplayControlClass()
                if (controlClass != null) {
                    controlClass.getMethod("getPhysicalDisplayIds").invoke(null) as LongArray
                } else {
                     try {
                        surfaceControlClass.getMethod("getPhysicalDisplayIds").invoke(null) as LongArray
                     } catch (e: Exception) { LongArray(0) }
                }
            } else {
                surfaceControlClass.getMethod("getPhysicalDisplayIds").invoke(null) as LongArray
            }

            if (physicalIds.isEmpty()) {
                getSurfaceControlInternalToken()?.let { tokens.add(it) }
                return tokens
            }

            for (id in physicalIds) {
                try {
                    val token: IBinder? = if (Build.VERSION.SDK_INT >= 34) {
                        val controlClass = getDisplayControlClass()
                        if (controlClass != null) {
                             controlClass.getMethod("getPhysicalDisplayToken", Long::class.javaPrimitiveType)
                                .invoke(null, id) as? IBinder
                        } else {
                            surfaceControlClass.getMethod("getPhysicalDisplayToken", Long::class.javaPrimitiveType)
                                .invoke(null, id) as? IBinder
                        }
                    } else {
                        surfaceControlClass.getMethod("getPhysicalDisplayToken", Long::class.javaPrimitiveType)
                            .invoke(null, id) as? IBinder
                    }
                    
                    if (token != null) tokens.add(token)
                } catch (e: Exception) {
                    Log.w(TAG, "Failed to get token for physical ID $id", e)
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "Critical failure getting display tokens", e)
        }
        return tokens
    }

    private fun getSurfaceControlInternalToken(): IBinder? {
        return try {
            if (Build.VERSION.SDK_INT < 29) {
                surfaceControlClass.getMethod("getBuiltInDisplay", Int::class.java).invoke(null, 0) as IBinder
            } else {
                surfaceControlClass.getMethod("getInternalDisplayToken").invoke(null) as IBinder
            }
        } catch (e: Exception) { null }
    }

    private fun setPowerModeOnToken(token: IBinder, mode: Int) {
        try {
            val method = surfaceControlClass.getMethod(
                "setDisplayPowerMode",
                IBinder::class.java,
                Int::class.javaPrimitiveType
            )
            method.invoke(null, token, mode)
        } catch (e: Exception) {
            Log.e(TAG, "setDisplayPowerMode failed for token $token", e)
        }
    }

    private fun setDisplayBrightnessOnToken(token: IBinder, brightness: Float): Boolean {
        try {
            val method = surfaceControlClass.getMethod(
                "setDisplayBrightness",
                IBinder::class.java,
                Float::class.javaPrimitiveType
            )
            method.invoke(null, token, brightness)
            return true
        } catch (e: Exception) {
             try {
                val method = surfaceControlClass.getMethod(
                    "setDisplayBrightness",
                    IBinder::class.java,
                    Float::class.javaPrimitiveType,
                    Float::class.javaPrimitiveType,
                    Float::class.javaPrimitiveType,
                    Float::class.javaPrimitiveType
                )
                method.invoke(null, token, brightness, brightness, brightness, brightness)
                return true
            } catch (e2: Exception) {
                return false
            }
        }
    }

    private fun setDisplayBrightnessInternal(displayId: Int, brightness: Float): Boolean {
        // Legacy shim for single-target calls
        val tokens = getAllPhysicalDisplayTokens()
        if (tokens.isNotEmpty()) return setDisplayBrightnessOnToken(tokens[0], brightness)
        return false
    }

    private val shLock = Object()
    private var _shProcess: Process? = null
    private val shProcess: Process
        get() = synchronized(shLock) {
            if (_shProcess?.isAlive == true) _shProcess!!
            else Runtime.getRuntime().exec(arrayOf("sh")).also { _shProcess = it }
        }

    private fun execShellCommand(command: String) {
        synchronized(shLock) {
            try {
                val output = shProcess.outputStream
                output.write("$command\n".toByteArray())
                output.flush()
            } catch (e: Exception) {
                Log.e(TAG, "Shell command failed", e)
            }
        }
    }

    // ============================================================
    // AIDL Interface Implementations
    // ============================================================

    override fun setBrightness(displayId: Int, brightness: Int) {
        Log.d(TAG, "setBrightness(Global Broadcast, Value: $brightness)")
        val token = Binder.clearCallingIdentity()
        try {
            if (brightness < 0) {
                // === SCREEN OFF ===
                execShellCommand("settings put system screen_brightness_mode 0")
                
                // Get ALL tokens, but ONLY apply to the first 2 (Main + Cover)
                // This prevents killing the Glasses (which would be index 2+)
                val tokens = getAllPhysicalDisplayTokens()
                val safeTokens = tokens.take(2)
                
                for (t in safeTokens) {
                    setDisplayBrightnessOnToken(t, -1.0f)
                }
                
                execShellCommand("settings put system screen_brightness_float -1.0")
                execShellCommand("settings put system screen_brightness -1")
            } else {
                // === SCREEN ON ===
                val floatVal = brightness.toFloat() / 255.0f
                
                // Restore ALL tokens (safety, in case user replugged glasses)
                val tokens = getAllPhysicalDisplayTokens()
                for (t in tokens) {
                    setDisplayBrightnessOnToken(t, floatVal)
                }
                
                execShellCommand("settings put system screen_brightness_float $floatVal")
                execShellCommand("settings put system screen_brightness $brightness")
            }
        } catch (e: Exception) {
            Log.e(TAG, "setBrightness failed", e)
        } finally {
             Binder.restoreCallingIdentity(token)
        }
    }

    override fun setScreenOff(displayIndex: Int, turnOff: Boolean) {
        Log.d(TAG, "setScreenOff(Global Broadcast, TurnOff: $turnOff)")
        val token = Binder.clearCallingIdentity()
        try {
            val mode = if (turnOff) POWER_MODE_OFF else POWER_MODE_NORMAL
            
            // Same safety limit: Only affect first 2 physical screens
            val tokens = getAllPhysicalDisplayTokens()
            val safeTokens = tokens.take(2)
            
            for (t in safeTokens) {
                setPowerModeOnToken(t, mode)
            }
        } catch (e: Exception) {
            Log.e(TAG, "setScreenOff failed", e)
        } finally {
            Binder.restoreCallingIdentity(token)
        }
    }

    override fun forceStop(packageName: String) {
        val token = Binder.clearCallingIdentity()
        try { Runtime.getRuntime().exec("am force-stop $packageName").waitFor() } catch (e: Exception) {} finally { Binder.restoreCallingIdentity(token) }
    }

    override fun runCommand(command: String) {
        val token = Binder.clearCallingIdentity()
        try { Runtime.getRuntime().exec(command).waitFor() } catch (e: Exception) {} finally { Binder.restoreCallingIdentity(token) }
    }

    override fun repositionTask(packageName: String, left: Int, top: Int, right: Int, bottom: Int) {
        val token = Binder.clearCallingIdentity()
        try {
            val cmd = arrayOf("sh", "-c", "dumpsys activity top | grep -E 'TASK.*id=|ACTIVITY.*$packageName'")
            val process = Runtime.getRuntime().exec(cmd)
            val reader = BufferedReader(InputStreamReader(process.inputStream))
            var line: String?
            var targetTaskId = -1
            
            while (reader.readLine().also { line = it } != null) {
                if (line!!.contains("TASK") && line!!.contains("id=")) {
                     val match = Regex("id=(\\d+)").find(line!!)
                     if (match != null) targetTaskId = match.groupValues[1].toInt()
                }
                if (targetTaskId != -1 && line!!.contains(packageName)) {
                    break
                }
            }
            reader.close()
            process.waitFor()
            
            if (targetTaskId != -1) {
                Runtime.getRuntime().exec("am task set-windowing-mode $targetTaskId 5").waitFor()
                Runtime.getRuntime().exec("am task resize $targetTaskId $left $top $right $bottom").waitFor()
            }
        } catch (e: Exception) {} finally { Binder.restoreCallingIdentity(token) }
    }

    override fun getVisiblePackages(displayId: Int): List<String> {
        val packages = ArrayList<String>()
        val token = Binder.clearCallingIdentity()
        try {
            val cmd = arrayOf("sh", "-c", "dumpsys activity activities | grep -E 'Display #|ActivityRecord'")
            val process = Runtime.getRuntime().exec(cmd)
            val reader = BufferedReader(InputStreamReader(process.inputStream))
            var line: String?
            var currentScanningDisplayId = -1
            
            val pkgRegex = Regex("u\\d+\\s+(\\S+?)/")
            val displayRegex = Regex("Display #(\\d+)")

            while (reader.readLine().also { line = it } != null) {
                val l = line!!.trim()
                if (l.contains("Display #")) {
                    val displayMatch = displayRegex.find(l)
                    if (displayMatch != null) currentScanningDisplayId = displayMatch.groupValues[1].toInt()
                    continue
                }
                if (currentScanningDisplayId == displayId && l.contains("ActivityRecord{")) {
                    val matcher = pkgRegex.find(l)
                    if (matcher != null) {
                        val pkg = matcher.groupValues[1]
                        if (!packages.contains(pkg)) packages.add(pkg)
                    }
                }
            }
            reader.close()
            process.waitFor()
        } catch (e: Exception) {
            Log.e(TAG, "getVisiblePackages failed", e)
        } finally { 
            Binder.restoreCallingIdentity(token) 
        }
        return packages
    }

    override fun getAllRunningPackages(): List<String> {
        val packages = ArrayList<String>()
        val token = Binder.clearCallingIdentity()
        try {
            val cmd = arrayOf("sh", "-c", "dumpsys activity activities | grep 'ActivityRecord'")
            val process = Runtime.getRuntime().exec(cmd)
            val reader = BufferedReader(InputStreamReader(process.inputStream))
            var line: String?
            val pkgRegex = Regex("u\\d+\\s+(\\S+?)/")
            
            while (reader.readLine().also { line = it } != null) {
                val l = line!!.trim()
                if (l.contains("ActivityRecord{")) {
                    val matcher = pkgRegex.find(l)
                    if (matcher != null) {
                        val pkg = matcher.groupValues[1]
                        if (!packages.contains(pkg)) packages.add(pkg)
                    }
                }
            }
            reader.close()
            process.waitFor()
        } catch (e: Exception) {} finally { Binder.restoreCallingIdentity(token) }
        return packages
    }

    override fun getWindowLayouts(displayId: Int): List<String> = ArrayList()
    override fun getTaskId(packageName: String): Int {
        var taskId = -1
        val token = Binder.clearCallingIdentity()
        try {
            val cmd = arrayOf("sh", "-c", "dumpsys activity activities | grep -E 'Task id|$packageName'")
            val p = Runtime.getRuntime().exec(cmd)
            val r = BufferedReader(InputStreamReader(p.inputStream))
            var line: String?
            while (r.readLine().also { line = it } != null) {
                if (line!!.contains(packageName)) {
                    if (line!!.startsWith("* Task{") || line!!.startsWith("Task{")) { val m = Regex("#(\\\\d+)").find(line!!); if (m != null) { taskId = m.groupValues[1].toInt(); break } }
                    if (line!!.contains("ActivityRecord")) { val m = Regex("t(\\\\d+)").find(line!!); if (m != null) { taskId = m.groupValues[1].toInt(); break } }
                }
            }
        } catch (e: Exception) {} finally { Binder.restoreCallingIdentity(token) }
        return taskId
    }
    override fun moveTaskToBack(taskId: Int) {
        val token = Binder.clearCallingIdentity()
        try {
            val atmClass = Class.forName("android.app.ActivityTaskManager")
            val serviceMethod = atmClass.getMethod("getService")
            val atm = serviceMethod.invoke(null)
            val moveMethod = atm.javaClass.getMethod("moveTaskToBack", Int::class.javaPrimitiveType, Boolean::class.javaPrimitiveType)
            moveMethod.invoke(atm, taskId, true)
        } catch (e: Exception) {
            try {
                val am = Class.forName("android.app.ActivityManagerNative").getMethod("getDefault").invoke(null)
                val moveMethod = am.javaClass.getMethod("moveTaskToBack", Int::class.javaPrimitiveType, Boolean::class.javaPrimitiveType)
                moveMethod.invoke(am, taskId, true)
            } catch (e2: Exception) {}
        } finally { Binder.restoreCallingIdentity(token) }
    }
    override fun setSystemBrightness(brightness: Int) { execShellCommand("settings put system screen_brightness $brightness") }
    override fun getSystemBrightness(): Int = 128
    override fun getSystemBrightnessFloat(): Float = 0.5f
    override fun setAutoBrightness(enabled: Boolean) { execShellCommand("settings put system screen_brightness_mode ${if (enabled) 1 else 0}") }
    override fun isAutoBrightness(): Boolean = true
    override fun setBrightnessViaDisplayManager(displayId: Int, brightness: Float): Boolean = setDisplayBrightnessInternal(displayId, brightness)
}
```

## File: app/src/main/java/com/example/quadrantlauncher/ShellUserService.kt.minimize
```
package com.example.quadrantlauncher

import android.content.ContentResolver
import android.content.Context
import android.content.ContextWrapper
import android.os.Binder
import android.os.IBinder
import android.provider.Settings
import android.util.Log
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.ArrayList
import java.util.regex.Pattern

class ShellUserService : IShellService.Stub() {

    private val TAG = "ShellUserService"

    // --- v2.0 LOGIC: Shell Resolver for System Settings ---
    private val shellResolver: ContentResolver? by lazy {
        try {
            val activityThreadClass = Class.forName("android.app.ActivityThread")
            val currentActivityThread = activityThreadClass.getMethod("currentActivityThread").invoke(null)
            val systemContext = activityThreadClass.getMethod("getSystemContext").invoke(currentActivityThread) as Context
            val shellContext = object : ContextWrapper(systemContext) {
                override fun getPackageName(): String = "com.android.shell"
                override fun getOpPackageName(): String = "com.android.shell"
            }
            shellContext.contentResolver
        } catch (e: Exception) { 
            Log.e(TAG, "Failed to get ShellResolver", e)
            null 
        }
    }

    override fun setBrightness(value: Int) {
        val resolver = shellResolver ?: return
        try {
            // 1. Disable Auto Brightness
            Settings.System.putInt(resolver, "screen_brightness_mode", 0)

            if (value == -1) {
                // --- EXTINGUISH MODE (-1) ---
                // Remove minimum limit
                Settings.System.putInt(resolver, "screen_brightness_min", 0)
                
                // Set float to -1.0 (The magic signal for OLED off on some drivers)
                try {
                    Settings.System.putFloat(resolver, "screen_brightness_float", -1.0f)
                } catch (e: Exception) {
                    Settings.System.putString(resolver, "screen_brightness_float", "-1.0")
                }
                
                // Set int to -1
                Settings.System.putInt(resolver, "screen_brightness", -1)
                
                // Hardware override via DisplayManager
                setBrightnessViaDisplayManager(0, -1.0f)
            } else {
                // --- WAKE UP ---
                val safeVal = value.coerceIn(1, 255)
                val floatVal = safeVal / 255.0f
                
                Settings.System.putFloat(resolver, "screen_brightness_float", floatVal)
                Settings.System.putInt(resolver, "screen_brightness", safeVal)
                
                setBrightnessViaDisplayManager(0, floatVal)
            }
        } catch (e: Exception) {
            Log.e(TAG, "setBrightness failed", e)
        }
    }

    override fun setBrightnessViaDisplayManager(displayId: Int, brightness: Float): Boolean {
        try {
            val serviceManagerClass = Class.forName("android.os.ServiceManager")
            val getServiceMethod = serviceManagerClass.getMethod("getService", String::class.java)
            val binder = getServiceMethod.invoke(null, "display") as IBinder
            // Correctly escaped Stub for Kotlin string interpolation
            val iDisplayManagerClass = Class.forName("android.hardware.display.IDisplayManager\$Stub")
            val displayManager = iDisplayManagerClass.getMethod("asInterface", IBinder::class.java).invoke(null, binder)

            try {
                // Try 2-arg method first (Android 14+)
                val method = displayManager.javaClass.getMethod("setTemporaryBrightness", Int::class.javaPrimitiveType, Float::class.javaPrimitiveType)
                method.invoke(displayManager, displayId, brightness)
                return true
            } catch (e: NoSuchMethodException) {
                // Fallback to 1-arg method
                val method = displayManager.javaClass.getMethod("setTemporaryBrightness", Float::class.javaPrimitiveType)
                method.invoke(displayManager, brightness)
                return true
            }
        } catch (e: Exception) { 
            Log.e(TAG, "setBrightnessViaDisplayManager failed", e)
            return false 
        }
    }

    // --- v2.0 LOGIC: Screen Off (SurfaceControl) ---
    override fun setScreenOff(displayIndex: Int, turnOff: Boolean) {
        val token = Binder.clearCallingIdentity()
        try {
            val scClass = Class.forName("android.view.SurfaceControl")
            var serviceToken: IBinder? = null
            try { serviceToken = scClass.getDeclaredMethod("getInternalDisplayToken").apply { isAccessible = true }.invoke(null) as? IBinder } catch (e: Exception) {}
            
            if (serviceToken == null) {
                val ids = scClass.getMethod("getPhysicalDisplayIds").invoke(null) as LongArray
                if (ids.isNotEmpty()) {
                     val targetId = if (displayIndex >= 0 && displayIndex < ids.size) ids[displayIndex] else ids[0]
                     serviceToken = scClass.getMethod("getPhysicalDisplayToken", Long::class.javaPrimitiveType).invoke(null, targetId) as? IBinder
                }
            }
            
            if (serviceToken != null) {
                scClass.getMethod("setDisplayPowerMode", IBinder::class.java, Int::class.javaPrimitiveType)
                    .invoke(null, serviceToken, if (turnOff) 0 else 2)
            }
        } catch (e: Exception) {
            Log.e(TAG, "setScreenOff failed", e)
        } finally {
            Binder.restoreCallingIdentity(token)
        }
    }

    // --- V1.0 LOGIC: Window Management (Retained for Tiling/Minimizing) ---
    
    override fun forceStop(packageName: String) {
        val token = Binder.clearCallingIdentity()
        try { Runtime.getRuntime().exec("am force-stop $packageName").waitFor() } catch (e: Exception) {} finally { Binder.restoreCallingIdentity(token) }
    }

    override fun runCommand(command: String) {
        val token = Binder.clearCallingIdentity()
        try { Runtime.getRuntime().exec(command).waitFor() } catch (e: Exception) {} finally { Binder.restoreCallingIdentity(token) }
    }

    override fun repositionTask(packageName: String, left: Int, top: Int, right: Int, bottom: Int) {
        val token = Binder.clearCallingIdentity()
        try {
            val p = Runtime.getRuntime().exec("dumpsys activity top")
            val r = BufferedReader(InputStreamReader(p.inputStream))
            var line: String?
            var tid = -1
            while (r.readLine().also { line = it } != null) {
                if (line!!.contains(packageName) && line!!.contains("TASK")) { 
                    val m = Regex("id=(\\d+)").find(line!!)
                    if (m != null) tid = m.groupValues[1].toInt() 
                }
            }
            if (tid != -1) { 
                Runtime.getRuntime().exec("am task set-windowing-mode $tid 5").waitFor()
                Runtime.getRuntime().exec("am task resize $tid $left $top $right $bottom").waitFor() 
            }
        } catch (e: Exception) {} finally { Binder.restoreCallingIdentity(token) }
    }

    override fun getVisiblePackages(displayId: Int): List<String> {
        val list = ArrayList<String>()
        val token = Binder.clearCallingIdentity()
        try {
            val p = Runtime.getRuntime().exec("dumpsys window windows")
            val r = BufferedReader(InputStreamReader(p.inputStream))
            var line: String?
            var currentPkg: String? = null
            var isVisible = false
            var onCorrectDisplay = false
            val windowPattern = Pattern.compile("Window\\{[0-9a-f]+ u\\d+ ([^\\}/ ]+)")

            while (r.readLine().also { line = it } != null) {
                val l = line!!.trim()
                if (l.startsWith("Window #")) {
                    currentPkg = null; isVisible = false; onCorrectDisplay = false
                    val matcher = windowPattern.matcher(l)
                    if (matcher.find()) currentPkg = matcher.group(1)
                }
                if (l.contains("displayId=$displayId") || l.contains("mDisplayId=$displayId")) onCorrectDisplay = true
                if (l.contains("mViewVisibility=0x0")) isVisible = true

                if (currentPkg != null && isVisible && onCorrectDisplay) {
                    if (isUserApp(currentPkg!!) && !list.contains(currentPkg!!)) list.add(currentPkg!!)
                    currentPkg = null
                }
            }
        } catch (e: Exception) {} finally { Binder.restoreCallingIdentity(token) }
        return list
    }

    override fun getAllRunningPackages(): List<String> {
        val list = ArrayList<String>()
        val token = Binder.clearCallingIdentity()
        try {
            val p = Runtime.getRuntime().exec("dumpsys activity activities")
            val r = BufferedReader(InputStreamReader(p.inputStream))
            var line: String?
            val recordPattern = Pattern.compile("ActivityRecord\\{[0-9a-f]+ u\\d+ ([a-zA-Z0-9_.]+)/")
            while (r.readLine().also { line = it } != null) {
                if (line!!.contains("ActivityRecord{")) {
                    val m = recordPattern.matcher(line!!)
                    if (m.find()) { val pkg = m.group(1); if (pkg != null && !list.contains(pkg) && isUserApp(pkg)) list.add(pkg) }
                }
            }
        } catch (e: Exception) {} finally { Binder.restoreCallingIdentity(token) }
        return list
    }

    override fun getWindowLayouts(displayId: Int): List<String> = ArrayList()

    override fun getTaskId(packageName: String): Int {
        var taskId = -1
        val token = Binder.clearCallingIdentity()
        try {
            val cmd = arrayOf("sh", "-c", "dumpsys activity activities | grep -E 'Task id|$packageName'")
            val p = Runtime.getRuntime().exec(cmd)
            val r = BufferedReader(InputStreamReader(p.inputStream))
            var line: String?
            while (r.readLine().also { line = it } != null) {
                if (line!!.contains(packageName)) {
                    if (line!!.startsWith("* Task{") || line!!.startsWith("Task{")) { val m = Regex("#(\\d+)").find(line!!); if (m != null) { taskId = m.groupValues[1].toInt(); break } }
                    if (line!!.contains("ActivityRecord")) { val m = Regex("t(\\d+)").find(line!!); if (m != null) { taskId = m.groupValues[1].toInt(); break } }
                }
            }
        } catch (e: Exception) {} finally { Binder.restoreCallingIdentity(token) }
        return taskId
    }

    override fun moveTaskToBack(taskId: Int) {
        val token = Binder.clearCallingIdentity()
        try {
            val atmClass = Class.forName("android.app.ActivityTaskManager")
            val serviceMethod = atmClass.getMethod("getService")
            val atm = serviceMethod.invoke(null)
            val moveMethod = atm.javaClass.getMethod("moveTaskToBack", Int::class.javaPrimitiveType, Boolean::class.javaPrimitiveType)
            moveMethod.invoke(atm, taskId, true)
        } catch (e: Exception) {
            try {
                val am = Class.forName("android.app.ActivityManagerNative").getMethod("getDefault").invoke(null)
                val moveMethod = am.javaClass.getMethod("moveTaskToBack", Int::class.javaPrimitiveType, Boolean::class.javaPrimitiveType)
                moveMethod.invoke(am, taskId, true)
            } catch (e2: Exception) {}
        } finally { Binder.restoreCallingIdentity(token) }
    }

    private fun isUserApp(pkg: String): Boolean {
        if (pkg == "com.android.systemui") return false
        if (pkg == "com.android.launcher3") return false 
        if (pkg == "com.sec.android.app.launcher") return false 
        if (pkg == "com.example.quadrantlauncher") return false
        if (pkg == "com.example.com.katsuyamaki.coverscreenlauncher") return false
        if (pkg == "com.example.coverscreentester") return false 
        if (pkg == "com.katsuyamaki.trackpad") return false
        if (pkg.contains("inputmethod")) return false
        if (pkg.contains("navigationbar")) return false
        if (pkg == "ScreenDecorOverlayCover") return false
        if (pkg == "RecentsTransitionOverlay") return false
        if (pkg == "FreeformContainer") return false
        if (pkg == "StatusBar") return false
        if (pkg == "NotificationShade") return false
        return true
    }

    // Interface compliance stubs
    override fun setSystemBrightness(brightness: Int) { setBrightness(brightness) }
    override fun getSystemBrightness(): Int = 128
    override fun getSystemBrightnessFloat(): Float = 0.5f
    override fun setAutoBrightness(enabled: Boolean) { 
        val resolver = shellResolver ?: return
        try { Settings.System.putInt(resolver, "screen_brightness_mode", if (enabled) 1 else 0) } catch(e: Exception) {}
    }
    override fun isAutoBrightness(): Boolean = true
}
```

## File: app/src/main/java/com/example/quadrantlauncher/ShizukuBinder.java
```java
package com.example.quadrantlauncher;

import android.content.ComponentName;
import android.content.ServiceConnection;
import rikka.shizuku.Shizuku;

public class ShizukuBinder {
    
    public static void bind(ComponentName component, ServiceConnection connection, boolean debug, int version) {
        Shizuku.UserServiceArgs args = new Shizuku.UserServiceArgs(component)
                .processNameSuffix("shell")
                .daemon(false)
                .debuggable(debug)
                .version(version);
        
        Shizuku.bindUserService(args, connection);
    }

    public static void unbind(ComponentName component, ServiceConnection connection) {
        Shizuku.UserServiceArgs args = new Shizuku.UserServiceArgs(component)
                .processNameSuffix("shell")
                .daemon(false);
        
        Shizuku.unbindUserService(args, connection, true); 
    }
}
```

## File: app/src/main/java/com/example/quadrantlauncher/ShizukuHelper.kt
```kotlin
package com.example.quadrantlauncher

import android.content.pm.PackageManager
import rikka.shizuku.Shizuku
import java.lang.reflect.Method

object ShizukuHelper {
    const val SHIZUKU_PERMISSION_REQUEST_CODE = 1001

    // Reflection to access hidden 'newProcess' method
    private val newProcessMethod: Method by lazy {
        val clazz = Class.forName("rikka.shizuku.Shizuku")
        val method = clazz.getDeclaredMethod(
            "newProcess",
            Array<String>::class.java,
            Array<String>::class.java,
            String::class.java
        )
        method.isAccessible = true
        method
    }

    /**
     * Checks if Shizuku is available (Service bound and version correct).
     */
    fun isShizukuAvailable(): Boolean {
        return try {
            !Shizuku.isPreV11() && Shizuku.getVersion() >= 11
        } catch (e: Exception) {
            false
        }
    }

    /**
     * Checks if we already have the permission.
     */
    fun hasPermission(): Boolean {
        return if (isShizukuAvailable()) {
            try {
                Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED
            } catch (e: Exception) {
                false
            }
        } else {
            false
        }
    }

    /**
     * Requests permission. Default code used if none provided.
     */
    fun requestPermission(requestCode: Int = SHIZUKU_PERMISSION_REQUEST_CODE) {
        if (isShizukuAvailable()) {
            Shizuku.requestPermission(requestCode)
        }
    }

    /**
     * Executes a generic shell command using Shizuku.
     */
    fun runShellCommand(commandString: String) {
        val command = arrayOf("sh", "-c", commandString)
        val process = newProcessMethod.invoke(null, command, null, null) as Process
        process.waitFor()
    }

    /**
     * Kills the target app to force a window reset.
     */
    fun killApp(packageName: String) {
        runShellCommand("am force-stop $packageName")
    }
}
```

## File: app/src/main/java/com/example/quadrantlauncher/SplitActivity.kt
```kotlin
package com.example.quadrantlauncher

import android.app.Activity
import android.app.ActivityOptions
import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import android.content.pm.PackageManager
import android.graphics.Rect
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import rikka.shizuku.Shizuku

class SplitActivity : AppCompatActivity() {

    companion object {
        const val SPLIT1_KEY = "SPLIT1_PACKAGE"
        const val SPLIT2_KEY = "SPLIT2_PACKAGE"
        const val TAG = "SplitActivity"
    }

    private var app1Package: String? = null
    private var app2Package: String? = null
    private lateinit var app1Button: Button
    private lateinit var app2Button: Button
    private lateinit var launchButton: Button
    
    private var currentApp = -1
    private var shellService: IShellService? = null
    private var isBound = false

    // Connection to the Shell Service (Running inside Shizuku)
    private val userServiceConnection = object : ServiceConnection {
        override fun onServiceConnected(name: ComponentName?, binder: IBinder?) {
            Log.i(TAG, "Shizuku Service Connected")
            shellService = IShellService.Stub.asInterface(binder)
            isBound = true
            launchButton.text = "LAUNCH SPLIT (Ready)"
        }

        override fun onServiceDisconnected(name: ComponentName?) {
            Log.w(TAG, "Shizuku Service Disconnected")
            shellService = null
            isBound = false
            launchButton.text = "LAUNCH SPLIT (Disconnected)"
        }
    }

    // Listener 1: When Shizuku itself starts/connects
    private val binderReceivedListener = Shizuku.OnBinderReceivedListener {
        checkShizukuStatus()
    }

    // Listener 2: When user grants permission
    private val requestPermissionResultListener = Shizuku.OnRequestPermissionResultListener { _, grantResult ->
        checkShizukuStatus()
    }

    private val appSelectLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val pkg = result.data?.getStringExtra(MainActivity.SELECTED_APP_PACKAGE)
            if (pkg != null) {
                val simple = AppPreferences.getSimpleName(pkg)
                if (currentApp == 1) {
                    app1Package = pkg
                    app1Button.text = "App 1: $simple"
                    AppPreferences.savePackage(this, SPLIT1_KEY, pkg)
                } else if (currentApp == 2) {
                    app2Package = pkg
                    app2Button.text = "App 2: $simple"
                    AppPreferences.savePackage(this, SPLIT2_KEY, pkg)
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_split)

        app1Button = findViewById(R.id.app1_button)
        app2Button = findViewById(R.id.app2_button)
        launchButton = findViewById(R.id.launch_button_split)
        
        loadSavedApps()

        app1Button.setOnClickListener { currentApp = 1; launchAppPicker() }
        app2Button.setOnClickListener { currentApp = 2; launchAppPicker() }

        launchButton.setOnClickListener {
            if (app1Package != null && app2Package != null) {
                launchSplitApps()
            } else {
                Toast.makeText(this, "Select two apps.", Toast.LENGTH_SHORT).show()
            }
        }

        // Add Listeners
        Shizuku.addBinderReceivedListener(binderReceivedListener)
        Shizuku.addRequestPermissionResultListener(requestPermissionResultListener)
        
        // Initial Check
        checkShizukuStatus()
    }

    private fun checkShizukuStatus() {
        if (Shizuku.getBinder() == null) {
            // Shizuku not attached yet
            launchButton.text = "Waiting for Shizuku..."
            return
        }

        if (Shizuku.checkSelfPermission() == PackageManager.PERMISSION_GRANTED) {
            bindShizukuService()
        } else {
            launchButton.text = "Requesting Permission..."
            Shizuku.requestPermission(0)
        }
    }

    private fun bindShizukuService() {
        if (isBound) return
        
        try {
            val component = ComponentName(packageName, ShellUserService::class.java.name)
            // VERSION CODE 1 (Matches BuildConfig.VERSION_CODE usually)
            ShizukuBinder.bind(component, userServiceConnection, true, 1)
            launchButton.text = "Binding..."
        } catch (e: Exception) {
            Log.e(TAG, "Bind Failed", e)
            launchButton.text = "Bind Failed"
        }
    }

    private fun loadSavedApps() {
        app1Package = AppPreferences.loadPackage(this, SPLIT1_KEY)
        app1Button.text = "App 1: ${AppPreferences.getSimpleName(app1Package)}"
        app2Package = AppPreferences.loadPackage(this, SPLIT2_KEY)
        app2Button.text = "App 2: ${AppPreferences.getSimpleName(app2Package)}"
    }

    override fun onDestroy() {
        super.onDestroy()
        Shizuku.removeBinderReceivedListener(binderReceivedListener)
        Shizuku.removeRequestPermissionResultListener(requestPermissionResultListener)
        
        if (isBound) {
            val component = ComponentName(packageName, ShellUserService::class.java.name)
            ShizukuBinder.unbind(component, userServiceConnection)
            isBound = false
        }
    }

    private fun launchAppPicker() {
        appSelectLauncher.launch(Intent(this, MainActivity::class.java))
    }

    private fun launchSplitApps() {
        val metrics = windowManager.maximumWindowMetrics
        val w = metrics.bounds.width()
        val h = metrics.bounds.height()
        val left = Rect(0, 0, w / 2, h)
        val right = Rect(w / 2, 0, w, h)

        if (isBound && shellService != null) {
            launchButton.text = "LAUNCHING..."
            Thread {
                try {
                    shellService?.forceStop(app1Package)
                    shellService?.forceStop(app2Package)
                    Thread.sleep(400)
                    runOnUiThread {
                        launchApp(app1Package!!, left)
                        launchApp(app2Package!!, right)
                        launchButton.text = "LAUNCH SPLIT"
                    }
                } catch (e: Exception) {
                    Log.e(TAG, "Remote Call Failed", e)
                }
            }.start()
        } else {
            Toast.makeText(this, "Shizuku NOT READY. Launching anyway.", Toast.LENGTH_LONG).show()
            checkShizukuStatus() // Try connecting again
            launchApp(app1Package!!, left)
            launchApp(app2Package!!, right)
        }
    }

    private fun launchApp(packageName: String, bounds: Rect) {
        try {
            val intent = packageManager.getLaunchIntentForPackage(packageName)
            if (intent == null) return
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
            val options = ActivityOptions.makeBasic().setLaunchBounds(bounds)
            startActivity(intent, options.toBundle())
        } catch (e: Exception) {
            Log.e(TAG, "Launch error", e)
        }
    }
}
```

## File: app/src/main/java/com/example/quadrantlauncher/TriSplitActivity.kt
```kotlin
package com.example.quadrantlauncher

import android.app.Activity
import android.app.ActivityOptions
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Rect
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import rikka.shizuku.Shizuku

class TriSplitActivity : AppCompatActivity() {

    companion object {
        const val TRI1_KEY = "TRI1_PACKAGE"
        const val TRI2_KEY = "TRI2_PACKAGE"
        const val TRI3_KEY = "TRI3_PACKAGE"
    }

    private var app1Package: String? = null
    private var app2Package: String? = null
    private var app3Package: String? = null

    private lateinit var app1Button: Button
    private lateinit var app2Button: Button
    private lateinit var app3Button: Button
    private lateinit var launchButton: Button

    private var currentApp = -1
    private var hasShizukuPermission = false

    private val REQUEST_PERMISSION_RESULT_LISTENER =
        Shizuku.OnRequestPermissionResultListener { requestCode, grantResult ->
            if (requestCode == ShizukuHelper.SHIZUKU_PERMISSION_REQUEST_CODE) {
                hasShizukuPermission = grantResult == PackageManager.PERMISSION_GRANTED
                checkShizukuPermission()
            }
        }

    private val appSelectLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val pkg = result.data?.getStringExtra(MainActivity.SELECTED_APP_PACKAGE)
            if (pkg != null) {
                val simple = AppPreferences.getSimpleName(pkg)
                when (currentApp) {
                    1 -> {
                        app1Package = pkg
                        app1Button.text = "App 1: $simple"
                        AppPreferences.savePackage(this, TRI1_KEY, pkg)
                    }
                    2 -> {
                        app2Package = pkg
                        app2Button.text = "App 2: $simple"
                        AppPreferences.savePackage(this, TRI2_KEY, pkg)
                    }
                    3 -> {
                        app3Package = pkg
                        app3Button.text = "App 3: $simple"
                        AppPreferences.savePackage(this, TRI3_KEY, pkg)
                    }
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Shizuku.addRequestPermissionResultListener(REQUEST_PERMISSION_RESULT_LISTENER)
        setContentView(R.layout.activity_tri_split)

        app1Button = findViewById(R.id.app1_button_tri)
        app2Button = findViewById(R.id.app2_button_tri)
        app3Button = findViewById(R.id.app3_button_tri)
        launchButton = findViewById(R.id.launch_button_tri_split)

        loadSavedApps()

        app1Button.setOnClickListener { currentApp = 1; pickApp() }
        app2Button.setOnClickListener { currentApp = 2; pickApp() }
        app3Button.setOnClickListener { currentApp = 3; pickApp() }

        launchButton.setOnClickListener {
            if (app1Package != null && app2Package != null && app3Package != null) {
                launchSplitApps()
            } else {
                Toast.makeText(this, "Select three apps.", Toast.LENGTH_SHORT).show()
            }
        }
        checkShizukuPermission()
    }

    private fun loadSavedApps() {
        app1Package = AppPreferences.loadPackage(this, TRI1_KEY)
        app1Button.text = "App 1: ${AppPreferences.getSimpleName(app1Package)}"
        app2Package = AppPreferences.loadPackage(this, TRI2_KEY)
        app2Button.text = "App 2: ${AppPreferences.getSimpleName(app2Package)}"
        app3Package = AppPreferences.loadPackage(this, TRI3_KEY)
        app3Button.text = "App 3: ${AppPreferences.getSimpleName(app3Package)}"
    }

    override fun onDestroy() {
        super.onDestroy()
        Shizuku.removeRequestPermissionResultListener(REQUEST_PERMISSION_RESULT_LISTENER)
    }

    private fun checkShizukuPermission() {
        if (ShizukuHelper.isShizukuAvailable()) {
            if (ShizukuHelper.hasPermission()) {
                hasShizukuPermission = true
            } else {
                ShizukuHelper.requestPermission()
            }
        }
    }

    private fun pickApp() {
        appSelectLauncher.launch(Intent(this, MainActivity::class.java))
    }

    private fun launchSplitApps() {
        val metrics = windowManager.maximumWindowMetrics
        val w = metrics.bounds.width()
        val h = metrics.bounds.height()
        val colWidth = w / 3

        val left = Rect(0, 0, colWidth, h)
        val middle = Rect(colWidth, 0, colWidth * 2, h)
        val right = Rect(colWidth * 2, 0, w, h)

        if (hasShizukuPermission) {
            Thread {
                ShizukuHelper.killApp(app1Package!!)
                ShizukuHelper.killApp(app2Package!!)
                ShizukuHelper.killApp(app3Package!!)
                try { Thread.sleep(400) } catch (e: InterruptedException) {}
                runOnUiThread {
                    launchAppIntent(app1Package!!, left)
                    launchAppIntent(app2Package!!, middle)
                    launchAppIntent(app3Package!!, right)
                }
            }.start()
        } else {
            launchAppIntent(app1Package!!, left)
            launchAppIntent(app2Package!!, middle)
            launchAppIntent(app3Package!!, right)
        }
    }

    private fun launchAppIntent(packageName: String, bounds: Rect) {
        try {
            val intent = packageManager.getLaunchIntentForPackage(packageName)
            if (intent == null) return

            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
            val options = ActivityOptions.makeBasic().setLaunchBounds(bounds)
            startActivity(intent, options.toBundle())
        } catch (e: Exception) {
            Log.e("TriSplitActivity", "Failed to launch $packageName", e)
        }
    }
}
```

## File: app/src/main/res/drawable/bg_bubble.xml
```xml
<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="oval">
    <solid android:color="#444444"/>
    <stroke android:width="2dp" android:color="#888888"/>
</shape>
```

## File: app/src/main/res/drawable/bg_drawer.xml
```xml
<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <solid android:color="#2D2D2D"/>
    <corners android:radius="16dp"/>
    <stroke android:width="1dp" android:color="#444444"/>
</shape>
```

## File: app/src/main/res/drawable/bg_item_active.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <solid android:color="#00A0E9"/>
    <corners android:radius="8dp"/>
</shape>
```

## File: app/src/main/res/drawable/bg_item_press.xml
```xml
<selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:state_pressed="true">
        <shape android:shape="rectangle">
            <solid android:color="#44FFFFFF"/>
            <corners android:radius="8dp"/>
        </shape>
    </item>
    <item>
        <shape android:shape="rectangle">
            <solid android:color="#00000000"/>
        </shape>
    </item>
</selector>
```

## File: app/src/main/res/drawable/ic_block.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="24dp"
    android:height="24dp"
    android:viewportWidth="24"
    android:viewportHeight="24">
    <path
        android:fillColor="#FFFFFF"
        android:pathData="M17,2H7C5.9,2 5,2.9 5,4v16c0,1.1 0.9,2 2,2h10c1.1,0 2,-0.9 2,-2V4C19,2.9 18.1,2 17,2z M17,20H7V4h10V20z M9,6h6v2H9V6z M9,10h6v2H9V10z M9,14h6v2H9V14z"/>
</vector>
```

## File: app/src/main/res/drawable/ic_box_outline.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="24dp"
    android:height="24dp"
    android:viewportWidth="24"
    android:viewportHeight="24">
    <path
        android:fillColor="#00000000"
        android:strokeColor="#AAAAAA"
        android:strokeWidth="2"
        android:pathData="M3,3h18v18H3z"/>
</vector>
```

## File: app/src/main/res/drawable/ic_cover_final_scale.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<inset xmlns:android="http://schemas.android.com/apk/res/android"
    android:drawable="@drawable/wolf_cover_icon"
    android:inset="70dp" />
```

## File: app/src/main/res/drawable/ic_launcher_foreground_scaled.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<inset xmlns:android="http://schemas.android.com/apk/res/android"
    android:drawable="@drawable/ic_launcher"
    android:insetLeft="15dp"
    android:insetRight="15dp"
    android:insetTop="15dp"
    android:insetBottom="15dp" />
```

## File: app/src/main/res/drawable/ic_lock_closed.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="24dp"
    android:height="24dp"
    android:viewportWidth="24"
    android:viewportHeight="24"
    android:tint="#FFFFFF">
  <path
      android:fillColor="#FFFFFFFF"
      android:pathData="M18,8h-1V6c0,-2.76 -2.24,-5 -5,-5S7,3.24 7,6v2H6c-1.1,0 -2,0.9 -2,2v10c0,1.1 0.9,2 2,2h12c1.1,0 2,-0.9 2,-2V10C20,8.9 19.1,8 18,8zM12,17c-1.1,0 -2,-0.9 -2,-2c0,-1.1 0.9,-2 2,-2s2,0.9 2,2C14,16.1 13.1,17 12,17zM9,8V6c0,-1.66 1.34,-3 3,-3s3,1.34 3,3v2H9z"/>
</vector>
```

## File: app/src/main/res/drawable/ic_lock_open.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="24dp"
    android:height="24dp"
    android:viewportWidth="24"
    android:viewportHeight="24"
    android:tint="#FFFFFF">
  <path
      android:fillColor="#FFFFFFFF"
      android:pathData="M12,17c1.1,0 2,-0.9 2,-2s-0.9,-2 -2,-2s-2,0.9 -2,2S10.9,17 12,17zM18,8h-1V6c0,-2.76 -2.24,-5 -5,-5S7,3.24 7,6h1.9c0,-1.71 1.39,-3.1 3.1,-3.1c1.71,0 3.1,1.39 3.1,3.1v2H6c-1.1,0 -2,0.9 -2,2v10c0,1.1 0.9,2 2,2h12c1.1,0 2,-0.9 2,-2V10C20,8.9 19.1,8 18,8z"/>
</vector>
```

## File: app/src/main/res/drawable/ic_mode_dpi.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="24dp"
    android:height="24dp"
    android:viewportWidth="24"
    android:viewportHeight="24">
    <path
        android:fillColor="#FFFFFF"
        android:pathData="M17,2H7C5.9,2 5,2.9 5,4v16c0,1.1 0.9,2 2,2h10c1.1,0 2,-0.9 2,-2V4C19,2.9 18.1,2 17,2z M17,20H7V4h10V20z M9,6h6v2H9V6z M9,10h6v2H9V10z M9,14h6v2H9V14z"/>
</vector>
```

## File: app/src/main/res/drawable/ic_mode_profiles.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="24dp"
    android:height="24dp"
    android:viewportWidth="24"
    android:viewportHeight="24">
    <path
        android:fillColor="#FFFFFF"
        android:pathData="M12,2C6.48,2 2,6.48 2,12s4.48,10 10,10 10,-4.48 10,-10S17.52,2 12,2zM12,5c1.66,0 3,1.34 3,3s-1.34,3 -3,3 -3,-1.34 -3,-3 1.34,-3 3,-3zM12,19.2c-2.5,0 -4.71,-1.28 -6,-3.22 0.03,-1.99 4,-3.08 6,-3.08 1.99,0 5.97,1.09 6,3.08 -1.29,1.94 -3.5,3.22 -6,3.22z"/>
</vector>
```

## File: app/src/main/res/drawable/ic_mode_resolution.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="24dp"
    android:height="24dp"
    android:viewportWidth="24"
    android:viewportHeight="24">
    <path
        android:fillColor="#FFFFFF"
        android:pathData="M21,4H3C2.45,4 2,4.45 2,5v14c0,0.55 0.45,1 1,1h18c0.55,0 1,-0.45 1,-1V5C22,4.45 21.55,4 21,4z M20,18H4V6h16V18z M5.5,7h2v2h-2V7z M8.5,7h2v2h-2V7z M5.5,10h2v2h-2V10z M8.5,10h2v2h-2V10z"/>
</vector>
```

## File: app/src/main/res/drawable/ic_scaler_bubble.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<inset xmlns:android="http://schemas.android.com/apk/res/android"
    android:drawable="@drawable/img_wolf_logo"
    android:inset="35dp" />
```

## File: app/src/main/res/drawable/ic_scaler_cover_final.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<inset xmlns:android="http://schemas.android.com/apk/res/android"
    android:drawable="@drawable/wolf_cover_icon"
    android:inset="80dp" />
```

## File: app/src/main/res/drawable/ic_scaler_cover_tiny.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<inset xmlns:android="http://schemas.android.com/apk/res/android"
    android:drawable="@drawable/img_wolf_logo"
    android:inset="65dp" />
```

## File: app/src/main/res/drawable/ic_star_border.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="24dp"
    android:height="24dp"
    android:viewportWidth="24"
    android:viewportHeight="24"
    android:tint="#888888">
    <path
        android:fillColor="#888888"
        android:pathData="M22,9.24l-7.19,-0.62L12,2 9.19,8.63 2,9.24l5.46,4.73L5.82,21 12,17.27 18.18,21l-1.63,-7.03L22,9.24zM12,15.4l-3.76,2.27 1,-4.28 -3.32,-2.88 4.38,-0.38L12,6.1l1.71,4.01 4.38,0.38 -3.32,2.88 1,4.28L12,15.4z"/>
</vector>
```

## File: app/src/main/res/drawable/ic_star_filled.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="24dp"
    android:height="24dp"
    android:viewportWidth="24"
    android:viewportHeight="24"
    android:tint="#FFD700">
    <path
        android:fillColor="#FFD700"
        android:pathData="M12,17.27L18.18,21l-1.64,-7.03L22,9.24l-7.19,-0.61L12,2 9.19,8.63 2,9.24l5.46,4.73L5.82,21z"/>
</vector>
```

## File: app/src/main/res/drawable/ic_window_split.xml
```xml
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="24dp" android:height="24dp" android:viewportWidth="24" android:viewportHeight="24">
    <path android:fillColor="#FFFFFF" android:pathData="M4,4h16v16H4V4z M12,4v16 M4,12h16"/>
</vector>
```

## File: app/src/main/res/drawable/ic_wolf_cover.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<inset xmlns:android="http://schemas.android.com/apk/res/android"
    android:drawable="@drawable/img_wolf_logo"
    android:inset="80dp" />
```

## File: app/src/main/res/drawable/ic_wolf_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<inset xmlns:android="http://schemas.android.com/apk/res/android"
    android:drawable="@drawable/img_wolf_logo"
    android:inset="25dp" />
```

## File: app/src/main/res/drawable/scaler_bubble.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<inset xmlns:android="http://schemas.android.com/apk/res/android"
    android:drawable="@drawable/img_wolf_logo"
    android:inset="120dp" />
```

## File: app/src/main/res/drawable/scaler_cover.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<inset xmlns:android="http://schemas.android.com/apk/res/android"
    android:drawable="@drawable/img_wolf_logo"
    android:inset="120dp" />
```

## File: app/src/main/res/drawable/scaler_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<inset xmlns:android="http://schemas.android.com/apk/res/android"
    android:drawable="@drawable/img_wolf_logo"
    android:inset="20dp" />
```

## File: app/src/main/res/layout/activity_main.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:background="#121212">

    <com.google.android.material.tabs.TabLayout
        android:id="@+id/tab_layout"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="#1E1E1E"
        app:tabTextColor="#AAAAAA"
        app:tabSelectedTextColor="#FFFFFF"
        app:tabIndicatorColor="#3DDC84"
        app:tabMode="fixed"
        app:tabGravity="fill">
        <com.google.android.material.tabs.TabItem
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Favorites" />
        <com.google.android.material.tabs.TabItem
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Search" />
        <com.google.android.material.tabs.TabItem
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="All Apps" />
    </com.google.android.material.tabs.TabLayout>

    <EditText
        android:id="@+id/search_bar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Search Apps..."
        android:textColor="#FFFFFF"
        android:textColorHint="#888888"
        android:padding="12dp"
        android:layout_margin="8dp"
        android:background="@android:drawable/editbox_background"
        android:drawableStart="@android:drawable/ic_menu_search"
        android:drawablePadding="8dp"
        android:singleLine="true"
        android:visibility="gone" />

    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1">

        <androidx.recyclerview.widget.RecyclerView
            android:id="@+id/app_list_recycler_view"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:clipToPadding="false"
            android:paddingBottom="16dp"/>

        <androidx.recyclerview.widget.RecyclerView
            android:id="@+id/az_recycler_view"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:background="#333333"
            android:visibility="gone" />
            
        <TextView
            android:id="@+id/empty_view"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:text="No apps found"
            android:visibility="gone"
            android:textSize="18sp"
            android:textColor="#AAAAAA"/>

    </FrameLayout>

</LinearLayout>
```

## File: app/src/main/res/layout/activity_menu.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp"
    android:gravity="center">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Select Launch Mode"
        android:textSize="20sp"
        android:layout_marginBottom="24dp" />

    <Button
        android:id="@+id/button_quadrant"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="4-Quadrant Launcher" />

    <Button
        android:id="@+id/button_split"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="2-App Split-Screen" />

    <Button
        android:id="@+id/button_tri_split"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="3-App Split-Screen (Row)" />

</LinearLayout>
```

## File: app/src/main/res/layout/activity_permissions.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="24dp"
    android:background="#121212"
    android:gravity="center">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="DroidOS Setup"
        android:textSize="28sp"
        android:textStyle="bold"
        android:textColor="#FFFFFF"
        android:layout_marginBottom="8dp" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Permissions required for Launcher"
        android:textSize="14sp"
        android:textColor="#AAAAAA"
        android:layout_marginBottom="30dp" />

    <LinearLayout
        android:id="@+id/btn_perm_overlay"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:background="@drawable/bg_item_press"
        android:padding="16dp"
        android:layout_marginBottom="12dp"
        android:gravity="center_vertical"
        android:clickable="true"
        android:focusable="true">
        <LinearLayout
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:orientation="vertical">
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Display Over Other Apps"
                android:textColor="#FFFFFF"
                android:textSize="16sp"
                android:textStyle="bold"/>
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Required for Floating Bubble"
                android:textColor="#888888"
                android:textSize="12sp"/>
        </LinearLayout>
        <ImageView
            android:id="@+id/icon_status_overlay"
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:src="@android:drawable/checkbox_off_background"/>
    </LinearLayout>

    <LinearLayout
        android:id="@+id/btn_perm_shizuku"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:background="@drawable/bg_item_press"
        android:padding="16dp"
        android:layout_marginBottom="12dp"
        android:gravity="center_vertical"
        android:clickable="true"
        android:focusable="true">
        <LinearLayout
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:orientation="vertical">
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Shizuku Access"
                android:textColor="#FFFFFF"
                android:textSize="16sp"
                android:textStyle="bold"/>
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Required for Window Management"
                android:textColor="#888888"
                android:textSize="12sp"/>
        </LinearLayout>
        <ImageView
            android:id="@+id/icon_status_shizuku"
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:src="@android:drawable/checkbox_off_background"/>
    </LinearLayout>

    <LinearLayout
        android:id="@+id/btn_perm_accessibility"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:background="@drawable/bg_item_press"
        android:padding="16dp"
        android:layout_marginBottom="32dp"
        android:gravity="center_vertical"
        android:clickable="true"
        android:focusable="true">
        <LinearLayout
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:orientation="vertical">
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Accessibility Service"
                android:textColor="#FFFFFF"
                android:textSize="16sp"
                android:textStyle="bold"/>
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Required for Launcher Operations"
                android:textColor="#888888"
                android:textSize="12sp"/>
        </LinearLayout>
        <ImageView
            android:id="@+id/icon_status_accessibility"
            android:layout_width="24dp"
            android:layout_height="24dp"
            android:src="@android:drawable/checkbox_off_background"/>
    </LinearLayout>

    <Button
        android:id="@+id/btn_continue"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Grant Permissions to Continue"
        android:backgroundTint="#00A0E9"
        android:textColor="#FFFFFF"
        android:padding="14dp"
        android:alpha="0.5"
        android:enabled="false"/>

</LinearLayout>
```

## File: app/src/main/res/layout/activity_quadrant.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp"
    tools:context=".QuadrantActivity">

    <Button
        android:id="@+id/q1_button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Select App for Quadrant 1" />

    <Button
        android:id="@+id/q2_button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Select App for Quadrant 2" />

    <Button
        android:id="@+id/q3_button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Select App for Quadrant 3" />

    <Button
        android:id="@+id/q4_button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Select App for Quadrant 4" />

    <View
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1" />

    <Button
        android:id="@+id/launch_button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="LAUNCH"
        style="@style/Widget.AppCompat.Button.Colored" /> </LinearLayout>
```

## File: app/src/main/res/layout/activity_split.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/root_layout_split"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp"
    tools:context=".SplitActivity">

    <Button
        android:id="@+id/app1_button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Select App 1 (Left)" />

    <Button
        android:id="@+id/app2_button"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Select App 2 (Right)" />

    <View
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1" />

    <Button
        android:id="@+id/launch_button_split"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="LAUNCH SPLIT"
        style="@style/Widget.AppCompat.Button.Colored" />

</LinearLayout>
```

## File: app/src/main/res/layout/activity_tri_split.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp"
    tools:context=".TriSplitActivity">

    <Button
        android:id="@+id/app1_button_tri"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Select App 1 (Left)" />

    <Button
        android:id="@+id/app2_button_tri"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Select App 2 (Middle)" />

    <Button
        android:id="@+id/app3_button_tri"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Select App 3 (Right)" />

    <View
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1" />

    <Button
        android:id="@+id/launch_button_tri_split"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="LAUNCH 3-APP SPLIT"
        style="@style/Widget.AppCompat.Button.Colored" />

</LinearLayout>
```

## File: app/src/main/res/layout/item_app_rofi.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal"
    android:padding="10dp"
    android:gravity="center_vertical"
    android:background="@drawable/bg_item_press">

    <ImageView
        android:id="@+id/rofi_app_icon"
        android:layout_width="24dp"
        android:layout_height="24dp"
        android:src="@mipmap/ic_launcher_round"
        android:layout_marginEnd="12dp" />

    <TextView
        android:id="@+id/rofi_app_text"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:text="App Name"
        android:textColor="#FFFFFF"
        android:textSize="16sp" />

    <ImageView
        android:id="@+id/rofi_app_star"
        android:layout_width="16dp"
        android:layout_height="16dp"
        android:src="@drawable/ic_star_filled"
        android:visibility="gone" />

</LinearLayout>
```

## File: app/src/main/res/layout/item_custom_resolution.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal"
    android:padding="8dp"
    android:gravity="center_vertical"
    android:background="@drawable/bg_item_press">

    <EditText
        android:id="@+id/input_res_w"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:hint="W"
        android:inputType="number"
        android:textColor="#FFFFFF"
        android:textColorHint="#888888"
        android:gravity="center"
        android:background="@null"
        android:imeOptions="actionNext"
        android:textSize="16sp"/>

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="x"
        android:textColor="#AAAAAA"
        android:paddingStart="8dp"
        android:paddingEnd="8dp"/>

    <EditText
        android:id="@+id/input_res_h"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:hint="H"
        android:inputType="number"
        android:textColor="#FFFFFF"
        android:textColorHint="#888888"
        android:gravity="center"
        android:background="@null"
        android:imeOptions="actionDone"
        android:textSize="16sp"/>

    <ImageView
        android:id="@+id/btn_save_res"
        android:layout_width="40dp"
        android:layout_height="40dp"
        android:padding="10dp"
        android:src="@android:drawable/ic_menu_save"
        android:tint="#00A0E9"
        android:background="?attr/selectableItemBackgroundBorderless"/>

</LinearLayout>
```

## File: app/src/main/res/layout/item_dpi_custom.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal"
    android:padding="8dp"
    android:gravity="center_vertical"
    android:background="@drawable/bg_item_press">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="DPI:"
        android:textColor="#888888"
        android:textSize="14sp"
        android:paddingEnd="8dp"/>

    <EditText
        android:id="@+id/input_dpi_value"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:inputType="number"
        android:maxLength="3"
        android:text="120"
        android:textColor="#FFFFFF"
        android:textSize="18sp"
        android:imeOptions="actionDone"
        android:background="@null"/>

    <ImageView
        android:id="@+id/btn_dpi_minus"
        android:layout_width="40dp"
        android:layout_height="40dp"
        android:padding="10dp"
        android:src="@android:drawable/ic_input_delete"
        android:tint="#FF5555"
        android:background="?attr/selectableItemBackgroundBorderless"/>

    <ImageView
        android:id="@+id/btn_dpi_plus"
        android:layout_width="40dp"
        android:layout_height="40dp"
        android:padding="10dp"
        android:src="@android:drawable/ic_input_add"
        android:tint="#3DDC84"
        android:background="?attr/selectableItemBackgroundBorderless"/>

</LinearLayout>
```

## File: app/src/main/res/layout/item_font_size.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal"
    android:padding="8dp"
    android:gravity="center_vertical"
    android:background="@drawable/bg_item_press">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Font Size:"
        android:textColor="#FFFFFF"
        android:textSize="16sp"
        android:layout_marginEnd="8dp"/>

    <TextView
        android:id="@+id/text_font_value"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:text="16"
        android:textColor="#FFFFFF"
        android:textSize="18sp"/>

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="sp"
        android:textColor="#888888"
        android:textSize="12sp"
        android:paddingEnd="8dp"/>

    <ImageView
        android:id="@+id/btn_font_minus"
        android:layout_width="40dp"
        android:layout_height="40dp"
        android:padding="10dp"
        android:src="@android:drawable/ic_input_delete"
        android:tint="#FF5555"
        android:background="?attr/selectableItemBackgroundBorderless"/>

    <ImageView
        android:id="@+id/btn_font_plus"
        android:layout_width="40dp"
        android:layout_height="40dp"
        android:padding="10dp"
        android:src="@android:drawable/ic_input_add"
        android:tint="#3DDC84"
        android:background="?attr/selectableItemBackgroundBorderless"/>

</LinearLayout>
```

## File: app/src/main/res/layout/item_height_setting.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal"
    android:padding="8dp"
    android:gravity="center_vertical"
    android:background="@drawable/bg_item_press">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Height:"
        android:textColor="#FFFFFF"
        android:textSize="16sp"
        android:layout_marginEnd="8dp"/>

    <TextView
        android:id="@+id/text_height_value"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:text="70"
        android:textColor="#FFFFFF"
        android:textSize="18sp"/>

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="%"
        android:textColor="#888888"
        android:textSize="12sp"
        android:paddingEnd="8dp"/>

    <ImageView
        android:id="@+id/btn_height_minus"
        android:layout_width="40dp"
        android:layout_height="40dp"
        android:padding="10dp"
        android:src="@android:drawable/ic_input_delete"
        android:tint="#FF5555"
        android:background="?attr/selectableItemBackgroundBorderless"/>

    <ImageView
        android:id="@+id/btn_height_plus"
        android:layout_width="40dp"
        android:layout_height="40dp"
        android:padding="10dp"
        android:src="@android:drawable/ic_input_add"
        android:tint="#3DDC84"
        android:background="?attr/selectableItemBackgroundBorderless"/>

</LinearLayout>
```

## File: app/src/main/res/layout/item_icon_setting.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal"
    android:padding="12dp"
    android:gravity="center_vertical"
    android:background="@drawable/bg_item_press">

    <TextView
        android:id="@+id/icon_setting_text"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:text="Launcher Icon"
        android:textColor="#FFFFFF"
        android:textSize="16sp" />

    <ImageView
        android:id="@+id/icon_setting_preview"
        android:layout_width="40dp"
        android:layout_height="40dp"
        android:src="@mipmap/ic_launcher_round"
        android:background="@drawable/bg_item_active"
        android:padding="2dp"
        android:clipToOutline="true"/>

</LinearLayout>
```

## File: app/src/main/res/layout/item_layout_option.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/layout_option_container"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal"
    android:padding="12dp"
    android:gravity="center_vertical"
    android:background="@drawable/bg_item_press">

    <EditText
        android:id="@+id/layout_name"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:text="Layout Name"
        android:textColor="#FFFFFF"
        android:textSize="16sp"
        android:background="@null"
        android:inputType="text"
        android:imeOptions="actionDone"
        android:singleLine="true"
        android:clickable="false"
        android:focusable="false"
        android:longClickable="false"
        android:focusableInTouchMode="false" />

    <ImageView
        android:id="@+id/btn_save_profile"
        android:layout_width="32dp"
        android:layout_height="32dp"
        android:padding="4dp"
        android:src="@android:drawable/ic_menu_save"
        android:tint="#00AAFF"
        android:background="?attr/selectableItemBackgroundBorderless"
        android:visibility="gone"
        android:clickable="true"
        android:focusable="true" />

    <ImageView
        android:id="@+id/btn_extinguish_item"
        android:layout_width="32dp"
        android:layout_height="32dp"
        android:padding="4dp"
        android:src="@android:drawable/ic_lock_power_off"
        android:tint="#FF5555"
        android:background="?attr/selectableItemBackgroundBorderless"
        android:visibility="gone"
        android:clickable="true"
        android:focusable="true" />

</LinearLayout>
```

## File: app/src/main/res/layout/item_profile_rich.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    android:padding="10dp"
    android:layout_marginBottom="4dp"
    android:background="@drawable/bg_item_press">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:gravity="center_vertical"
        android:layout_marginBottom="4dp">

        <EditText
            android:id="@+id/profile_name_text"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Profile Name"
            android:textColor="#FFFFFF"
            android:textStyle="bold"
            android:textSize="16sp"
            android:background="@null"
            android:singleLine="true"
            android:imeOptions="actionDone"
            android:padding="4dp"
            android:clickable="false"
            android:focusable="false"
            android:longClickable="false"
            android:focusableInTouchMode="false"/>

        <ImageView
            android:id="@+id/btn_save_profile_rich"
            android:layout_width="28dp"
            android:layout_height="28dp"
            android:src="@android:drawable/ic_menu_save"
            android:tint="#00A0E9"
            android:visibility="gone"/>
    </LinearLayout>

    <LinearLayout
        android:id="@+id/profile_icons_container"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:layout_marginBottom="4dp" />

    <TextView
        android:id="@+id/profile_details_text"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Details"
        android:textColor="#AAAAAA"
        android:textSize="12sp" />

</LinearLayout>
```

## File: app/src/main/res/layout/item_selected_app.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="48dp"
    android:layout_height="48dp"
    android:padding="4dp">

    <ImageView
        android:id="@+id/selected_app_icon"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:src="@mipmap/ic_launcher_round"
        android:background="@null"
        android:padding="2dp"
        android:clipToOutline="true"/>
</FrameLayout>
```

## File: app/src/main/res/layout/item_width_setting.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal"
    android:padding="8dp"
    android:gravity="center_vertical"
    android:background="@drawable/bg_item_press">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Width:"
        android:textColor="#FFFFFF"
        android:textSize="16sp"
        android:layout_marginEnd="8dp"/>

    <TextView
        android:id="@+id/text_width_value"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:text="90"
        android:textColor="#FFFFFF"
        android:textSize="18sp"/>

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="%"
        android:textColor="#888888"
        android:textSize="12sp"
        android:paddingEnd="8dp"/>

    <ImageView
        android:id="@+id/btn_width_minus"
        android:layout_width="40dp"
        android:layout_height="40dp"
        android:padding="10dp"
        android:src="@android:drawable/ic_input_delete"
        android:tint="#FF5555"
        android:background="?attr/selectableItemBackgroundBorderless"/>

    <ImageView
        android:id="@+id/btn_width_plus"
        android:layout_width="40dp"
        android:layout_height="40dp"
        android:padding="10dp"
        android:src="@android:drawable/ic_input_add"
        android:tint="#3DDC84"
        android:background="?attr/selectableItemBackgroundBorderless"/>

</LinearLayout>
```

## File: app/src/main/res/layout/layout_bubble.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="60dp"
    android:layout_height="60dp"
    android:background="@drawable/bg_bubble"
    android:filterTouchesWhenObscured="false"> 
    
    <ImageView
        android:id="@+id/bubble_icon"
        android:layout_width="40dp"
        android:layout_height="40dp"
        android:layout_gravity="center"
        android:src="@mipmap/ic_launcher_round" 
        android:clipToOutline="true"/>
</FrameLayout>
```

## File: app/src/main/res/layout/layout_rofi_drawer.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#80000000"
    android:clickable="true"
    android:focusable="true"
    android:filterTouchesWhenObscured="false">

    <LinearLayout
        android:id="@+id/drawer_container"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:orientation="vertical"
        android:padding="12dp"
        android:background="@drawable/bg_drawer"
        android:elevation="10dp"
        android:clickable="true"
        android:focusable="true"
        android:filterTouchesWhenObscured="false">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:gravity="center_vertical">

            <ImageView
                android:id="@+id/icon_search_mode"
                android:layout_width="32dp"
                android:layout_height="32dp"
                android:padding="6dp"
                android:src="@android:drawable/ic_menu_search"
                android:tint="#AAAAAA"
                android:background="@drawable/bg_item_press"
                android:tooltipText="App List"/>

            <EditText
                android:id="@+id/rofi_search_bar"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:background="@null"
                android:hint="Search apps..."
                android:textColor="#FFFFFF"
                android:textColorHint="#666666"
                android:paddingStart="8dp"
                android:paddingEnd="8dp"
                android:singleLine="true"
                android:textSize="16sp"
                android:imeOptions="actionDone"/>

            <ImageView
                android:id="@+id/icon_execute"
                android:layout_width="32dp"
                android:layout_height="32dp"
                android:padding="6dp"
                android:src="@android:drawable/ic_media_play"
                android:tint="#00FF00"
                android:background="@drawable/bg_item_press"
                android:tooltipText="Launch"/>

            <ImageView
                android:id="@+id/icon_mode_window"
                android:layout_width="32dp"
                android:layout_height="32dp"
                android:padding="6dp"
                android:src="@drawable/ic_window_split" 
                android:tint="#AAAAAA"
                android:background="@drawable/bg_item_press"
                android:tooltipText="Layouts"/>

            <ImageView
                android:id="@+id/icon_mode_resolution"
                android:layout_width="32dp"
                android:layout_height="32dp"
                android:padding="6dp"
                android:src="@drawable/ic_mode_resolution"
                android:tint="#AAAAAA"
                android:background="@drawable/bg_item_press"
                android:tooltipText="Resolution"/>

            <ImageView
                android:id="@+id/icon_mode_dpi"
                android:layout_width="32dp"
                android:layout_height="32dp"
                android:padding="6dp"
                android:src="@drawable/ic_mode_dpi"
                android:tint="#AAAAAA"
                android:background="@drawable/bg_item_press"
                android:tooltipText="DPI"/>

            <!-- BLACKLIST MODE ICON - START -->
            <!-- Icon for accessing blacklist management tab -->
            <ImageView
                android:id="@+id/icon_mode_blacklist"
                android:layout_width="32dp"
                android:layout_height="32dp"
                android:padding="6dp"
                android:src="@drawable/ic_block"
                android:tint="#AAAAAA"
                android:background="@drawable/bg_item_press"
                android:tooltipText="Blacklist"/>
            <!-- BLACKLIST MODE ICON - END -->

            <ImageView
                android:id="@+id/icon_mode_profiles"
                android:layout_width="32dp"
                android:layout_height="32dp"
                android:padding="6dp"
                android:src="@drawable/ic_mode_profiles"
                android:tint="#AAAAAA"
                android:background="@drawable/bg_item_press"
                android:tooltipText="Profiles"/>

            <ImageView
                android:id="@+id/icon_mode_settings"
                android:layout_width="32dp"
                android:layout_height="32dp"
                android:padding="6dp"
                android:src="@android:drawable/ic_menu_preferences"
                android:tint="#AAAAAA"
                android:background="@drawable/bg_item_press"
                android:tooltipText="Settings"/>
        </LinearLayout>

        <androidx.recyclerview.widget.RecyclerView
            android:id="@+id/selected_apps_recycler"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:minHeight="50dp"
            android:paddingTop="4dp"
            android:paddingBottom="4dp"
            android:visibility="gone"/>

        <View
            android:layout_width="match_parent"
            android:layout_height="1dp"
            android:layout_marginTop="4dp"
            android:layout_marginBottom="8dp"
            android:background="#444444" />

        <androidx.recyclerview.widget.RecyclerView
            android:id="@+id/rofi_recycler_view"
            android:layout_width="match_parent"
            android:layout_height="0dp"
            android:layout_weight="1"
            android:scrollbars="vertical" />

    </LinearLayout>
</FrameLayout>
```

## File: app/src/main/res/layout/list_item_app.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="horizontal"
    android:padding="12dp"
    android:gravity="center_vertical"
    android:background="?attr/selectableItemBackground">

    <ImageView
        android:id="@+id/icon_star"
        android:layout_width="24dp"
        android:layout_height="24dp"
        android:src="@drawable/ic_star_border"
        android:layout_marginEnd="16dp"
        android:contentDescription="Favorite Star"
        android:tint="#FFFFFF" />

    <TextView
        android:id="@+id/app_name_text"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:textSize="18sp"
        android:textColor="#FFFFFF"
        android:text="App Name" />

</LinearLayout>
```

## File: app/src/main/res/mipmap-anydpi-v26/ic_bubble_icon.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<adaptive-icon xmlns:android="http://schemas.android.com/apk/res/android">
    <background android:drawable="@color/black" />
    <foreground android:drawable="@drawable/ic_scaler_bubble" />
</adaptive-icon>
```

## File: app/src/main/res/mipmap-anydpi-v26/ic_bubble.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<adaptive-icon xmlns:android="http://schemas.android.com/apk/res/android">
    <background android:drawable="@color/black" />
    <foreground android:drawable="@drawable/scaler_bubble" />
</adaptive-icon>
```

## File: app/src/main/res/mipmap-anydpi-v26/ic_cover_tiny.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<adaptive-icon xmlns:android="http://schemas.android.com/apk/res/android">
    <background android:drawable="@color/black" />
    <foreground android:drawable="@drawable/ic_scaler_cover_tiny" />
</adaptive-icon>
```

## File: app/src/main/res/mipmap-anydpi-v26/ic_cover_v2.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<adaptive-icon xmlns:android="http://schemas.android.com/apk/res/android">
    <background android:drawable="@color/black" />
    <foreground android:drawable="@drawable/scaler_cover" />
</adaptive-icon>
```

## File: app/src/main/res/mipmap-anydpi-v26/ic_launcher_adaptive.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<adaptive-icon xmlns:android="http://schemas.android.com/apk/res/android">
    <background android:drawable="@android:color/black" />
    <foreground android:drawable="@drawable/ic_launcher_foreground_scaled" />
</adaptive-icon>
```

## File: app/src/main/res/mipmap-anydpi-v26/ic_launcher_cover_final.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<adaptive-icon xmlns:android="http://schemas.android.com/apk/res/android">
    <background android:drawable="@color/black" />
    <foreground android:drawable="@drawable/ic_scaler_cover_final" />
</adaptive-icon>
```

## File: app/src/main/res/mipmap-anydpi-v26/ic_launcher_round.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<adaptive-icon xmlns:android="http://schemas.android.com/apk/res/android">
    <background android:drawable="@color/black" />
    <foreground android:drawable="@drawable/ic_wolf_cover" />
</adaptive-icon>
```

## File: app/src/main/res/mipmap-anydpi-v26/ic_launcher.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<adaptive-icon xmlns:android="http://schemas.android.com/apk/res/android">
    <background android:drawable="@color/black" />
    <foreground android:drawable="@drawable/ic_wolf_main" />
</adaptive-icon>
```

## File: app/src/main/res/values/colors.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="black">#FF000000</color>
    <color name="white">#FFFFFFFF</color>
</resources>
```

## File: app/src/main/res/values/strings.xml
```xml
<resources>
    <string name="app_name">DroidOS Launcher</string>
    <string name="accessibility_service_description">DroidOS Launcher Service</string>
</resources>
```

## File: app/src/main/res/values/themes.xml
```xml
<resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="Base.Theme.QuadrantLauncher" parent="Theme.Material3.DayNight.NoActionBar">
        <!-- Customize your light theme here. -->
        <!-- <item name="colorPrimary">@color/my_light_primary</item> -->
    </style>

    <style name="Theme.QuadrantLauncher" parent="Base.Theme.QuadrantLauncher" />
</resources>
```

## File: app/src/main/res/values-night/themes.xml
```xml
<resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="Base.Theme.QuadrantLauncher" parent="Theme.Material3.DayNight.NoActionBar">
        <!-- Customize your dark theme here. -->
        <!-- <item name="colorPrimary">@color/my_dark_primary</item> -->
    </style>
</resources>
```

## File: app/src/main/res/xml/accessibility_service_config.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<accessibility-service xmlns:android="http://schemas.android.com/apk/res/android"
    android:description="@string/accessibility_service_description"
    android:accessibilityEventTypes="typeAllMask"
    android:accessibilityFeedbackType="feedbackGeneric"
    android:notificationTimeout="100"
    android:canRetrieveWindowContent="true"
    android:canPerformGestures="true" 
    android:canRequestFilterKeyEvents="true" 
    android:accessibilityFlags="flagRequestTouchExplorationMode|flagRequestFilterKeyEvents|flagRetrieveInteractiveWindows" />
```

## File: app/src/main/res/xml/backup_rules.xml
```xml
<?xml version="1.0" encoding="utf-8"?><!--
   Sample backup rules file; uncomment and customize as necessary.
   See https://developer.android.com/guide/topics/data/autobackup
   for details.
   Note: This file is ignored for devices older than API 31
   See https://developer.android.com/about/versions/12/backup-restore
-->
<full-backup-content>
    <!--
   <include domain="sharedpref" path="."/>
   <exclude domain="sharedpref" path="device.xml"/>
-->
</full-backup-content>
```

## File: app/src/main/res/xml/data_extraction_rules.xml
```xml
<?xml version="1.0" encoding="utf-8"?><!--
   Sample data extraction rules file; uncomment and customize as necessary.
   See https://developer.android.com/about/versions/12/backup-restore#xml-changes
   for details.
-->
<data-extraction-rules>
    <cloud-backup>
        <!-- TODO: Use <include> and <exclude> to control what is backed up.
        <include .../>
        <exclude .../>
        -->
    </cloud-backup>
    <!--
    <device-transfer>
        <include .../>
        <exclude .../>
    </device-transfer>
    -->
</data-extraction-rules>
```

## File: app/src/main/AndroidManifest.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">

    <uses-permission android:name="android.permission.QUERY_ALL_PACKAGES" />
    <uses-permission android:name="android.permission.SYSTEM_ALERT_WINDOW" />
    <uses-permission android:name="android.permission.FOREGROUND_SERVICE" />
    <uses-permission android:name="android.permission.FOREGROUND_SERVICE_SPECIAL_USE" />
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />

    <queries>
        <package android:name="moe.shizuku.privileged.api" />
        <package android:name="rikka.shizuku.ui" />
    </queries>

    <application
        android:allowBackup="true"
        android:dataExtractionRules="@xml/data_extraction_rules"
        android:icon="@mipmap/ic_launcher_adaptive"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_adaptive"
        android:supportsRtl="true"
        android:theme="@style/Theme.QuadrantLauncher"
        tools:targetApi="31">

        <provider
            android:name="rikka.shizuku.ShizukuProvider"
            android:authorities="${applicationId}.shizuku"
            android:enabled="true"
            android:exported="true"
            android:multiprocess="false" />

        <activity
            android:name=".MainActivity"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        
        <activity android:name=".IconPickerActivity" 
                  android:theme="@android:style/Theme.Translucent.NoTitleBar"
                  android:exported="false" />

        <service
            android:name=".FloatingLauncherService"
            android:enabled="true"
            android:exported="true"
            android:label="@string/app_name"
            android:permission="android.permission.BIND_ACCESSIBILITY_SERVICE">
            <intent-filter>
                <action android:name="android.accessibilityservice.AccessibilityService" />
            </intent-filter>
            <meta-data
                android:name="android.accessibilityservice"
                android:resource="@xml/accessibility_service_config" />
        </service>

        <activity android:name=".SplitActivity" android:exported="false" />

        <activity
            android:name=".PermissionActivity"
            android:theme="@android:style/Theme.NoTitleBar"
            android:screenOrientation="portrait" />

    </application>
</manifest>
```

## File: app/.gitignore
```
/build
```

## File: app/build.gradle.kts
```
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.quadrantlauncher"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.katsuyamaki.DroidOSLauncher"
        minSdk = 30
        targetSdk = 34
        versionCode = 3
        versionName = "2.1"

        multiDexEnabled = true
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
        buildConfig = true
        aidl = true
    }

    sourceSets {
        getByName("main") {
            aidl.srcDirs(listOf("src/main/aidl"))
            java.srcDirs(layout.buildDirectory.dir("generated/source/aidl/debug"))
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    
    implementation("dev.rikka.shizuku:api:13.1.5")
    implementation("dev.rikka.shizuku:provider:13.1.5")
    implementation("dev.rikka.shizuku:aidl:13.1.5")
}
```

## File: app/proguard-rules.pro
```
-keep class com.example.quadrantlauncher.ShellUserService { *; }
-keep class com.example.quadrantlauncher.IShellService { *; }
-keep interface com.example.quadrantlauncher.IShellService { *; }
```

## File: gradle/wrapper/gradle-wrapper.properties
```
#Fri Nov 14 06:51:56 EST 2025
distributionBase=GRADLE_USER_HOME
distributionPath=wrapper/dists
distributionUrl=https\://services.gradle.org/distributions/gradle-8.13-bin.zip
networkTimeout=10000
validateDistributionUrl=true
zipStoreBase=GRADLE_USER_HOME
zipStorePath=wrapper/dists
```

## File: gradle/libs.versions.toml
```toml
[versions]
agp = "8.13.1"
kotlin = "2.0.21"
coreKtx = "1.10.1"
junit = "4.13.2"
junitVersion = "1.1.5"
espressoCore = "3.5.1"
appcompat = "1.6.1"
material = "1.10.0"
activity = "1.8.0"
constraintlayout = "2.1.4"

[libraries]
androidx-core-ktx = { group = "androidx.core", name = "core-ktx", version.ref = "coreKtx" }
junit = { group = "junit", name = "junit", version.ref = "junit" }
androidx-junit = { group = "androidx.test.ext", name = "junit", version.ref = "junitVersion" }
androidx-espresso-core = { group = "androidx.test.espresso", name = "espresso-core", version.ref = "espressoCore" }
androidx-appcompat = { group = "androidx.appcompat", name = "appcompat", version.ref = "appcompat" }
material = { group = "com.google.android.material", name = "material", version.ref = "material" }
androidx-activity = { group = "androidx.activity", name = "activity", version.ref = "activity" }
androidx-constraintlayout = { group = "androidx.constraintlayout", name = "constraintlayout", version.ref = "constraintlayout" }

[plugins]
android-application = { id = "com.android.application", version.ref = "agp" }
kotlin-android = { id = "org.jetbrains.kotlin.android", version.ref = "kotlin" }
```

## File: .gitignore
```
*.iml
.gradle
/local.properties
/.idea/caches
/.idea/libraries
/.idea/modules.xml
/.idea/workspace.xml
/.idea/navEditor.xml
/.idea/assetWizardSettings.xml
.DS_Store
/build
/captures
.externalNativeBuild
.cxx
local.properties
*.iml
.gradle
/local.properties
/.idea
.DS_Store
/build
/captures
.externalNativeBuild
.cxx
```

## File: build.gradle.kts
```
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}
```

## File: gradle.properties
```
org.gradle.jvmargs=-Xmx2048m -Dfile.encoding=UTF-8
android.useAndroidX=true
android.aapt2FromMavenOverride=/data/data/com.termux/files/usr/bin/aapt2
```

## File: gradlew
```
#!/bin/sh

#
# Copyright © 2015 the original authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
# SPDX-License-Identifier: Apache-2.0
#

##############################################################################
#
#   Gradle start up script for POSIX generated by Gradle.
#
#   Important for running:
#
#   (1) You need a POSIX-compliant shell to run this script. If your /bin/sh is
#       noncompliant, but you have some other compliant shell such as ksh or
#       bash, then to run this script, type that shell name before the whole
#       command line, like:
#
#           ksh Gradle
#
#       Busybox and similar reduced shells will NOT work, because this script
#       requires all of these POSIX shell features:
#         * functions;
#         * expansions «$var», «${var}», «${var:-default}», «${var+SET}»,
#           «${var#prefix}», «${var%suffix}», and «$( cmd )»;
#         * compound commands having a testable exit status, especially «case»;
#         * various built-in commands including «command», «set», and «ulimit».
#
#   Important for patching:
#
#   (2) This script targets any POSIX shell, so it avoids extensions provided
#       by Bash, Ksh, etc; in particular arrays are avoided.
#
#       The "traditional" practice of packing multiple parameters into a
#       space-separated string is a well documented source of bugs and security
#       problems, so this is (mostly) avoided, by progressively accumulating
#       options in "$@", and eventually passing that to Java.
#
#       Where the inherited environment variables (DEFAULT_JVM_OPTS, JAVA_OPTS,
#       and GRADLE_OPTS) rely on word-splitting, this is performed explicitly;
#       see the in-line comments for details.
#
#       There are tweaks for specific operating systems such as AIX, CygWin,
#       Darwin, MinGW, and NonStop.
#
#   (3) This script is generated from the Groovy template
#       https://github.com/gradle/gradle/blob/HEAD/platforms/jvm/plugins-application/src/main/resources/org/gradle/api/internal/plugins/unixStartScript.txt
#       within the Gradle project.
#
#       You can find Gradle at https://github.com/gradle/gradle/.
#
##############################################################################

# Attempt to set APP_HOME

# Resolve links: $0 may be a link
app_path=$0

# Need this for daisy-chained symlinks.
while
    APP_HOME=${app_path%"${app_path##*/}"}  # leaves a trailing /; empty if no leading path
    [ -h "$app_path" ]
do
    ls=$( ls -ld "$app_path" )
    link=${ls#*' -> '}
    case $link in             #(
      /*)   app_path=$link ;; #(
      *)    app_path=$APP_HOME$link ;;
    esac
done

# This is normally unused
# shellcheck disable=SC2034
APP_BASE_NAME=${0##*/}
# Discard cd standard output in case $CDPATH is set (https://github.com/gradle/gradle/issues/25036)
APP_HOME=$( cd -P "${APP_HOME:-./}" > /dev/null && printf '%s\n' "$PWD" ) || exit

# Use the maximum available, or set MAX_FD != -1 to use that value.
MAX_FD=maximum

warn () {
    echo "$*"
} >&2

die () {
    echo
    echo "$*"
    echo
    exit 1
} >&2

# OS specific support (must be 'true' or 'false').
cygwin=false
msys=false
darwin=false
nonstop=false
case "$( uname )" in                #(
  CYGWIN* )         cygwin=true  ;; #(
  Darwin* )         darwin=true  ;; #(
  MSYS* | MINGW* )  msys=true    ;; #(
  NONSTOP* )        nonstop=true ;;
esac

CLASSPATH="\\\"\\\""


# Determine the Java command to use to start the JVM.
if [ -n "$JAVA_HOME" ] ; then
    if [ -x "$JAVA_HOME/jre/sh/java" ] ; then
        # IBM's JDK on AIX uses strange locations for the executables
        JAVACMD=$JAVA_HOME/jre/sh/java
    else
        JAVACMD=$JAVA_HOME/bin/java
    fi
    if [ ! -x "$JAVACMD" ] ; then
        die "ERROR: JAVA_HOME is set to an invalid directory: $JAVA_HOME

Please set the JAVA_HOME variable in your environment to match the
location of your Java installation."
    fi
else
    JAVACMD=java
    if ! command -v java >/dev/null 2>&1
    then
        die "ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.

Please set the JAVA_HOME variable in your environment to match the
location of your Java installation."
    fi
fi

# Increase the maximum file descriptors if we can.
if ! "$cygwin" && ! "$darwin" && ! "$nonstop" ; then
    case $MAX_FD in #(
      max*)
        # In POSIX sh, ulimit -H is undefined. That's why the result is checked to see if it worked.
        # shellcheck disable=SC2039,SC3045
        MAX_FD=$( ulimit -H -n ) ||
            warn "Could not query maximum file descriptor limit"
    esac
    case $MAX_FD in  #(
      '' | soft) :;; #(
      *)
        # In POSIX sh, ulimit -n is undefined. That's why the result is checked to see if it worked.
        # shellcheck disable=SC2039,SC3045
        ulimit -n "$MAX_FD" ||
            warn "Could not set maximum file descriptor limit to $MAX_FD"
    esac
fi

# Collect all arguments for the java command, stacking in reverse order:
#   * args from the command line
#   * the main class name
#   * -classpath
#   * -D...appname settings
#   * --module-path (only if needed)
#   * DEFAULT_JVM_OPTS, JAVA_OPTS, and GRADLE_OPTS environment variables.

# For Cygwin or MSYS, switch paths to Windows format before running java
if "$cygwin" || "$msys" ; then
    APP_HOME=$( cygpath --path --mixed "$APP_HOME" )
    CLASSPATH=$( cygpath --path --mixed "$CLASSPATH" )

    JAVACMD=$( cygpath --unix "$JAVACMD" )

    # Now convert the arguments - kludge to limit ourselves to /bin/sh
    for arg do
        if
            case $arg in                                #(
              -*)   false ;;                            # don't mess with options #(
              /?*)  t=${arg#/} t=/${t%%/*}              # looks like a POSIX filepath
                    [ -e "$t" ] ;;                      #(
              *)    false ;;
            esac
        then
            arg=$( cygpath --path --ignore --mixed "$arg" )
        fi
        # Roll the args list around exactly as many times as the number of
        # args, so each arg winds up back in the position where it started, but
        # possibly modified.
        #
        # NB: a `for` loop captures its iteration list before it begins, so
        # changing the positional parameters here affects neither the number of
        # iterations, nor the values presented in `arg`.
        shift                   # remove old arg
        set -- "$@" "$arg"      # push replacement arg
    done
fi


# Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
DEFAULT_JVM_OPTS='"-Xmx64m" "-Xms64m"'

# Collect all arguments for the java command:
#   * DEFAULT_JVM_OPTS, JAVA_OPTS, and optsEnvironmentVar are not allowed to contain shell fragments,
#     and any embedded shellness will be escaped.
#   * For example: A user cannot expect ${Hostname} to be expanded, as it is an environment variable and will be
#     treated as '${Hostname}' itself on the command line.

set -- \
        "-Dorg.gradle.appname=$APP_BASE_NAME" \
        -classpath "$CLASSPATH" \
        -jar "$APP_HOME/gradle/wrapper/gradle-wrapper.jar" \
        "$@"

# Stop when "xargs" is not available.
if ! command -v xargs >/dev/null 2>&1
then
    die "xargs is not available"
fi

# Use "xargs" to parse quoted args.
#
# With -n1 it outputs one arg per line, with the quotes and backslashes removed.
#
# In Bash we could simply go:
#
#   readarray ARGS < <( xargs -n1 <<<"$var" ) &&
#   set -- "${ARGS[@]}" "$@"
#
# but POSIX shell has neither arrays nor command substitution, so instead we
# post-process each arg (as a line of input to sed) to backslash-escape any
# character that might be a shell metacharacter, then use eval to reverse
# that process (while maintaining the separation between arguments), and wrap
# the whole thing up as a single "set" statement.
#
# This will of course break if any of these variables contains a newline or
# an unmatched quote.
#

eval "set -- $(
        printf '%s\n' "$DEFAULT_JVM_OPTS $JAVA_OPTS $GRADLE_OPTS" |
        xargs -n1 |
        sed ' s~[^-[:alnum:]+,./:=@_]~\\&~g; ' |
        tr '\n' ' '
    )" '"$@"'

exec "$JAVACMD" "$@"
```

## File: gradlew.bat
```
@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem
@rem SPDX-License-Identifier: Apache-2.0
@rem

@if "%DEBUG%"=="" @echo off
@rem ##########################################################################
@rem
@rem  Gradle startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%"=="" set DIRNAME=.
@rem This is normally unused
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and GRADLE_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS="-Xmx64m" "-Xms64m"

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if %ERRORLEVEL% equ 0 goto execute

echo. 1>&2
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH. 1>&2
echo. 1>&2
echo Please set the JAVA_HOME variable in your environment to match the 1>&2
echo location of your Java installation. 1>&2

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo. 1>&2
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME% 1>&2
echo. 1>&2
echo Please set the JAVA_HOME variable in your environment to match the 1>&2
echo location of your Java installation. 1>&2

goto fail

:execute
@rem Setup the command line

set CLASSPATH=


@rem Execute Gradle
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %GRADLE_OPTS% "-Dorg.gradle.appname=%APP_BASE_NAME%" -classpath "%CLASSPATH%" -jar "%APP_HOME%\gradle\wrapper\gradle-wrapper.jar" %*

:end
@rem End local scope for the variables with windows NT shell
if %ERRORLEVEL% equ 0 goto mainEnd

:fail
rem Set variable GRADLE_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
set EXIT_CODE=%ERRORLEVEL%
if %EXIT_CODE% equ 0 set EXIT_CODE=1
if not ""=="%GRADLE_EXIT_CONSOLE%" exit %EXIT_CODE%
exit /b %EXIT_CODE%

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
```

## File: multidex-keep.txt
```
rikka/shizuku/
```

## File: README.md
```markdown
# CoverScreen Launcher & Tiling Manager

![Kotlin](https://img.shields.io/badge/Kotlin-2.0-blue.svg) ![Platform](https://img.shields.io/badge/Platform-Android%2014%2B-green.svg) ![Status](https://img.shields.io/badge/Status-Experimental-orange.svg)

**CoverScreen Launcher** is an advanced window manager and app launcher designed primarily for Samsung Galaxy Z Flip devices (and other foldables/external displays). 

It bypasses system restrictions to launch **any** application on the Cover Screen and provides desktop-like window tiling capabilities (Quadrants, Split Screen) that the stock OS does not support. It is also optimized for **AR Glasses** (XREAL, Rokid, Viture) by allowing the phone screen to be turned off while keeping the system running.

## 🚀 Key Features

### 🔓 Unrestricted Launching
- Bypasses the "Good Lock" / System Allowlist restriction.
- Launches *any* installed application directly on the Cover Screen (Display 1) using ADB Shell commands via Shizuku.

### 🔲 Advanced Window Tiling
Android's native split-screen on cover screens is limited. This app forces windows into specific geometries:
- **2 Apps (Side-by-Side):** Perfect vertical split.
- **2 Apps (Top-Bottom):** Horizontal split.
- **3 Apps (Tri-Split):** Evenly divided vertical columns.
- **4 Apps (Quadrant):** A 2x2 grid for maximum multitasking.

### 🕶️ AR Glasses Mode ("Extinguish")
Designed for users of AR Glasses who use the phone as a computing unit/trackpad:
- **Screen Off, System On:** Turns off the physical display panel (to save battery and heat) without putting the CPU to sleep.
- **Targeted Control:** Can target specific displays (Main vs. Cover).
- **Trackpad Support:** Integrated toggle to reset/launch a specific Trackpad application when executing layouts.

### 💾 Profiles
- Save your favorite app combinations and layout configurations.
- Quickly load specific workspaces (e.g., "Work" with Docs/Chrome, "Social" with Discord/Reddit).

---

## 🛠️ Prerequisites

This app requires **Shizuku** to function, as it relies on elevated Shell permissions to manage windows and power states.

1.  **Shizuku:** Must be installed and running. [Download Shizuku](https://play.google.com/store/apps/details?id=moe.shizuku.privileged.api)
2.  **Developer Options Enabled:**
    * `Settings > About Phone > Software Information > Tap "Build Number" 7 times`.
3.  **Freeform Windows Enabled:**
    * In Developer Options, enable: **"Force activities to be resizable"**.
    * In Developer Options, enable: **"Enable freeform windows"**.
    * *Recommended:* Reboot device after changing these settings.

---

## ⚙️ How It Works (Technical)

Standard Android APIs (`startActivity`) are blocked by Samsung on the Cover Screen for unapproved apps. This project uses a hybrid approach:

1.  **The Shotgun Launch:**
    * It attempts a standard API launch (for reliability on the main screen).
    * Simultaneously, it executes an `am start` shell command via Shizuku to force the activity onto `Display 1` (Cover Screen).

2.  **Post-Launch Resize (The "Magic" Fix):**
    * Android 14+ removed the ability to set window bounds during the launch command.
    * This app launches the app first, then scans the system using `dumpsys activity activities` to find the specific **Task ID** of the new window.
    * It then issues an `am task resize [taskId] [rect]` command to snap the window into the desired tile position.

3.  **Extinguish Mode:**
    * Uses Java Reflection to access the hidden `SurfaceControl` or `DisplayControl` system APIs.
    * Calls `setDisplayPowerMode(token, 0)` to cut power to the display panel hardware while leaving the OS active.

---

## 📥 Installation

1.  Clone the repo or download the latest APK (check Releases).
2.  Install the APK on your Samsung Z Flip.
3.  Open **Shizuku** and start the service (via Wireless Debugging or Root).
4.  Open **CoverScreen Launcher** and grant Shizuku permission when prompted.
5.  Grant "Overlay Permission" if prompted (required for the floating menu).

---

## 🎮 Usage

1.  **Open the Menu:** Click the floating bubble to open the launcher drawer.
2.  **Select Apps:** Use the search bar to find apps. Click them to add to the launch queue.
3.  **Choose Layout:** Click the "Window" icon and select a layout (e.g., 4-Quadrant).
4.  **Launch:** Click the Green Play button.
    * *Note:* The app will cycle through your selected apps, launching them and then resizing them into position.
5.  **Extinguish (AR Mode):**
    * Go to Settings (Gear Icon).
    * Toggle "Target: Cover Screen".
    * Click the **Power Off** icon next to the toggle.
    * *To Wake:* Press Volume Up or the physical Power button.

---

## 🤝 Contributing

Pull requests are welcome!
* **Architecture:** Kotlin, Android Service, AIDL (for Shizuku IPC).
* **Key Files:** `FloatingLauncherService.kt` (Logic), `ShellUserService.kt` (Shizuku Commands).

## 📄 License

[MIT License](LICENSE)
```

## File: settings.gradle.kts
```
pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
// ... (pluginManagement block is fine)
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://www.jitpack.io") }
        maven { url = uri("https://maven.rikka.dev/versioned") }
    }
}
rootProject.name = "CoverScreenLauncher"
include(":app")

// DELETE ALL LINES BELOW THIS ONE
```
