#!/bin/bash
cd Cover-Screen-Launcher
./gradlew clean assembleDebug
adb install -r app/build/outputs/apk/debug/app-debug.apk
