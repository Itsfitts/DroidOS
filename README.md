# DroidOS - Cover Screen Tools (Monorepo)

A suite of Android tools designed to maximize the utility of cover screens (like on the Galaxy Z Flip) and AR Glasses (like XREAL/Rokid) by providing desktop-class window management and input control.

## 🚀 Applications

### 1. DroidOS Launcher (`/Cover-Screen-Launcher`)
A tiling window manager and app launcher.
* **Features:**
    * **Instant Mode:** Live window resizing and repositioning.
    * **Presets:** Split-screen, Tri-split, Quadrants, and custom saved layouts.
    * **Virtual Display Support:** Create and manage secondary virtual displays (1080p) for AR glasses.
    * **Screen Off/Headless:** Turn off the physical screen while keeping touch active (saves battery while using AR glasses).

### 2. DroidOS Trackpad (`/Cover-Screen-Trackpad`)
Turns your phone into a precision trackpad and keyboard combo.
* **Features (v3.0):**
    * **Mouse Injection:** Control a remote cursor on a secondary display/AR glasses.
    * **Hardkey Mapping:** Use Volume keys for clicking, scrolling, or toggling UI.
    * **Custom Keyboard:** A floating, transparent keyboard overlay that bypasses cover screen input restrictions.
    * **Profiles:** Save layouts for different hardware configurations.
    * **Shizuku Powered:** Requires no root, but needs Shizuku for input injection.

## 🛠️ Installation & Setup

1.  **Install Shizuku:** Download from Play Store and start the service (Root or Wireless Debugging).
2.  **Install APKs:** Build and install both `Launcher` and `Trackpad` APKs.
3.  **Permissions:**
    * Grant **Accessibility Service** (for global overlay and key interception).
    * Grant **Display over other apps**.
    * Allow **Restricted Settings** if prompted by Android 13+.

## 🎮 Usage Guide (v3.0)

**Trackpad Controls:**
* **Move:** Drag anywhere in the empty space.
* **Scroll:** Drag along the Right edge (Vertical) or Bottom edge (Horizontal).
* **Menu:** Tap the floating Bubble icon.
* **Keyboard:** Toggle via the Menu or mapped Volume key.

**Hardkey Defaults:**
* **Vol Up (Tap):** Left Click
* **Vol Down (Tap):** Toggle Keyboard
* **Vol Down (Hold):** Back Action

## 📜 License
GNU General Public License v3.0