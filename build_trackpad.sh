#!/bin/bash
cd Cover-Screen-Trackpad
./gradlew clean assembleDebug
adb install -r app/build/outputs/apk/debug/app-debug.apk
