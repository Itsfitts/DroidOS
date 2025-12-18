# Changelog

## [v3.0] - DroidOS Trackpad (2025-12-18)
### Major Features
- **Hardkey Mapping:** Map Volume Up/Down keys to actions (Click, Scroll, Toggle UI) with Single Tap, Double Tap, and Hold gestures.
- **Profile Management:** Save and load specific layout/scaling profiles for different scenarios (e.g., Cover Screen vs. AR Glasses).
- **Bubble Customization:**
  - Adjust Floating Bubble size (50% - 200%).
  - Change Opacity.
  - Cycle through different icon styles.
- **Smart Keyboard Overlay:**
  - "Block Soft Keyboard" mode to prevent system keyboard from taking over the cover screen.
  - Adjustable Scale and Opacity.
  - Auto-hide logic when switching modes.
- **Screen Off Modes:**
  - **Standard:** Uses SurfaceControl (Root-like behavior via Shizuku).
  - **Alternate:** Uses Brightness Extinguish (-1) for devices where SurfaceControl freezes the display.
- **UI & UX:**
  - **Anchor Mode:** Lock the trackpad position to prevent accidental drags.
  - **Z-Order Enforcement:** Ensures trackpad remains visible over other system overlays.
  - **Manual Tune:** D-Pad interface for pixel-perfect window positioning.

## [v2.1] - DroidOS Launcher
### Updates
- **Compatibility:** Updated Intent targeting to match Trackpad v3.0 package ID.
- **Stability:** improved `setBrightness` handling for Alternate Screen Off mode.

---

## [v2.0] - Initial Monorepo Structure
- Split project into Launcher and Trackpad applications.
- Added Shizuku integration for non-root shell execution.