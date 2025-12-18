--------- beginning of main
12-18 18:37:48.117  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=119270321714000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:48.118  1401  1700 I InputDispatcher: Delivering touch to (16162): action: 0x4, f=0x0, d=0, 'c857c99', t=1 
12-18 18:37:48.119  1401  1700 I InputDispatcher: Delivering touch to (2045): action: 0x0, f=0x0, d=0, '253deac', t=1 +(0,-2445)
12-18 18:37:48.239  1401  1469 I InputDispatcher: Channel [Gesture Monitor] swipe-up is stealing input gesture for device 3 from [253deac NavigationBar0, [Gesture Monitor] clo, [Gesture Monitor] secinputdev, [Gesture Monitor] PalmMotion, [Gesture Monitor] edge-swipe]
12-18 18:37:48.239  1401  1469 D InputDispatcher: Cancel for '253deac': input channel stole pointer stream, m=1
12-18 18:37:48.239  1401  1469 I InputDispatcher: Delivering touch to (2045): action: 0x3, f=0x20, d=0, '253deac', t=1 +(0,-2445)
--------- beginning of system
12-18 18:37:48.243  1401  3076 I WindowManager: Reparenting to leash, surface=Surface(name=RemoteWallpaperAnim:1:1)/@0xd604b25, leashParent=Surface(name=OneHanded:0:14)/@0xc8374fa
12-18 18:37:48.245  1401  3076 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=RemoteWallpaperAnim:1:1)/@0xd604b25 - animation-leash of remote_wallpaper)/@0xa774c7a
12-18 18:37:48.245  1401  3076 D WindowManager: startAnimation for remote wallpaper, leash=Surface(name=Surface(name=RemoteWallpaperAnim:1:1)/@0xd604b25 - animation-leash of remote_wallpaper)/@0xa774c7a
12-18 18:37:48.246  1401  3076 D WindowManager: startRemoteWallpaperAnimation, d=0, leash=Surface(name=Surface(name=RemoteWallpaperAnim:1:1)/@0xd604b25 - animation-leash of remote_wallpaper)/@0xa774c7a
12-18 18:37:48.247  1401  1469 D WindowManager: Transition is created, t=TransitionRecord{bffd888 id=-1 type=TO_FRONT flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.WindowOrganizerController.startTransition:18 com.android.server.wm.WindowOrganizerController.startNewTransition:2 android.window.IWindowOrganizerController$Stub.onTransact:247 com.android.server.wm.WindowOrganizerController.onTransact:1 
12-18 18:37:48.250  1401  1469 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{225d09b u0 RecentsTransitionOverlay}
12-18 18:37:48.254  1401  1469 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{3dc2dd0 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}
12-18 18:37:48.255  1401  1469 D WindowManager: rotationForOrientation, orientationSource=ActivityRecord{26066939 u0 com.sec.android.app.launcher/.activities.LauncherActivity t17646}
12-18 18:37:48.257  1401  1469 I WindowManager: Reparenting to leash, surface=Surface(name=1aa7434 FreeformContainer)/@0x4f2b598, leashParent=Surface(name=WindowToken{b8c572b type=2604 android.os.BinderProxy@f0783a5})/@0xa3bd1f1
12-18 18:37:48.257  1401  1469 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=1aa7434 FreeformContainer)/@0x4f2b598 - animation-leash of window_animation)/@0x118d221
12-18 18:37:48.261  1401  1544 I ActivityManager: Changes in 10155 5 to 2, 184 to 255
12-18 18:37:48.264  1401  1469 I WindowManager: Relayout Window{3dc2dd0 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}: viewVisibility=0 req=1080x2520 ty=1 d0
12-18 18:37:48.264  1401  1469 D WindowManager: makeSurface duration=0 name=com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity$_2738
12-18 18:37:48.266  1401  1469 I WindowManager: Relayout hash=3dc2dd0, pid=2738, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=nothing forwardNavigation} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION fmt=TRANSPARENT wanim=0x1030306
12-18 18:37:48.266  1401  1469 I WindowManager:   fl=81910100
12-18 18:37:48.266  1401  1469 I WindowManager:   pfl=10008840
12-18 18:37:48.266  1401  1469 I WindowManager:   bhv=2
12-18 18:37:48.266  1401  1469 I WindowManager:   fitSides=0
12-18 18:37:48.266  1401  1469 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:48.266  1401  1469 I WindowManager:   dvrrWindowFrameRateHint=true screenDimDuration=200000 naviIconColor=0}
12-18 18:37:48.269  1401  2245 I ActivityManager: Changes in 10395 15 to 3, 0 to 144
12-18 18:37:48.277  1401  1469 D WindowManager: finishDrawingWindow: Window{3dc2dd0 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:48.278  1401  1544 D WindowManager: mRunner#onAnimationStart for remote wallpaper=[android.view.RemoteAnimationTarget@d5b6afc], transaction=startRemoteWallpaperAnimation_242543659
12-18 18:37:48.279  1401  1545 D WindowManager: setActiveRecents, recents=Task{e6ea632 #1 type=home}, task=Task{57ae0b9 #17882 type=standard A=10342:com.termux}, caller=com.android.server.wm.InputMonitor.setActiveRecents:33 com.android.server.wm.Transition.onTransactionReady:1748 com.android.server.wm.BLASTSyncEngine$SyncGroup.finishNow:240 
12-18 18:37:48.288  1401  2255 D InputDispatcher: Focused application(0): ActivityRecord{26066939 u0 com.sec.android.app.launcher/.activities.LauncherActivity t17646}
12-18 18:37:48.288  1401  2255 D WindowManager: Changing focus from Window{1230479 u0 com.termux/com.termux.app.TermuxActivity} to Window{3dc2dd0 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity} displayId=0 Callers=com.android.server.wm.ActivityTaskManagerService.setLastResumedActivityUncheckLocked:264 com.android.server.wm.ActivityTaskManagerService.setFocusedTask:20 com.android.server.wm.ActivityTaskManagerService.focusTopTask:53 android.app.IActivityTaskManager$Stub.onTransact:2027 
12-18 18:37:48.288  1401  2255 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=7a1affc StatusBar)/@0x9878745 - animation-leash of insets_animation)/@0x619e757
12-18 18:37:48.288  1401  2255 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{ea68ef type=2000 android.os.BinderProxy@acba6c9})/@0xe49ce9a, destroy=false, surface=Surface(name=7a1affc StatusBar)/@0x9878745
12-18 18:37:48.288  1401  2255 I WindowManager: Reparenting to leash, surface=Surface(name=7a1affc StatusBar)/@0x9878745, leashParent=Surface(name=WindowToken{ea68ef type=2000 android.os.BinderProxy@acba6c9})/@0xe49ce9a
12-18 18:37:48.288  1401  2255 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=7a1affc StatusBar)/@0x9878745 - animation-leash of insets_animation)/@0xf522de7
12-18 18:37:48.289  1401  2255 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{3dc2dd0 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, navColorWin=Window{898f977 u0 InputMethod}, caller=com.android.server.wm.WindowManagerService.updateFocusedWindowLocked:372 com.android.server.wm.ActivityTaskManagerService.setLastResumedActivityUncheckLocked:264 com.android.server.wm.ActivityTaskManagerService.setFocusedTask:20 
12-18 18:37:48.289  1401  2255 D WindowManager: updateSystemBarAttributes, bhv=2, apr=0, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-18 18:37:48.290  1401  1763 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-18 18:37:48.292  1401  1542 D WindowManager: requestTransientBars: swipeTarget=Window{253deac u0 NavigationBar0}, controlTarget=PermanentControlTarget, canShowTransient=false, restorePositionTypes=0x3, from=com.android.server.wm.DisplayPolicy$1.onSwipeFromBottom:21 com.android.server.wm.SystemGesturesPointerEventListener.onPointerEvent:545 
12-18 18:37:48.306  1401  1763 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-18 18:37:48.309  1401  2251 D InputDispatcher: Once focus requested (0): recents_animation_input_consumer
12-18 18:37:48.309  1401  2251 D InputDispatcher: Focus left window (0): 1230479 com.termux/com.termux.app.TermuxActivity
12-18 18:37:48.309  1401  2251 D InputDispatcher: Focus entered window (0): recents_animation_input_consumer
12-18 18:37:48.381  1401  1763 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-18 18:37:48.417  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=119270626853000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:48.463  1401  1545 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{b8c572b type=2604 android.os.BinderProxy@f0783a5})/@0xa3bd1f1, destroy=true, surface=Surface(name=1aa7434 FreeformContainer)/@0x4f2b598
12-18 18:37:48.473  1401  1763 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-18 18:37:48.649  1401  1763 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-18 18:37:48.973  1401  1763 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-18 18:37:49.109  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=119271318322000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:49.109  1401  1700 I InputDispatcher: Delivering touch to (16162): action: 0x4, f=0x0, d=0, 'c857c99', t=1 
12-18 18:37:49.109  1401  1700 I InputDispatcher: Delivering touch to (1570): action: 0x0, f=0x0, d=0, '39f9008', t=1 +(-187,-885)
12-18 18:37:49.116  1401  1763 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-18 18:37:49.175  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=119271384689000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:49.175  1401  1700 I InputDispatcher: Delivering touch to (1570): action: 0x1, f=0x0, d=0, '39f9008', t=1 +(-187,-885)
12-18 18:37:49.197  1570  1570 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{4d99a56 V.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.KeyboardOverlay.createKeyboardWindow:434 com.example.coverscreentester.KeyboardOverlay.show:319 
12-18 18:37:49.198  1570  1570 D ViewRootImpl: desktopMode is false
12-18 18:37:49.198  1570  1570 I ViewRootImpl: dVRR is disabled
12-18 18:37:49.201  1401  1763 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-18 18:37:49.202  1570  1570 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{f900981 VFE...C.. ........ 0,0-93,93}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.enforceZOrder:1539 
12-18 18:37:49.203  1570  1570 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{f900981 VFE...C.. ........ 0,0-93,93}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.enforceZOrder:1539 com.example.coverscreentester.OverlayService.toggleCustomKeyboard:1244 
12-18 18:37:49.205  1570  1570 D ViewRootImpl: desktopMode is false
12-18 18:37:49.205  1570  1570 I ViewRootImpl: dVRR is disabled
12-18 18:37:49.206  1401  1763 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-18 18:37:49.213  1401  2251 D WindowManager: setActiveRecents, recents=null, task=null, caller=com.android.server.wm.InputMonitor.setActiveRecents:33 com.android.server.wm.TransitionController.finishTransition:1670 com.android.server.wm.WindowOrganizerController.finishTransitionInner:31 
12-18 18:37:49.215  1401  3076 D InputDispatcher: Focus left window (0): recents_animation_input_consumer
12-18 18:37:49.216  1401  1469 I WindowManager: Relayout Window{225d09b u0 RecentsTransitionOverlay}: viewVisibility=0 req=1x1 ty=2632 d0
12-18 18:37:49.218  1401  1469 I WindowManager: Relayout hash=225d09b, pid=0, syncId=-1: mAttrs={(0,0)(1x1) gr=BOTTOM CENTER_VERTICAL sim={adjust=pan} layoutInDisplayCutoutMode=always ty=TRANSIENT_LAUNCH_OVERLAY fmt=TRANSLUCENT if=INPUT_FEATURE_NO_INPUT_CHANNEL
12-18 18:37:49.218  1401  1469 I WindowManager:   fl=118
12-18 18:37:49.218  1401  1469 I WindowManager:   pfl=10000040
12-18 18:37:49.218  1401  1469 I WindowManager:   bhv=1
12-18 18:37:49.218  1401  1469 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:49.218  1401  1469 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-18 18:37:49.218  1401  1469 I WindowManager:   sfl=4020000}
12-18 18:37:49.219  1401  1544 I ActivityManager: Changes in 10342 2 to 4, 255 to 254
12-18 18:37:49.219  1570  1570 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{ab2bcbd V.E...... ........ 0,0-50,50}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.enforceZOrder:1540 
12-18 18:37:49.222  1570  1570 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{ab2bcbd V.E...... ........ 0,0-50,50}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.enforceZOrder:1540 com.example.coverscreentester.OverlayService.toggleCustomKeyboard:1244 
12-18 18:37:49.224  1401  1868 D InputDispatcher: Once focus requested (0): 3dc2dd0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity
12-18 18:37:49.224  1401  1868 D InputDispatcher: Focus entered window (0): 3dc2dd0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity
12-18 18:37:49.224  1570  1570 D ViewRootImpl: desktopMode is false
12-18 18:37:49.225  1570  1570 I ViewRootImpl: dVRR is disabled
12-18 18:37:49.226  1401  1763 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-18 18:37:49.226  1401  1763 D InputMethodManagerService: shouldShowImeSwitcherLocked : checking vis : 3
12-18 18:37:49.227  1401  1763 D InputMethodManagerService: checkDisplayOfStartInputAndUpdateKeyboard: displayId=0, mFocusedDisplayId=0
12-18 18:37:49.227  1401  1469 I WindowManager: Relayout Window{1230479 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=8 req=1080x2520 ty=1 d0
12-18 18:37:49.228  1401  1469 I WindowManager: Relayout hash=1230479, pid=13489, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-18 18:37:49.228  1401  1469 I WindowManager:   fl=8d810100
12-18 18:37:49.228  1401  1469 I WindowManager:   pfl=10008040
12-18 18:37:49.228  1401  1469 I WindowManager:   vsysui=700
12-18 18:37:49.228  1401  1469 I WindowManager:   bhv=1
12-18 18:37:49.228  1401  1469 I WindowManager:   fitSides=0
12-18 18:37:49.228  1401  1469 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:49.228  1401  1469 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:49.229  1401  2247 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=898f977 InputMethod)/@0xbf9fe4d - animation-leash of insets_animation)/@0x47fe212
12-18 18:37:49.229  1401  2247 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{fe60af5 type=2011 android.os.Binder@f55e02c})/@0x17aed02, destroy=false, surface=Surface(name=898f977 InputMethod)/@0xbf9fe4d
12-18 18:37:49.229  1401  2247 I WindowManager: Reparenting to leash, surface=Surface(name=898f977 InputMethod)/@0xbf9fe4d, leashParent=Surface(name=WindowToken{fe60af5 type=2011 android.os.Binder@f55e02c})/@0x17aed02
12-18 18:37:49.230  1401  2247 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=898f977 InputMethod)/@0xbf9fe4d - animation-leash of insets_animation)/@0x75b99a7
12-18 18:37:49.232  1401  1469 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:49.232  1401  1469 D WindowManager: makeSurface duration=0 name=$_1570
12-18 18:37:49.232  1401  1469 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0x2ecf809
12-18 18:37:49.232  1401  1469 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf, destroy=false, surface=Surface(name=253deac NavigationBar0)/@0x344c78e
12-18 18:37:49.233  1401  1469 I WindowManager: Reparenting to leash, surface=Surface(name=253deac NavigationBar0)/@0x344c78e, leashParent=Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf
12-18 18:37:49.233  1401  1469 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0xbf350f9
12-18 18:37:49.234  1401  1469 I WindowManager: Relayout hash=2d1b33, pid=1570, syncId=-1: mAttrs={(270,1137)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:49.234  1401  1469 I WindowManager:   fl=1040228
12-18 18:37:49.234  1401  1469 I WindowManager:   pfl=40000000
12-18 18:37:49.234  1401  1469 I WindowManager:   bhv=1
12-18 18:37:49.234  1401  1469 I WindowManager:   fitTypes=207
12-18 18:37:49.234  1401  1469 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:49.234  1401  1469 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:49.237  1401  1544 I ActivityManager: Changes in 10332 5 to 7, 255 to 128
12-18 18:37:49.237  1401  1544 I ActivityManager: Changes in 10122 5 to 7, 184 to 128
12-18 18:37:49.239  1401  2255 I WindowManager: Relayout Window{5b7421b u0 com.android.systemui.wallpapers.ImageWallpaper}: viewVisibility=0 req=2486x2520 ty=2013 d0
12-18 18:37:49.240  1401  2247 E WindowManager: win=Window{1230479 u0 com.termux/com.termux.app.TermuxActivity} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=8 caller=com.android.server.wm.ActivityRecord.destroySurfaces:25 com.android.server.wm.ActivityRecord.activityStopped:192 com.android.server.wm.ActivityClientController.activityStopped:97 android.app.IActivityClientController$Stub.onTransact:726 com.android.server.wm.ActivityClientController.onTransact:1 android.os.Binder.execTransactInternal:1462 android.os.Binder.execTransact:1401 
12-18 18:37:49.241  1401  2255 I WindowManager: Relayout hash=5b7421b, pid=2045, syncId=-1: mAttrs={(0,0)(2486x2520) gr=TOP START CENTER layoutInDisplayCutoutMode=always ty=WALLPAPER fmt=RGBX_8888 wanim=0x1030328
12-18 18:37:49.241  1401  2255 I WindowManager:   fl=14318
12-18 18:37:49.241  1401  2255 I WindowManager:   pfl=14
12-18 18:37:49.241  1401  2255 I WindowManager:   bhv=1
12-18 18:37:49.241  1401  2255 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:49.241  1401  2255 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-18 18:37:49.241  1401  2255 I WindowManager:   sfl=8}
12-18 18:37:49.242  1401  3076 D WindowManager: finishDrawingWindow: Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:49.245  1401  1469 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-18 18:37:49.245  1401  1469 I InputMethodManagerService: setImeWindowStatus: vis=0, backDisposition=0
12-18 18:37:49.248  1401  2245 I WindowManager: Relayout Window{3ce51cf u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=972x564 ty=2032 d0
12-18 18:37:49.248  1401  2245 D WindowManager: makeSurface duration=0 name=$_1570
12-18 18:37:49.249  1401  1469 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-18 18:37:49.250  1401  2245 I WindowManager: Relayout hash=3ce51cf, pid=1570, syncId=-1: mAttrs={(37,1930)(972xwrap) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:49.250  1401  2245 I WindowManager:   fl=1000208
12-18 18:37:49.250  1401  2245 I WindowManager:   pfl=40000000
12-18 18:37:49.250  1401  2245 I WindowManager:   bhv=1
12-18 18:37:49.250  1401  2245 I WindowManager:   fitTypes=207
12-18 18:37:49.250  1401  2245 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:49.250  1401  2245 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:49.251  1401  2255 I WindowManager: Relayout Window{898f977 u0 InputMethod}: viewVisibility=0 req=1080x2404 ty=2011 d0
12-18 18:37:49.252  1401  2255 I WindowManager: Relayout hash=898f977, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) gr=BOTTOM CENTER_VERTICAL sim={adjust=pan} ty=INPUT_METHOD fmt=TRANSPARENT wanim=0x1030056 preferredMinDisplayRefreshRate=60.0 receive insets ignoring z-order
12-18 18:37:49.252  1401  2255 I WindowManager:   fl=81800108
12-18 18:37:49.252  1401  2255 I WindowManager:   pfl=14000000
12-18 18:37:49.252  1401  2255 I WindowManager:   bhv=1
12-18 18:37:49.252  1401  2255 I WindowManager:   fitTypes=3
12-18 18:37:49.252  1401  2255 I WindowManager:   fitSides=7
12-18 18:37:49.252  1401  2255 I WindowManager:   fitIgnoreVis
12-18 18:37:49.252  1401  2255 I WindowManager:   dvrrWindowFrameRateHint=true
12-18 18:37:49.252  1401  2255 I WindowManager:  dimAmount=0.18 dimDuration=150 naviIconColor=0}
12-18 18:37:49.253  1401  2151 D WindowManager: setInsetsWindow Window{898f977 u0 InputMethod}, contentInsets=Rect(0, 1904 - 0, 0) -> Rect(0, 1904 - 0, 0), visibleInsets=Rect(0, 1904 - 0, 0) -> Rect(0, 1904 - 0, 0), touchableRegion=SkRegion((0,1904,1080,2404)) -> SkRegion((0,1904,1080,2404)), touchableInsets 3 -> 3
12-18 18:37:49.267  1401  2773 D WindowManager: finishDrawingWindow: Window{3ce51cf u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:49.268  1401  2255 I WindowManager: Relayout Window{3860f8c u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=93x93 ty=2032 d0
12-18 18:37:49.268  1401  2255 D WindowManager: makeSurface duration=0 name=$_1570
12-18 18:37:49.269  1401  2255 I WindowManager: Relayout hash=3860f8c, pid=1570, syncId=-1: mAttrs={(187,885)(93x93) gr=TOP START CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:49.269  1401  2255 I WindowManager:   fl=1000308
12-18 18:37:49.269  1401  2255 I WindowManager:   bhv=1
12-18 18:37:49.269  1401  2255 I WindowManager:   fitTypes=206
12-18 18:37:49.269  1401  2255 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:49.269  1401  2255 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:49.274  1401  2251 D WindowManager: finishDrawingWindow: Window{3860f8c u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:49.275  1401  2255 I WindowManager: Relayout Window{2e21f8e u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=50x50 ty=2032 d0
12-18 18:37:49.275  1401  2255 D WindowManager: makeSurface duration=0 name=$_1570
12-18 18:37:49.276  1401  2255 I WindowManager: Relayout hash=2e21f8e, pid=1570, syncId=-1: mAttrs={(540,1260)(wrapxwrap) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:49.276  1401  2255 I WindowManager:   fl=1000318
12-18 18:37:49.276  1401  2255 I WindowManager:   bhv=1
12-18 18:37:49.276  1401  2255 I WindowManager:   fitTypes=206
12-18 18:37:49.276  1401  2255 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:49.276  1401  2255 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:49.280  1401  2773 D WindowManager: finishDrawingWindow: Window{2e21f8e u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:49.280  1570  1570 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{f900981 VFE...C.. ........ 0,0-93,93}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.enforceZOrder:1539 
12-18 18:37:49.281  1570  1570 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{f900981 VFE...C.. ........ 0,0-93,93}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.enforceZOrder:1539 com.example.coverscreentester.OverlayService.setupBubble$lambda$25$lambda$24:848 
12-18 18:37:49.283  1570  1570 D ViewRootImpl: desktopMode is false
12-18 18:37:49.283  1570  1570 I ViewRootImpl: dVRR is disabled
12-18 18:37:49.288  1570  1570 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{ab2bcbd V.E...... ........ 0,0-50,50}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.enforceZOrder:1540 
12-18 18:37:49.289  1570  1570 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{ab2bcbd V.E...... ........ 0,0-50,50}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.enforceZOrder:1540 com.example.coverscreentester.OverlayService.setupBubble$lambda$25$lambda$24:848 
12-18 18:37:49.291  1570  1570 D ViewRootImpl: desktopMode is false
12-18 18:37:49.291  1570  1570 I ViewRootImpl: dVRR is disabled
12-18 18:37:49.296  1401  2773 I WindowManager: Relayout Window{eeefda1 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=93x93 ty=2032 d0
12-18 18:37:49.296  1401  2773 D WindowManager: makeSurface duration=1 name=$_1570
12-18 18:37:49.297  1401  2773 I WindowManager: Relayout hash=eeefda1, pid=1570, syncId=-1: mAttrs={(187,885)(93x93) gr=TOP START CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:49.297  1401  2773 I WindowManager:   fl=1000308
12-18 18:37:49.297  1401  2773 I WindowManager:   bhv=1
12-18 18:37:49.297  1401  2773 I WindowManager:   fitTypes=206
12-18 18:37:49.297  1401  2773 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:49.297  1401  2773 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:49.301  1401  2773 D WindowManager: finishDrawingWindow: Window{eeefda1 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:49.301  1401  2251 I WindowManager: Relayout Window{11c284c u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=50x50 ty=2032 d0
12-18 18:37:49.302  1401  2251 D WindowManager: makeSurface duration=0 name=$_1570
12-18 18:37:49.303  1401  2251 I WindowManager: Relayout hash=11c284c, pid=1570, syncId=-1: mAttrs={(540,1260)(wrapxwrap) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:49.303  1401  2251 I WindowManager:   fl=1000318
12-18 18:37:49.303  1401  2251 I WindowManager:   bhv=1
12-18 18:37:49.303  1401  2251 I WindowManager:   fitTypes=206
12-18 18:37:49.303  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:49.303  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:49.307  1401  2151 D WindowManager: finishDrawingWindow: Window{11c284c u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:49.309  1401  2255 D WindowManager: finishDrawingWindow: Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=HAS_DRAWN seqId=0
12-18 18:37:49.311  1401  1868 D WindowManager: finishDrawingWindow: Window{3ce51cf u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=HAS_DRAWN seqId=0
12-18 18:37:49.313  1401  2251 D WindowManager: finishDrawingWindow: Window{11c284c u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=HAS_DRAWN seqId=0
12-18 18:37:49.629  1401  2245 I WindowManager: Cancelling animation restarting=false, leash=Surface(name=Surface(name=RemoteWallpaperAnim:1:1)/@0xd604b25 - animation-leash of remote_wallpaper)/@0xa774c7a
12-18 18:37:49.629  1401  2245 I WindowManager: Reparenting to original parent: Surface(name=OneHanded:0:14)/@0xc8374fa, destroy=false, surface=Surface(name=RemoteWallpaperAnim:1:1)/@0xd604b25
12-18 18:37:49.629  1401  2245 D WindowManager: mRunner#onAnimationCancelled, leash=Surface(name=Surface(name=RemoteWallpaperAnim:1:1)/@0xd604b25 - animation-leash of remote_wallpaper)/@0xa774c7a, caller=com.android.server.wm.SurfaceAnimator.cancelAnimation:14 com.android.server.wm.SurfaceAnimator.cancelAnimation:1 com.android.server.wm.WindowContainer.cancelAnimation:3 com.android.server.wm.WindowManagerService.finishRemoteWallpaperAnimation:81 android.view.IWindowManager$Stub.onTransact:4321 
12-18 18:37:49.629  1401  2245 D WindowManager: finishRemoteWallpaperAnimation, success=true
12-18 18:37:49.759  1401  2255 I WindowManager: Relayout Window{898f977 u0 InputMethod}: viewVisibility=8 req=1080x2404 ty=2011 d0
12-18 18:37:49.759  1401  2255 E WindowManager: win=Window{898f977 u0 InputMethod} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=8 caller=com.android.server.wm.WindowManagerService.tryStartExitingAnimation:134 com.android.server.wm.WindowManagerService.relayoutWindow:1147 com.android.server.wm.Session.relayout:27 android.view.IWindowSession$Stub.onTransact:829 com.android.server.wm.Session.onTransact:1 android.os.Binder.execTransactInternal:1462 android.os.Binder.execTransact:1401 
12-18 18:37:49.760  1401  2255 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=898f977 InputMethod)/@0xbf9fe4d - animation-leash of insets_animation)/@0x75b99a7
12-18 18:37:49.760  1401  2255 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{fe60af5 type=2011 android.os.Binder@f55e02c})/@0x17aed02, destroy=false, surface=Surface(name=898f977 InputMethod)/@0xbf9fe4d
12-18 18:37:49.760  1401  2255 I WindowManager: Reparenting to leash, surface=Surface(name=898f977 InputMethod)/@0xbf9fe4d, leashParent=Surface(name=WindowToken{fe60af5 type=2011 android.os.Binder@f55e02c})/@0x17aed02
12-18 18:37:49.760  1401  2255 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=898f977 InputMethod)/@0xbf9fe4d - animation-leash of insets_animation)/@0xf090a4e
12-18 18:37:49.764  1401  2251 I WindowManager: Relayout Window{5b7421b u0 com.android.systemui.wallpapers.ImageWallpaper}: viewVisibility=0 req=2486x2520 ty=2013 d0
12-18 18:37:49.764  1401  2255 I WindowManager: Relayout hash=898f977, pid=19314, syncId=-1: mAttrs={(0,0)(fillxfill) gr=BOTTOM CENTER_VERTICAL sim={adjust=pan} ty=INPUT_METHOD fmt=TRANSPARENT wanim=0x1030056 preferredMinDisplayRefreshRate=60.0 receive insets ignoring z-order
12-18 18:37:49.764  1401  2255 I WindowManager:   fl=81800108
12-18 18:37:49.764  1401  2255 I WindowManager:   pfl=14000000
12-18 18:37:49.764  1401  2255 I WindowManager:   bhv=1
12-18 18:37:49.764  1401  2255 I WindowManager:   fitTypes=3
12-18 18:37:49.764  1401  2255 I WindowManager:   fitSides=7
12-18 18:37:49.764  1401  2255 I WindowManager:   fitIgnoreVis
12-18 18:37:49.764  1401  2255 I WindowManager:   dvrrWindowFrameRateHint=true
12-18 18:37:49.764  1401  2255 I WindowManager:  dimAmount=0.18 dimDuration=150 naviIconColor=0}
12-18 18:37:49.766  1401  2251 I WindowManager: Relayout hash=5b7421b, pid=2045, syncId=-1: mAttrs={(0,0)(2486x2520) gr=TOP START CENTER layoutInDisplayCutoutMode=always ty=WALLPAPER fmt=RGBX_8888 wanim=0x1030328
12-18 18:37:49.766  1401  2251 I WindowManager:   fl=14318
12-18 18:37:49.766  1401  2251 I WindowManager:   pfl=14
12-18 18:37:49.766  1401  2251 I WindowManager:   bhv=1
12-18 18:37:49.766  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:49.766  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-18 18:37:49.766  1401  2251 I WindowManager:   sfl=8}
12-18 18:37:49.766  1401  2255 D WindowManager: setInsetsWindow Window{898f977 u0 InputMethod}, contentInsets=Rect(0, 1904 - 0, 0) -> Rect(0, 2329 - 0, 0), visibleInsets=Rect(0, 1904 - 0, 0) -> Rect(0, 2329 - 0, 0), touchableRegion=SkRegion((0,1904,1080,2404)) -> SkRegion(), touchableInsets 3 -> 3
12-18 18:37:49.768  1401  2245 I WindowManager: Relayout Window{5b7421b u0 com.android.systemui.wallpapers.ImageWallpaper}: viewVisibility=0 req=2486x2520 ty=2013 d0
12-18 18:37:49.770  1401  2245 I WindowManager: Relayout hash=5b7421b, pid=2045, syncId=-1: mAttrs={(0,0)(2486x2520) gr=TOP START CENTER layoutInDisplayCutoutMode=always ty=WALLPAPER fmt=RGBX_8888 wanim=0x1030328
12-18 18:37:49.770  1401  2245 I WindowManager:   fl=14318
12-18 18:37:49.770  1401  2245 I WindowManager:   pfl=14
12-18 18:37:49.770  1401  2245 I WindowManager:   bhv=1
12-18 18:37:49.770  1401  2245 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:49.770  1401  2245 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-18 18:37:49.770  1401  2245 I WindowManager:   sfl=8}
12-18 18:37:49.994  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=119272202854000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:49.994  1401  1700 I InputDispatcher: Delivering touch to (16162): action: 0x0, f=0x0, d=0, 'c857c99', t=1 +(-50,-200)
12-18 18:37:50.074  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=119272284041000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:50.075  1401  1700 I InputDispatcher: Delivering touch to (16162): action: 0x1, f=0x0, d=0, 'c857c99', t=1 +(-50,-200)
12-18 18:37:50.075 16162 16162 W FloatingService: Layer 2038 failed (Permission?), trying Layer 2032...
12-18 18:37:50.075 16162 16162 W FloatingService: java.lang.IllegalArgumentException: Window type mismatch. Window Context's window type is 2032, while LayoutParams' type is set to 2038. Please create another Window Context via createWindowContext(getDisplay(), 2038, null) to add window with type:2038
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.WindowManagerImpl.assertWindowContextTypeMatches(WindowManagerImpl.java:195)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.WindowManagerImpl.applyTokens(WindowManagerImpl.java:173)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.WindowManagerImpl.addView(WindowManagerImpl.java:157)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at com.example.quadrantlauncher.FloatingLauncherService.toggleDrawer(FloatingLauncherService.kt:521)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at com.example.quadrantlauncher.FloatingLauncherService.access$toggleDrawer(FloatingLauncherService.kt:54)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at com.example.quadrantlauncher.FloatingLauncherService$setupBubble$1.onTouch(FloatingLauncherService.kt:403)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.View.performOnTouchCallback(View.java:17224)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.View.dispatchTouchEvent(View.java:17187)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.ViewGroup.dispatchTransformedTouchEvent(ViewGroup.java:3360)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.ViewGroup.dispatchTouchEvent(ViewGroup.java:3027)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.View.dispatchPointerEvent(View.java:17527)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$ViewPostImeInputStage.processPointerEvent(ViewRootImpl.java:9787)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$ViewPostImeInputStage.onProcess(ViewRootImpl.java:9503)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$InputStage.deliver(ViewRootImpl.java:8841)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$InputStage.onDeliverToNext(ViewRootImpl.java:8898)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$InputStage.forward(ViewRootImpl.java:8864)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$AsyncInputStage.forward(ViewRootImpl.java:9064)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$InputStage.apply(ViewRootImpl.java:8872)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$AsyncInputStage.apply(ViewRootImpl.java:9121)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$InputStage.deliver(ViewRootImpl.java:8845)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$InputStage.onDeliverToNext(ViewRootImpl.java:8898)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$InputStage.forward(ViewRootImpl.java:8864)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$InputStage.apply(ViewRootImpl.java:8872)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$InputStage.deliver(ViewRootImpl.java:8845)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.ViewRootImpl.deliverInputEvent(ViewRootImpl.java:12701)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.ViewRootImpl.doProcessInputEvents(ViewRootImpl.java:12589)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.ViewRootImpl.enqueueInputEvent(ViewRootImpl.java:12544)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.ViewRootImpl.processRawInputEvent(ViewRootImpl.java:13081)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$WindowInputEventReceiver.onInputEvent(ViewRootImpl.java:12831)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.view.InputEventReceiver.dispatchInputEvent(InputEventReceiver.java:392)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.os.MessageQueue.nativePollOnce(Native Method)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.os.MessageQueue.nextLegacy(MessageQueue.java:913)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.os.MessageQueue.next(MessageQueue.java:1025)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.os.Looper.loopOnce(Looper.java:221)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.os.Looper.loop(Looper.java:363)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at android.app.ActivityThread.main(ActivityThread.java:9939)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at java.lang.reflect.Method.invoke(Native Method)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:632)
12-18 18:37:50.075 16162 16162 W FloatingService: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:975)
12-18 18:37:50.076 16162 16162 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{e21b085 VFE...C.. .F...... 0,0-1080,2404 aid=1}, caller=android.view.WindowManagerImpl.addView:158 com.example.quadrantlauncher.FloatingLauncherService.toggleDrawer:535 com.example.quadrantlauncher.FloatingLauncherService.access$toggleDrawer:54 
12-18 18:37:50.076 16162 16162 D ViewRootImpl: desktopMode is false
12-18 18:37:50.076 16162 16162 I ViewRootImpl: dVRR is disabled
12-18 18:37:50.080  1401  1868 D WindowManager: Changing focus from Window{3dc2dd0 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity} to Window{4981526 u0 com.katsuyamaki.DroidOSLauncher} displayId=0 Callers=com.android.server.wm.WindowManagerService.addWindowInner:565 com.android.server.wm.WindowManagerService.addWindow:1842 com.android.server.wm.Session.addToDisplayAsUser:24 android.view.IWindowSession$Stub.onTransact:757 
12-18 18:37:50.080  1401  1868 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0xbf350f9
12-18 18:37:50.080  1401  1868 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf, destroy=false, surface=Surface(name=253deac NavigationBar0)/@0x344c78e
12-18 18:37:50.080  1401  1868 I WindowManager: Reparenting to leash, surface=Surface(name=253deac NavigationBar0)/@0x344c78e, leashParent=Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf
12-18 18:37:50.081  1401  1868 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0xaf2a2fe
12-18 18:37:50.081  1401  1868 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=7a1affc StatusBar)/@0x9878745 - animation-leash of insets_animation)/@0xf522de7
12-18 18:37:50.081  1401  1868 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{ea68ef type=2000 android.os.BinderProxy@acba6c9})/@0xe49ce9a, destroy=false, surface=Surface(name=7a1affc StatusBar)/@0x9878745
12-18 18:37:50.081  1401  1868 I WindowManager: Reparenting to leash, surface=Surface(name=7a1affc StatusBar)/@0x9878745, leashParent=Surface(name=WindowToken{ea68ef type=2000 android.os.BinderProxy@acba6c9})/@0xe49ce9a
12-18 18:37:50.081  1401  1868 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=7a1affc StatusBar)/@0x9878745 - animation-leash of insets_animation)/@0x829bcac
12-18 18:37:50.082  1401  1868 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{4981526 u0 com.katsuyamaki.DroidOSLauncher}, navColorWin=Window{3dc2dd0 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.WindowManagerService.updateFocusedWindowLocked:372 com.android.server.wm.WindowManagerService.addWindowInner:565 com.android.server.wm.WindowManagerService.addWindow:1842 
12-18 18:37:50.082  1401  1868 D WindowManager: updateSystemBarAttributes, bhv=1, apr=0, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-18 18:37:50.097  1401  1868 I WindowManager: Relayout Window{4981526 u0 com.katsuyamaki.DroidOSLauncher}: viewVisibility=0 req=1080x2404 ty=2032 d0
12-18 18:37:50.097  1401  1868 D WindowManager: makeSurface duration=0 name=$_16162
12-18 18:37:50.099  1401  1868 I WindowManager: Relayout hash=4981526, pid=16162, syncId=-1: mAttrs={(0,0)(fillxfill) gr=TOP START CENTER sim={adjust=nothing} ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:50.099  1401  1868 I WindowManager:   fl=1000300
12-18 18:37:50.099  1401  1868 I WindowManager:   bhv=1
12-18 18:37:50.099  1401  1868 I WindowManager:   fitTypes=206
12-18 18:37:50.099  1401  1868 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:50.099  1401  1868 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:50.116  1401  2251 D InputDispatcher: Once focus requested (0): 4981526 com.katsuyamaki.DroidOSLauncher
12-18 18:37:50.116  1401  2251 D InputDispatcher: Focus request (0): 4981526 com.katsuyamaki.DroidOSLauncher but waiting because NOT_VISIBLE
12-18 18:37:50.116  1401  2251 D InputDispatcher: Focus left window (0): 3dc2dd0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity
12-18 18:37:50.238  1401  2151 D WindowManager: finishDrawingWindow: Window{4981526 u0 com.katsuyamaki.DroidOSLauncher} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:50.240  1401  3507 I WindowManager: Relayout Window{c857c99 u0 com.katsuyamaki.DroidOSLauncher}: viewVisibility=8 req=63x63 ty=2032 d0
12-18 18:37:50.240  1401  3507 E WindowManager: win=Window{c857c99 u0 com.katsuyamaki.DroidOSLauncher} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=8 caller=com.android.server.wm.WindowManagerService.tryStartExitingAnimation:134 com.android.server.wm.WindowManagerService.relayoutWindow:1147 com.android.server.wm.Session.relayout:27 android.view.IWindowSession$Stub.onTransact:829 com.android.server.wm.Session.onTransact:1 android.os.Binder.execTransactInternal:1457 android.os.Binder.execTransact:1401 
12-18 18:37:50.242  1401  3507 I WindowManager: Relayout hash=c857c99, pid=16162, syncId=-1: mAttrs={(50,200)(wrapxwrap) gr=TOP START CENTER sim={adjust=pan} ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:50.242  1401  3507 I WindowManager:   fl=1040308
12-18 18:37:50.242  1401  3507 I WindowManager:   bhv=1
12-18 18:37:50.242  1401  3507 I WindowManager:   fitTypes=206
12-18 18:37:50.242  1401  3507 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:50.242  1401  3507 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:50.259  1401  2151 D InputDispatcher: Focus entered window (0): 4981526 com.katsuyamaki.DroidOSLauncher
12-18 18:37:50.266  1401  1763 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-18 18:37:50.266  1401  1763 D InputMethodManagerService: shouldShowImeSwitcherLocked : checking vis : 3
12-18 18:37:50.267  1401  1763 D InputMethodManagerService: checkDisplayOfStartInputAndUpdateKeyboard: displayId=0, mFocusedDisplayId=0
12-18 18:37:50.269  1401  2255 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=898f977 InputMethod)/@0xbf9fe4d - animation-leash of insets_animation)/@0xf090a4e
12-18 18:37:50.269  1401  2255 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{fe60af5 type=2011 android.os.Binder@f55e02c})/@0x17aed02, destroy=false, surface=Surface(name=898f977 InputMethod)/@0xbf9fe4d
12-18 18:37:50.269  1401  2255 I WindowManager: Reparenting to leash, surface=Surface(name=898f977 InputMethod)/@0xbf9fe4d, leashParent=Surface(name=WindowToken{fe60af5 type=2011 android.os.Binder@f55e02c})/@0x17aed02
12-18 18:37:50.271  1401  2255 D WindowManager: makeSurface duration=2 leash=Surface(name=Surface(name=898f977 InputMethod)/@0xbf9fe4d - animation-leash of insets_animation)/@0xed9010c
12-18 18:37:51.285  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=119273491996000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:51.286  1401  1700 I InputDispatcher: Delivering touch to (16162): action: 0x0, f=0x0, d=0, '4981526', t=1 +(0,-116)
12-18 18:37:51.574  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=119273782722000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:51.575  1401  1700 I InputDispatcher: Delivering touch to (16162): action: 0x1, f=0x0, d=0, '4981526', t=1 +(0,-116)
12-18 18:37:51.872  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=119274074830000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:51.876  1401  1700 I InputDispatcher: Delivering touch to (16162): action: 0x0, f=0x0, d=0, '4981526', t=1 +(0,-116)
12-18 18:37:51.933  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=119274141340000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:51.934  1401  1700 I InputDispatcher: Delivering touch to (16162): action: 0x1, f=0x0, d=0, '4981526', t=1 +(0,-116)
12-18 18:37:51.938 16162 16162 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{e21b085 VFE...C.. .F.P.... 0,0-1080,2404 aid=1}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.quadrantlauncher.FloatingLauncherService.toggleDrawer:508 
12-18 18:37:51.955  1401  2255 I WindowManager: Relayout Window{c857c99 u0 com.katsuyamaki.DroidOSLauncher}: viewVisibility=0 req=63x63 ty=2032 d0
12-18 18:37:51.956  1401  2255 D WindowManager: makeSurface duration=1 name=$_16162
12-18 18:37:51.960  1401  2255 I WindowManager: Relayout hash=c857c99, pid=16162, syncId=-1: mAttrs={(50,200)(wrapxwrap) gr=TOP START CENTER sim={adjust=pan} ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:51.960  1401  2255 I WindowManager:   fl=1040308
12-18 18:37:51.960  1401  2255 I WindowManager:   bhv=1
12-18 18:37:51.960  1401  2255 I WindowManager:   fitTypes=206
12-18 18:37:51.960  1401  2255 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:51.960  1401  2255 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:51.981  1401  3507 D InputDispatcher: Focus left window (0): 4981526 com.katsuyamaki.DroidOSLauncher
12-18 18:37:51.982  1401  2151 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=898f977 InputMethod)/@0xbf9fe4d - animation-leash of insets_animation)/@0xed9010c
12-18 18:37:51.982  1401  2151 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{fe60af5 type=2011 android.os.Binder@f55e02c})/@0x17aed02, destroy=false, surface=Surface(name=898f977 InputMethod)/@0xbf9fe4d
12-18 18:37:51.982  1401  2151 I WindowManager: Reparenting to leash, surface=Surface(name=898f977 InputMethod)/@0xbf9fe4d, leashParent=Surface(name=WindowToken{fe60af5 type=2011 android.os.Binder@f55e02c})/@0x17aed02
12-18 18:37:51.983  1401  2151 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=898f977 InputMethod)/@0xbf9fe4d - animation-leash of insets_animation)/@0xe2872c5
12-18 18:37:51.988  1401  2151 D WindowManager: Changing focus from Window{4981526 u0 com.katsuyamaki.DroidOSLauncher} to Window{3dc2dd0 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity} displayId=0 Callers=com.android.server.wm.WindowState.removeIfPossible:647 com.android.server.wm.Session.remove:16 android.view.IWindowSession$Stub.onTransact:804 com.android.server.wm.Session.onTransact:1 
12-18 18:37:51.988  1401  2151 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0xaf2a2fe
12-18 18:37:51.988  1401  2151 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf, destroy=false, surface=Surface(name=253deac NavigationBar0)/@0x344c78e
12-18 18:37:51.988  1401  2151 I WindowManager: Reparenting to leash, surface=Surface(name=253deac NavigationBar0)/@0x344c78e, leashParent=Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf
12-18 18:37:51.989  1401  2151 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0x227ab4b
12-18 18:37:51.989  1401  2151 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=7a1affc StatusBar)/@0x9878745 - animation-leash of insets_animation)/@0x829bcac
12-18 18:37:51.989  1401  2151 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{ea68ef type=2000 android.os.BinderProxy@acba6c9})/@0xe49ce9a, destroy=false, surface=Surface(name=7a1affc StatusBar)/@0x9878745
12-18 18:37:51.989  1401  2151 I WindowManager: Reparenting to leash, surface=Surface(name=7a1affc StatusBar)/@0x9878745, leashParent=Surface(name=WindowToken{ea68ef type=2000 android.os.BinderProxy@acba6c9})/@0xe49ce9a
12-18 18:37:51.990  1401  2151 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=7a1affc StatusBar)/@0x9878745 - animation-leash of insets_animation)/@0x816f928
12-18 18:37:51.991  1401  2151 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{3dc2dd0 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, navColorWin=Window{3dc2dd0 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.WindowManagerService.updateFocusedWindowLocked:372 com.android.server.wm.WindowState.removeIfPossible:647 com.android.server.wm.Session.remove:16 
12-18 18:37:51.991  1401  2151 D WindowManager: updateSystemBarAttributes, bhv=2, apr=0, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-18 18:37:51.992  1401  2255 D WindowManager: finishDrawingWindow: Window{c857c99 u0 com.katsuyamaki.DroidOSLauncher} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:51.992  1401  2255 W WindowManager: Failed looking up window session=Session{35bd012 16162:u0a10502} callers=com.android.server.wm.WindowManagerService.windowForClientLocked:1 com.android.server.wm.Session.setOnBackInvokedCallbackInfo:15 android.view.IWindowSession$Stub.onTransact:1390 
12-18 18:37:51.992  1401  2255 I WindowManager: setOnBackInvokedCallback(): No window state for package:com.katsuyamaki.DroidOSLauncher
12-18 18:37:52.013  1401  1868 D InputDispatcher: Once focus requested (0): 3dc2dd0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity
12-18 18:37:52.013  1401  1868 D InputDispatcher: Focus entered window (0): 3dc2dd0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity
12-18 18:37:52.020  1401  1763 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-18 18:37:52.021  1401  1763 D InputMethodManagerService: shouldShowImeSwitcherLocked : checking vis : 3
12-18 18:37:52.021  1401  1763 D InputMethodManagerService: checkDisplayOfStartInputAndUpdateKeyboard: displayId=0, mFocusedDisplayId=0
12-18 18:37:52.023  1401  2245 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=898f977 InputMethod)/@0xbf9fe4d - animation-leash of insets_animation)/@0xe2872c5
12-18 18:37:52.023  1401  2245 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{fe60af5 type=2011 android.os.Binder@f55e02c})/@0x17aed02, destroy=false, surface=Surface(name=898f977 InputMethod)/@0xbf9fe4d
12-18 18:37:52.023  1401  2245 I WindowManager: Reparenting to leash, surface=Surface(name=898f977 InputMethod)/@0xbf9fe4d, leashParent=Surface(name=WindowToken{fe60af5 type=2011 android.os.Binder@f55e02c})/@0x17aed02
12-18 18:37:52.023  1401  2245 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=898f977 InputMethod)/@0xbf9fe4d - animation-leash of insets_animation)/@0x73038c3
12-18 18:37:52.971  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=119275166390000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:52.972  1401  1700 I InputDispatcher: Delivering touch to (16162): action: 0x4, f=0x0, d=0, 'c857c99', t=1 
12-18 18:37:52.972  1401  1700 I InputDispatcher: Delivering touch to (1570): action: 0x0, f=0x0, d=0, '2d1b33 ', t=1 +(-270,-1137)
12-18 18:37:52.988  1401  2245 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:52.993  1401  2245 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(270,1137)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:52.993  1401  2245 I WindowManager:   fl=1040228
12-18 18:37:52.993  1401  2245 I WindowManager:   pfl=40000000
12-18 18:37:52.993  1401  2245 I WindowManager:   bhv=1
12-18 18:37:52.993  1401  2245 I WindowManager:   fitTypes=207
12-18 18:37:52.993  1401  2245 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:52.993  1401  2245 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:52.996  1401  2245 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.004  1401  2245 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(270,1137)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.004  1401  2245 I WindowManager:   fl=1040228
12-18 18:37:53.004  1401  2245 I WindowManager:   pfl=40000000
12-18 18:37:53.004  1401  2245 I WindowManager:   bhv=1
12-18 18:37:53.004  1401  2245 I WindowManager:   fitTypes=207
12-18 18:37:53.004  1401  2245 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.004  1401  2245 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.004  1401  2245 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.011  1401  2245 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(270,1137)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.011  1401  2245 I WindowManager:   fl=1040228
12-18 18:37:53.011  1401  2245 I WindowManager:   pfl=40000000
12-18 18:37:53.011  1401  2245 I WindowManager:   bhv=1
12-18 18:37:53.011  1401  2245 I WindowManager:   fitTypes=207
12-18 18:37:53.011  1401  2245 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.011  1401  2245 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.012  1401  2245 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.015  1401  2245 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(270,1137)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.015  1401  2245 I WindowManager:   fl=1040228
12-18 18:37:53.015  1401  2245 I WindowManager:   pfl=40000000
12-18 18:37:53.015  1401  2245 I WindowManager:   bhv=1
12-18 18:37:53.015  1401  2245 I WindowManager:   fitTypes=207
12-18 18:37:53.015  1401  2245 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.015  1401  2245 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.022  1401  2245 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.026  1401  2245 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(270,1137)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.026  1401  2245 I WindowManager:   fl=1040228
12-18 18:37:53.026  1401  2245 I WindowManager:   pfl=40000000
12-18 18:37:53.026  1401  2245 I WindowManager:   bhv=1
12-18 18:37:53.026  1401  2245 I WindowManager:   fitTypes=207
12-18 18:37:53.026  1401  2245 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.026  1401  2245 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.044  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(948 x 1048) immediately
12-18 18:37:53.049  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-18 18:37:53.073  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(948 x 1048) immediately
12-18 18:37:53.081  1401  2251 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.083  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-18 18:37:53.088  1401  2251 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(175,1280)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.088  1401  2251 I WindowManager:   fl=1040228
12-18 18:37:53.088  1401  2251 I WindowManager:   pfl=40000000
12-18 18:37:53.088  1401  2251 I WindowManager:   bhv=1
12-18 18:37:53.088  1401  2251 I WindowManager:   fitTypes=207
12-18 18:37:53.088  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.088  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.089  1401  2251 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.091  1401  2251 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(164,1299)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.091  1401  2251 I WindowManager:   fl=1040228
12-18 18:37:53.091  1401  2251 I WindowManager:   pfl=40000000
12-18 18:37:53.091  1401  2251 I WindowManager:   bhv=1
12-18 18:37:53.091  1401  2251 I WindowManager:   fitTypes=207
12-18 18:37:53.091  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.091  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.092  1401  2255 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.094  1401  2255 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(153,1320)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.094  1401  2255 I WindowManager:   fl=1040228
12-18 18:37:53.094  1401  2255 I WindowManager:   pfl=40000000
12-18 18:37:53.094  1401  2255 I WindowManager:   bhv=1
12-18 18:37:53.094  1401  2255 I WindowManager:   fitTypes=207
12-18 18:37:53.094  1401  2255 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.094  1401  2255 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.101  1401  2255 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.103  1401  2255 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(142,1340)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.103  1401  2255 I WindowManager:   fl=1040228
12-18 18:37:53.103  1401  2255 I WindowManager:   pfl=40000000
12-18 18:37:53.103  1401  2255 I WindowManager:   bhv=1
12-18 18:37:53.103  1401  2255 I WindowManager:   fitTypes=207
12-18 18:37:53.103  1401  2255 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.103  1401  2255 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.110  1401  2255 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.113  1401  2255 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(133,1359)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.113  1401  2255 I WindowManager:   fl=1040228
12-18 18:37:53.113  1401  2255 I WindowManager:   pfl=40000000
12-18 18:37:53.113  1401  2255 I WindowManager:   bhv=1
12-18 18:37:53.113  1401  2255 I WindowManager:   fitTypes=207
12-18 18:37:53.113  1401  2255 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.113  1401  2255 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.118  1401  2255 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.121  1401  2255 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(125,1376)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.121  1401  2255 I WindowManager:   fl=1040228
12-18 18:37:53.121  1401  2255 I WindowManager:   pfl=40000000
12-18 18:37:53.121  1401  2255 I WindowManager:   bhv=1
12-18 18:37:53.121  1401  2255 I WindowManager:   fitTypes=207
12-18 18:37:53.121  1401  2255 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.121  1401  2255 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.127  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.128  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(119,1390)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.128  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.128  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.128  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.128  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.128  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.128  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.135  1401  2251 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.141  1401  2251 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(112,1405)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.141  1401  2251 I WindowManager:   fl=1040228
12-18 18:37:53.141  1401  2251 I WindowManager:   pfl=40000000
12-18 18:37:53.141  1401  2251 I WindowManager:   bhv=1
12-18 18:37:53.141  1401  2251 I WindowManager:   fitTypes=207
12-18 18:37:53.141  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.141  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.143  1401  2251 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.148  1401  2251 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(107,1416)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.148  1401  2251 I WindowManager:   fl=1040228
12-18 18:37:53.148  1401  2251 I WindowManager:   pfl=40000000
12-18 18:37:53.148  1401  2251 I WindowManager:   bhv=1
12-18 18:37:53.148  1401  2251 I WindowManager:   fitTypes=207
12-18 18:37:53.148  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.148  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.151  1401  2251 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.154  1401  2251 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(103,1424)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.154  1401  2251 I WindowManager:   fl=1040228
12-18 18:37:53.154  1401  2251 I WindowManager:   pfl=40000000
12-18 18:37:53.154  1401  2251 I WindowManager:   bhv=1
12-18 18:37:53.154  1401  2251 I WindowManager:   fitTypes=207
12-18 18:37:53.154  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.154  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.160  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.161  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(99,1431)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.161  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.161  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.161  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.161  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.161  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.161  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.168  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.170  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(96,1436)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.170  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.170  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.170  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.170  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.170  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.170  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.177  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.180  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(93,1440)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.180  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.180  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.180  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.180  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.180  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.180  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.184  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.186  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(91,1443)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.186  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.186  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.186  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.186  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.186  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.186  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.193  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.195  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(90,1444)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.195  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.195  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.195  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.195  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.195  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.195  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.201  1401  2251 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.204  1401  2251 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(89,1445)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.204  1401  2251 I WindowManager:   fl=1040228
12-18 18:37:53.204  1401  2251 I WindowManager:   pfl=40000000
12-18 18:37:53.204  1401  2251 I WindowManager:   bhv=1
12-18 18:37:53.204  1401  2251 I WindowManager:   fitTypes=207
12-18 18:37:53.204  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.204  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.209  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.211  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(88,1445)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.211  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.211  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.211  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.211  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.211  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.211  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.218  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.220  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(88,1445)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.220  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.220  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.220  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.220  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.220  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.220  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.226  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.228  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(88,1445)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.228  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.228  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.228  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.228  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.228  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.228  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.235  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.236  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(88,1445)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.236  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.236  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.236  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.236  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.236  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.236  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.243  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.245  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(88,1445)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.245  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.245  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.245  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.245  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.245  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.245  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.252  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.254  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(88,1445)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.254  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.254  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.254  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.254  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.254  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.254  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.259  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.262  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(88,1445)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.262  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.262  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.262  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.262  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.262  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.262  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.268  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.269  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(88,1445)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.269  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.269  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.269  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.269  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.269  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.269  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.277  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.279  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(88,1444)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.279  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.279  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.279  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.279  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.279  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.279  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.284  1401  2251 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.291  1401  2251 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(88,1444)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.291  1401  2251 I WindowManager:   fl=1040228
12-18 18:37:53.291  1401  2251 I WindowManager:   pfl=40000000
12-18 18:37:53.291  1401  2251 I WindowManager:   bhv=1
12-18 18:37:53.291  1401  2251 I WindowManager:   fitTypes=207
12-18 18:37:53.291  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.291  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.294  1401  2251 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.296  1401  2251 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(89,1443)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.296  1401  2251 I WindowManager:   fl=1040228
12-18 18:37:53.296  1401  2251 I WindowManager:   pfl=40000000
12-18 18:37:53.296  1401  2251 I WindowManager:   bhv=1
12-18 18:37:53.296  1401  2251 I WindowManager:   fitTypes=207
12-18 18:37:53.296  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.296  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.301  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.303  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(90,1442)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.303  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.303  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.303  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.303  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.303  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.303  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.310  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.312  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(91,1442)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.312  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.312  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.312  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.312  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.312  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.312  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.318  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.320  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(91,1442)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.320  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.320  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.320  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.320  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.320  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.320  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.326  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.328  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(91,1442)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.328  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.328  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.328  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.328  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.328  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.328  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.335  1401  2251 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.337  1401  2251 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(91,1442)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.337  1401  2251 I WindowManager:   fl=1040228
12-18 18:37:53.337  1401  2251 I WindowManager:   pfl=40000000
12-18 18:37:53.337  1401  2251 I WindowManager:   bhv=1
12-18 18:37:53.337  1401  2251 I WindowManager:   fitTypes=207
12-18 18:37:53.337  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.337  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.343  1401  2251 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.349  1401  2251 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(91,1442)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.349  1401  2251 I WindowManager:   fl=1040228
12-18 18:37:53.349  1401  2251 I WindowManager:   pfl=40000000
12-18 18:37:53.349  1401  2251 I WindowManager:   bhv=1
12-18 18:37:53.349  1401  2251 I WindowManager:   fitTypes=207
12-18 18:37:53.349  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.349  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.352  1401  2255 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.356  1401  2255 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(93,1449)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.356  1401  2255 I WindowManager:   fl=1040228
12-18 18:37:53.356  1401  2255 I WindowManager:   pfl=40000000
12-18 18:37:53.356  1401  2255 I WindowManager:   bhv=1
12-18 18:37:53.356  1401  2255 I WindowManager:   fitTypes=207
12-18 18:37:53.356  1401  2255 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.356  1401  2255 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.360  1401  2255 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.365  1401  2255 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(93,1452)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.365  1401  2255 I WindowManager:   fl=1040228
12-18 18:37:53.365  1401  2255 I WindowManager:   pfl=40000000
12-18 18:37:53.365  1401  2255 I WindowManager:   bhv=1
12-18 18:37:53.365  1401  2255 I WindowManager:   fitTypes=207
12-18 18:37:53.365  1401  2255 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.365  1401  2255 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.369  1401  2251 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.371  1401  2251 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(93,1454)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.371  1401  2251 I WindowManager:   fl=1040228
12-18 18:37:53.371  1401  2251 I WindowManager:   pfl=40000000
12-18 18:37:53.371  1401  2251 I WindowManager:   bhv=1
12-18 18:37:53.371  1401  2251 I WindowManager:   fitTypes=207
12-18 18:37:53.371  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.371  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.377  1401  2255 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.379  1401  2255 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(93,1454)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.379  1401  2255 I WindowManager:   fl=1040228
12-18 18:37:53.379  1401  2255 I WindowManager:   pfl=40000000
12-18 18:37:53.379  1401  2255 I WindowManager:   bhv=1
12-18 18:37:53.379  1401  2255 I WindowManager:   fitTypes=207
12-18 18:37:53.379  1401  2255 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.379  1401  2255 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.386  1401  2251 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.388  1401  2251 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(93,1454)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.388  1401  2251 I WindowManager:   fl=1040228
12-18 18:37:53.388  1401  2251 I WindowManager:   pfl=40000000
12-18 18:37:53.388  1401  2251 I WindowManager:   bhv=1
12-18 18:37:53.388  1401  2251 I WindowManager:   fitTypes=207
12-18 18:37:53.388  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.388  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.394  1401  2255 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.395  1401  2255 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(93,1454)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.395  1401  2255 I WindowManager:   fl=1040228
12-18 18:37:53.395  1401  2255 I WindowManager:   pfl=40000000
12-18 18:37:53.395  1401  2255 I WindowManager:   bhv=1
12-18 18:37:53.395  1401  2255 I WindowManager:   fitTypes=207
12-18 18:37:53.395  1401  2255 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.395  1401  2255 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.401  1401  2255 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.403  1401  2255 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(93,1454)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.403  1401  2255 I WindowManager:   fl=1040228
12-18 18:37:53.403  1401  2255 I WindowManager:   pfl=40000000
12-18 18:37:53.403  1401  2255 I WindowManager:   bhv=1
12-18 18:37:53.403  1401  2255 I WindowManager:   fitTypes=207
12-18 18:37:53.403  1401  2255 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.403  1401  2255 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.409  1401  2255 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.417  1401  2255 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(107,1440)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.417  1401  2255 I WindowManager:   fl=1040228
12-18 18:37:53.417  1401  2255 I WindowManager:   pfl=40000000
12-18 18:37:53.417  1401  2255 I WindowManager:   bhv=1
12-18 18:37:53.417  1401  2255 I WindowManager:   fitTypes=207
12-18 18:37:53.417  1401  2255 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.417  1401  2255 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.418  1401  2255 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.423  1401  2255 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(116,1430)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.423  1401  2255 I WindowManager:   fl=1040228
12-18 18:37:53.423  1401  2255 I WindowManager:   pfl=40000000
12-18 18:37:53.423  1401  2255 I WindowManager:   bhv=1
12-18 18:37:53.423  1401  2255 I WindowManager:   fitTypes=207
12-18 18:37:53.423  1401  2255 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.423  1401  2255 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.427  1401  2251 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.429  1401  2251 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(125,1421)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.429  1401  2251 I WindowManager:   fl=1040228
12-18 18:37:53.429  1401  2251 I WindowManager:   pfl=40000000
12-18 18:37:53.429  1401  2251 I WindowManager:   bhv=1
12-18 18:37:53.429  1401  2251 I WindowManager:   fitTypes=207
12-18 18:37:53.429  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.429  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.434  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.437  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(136,1413)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.437  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.437  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.437  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.437  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.437  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.437  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.443  1401  2251 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.452  1401  2251 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(148,1407)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.452  1401  2251 I WindowManager:   fl=1040228
12-18 18:37:53.452  1401  2251 I WindowManager:   pfl=40000000
12-18 18:37:53.452  1401  2251 I WindowManager:   bhv=1
12-18 18:37:53.452  1401  2251 I WindowManager:   fitTypes=207
12-18 18:37:53.452  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.452  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.452  1401  2251 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.457  1401  2251 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(157,1403)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.457  1401  2251 I WindowManager:   fl=1040228
12-18 18:37:53.457  1401  2251 I WindowManager:   pfl=40000000
12-18 18:37:53.457  1401  2251 I WindowManager:   bhv=1
12-18 18:37:53.457  1401  2251 I WindowManager:   fitTypes=207
12-18 18:37:53.457  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.457  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.460  1401  2251 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.463  1401  2251 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(163,1401)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.463  1401  2251 I WindowManager:   fl=1040228
12-18 18:37:53.463  1401  2251 I WindowManager:   pfl=40000000
12-18 18:37:53.463  1401  2251 I WindowManager:   bhv=1
12-18 18:37:53.463  1401  2251 I WindowManager:   fitTypes=207
12-18 18:37:53.463  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.463  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.468  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.471  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(167,1401)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.471  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.471  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.471  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.471  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.471  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.471  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.476  1401  2251 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.478  1401  2251 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(169,1401)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.478  1401  2251 I WindowManager:   fl=1040228
12-18 18:37:53.478  1401  2251 I WindowManager:   pfl=40000000
12-18 18:37:53.478  1401  2251 I WindowManager:   bhv=1
12-18 18:37:53.478  1401  2251 I WindowManager:   fitTypes=207
12-18 18:37:53.478  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.478  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.486  1401  2251 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.488  1401  2251 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(170,1401)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.488  1401  2251 I WindowManager:   fl=1040228
12-18 18:37:53.488  1401  2251 I WindowManager:   pfl=40000000
12-18 18:37:53.488  1401  2251 I WindowManager:   bhv=1
12-18 18:37:53.488  1401  2251 I WindowManager:   fitTypes=207
12-18 18:37:53.488  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.488  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.493  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.495  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(170,1401)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.495  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.495  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.495  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.495  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.495  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.495  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.501  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.503  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(170,1401)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.503  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.503  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.503  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.503  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.503  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.503  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.509  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.511  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(172,1408)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.511  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.511  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.511  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.511  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.511  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.511  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.518  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.520  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(172,1413)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.520  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.520  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.520  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.520  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.520  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.520  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.526  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.529  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(171,1418)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.529  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.529  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.529  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.529  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.529  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.529  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.534  1401  2251 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.537  1401  2251 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(168,1425)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.537  1401  2251 I WindowManager:   fl=1040228
12-18 18:37:53.537  1401  2251 I WindowManager:   pfl=40000000
12-18 18:37:53.537  1401  2251 I WindowManager:   bhv=1
12-18 18:37:53.537  1401  2251 I WindowManager:   fitTypes=207
12-18 18:37:53.537  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.537  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.543  1401  2251 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.546  1401  2251 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(164,1432)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.546  1401  2251 I WindowManager:   fl=1040228
12-18 18:37:53.546  1401  2251 I WindowManager:   pfl=40000000
12-18 18:37:53.546  1401  2251 I WindowManager:   bhv=1
12-18 18:37:53.546  1401  2251 I WindowManager:   fitTypes=207
12-18 18:37:53.546  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.546  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.552  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.554  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(159,1439)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.554  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.554  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.554  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.554  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.554  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.554  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.559  1401  2251 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.563  1401  2251 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(152,1448)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.563  1401  2251 I WindowManager:   fl=1040228
12-18 18:37:53.563  1401  2251 I WindowManager:   pfl=40000000
12-18 18:37:53.563  1401  2251 I WindowManager:   bhv=1
12-18 18:37:53.563  1401  2251 I WindowManager:   fitTypes=207
12-18 18:37:53.563  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.563  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:53.564  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=119275772617000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:53.565  1401  1700 I InputDispatcher: Delivering touch to (1570): action: 0x1, f=0x0, d=0, '2d1b33 ', t=1 +(-164,-1432)
12-18 18:37:53.569  1401  2151 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:53.572  1401  2151 I WindowManager: Relayout hash=2d1b33, pid=0, syncId=-1: mAttrs={(151,1449)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:53.572  1401  2151 I WindowManager:   fl=1040228
12-18 18:37:53.572  1401  2151 I WindowManager:   pfl=40000000
12-18 18:37:53.572  1401  2151 I WindowManager:   bhv=1
12-18 18:37:53.572  1401  2151 I WindowManager:   fitTypes=207
12-18 18:37:53.572  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:53.572  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:54.061  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=119276266227000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:54.063  1401  1700 I InputDispatcher: Delivering touch to (16162): action: 0x4, f=0x0, d=0, 'c857c99', t=1 
12-18 18:37:54.064  1401  1700 I InputDispatcher: Delivering touch to (1570): action: 0x0, f=0x0, d=0, 'eeefda1', t=1 +(-187,-885)
12-18 18:37:54.113  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=119276322392000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:54.115  1401  1700 I InputDispatcher: Delivering touch to (1570): action: 0x1, f=0x0, d=0, 'eeefda1', t=1 +(-187,-885)
12-18 18:37:54.119  1570  1570 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{4d99a56 V.E...... ........ 0,0-972,564}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.KeyboardOverlay.hide:328 
12-18 18:37:54.125  1570  1570 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{f900981 VFE...C.. ........ 0,0-93,93}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.enforceZOrder:1539 
12-18 18:37:54.128  1570  1570 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{f900981 VFE...C.. ........ 0,0-93,93}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.enforceZOrder:1539 com.example.coverscreentester.OverlayService.toggleCustomKeyboard:1244 
12-18 18:37:54.137  1570  1570 D ViewRootImpl: desktopMode is false
12-18 18:37:54.137  1570  1570 I ViewRootImpl: dVRR is disabled
12-18 18:37:54.149  1570  1570 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{ab2bcbd V.E...... ........ 0,0-50,50}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.enforceZOrder:1540 
12-18 18:37:54.151  1570  1570 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{ab2bcbd V.E...... ........ 0,0-50,50}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.enforceZOrder:1540 com.example.coverscreentester.OverlayService.toggleCustomKeyboard:1244 
12-18 18:37:54.159  1570  1570 D ViewRootImpl: desktopMode is false
12-18 18:37:54.160  1570  1570 I ViewRootImpl: dVRR is disabled
12-18 18:37:54.167  1401  2251 I WindowManager: Relayout Window{664b7ca u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=93x93 ty=2032 d0
12-18 18:37:54.168  1401  2251 D WindowManager: makeSurface duration=1 name=$_1570
12-18 18:37:54.170  1401  2251 I WindowManager: Relayout hash=664b7ca, pid=1570, syncId=-1: mAttrs={(187,885)(93x93) gr=TOP START CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:54.170  1401  2251 I WindowManager:   fl=1000308
12-18 18:37:54.170  1401  2251 I WindowManager:   bhv=1
12-18 18:37:54.170  1401  2251 I WindowManager:   fitTypes=206
12-18 18:37:54.170  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:54.170  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:54.179  1401  2151 D WindowManager: finishDrawingWindow: Window{664b7ca u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:54.180  1401  1868 I WindowManager: Relayout Window{854fe70 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=50x50 ty=2032 d0
12-18 18:37:54.181  1401  1868 D WindowManager: makeSurface duration=1 name=$_1570
12-18 18:37:54.186  1401  1868 I WindowManager: Relayout hash=854fe70, pid=1570, syncId=-1: mAttrs={(540,1260)(wrapxwrap) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:54.186  1401  1868 I WindowManager:   fl=1000318
12-18 18:37:54.186  1401  1868 I WindowManager:   bhv=1
12-18 18:37:54.186  1401  1868 I WindowManager:   fitTypes=206
12-18 18:37:54.186  1401  1868 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:54.186  1401  1868 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:54.196  1401  1868 D WindowManager: finishDrawingWindow: Window{854fe70 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:54.200  1401  1868 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=8 req=527x444 ty=2032 d0
12-18 18:37:54.200  1401  1868 E WindowManager: win=Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=8 caller=com.android.server.wm.WindowManagerService.tryStartExitingAnimation:134 com.android.server.wm.WindowManagerService.relayoutWindow:1147 com.android.server.wm.Session.relayout:27 android.view.IWindowSession$Stub.onTransact:829 com.android.server.wm.Session.onTransact:1 android.os.Binder.execTransactInternal:1457 android.os.Binder.execTransact:1401 
12-18 18:37:54.202  1401  1868 I WindowManager: Relayout hash=2d1b33, pid=1570, syncId=-1: mAttrs={(151,1449)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:54.202  1401  1868 I WindowManager:   fl=1040228
12-18 18:37:54.202  1401  1868 I WindowManager:   pfl=40000000
12-18 18:37:54.202  1401  1868 I WindowManager:   bhv=1
12-18 18:37:54.202  1401  1868 I WindowManager:   fitTypes=207
12-18 18:37:54.202  1401  1868 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:54.202  1401  1868 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:54.213  1570  1570 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{f900981 VFE...C.. ........ 0,0-93,93}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.enforceZOrder:1539 
12-18 18:37:54.215  1570  1570 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{f900981 VFE...C.. ........ 0,0-93,93}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.enforceZOrder:1539 com.example.coverscreentester.OverlayService.setupBubble$lambda$25$lambda$24:848 
12-18 18:37:54.219  1570  1570 D ViewRootImpl: desktopMode is false
12-18 18:37:54.219  1570  1570 I ViewRootImpl: dVRR is disabled
12-18 18:37:54.228  1570  1570 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{ab2bcbd V.E...... ........ 0,0-50,50}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.enforceZOrder:1540 
12-18 18:37:54.232  1570  1570 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{ab2bcbd V.E...... ........ 0,0-50,50}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.enforceZOrder:1540 com.example.coverscreentester.OverlayService.setupBubble$lambda$25$lambda$24:848 
12-18 18:37:54.236  1570  1570 D ViewRootImpl: desktopMode is false
12-18 18:37:54.236  1570  1570 I ViewRootImpl: dVRR is disabled
12-18 18:37:54.245  1401  2251 I WindowManager: Relayout Window{f2aabd2 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=93x93 ty=2032 d0
12-18 18:37:54.246  1401  2251 D WindowManager: makeSurface duration=1 name=$_1570
12-18 18:37:54.250  1401  2251 I WindowManager: Relayout hash=f2aabd2, pid=1570, syncId=-1: mAttrs={(187,885)(93x93) gr=TOP START CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:54.250  1401  2251 I WindowManager:   fl=1000308
12-18 18:37:54.250  1401  2251 I WindowManager:   bhv=1
12-18 18:37:54.250  1401  2251 I WindowManager:   fitTypes=206
12-18 18:37:54.250  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:54.250  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:54.260  1401  2251 D WindowManager: finishDrawingWindow: Window{f2aabd2 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:54.263  1401  2255 I WindowManager: Relayout Window{e89c91 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=50x50 ty=2032 d0
12-18 18:37:54.263  1401  2255 D WindowManager: makeSurface duration=0 name=$_1570
12-18 18:37:54.265  1401  2255 I WindowManager: Relayout hash=e89c91, pid=1570, syncId=-1: mAttrs={(540,1260)(wrapxwrap) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:54.265  1401  2255 I WindowManager:   fl=1000318
12-18 18:37:54.265  1401  2255 I WindowManager:   bhv=1
12-18 18:37:54.265  1401  2255 I WindowManager:   fitTypes=206
12-18 18:37:54.265  1401  2255 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:54.265  1401  2255 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:54.272  1401  2251 D WindowManager: finishDrawingWindow: Window{e89c91 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:54.278  1401  2251 D WindowManager: finishDrawingWindow: Window{e89c91 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=HAS_DRAWN seqId=0
12-18 18:37:54.279  1401  1551 I ActivityManager: Changes in 10395 3 to 15, 144 to 0
12-18 18:37:54.608  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=119276805445000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:54.610  1401  1700 I InputDispatcher: Delivering touch to (16162): action: 0x4, f=0x0, d=0, 'c857c99', t=1 
12-18 18:37:54.610  1401  1700 I InputDispatcher: Delivering touch to (1570): action: 0x0, f=0x0, d=0, 'f2aabd2', t=1 +(-187,-885)
12-18 18:37:54.655  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=119276863250000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:54.655  1401  1700 I InputDispatcher: Delivering touch to (1570): action: 0x1, f=0x0, d=0, 'f2aabd2', t=1 +(-187,-885)
12-18 18:37:54.710  1570  1570 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{7886264 V.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.KeyboardOverlay.createKeyboardWindow:434 com.example.coverscreentester.KeyboardOverlay.show:319 
12-18 18:37:54.710  1570  1570 D ViewRootImpl: desktopMode is false
12-18 18:37:54.711  1570  1570 I ViewRootImpl: dVRR is disabled
12-18 18:37:54.721  1570  1570 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{f900981 VFE...C.. ........ 0,0-93,93}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.enforceZOrder:1539 
12-18 18:37:54.725  1570  1570 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{f900981 VFE...C.. ........ 0,0-93,93}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.enforceZOrder:1539 com.example.coverscreentester.OverlayService.toggleCustomKeyboard:1244 
12-18 18:37:54.730  1570  1570 D ViewRootImpl: desktopMode is false
12-18 18:37:54.730  1570  1570 I ViewRootImpl: dVRR is disabled
12-18 18:37:54.738  1570  1570 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{ab2bcbd V.E...... ........ 0,0-50,50}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.enforceZOrder:1540 
12-18 18:37:54.746  1570  1570 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{ab2bcbd V.E...... ........ 0,0-50,50}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.enforceZOrder:1540 com.example.coverscreentester.OverlayService.toggleCustomKeyboard:1244 
12-18 18:37:54.749  1570  1570 D ViewRootImpl: desktopMode is false
12-18 18:37:54.749  1570  1570 I ViewRootImpl: dVRR is disabled
12-18 18:37:54.757  1401  1868 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=527x444 ty=2032 d0
12-18 18:37:54.758  1401  1868 D WindowManager: makeSurface duration=1 name=$_1570
12-18 18:37:54.760  1401  1868 I WindowManager: Relayout hash=2d1b33, pid=1570, syncId=-1: mAttrs={(151,1449)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:54.760  1401  1868 I WindowManager:   fl=1040228
12-18 18:37:54.760  1401  1868 I WindowManager:   pfl=40000000
12-18 18:37:54.760  1401  1868 I WindowManager:   bhv=1
12-18 18:37:54.760  1401  1868 I WindowManager:   fitTypes=207
12-18 18:37:54.760  1401  1868 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:54.760  1401  1868 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:54.766  1401  1868 D WindowManager: finishDrawingWindow: Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:54.780  1401  1868 I WindowManager: Relayout Window{3d47b32 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=972x564 ty=2032 d0
12-18 18:37:54.781  1401  1868 D WindowManager: makeSurface duration=0 name=$_1570
12-18 18:37:54.783  1401  1868 I WindowManager: Relayout hash=3d47b32, pid=1570, syncId=-1: mAttrs={(37,1930)(972xwrap) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:54.783  1401  1868 I WindowManager:   fl=1000208
12-18 18:37:54.783  1401  1868 I WindowManager:   pfl=40000000
12-18 18:37:54.783  1401  1868 I WindowManager:   bhv=1
12-18 18:37:54.783  1401  1868 I WindowManager:   fitTypes=207
12-18 18:37:54.783  1401  1868 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:54.783  1401  1868 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:54.811  1401  3507 D WindowManager: finishDrawingWindow: Window{3d47b32 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:54.817  1401  1868 I WindowManager: Relayout Window{2abb771 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=93x93 ty=2032 d0
12-18 18:37:54.818  1401  1868 D WindowManager: makeSurface duration=1 name=$_1570
12-18 18:37:54.820  1401  1868 I WindowManager: Relayout hash=2abb771, pid=1570, syncId=-1: mAttrs={(187,885)(93x93) gr=TOP START CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:54.820  1401  1868 I WindowManager:   fl=1000308
12-18 18:37:54.820  1401  1868 I WindowManager:   bhv=1
12-18 18:37:54.820  1401  1868 I WindowManager:   fitTypes=206
12-18 18:37:54.820  1401  1868 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:54.820  1401  1868 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:54.830  1401  1868 I WindowManager: Relayout Window{cd23a5c u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=50x50 ty=2032 d0
12-18 18:37:54.830  1401  1868 D WindowManager: makeSurface duration=0 name=$_1570
12-18 18:37:54.832  1401  1868 I WindowManager: Relayout hash=cd23a5c, pid=1570, syncId=-1: mAttrs={(540,1260)(wrapxwrap) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:54.832  1401  1868 I WindowManager:   fl=1000318
12-18 18:37:54.832  1401  1868 I WindowManager:   bhv=1
12-18 18:37:54.832  1401  1868 I WindowManager:   fitTypes=206
12-18 18:37:54.832  1401  1868 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:54.832  1401  1868 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:54.835  1401  2151 D WindowManager: finishDrawingWindow: Window{2abb771 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:54.841  1570  1570 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{f900981 VFE...C.. ........ 0,0-93,93}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.enforceZOrder:1539 
12-18 18:37:54.842  1401  3507 D WindowManager: finishDrawingWindow: Window{cd23a5c u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:54.842  1570  1570 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{f900981 VFE...C.. ........ 0,0-93,93}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.enforceZOrder:1539 com.example.coverscreentester.OverlayService.setupBubble$lambda$25$lambda$24:848 
12-18 18:37:54.848  1570  1570 D ViewRootImpl: desktopMode is false
12-18 18:37:54.848  1570  1570 I ViewRootImpl: dVRR is disabled
12-18 18:37:54.855  1570  1570 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{ab2bcbd V.E...... ........ 0,0-50,50}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.enforceZOrder:1540 
12-18 18:37:54.857  1570  1570 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{ab2bcbd V.E...... ........ 0,0-50,50}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.enforceZOrder:1540 com.example.coverscreentester.OverlayService.setupBubble$lambda$25$lambda$24:848 
12-18 18:37:54.864  1570  1570 D ViewRootImpl: desktopMode is false
12-18 18:37:54.865  1570  1570 I ViewRootImpl: dVRR is disabled
12-18 18:37:54.874  1401  2151 D WindowManager: finishDrawingWindow: Window{3d47b32 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=HAS_DRAWN seqId=0
12-18 18:37:54.875  1401  3507 I WindowManager: Relayout Window{810adde u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=93x93 ty=2032 d0
12-18 18:37:54.875  1401  3507 D WindowManager: makeSurface duration=0 name=$_1570
12-18 18:37:54.880  1401  3507 I WindowManager: Relayout hash=810adde, pid=1570, syncId=-1: mAttrs={(187,885)(93x93) gr=TOP START CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:54.880  1401  3507 I WindowManager:   fl=1000308
12-18 18:37:54.880  1401  3507 I WindowManager:   bhv=1
12-18 18:37:54.880  1401  3507 I WindowManager:   fitTypes=206
12-18 18:37:54.880  1401  3507 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:54.880  1401  3507 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:54.888  1401  3507 D WindowManager: finishDrawingWindow: Window{810adde u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:54.888  1401  2251 I WindowManager: Relayout Window{b63328d u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=50x50 ty=2032 d0
12-18 18:37:54.889  1401  2251 D WindowManager: makeSurface duration=1 name=$_1570
12-18 18:37:54.891  1401  2251 I WindowManager: Relayout hash=b63328d, pid=1570, syncId=-1: mAttrs={(540,1260)(wrapxwrap) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:54.891  1401  2251 I WindowManager:   fl=1000318
12-18 18:37:54.891  1401  2251 I WindowManager:   bhv=1
12-18 18:37:54.891  1401  2251 I WindowManager:   fitTypes=206
12-18 18:37:54.891  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:54.891  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:54.898  1401  3507 D WindowManager: finishDrawingWindow: Window{b63328d u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:54.909  1401  2251 D WindowManager: finishDrawingWindow: Window{b63328d u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=HAS_DRAWN seqId=0
12-18 18:37:55.234  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=119277439112000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:55.235  1401  1700 I InputDispatcher: Delivering touch to (16162): action: 0x4, f=0x0, d=0, 'c857c99', t=1 
12-18 18:37:55.235  1401  1700 I InputDispatcher: Delivering touch to (1570): action: 0x4, f=0x0, d=0, '2d1b33 ', t=1 
12-18 18:37:55.235  1401  1700 I InputDispatcher: Delivering touch to (2045): action: 0x4, f=0x0, d=0, '253deac', t=1 
12-18 18:37:55.235  1401  1700 I InputDispatcher: Delivering touch to (2738): action: 0x0, f=0x0, d=0, '3dc2dd0', t=1 
12-18 18:37:55.278  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(948 x 1048) immediately
12-18 18:37:55.282  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-18 18:37:55.312  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(948 x 1048) immediately
12-18 18:37:55.320  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-18 18:37:55.321  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=119277521010000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:55.322  1401  1700 I InputDispatcher: Delivering touch to (2738): action: 0x1, f=0x0, d=0, '3dc2dd0', t=1 
12-18 18:37:56.330  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=119278530099000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:56.334  1401  1700 I InputDispatcher: Delivering touch to (16162): action: 0x0, f=0x0, d=0, 'c857c99', t=1 +(-50,-200)
12-18 18:37:56.428  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=119278636960000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:56.429  1401  1700 I InputDispatcher: Delivering touch to (16162): action: 0x1, f=0x0, d=0, 'c857c99', t=1 +(-50,-200)
12-18 18:37:56.432 16162 16162 W FloatingService: Layer 2038 failed (Permission?), trying Layer 2032...
12-18 18:37:56.432 16162 16162 W FloatingService: java.lang.IllegalArgumentException: Window type mismatch. Window Context's window type is 2032, while LayoutParams' type is set to 2038. Please create another Window Context via createWindowContext(getDisplay(), 2038, null) to add window with type:2038
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.WindowManagerImpl.assertWindowContextTypeMatches(WindowManagerImpl.java:195)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.WindowManagerImpl.applyTokens(WindowManagerImpl.java:173)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.WindowManagerImpl.addView(WindowManagerImpl.java:157)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at com.example.quadrantlauncher.FloatingLauncherService.toggleDrawer(FloatingLauncherService.kt:521)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at com.example.quadrantlauncher.FloatingLauncherService.access$toggleDrawer(FloatingLauncherService.kt:54)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at com.example.quadrantlauncher.FloatingLauncherService$setupBubble$1.onTouch(FloatingLauncherService.kt:403)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.View.performOnTouchCallback(View.java:17224)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.View.dispatchTouchEvent(View.java:17187)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.ViewGroup.dispatchTransformedTouchEvent(ViewGroup.java:3360)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.ViewGroup.dispatchTouchEvent(ViewGroup.java:3027)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.View.dispatchPointerEvent(View.java:17527)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$ViewPostImeInputStage.processPointerEvent(ViewRootImpl.java:9787)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$ViewPostImeInputStage.onProcess(ViewRootImpl.java:9503)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$InputStage.deliver(ViewRootImpl.java:8841)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$InputStage.onDeliverToNext(ViewRootImpl.java:8898)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$InputStage.forward(ViewRootImpl.java:8864)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$AsyncInputStage.forward(ViewRootImpl.java:9064)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$InputStage.apply(ViewRootImpl.java:8872)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$AsyncInputStage.apply(ViewRootImpl.java:9121)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$InputStage.deliver(ViewRootImpl.java:8845)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$InputStage.onDeliverToNext(ViewRootImpl.java:8898)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$InputStage.forward(ViewRootImpl.java:8864)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$InputStage.apply(ViewRootImpl.java:8872)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$InputStage.deliver(ViewRootImpl.java:8845)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.ViewRootImpl.deliverInputEvent(ViewRootImpl.java:12701)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.ViewRootImpl.doProcessInputEvents(ViewRootImpl.java:12589)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.ViewRootImpl.enqueueInputEvent(ViewRootImpl.java:12544)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.ViewRootImpl.processRawInputEvent(ViewRootImpl.java:13081)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.ViewRootImpl$WindowInputEventReceiver.onInputEvent(ViewRootImpl.java:12831)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.view.InputEventReceiver.dispatchInputEvent(InputEventReceiver.java:392)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.os.MessageQueue.nativePollOnce(Native Method)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.os.MessageQueue.nextLegacy(MessageQueue.java:913)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.os.MessageQueue.next(MessageQueue.java:1025)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.os.Looper.loopOnce(Looper.java:221)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.os.Looper.loop(Looper.java:363)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at android.app.ActivityThread.main(ActivityThread.java:9939)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at java.lang.reflect.Method.invoke(Native Method)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:632)
12-18 18:37:56.432 16162 16162 W FloatingService: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:975)
12-18 18:37:56.433 16162 16162 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{e21b085 VFE...C.. .F...... 0,0-1080,2404 aid=1}, caller=android.view.WindowManagerImpl.addView:158 com.example.quadrantlauncher.FloatingLauncherService.toggleDrawer:535 com.example.quadrantlauncher.FloatingLauncherService.access$toggleDrawer:54 
12-18 18:37:56.433 16162 16162 D ViewRootImpl: desktopMode is false
12-18 18:37:56.434 16162 16162 I ViewRootImpl: dVRR is disabled
12-18 18:37:56.447  1401  1868 D WindowManager: Changing focus from Window{3dc2dd0 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity} to Window{b3ae1c1 u0 com.katsuyamaki.DroidOSLauncher} displayId=0 Callers=com.android.server.wm.WindowManagerService.addWindowInner:565 com.android.server.wm.WindowManagerService.addWindow:1842 com.android.server.wm.Session.addToDisplayAsUser:24 android.view.IWindowSession$Stub.onTransact:757 
12-18 18:37:56.447  1401  1868 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0x227ab4b
12-18 18:37:56.447  1401  1868 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf, destroy=false, surface=Surface(name=253deac NavigationBar0)/@0x344c78e
12-18 18:37:56.447  1401  1868 I WindowManager: Reparenting to leash, surface=Surface(name=253deac NavigationBar0)/@0x344c78e, leashParent=Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf
12-18 18:37:56.448  1401  1868 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0xcf907f9
12-18 18:37:56.449  1401  1868 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=7a1affc StatusBar)/@0x9878745 - animation-leash of insets_animation)/@0x816f928
12-18 18:37:56.449  1401  1868 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{ea68ef type=2000 android.os.BinderProxy@acba6c9})/@0xe49ce9a, destroy=false, surface=Surface(name=7a1affc StatusBar)/@0x9878745
12-18 18:37:56.449  1401  1868 I WindowManager: Reparenting to leash, surface=Surface(name=7a1affc StatusBar)/@0x9878745, leashParent=Surface(name=WindowToken{ea68ef type=2000 android.os.BinderProxy@acba6c9})/@0xe49ce9a
12-18 18:37:56.450  1401  1868 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=7a1affc StatusBar)/@0x9878745 - animation-leash of insets_animation)/@0x25e259f
12-18 18:37:56.450  1401  1868 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{b3ae1c1 u0 com.katsuyamaki.DroidOSLauncher}, navColorWin=Window{3dc2dd0 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.WindowManagerService.updateFocusedWindowLocked:372 com.android.server.wm.WindowManagerService.addWindowInner:565 com.android.server.wm.WindowManagerService.addWindow:1842 
12-18 18:37:56.451  1401  1868 D WindowManager: updateSystemBarAttributes, bhv=1, apr=0, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-18 18:37:56.488  1401  2245 I WindowManager: Relayout Window{b3ae1c1 u0 com.katsuyamaki.DroidOSLauncher}: viewVisibility=0 req=1080x2404 ty=2032 d0
12-18 18:37:56.488  1401  2245 D WindowManager: makeSurface duration=0 name=$_16162
12-18 18:37:56.490  1401  2245 I WindowManager: Relayout hash=b3ae1c1, pid=16162, syncId=-1: mAttrs={(0,0)(fillxfill) gr=TOP START CENTER sim={adjust=nothing} ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:56.490  1401  2245 I WindowManager:   fl=1000300
12-18 18:37:56.490  1401  2245 I WindowManager:   bhv=1
12-18 18:37:56.490  1401  2245 I WindowManager:   fitTypes=206
12-18 18:37:56.490  1401  2245 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:56.490  1401  2245 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:56.508  1401  2251 D InputDispatcher: Once focus requested (0): b3ae1c1 com.katsuyamaki.DroidOSLauncher
12-18 18:37:56.508  1401  2251 D InputDispatcher: Focus request (0): b3ae1c1 com.katsuyamaki.DroidOSLauncher but waiting because NO_WINDOW
12-18 18:37:56.508  1401  2251 D InputDispatcher: Focus left window (0): 3dc2dd0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity
12-18 18:37:56.602  1401  2151 D WindowManager: finishDrawingWindow: Window{b3ae1c1 u0 com.katsuyamaki.DroidOSLauncher} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:56.603  1401  3507 I WindowManager: Relayout Window{c857c99 u0 com.katsuyamaki.DroidOSLauncher}: viewVisibility=8 req=63x63 ty=2032 d0
12-18 18:37:56.603  1401  3507 E WindowManager: win=Window{c857c99 u0 com.katsuyamaki.DroidOSLauncher} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=8 caller=com.android.server.wm.WindowManagerService.tryStartExitingAnimation:134 com.android.server.wm.WindowManagerService.relayoutWindow:1147 com.android.server.wm.Session.relayout:27 android.view.IWindowSession$Stub.onTransact:829 com.android.server.wm.Session.onTransact:1 android.os.Binder.execTransactInternal:1457 android.os.Binder.execTransact:1401 
12-18 18:37:56.605  1401  3507 I WindowManager: Relayout hash=c857c99, pid=16162, syncId=-1: mAttrs={(50,200)(wrapxwrap) gr=TOP START CENTER sim={adjust=pan} ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:56.605  1401  3507 I WindowManager:   fl=1040308
12-18 18:37:56.605  1401  3507 I WindowManager:   bhv=1
12-18 18:37:56.605  1401  3507 I WindowManager:   fitTypes=206
12-18 18:37:56.605  1401  3507 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:56.605  1401  3507 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:56.626  1401  3507 D InputDispatcher: Focus entered window (0): b3ae1c1 com.katsuyamaki.DroidOSLauncher
12-18 18:37:56.679  1401  1763 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-18 18:37:56.679  1401  1763 D InputMethodManagerService: shouldShowImeSwitcherLocked : checking vis : 3
12-18 18:37:56.680  1401  1763 D InputMethodManagerService: checkDisplayOfStartInputAndUpdateKeyboard: displayId=0, mFocusedDisplayId=0
12-18 18:37:56.681  1401  2151 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=898f977 InputMethod)/@0xbf9fe4d - animation-leash of insets_animation)/@0x73038c3
12-18 18:37:56.681  1401  2151 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{fe60af5 type=2011 android.os.Binder@f55e02c})/@0x17aed02, destroy=false, surface=Surface(name=898f977 InputMethod)/@0xbf9fe4d
12-18 18:37:56.681  1401  2151 I WindowManager: Reparenting to leash, surface=Surface(name=898f977 InputMethod)/@0xbf9fe4d, leashParent=Surface(name=WindowToken{fe60af5 type=2011 android.os.Binder@f55e02c})/@0x17aed02
12-18 18:37:56.682  1401  2151 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=898f977 InputMethod)/@0xbf9fe4d - animation-leash of insets_animation)/@0x6d499dd
12-18 18:37:57.274  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=119279479287000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:57.276  1401  1700 I InputDispatcher: Delivering touch to (16162): action: 0x0, f=0x0, d=0, 'b3ae1c1', t=1 +(0,-116)
12-18 18:37:57.319  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=119279527937000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:57.320  1401  1700 I InputDispatcher: Delivering touch to (16162): action: 0x1, f=0x0, d=0, 'b3ae1c1', t=1 +(0,-116)
12-18 18:37:57.325 16162 16162 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{e21b085 VFE...C.. .F.P.... 0,0-1080,2404 aid=1}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.quadrantlauncher.FloatingLauncherService.toggleDrawer:508 
12-18 18:37:57.341  1401  3076 I WindowManager: Relayout Window{c857c99 u0 com.katsuyamaki.DroidOSLauncher}: viewVisibility=0 req=63x63 ty=2032 d0
12-18 18:37:57.342  1401  3076 D WindowManager: makeSurface duration=1 name=$_16162
12-18 18:37:57.349  1401  3076 I WindowManager: Relayout hash=c857c99, pid=16162, syncId=-1: mAttrs={(50,200)(wrapxwrap) gr=TOP START CENTER sim={adjust=pan} ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:57.349  1401  3076 I WindowManager:   fl=1040308
12-18 18:37:57.349  1401  3076 I WindowManager:   bhv=1
12-18 18:37:57.349  1401  3076 I WindowManager:   fitTypes=206
12-18 18:37:57.349  1401  3076 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:57.349  1401  3076 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:57.360  1401  2151 D WindowManager: finishDrawingWindow: Window{c857c99 u0 com.katsuyamaki.DroidOSLauncher} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:57.368  1401  2151 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=898f977 InputMethod)/@0xbf9fe4d - animation-leash of insets_animation)/@0x6d499dd
12-18 18:37:57.368  1401  2151 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{fe60af5 type=2011 android.os.Binder@f55e02c})/@0x17aed02, destroy=false, surface=Surface(name=898f977 InputMethod)/@0xbf9fe4d
12-18 18:37:57.368  1401  2151 I WindowManager: Reparenting to leash, surface=Surface(name=898f977 InputMethod)/@0xbf9fe4d, leashParent=Surface(name=WindowToken{fe60af5 type=2011 android.os.Binder@f55e02c})/@0x17aed02
12-18 18:37:57.369  1401  2151 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=898f977 InputMethod)/@0xbf9fe4d - animation-leash of insets_animation)/@0x81edf7f
12-18 18:37:57.374  1401  2151 D WindowManager: Changing focus from Window{b3ae1c1 u0 com.katsuyamaki.DroidOSLauncher} to Window{3dc2dd0 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity} displayId=0 Callers=com.android.server.wm.WindowState.removeIfPossible:647 com.android.server.wm.Session.remove:16 android.view.IWindowSession$Stub.onTransact:804 com.android.server.wm.Session.onTransact:1 
12-18 18:37:57.374  1401  2151 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0xcf907f9
12-18 18:37:57.374  1401  2151 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf, destroy=false, surface=Surface(name=253deac NavigationBar0)/@0x344c78e
12-18 18:37:57.375  1401  2151 I WindowManager: Reparenting to leash, surface=Surface(name=253deac NavigationBar0)/@0x344c78e, leashParent=Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf
12-18 18:37:57.375  1401  2151 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0x1fc70aa
12-18 18:37:57.376  1401  2151 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=7a1affc StatusBar)/@0x9878745 - animation-leash of insets_animation)/@0x25e259f
12-18 18:37:57.376  1401  2151 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{ea68ef type=2000 android.os.BinderProxy@acba6c9})/@0xe49ce9a, destroy=false, surface=Surface(name=7a1affc StatusBar)/@0x9878745
12-18 18:37:57.376  1401  2151 I WindowManager: Reparenting to leash, surface=Surface(name=7a1affc StatusBar)/@0x9878745, leashParent=Surface(name=WindowToken{ea68ef type=2000 android.os.BinderProxy@acba6c9})/@0xe49ce9a
12-18 18:37:57.377  1401  2151 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=7a1affc StatusBar)/@0x9878745 - animation-leash of insets_animation)/@0x4bf49b
12-18 18:37:57.377  1401  2151 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{3dc2dd0 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, navColorWin=Window{3dc2dd0 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.WindowManagerService.updateFocusedWindowLocked:372 com.android.server.wm.WindowState.removeIfPossible:647 com.android.server.wm.Session.remove:16 
12-18 18:37:57.378  1401  2151 D WindowManager: updateSystemBarAttributes, bhv=2, apr=0, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-18 18:37:57.385  1401  3507 D InputDispatcher: Focus left window (0): b3ae1c1 com.katsuyamaki.DroidOSLauncher
12-18 18:37:57.396  1401  3507 D InputDispatcher: Once focus requested (0): 3dc2dd0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity
12-18 18:37:57.396  1401  3507 D InputDispatcher: Focus entered window (0): 3dc2dd0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity
12-18 18:37:57.405  1401  1763 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-18 18:37:57.405  1401  1763 D InputMethodManagerService: shouldShowImeSwitcherLocked : checking vis : 3
12-18 18:37:57.406  1401  1763 D InputMethodManagerService: checkDisplayOfStartInputAndUpdateKeyboard: displayId=0, mFocusedDisplayId=0
12-18 18:37:57.408  1401  2245 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=898f977 InputMethod)/@0xbf9fe4d - animation-leash of insets_animation)/@0x81edf7f
12-18 18:37:57.408  1401  2245 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{fe60af5 type=2011 android.os.Binder@f55e02c})/@0x17aed02, destroy=false, surface=Surface(name=898f977 InputMethod)/@0xbf9fe4d
12-18 18:37:57.408  1401  2245 I WindowManager: Reparenting to leash, surface=Surface(name=898f977 InputMethod)/@0xbf9fe4d, leashParent=Surface(name=WindowToken{fe60af5 type=2011 android.os.Binder@f55e02c})/@0x17aed02
12-18 18:37:57.409  1401  2245 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=898f977 InputMethod)/@0xbf9fe4d - animation-leash of insets_animation)/@0x254b44d
12-18 18:37:57.507  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=119279711832000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:57.508  1401  1700 I InputDispatcher: Delivering touch to (16162): action: 0x4, f=0x0, d=0, 'c857c99', t=1 
12-18 18:37:57.508  1401  1700 I InputDispatcher: Delivering touch to (1570): action: 0x4, f=0x0, d=0, '2d1b33 ', t=1 
12-18 18:37:57.509  1401  1700 I InputDispatcher: Delivering touch to (2045): action: 0x4, f=0x0, d=0, '253deac', t=1 
12-18 18:37:57.509  1401  1700 I InputDispatcher: Delivering touch to (2738): action: 0x0, f=0x0, d=0, '3dc2dd0', t=1 
12-18 18:37:57.552  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=119279760893000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:57.552  1401  1700 I InputDispatcher: Delivering touch to (2738): action: 0x1, f=0x0, d=0, '3dc2dd0', t=1 
12-18 18:37:59.044  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=119281243808000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:59.045  1401  1700 I InputDispatcher: Delivering touch to (16162): action: 0x4, f=0x0, d=0, 'c857c99', t=1 
12-18 18:37:59.045  1401  1700 I InputDispatcher: Delivering touch to (1570): action: 0x0, f=0x0, d=0, '810adde', t=1 +(-187,-885)
12-18 18:37:59.109  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=119281317680000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:37:59.109  1401  1700 I InputDispatcher: Delivering touch to (1570): action: 0x1, f=0x0, d=0, '810adde', t=1 +(-187,-885)
12-18 18:37:59.111  1570  1570 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{7886264 V.E...... ........ 0,0-972,564}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.KeyboardOverlay.hide:328 
12-18 18:37:59.119  1570  1570 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{f900981 VFE...C.. ........ 0,0-93,93}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.enforceZOrder:1539 
12-18 18:37:59.123  1570  1570 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{f900981 VFE...C.. ........ 0,0-93,93}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.enforceZOrder:1539 com.example.coverscreentester.OverlayService.toggleCustomKeyboard:1244 
12-18 18:37:59.134  1570  1570 D ViewRootImpl: desktopMode is false
12-18 18:37:59.134  1570  1570 I ViewRootImpl: dVRR is disabled
12-18 18:37:59.143  1570  1570 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{ab2bcbd V.E...... ........ 0,0-50,50}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.enforceZOrder:1540 
12-18 18:37:59.145  1570  1570 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{ab2bcbd V.E...... ........ 0,0-50,50}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.enforceZOrder:1540 com.example.coverscreentester.OverlayService.toggleCustomKeyboard:1244 
12-18 18:37:59.151  1401  1868 W WindowManager: Failed looking up window session=Session{1366dfc 1570:u0a10515} callers=com.android.server.wm.WindowManagerService.windowForClientLocked:1 com.android.server.wm.Session.setOnBackInvokedCallbackInfo:15 android.view.IWindowSession$Stub.onTransact:1390 
12-18 18:37:59.151  1401  1868 I WindowManager: setOnBackInvokedCallback(): No window state for package:com.katsuyamaki.DroidOSTrackpadKeyboard
12-18 18:37:59.152  1570  1570 D ViewRootImpl: desktopMode is false
12-18 18:37:59.153  1570  1570 I ViewRootImpl: dVRR is disabled
12-18 18:37:59.166  1401  1868 I WindowManager: Relayout Window{fd27003 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=93x93 ty=2032 d0
12-18 18:37:59.167  1401  1868 D WindowManager: makeSurface duration=0 name=$_1570
12-18 18:37:59.168  1401  1868 I WindowManager: Relayout hash=fd27003, pid=1570, syncId=-1: mAttrs={(187,885)(93x93) gr=TOP START CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:59.168  1401  1868 I WindowManager:   fl=1000308
12-18 18:37:59.168  1401  1868 I WindowManager:   bhv=1
12-18 18:37:59.168  1401  1868 I WindowManager:   fitTypes=206
12-18 18:37:59.168  1401  1868 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:59.168  1401  1868 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:59.175  1401  2245 D WindowManager: finishDrawingWindow: Window{fd27003 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:59.176  1401  2255 I WindowManager: Relayout Window{aed82f1 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=50x50 ty=2032 d0
12-18 18:37:59.176  1401  2255 D WindowManager: makeSurface duration=0 name=$_1570
12-18 18:37:59.178  1401  2255 I WindowManager: Relayout hash=aed82f1, pid=1570, syncId=-1: mAttrs={(540,1260)(wrapxwrap) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:59.178  1401  2255 I WindowManager:   fl=1000318
12-18 18:37:59.178  1401  2255 I WindowManager:   bhv=1
12-18 18:37:59.178  1401  2255 I WindowManager:   fitTypes=206
12-18 18:37:59.178  1401  2255 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:59.178  1401  2255 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:59.189  1401  1868 D WindowManager: finishDrawingWindow: Window{aed82f1 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:59.190  1401  1868 I WindowManager: Relayout Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=8 req=527x444 ty=2032 d0
12-18 18:37:59.191  1401  1868 E WindowManager: win=Window{2d1b33 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=8 caller=com.android.server.wm.WindowManagerService.tryStartExitingAnimation:134 com.android.server.wm.WindowManagerService.relayoutWindow:1147 com.android.server.wm.Session.relayout:27 android.view.IWindowSession$Stub.onTransact:829 com.android.server.wm.Session.onTransact:1 android.os.Binder.execTransactInternal:1457 android.os.Binder.execTransact:1401 
12-18 18:37:59.192  1401  1868 I WindowManager: Relayout hash=2d1b33, pid=1570, syncId=-1: mAttrs={(151,1449)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:59.192  1401  1868 I WindowManager:   fl=1040228
12-18 18:37:59.192  1401  1868 I WindowManager:   pfl=40000000
12-18 18:37:59.192  1401  1868 I WindowManager:   bhv=1
12-18 18:37:59.192  1401  1868 I WindowManager:   fitTypes=207
12-18 18:37:59.192  1401  1868 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:59.192  1401  1868 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:59.198  1570  1570 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{f900981 VFE...C.. ........ 0,0-93,93}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.enforceZOrder:1539 
12-18 18:37:59.200  1570  1570 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{f900981 VFE...C.. ........ 0,0-93,93}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.enforceZOrder:1539 com.example.coverscreentester.OverlayService.setupBubble$lambda$25$lambda$24:848 
12-18 18:37:59.203  1570  1570 D ViewRootImpl: desktopMode is false
12-18 18:37:59.204  1570  1570 I ViewRootImpl: dVRR is disabled
12-18 18:37:59.210  1570  1570 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{ab2bcbd V.E...... ........ 0,0-50,50}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.enforceZOrder:1540 
12-18 18:37:59.216  1570  1570 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{ab2bcbd V.E...... ........ 0,0-50,50}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.enforceZOrder:1540 com.example.coverscreentester.OverlayService.setupBubble$lambda$25$lambda$24:848 
12-18 18:37:59.219  1570  1570 D ViewRootImpl: desktopMode is false
12-18 18:37:59.219  1570  1570 I ViewRootImpl: dVRR is disabled
12-18 18:37:59.227  1401  2255 I WindowManager: Relayout Window{24da6b u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=93x93 ty=2032 d0
12-18 18:37:59.227  1401  2255 D WindowManager: makeSurface duration=0 name=$_1570
12-18 18:37:59.229  1401  2255 I WindowManager: Relayout hash=24da6b, pid=1570, syncId=-1: mAttrs={(187,885)(93x93) gr=TOP START CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:59.229  1401  2255 I WindowManager:   fl=1000308
12-18 18:37:59.229  1401  2255 I WindowManager:   bhv=1
12-18 18:37:59.229  1401  2255 I WindowManager:   fitTypes=206
12-18 18:37:59.229  1401  2255 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:59.229  1401  2255 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:59.237  1401  1868 I WindowManager: Relayout Window{ab4e35e u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=50x50 ty=2032 d0
12-18 18:37:59.237  1401  1868 D WindowManager: makeSurface duration=0 name=$_1570
12-18 18:37:59.239  1401  1868 I WindowManager: Relayout hash=ab4e35e, pid=1570, syncId=-1: mAttrs={(540,1260)(wrapxwrap) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-18 18:37:59.239  1401  1868 I WindowManager:   fl=1000318
12-18 18:37:59.239  1401  1868 I WindowManager:   bhv=1
12-18 18:37:59.239  1401  1868 I WindowManager:   fitTypes=206
12-18 18:37:59.239  1401  1868 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:37:59.239  1401  1868 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:37:59.239  1401  3507 D WindowManager: finishDrawingWindow: Window{24da6b u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:59.247  1401  1868 D WindowManager: finishDrawingWindow: Window{ab4e35e u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-18 18:37:59.255  1401  3076 D WindowManager: finishDrawingWindow: Window{ab4e35e u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=HAS_DRAWN seqId=0
12-18 18:38:00.203  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=119282408897000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:38:00.204  1401  1700 I InputDispatcher: Delivering touch to (16162): action: 0x4, f=0x0, d=0, 'c857c99', t=1 
12-18 18:38:00.204  1401  1700 I InputDispatcher: Delivering touch to (2045): action: 0x4, f=0x0, d=0, '253deac', t=1 
12-18 18:38:00.204  1401  1700 I InputDispatcher: Delivering touch to (2738): action: 0x0, f=0x0, d=0, '3dc2dd0', t=1 
12-18 18:38:00.272  1401  3507 I InputDispatcher: Channel [Gesture Monitor] swipe-up is stealing input gesture for device 3 from [3dc2dd0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity, 5b7421b com.android.systemui.wallpapers.ImageWallpaper, [Gesture Monitor] clo, [Gesture Monitor] secinputdev, [Gesture Monitor] PalmMotion, [Gesture Monitor] edge-swipe]
12-18 18:38:00.272  1401  3507 D InputDispatcher: Cancel for '3dc2dd0': input channel stole pointer stream, m=1
12-18 18:38:00.272  1401  3507 I InputDispatcher: Delivering touch to (2738): action: 0x3, f=0x20, d=0, '3dc2dd0', t=1 
12-18 18:38:00.272  1401  3507 D InputDispatcher: Cancel for '5b7421b': input channel stole pointer stream, m=1
12-18 18:38:00.293  1401  1542 D WindowManager: requestTransientBars: swipeTarget=Window{253deac u0 NavigationBar0}, controlTarget=Window{3dc2dd0 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, canShowTransient=true, restorePositionTypes=0x3, from=com.android.server.wm.DisplayPolicy$1.onSwipeFromBottom:21 com.android.server.wm.SystemGesturesPointerEventListener.onPointerEvent:545 
12-18 18:38:00.421  1401  3507 D InputDispatcher: Inject key (2738/10155): action=0, f=0x48, d=0, time=119282630000000
12-18 18:38:00.422  1401  2255 D InputDispatcher: Inject key (2738/10155): action=1, f=0x48, d=0, time=119282632000000
12-18 18:38:00.445  1401  3507 D WindowManager: Transition is created, t=TransitionRecord{9e8d9c5 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-18 18:38:00.450  1401  3507 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{3dc2dd0 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}
12-18 18:38:00.452  1401  3507 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{16d9d50 u0 com.sec.android.app.launcher/com.android.quickstep.RecentsActivity}
12-18 18:38:00.453  1401  3507 D InputDispatcher: Focused application(0): ActivityRecord{226040612 u0 com.sec.android.app.launcher/com.android.quickstep.RecentsActivity t17650}
12-18 18:38:00.453  1401  3507 D WindowManager: Changing focus from Window{3dc2dd0 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity} to null displayId=0 Callers=com.android.server.wm.ActivityTaskManagerService.setLastResumedActivityUncheckLocked:264 com.android.server.wm.ActivityTaskSupervisor.updateTopResumedActivityIfNeeded:49 com.android.server.wm.TaskFragment.setResumedActivity:30 com.android.server.wm.ActivityRecord.setState:100 
12-18 18:38:00.455  1401  3507 D WindowManager: rotationForOrientation, orientationSource=ActivityRecord{226040612 u0 com.sec.android.app.launcher/com.android.quickstep.RecentsActivity t17650}
12-18 18:38:00.457  1401  3507 I WindowManager: Reparenting to leash, surface=Surface(name=1aa7434 FreeformContainer)/@0x4f2b598, leashParent=Surface(name=WindowToken{b8c572b type=2604 android.os.BinderProxy@f0783a5})/@0xa3bd1f1
12-18 18:38:00.457  1401  3507 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=1aa7434 FreeformContainer)/@0x4f2b598 - animation-leash of window_animation)/@0xff968be
12-18 18:38:00.474  1401  2245 D InputDispatcher: Once focus requested (0): <null>
12-18 18:38:00.475  1401  2245 D InputDispatcher: Focus request (0): <null> but waiting because NO_WINDOW
12-18 18:38:00.475  1401  2245 D InputDispatcher: Focus left window (0): 3dc2dd0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity
12-18 18:38:00.479  1401  3076 I WindowManager: Relayout Window{16d9d50 u0 com.sec.android.app.launcher/com.android.quickstep.RecentsActivity}: viewVisibility=0 req=1080x2520 ty=1 d0
12-18 18:38:00.480  1401  3076 D WindowManager: makeSurface duration=1 name=com.sec.android.app.launcher/com.android.quickstep.RecentsActivity$_2738
12-18 18:38:00.481  1401  3076 D WindowManager: Changing focus from null to Window{16d9d50 u0 com.sec.android.app.launcher/com.android.quickstep.RecentsActivity} displayId=0 Callers=com.android.server.wm.WindowManagerService.relayoutWindow:1359 com.android.server.wm.Session.relayout:27 android.view.IWindowSession$Stub.onTransact:829 com.android.server.wm.Session.onTransact:1 
12-18 18:38:00.481  1401  3076 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0x1fc70aa
12-18 18:38:00.481  1401  3076 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf, destroy=false, surface=Surface(name=253deac NavigationBar0)/@0x344c78e
12-18 18:38:00.481  1401  3076 I WindowManager: Reparenting to leash, surface=Surface(name=253deac NavigationBar0)/@0x344c78e, leashParent=Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf
12-18 18:38:00.482  1401  3076 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0xcbe35
12-18 18:38:00.482  1401  3076 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=7a1affc StatusBar)/@0x9878745 - animation-leash of insets_animation)/@0x4bf49b
12-18 18:38:00.482  1401  3076 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{ea68ef type=2000 android.os.BinderProxy@acba6c9})/@0xe49ce9a, destroy=false, surface=Surface(name=7a1affc StatusBar)/@0x9878745
12-18 18:38:00.482  1401  3076 I WindowManager: Reparenting to leash, surface=Surface(name=7a1affc StatusBar)/@0x9878745, leashParent=Surface(name=WindowToken{ea68ef type=2000 android.os.BinderProxy@acba6c9})/@0xe49ce9a
12-18 18:38:00.482  1401  3076 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=7a1affc StatusBar)/@0x9878745 - animation-leash of insets_animation)/@0xb0bfc3b
12-18 18:38:00.483  1401  3076 I WindowManager: Relayout hash=16d9d50, pid=2738, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION fmt=TRANSPARENT wanim=0x1030306
12-18 18:38:00.483  1401  3076 I WindowManager:   fl=81910100
12-18 18:38:00.483  1401  3076 I WindowManager:   pfl=10008840
12-18 18:38:00.483  1401  3076 I WindowManager:   bhv=2
12-18 18:38:00.483  1401  3076 I WindowManager:   fitSides=0
12-18 18:38:00.483  1401  3076 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:38:00.483  1401  3076 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-18 18:38:00.483  1401  3076 I WindowManager:   sfl=4000000}
12-18 18:38:00.491  1401  2245 D WindowManager: finishDrawingWindow: Window{16d9d50 u0 com.sec.android.app.launcher/com.android.quickstep.RecentsActivity} mDrawState=DRAW_PENDING seqId=0
12-18 18:38:00.498  1401  3507 D InputDispatcher: Once focus requested (0): 16d9d50 com.sec.android.app.launcher/com.android.quickstep.RecentsActivity
12-18 18:38:00.498  1401  3507 D InputDispatcher: Focus request (0): 16d9d50 com.sec.android.app.launcher/com.android.quickstep.RecentsActivity but waiting because NO_WINDOW
12-18 18:38:00.548  1401  2251 D InputDispatcher: Focus entered window (0): 16d9d50 com.sec.android.app.launcher/com.android.quickstep.RecentsActivity
12-18 18:38:00.564  1401  1763 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-18 18:38:00.564  1401  1763 D InputMethodManagerService: shouldShowImeSwitcherLocked : checking vis : 3
12-18 18:38:00.564  1401  1763 D InputMethodManagerService: checkDisplayOfStartInputAndUpdateKeyboard: displayId=0, mFocusedDisplayId=0
12-18 18:38:00.565  1401  2245 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=898f977 InputMethod)/@0xbf9fe4d - animation-leash of insets_animation)/@0x254b44d
12-18 18:38:00.565  1401  2245 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{fe60af5 type=2011 android.os.Binder@f55e02c})/@0x17aed02, destroy=false, surface=Surface(name=898f977 InputMethod)/@0xbf9fe4d
12-18 18:38:00.565  1401  2245 I WindowManager: Reparenting to leash, surface=Surface(name=898f977 InputMethod)/@0xbf9fe4d, leashParent=Surface(name=WindowToken{fe60af5 type=2011 android.os.Binder@f55e02c})/@0x17aed02
12-18 18:38:00.566  1401  2245 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=898f977 InputMethod)/@0xbf9fe4d - animation-leash of insets_animation)/@0x2af7d6e
12-18 18:38:00.599  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=119282808379000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:38:00.669  1401  1545 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{b8c572b type=2604 android.os.BinderProxy@f0783a5})/@0xa3bd1f1, destroy=true, surface=Surface(name=1aa7434 FreeformContainer)/@0x4f2b598
12-18 18:38:00.837  1401  2245 I WindowManager: Relayout Window{3dc2dd0 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}: viewVisibility=8 req=1080x2520 ty=1 d0
12-18 18:38:00.838  1401  2245 I WindowManager: Relayout hash=3dc2dd0, pid=2738, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=nothing forwardNavigation} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION fmt=TRANSPARENT wanim=0x1030306
12-18 18:38:00.838  1401  2245 I WindowManager:   fl=81910100
12-18 18:38:00.838  1401  2245 I WindowManager:   pfl=10008840
12-18 18:38:00.838  1401  2245 I WindowManager:   bhv=2
12-18 18:38:00.838  1401  2245 I WindowManager:   fitSides=0
12-18 18:38:00.838  1401  2245 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:38:00.838  1401  2245 I WindowManager:   dvrrWindowFrameRateHint=true screenDimDuration=200000 naviIconColor=0}
12-18 18:38:00.849  1401  2255 E WindowManager: win=Window{3dc2dd0 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=8 caller=com.android.server.wm.ActivityRecord.destroySurfaces:25 com.android.server.wm.ActivityRecord.activityStopped:192 com.android.server.wm.ActivityClientController.activityStopped:97 android.app.IActivityClientController$Stub.onTransact:726 com.android.server.wm.ActivityClientController.onTransact:1 android.os.Binder.execTransactInternal:1462 android.os.Binder.execTransact:1401 
12-18 18:38:03.490  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=119285685195000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:38:03.492  1401  1700 I InputDispatcher: Delivering touch to (16162): action: 0x4, f=0x0, d=0, 'c857c99', t=1 
12-18 18:38:03.493  1401  1700 I InputDispatcher: Delivering touch to (2045): action: 0x4, f=0x0, d=0, '253deac', t=1 
12-18 18:38:03.493  1401  1700 I InputDispatcher: Delivering touch to (2738): action: 0x0, f=0x0, d=0, '16d9d50', t=1 
12-18 18:38:03.549  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(948 x 1048) immediately
12-18 18:38:03.561  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-18 18:38:03.565  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=119285772719000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:38:03.566  1401  1700 I InputDispatcher: Delivering touch to (2738): action: 0x1, f=0x0, d=0, '16d9d50', t=1 
12-18 18:38:03.580  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(948 x 1048) immediately
12-18 18:38:03.586  1401  1469 D WindowManager: Transition is created, t=TransitionRecord{89ef7cd id=-1 type=TO_FRONT flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createTransition:17 com.android.server.wm.ActivityTaskSupervisor.findTaskToMoveToFront:96 com.android.server.wm.ActivityTaskManagerService.moveTaskToFrontLocked:200 com.android.server.wm.ActivityTaskSupervisor.startActivityFromRecents:727 
12-18 18:38:03.587  1401  1469 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{1230479 u0 com.termux/com.termux.app.TermuxActivity}
12-18 18:38:03.596  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-18 18:38:03.602  1401  2245 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{90b0fc u0 SnapshotStartingWindow for taskId=17882}
12-18 18:38:03.606  1401  3507 D InputDispatcher: Focused application(0): ActivityRecord{99426944 u0 com.termux/.app.TermuxActivity t17882}
12-18 18:38:03.606  1401  3507 D WindowManager: Changing focus from Window{16d9d50 u0 com.sec.android.app.launcher/com.android.quickstep.RecentsActivity} to null displayId=0 Callers=com.android.server.wm.ActivityTaskManagerService.setLastResumedActivityUncheckLocked:264 com.android.server.wm.ActivityTaskSupervisor.updateTopResumedActivityIfNeeded:49 com.android.server.wm.TaskFragment.setResumedActivity:30 com.android.server.wm.ActivityRecord.setState:100 
12-18 18:38:03.607  1401  3507 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{16d9d50 u0 com.sec.android.app.launcher/com.android.quickstep.RecentsActivity}
12-18 18:38:03.608  1401  3507 D WindowManager: rotationForOrientation, orientationSource=null
12-18 18:38:03.611 13489 13489 D ViewRootImpl: Skipping stats log for color mode
12-18 18:38:03.613  1401  3076 I WindowManager: Relayout Window{90b0fc u0 SnapshotStartingWindow for taskId=17882}: viewVisibility=0 req=-1x-1 ty=3 d0
12-18 18:38:03.613  1401  3076 D WindowManager: makeSurface duration=1 name=SnapshotStartingWindow for taskId=17882$_2045
12-18 18:38:03.615  1401  3076 I WindowManager: Relayout hash=90b0fc, pid=2045, syncId=-1: mAttrs={(0,0)(fillxfill) ty=APPLICATION_STARTING fmt=RGBA_8888 wanim=0x1030317 if=INPUT_FEATURE_NO_INPUT_CHANNEL
12-18 18:38:03.615  1401  3076 I WindowManager:   fl=8c010118
12-18 18:38:03.615  1401  3076 I WindowManager:   pfl=30008000
12-18 18:38:03.615  1401  3076 I WindowManager:   bhv=1
12-18 18:38:03.615  1401  3076 I WindowManager:   fitSides=0
12-18 18:38:03.615  1401  3076 I WindowManager:   frameRateBoostOnTouch=true naviIconColor=0}
12-18 18:38:03.617  1401  3076 D WindowManager: finishDrawingWindow: Window{90b0fc u0 SnapshotStartingWindow for taskId=17882} mDrawState=DRAW_PENDING seqId=2147483647
12-18 18:38:03.624  1401  2245 I WindowManager: Relayout Window{1230479 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x2520 ty=1 d0
12-18 18:38:03.624  1401  2245 D WindowManager: makeSurface duration=0 name=com.termux/com.termux.app.TermuxActivity$_13489
12-18 18:38:03.625  1401  2245 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0xcbe35
12-18 18:38:03.625  1401  2245 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf, destroy=false, surface=Surface(name=253deac NavigationBar0)/@0x344c78e
12-18 18:38:03.625  1401  2245 I WindowManager: Reparenting to leash, surface=Surface(name=253deac NavigationBar0)/@0x344c78e, leashParent=Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf
12-18 18:38:03.625  1401  2245 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0xc54b139
12-18 18:38:03.626  1401  2245 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=7a1affc StatusBar)/@0x9878745 - animation-leash of insets_animation)/@0xb0bfc3b
12-18 18:38:03.626  1401  2245 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{ea68ef type=2000 android.os.BinderProxy@acba6c9})/@0xe49ce9a, destroy=false, surface=Surface(name=7a1affc StatusBar)/@0x9878745
12-18 18:38:03.626  1401  2245 I WindowManager: Reparenting to leash, surface=Surface(name=7a1affc StatusBar)/@0x9878745, leashParent=Surface(name=WindowToken{ea68ef type=2000 android.os.BinderProxy@acba6c9})/@0xe49ce9a
12-18 18:38:03.626  1401  2245 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=7a1affc StatusBar)/@0x9878745 - animation-leash of insets_animation)/@0xd4710df
12-18 18:38:03.627  1401  2245 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{1230479 u0 com.termux/com.termux.app.TermuxActivity}, navColorWin=Window{1230479 u0 com.termux/com.termux.app.TermuxActivity}, caller=com.android.server.wm.DisplayPolicy.finishPostLayoutPolicyLw:17 com.android.server.wm.RootWindowContainer.applySurfaceChangesTransaction$1:195 com.android.server.wm.RootWindowContainer.performSurfacePlacementNoTrace:86 
12-18 18:38:03.627  1401  2245 D WindowManager: updateSystemBarAttributes, bhv=1, apr=0, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-1
12-18 18:38:03.627  1401  2245 D WindowManager: Changing focus from null to Window{1230479 u0 com.termux/com.termux.app.TermuxActivity} displayId=0 Callers=com.android.server.wm.WindowManagerService.relayoutWindow:1359 com.android.server.wm.Session.relayout:27 android.view.IWindowSession$Stub.onTransact:829 com.android.server.wm.Session.onTransact:1 
12-18 18:38:03.628  1401  1868 D InputDispatcher: Once focus requested (0): <null>
12-18 18:38:03.628  1401  2245 I WindowManager: Relayout hash=1230479, pid=13489, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-18 18:38:03.628  1401  2245 I WindowManager:   fl=8d810100
12-18 18:38:03.628  1401  2245 I WindowManager:   pfl=10008040
12-18 18:38:03.628  1401  2245 I WindowManager:   vsysui=700
12-18 18:38:03.628  1401  2245 I WindowManager:   bhv=1
12-18 18:38:03.628  1401  2245 I WindowManager:   fitSides=0
12-18 18:38:03.628  1401  2245 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:38:03.628  1401  2245 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:38:03.628  1401  1868 D InputDispatcher: Focus request (0): <null> but waiting because NO_WINDOW
12-18 18:38:03.628  1401  1868 D InputDispatcher: Focus left window (0): 16d9d50 com.sec.android.app.launcher/com.android.quickstep.RecentsActivity
12-18 18:38:03.633  1401  1544 I ActivityManager: Changes in 10342 4 to 2, 254 to 255
12-18 18:38:03.646  1401  1868 D InputDispatcher: Once focus requested (0): 1230479 com.termux/com.termux.app.TermuxActivity
12-18 18:38:03.646  1401  1868 D InputDispatcher: Focus request (0): 1230479 com.termux/com.termux.app.TermuxActivity but waiting because NOT_VISIBLE
12-18 18:38:03.655  1401  2245 D WindowManager: finishDrawingWindow: Window{1230479 u0 com.termux/com.termux.app.TermuxActivity} mDrawState=DRAW_PENDING seqId=0
12-18 18:38:03.668  1401  1553 I ActivityManager: Start proc 18316:com.whatsapp/u0a373 for service {com.whatsapp/androidx.work.impl.background.systemjob.SystemJobService}
12-18 18:38:03.668  1401  1553 I ActivityManager: ProcessObserver broadcast disabled
12-18 18:38:03.673  1401  3076 D InputDispatcher: Focus entered window (0): 1230479 com.termux/com.termux.app.TermuxActivity
12-18 18:38:03.676  1401  1763 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-18 18:38:03.677  1401  1763 D InputMethodManagerService: shouldShowImeSwitcherLocked : checking vis : 3
12-18 18:38:03.677  1401  1763 D InputMethodManagerService: checkDisplayOfStartInputAndUpdateKeyboard: displayId=0, mFocusedDisplayId=0
12-18 18:38:03.677  1401  1763 D InputMethodManagerService: ACCESS_CONTROL_ENABLED = false, ACCESS_CONTROL_KEYBOARD_BLOCK = true
12-18 18:38:03.680  1401  1763 I ActivityManager: Changes in 10332 7 to 5, 128 to 255
12-18 18:38:03.681  1401  1763 I ActivityManager: Changes in 10122 7 to 5, 128 to 184
12-18 18:38:03.681  1401  1763 I InputMethodManagerService: attachNewInputLocked: showCurrentInputInternal, softInputModeState=STATE_UNSPECIFIED|ADJUST_RESIZE|IS_FORWARD_NAVIGATION
12-18 18:38:03.681  1401  2245 I InputMethodManagerService: isAccessoryKeyboard 0
12-18 18:38:03.682  1401  2247 I InputMethodManagerService: isAccessoryKeyboard 0
12-18 18:38:03.684  1401  3076 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=898f977 InputMethod)/@0xbf9fe4d - animation-leash of insets_animation)/@0x2af7d6e
12-18 18:38:03.684  1401  3076 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{fe60af5 type=2011 android.os.Binder@f55e02c})/@0x17aed02, destroy=false, surface=Surface(name=898f977 InputMethod)/@0xbf9fe4d
12-18 18:38:03.684  1401  3076 I WindowManager: Reparenting to leash, surface=Surface(name=898f977 InputMethod)/@0xbf9fe4d, leashParent=Surface(name=WindowToken{fe60af5 type=2011 android.os.Binder@f55e02c})/@0x17aed02
12-18 18:38:03.685  1401  3076 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=898f977 InputMethod)/@0xbf9fe4d - animation-leash of insets_animation)/@0x3ef4019
12-18 18:38:03.686  1401  1544 D InputMethodManagerService: ACCESS_CONTROL_ENABLED = false, ACCESS_CONTROL_KEYBOARD_BLOCK = true
12-18 18:38:03.695  1401  1469 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-18 18:38:03.695  1401  1469 D InputMethodManagerService: shouldShowImeSwitcherLocked : checking vis : 3
12-18 18:38:03.695  1401  1469 I InputMethodManagerService: setImeWindowStatus: vis=3, backDisposition=0
12-18 18:38:03.697  1401  1469 I WindowManager: Relayout Window{898f977 u0 InputMethod}: viewVisibility=0 req=1080x2404 ty=2011 d0
12-18 18:38:03.698  1401  1469 D WindowManager: makeSurface duration=1 name=InputMethod$_19314
12-18 18:38:03.698  1401  1469 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0xc54b139
12-18 18:38:03.698  1401  1469 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf, destroy=false, surface=Surface(name=253deac NavigationBar0)/@0x344c78e
12-18 18:38:03.698  1401  1469 I WindowManager: Reparenting to leash, surface=Surface(name=253deac NavigationBar0)/@0x344c78e, leashParent=Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf
12-18 18:38:03.699  1401  1469 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0xc6e490
12-18 18:38:03.700  1401  1469 I WindowManager: Relayout hash=898f977, pid=19314, syncId=-1: mAttrs={(0,0)(fillxfill) gr=BOTTOM CENTER_VERTICAL sim={adjust=pan} ty=INPUT_METHOD fmt=TRANSPARENT wanim=0x1030056 preferredMinDisplayRefreshRate=60.0 receive insets ignoring z-order
12-18 18:38:03.700  1401  1469 I WindowManager:   fl=81800108
12-18 18:38:03.700  1401  1469 I WindowManager:   pfl=14000000
12-18 18:38:03.700  1401  1469 I WindowManager:   bhv=1
12-18 18:38:03.700  1401  1469 I WindowManager:   fitTypes=3
12-18 18:38:03.700  1401  1469 I WindowManager:   fitSides=7
12-18 18:38:03.700  1401  1469 I WindowManager:   fitIgnoreVis
12-18 18:38:03.700  1401  1469 I WindowManager:   dvrrWindowFrameRateHint=true
12-18 18:38:03.700  1401  1469 I WindowManager:  dimAmount=0.18 dimDuration=150 naviIconColor=0}
12-18 18:38:03.704  1401  2773 D WindowManager: setInsetsWindow Window{898f977 u0 InputMethod}, contentInsets=Rect(0, 2329 - 0, 0) -> Rect(0, 1904 - 0, 0), visibleInsets=Rect(0, 2329 - 0, 0) -> Rect(0, 1904 - 0, 0), touchableRegion=SkRegion() -> SkRegion((0,1904,1080,2404)), touchableInsets 3 -> 3
12-18 18:38:03.710  1401  1469 I InputMethodManagerService: isAccessoryKeyboard 0
12-18 18:38:03.711  1401  2247 I InputMethodManagerService: isAccessoryKeyboard 0
12-18 18:38:03.716  1401  2773 D WindowManager: finishDrawingWindow: Window{898f977 u0 InputMethod} mDrawState=DRAW_PENDING seqId=0
12-18 18:38:03.722  1401  2773 D WindowManager: finishDrawingWindow: Window{898f977 u0 InputMethod} mDrawState=HAS_DRAWN seqId=0
12-18 18:38:03.722  1401  2251 D WindowManager: Starting window removed Window{90b0fc u0 SnapshotStartingWindow for taskId=17882}
12-18 18:38:03.722  1401  2251 I WindowManager: Reparenting to leash, surface=Surface(name=90b0fc SnapshotStartingWindow for taskId=17882)/@0xda5f7a7, leashParent=Surface(name=ActivityRecord{99426944 u0 com.termux/.app.TermuxActivity t17882})/@0x17b2782
12-18 18:38:03.723  1401  2251 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=90b0fc SnapshotStartingWindow for taskId=17882)/@0xda5f7a7 - animation-leash of window_animation)/@0x3498454
12-18 18:38:03.736  1401  2151 I WindowManager: Relayout Window{1230479 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x2520 ty=1 d0
12-18 18:38:03.740  1401  2151 I WindowManager: Relayout hash=1230479, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-18 18:38:03.740  1401  2151 I WindowManager:   fl=8d810100
12-18 18:38:03.740  1401  2151 I WindowManager:   pfl=10008040
12-18 18:38:03.740  1401  2151 I WindowManager:   vsysui=700
12-18 18:38:03.740  1401  2151 I WindowManager:   bhv=1
12-18 18:38:03.740  1401  2151 I WindowManager:   fitSides=0
12-18 18:38:03.740  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:38:03.740  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-18 18:38:03.831  1401  2151 I ActivityManager: Changes in 10373 19 to 8, 0 to 128
12-18 18:38:03.875  1401  1545 I WindowManager: Reparenting to original parent: Surface(name=ActivityRecord{99426944 u0 com.termux/.app.TermuxActivity t17882})/@0x17b2782, destroy=true, surface=Surface(name=90b0fc SnapshotStartingWindow for taskId=17882)/@0xda5f7a7
12-18 18:38:03.875  1401  1545 E WindowManager: win=Window{90b0fc u0 SnapshotStartingWindow for taskId=17882 EXITING} destroySurfaces: appStopped=false cleanupOnResume=false win.mWindowRemovalAllowed=true win.mRemoveOnExit=true win.mViewVisibility=0 caller=com.android.server.wm.WindowState.onExitAnimationDone:224 com.android.server.wm.WindowState.onAnimationFinished:161 com.android.server.wm.WindowContainer$$ExternalSyntheticLambda8.onAnimationFinished:3 com.android.server.wm.SurfaceAnimator$$ExternalSyntheticLambda0.onAnimationFinished:69 com.android.server.wm.LocalAnimationAdapter$$ExternalSyntheticLambda0.run:10 android.os.Handler.handleCallback:995 android.os.Handler.dispatchMessage:103 
12-18 18:38:03.932  1401  2245 I ActivityManager: Changes in 10373 8 to 10, 128 to 0
12-18 18:38:03.995  1401  2245 I WindowManager: Relayout Window{16d9d50 u0 com.sec.android.app.launcher/com.android.quickstep.RecentsActivity}: viewVisibility=8 req=1080x2520 ty=1 d0
12-18 18:38:03.997  1401  2245 I WindowManager: Relayout hash=16d9d50, pid=2738, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION fmt=TRANSPARENT wanim=0x1030306
12-18 18:38:03.997  1401  2245 I WindowManager:   fl=81910100
12-18 18:38:03.997  1401  2245 I WindowManager:   pfl=10008840
12-18 18:38:03.997  1401  2245 I WindowManager:   bhv=2
12-18 18:38:03.997  1401  2245 I WindowManager:   fitSides=0
12-18 18:38:03.997  1401  2245 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:38:03.997  1401  2245 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-18 18:38:03.997  1401  2245 I WindowManager:   sfl=4000000}
12-18 18:38:04.002  1401  1868 I WindowManager: Relayout Window{16d9d50 u0 com.sec.android.app.launcher/com.android.quickstep.RecentsActivity}: viewVisibility=8 req=1080x2520 ty=1 d0
12-18 18:38:04.004  1401  1868 I WindowManager: Relayout hash=16d9d50, pid=2738, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=pan} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION fmt=TRANSPARENT wanim=0x1030306
12-18 18:38:04.004  1401  1868 I WindowManager:   fl=81910100
12-18 18:38:04.004  1401  1868 I WindowManager:   pfl=10008840
12-18 18:38:04.004  1401  1868 I WindowManager:   bhv=2
12-18 18:38:04.004  1401  1868 I WindowManager:   fitSides=0
12-18 18:38:04.004  1401  1868 I WindowManager:   frameRateBoostOnTouch=true
12-18 18:38:04.004  1401  1868 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-18 18:38:04.004  1401  1868 I WindowManager:   sfl=4000000}
12-18 18:38:04.006  1401  1868 E WindowManager: win=Window{16d9d50 u0 com.sec.android.app.launcher/com.android.quickstep.RecentsActivity} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=8 caller=com.android.server.wm.ActivityRecord.destroySurfaces:25 com.android.server.wm.ActivityRecord.activityStopped:192 com.android.server.wm.ActivityClientController.activityStopped:97 android.app.IActivityClientController$Stub.onTransact:726 com.android.server.wm.ActivityClientController.onTransact:1 android.os.Binder.execTransactInternal:1462 android.os.Binder.execTransact:1401 
12-18 18:38:04.007  1401  1544 I ActivityManager: Changes in 10155 2 to 5, 255 to 184
12-18 18:38:04.715  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=119286917182000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:38:04.716  1401  1700 I InputDispatcher: Delivering touch to (16162): action: 0x4, f=0x0, d=0, 'c857c99', t=1 
12-18 18:38:04.717  1401  1700 I InputDispatcher: Delivering touch to (2045): action: 0x4, f=0x0, d=0, '253deac', t=1 
12-18 18:38:04.717  1401  1700 I InputDispatcher: Delivering touch to (13489): action: 0x0, f=0x0, d=0, '1230479', t=1 
12-18 18:38:04.805  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=119287013685000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:38:04.806  1401  1700 I InputDispatcher: Delivering touch to (13489): action: 0x1, f=0x0, d=0, '1230479', t=1 
12-18 18:38:05.675  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=119287880274000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-18 18:38:05.676  1401  1700 I InputDispatcher: Delivering touch to (16162): action: 0x4, f=0x0, d=0, 'c857c99', t=1 
12-18 18:38:05.677  1401  1700 I InputDispatcher: Delivering touch to (2045): action: 0x4, f=0x0, d=0, '253deac', t=1 
12-18 18:38:05.677  1401  1700 I InputDispatcher: Delivering touch to (19314): action: 0x0, f=0x0, d=0, '898f977', t=1 +(0,-116)
