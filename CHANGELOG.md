# Changelog

## [2.1] - 2025-12-05

### Fixed
- **Overflow App Management**: Restored `repositionTask` functionality in `ShellUserService`. This allows the launcher to correctly resize and position "overflow" apps into freeform windows using shell commands (`am task resize`).
- **App Minimization & Stability**: Resolved critical compilation errors in `ShellUserService.kt` that prevented the shell service from running.
    - Restored `execShellCommand` for system-level operations.
    - Fixed `getAllPhysicalDisplayTokens` reflection logic for Android 14.
- **Display Control**: Fixed `setBrightness` and `setScreenOff` implementations to correctly target the Cover Screen (Display 1) without crashing the main interface.
