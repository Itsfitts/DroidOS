~/projects/DroidOS main* ⇡
❯ adb logcat -c && adb logcat OverlayService:W *:S
--------- beginning of main
01-10 20:42:25.337 15614 15614 W OverlayService: ╔══════════════════════════════════════════════════════════╗
01-10 20:42:25.337 15614 15614 W OverlayService: ║ KEYBOARD LOGIC START - setupUI(1)              ║
01-10 20:42:25.337 15614 15614 W OverlayService: ╚══════════════════════════════════════════════════════════╝
01-10 20:42:25.338 15614 15614 W OverlayService: ├─ PRE-STATE:
01-10 20:42:25.338 15614 15614 W OverlayService: │  ├─ displayId: 1
01-10 20:42:25.338 15614 15614 W OverlayService: │  ├─ currentDisplayId: 1
01-10 20:42:25.338 15614 15614 W OverlayService: │  ├─ prefBlockSoftKeyboard: false
01-10 20:42:25.338 15614 15614 W OverlayService: │  ├─ current IME: com.katsuyamaki.DroidOSTrackpadKeyboard/com.example.coverscreentester.NullInputMethodService
01-10 20:42:25.338 15614 15614 W OverlayService: │  └─ showMode: 0
01-10 20:42:25.338 15614 15614 W OverlayService: ├─ ACTION: COVER SCREEN - Checking if blocking needed
01-10 20:42:25.338 15614 15614 W OverlayService: │  └─ Blocking NOT enabled, skipping
01-10 20:42:25.338 15614 15614 W OverlayService: └─ KEYBOARD LOGIC END
01-10 20:42:25.368 15614 15614 W OverlayService: ╔══════════════════════════════════════════════════════════╗
01-10 20:42:25.368 15614 15614 W OverlayService: ║ KEYBOARD LOGIC START - setupUI(1)              ║
01-10 20:42:25.368 15614 15614 W OverlayService: ╚══════════════════════════════════════════════════════════╝
01-10 20:42:25.369 15614 15614 W OverlayService: ├─ PRE-STATE:
01-10 20:42:25.369 15614 15614 W OverlayService: │  ├─ displayId: 1
01-10 20:42:25.369 15614 15614 W OverlayService: │  ├─ currentDisplayId: 1
01-10 20:42:25.369 15614 15614 W OverlayService: │  ├─ prefBlockSoftKeyboard: false
01-10 20:42:25.369 15614 15614 W OverlayService: │  ├─ current IME: com.katsuyamaki.DroidOSTrackpadKeyboard/com.example.coverscreentester.NullInputMethodService
01-10 20:42:25.369 15614 15614 W OverlayService: │  └─ showMode: 0
01-10 20:42:25.369 15614 15614 W OverlayService: ├─ ACTION: COVER SCREEN - Checking if blocking needed
01-10 20:42:25.369 15614 15614 W OverlayService: │  └─ Blocking NOT enabled, skipping
01-10 20:42:25.369 15614 15614 W OverlayService: └─ KEYBOARD LOGIC END
01-10 20:42:25.414 15614 15614 W OverlayService: ╔══════════════════════════════════════════════════════════╗
01-10 20:42:25.414 15614 15614 W OverlayService: ║ KEYBOARD LOGIC START - setupUI(1)              ║
01-10 20:42:25.414 15614 15614 W OverlayService: ╚══════════════════════════════════════════════════════════╝
01-10 20:42:25.414 15614 15614 W OverlayService: ├─ PRE-STATE:
01-10 20:42:25.414 15614 15614 W OverlayService: │  ├─ displayId: 1
01-10 20:42:25.414 15614 15614 W OverlayService: │  ├─ currentDisplayId: 1
01-10 20:42:25.414 15614 15614 W OverlayService: │  ├─ prefBlockSoftKeyboard: false
01-10 20:42:25.414 15614 15614 W OverlayService: │  ├─ current IME: com.katsuyamaki.DroidOSTrackpadKeyboard/com.example.coverscreentester.NullInputMethodService
01-10 20:42:25.414 15614 15614 W OverlayService: │  └─ showMode: 0
01-10 20:42:25.414 15614 15614 W OverlayService: ├─ ACTION: COVER SCREEN - Checking if blocking needed
01-10 20:42:25.414 15614 15614 W OverlayService: │  └─ Blocking NOT enabled, skipping
01-10 20:42:25.414 15614 15614 W OverlayService: └─ KEYBOARD LOGIC END
01-10 20:42:30.602 15614 28362 W OverlayService: ┌──────────────────────────────────────────────────────────┐
01-10 20:42:30.602 15614 28362 W OverlayService: │ KEYBOARD RESTORATION - SAMSUNG WORKAROUND               │
01-10 20:42:30.602 15614 28362 W OverlayService: └──────────────────────────────────────────────────────────┘
01-10 20:42:30.657 15614 28362 W OverlayService: ├─ Initial IME: com.samsung.android.honeyboard/.service.HoneyBoardService
01-10 20:42:30.657 15614 28362 W OverlayService: ├─ Saved preference: juloo.keyboard2/.Keyboard2
01-10 20:42:30.734 15614 28362 W OverlayService: ├─ Gboard ID: com.google.android.inputmethod.latin/com.android.inputmethod.latin.LatinIME
01-10 20:42:30.735 15614 28362 W OverlayService: ├─ Samsung ID: com.samsung.android.honeyboard/.service.HoneyBoardService
01-10 20:42:30.735 15614 28362 W OverlayService: ├─ Target IME: juloo.keyboard2/.Keyboard2
01-10 20:42:30.735 15614 28362 W OverlayService: ├─ WORKAROUND: Temporarily disabling Samsung Keyboard...
01-10 20:42:30.813 15614 28362 W OverlayService: │  ├─ Disable result: Input method com.samsung.android.honeyboard/.service.HoneyBoardService: now disabled for user #0
01-10 20:42:31.002 15614 28362 W OverlayService: │  ├─ Set Gboard result: Input method juloo.keyboard2/.Keyboard2 selected for user #0
01-10 20:42:31.587 15614 28362 W OverlayService: │  ├─ After set: com.samsung.android.honeyboard/.service.HoneyBoardService
01-10 20:42:31.587 15614 28362 W OverlayService: │  └─ Re-enabling Samsung Keyboard...
01-10 20:42:31.989 15614 28362 W OverlayService: ├─ FINAL IME: com.samsung.android.honeyboard/.service.HoneyBoardService
01-10 20:42:31.989 15614 28362 W OverlayService: ├─ SUCCESS: false
01-10 20:42:31.989 15614 28362 W OverlayService: ├─ First attempt failed, trying nuclear option...
01-10 20:42:32.558 15614 15614 W OverlayService: setSoftKeyboardBlocking: Already restoring, skipping duplicate call
01-10 20:42:35.271 15614 15614 W OverlayService: ╔══════════════════════════════════════════════════════════╗
01-10 20:42:35.271 15614 15614 W OverlayService: ║ PHONE OPENED DETECTED - onDisplayChanged                 ║
01-10 20:42:35.271 15614 15614 W OverlayService: ╚══════════════════════════════════════════════════════════╝
01-10 20:42:35.271 15614 15614 W OverlayService: ├─ display.state: 2 (STATE_ON=2)
01-10 20:42:35.271 15614 15614 W OverlayService: ├─ currentDisplayId: 1
01-10 20:42:35.271 15614 15614 W OverlayService: ├─ prefBlockSoftKeyboard: false
01-10 20:42:35.271 15614 15614 W OverlayService: ├─ Scheduling UI switch in 500ms...
01-10 20:42:35.400 15614 15614 W OverlayService: ╔══════════════════════════════════════════════════════════╗
01-10 20:42:35.400 15614 15614 W OverlayService: ║ PHONE OPENED DETECTED - onDisplayChanged                 ║
01-10 20:42:35.400 15614 15614 W OverlayService: ╚══════════════════════════════════════════════════════════╝
01-10 20:42:35.400 15614 15614 W OverlayService: ├─ display.state: 2 (STATE_ON=2)
01-10 20:42:35.400 15614 15614 W OverlayService: ├─ currentDisplayId: 1
01-10 20:42:35.400 15614 15614 W OverlayService: ├─ prefBlockSoftKeyboard: false
01-10 20:42:35.400 15614 15614 W OverlayService: ├─ Scheduling UI switch in 500ms...
01-10 20:42:35.441 15614 15614 W OverlayService: ╔══════════════════════════════════════════════════════════╗
01-10 20:42:35.441 15614 15614 W OverlayService: ║ PHONE OPENED DETECTED - onDisplayChanged                 ║
01-10 20:42:35.441 15614 15614 W OverlayService: ╚══════════════════════════════════════════════════════════╝
01-10 20:42:35.441 15614 15614 W OverlayService: ├─ display.state: 2 (STATE_ON=2)
01-10 20:42:35.441 15614 15614 W OverlayService: ├─ currentDisplayId: 1
01-10 20:42:35.441 15614 15614 W OverlayService: ├─ prefBlockSoftKeyboard: false
01-10 20:42:35.441 15614 15614 W OverlayService: ├─ Scheduling UI switch in 500ms...
01-10 20:42:35.446 15614 15614 W OverlayService: ╔══════════════════════════════════════════════════════════╗
01-10 20:42:35.446 15614 15614 W OverlayService: ║ PHONE OPENED DETECTED - onDisplayChanged                 ║
01-10 20:42:35.446 15614 15614 W OverlayService: ╚══════════════════════════════════════════════════════════╝
01-10 20:42:35.446 15614 15614 W OverlayService: ├─ display.state: 2 (STATE_ON=2)
01-10 20:42:35.446 15614 15614 W OverlayService: ├─ currentDisplayId: 1
01-10 20:42:35.446 15614 15614 W OverlayService: ├─ prefBlockSoftKeyboard: false
01-10 20:42:35.446 15614 15614 W OverlayService: ├─ Scheduling UI switch in 500ms...
01-10 20:42:35.489 15614 28362 W OverlayService: ├─ After nuclear: juloo.keyboard2/.Keyboard2
01-10 20:42:35.772 15614 15614 W OverlayService: ├─ DELAYED HANDLER EXECUTING
01-10 20:42:35.773 15614 15614 W OverlayService: │  ├─ timeSinceManualSwitch: 1768095755772ms
01-10 20:42:35.773 15614 15614 W OverlayService: │  └─ Will execute: true
01-10 20:42:35.773 15614 15614 W OverlayService: ├─ Calling setupUI(0)...
01-10 20:42:35.829 15614 15614 W OverlayService: ╔══════════════════════════════════════════════════════════╗
01-10 20:42:35.829 15614 15614 W OverlayService: ║ KEYBOARD LOGIC START - setupUI(0)              ║
01-10 20:42:35.829 15614 15614 W OverlayService: ╚══════════════════════════════════════════════════════════╝
01-10 20:42:35.830 15614 15614 W OverlayService: ├─ PRE-STATE:
01-10 20:42:35.830 15614 15614 W OverlayService: │  ├─ displayId: 0
01-10 20:42:35.830 15614 15614 W OverlayService: │  ├─ currentDisplayId: 0
01-10 20:42:35.830 15614 15614 W OverlayService: │  ├─ prefBlockSoftKeyboard: false
01-10 20:42:35.830 15614 15614 W OverlayService: │  ├─ current IME: juloo.keyboard2/.Keyboard2
01-10 20:42:35.830 15614 15614 W OverlayService: │  └─ showMode: 0
01-10 20:42:35.830 15614 15614 W OverlayService: ├─ ACTION: MAIN SCREEN - Checking Blocking Prefs
01-10 20:42:35.830 15614 15614 W OverlayService: │  └─ Blocking NOT enabled
01-10 20:42:35.832 15614 15614 W OverlayService: └─ KEYBOARD LOGIC END
01-10 20:42:35.832 15614 15614 W OverlayService: └─ Phone opened handling complete
01-10 20:42:35.901 15614 15614 W OverlayService: ├─ DELAYED HANDLER EXECUTING
01-10 20:42:35.901 15614 15614 W OverlayService: │  ├─ timeSinceManualSwitch: 1768095755901ms
01-10 20:42:35.901 15614 15614 W OverlayService: │  └─ Will execute: true
01-10 20:42:35.901 15614 15614 W OverlayService: ├─ Calling setupUI(0)...
01-10 20:42:35.930 15614 15614 W OverlayService: ╔══════════════════════════════════════════════════════════╗
01-10 20:42:35.930 15614 15614 W OverlayService: ║ KEYBOARD LOGIC START - setupUI(0)              ║
01-10 20:42:35.930 15614 15614 W OverlayService: ╚══════════════════════════════════════════════════════════╝
01-10 20:42:35.930 15614 15614 W OverlayService: ├─ PRE-STATE:
01-10 20:42:35.930 15614 15614 W OverlayService: │  ├─ displayId: 0
01-10 20:42:35.930 15614 15614 W OverlayService: │  ├─ currentDisplayId: 0
01-10 20:42:35.930 15614 15614 W OverlayService: │  ├─ prefBlockSoftKeyboard: false
01-10 20:42:35.930 15614 15614 W OverlayService: │  ├─ current IME: juloo.keyboard2/.Keyboard2
01-10 20:42:35.930 15614 15614 W OverlayService: │  └─ showMode: 0
01-10 20:42:35.930 15614 15614 W OverlayService: ├─ ACTION: MAIN SCREEN - Checking Blocking Prefs
01-10 20:42:35.930 15614 15614 W OverlayService: │  └─ Blocking NOT enabled
01-10 20:42:35.930 15614 15614 W OverlayService: └─ KEYBOARD LOGIC END
01-10 20:42:35.931 15614 15614 W OverlayService: └─ Phone opened handling complete
01-10 20:42:35.962 15614 15614 W OverlayService: ├─ DELAYED HANDLER EXECUTING
01-10 20:42:35.962 15614 15614 W OverlayService: │  ├─ timeSinceManualSwitch: 1768095755962ms
01-10 20:42:35.962 15614 15614 W OverlayService: │  └─ Will execute: true
01-10 20:42:35.962 15614 15614 W OverlayService: ├─ Calling setupUI(0)...
01-10 20:42:35.985 15614 15614 W OverlayService: ╔══════════════════════════════════════════════════════════╗
01-10 20:42:35.985 15614 15614 W OverlayService: ║ KEYBOARD LOGIC START - setupUI(0)              ║
01-10 20:42:35.985 15614 15614 W OverlayService: ╚══════════════════════════════════════════════════════════╝
01-10 20:42:35.986 15614 15614 W OverlayService: ├─ PRE-STATE:
01-10 20:42:35.986 15614 15614 W OverlayService: │  ├─ displayId: 0
01-10 20:42:35.986 15614 15614 W OverlayService: │  ├─ currentDisplayId: 0
01-10 20:42:35.986 15614 15614 W OverlayService: │  ├─ prefBlockSoftKeyboard: false
01-10 20:42:35.986 15614 15614 W OverlayService: │  ├─ current IME: juloo.keyboard2/.Keyboard2
01-10 20:42:35.986 15614 15614 W OverlayService: │  └─ showMode: 0
01-10 20:42:35.986 15614 15614 W OverlayService: ├─ ACTION: MAIN SCREEN - Checking Blocking Prefs
01-10 20:42:35.986 15614 15614 W OverlayService: │  └─ Blocking NOT enabled
01-10 20:42:35.986 15614 15614 W OverlayService: └─ KEYBOARD LOGIC END
01-10 20:42:35.986 15614 15614 W OverlayService: └─ Phone opened handling complete
01-10 20:42:35.986 15614 15614 W OverlayService: ├─ DELAYED HANDLER EXECUTING
01-10 20:42:35.986 15614 15614 W OverlayService: │  ├─ timeSinceManualSwitch: 1768095755986ms
01-10 20:42:35.986 15614 15614 W OverlayService: │  └─ Will execute: true
01-10 20:42:35.986 15614 15614 W OverlayService: ├─ Calling setupUI(0)...
01-10 20:42:36.011 15614 15614 W OverlayService: ╔══════════════════════════════════════════════════════════╗
01-10 20:42:36.011 15614 15614 W OverlayService: ║ KEYBOARD LOGIC START - setupUI(0)              ║
01-10 20:42:36.011 15614 15614 W OverlayService: ╚══════════════════════════════════════════════════════════╝
01-10 20:42:36.011 15614 15614 W OverlayService: ├─ PRE-STATE:
01-10 20:42:36.011 15614 15614 W OverlayService: │  ├─ displayId: 0
01-10 20:42:36.011 15614 15614 W OverlayService: │  ├─ currentDisplayId: 0
01-10 20:42:36.011 15614 15614 W OverlayService: │  ├─ prefBlockSoftKeyboard: false
01-10 20:42:36.011 15614 15614 W OverlayService: │  ├─ current IME: juloo.keyboard2/.Keyboard2
01-10 20:42:36.011 15614 15614 W OverlayService: │  └─ showMode: 0
01-10 20:42:36.011 15614 15614 W OverlayService: ├─ ACTION: MAIN SCREEN - Checking Blocking Prefs
01-10 20:42:36.011 15614 15614 W OverlayService: │  └─ Blocking NOT enabled
01-10 20:42:36.012 15614 15614 W OverlayService: └─ KEYBOARD LOGIC END
01-10 20:42:36.012 15614 15614 W OverlayService: └─ Phone opened handling complete
01-10 20:42:36.094 15614 28362 W OverlayService: ├─ Nuclear final: juloo.keyboard2/.Keyboard2
01-10 20:42:36.094 15614 28362 E OverlayService: ├─ NUCLEAR FAILED
01-10 20:42:36.094 15614 28362 W OverlayService: └─ KEYBOARD RESTORATION COMPLETE
