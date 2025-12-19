--------- beginning of system
12-20 00:05:37.172  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
--------- beginning of main
12-20 00:05:38.254  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=185506093512000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-20 00:05:38.255  1401  1700 I InputDispatcher: Delivering touch to (3972): action: 0x0, f=0x0, d=0, 'c3b8059', t=1 +(-50,-200)
12-20 00:05:38.267  1401  3076 E InputDispatcher: Embedded{TaskInputSink of Surface(name=Decor container of Task=18195)/@0x417d4e1} has feature NO_INPUT_WINDOW, but a non-null token. Clearing
12-20 00:05:38.299  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-20 00:05:38.349  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=185506192896000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-20 00:05:38.349  1401  1700 I InputDispatcher: Delivering touch to (3972): action: 0x1, f=0x0, d=0, 'c3b8059', t=1 +(-50,-200)
12-20 00:05:38.350  3972  3972 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{ffc88d0 VFE...C.. .F...... 0,0-1080,2404 aid=1}, caller=android.view.WindowManagerImpl.addView:158 com.example.quadrantlauncher.FloatingLauncherService.toggleDrawer:546 com.example.quadrantlauncher.FloatingLauncherService.access$toggleDrawer:54 
12-20 00:05:38.351  3972  3972 D ViewRootImpl: desktopMode is false
12-20 00:05:38.351  3972  3972 I ViewRootImpl: dVRR is disabled
12-20 00:05:38.362  1401  2221 D WindowManager: Changing focus from Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity} to Window{b01e375 u0 com.katsuyamaki.DroidOSLauncher} displayId=0 Callers=com.android.server.wm.WindowManagerService.addWindowInner:565 com.android.server.wm.WindowManagerService.addWindow:1842 com.android.server.wm.Session.addToDisplayAsUser:24 android.view.IWindowSession$Stub.onTransact:757 
12-20 00:05:38.362  1401  2221 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=7a1affc StatusBar)/@0x9878745 - animation-leash of insets_animation)/@0xded6cea
12-20 00:05:38.362  1401  2221 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{ea68ef type=2000 android.os.BinderProxy@acba6c9})/@0xe49ce9a, destroy=false, surface=Surface(name=7a1affc StatusBar)/@0x9878745
12-20 00:05:38.362  1401  2221 I WindowManager: Reparenting to leash, surface=Surface(name=7a1affc StatusBar)/@0x9878745, leashParent=Surface(name=WindowToken{ea68ef type=2000 android.os.BinderProxy@acba6c9})/@0xe49ce9a
12-20 00:05:38.363  1401  2221 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=7a1affc StatusBar)/@0x9878745 - animation-leash of insets_animation)/@0x284e598
12-20 00:05:38.363  1401  2221 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{b01e375 u0 com.katsuyamaki.DroidOSLauncher}, navColorWin=Window{b217ba3 u0 InputMethod}, caller=com.android.server.wm.WindowManagerService.updateFocusedWindowLocked:372 com.android.server.wm.WindowManagerService.addWindowInner:565 com.android.server.wm.WindowManagerService.addWindow:1842 
12-20 00:05:38.363  1401  2221 D WindowManager: updateSystemBarAttributes, bhv=1, apr=1048576, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-20 00:05:38.381  1401  3076 I WindowManager: Relayout Window{b01e375 u0 com.katsuyamaki.DroidOSLauncher}: viewVisibility=0 req=1080x2404 ty=2032 d0
12-20 00:05:38.382  1401  3076 D WindowManager: makeSurface duration=0 name=$_3972
12-20 00:05:38.384  1401  3076 I WindowManager: Relayout hash=b01e375, pid=3972, syncId=-1: mAttrs={(0,0)(fillxfill) gr=TOP START CENTER sim={adjust=nothing} ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-20 00:05:38.384  1401  3076 I WindowManager:   fl=1000300
12-20 00:05:38.384  1401  3076 I WindowManager:   bhv=1
12-20 00:05:38.384  1401  3076 I WindowManager:   fitTypes=206
12-20 00:05:38.384  1401  3076 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:38.384  1401  3076 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:38.402  1401  2168 D InputDispatcher: Once focus requested (0): b01e375 com.katsuyamaki.DroidOSLauncher
12-20 00:05:38.402  1401  2168 D InputDispatcher: Focus request (0): b01e375 com.katsuyamaki.DroidOSLauncher but waiting because NO_WINDOW
12-20 00:05:38.402  1401  2168 D InputDispatcher: Focus left window (0): dea7911 com.termux/com.termux.app.TermuxActivity
12-20 00:05:38.523  1401  2247 I WindowManager: Relayout Window{c3b8059 u0 com.katsuyamaki.DroidOSLauncher}: viewVisibility=8 req=63x63 ty=2032 d0
12-20 00:05:38.523  1401  2247 E WindowManager: win=Window{c3b8059 u0 com.katsuyamaki.DroidOSLauncher} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=8 caller=com.android.server.wm.WindowManagerService.tryStartExitingAnimation:134 com.android.server.wm.WindowManagerService.relayoutWindow:1147 com.android.server.wm.Session.relayout:27 android.view.IWindowSession$Stub.onTransact:829 com.android.server.wm.Session.onTransact:1 android.os.Binder.execTransactInternal:1457 android.os.Binder.execTransact:1401 
12-20 00:05:38.525  1401  2247 I WindowManager: Relayout hash=c3b8059, pid=3972, syncId=-1: mAttrs={(50,200)(wrapxwrap) gr=TOP START CENTER sim={adjust=pan} ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-20 00:05:38.525  1401  2247 I WindowManager:   fl=1040308
12-20 00:05:38.525  1401  2247 I WindowManager:   bhv=1
12-20 00:05:38.525  1401  2247 I WindowManager:   fitTypes=206
12-20 00:05:38.525  1401  2247 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:38.525  1401  2247 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:38.525  1401  3703 D WindowManager: finishDrawingWindow: Window{b01e375 u0 com.katsuyamaki.DroidOSLauncher} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:38.589  1401  2247 D InputDispatcher: Focus entered window (0): b01e375 com.katsuyamaki.DroidOSLauncher
12-20 00:05:38.599  1401  1763 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-20 00:05:38.599  1401  1763 D InputMethodManagerService: shouldShowImeSwitcherLocked : checking vis : 3
12-20 00:05:38.600  1401  1763 D InputMethodManagerService: checkDisplayOfStartInputAndUpdateKeyboard: displayId=0, mFocusedDisplayId=0
12-20 00:05:38.601  1401  2247 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=b217ba3 InputMethod)/@0xfd8bc1b - animation-leash of insets_animation)/@0xcfc30b1
12-20 00:05:38.601  1401  2247 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{c321922 type=2011 android.os.Binder@edfc6ed})/@0x7a81b8, destroy=false, surface=Surface(name=b217ba3 InputMethod)/@0xfd8bc1b
12-20 00:05:38.601  1401  2247 I WindowManager: Reparenting to leash, surface=Surface(name=b217ba3 InputMethod)/@0xfd8bc1b, leashParent=Surface(name=WindowToken{c321922 type=2011 android.os.Binder@edfc6ed})/@0x7a81b8
12-20 00:05:38.602  1401  2247 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=b217ba3 InputMethod)/@0xfd8bc1b - animation-leash of insets_animation)/@0xd0f9a3f
12-20 00:05:38.604  1401  1545 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0x58f1d8c
12-20 00:05:38.604  1401  1545 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf, destroy=false, surface=Surface(name=253deac NavigationBar0)/@0x344c78e
12-20 00:05:38.605  1401  1545 I WindowManager: Reparenting to leash, surface=Surface(name=253deac NavigationBar0)/@0x344c78e, leashParent=Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf
12-20 00:05:38.605  1401  1545 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0x9157a6a
12-20 00:05:38.609  1401  1544 I ActivityManager: Changes in 10332 5 to 7, 255 to 128
12-20 00:05:38.617  1401  2168 I WindowManager: Relayout Window{5b7421b u0 com.android.systemui.wallpapers.ImageWallpaper}: viewVisibility=0 req=2486x2520 ty=2013 d0
12-20 00:05:38.623  1401  2168 I WindowManager: Relayout hash=5b7421b, pid=2045, syncId=-1: mAttrs={(0,0)(2486x2520) gr=TOP START CENTER layoutInDisplayCutoutMode=always ty=WALLPAPER fmt=RGBX_8888 wanim=0x1030328
12-20 00:05:38.623  1401  2168 I WindowManager:   fl=14318
12-20 00:05:38.623  1401  2168 I WindowManager:   pfl=14
12-20 00:05:38.623  1401  2168 I WindowManager:   bhv=1
12-20 00:05:38.623  1401  2168 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:38.623  1401  2168 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-20 00:05:38.623  1401  2168 I WindowManager:   sfl=8}
12-20 00:05:38.633  1401  3076 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-20 00:05:38.646  1401  2247 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-20 00:05:38.646  1401  2247 I InputMethodManagerService: setImeWindowStatus: vis=0, backDisposition=0
12-20 00:05:38.656  1401  3507 I WindowManager: Relayout Window{b217ba3 u0 InputMethod}: viewVisibility=0 req=1080x2404 ty=2011 d0
12-20 00:05:38.664  1401  3507 I WindowManager: Relayout hash=b217ba3, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) gr=BOTTOM CENTER_VERTICAL sim={adjust=pan} ty=INPUT_METHOD fmt=TRANSPARENT wanim=0x1030056 preferredMinDisplayRefreshRate=60.0 receive insets ignoring z-order
12-20 00:05:38.664  1401  3507 I WindowManager:   fl=81800108
12-20 00:05:38.664  1401  3507 I WindowManager:   pfl=14000000
12-20 00:05:38.664  1401  3507 I WindowManager:   bhv=1
12-20 00:05:38.664  1401  3507 I WindowManager:   fitTypes=3
12-20 00:05:38.664  1401  3507 I WindowManager:   fitSides=7
12-20 00:05:38.664  1401  3507 I WindowManager:   fitIgnoreVis
12-20 00:05:38.664  1401  3507 I WindowManager:   dvrrWindowFrameRateHint=true
12-20 00:05:38.664  1401  3507 I WindowManager:  dimAmount=0.18 dimDuration=150 naviIconColor=0}
12-20 00:05:38.664  1401  3507 D WindowManager: setInsetsWindow Window{b217ba3 u0 InputMethod}, contentInsets=Rect(0, 1904 - 0, 0) -> Rect(0, 1904 - 0, 0), visibleInsets=Rect(0, 1904 - 0, 0) -> Rect(0, 1904 - 0, 0), touchableRegion=SkRegion((0,1904,1080,2404)) -> SkRegion((0,1904,1080,2404)), touchableInsets 3 -> 3
12-20 00:05:39.167  1401  3545 I WindowManager: Relayout Window{b217ba3 u0 InputMethod}: viewVisibility=8 req=1080x2404 ty=2011 d0
12-20 00:05:39.168  1401  3545 E WindowManager: win=Window{b217ba3 u0 InputMethod} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=8 caller=com.android.server.wm.WindowManagerService.tryStartExitingAnimation:134 com.android.server.wm.WindowManagerService.relayoutWindow:1147 com.android.server.wm.Session.relayout:27 android.view.IWindowSession$Stub.onTransact:829 com.android.server.wm.Session.onTransact:1 android.os.Binder.execTransactInternal:1457 android.os.Binder.execTransact:1401 
12-20 00:05:39.169  1401  3545 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=b217ba3 InputMethod)/@0xfd8bc1b - animation-leash of insets_animation)/@0xd0f9a3f
12-20 00:05:39.169  1401  3545 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{c321922 type=2011 android.os.Binder@edfc6ed})/@0x7a81b8, destroy=false, surface=Surface(name=b217ba3 InputMethod)/@0xfd8bc1b
12-20 00:05:39.169  1401  3545 I WindowManager: Reparenting to leash, surface=Surface(name=b217ba3 InputMethod)/@0xfd8bc1b, leashParent=Surface(name=WindowToken{c321922 type=2011 android.os.Binder@edfc6ed})/@0x7a81b8
12-20 00:05:39.170  1401  3545 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=b217ba3 InputMethod)/@0xfd8bc1b - animation-leash of insets_animation)/@0x204f340
12-20 00:05:39.179  1401  3545 I WindowManager: Relayout hash=b217ba3, pid=15168, syncId=-1: mAttrs={(0,0)(fillxfill) gr=BOTTOM CENTER_VERTICAL sim={adjust=pan} ty=INPUT_METHOD fmt=TRANSPARENT wanim=0x1030056 preferredMinDisplayRefreshRate=60.0 receive insets ignoring z-order
12-20 00:05:39.179  1401  3545 I WindowManager:   fl=81800108
12-20 00:05:39.179  1401  3545 I WindowManager:   pfl=14000000
12-20 00:05:39.179  1401  3545 I WindowManager:   bhv=1
12-20 00:05:39.179  1401  3545 I WindowManager:   fitTypes=3
12-20 00:05:39.179  1401  3545 I WindowManager:   fitSides=7
12-20 00:05:39.179  1401  3545 I WindowManager:   fitIgnoreVis
12-20 00:05:39.179  1401  3545 I WindowManager:   dvrrWindowFrameRateHint=true
12-20 00:05:39.179  1401  3545 I WindowManager:  dimAmount=0.18 dimDuration=150 naviIconColor=0}
12-20 00:05:39.181  1401  1470 I WindowManager: Relayout Window{5b7421b u0 com.android.systemui.wallpapers.ImageWallpaper}: viewVisibility=0 req=2486x2520 ty=2013 d0
12-20 00:05:39.182  1401  1470 I WindowManager: Relayout hash=5b7421b, pid=2045, syncId=-1: mAttrs={(0,0)(2486x2520) gr=TOP START CENTER layoutInDisplayCutoutMode=always ty=WALLPAPER fmt=RGBX_8888 wanim=0x1030328
12-20 00:05:39.182  1401  1470 I WindowManager:   fl=14318
12-20 00:05:39.182  1401  1470 I WindowManager:   pfl=14
12-20 00:05:39.182  1401  1470 I WindowManager:   bhv=1
12-20 00:05:39.182  1401  1470 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:39.182  1401  1470 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-20 00:05:39.182  1401  1470 I WindowManager:   sfl=8}
12-20 00:05:39.183  1401  3547 D WindowManager: setInsetsWindow Window{b217ba3 u0 InputMethod}, contentInsets=Rect(0, 1904 - 0, 0) -> Rect(0, 2329 - 0, 0), visibleInsets=Rect(0, 1904 - 0, 0) -> Rect(0, 2329 - 0, 0), touchableRegion=SkRegion((0,1904,1080,2404)) -> SkRegion(), touchableInsets 3 -> 3
12-20 00:05:39.195  1401  3545 I WindowManager: Relayout Window{5b7421b u0 com.android.systemui.wallpapers.ImageWallpaper}: viewVisibility=0 req=2486x2520 ty=2013 d0
12-20 00:05:39.201  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-20 00:05:39.202  1401  3545 I WindowManager: Relayout hash=5b7421b, pid=2045, syncId=-1: mAttrs={(0,0)(2486x2520) gr=TOP START CENTER layoutInDisplayCutoutMode=always ty=WALLPAPER fmt=RGBX_8888 wanim=0x1030328
12-20 00:05:39.202  1401  3545 I WindowManager:   fl=14318
12-20 00:05:39.202  1401  3545 I WindowManager:   pfl=14
12-20 00:05:39.202  1401  3545 I WindowManager:   bhv=1
12-20 00:05:39.202  1401  3545 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:39.202  1401  3545 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-20 00:05:39.202  1401  3545 I WindowManager:   sfl=8}
12-20 00:05:40.608  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-20 00:05:40.786  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=185508626037000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-20 00:05:40.787  1401  1700 I InputDispatcher: Delivering touch to (3972): action: 0x0, f=0x0, d=0, 'b01e375', t=1 +(0,-116)
12-20 00:05:40.813  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-20 00:05:40.820  1401  3507 E InputDispatcher: Embedded{TaskInputSink of Surface(name=Decor container of Task=18195)/@0x417d4e1} has feature NO_INPUT_WINDOW, but a non-null token. Clearing
12-20 00:05:40.906  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=185508750221000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-20 00:05:40.906  1401  1700 I InputDispatcher: Delivering touch to (3972): action: 0x1, f=0x0, d=0, 'b01e375', t=1 +(0,-116)
12-20 00:05:41.080  1401  3507 I WindowManager: Using new display size: 1080x2520
12-20 00:05:41.082  1401  3547 I WindowManager: Using new display size: 1080x2520
12-20 00:05:41.087  1401  3507 I ActivityManager: Force stopping com.google.android.googlequicksearchbox appid=10270 user=0: from pid 6562
12-20 00:05:41.088  1401  3507 I ActivityManager: Killing 4510:com.google.android.googlequicksearchbox:search/u0a270 (adj 100): stop com.google.android.googlequicksearchbox due to from pid 6562
12-20 00:05:41.091  1401  3507 D WindowManager: Transition is created, t=TransitionRecord{3fc9507 id=-1 type=CLOSE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createTransition:17 com.android.server.wm.TransitionController.requestCloseTransitionIfNeeded:73 com.android.server.wm.WindowProcessController.handleAppDied$1:441 com.android.server.am.ActivityManagerService.handleAppDiedLocked:248 
12-20 00:05:41.092  1401  3507 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{be217c5 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}
12-20 00:05:41.093  1401  3507 I ActivityManager: Killing 4616:com.google.android.googlequicksearchbox:googleapp/u0a270 (adj 100): stop com.google.android.googlequicksearchbox due to from pid 6562
12-20 00:05:41.110  1401  3507 I ActivityManager: Killing 4499:com.google.android.googlequicksearchbox:interactor/u0a270 (adj 100): stop com.google.android.googlequicksearchbox due to from pid 6562
12-20 00:05:41.113  1401  3507 I ActivityManager:   Force stopping service ServiceRecord{90945ef u0 com.google.android.googlequicksearchbox/com.google.android.apps.gsa.hotword.hotworddetectionservice.GsaHotwordDetectionService:hotword_detector_0 c:android}
12-20 00:05:41.123  1401  1470 W ActivityManager: Unbind failed: could not find connection for android.os.BinderProxy@f54bff9
12-20 00:05:41.124  1401  1544 I ActivityManager: Killing 4639:com.google.android.googlequicksearchbox:trusted_disable_art_image_:com.google.android.apps.gsa.hotword.hotworddetectionservice.GsaHotwordDetectionService:hotword_detector_0/u0a270i306 (adj 100): isolated not needed
12-20 00:05:41.126  1401  3547 W ActivityManager: Service done with onDestroy, but not inDestroying: ServiceRecord{6f028c3 u0 com.google.android.googlequicksearchbox/com.google.frameworks.client.data.android.server.tiktok.assistant.InteractorProcessEndpointService c:com.google.android.googlequicksearchbox}, app=ProcessRecord{e52d6b9 0:com.google.android.googlequicksearchbox:interactor/u0a270}
12-20 00:05:41.133  1401  1544 I ActivityManager: Changes in 99306 5 to 19, 184 to 0
12-20 00:05:41.137  1401  2255 I WindowManager: WIN DEATH: Window{be217c5 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}
12-20 00:05:41.137  1401  2255 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{b01e375 u0 com.katsuyamaki.DroidOSLauncher}, navColorWin=Window{8d8ec89 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.DisplayPolicy.finishPostLayoutPolicyLw:17 com.android.server.wm.RootWindowContainer.applySurfaceChangesTransaction$1:195 com.android.server.wm.RootWindowContainer.performSurfacePlacementNoTrace:86 
12-20 00:05:41.137  1401  2255 D WindowManager: updateSystemBarAttributes, bhv=1, apr=0, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-20 00:05:41.139  1401  1645 D InputMethodManagerService: onClientRemovedInternalLocked
12-20 00:05:41.149  1401  1544 W ActivityManager: setHasOverlayUi called on unknown pid: 4510
12-20 00:05:41.156  1401  1552 W ActivityManager: pid 1401 system sent binder code 9 with flags 1 to frozen apps and got error -32
12-20 00:05:41.159  1401  1552 W ActivityManager: pid 1401 system sent binder code 1 with flags 1 to frozen apps and got error -32
12-20 00:05:41.164  1401  1551 W ActivityManager: ProcessRecord{e52d6b9 0:com.google.android.googlequicksearchbox:interactor/u0a270} is attached to a previous process 4499
12-20 00:05:41.178  1401  1553 I ActivityManager: Start proc 6584:com.google.android.googlequicksearchbox:interactor/u0a270 for service {com.google.android.googlequicksearchbox/com.google.android.voiceinteraction.GsaVoiceInteractionService}
12-20 00:05:41.178  1401  1553 I ActivityManager: ProcessObserver broadcast disabled
12-20 00:05:41.217  1401  1553 I ActivityManager: Start proc 6596:com.google.android.googlequicksearchbox:search/u0a270 for broadcast {com.google.android.googlequicksearchbox/com.google.android.libraries.assistant.contexttrigger.impl.ContextTriggerBroadcastReceiver_Receiver}
12-20 00:05:41.217  1401  1553 I ActivityManager: ProcessObserver broadcast disabled
12-20 00:05:41.288  1401  2589 I ActivityManager: Changes in 10270 19 to 5, 0 to 255
12-20 00:05:41.322  1401  1765 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-20 00:05:41.322  1401  1765 D InputMethodManagerService: shouldShowImeSwitcherLocked : checking vis : 3
12-20 00:05:41.329  1401  1765 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-20 00:05:41.329  1401  1765 D InputMethodManagerService: shouldShowImeSwitcherLocked : checking vis : 3
12-20 00:05:41.385  1401  2221 W WindowManager: Cannot find window which accessibility connection is added to
12-20 00:05:41.386  1401  3509 W WindowManager: Failed looking up window session=Session{c966652 2045:u0a10055} callers=com.android.server.wm.Session.remove:10 android.view.IWindowSession$Stub.onTransact:804 com.android.server.wm.Session.onTransact:1 
12-20 00:05:41.386  1401  3509 W WindowManager: Failed looking up window session=Session{c966652 2045:u0a10055} callers=com.android.server.wm.Session.remove:10 android.view.IWindowSession$Stub.onTransact:804 com.android.server.wm.Session.onTransact:1 
12-20 00:05:41.388  1401  2221 W WindowManager: Failed looking up window session=Session{c966652 2045:u0a10055} callers=com.android.server.wm.Session.remove:10 android.view.IWindowSession$Stub.onTransact:804 com.android.server.wm.Session.onTransact:1 
12-20 00:05:41.391  1401  3549 W ActivityManager: pid 1401 system sent binder code 7 with flags 1 to frozen apps and got error -32
12-20 00:05:41.391  1401  3549 W WindowManager: Exception thrown during dispatchAppVisibility Window{be217c5 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity EXITING}
12-20 00:05:41.391  1401  3549 W WindowManager: android.os.DeadObjectException
12-20 00:05:41.391  1401  3549 W WindowManager: 	at android.os.BinderProxy.transactNative(Native Method)
12-20 00:05:41.391  1401  3549 W WindowManager: 	at android.os.BinderProxy.transact(BinderProxy.java:661)
12-20 00:05:41.391  1401  3549 W WindowManager: 	at android.view.IWindow$Stub$Proxy.dispatchAppVisibility(IWindow.java:659)
12-20 00:05:41.391  1401  3549 W WindowManager: 	at com.android.server.wm.WindowState.sendAppVisibilityToClients(qb/103247004 13512400faf83fc2d6c21ba3dcd11c0dd5171ba299272a8c647b55f344650924:63)
12-20 00:05:41.391  1401  3549 W WindowManager: 	at com.android.server.wm.WindowContainer.sendAppVisibilityToClients(qb/103247004 13512400faf83fc2d6c21ba3dcd11c0dd5171ba299272a8c647b55f344650924:19)
12-20 00:05:41.391  1401  3549 W WindowManager: 	at com.android.server.wm.WindowToken.setClientVisible(qb/103247004 13512400faf83fc2d6c21ba3dcd11c0dd5171ba299272a8c647b55f344650924:48)
12-20 00:05:41.391  1401  3549 W WindowManager: 	at com.android.server.wm.ActivityRecord.commitVisibility(qb/103247004 13512400faf83fc2d6c21ba3dcd11c0dd5171ba299272a8c647b55f344650924:186)
12-20 00:05:41.391  1401  3549 W WindowManager: 	at com.android.server.wm.TransitionController.finishTransition(qb/103247004 13512400faf83fc2d6c21ba3dcd11c0dd5171ba299272a8c647b55f344650924:825)
12-20 00:05:41.391  1401  3549 W WindowManager: 	at com.android.server.wm.WindowOrganizerController.finishTransitionInner(qb/103247004 13512400faf83fc2d6c21ba3dcd11c0dd5171ba299272a8c647b55f344650924:31)
12-20 00:05:41.391  1401  3549 W WindowManager: 	at com.android.server.wm.WindowOrganizerController.finishAllTransitions(qb/103247004 13512400faf83fc2d6c21ba3dcd11c0dd5171ba299272a8c647b55f344650924:60)
12-20 00:05:41.391  1401  3549 W WindowManager: 	at android.window.IWindowOrganizerController$Stub.onTransact(IWindowOrganizerController.java:283)
12-20 00:05:41.391  1401  3549 W WindowManager: 	at com.android.server.wm.WindowOrganizerController.onTransact(qb/103247004 13512400faf83fc2d6c21ba3dcd11c0dd5171ba299272a8c647b55f344650924:1)
12-20 00:05:41.391  1401  3549 W WindowManager: 	at android.os.Binder.execTransactInternal(Binder.java:1462)
12-20 00:05:41.391  1401  3549 W WindowManager: 	at android.os.Binder.execTransact(Binder.java:1401)
12-20 00:05:41.467  1401  1553 I ActivityManager: Start proc 6693:com.google.android.googlequicksearchbox:googleapp/u0a270 for broadcast {com.google.android.googlequicksearchbox/com.google.android.libraries.notifications.platform.entrypoints.restart.RestartReceiver}
12-20 00:05:41.467  1401  1553 I ActivityManager: ProcessObserver broadcast disabled
12-20 00:05:41.552  1401  1553 I ActivityManager: Start proc 6739:com.google.android.googlequicksearchbox:trusted_disable_art_image_:com.google.android.apps.gsa.hotword.hotworddetectionservice.GsaHotwordDetectionService:hotword_detector_0/u0i307 for service {com.google.android.googlequicksearchbox/com.google.android.apps.gsa.hotword.hotworddetectionservice.GsaHotwordDetectionService:hotword_detector_0}
12-20 00:05:41.552  1401  1553 I ActivityManager: ProcessObserver broadcast disabled
12-20 00:05:41.560  1401  1552 I ActivityManager: Changes in 10262 19 to 11, 0 to 128
12-20 00:05:41.584  1401  2221 I ActivityManager: Changes in 10262 11 to 19, 128 to 0
12-20 00:05:41.594  1401  2221 I ActivityManager: Changes in 99307 19 to 5, 0 to 184
12-20 00:05:42.044  1401  2168 D WindowManager: Transition is created, t=TransitionRecord{41c58db id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:42.049  1401  2168 D WindowManager: Aborting Transition: 10334 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:42.055  1401  3075 D WindowManager: Transition is created, t=TransitionRecord{b7da7b7 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:42.058  1401  3075 D WindowManager: Aborting Transition: 10335 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:42.059  1401  3548 I WindowManager: Relayout Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:42.061  1401  3548 I WindowManager: Relayout hash=dea7911, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:42.061  1401  3548 I WindowManager:   fl=8d810100
12-20 00:05:42.061  1401  3548 I WindowManager:   pfl=10008040
12-20 00:05:42.061  1401  3548 I WindowManager:   vsysui=700
12-20 00:05:42.061  1401  3548 I WindowManager:   bhv=1
12-20 00:05:42.061  1401  3548 I WindowManager:   fitSides=0
12-20 00:05:42.061  1401  3548 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:42.061  1401  3548 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:42.068  1401  3548 I WindowManager: Relayout Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:42.070  1401  3548 I WindowManager: Relayout hash=dea7911, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:42.070  1401  3548 I WindowManager:   fl=8d810100
12-20 00:05:42.070  1401  3548 I WindowManager:   pfl=10008040
12-20 00:05:42.070  1401  3548 I WindowManager:   vsysui=700
12-20 00:05:42.070  1401  3548 I WindowManager:   bhv=1
12-20 00:05:42.070  1401  3548 I WindowManager:   fitSides=0
12-20 00:05:42.070  1401  3548 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:42.070  1401  3548 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:42.114  1401  3075 D WindowManager: Transition is created, t=TransitionRecord{b64fe8e id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:42.116  1401  3075 D WindowManager: Aborting Transition: 10336 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:42.125  1401  2168 I WindowManager: Relayout Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:42.126  1401  2168 I WindowManager: Relayout hash=dea7911, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:42.126  1401  2168 I WindowManager:   fl=8d810100
12-20 00:05:42.126  1401  2168 I WindowManager:   pfl=10008040
12-20 00:05:42.126  1401  2168 I WindowManager:   vsysui=700
12-20 00:05:42.126  1401  2168 I WindowManager:   bhv=1
12-20 00:05:42.126  1401  2168 I WindowManager:   fitSides=0
12-20 00:05:42.126  1401  2168 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:42.126  1401  2168 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:42.137  1401  2168 D WindowManager: Transition is created, t=TransitionRecord{1765166 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:42.139  1401  2168 D WindowManager: Aborting Transition: 10337 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:42.142  1401  2168 I WindowManager: Relayout Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:42.143  1401  2168 I WindowManager: Relayout hash=dea7911, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:42.143  1401  2168 I WindowManager:   fl=8d810100
12-20 00:05:42.143  1401  2168 I WindowManager:   pfl=10008040
12-20 00:05:42.143  1401  2168 I WindowManager:   vsysui=700
12-20 00:05:42.143  1401  2168 I WindowManager:   bhv=1
12-20 00:05:42.143  1401  2168 I WindowManager:   fitSides=0
12-20 00:05:42.143  1401  2168 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:42.143  1401  2168 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:42.303  1401  2168 D WindowManager: Transition is created, t=TransitionRecord{c6d784d id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:42.303  1401  2168 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}
12-20 00:05:42.313  1401  3075 E InputDispatcher: Embedded{TaskInputSink of Surface(name=Decor container of Task=18195)/@0x417d4e1} has feature NO_INPUT_WINDOW, but a non-null token. Clearing
12-20 00:05:42.320  1401  2168 D WindowManager: Transition is created, t=TransitionRecord{7e6405 id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:42.320  1401  2168 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}
12-20 00:05:42.946  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=185510789793000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-20 00:05:42.946  1401  1700 I InputDispatcher: Delivering touch to (3972): action: 0x0, f=0x0, d=0, 'b01e375', t=1 +(0,-116)
12-20 00:05:42.994  1401  2168 D WindowManager: Transition is created, t=TransitionRecord{5d837d3 id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:42.995  1401  2168 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}
12-20 00:05:43.029  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=185510872913000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-20 00:05:43.029  1401  1700 I InputDispatcher: Delivering touch to (3972): action: 0x1, f=0x0, d=0, 'b01e375', t=1 +(0,-116)
12-20 00:05:43.032  1401  3548 D WindowManager: Transition is created, t=TransitionRecord{4c4ce4b id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:43.033  1401  3548 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}
12-20 00:05:43.049  1401  3075 D InputDispatcher: Focused application(0): ActivityRecord{237228353 u0 com.google.android.apps.bard/.shellapp.BardEntryPointActivity t18324}
12-20 00:05:43.052  1401  1544 I ActivityManager: Changes in 10272 19 to 2, 0 to 255
12-20 00:05:43.070  1401  2591 D InputDispatcher: Focused application(0): ActivityRecord{216173745 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink t18324}
12-20 00:05:43.089  1401  3509 I ActivityManager: Changes in 10395 19 to 3, 0 to 144
12-20 00:05:43.094  6596  6596 D ViewRootImpl: desktopMode is false
12-20 00:05:43.095  6596  6596 I ViewRootImpl: dVRR is disabled
12-20 00:05:43.095  1401  2237 I WindowManager: Relayout Window{8d8ec89 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}: viewVisibility=0 req=1080x2520 ty=1 d0
12-20 00:05:43.096  1401  2237 I WindowManager: Relayout hash=8d8ec89, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=nothing} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION fmt=TRANSPARENT wanim=0x1030306
12-20 00:05:43.096  1401  2237 I WindowManager:   fl=81910100
12-20 00:05:43.096  1401  2237 I WindowManager:   pfl=10008840
12-20 00:05:43.096  1401  2237 I WindowManager:   bhv=2
12-20 00:05:43.096  1401  2237 I WindowManager:   fitSides=0
12-20 00:05:43.096  1401  2237 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:43.096  1401  2237 I WindowManager:   dvrrWindowFrameRateHint=true screenDimDuration=200000 naviIconColor=0}
12-20 00:05:43.099  1401  1544 I ActivityManager: Changes in 10272 2 to 19, 255 to 128
12-20 00:05:43.104  1401  3548 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{a4d2230 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}
12-20 00:05:43.113  6596  6596 D ViewRootImpl: Skipping stats log for color mode
12-20 00:05:43.118  6596  6596 D ViewRootImpl: desktopMode is false
12-20 00:05:43.118  6596  6596 I ViewRootImpl: dVRR is disabled
12-20 00:05:43.119  1401  3074 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{5eb931d u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}
12-20 00:05:43.121  1401  2251 I WindowManager: Relayout Window{5eb931d u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}: viewVisibility=0 req=0x0 ty=1 d0
12-20 00:05:43.121  1401  2251 D WindowManager: makeSurface duration=0 name=com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink$_6596
12-20 00:05:43.121  1401  2251 I WindowManager: Relayout hash=5eb931d, pid=6596, syncId=-1: mAttrs={(0,0)(wrapxwrap) sim={adjust=pan} ty=BASE_APPLICATION fmt=TRANSPARENT
12-20 00:05:43.121  1401  2251 I WindowManager:   fl=1800000
12-20 00:05:43.121  1401  2251 I WindowManager:   pfl=40000880
12-20 00:05:43.121  1401  2251 I WindowManager:   bhv=1
12-20 00:05:43.121  1401  2251 I WindowManager:   fitTypes=207
12-20 00:05:43.121  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:43.121  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:43.124  1401  2251 D WindowManager: finishDrawingWindow: Window{5eb931d u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:43.124  1401  2251 I WindowManager: finishDrawing of relaunch: Window{5eb931d u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink} 42ms
12-20 00:05:43.136  1401  1544 I ActivityManager: Changes in 10272 19 to 19, 128 to 0
12-20 00:05:43.154  1401  3548 D WindowManager: Transition is created, t=TransitionRecord{6801295 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityStartController.startActivities:98 
12-20 00:05:43.156  1401  3548 D InputDispatcher: Focused application(0): ActivityRecord{242188202 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity t18325}
12-20 00:05:43.157  1401  3548 D WindowManager: deferringAddStartActivities clear
12-20 00:05:43.158  1401  2168 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{5eb931d u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}
12-20 00:05:43.165  2045  2203 D ViewRootImpl: desktopMode is false
12-20 00:05:43.165  2045  2203 I ViewRootImpl: dVRR is disabled
12-20 00:05:43.168  1401  3074 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{4385f26 u0 Splash Screen com.google.android.googlequicksearchbox}
12-20 00:05:43.174  1401  3545 I WindowManager: Relayout Window{4385f26 u0 Splash Screen com.google.android.googlequicksearchbox}: viewVisibility=0 req=1080x2520 ty=3 d0
12-20 00:05:43.174  1401  3545 D WindowManager: makeSurface duration=0 name=Splash Screen com.google.android.googlequicksearchbox$_2045
12-20 00:05:43.175  1401  3545 I WindowManager: Relayout hash=4385f26, pid=2045, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=pan} layoutInDisplayCutoutMode=always ty=APPLICATION_STARTING fmt=TRANSLUCENT wanim=0x1030317
12-20 00:05:43.175  1401  3545 I WindowManager:   fl=81030118
12-20 00:05:43.175  1401  3545 I WindowManager:   pfl=10000810
12-20 00:05:43.175  1401  3545 I WindowManager:   bhv=1
12-20 00:05:43.175  1401  3545 I WindowManager:   fitSides=0
12-20 00:05:43.175  1401  3545 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:43.175  1401  3545 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:43.179  1401  3545 D WindowManager: finishDrawingWindow: Window{4385f26 u0 Splash Screen com.google.android.googlequicksearchbox} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:43.196  6596  6596 D ViewRootImpl: desktopMode is false
12-20 00:05:43.196  6596  6596 I ViewRootImpl: dVRR is disabled
12-20 00:05:43.197  1401  3548 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{554dc55 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}
12-20 00:05:43.204  2045  2142 D ViewRootImpl: desktopMode is false
12-20 00:05:43.204  2045  2142 I ViewRootImpl: dVRR is disabled
12-20 00:05:43.205  1401  3548 I WindowManager: Relayout Window{554dc55 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}: viewVisibility=0 req=918x1260 ty=1 d0
12-20 00:05:43.205  1401  3548 D WindowManager: makeSurface duration=0 name=com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity$_6596
12-20 00:05:43.206  1401  3548 I WindowManager: Relayout hash=554dc55, pid=6596, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:43.206  1401  3548 I WindowManager:   fl=81810100
12-20 00:05:43.206  1401  3548 I WindowManager:   pfl=100088c0
12-20 00:05:43.206  1401  3548 I WindowManager:   bhv=1
12-20 00:05:43.206  1401  3548 I WindowManager:   fitSides=0
12-20 00:05:43.206  1401  3548 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:43.206  1401  3548 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:43.208  1401  1868 W WindowManager: Cannot find window which accessibility connection is added to
12-20 00:05:43.211  1401  1868 D WindowManager: finishDrawingWindow: Window{554dc55 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:43.272  1401  2221 I WindowManager: Using new display size: 1080x2520
12-20 00:05:43.286  1401  2251 I WindowManager: Relayout Window{4385f26 u0 Splash Screen com.google.android.googlequicksearchbox}: viewVisibility=8 req=918x1260 ty=3 d0
12-20 00:05:43.288  1401  3548 D WindowManager: finishDrawingWindow: Window{554dc55 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity} mDrawState=HAS_DRAWN seqId=0
12-20 00:05:43.289  1401  2251 I WindowManager: Relayout hash=4385f26, pid=2045, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=pan} layoutInDisplayCutoutMode=always ty=APPLICATION_STARTING fmt=TRANSLUCENT wanim=0x1030317
12-20 00:05:43.289  1401  2251 I WindowManager:   fl=81030118
12-20 00:05:43.289  1401  2251 I WindowManager:   pfl=10000810
12-20 00:05:43.289  1401  2251 I WindowManager:   bhv=1
12-20 00:05:43.289  1401  2251 I WindowManager:   fitSides=0
12-20 00:05:43.289  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:43.289  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:43.291  1401  3548 D WindowManager: Starting window removed Window{4385f26 u0 Splash Screen com.google.android.googlequicksearchbox}
12-20 00:05:43.319  1401  2237 E InputDispatcher: Embedded{TaskInputSink of Surface(name=Decor container of Task=18325)/@0xaf94a60} has feature NO_INPUT_WINDOW, but a non-null token. Clearing
12-20 00:05:43.534  6596  6596 D ViewRootImpl: Skipping stats log for color mode
12-20 00:05:43.875  1401  3545 I WindowManager: Using new display size: 1080x2520
12-20 00:05:44.210  1401  3545 D WindowManager: Transition is created, t=TransitionRecord{96171f0 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:44.214  1401  3545 D InputDispatcher: Focused application(0): ActivityRecord{147709724 u0 com.termux/.app.TermuxActivity t18195}
12-20 00:05:44.217  1401  3545 D WindowManager: Aborting Transition: 10343 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:44.223  1401  1868 I WindowManager: Relayout Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:44.224  1401  1868 I WindowManager: Relayout hash=dea7911, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:44.224  1401  1868 I WindowManager:   fl=8d810100
12-20 00:05:44.224  1401  1868 I WindowManager:   pfl=10008040
12-20 00:05:44.224  1401  1868 I WindowManager:   vsysui=700
12-20 00:05:44.224  1401  1868 I WindowManager:   bhv=1
12-20 00:05:44.224  1401  1868 I WindowManager:   fitSides=0
12-20 00:05:44.224  1401  1868 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:44.224  1401  1868 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:44.281  1401  3548 D WindowManager: Transition is created, t=TransitionRecord{9fd6ef8 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:44.283  1401  3548 D WindowManager: Aborting Transition: 10344 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:44.290  1401  3548 I WindowManager: Relayout Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:44.291  1401  3548 I WindowManager: Relayout hash=dea7911, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:44.291  1401  3548 I WindowManager:   fl=8d810100
12-20 00:05:44.291  1401  3548 I WindowManager:   pfl=10008040
12-20 00:05:44.291  1401  3548 I WindowManager:   vsysui=700
12-20 00:05:44.291  1401  3548 I WindowManager:   bhv=1
12-20 00:05:44.291  1401  3548 I WindowManager:   fitSides=0
12-20 00:05:44.291  1401  3548 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:44.291  1401  3548 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:44.359  1401  1868 D WindowManager: Transition is created, t=TransitionRecord{83bc80d id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:44.365  1401  1868 D InputDispatcher: Focused application(0): ActivityRecord{63552823 u0 com.google.android.apps.bard/.shellapp.BardEntryPointActivity t18326}
12-20 00:05:44.368  1401  2251 E InputDispatcher: Embedded{TaskInputSink of Surface(name=Decor container of Task=18325)/@0xaf94a60} has feature NO_INPUT_WINDOW, but a non-null token. Clearing
12-20 00:05:44.371  1401  1544 I ActivityManager: Changes in 10272 19 to 2, 0 to 255
12-20 00:05:44.381  1401  3548 D InputDispatcher: Focused application(0): ActivityRecord{188470649 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink t18326}
12-20 00:05:44.392  6596  6596 D ViewRootImpl: desktopMode is false
12-20 00:05:44.393  6596  6596 I ViewRootImpl: dVRR is disabled
12-20 00:05:44.394  1401  2251 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{79ed501 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}
12-20 00:05:44.397  1401  3074 I WindowManager: Relayout Window{79ed501 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}: viewVisibility=0 req=0x0 ty=1 d0
12-20 00:05:44.397  1401  3074 D WindowManager: makeSurface duration=0 name=com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink$_6596
12-20 00:05:44.398  1401  3074 I WindowManager: Relayout hash=79ed501, pid=6596, syncId=-1: mAttrs={(0,0)(wrapxwrap) sim={adjust=pan forwardNavigation} ty=BASE_APPLICATION fmt=TRANSPARENT
12-20 00:05:44.398  1401  3074 I WindowManager:   fl=1800000
12-20 00:05:44.398  1401  3074 I WindowManager:   pfl=40000880
12-20 00:05:44.398  1401  3074 I WindowManager:   bhv=1
12-20 00:05:44.398  1401  3074 I WindowManager:   fitTypes=207
12-20 00:05:44.398  1401  3074 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:44.398  1401  3074 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:44.400  1401  2251 D WindowManager: finishDrawingWindow: Window{79ed501 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:44.407  1401  3547 D WindowManager: Transition is created, t=TransitionRecord{54c56d5 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityStartController.startActivities:98 
12-20 00:05:44.408  1401  3547 D InputDispatcher: Focused application(0): ActivityRecord{242188202 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity t18325}
12-20 00:05:44.408  1401  3547 D WindowManager: Aborting Transition: 10346 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:44.409  1401  3547 D WindowManager: deferringAddStartActivities clear
12-20 00:05:44.409  1401  3548 D WindowManager: Transition is created, t=TransitionRecord{8edf4b7 id=-1 type=CLOSE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createTransition:17 com.android.server.wm.TransitionController.requestCloseTransitionIfNeeded:73 com.android.server.wm.ActivityRecord.finishIfPossible:38 com.android.server.wm.ActivityClientController.finishActivity:268 
12-20 00:05:44.409  1401  3548 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{79ed501 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}
12-20 00:05:44.427  1401  1544 I ActivityManager: Changes in 10272 2 to 19, 255 to 128
12-20 00:05:44.462  1401  1645 D WindowManager: Transition is created, t=TransitionRecord{107b5aa id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:44.483  1401  1645 D InputDispatcher: Focused application(0): ActivityRecord{70158412 u0 com.google.android.apps.bard/.shellapp.BardEntryPointActivity t18327}
12-20 00:05:44.512  1401  1544 I ActivityManager: Changes in 10272 19 to 2, 128 to 255
12-20 00:05:44.522  1401  3509 D InputDispatcher: Focused application(0): ActivityRecord{76940030 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink t18327}
12-20 00:05:44.533  6596  6596 D ViewRootImpl: desktopMode is false
12-20 00:05:44.533  6596  6596 I ViewRootImpl: dVRR is disabled
12-20 00:05:44.537  1401  2168 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{6bb9536 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}
12-20 00:05:44.544  1401  1544 I ActivityManager: Changes in 10272 2 to 19, 255 to 128
12-20 00:05:44.548  1401  3546 I WindowManager: Relayout Window{6bb9536 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}: viewVisibility=0 req=0x0 ty=1 d0
12-20 00:05:44.548  1401  3546 D WindowManager: makeSurface duration=1 name=com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink$_6596
12-20 00:05:44.549  1401  3546 I WindowManager: Relayout hash=6bb9536, pid=6596, syncId=-1: mAttrs={(0,0)(wrapxwrap) sim={adjust=pan forwardNavigation} ty=BASE_APPLICATION fmt=TRANSPARENT
12-20 00:05:44.549  1401  3546 I WindowManager:   fl=1800000
12-20 00:05:44.549  1401  3546 I WindowManager:   pfl=40000880
12-20 00:05:44.549  1401  3546 I WindowManager:   bhv=1
12-20 00:05:44.549  1401  3546 I WindowManager:   fitTypes=207
12-20 00:05:44.549  1401  3546 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:44.549  1401  3546 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:44.551  1401  3548 D WindowManager: finishDrawingWindow: Window{6bb9536 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:44.559  1401  3546 D WindowManager: Transition is created, t=TransitionRecord{5e95e70 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityStartController.startActivities:98 
12-20 00:05:44.561  1401  3546 D InputDispatcher: Focused application(0): ActivityRecord{242188202 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity t18325}
12-20 00:05:44.561  1401  3546 D WindowManager: Aborting Transition: 10349 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:44.562  1401  3546 D WindowManager: deferringAddStartActivities clear
12-20 00:05:44.563  1401  2251 D WindowManager: Transition is created, t=TransitionRecord{e4cbb59 id=-1 type=CLOSE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createTransition:17 com.android.server.wm.TransitionController.requestCloseTransitionIfNeeded:73 com.android.server.wm.ActivityRecord.finishIfPossible:38 com.android.server.wm.ActivityClientController.finishActivity:268 
12-20 00:05:44.563  1401  2251 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{6bb9536 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}
12-20 00:05:44.580  1401  3509 I WindowManager: Relayout Window{79ed501 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}: viewVisibility=8 req=0x0 ty=1 d0
12-20 00:05:44.581  1401  3509 I WindowManager: Relayout hash=79ed501, pid=6596, syncId=-1: mAttrs={(0,0)(wrapxwrap) sim={adjust=pan forwardNavigation} ty=BASE_APPLICATION fmt=TRANSPARENT
12-20 00:05:44.581  1401  3509 I WindowManager:   fl=1800000
12-20 00:05:44.581  1401  3509 I WindowManager:   pfl=40000880
12-20 00:05:44.581  1401  3509 I WindowManager:   bhv=1
12-20 00:05:44.581  1401  3509 I WindowManager:   fitTypes=207
12-20 00:05:44.581  1401  3509 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:44.581  1401  3509 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:44.587  1401  3546 D WindowManager: Transition is created, t=TransitionRecord{6963ce7 id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:44.587  1401  3546 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}
12-20 00:05:44.588  6596  6596 D ViewRootImpl: Skipping stats log for color mode
12-20 00:05:44.698  1401  1645 D WindowManager: Transition is created, t=TransitionRecord{cf9528c id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:44.699  1401  1645 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}
12-20 00:05:44.700  1401  1645 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{b01e375 u0 com.katsuyamaki.DroidOSLauncher}, navColorWin=Window{8d8ec89 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.DisplayPolicy.finishPostLayoutPolicyLw:17 com.android.server.wm.RootWindowContainer.applySurfaceChangesTransaction$1:195 com.android.server.wm.RootWindowContainer.performSurfacePlacementNoTrace:86 
12-20 00:05:44.700  1401  1645 D WindowManager: updateSystemBarAttributes, bhv=1, apr=1048576, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-20 00:05:44.717  1401  3545 I WindowManager: Relayout Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:44.718  1401  3545 I WindowManager: Relayout hash=dea7911, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:44.718  1401  3545 I WindowManager:   fl=8d810100
12-20 00:05:44.718  1401  3545 I WindowManager:   pfl=10008040
12-20 00:05:44.718  1401  3545 I WindowManager:   vsysui=700
12-20 00:05:44.718  1401  3545 I WindowManager:   bhv=1
12-20 00:05:44.718  1401  3545 I WindowManager:   fitSides=0
12-20 00:05:44.718  1401  3545 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:44.718  1401  3545 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:44.724  1401  3545 D WindowManager: finishDrawingWindow: Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:44.730  1401  1544 I ActivityManager: Changes in 10272 19 to 19, 128 to 0
12-20 00:05:44.732  1401  3545 I WindowManager: Relayout Window{6bb9536 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}: viewVisibility=8 req=0x0 ty=1 d0
12-20 00:05:44.733  1401  3545 I WindowManager: Relayout hash=6bb9536, pid=6596, syncId=-1: mAttrs={(0,0)(wrapxwrap) sim={adjust=pan forwardNavigation} ty=BASE_APPLICATION fmt=TRANSPARENT
12-20 00:05:44.733  1401  3545 I WindowManager:   fl=1800000
12-20 00:05:44.733  1401  3545 I WindowManager:   pfl=40000880
12-20 00:05:44.733  1401  3545 I WindowManager:   bhv=1
12-20 00:05:44.733  1401  3545 I WindowManager:   fitTypes=207
12-20 00:05:44.733  1401  3545 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:44.733  1401  3545 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:44.736  6596  6596 D ViewRootImpl: Skipping stats log for color mode
12-20 00:05:44.822  1401  2168 D WindowManager: Transition is created, t=TransitionRecord{8c6a8a7 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:44.825  1401  2168 D InputDispatcher: Focused application(0): ActivityRecord{147709724 u0 com.termux/.app.TermuxActivity t18195}
12-20 00:05:44.826  1401  2168 D WindowManager: Aborting Transition: 10353 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:44.831  1401  3545 I WindowManager: Relayout Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:44.832  1401  3545 I WindowManager: Relayout hash=dea7911, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:44.832  1401  3545 I WindowManager:   fl=8d810100
12-20 00:05:44.832  1401  3545 I WindowManager:   pfl=10008040
12-20 00:05:44.832  1401  3545 I WindowManager:   vsysui=700
12-20 00:05:44.832  1401  3545 I WindowManager:   bhv=1
12-20 00:05:44.832  1401  3545 I WindowManager:   fitSides=0
12-20 00:05:44.832  1401  3545 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:44.832  1401  3545 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:44.902  1401  3549 D WindowManager: Transition is created, t=TransitionRecord{c020be3 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:44.904  1401  3549 D WindowManager: Aborting Transition: 10354 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:44.906  1401  3546 I WindowManager: Relayout Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:44.907  1401  3546 I WindowManager: Relayout hash=dea7911, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:44.907  1401  3546 I WindowManager:   fl=8d810100
12-20 00:05:44.907  1401  3546 I WindowManager:   pfl=10008040
12-20 00:05:44.907  1401  3546 I WindowManager:   vsysui=700
12-20 00:05:44.907  1401  3546 I WindowManager:   bhv=1
12-20 00:05:44.907  1401  3546 I WindowManager:   fitSides=0
12-20 00:05:44.907  1401  3546 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:44.907  1401  3546 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:44.972  1401  3546 D WindowManager: Transition is created, t=TransitionRecord{23ad155 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:44.977  1401  3546 D InputDispatcher: Focused application(0): ActivityRecord{129991487 u0 com.google.android.apps.bard/.shellapp.BardEntryPointActivity t18328}
12-20 00:05:44.978  1401  3546 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{b01e375 u0 com.katsuyamaki.DroidOSLauncher}, navColorWin=Window{8d8ec89 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.DisplayPolicy.finishPostLayoutPolicyLw:17 com.android.server.wm.RootWindowContainer.applySurfaceChangesTransaction$1:195 com.android.server.wm.RootWindowContainer.performSurfacePlacementNoTrace:86 
12-20 00:05:44.979  1401  3546 D WindowManager: updateSystemBarAttributes, bhv=1, apr=0, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-20 00:05:44.988  1401  3545 I ActivityManager: Changes in 10272 19 to 2, 0 to 255
12-20 00:05:44.991  1401  3546 D InputDispatcher: Focused application(0): ActivityRecord{121318721 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink t18328}
12-20 00:05:44.996  1401  1544 I ActivityManager: Changes in 10272 2 to 19, 255 to 128
12-20 00:05:44.999  6596  6596 D ViewRootImpl: desktopMode is false
12-20 00:05:44.999  6596  6596 I ViewRootImpl: dVRR is disabled
12-20 00:05:45.000  1401  3509 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{438de88 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}
12-20 00:05:45.003  1401  2221 I WindowManager: Relayout Window{438de88 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}: viewVisibility=0 req=0x0 ty=1 d0
12-20 00:05:45.003  1401  2221 D WindowManager: makeSurface duration=1 name=com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink$_6596
12-20 00:05:45.004  1401  2221 I WindowManager: Relayout hash=438de88, pid=6596, syncId=-1: mAttrs={(0,0)(wrapxwrap) sim={adjust=pan forwardNavigation} ty=BASE_APPLICATION fmt=TRANSPARENT
12-20 00:05:45.004  1401  2221 I WindowManager:   fl=1800000
12-20 00:05:45.004  1401  2221 I WindowManager:   pfl=40000880
12-20 00:05:45.004  1401  2221 I WindowManager:   bhv=1
12-20 00:05:45.004  1401  2221 I WindowManager:   fitTypes=207
12-20 00:05:45.004  1401  2221 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:45.004  1401  2221 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:45.011  1401  3546 D InputDispatcher: Focused application(0): ActivityRecord{242188202 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity t18325}
12-20 00:05:45.012  1401  3546 D WindowManager: deferringAddStartActivities clear
12-20 00:05:45.012  1401  3546 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{b01e375 u0 com.katsuyamaki.DroidOSLauncher}, navColorWin=Window{8d8ec89 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.DisplayPolicy.finishPostLayoutPolicyLw:17 com.android.server.wm.RootWindowContainer.applySurfaceChangesTransaction$1:195 com.android.server.wm.RootWindowContainer.performSurfacePlacementNoTrace:86 
12-20 00:05:45.012  1401  3546 D WindowManager: updateSystemBarAttributes, bhv=1, apr=1048576, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-20 00:05:45.013  1401  3548 D WindowManager: finishDrawingWindow: Window{438de88 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:45.034  1401  1544 I ActivityManager: Changes in 10272 19 to 19, 128 to 0
12-20 00:05:45.035  6596  6596 D ViewRootImpl: Skipping stats log for color mode
12-20 00:05:45.057  1401  3545 D WindowManager: Transition is created, t=TransitionRecord{47b15a8 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:45.061  1401  3545 D InputDispatcher: Focused application(0): ActivityRecord{251772058 u0 com.google.android.apps.bard/.shellapp.BardEntryPointActivity t18329}
12-20 00:05:45.062  1401  3545 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{b01e375 u0 com.katsuyamaki.DroidOSLauncher}, navColorWin=Window{8d8ec89 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.DisplayPolicy.finishPostLayoutPolicyLw:17 com.android.server.wm.RootWindowContainer.applySurfaceChangesTransaction$1:195 com.android.server.wm.RootWindowContainer.performSurfacePlacementNoTrace:86 
12-20 00:05:45.062  1401  3545 D WindowManager: updateSystemBarAttributes, bhv=1, apr=0, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-20 00:05:45.066  1401  1544 I ActivityManager: Changes in 10272 19 to 2, 0 to 255
12-20 00:05:45.079  1401  3548 D InputDispatcher: Focused application(0): ActivityRecord{86167202 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink t18329}
12-20 00:05:45.083  1401  1544 I ActivityManager: Changes in 10272 2 to 19, 255 to 128
12-20 00:05:45.087  6596  6596 D ViewRootImpl: desktopMode is false
12-20 00:05:45.087  6596  6596 I ViewRootImpl: dVRR is disabled
12-20 00:05:45.088  1401  2168 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{992aa68 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}
12-20 00:05:45.092  1401  3549 I WindowManager: Relayout Window{992aa68 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}: viewVisibility=0 req=0x0 ty=1 d0
12-20 00:05:45.092  1401  3549 D WindowManager: makeSurface duration=0 name=com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink$_6596
12-20 00:05:45.093  1401  3549 I WindowManager: Relayout hash=992aa68, pid=6596, syncId=-1: mAttrs={(0,0)(wrapxwrap) sim={adjust=pan forwardNavigation} ty=BASE_APPLICATION fmt=TRANSPARENT
12-20 00:05:45.093  1401  3549 I WindowManager:   fl=1800000
12-20 00:05:45.093  1401  3549 I WindowManager:   pfl=40000880
12-20 00:05:45.093  1401  3549 I WindowManager:   bhv=1
12-20 00:05:45.093  1401  3549 I WindowManager:   fitTypes=207
12-20 00:05:45.093  1401  3549 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:45.093  1401  3549 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:45.095  1401  3074 D WindowManager: finishDrawingWindow: Window{992aa68 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:45.097  1401  1545 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{b01e375 u0 com.katsuyamaki.DroidOSLauncher}, navColorWin=Window{8d8ec89 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.DisplayPolicy.finishPostLayoutPolicyLw:17 com.android.server.wm.RootWindowContainer.applySurfaceChangesTransaction$1:195 com.android.server.wm.RootWindowContainer.performSurfacePlacementNoTrace:86 
12-20 00:05:45.098  1401  1545 D WindowManager: updateSystemBarAttributes, bhv=1, apr=1048576, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-20 00:05:45.100  1401  3074 D WindowManager: Transition is created, t=TransitionRecord{67a9486 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityStartController.startActivities:98 
12-20 00:05:45.101  1401  3074 D InputDispatcher: Focused application(0): ActivityRecord{242188202 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity t18325}
12-20 00:05:45.102  1401  3074 D WindowManager: Aborting Transition: 10357 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:45.102  1401  3074 D WindowManager: deferringAddStartActivities clear
12-20 00:05:45.104  1401  3074 D WindowManager: Transition is created, t=TransitionRecord{58d12d3 id=-1 type=CLOSE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createTransition:17 com.android.server.wm.TransitionController.requestCloseTransitionIfNeeded:73 com.android.server.wm.ActivityRecord.finishIfPossible:38 com.android.server.wm.ActivityClientController.finishActivity:268 
12-20 00:05:45.105  1401  3074 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{992aa68 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}
12-20 00:05:45.176  1401  3509 D WindowManager: Transition is created, t=TransitionRecord{ee9bad0 id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:45.176  1401  3509 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}
12-20 00:05:45.178  1401  3509 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{b01e375 u0 com.katsuyamaki.DroidOSLauncher}, navColorWin=Window{8d8ec89 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.DisplayPolicy.finishPostLayoutPolicyLw:17 com.android.server.wm.RootWindowContainer.applySurfaceChangesTransaction$1:195 com.android.server.wm.RootWindowContainer.performSurfacePlacementNoTrace:86 
12-20 00:05:45.178  1401  3509 D WindowManager: updateSystemBarAttributes, bhv=1, apr=0, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-20 00:05:45.193  1401  3545 I WindowManager: Relayout Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:45.199  1401  3545 I WindowManager: Relayout hash=dea7911, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:45.199  1401  3545 I WindowManager:   fl=8d810100
12-20 00:05:45.199  1401  3545 I WindowManager:   pfl=10008040
12-20 00:05:45.199  1401  3545 I WindowManager:   vsysui=700
12-20 00:05:45.199  1401  3545 I WindowManager:   bhv=1
12-20 00:05:45.199  1401  3545 I WindowManager:   fitSides=0
12-20 00:05:45.199  1401  3545 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:45.199  1401  3545 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:45.203  1401  3546 D WindowManager: finishDrawingWindow: Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:45.211  1401  2168 D WindowManager: Transition is created, t=TransitionRecord{e184839 id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:45.213  1401  2168 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}
12-20 00:05:45.222  1401  3545 I WindowManager: Relayout Window{992aa68 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}: viewVisibility=8 req=0x0 ty=1 d0
12-20 00:05:45.223  1401  3545 I WindowManager: Relayout hash=992aa68, pid=6596, syncId=-1: mAttrs={(0,0)(wrapxwrap) sim={adjust=pan forwardNavigation} ty=BASE_APPLICATION fmt=TRANSPARENT
12-20 00:05:45.223  1401  3545 I WindowManager:   fl=1800000
12-20 00:05:45.223  1401  3545 I WindowManager:   pfl=40000880
12-20 00:05:45.223  1401  3545 I WindowManager:   bhv=1
12-20 00:05:45.223  1401  3545 I WindowManager:   fitTypes=207
12-20 00:05:45.223  1401  3545 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:45.223  1401  3545 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:45.228  1401  1544 I ActivityManager: Changes in 10272 19 to 19, 128 to 0
12-20 00:05:45.236  6596  6596 D ViewRootImpl: Skipping stats log for color mode
12-20 00:05:45.256  1401  1645 D WindowManager: finishDrawingWindow: Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity} mDrawState=HAS_DRAWN seqId=0
12-20 00:05:45.317  1401  3546 D WindowManager: Transition is created, t=TransitionRecord{126d051 id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:45.318  1401  3546 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{554dc55 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}
12-20 00:05:45.324  1401  3546 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{b01e375 u0 com.katsuyamaki.DroidOSLauncher}, navColorWin=Window{8d8ec89 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.DisplayPolicy.finishPostLayoutPolicyLw:17 com.android.server.wm.RootWindowContainer.applySurfaceChangesTransaction$1:195 com.android.server.wm.RootWindowContainer.performSurfacePlacementNoTrace:86 
12-20 00:05:45.324  1401  3546 D WindowManager: updateSystemBarAttributes, bhv=1, apr=1048576, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-20 00:05:45.350  1401  1868 D WindowManager: Transition is created, t=TransitionRecord{14cd445 id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:45.400  1401  2168 I WindowManager: Relayout Window{554dc55 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}: viewVisibility=0 req=918x1260 ty=1 d0
12-20 00:05:45.401  1401  2168 I WindowManager: Relayout hash=554dc55, pid=6596, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:45.401  1401  2168 I WindowManager:   fl=80810100
12-20 00:05:45.401  1401  2168 I WindowManager:   pfl=10008840
12-20 00:05:45.401  1401  2168 I WindowManager:   bhv=1
12-20 00:05:45.401  1401  2168 I WindowManager:   fitSides=0
12-20 00:05:45.401  1401  2168 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:45.401  1401  2168 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:45.413  1401  2168 D WindowManager: finishDrawingWindow: Window{554dc55 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:45.413  1401  2168 I WindowManager: finishDrawing of relaunch: Window{554dc55 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity} 90ms
12-20 00:05:45.417  1401  1544 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}
12-20 00:05:45.417  1401  3509 E InputDispatcher: Embedded{TaskInputSink of Surface(name=Decor container of Task=18325)/@0xaf94a60} has feature NO_INPUT_WINDOW, but a non-null token. Clearing
12-20 00:05:45.429  1401  2168 I WindowManager: Relayout Window{554dc55 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:45.430  1401  2168 I WindowManager: Relayout hash=554dc55, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:45.430  1401  2168 I WindowManager:   fl=80810100
12-20 00:05:45.430  1401  2168 I WindowManager:   pfl=10008840
12-20 00:05:45.430  1401  2168 I WindowManager:   bhv=1
12-20 00:05:45.430  1401  2168 I WindowManager:   fitSides=0
12-20 00:05:45.430  1401  2168 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:45.430  1401  2168 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:45.431  1401  2168 I WindowManager: Relayout Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:45.432  1401  3074 D WindowManager: finishDrawingWindow: Window{554dc55 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity} mDrawState=HAS_DRAWN seqId=0
12-20 00:05:45.432  1401  2168 I WindowManager: Relayout hash=dea7911, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:45.432  1401  2168 I WindowManager:   fl=8d810100
12-20 00:05:45.432  1401  2168 I WindowManager:   pfl=10008040
12-20 00:05:45.432  1401  2168 I WindowManager:   vsysui=700
12-20 00:05:45.432  1401  2168 I WindowManager:   bhv=1
12-20 00:05:45.432  1401  2168 I WindowManager:   fitSides=0
12-20 00:05:45.432  1401  2168 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:45.432  1401  2168 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:45.436  1401  1868 D WindowManager: finishDrawingWindow: Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:45.457  1401  2168 D WindowManager: finishDrawingWindow: Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity} mDrawState=HAS_DRAWN seqId=0
12-20 00:05:45.763  1401  1868 D WindowManager: Transition is created, t=TransitionRecord{d8c7d68 id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:45.764  1401  1868 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}
12-20 00:05:45.782  1401  3509 I WindowManager: Relayout Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:45.783  1401  3509 I WindowManager: Relayout hash=dea7911, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:45.783  1401  3509 I WindowManager:   fl=8d810100
12-20 00:05:45.783  1401  3509 I WindowManager:   pfl=10008040
12-20 00:05:45.783  1401  3509 I WindowManager:   vsysui=700
12-20 00:05:45.783  1401  3509 I WindowManager:   bhv=1
12-20 00:05:45.783  1401  3509 I WindowManager:   fitSides=0
12-20 00:05:45.783  1401  3509 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:45.783  1401  3509 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:45.787  1401  3509 D WindowManager: finishDrawingWindow: Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:45.795  1401  3074 D WindowManager: finishDrawingWindow: Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity} mDrawState=HAS_DRAWN seqId=0
12-20 00:05:45.935  1401  2251 D WindowManager: Transition is created, t=TransitionRecord{3c92074 id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:45.936  1401  2251 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{554dc55 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}
12-20 00:05:46.773  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-20 00:05:47.225  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=185515063288000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-20 00:05:47.227  1401  1700 I InputDispatcher: Delivering touch to (3972): action: 0x0, f=0x0, d=0, 'b01e375', t=1 +(0,-116)
12-20 00:05:47.264  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-20 00:05:47.266  1401  2589 E InputDispatcher: Embedded{TaskInputSink of Surface(name=Decor container of Task=18325)/@0xaf94a60} has feature NO_INPUT_WINDOW, but a non-null token. Clearing
12-20 00:05:47.275  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=185515119101000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-20 00:05:47.275  1401  1700 I InputDispatcher: Delivering touch to (3972): action: 0x1, f=0x0, d=0, 'b01e375', t=1 +(0,-116)
12-20 00:05:47.276  3972  3972 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{ffc88d0 VFE...C.. .F.P.... 0,0-1080,2404 aid=1}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.quadrantlauncher.FloatingLauncherService.toggleDrawer:537 
12-20 00:05:47.292  1401  3074 I WindowManager: Relayout Window{c3b8059 u0 com.katsuyamaki.DroidOSLauncher}: viewVisibility=0 req=63x63 ty=2032 d0
12-20 00:05:47.293  1401  3074 D WindowManager: makeSurface duration=0 name=$_3972
12-20 00:05:47.295  1401  3074 I WindowManager: Relayout hash=c3b8059, pid=3972, syncId=-1: mAttrs={(50,200)(wrapxwrap) gr=TOP START CENTER sim={adjust=pan} ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-20 00:05:47.295  1401  3074 I WindowManager:   fl=1040308
12-20 00:05:47.295  1401  3074 I WindowManager:   bhv=1
12-20 00:05:47.295  1401  3074 I WindowManager:   fitTypes=206
12-20 00:05:47.295  1401  3074 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:47.295  1401  3074 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:47.304  1401  2251 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=b217ba3 InputMethod)/@0xfd8bc1b - animation-leash of insets_animation)/@0x204f340
12-20 00:05:47.304  1401  2251 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{c321922 type=2011 android.os.Binder@edfc6ed})/@0x7a81b8, destroy=false, surface=Surface(name=b217ba3 InputMethod)/@0xfd8bc1b
12-20 00:05:47.304  1401  2251 I WindowManager: Reparenting to leash, surface=Surface(name=b217ba3 InputMethod)/@0xfd8bc1b, leashParent=Surface(name=WindowToken{c321922 type=2011 android.os.Binder@edfc6ed})/@0x7a81b8
12-20 00:05:47.305  1401  2251 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=b217ba3 InputMethod)/@0xfd8bc1b - animation-leash of insets_animation)/@0x9af7937
12-20 00:05:47.306  1401  2251 D WindowManager: Changing focus from Window{b01e375 u0 com.katsuyamaki.DroidOSLauncher} to Window{554dc55 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity} displayId=0 Callers=com.android.server.wm.WindowState.removeIfPossible:647 com.android.server.wm.Session.remove:16 android.view.IWindowSession$Stub.onTransact:804 com.android.server.wm.Session.onTransact:1 
12-20 00:05:47.306  1401  2251 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0x9157a6a
12-20 00:05:47.306  1401  2251 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf, destroy=false, surface=Surface(name=253deac NavigationBar0)/@0x344c78e
12-20 00:05:47.306  1401  2251 I WindowManager: Reparenting to leash, surface=Surface(name=253deac NavigationBar0)/@0x344c78e, leashParent=Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf
12-20 00:05:47.307  1401  2251 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0x17871d3
12-20 00:05:47.307  1401  2251 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=7a1affc StatusBar)/@0x9878745 - animation-leash of insets_animation)/@0x284e598
12-20 00:05:47.307  1401  2251 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{ea68ef type=2000 android.os.BinderProxy@acba6c9})/@0xe49ce9a, destroy=false, surface=Surface(name=7a1affc StatusBar)/@0x9878745
12-20 00:05:47.307  1401  2251 I WindowManager: Reparenting to leash, surface=Surface(name=7a1affc StatusBar)/@0x9878745, leashParent=Surface(name=WindowToken{ea68ef type=2000 android.os.BinderProxy@acba6c9})/@0xe49ce9a
12-20 00:05:47.307  1401  2251 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=7a1affc StatusBar)/@0x9878745 - animation-leash of insets_animation)/@0xf28f110
12-20 00:05:47.307  1401  2251 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{554dc55 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}, navColorWin=Window{8d8ec89 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.WindowManagerService.updateFocusedWindowLocked:372 com.android.server.wm.WindowState.removeIfPossible:647 com.android.server.wm.Session.remove:16 
12-20 00:05:47.308  1401  2251 D WindowManager: updateSystemBarAttributes, bhv=1, apr=1048576, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-20 00:05:47.309  1401  3074 D WindowManager: finishDrawingWindow: Window{c3b8059 u0 com.katsuyamaki.DroidOSLauncher} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:47.310  1401  3074 W WindowManager: Failed looking up window session=Session{7abdcd2 3972:u0a10516} callers=com.android.server.wm.WindowManagerService.windowForClientLocked:1 com.android.server.wm.Session.setOnBackInvokedCallbackInfo:15 android.view.IWindowSession$Stub.onTransact:1390 
12-20 00:05:47.310  1401  3074 I WindowManager: setOnBackInvokedCallback(): No window state for package:com.katsuyamaki.DroidOSLauncher
12-20 00:05:47.310  1401  2589 D InputDispatcher: Focus left window (0): b01e375 com.katsuyamaki.DroidOSLauncher
12-20 00:05:47.326  1401  3074 D InputDispatcher: Once focus requested (0): 554dc55 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity
12-20 00:05:47.327  1401  3074 D InputDispatcher: Focus entered window (0): 554dc55 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity
12-20 00:05:47.337  1401  2589 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-20 00:05:47.337  1401  2589 D InputMethodManagerService: shouldShowImeSwitcherLocked : checking vis : 3
12-20 00:05:47.337  1401  2589 D InputMethodManagerService: checkDisplayOfStartInputAndUpdateKeyboard: displayId=0, mFocusedDisplayId=0
12-20 00:05:47.960  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=185515801850000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-20 00:05:47.961  1401  1700 I InputDispatcher: Delivering touch to (3972): action: 0x0, f=0x0, d=0, 'c3b8059', t=1 +(-50,-200)
12-20 00:05:47.994  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-20 00:05:48.023  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-20 00:05:48.050  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=185515893194000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-20 00:05:48.050  1401  1700 I InputDispatcher: Delivering touch to (3972): action: 0x1, f=0x0, d=0, 'c3b8059', t=1 +(-50,-200)
12-20 00:05:48.052  3972  3972 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{ffc88d0 VFE...C.. .F...... 0,0-1080,2404 aid=1}, caller=android.view.WindowManagerImpl.addView:158 com.example.quadrantlauncher.FloatingLauncherService.toggleDrawer:546 com.example.quadrantlauncher.FloatingLauncherService.access$toggleDrawer:54 
12-20 00:05:48.053  3972  3972 D ViewRootImpl: desktopMode is false
12-20 00:05:48.053  3972  3972 I ViewRootImpl: dVRR is disabled
12-20 00:05:48.059  1401  1868 D WindowManager: Changing focus from Window{554dc55 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity} to Window{c1b1e27 u0 com.katsuyamaki.DroidOSLauncher} displayId=0 Callers=com.android.server.wm.WindowManagerService.addWindowInner:565 com.android.server.wm.WindowManagerService.addWindow:1842 com.android.server.wm.Session.addToDisplayAsUser:24 android.view.IWindowSession$Stub.onTransact:757 
12-20 00:05:48.059  1401  1868 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0x17871d3
12-20 00:05:48.059  1401  1868 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf, destroy=false, surface=Surface(name=253deac NavigationBar0)/@0x344c78e
12-20 00:05:48.059  1401  1868 I WindowManager: Reparenting to leash, surface=Surface(name=253deac NavigationBar0)/@0x344c78e, leashParent=Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf
12-20 00:05:48.059  1401  1868 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0xc8bab1f
12-20 00:05:48.060  1401  1868 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=7a1affc StatusBar)/@0x9878745 - animation-leash of insets_animation)/@0xf28f110
12-20 00:05:48.060  1401  1868 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{ea68ef type=2000 android.os.BinderProxy@acba6c9})/@0xe49ce9a, destroy=false, surface=Surface(name=7a1affc StatusBar)/@0x9878745
12-20 00:05:48.060  1401  1868 I WindowManager: Reparenting to leash, surface=Surface(name=7a1affc StatusBar)/@0x9878745, leashParent=Surface(name=WindowToken{ea68ef type=2000 android.os.BinderProxy@acba6c9})/@0xe49ce9a
12-20 00:05:48.060  1401  1868 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=7a1affc StatusBar)/@0x9878745 - animation-leash of insets_animation)/@0x5b3ec35
12-20 00:05:48.060  1401  1868 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{c1b1e27 u0 com.katsuyamaki.DroidOSLauncher}, navColorWin=Window{8d8ec89 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.WindowManagerService.updateFocusedWindowLocked:372 com.android.server.wm.WindowManagerService.addWindowInner:565 com.android.server.wm.WindowManagerService.addWindow:1842 
12-20 00:05:48.061  1401  1868 D WindowManager: updateSystemBarAttributes, bhv=1, apr=1048576, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-20 00:05:48.074  1401  3509 I WindowManager: Relayout Window{c1b1e27 u0 com.katsuyamaki.DroidOSLauncher}: viewVisibility=0 req=1080x2404 ty=2032 d0
12-20 00:05:48.074  1401  3509 D WindowManager: makeSurface duration=1 name=$_3972
12-20 00:05:48.076  1401  3509 I WindowManager: Relayout hash=c1b1e27, pid=3972, syncId=-1: mAttrs={(0,0)(fillxfill) gr=TOP START CENTER sim={adjust=nothing} ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-20 00:05:48.076  1401  3509 I WindowManager:   fl=1000300
12-20 00:05:48.076  1401  3509 I WindowManager:   bhv=1
12-20 00:05:48.076  1401  3509 I WindowManager:   fitTypes=206
12-20 00:05:48.076  1401  3509 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:48.076  1401  3509 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:48.088  1401  2251 D InputDispatcher: Once focus requested (0): c1b1e27 com.katsuyamaki.DroidOSLauncher
12-20 00:05:48.088  1401  2251 D InputDispatcher: Focus request (0): c1b1e27 com.katsuyamaki.DroidOSLauncher but waiting because NO_WINDOW
12-20 00:05:48.088  1401  2251 D InputDispatcher: Focus left window (0): 554dc55 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity
12-20 00:05:48.225  1401  2589 I WindowManager: Relayout Window{c3b8059 u0 com.katsuyamaki.DroidOSLauncher}: viewVisibility=8 req=63x63 ty=2032 d0
12-20 00:05:48.225  1401  2589 E WindowManager: win=Window{c3b8059 u0 com.katsuyamaki.DroidOSLauncher} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=8 caller=com.android.server.wm.WindowManagerService.tryStartExitingAnimation:134 com.android.server.wm.WindowManagerService.relayoutWindow:1147 com.android.server.wm.Session.relayout:27 android.view.IWindowSession$Stub.onTransact:829 com.android.server.wm.Session.onTransact:1 android.os.Binder.execTransactInternal:1457 android.os.Binder.execTransact:1401 
12-20 00:05:48.226  1401  2589 I WindowManager: Relayout hash=c3b8059, pid=3972, syncId=-1: mAttrs={(50,200)(wrapxwrap) gr=TOP START CENTER sim={adjust=pan} ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-20 00:05:48.226  1401  2589 I WindowManager:   fl=1040308
12-20 00:05:48.226  1401  2589 I WindowManager:   bhv=1
12-20 00:05:48.226  1401  2589 I WindowManager:   fitTypes=206
12-20 00:05:48.226  1401  2589 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:48.226  1401  2589 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:48.227  1401  2237 D WindowManager: finishDrawingWindow: Window{c1b1e27 u0 com.katsuyamaki.DroidOSLauncher} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:48.252  1401  3074 D InputDispatcher: Focus entered window (0): c1b1e27 com.katsuyamaki.DroidOSLauncher
12-20 00:05:48.275  1401  2251 E InputDispatcher: Embedded{TaskInputSink of Surface(name=Decor container of Task=18325)/@0xaf94a60} has feature NO_INPUT_WINDOW, but a non-null token. Clearing
12-20 00:05:48.277  1401  1763 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-20 00:05:48.278  1401  1763 D InputMethodManagerService: shouldShowImeSwitcherLocked : checking vis : 3
12-20 00:05:48.278  1401  1763 D InputMethodManagerService: checkDisplayOfStartInputAndUpdateKeyboard: displayId=0, mFocusedDisplayId=0
12-20 00:05:48.279  1401  3509 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=b217ba3 InputMethod)/@0xfd8bc1b - animation-leash of insets_animation)/@0x9af7937
12-20 00:05:48.279  1401  3509 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{c321922 type=2011 android.os.Binder@edfc6ed})/@0x7a81b8, destroy=false, surface=Surface(name=b217ba3 InputMethod)/@0xfd8bc1b
12-20 00:05:48.279  1401  3509 I WindowManager: Reparenting to leash, surface=Surface(name=b217ba3 InputMethod)/@0xfd8bc1b, leashParent=Surface(name=WindowToken{c321922 type=2011 android.os.Binder@edfc6ed})/@0x7a81b8
12-20 00:05:48.280  1401  3509 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=b217ba3 InputMethod)/@0xfd8bc1b - animation-leash of insets_animation)/@0x432bc07
12-20 00:05:49.106  1401  1551 I ActivityManager: Changes in 10395 3 to 15, 144 to 0
12-20 00:05:49.737  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-20 00:05:50.357  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=185518200084000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-20 00:05:50.357  1401  1700 I InputDispatcher: Delivering touch to (3972): action: 0x0, f=0x0, d=0, 'c1b1e27', t=1 +(0,-116)
12-20 00:05:50.389  1401  1542 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-20 00:05:50.398  1401  2251 E InputDispatcher: Embedded{TaskInputSink of Surface(name=Decor container of Task=18325)/@0xaf94a60} has feature NO_INPUT_WINDOW, but a non-null token. Clearing
12-20 00:05:50.498  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=185518341623000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-20 00:05:50.498  1401  1700 I InputDispatcher: Delivering touch to (3972): action: 0x1, f=0x0, d=0, 'c1b1e27', t=1 +(0,-116)
12-20 00:05:50.656  1401  2237 I WindowManager: Using new display size: 1080x2520
12-20 00:05:50.658  1401  2251 I WindowManager: Using new display size: 1080x2520
12-20 00:05:50.669  1401  2237 I ActivityManager: Force stopping com.google.android.googlequicksearchbox appid=10270 user=0: from pid 7686
12-20 00:05:50.669  1401  2237 I ActivityManager: Killing 6596:com.google.android.googlequicksearchbox:search/u0a270 (adj 0): stop com.google.android.googlequicksearchbox due to from pid 7686
12-20 00:05:50.676  1401  2237 D WindowManager: Transition is created, t=TransitionRecord{84ce5cd id=-1 type=CLOSE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createTransition:17 com.android.server.wm.TransitionController.requestCloseTransitionIfNeeded:73 com.android.server.wm.WindowProcessController.handleAppDied$1:441 com.android.server.am.ActivityManagerService.handleAppDiedLocked:248 
12-20 00:05:50.677  1401  2237 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{554dc55 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}
12-20 00:05:50.678  1401  2237 D InputDispatcher: Focused application(0): ActivityRecord{147709724 u0 com.termux/.app.TermuxActivity t18195}
12-20 00:05:50.682  1401  2237 I ActivityManager: Killing 6693:com.google.android.googlequicksearchbox:googleapp/u0a270 (adj 915): stop com.google.android.googlequicksearchbox due to from pid 7686
12-20 00:05:50.695  1401  2237 I ActivityManager: Killing 6584:com.google.android.googlequicksearchbox:interactor/u0a270 (adj 100): stop com.google.android.googlequicksearchbox due to from pid 7686
12-20 00:05:50.698  1401  2237 I ActivityManager:   Force stopping service ServiceRecord{d03690e u0 com.google.android.googlequicksearchbox/com.google.android.apps.gsa.hotword.hotworddetectionservice.GsaHotwordDetectionService:hotword_detector_0 c:android}
12-20 00:05:50.701  1401  3074 I ActivityManager: Killing 6739:com.google.android.googlequicksearchbox:trusted_disable_art_image_:com.google.android.apps.gsa.hotword.hotworddetectionservice.GsaHotwordDetectionService:hotword_detector_0/u0a270i307 (adj 100): isolated not needed
12-20 00:05:50.702  1401  2251 W ActivityManager: Unbind failed: could not find connection for android.os.BinderProxy@c5af73a
12-20 00:05:50.703  1401  3509 W ActivityManager: Service done with onDestroy, but not inDestroying: ServiceRecord{6887ef0 u0 com.google.android.googlequicksearchbox/com.google.frameworks.client.data.android.server.tiktok.assistant.InteractorProcessEndpointService c:com.google.android.googlequicksearchbox}, app=ProcessRecord{ec00fad 0:com.google.android.googlequicksearchbox:interactor/u0a270}
12-20 00:05:50.719  1401  2251 I WindowManager: WIN DEATH: Window{554dc55 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}
12-20 00:05:50.719  1401  2590 D InputMethodManagerService: onClientRemovedInternalLocked
12-20 00:05:50.720  1401  2251 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{c1b1e27 u0 com.katsuyamaki.DroidOSLauncher}, navColorWin=Window{8d8ec89 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.DisplayPolicy.finishPostLayoutPolicyLw:17 com.android.server.wm.RootWindowContainer.applySurfaceChangesTransaction$1:195 com.android.server.wm.RootWindowContainer.performSurfacePlacementNoTrace:86 
12-20 00:05:50.721  1401  2251 D WindowManager: updateSystemBarAttributes, bhv=1, apr=0, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-20 00:05:50.722  1401  1765 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-20 00:05:50.722  1401  1765 D InputMethodManagerService: shouldShowImeSwitcherLocked : checking vis : 3
12-20 00:05:50.740  1401  1551 W ActivityManager: ProcessRecord{ec00fad 0:com.google.android.googlequicksearchbox:interactor/u0a270} is attached to a previous process 6584
12-20 00:05:50.745  1401  1544 W ActivityManager: setHasOverlayUi called on unknown pid: 6596
12-20 00:05:50.751  1401  1765 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-20 00:05:50.751  1401  1765 D InputMethodManagerService: shouldShowImeSwitcherLocked : checking vis : 3
12-20 00:05:50.771  1401  1553 I ActivityManager: Start proc 7711:com.google.android.googlequicksearchbox:interactor/u0a270 for service {com.google.android.googlequicksearchbox/com.google.android.voiceinteraction.GsaVoiceInteractionService}
12-20 00:05:50.772  1401  1553 I ActivityManager: ProcessObserver broadcast disabled
12-20 00:05:50.804  1401  1553 I ActivityManager: Start proc 7725:com.google.android.googlequicksearchbox:search/u0a270 for broadcast {com.google.android.googlequicksearchbox/com.google.android.libraries.assistant.contexttrigger.impl.ContextTriggerBroadcastReceiver_Receiver}
12-20 00:05:50.804  1401  1553 I ActivityManager: ProcessObserver broadcast disabled
12-20 00:05:50.850  1401  3075 I ActivityManager: Changes in 10270 19 to 5, 0 to 255
12-20 00:05:50.968  1401  1868 W WindowManager: Failed looking up window session=Session{c966652 2045:u0a10055} callers=com.android.server.wm.Session.remove:10 android.view.IWindowSession$Stub.onTransact:804 com.android.server.wm.Session.onTransact:1 
12-20 00:05:50.969  1401  3075 W WindowManager: Failed looking up window session=Session{c966652 2045:u0a10055} callers=com.android.server.wm.Session.remove:10 android.view.IWindowSession$Stub.onTransact:804 com.android.server.wm.Session.onTransact:1 
12-20 00:05:50.969  1401  2251 W WindowManager: Cannot find window which accessibility connection is added to
12-20 00:05:50.972  1401  3548 W WindowManager: Failed looking up window session=Session{c966652 2045:u0a10055} callers=com.android.server.wm.Session.remove:10 android.view.IWindowSession$Stub.onTransact:804 com.android.server.wm.Session.onTransact:1 
12-20 00:05:50.976  1401  3548 W ActivityManager: pid 1401 system sent binder code 7 with flags 1 to frozen apps and got error -32
12-20 00:05:50.976  1401  3548 W WindowManager: Exception thrown during dispatchAppVisibility Window{554dc55 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity EXITING}
12-20 00:05:50.976  1401  3548 W WindowManager: android.os.DeadObjectException
12-20 00:05:50.976  1401  3548 W WindowManager: 	at android.os.BinderProxy.transactNative(Native Method)
12-20 00:05:50.976  1401  3548 W WindowManager: 	at android.os.BinderProxy.transact(BinderProxy.java:661)
12-20 00:05:50.976  1401  3548 W WindowManager: 	at android.view.IWindow$Stub$Proxy.dispatchAppVisibility(IWindow.java:659)
12-20 00:05:50.976  1401  3548 W WindowManager: 	at com.android.server.wm.WindowState.sendAppVisibilityToClients(qb/103247004 13512400faf83fc2d6c21ba3dcd11c0dd5171ba299272a8c647b55f344650924:63)
12-20 00:05:50.976  1401  3548 W WindowManager: 	at com.android.server.wm.WindowContainer.sendAppVisibilityToClients(qb/103247004 13512400faf83fc2d6c21ba3dcd11c0dd5171ba299272a8c647b55f344650924:19)
12-20 00:05:50.976  1401  3548 W WindowManager: 	at com.android.server.wm.WindowToken.setClientVisible(qb/103247004 13512400faf83fc2d6c21ba3dcd11c0dd5171ba299272a8c647b55f344650924:48)
12-20 00:05:50.976  1401  3548 W WindowManager: 	at com.android.server.wm.ActivityRecord.commitVisibility(qb/103247004 13512400faf83fc2d6c21ba3dcd11c0dd5171ba299272a8c647b55f344650924:186)
12-20 00:05:50.976  1401  3548 W WindowManager: 	at com.android.server.wm.TransitionController.finishTransition(qb/103247004 13512400faf83fc2d6c21ba3dcd11c0dd5171ba299272a8c647b55f344650924:825)
12-20 00:05:50.976  1401  3548 W WindowManager: 	at com.android.server.wm.WindowOrganizerController.finishTransitionInner(qb/103247004 13512400faf83fc2d6c21ba3dcd11c0dd5171ba299272a8c647b55f344650924:31)
12-20 00:05:50.976  1401  3548 W WindowManager: 	at com.android.server.wm.WindowOrganizerController.finishAllTransitions(qb/103247004 13512400faf83fc2d6c21ba3dcd11c0dd5171ba299272a8c647b55f344650924:60)
12-20 00:05:50.976  1401  3548 W WindowManager: 	at android.window.IWindowOrganizerController$Stub.onTransact(IWindowOrganizerController.java:283)
12-20 00:05:50.976  1401  3548 W WindowManager: 	at com.android.server.wm.WindowOrganizerController.onTransact(qb/103247004 13512400faf83fc2d6c21ba3dcd11c0dd5171ba299272a8c647b55f344650924:1)
12-20 00:05:50.976  1401  3548 W WindowManager: 	at android.os.Binder.execTransactInternal(Binder.java:1462)
12-20 00:05:50.976  1401  3548 W WindowManager: 	at android.os.Binder.execTransact(Binder.java:1401)
12-20 00:05:51.012  1401  1553 I ActivityManager: Start proc 7814:com.google.android.googlequicksearchbox:googleapp/u0a270 for broadcast {com.google.android.googlequicksearchbox/com.google.android.libraries.notifications.platform.entrypoints.restart.RestartReceiver}
12-20 00:05:51.012  1401  1553 I ActivityManager: ProcessObserver broadcast disabled
12-20 00:05:51.075  1401  1552 I ActivityManager: Changes in 10262 19 to 11, 0 to 128
12-20 00:05:51.080  1401  1553 I ActivityManager: Start proc 7834:com.google.android.googlequicksearchbox:trusted_disable_art_image_:com.google.android.apps.gsa.hotword.hotworddetectionservice.GsaHotwordDetectionService:hotword_detector_0/u0i308 for service {com.google.android.googlequicksearchbox/com.google.android.apps.gsa.hotword.hotworddetectionservice.GsaHotwordDetectionService:hotword_detector_0}
12-20 00:05:51.080  1401  1553 I ActivityManager: ProcessObserver broadcast disabled
12-20 00:05:51.115  1401  1868 I ActivityManager: Changes in 99308 19 to 5, 0 to 184
12-20 00:05:51.128  1401  2590 I ActivityManager: Changes in 10262 11 to 19, 128 to 0
12-20 00:05:51.300  1401  1551 I ActivityManager: Changes in 10210 3 to 7, 144 to 128
12-20 00:05:51.620  1401  2237 D WindowManager: Transition is created, t=TransitionRecord{810e9d9 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:51.628  1401  2237 D WindowManager: Aborting Transition: 10366 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:51.634  1401  1645 I WindowManager: Relayout Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:51.637  1401  1645 I WindowManager: Relayout hash=dea7911, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:51.637  1401  1645 I WindowManager:   fl=8d810100
12-20 00:05:51.637  1401  1645 I WindowManager:   pfl=10008040
12-20 00:05:51.637  1401  1645 I WindowManager:   vsysui=700
12-20 00:05:51.637  1401  1645 I WindowManager:   bhv=1
12-20 00:05:51.637  1401  1645 I WindowManager:   fitSides=0
12-20 00:05:51.637  1401  1645 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:51.637  1401  1645 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:51.641  1401  2590 D WindowManager: Transition is created, t=TransitionRecord{2814a77 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:51.642  1401  2590 D WindowManager: Aborting Transition: 10367 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:51.650  1401  2590 I WindowManager: Relayout Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:51.651  1401  2590 I WindowManager: Relayout hash=dea7911, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:51.651  1401  2590 I WindowManager:   fl=8d810100
12-20 00:05:51.651  1401  2590 I WindowManager:   pfl=10008040
12-20 00:05:51.651  1401  2590 I WindowManager:   vsysui=700
12-20 00:05:51.651  1401  2590 I WindowManager:   bhv=1
12-20 00:05:51.651  1401  2590 I WindowManager:   fitSides=0
12-20 00:05:51.651  1401  2590 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:51.651  1401  2590 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:51.689  1401  2590 D WindowManager: Transition is created, t=TransitionRecord{598c8c8 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:51.691  1401  2590 D WindowManager: Aborting Transition: 10368 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:51.692  1401  2237 D WindowManager: Transition is created, t=TransitionRecord{5d5a974 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:51.693  1401  2237 D WindowManager: Aborting Transition: 10369 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:51.700  1401  2237 I WindowManager: Relayout Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:51.701  1401  2237 I WindowManager: Relayout hash=dea7911, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:51.701  1401  2237 I WindowManager:   fl=8d810100
12-20 00:05:51.701  1401  2237 I WindowManager:   pfl=10008040
12-20 00:05:51.701  1401  2237 I WindowManager:   vsysui=700
12-20 00:05:51.701  1401  2237 I WindowManager:   bhv=1
12-20 00:05:51.701  1401  2237 I WindowManager:   fitSides=0
12-20 00:05:51.701  1401  2237 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:51.701  1401  2237 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:51.709  1401  2237 I WindowManager: Relayout Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:51.710  1401  2237 I WindowManager: Relayout hash=dea7911, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:51.710  1401  2237 I WindowManager:   fl=8d810100
12-20 00:05:51.710  1401  2237 I WindowManager:   pfl=10008040
12-20 00:05:51.710  1401  2237 I WindowManager:   vsysui=700
12-20 00:05:51.710  1401  2237 I WindowManager:   bhv=1
12-20 00:05:51.710  1401  2237 I WindowManager:   fitSides=0
12-20 00:05:51.710  1401  2237 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:51.710  1401  2237 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:52.039  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=185519882718000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-20 00:05:52.039  1401  1700 I InputDispatcher: Delivering touch to (3972): action: 0x0, f=0x0, d=0, 'c1b1e27', t=1 +(0,-116)
12-20 00:05:52.048  1401  2590 E InputDispatcher: Embedded{TaskInputSink of Surface(name=Decor container of Task=18195)/@0x417d4e1} has feature NO_INPUT_WINDOW, but a non-null token. Clearing
12-20 00:05:52.146  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=185519990488000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-20 00:05:52.146  1401  1700 I InputDispatcher: Delivering touch to (3972): action: 0x1, f=0x0, d=0, 'c1b1e27', t=1 +(0,-116)
12-20 00:05:52.154  1401  1645 D WindowManager: Transition is created, t=TransitionRecord{a9d170e id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:52.161  1401  1868 D InputDispatcher: Focused application(0): ActivityRecord{195906064 u0 com.google.android.apps.bard/.shellapp.BardEntryPointActivity t18330}
12-20 00:05:52.166  1401  1544 I ActivityManager: Changes in 10272 19 to 2, 0 to 255
12-20 00:05:52.171  1401  3546 D InputDispatcher: Focused application(0): ActivityRecord{255644355 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink t18330}
12-20 00:05:52.174  1401  1544 I ActivityManager: Changes in 10272 2 to 19, 255 to 128
12-20 00:05:52.193  7725  7725 D ViewRootImpl: desktopMode is false
12-20 00:05:52.193  7725  7725 I ViewRootImpl: dVRR is disabled
12-20 00:05:52.195  1401  2495 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{83cc907 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}
12-20 00:05:52.199  1401  3546 I WindowManager: Relayout Window{83cc907 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}: viewVisibility=0 req=0x0 ty=1 d0
12-20 00:05:52.199  1401  3546 D WindowManager: makeSurface duration=0 name=com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink$_7725
12-20 00:05:52.199  1401  3546 I WindowManager: Relayout hash=83cc907, pid=7725, syncId=-1: mAttrs={(0,0)(wrapxwrap) sim={adjust=pan forwardNavigation} ty=BASE_APPLICATION fmt=TRANSPARENT
12-20 00:05:52.199  1401  3546 I WindowManager:   fl=1800000
12-20 00:05:52.199  1401  3546 I WindowManager:   pfl=40000880
12-20 00:05:52.199  1401  3546 I WindowManager:   bhv=1
12-20 00:05:52.199  1401  3546 I WindowManager:   fitTypes=207
12-20 00:05:52.199  1401  3546 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:52.199  1401  3546 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:52.202  1401  2724 D WindowManager: finishDrawingWindow: Window{83cc907 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:52.214  1401  1868 D WindowManager: Transition is created, t=TransitionRecord{7bb48e1 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:52.214  1401  1868 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{83cc907 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}
12-20 00:05:52.237  1401  1645 I WindowManager: Relayout Window{8d8ec89 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}: viewVisibility=0 req=1080x2520 ty=1 d0
12-20 00:05:52.238  1401  1645 I WindowManager: Relayout hash=8d8ec89, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=nothing forwardNavigation} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION fmt=TRANSPARENT wanim=0x1030306
12-20 00:05:52.238  1401  1645 I WindowManager:   fl=81910100
12-20 00:05:52.238  1401  1645 I WindowManager:   pfl=10008840
12-20 00:05:52.238  1401  1645 I WindowManager:   bhv=2
12-20 00:05:52.238  1401  1645 I WindowManager:   fitSides=0
12-20 00:05:52.238  1401  1645 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:52.238  1401  1645 I WindowManager:   dvrrWindowFrameRateHint=true screenDimDuration=200000 naviIconColor=0}
12-20 00:05:52.238  7725  7725 D ViewRootImpl: Skipping stats log for color mode
12-20 00:05:52.243  7725  7725 D ViewRootImpl: desktopMode is false
12-20 00:05:52.243  7725  7725 I ViewRootImpl: dVRR is disabled
12-20 00:05:52.243  1401  3549 I ActivityManager: Changes in 10395 15 to 3, 0 to 144
12-20 00:05:52.244  1401  2151 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{3a356bb u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}
12-20 00:05:52.246  1401  2255 I WindowManager: Relayout Window{3a356bb u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}: viewVisibility=0 req=0x0 ty=1 d0
12-20 00:05:52.246  1401  2255 D WindowManager: makeSurface duration=1 name=com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink$_7725
12-20 00:05:52.247  1401  2255 I WindowManager: Relayout hash=3a356bb, pid=7725, syncId=-1: mAttrs={(0,0)(wrapxwrap) sim={adjust=pan forwardNavigation} ty=BASE_APPLICATION fmt=TRANSPARENT
12-20 00:05:52.247  1401  2255 I WindowManager:   fl=1800000
12-20 00:05:52.247  1401  2255 I WindowManager:   pfl=40000880
12-20 00:05:52.247  1401  2255 I WindowManager:   bhv=1
12-20 00:05:52.247  1401  2255 I WindowManager:   fitTypes=207
12-20 00:05:52.247  1401  2255 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:52.247  1401  2255 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:52.252  1401  3076 D InputDispatcher: Focused application(0): ActivityRecord{74458888 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity t18331}
12-20 00:05:52.252  1401  3076 D WindowManager: deferringAddStartActivities clear
12-20 00:05:52.253  1401  3703 D WindowManager: finishDrawingWindow: Window{3a356bb u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:52.253  1401  3703 I WindowManager: finishDrawing of relaunch: Window{3a356bb u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink} 27ms
12-20 00:05:52.254  2045  2203 D ViewRootImpl: desktopMode is false
12-20 00:05:52.254  2045  2203 I ViewRootImpl: dVRR is disabled
12-20 00:05:52.256  1401  2168 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{ff6238 u0 Splash Screen com.google.android.googlequicksearchbox}
12-20 00:05:52.259  1401  2255 I WindowManager: Relayout Window{ff6238 u0 Splash Screen com.google.android.googlequicksearchbox}: viewVisibility=0 req=1080x2520 ty=3 d0
12-20 00:05:52.260  1401  2255 D WindowManager: makeSurface duration=0 name=Splash Screen com.google.android.googlequicksearchbox$_2045
12-20 00:05:52.265  1401  2255 I WindowManager: Relayout hash=ff6238, pid=2045, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=pan} layoutInDisplayCutoutMode=always ty=APPLICATION_STARTING fmt=TRANSLUCENT wanim=0x1030317
12-20 00:05:52.265  1401  2255 I WindowManager:   fl=81030118
12-20 00:05:52.265  1401  2255 I WindowManager:   pfl=10000810
12-20 00:05:52.265  1401  2255 I WindowManager:   bhv=1
12-20 00:05:52.265  1401  2255 I WindowManager:   fitSides=0
12-20 00:05:52.265  1401  2255 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:52.265  1401  2255 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:52.283  7725  7725 D ViewRootImpl: desktopMode is false
12-20 00:05:52.283  7725  7725 I ViewRootImpl: dVRR is disabled
12-20 00:05:52.292  1401  3549 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{315cb86 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}
12-20 00:05:52.296  1401  3076 D WindowManager: finishDrawingWindow: Window{ff6238 u0 Splash Screen com.google.android.googlequicksearchbox} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:52.308  1401  2724 I WindowManager: Relayout Window{315cb86 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}: viewVisibility=0 req=918x1260 ty=1 d0
12-20 00:05:52.308  1401  2724 D WindowManager: makeSurface duration=1 name=com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity$_7725
12-20 00:05:52.309  1401  2724 I WindowManager: Relayout hash=315cb86, pid=7725, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:52.309  1401  2724 I WindowManager:   fl=81810100
12-20 00:05:52.309  1401  2724 I WindowManager:   pfl=100088c0
12-20 00:05:52.309  1401  2724 I WindowManager:   bhv=1
12-20 00:05:52.309  1401  2724 I WindowManager:   fitSides=0
12-20 00:05:52.309  1401  2724 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:52.309  1401  2724 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:52.309  2045  2142 D ViewRootImpl: desktopMode is false
12-20 00:05:52.309  2045  2142 I ViewRootImpl: dVRR is disabled
12-20 00:05:52.314  1401  1868 W WindowManager: Cannot find window which accessibility connection is added to
12-20 00:05:52.319  1401  2724 D WindowManager: finishDrawingWindow: Window{315cb86 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:52.393  1401  3076 I WindowManager: Relayout Window{ff6238 u0 Splash Screen com.google.android.googlequicksearchbox}: viewVisibility=8 req=918x1260 ty=3 d0
12-20 00:05:52.394  1401  3076 I WindowManager: Relayout hash=ff6238, pid=2045, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=pan} layoutInDisplayCutoutMode=always ty=APPLICATION_STARTING fmt=TRANSLUCENT wanim=0x1030317
12-20 00:05:52.394  1401  3076 I WindowManager:   fl=81030118
12-20 00:05:52.394  1401  3076 I WindowManager:   pfl=10000810
12-20 00:05:52.394  1401  3076 I WindowManager:   bhv=1
12-20 00:05:52.394  1401  3076 I WindowManager:   fitSides=0
12-20 00:05:52.394  1401  3076 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:52.394  1401  3076 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:52.396  1401  2247 D WindowManager: Starting window removed Window{ff6238 u0 Splash Screen com.google.android.googlequicksearchbox}
12-20 00:05:52.404  1401  3076 I WindowManager: Using new display size: 1080x2520
12-20 00:05:52.430  1401  3076 D WindowManager: Transition is created, t=TransitionRecord{1ba9594 id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:52.430  1401  3076 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}
12-20 00:05:52.453  1401  3549 D WindowManager: Transition is created, t=TransitionRecord{43413eb id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:52.453  1401  3549 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}
12-20 00:05:52.600  1401  2724 D WindowManager: Transition is created, t=TransitionRecord{7b62877 id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:52.601  1401  2724 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}
12-20 00:05:52.605  1401  2237 D WindowManager: Transition is created, t=TransitionRecord{93af6f id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:52.605  1401  2237 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}
12-20 00:05:52.743  1401  3076 I WindowManager: Relayout Window{3a356bb u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}: viewVisibility=8 req=0x0 ty=1 d0
12-20 00:05:52.743  1401  3076 I WindowManager: Relayout hash=3a356bb, pid=7725, syncId=-1: mAttrs={(0,0)(wrapxwrap) sim={adjust=pan forwardNavigation} ty=BASE_APPLICATION fmt=TRANSPARENT
12-20 00:05:52.743  1401  3076 I WindowManager:   fl=1800000
12-20 00:05:52.743  1401  3076 I WindowManager:   pfl=40000880
12-20 00:05:52.743  1401  3076 I WindowManager:   bhv=1
12-20 00:05:52.743  1401  3076 I WindowManager:   fitTypes=207
12-20 00:05:52.743  1401  3076 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:52.743  1401  3076 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:52.747  7725  7725 D ViewRootImpl: Skipping stats log for color mode
12-20 00:05:52.749  1401  1544 I ActivityManager: Changes in 10272 19 to 19, 128 to 0
12-20 00:05:52.986  1401  2247 I WindowManager: Using new display size: 1080x2520
12-20 00:05:53.361  1401  2323 D WindowManager: Transition is created, t=TransitionRecord{3c76255 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:53.367  1401  2323 D InputDispatcher: Focused application(0): ActivityRecord{147709724 u0 com.termux/.app.TermuxActivity t18195}
12-20 00:05:53.370  1401  2323 D WindowManager: Aborting Transition: 10376 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:53.374  1401  2247 I WindowManager: Relayout Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:53.377  1401  2247 I WindowManager: Relayout hash=dea7911, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:53.377  1401  2247 I WindowManager:   fl=8d810100
12-20 00:05:53.377  1401  2247 I WindowManager:   pfl=10008040
12-20 00:05:53.377  1401  2247 I WindowManager:   vsysui=700
12-20 00:05:53.377  1401  2247 I WindowManager:   bhv=1
12-20 00:05:53.377  1401  2247 I WindowManager:   fitSides=0
12-20 00:05:53.377  1401  2247 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:53.377  1401  2247 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:53.386  1401  3076 E InputDispatcher: Embedded{TaskInputSink of Surface(name=Decor container of Task=18331)/@0x5c6c553} has feature NO_INPUT_WINDOW, but a non-null token. Clearing
12-20 00:05:53.436  1401  2247 D WindowManager: Transition is created, t=TransitionRecord{f109894 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:53.438  1401  2247 D WindowManager: Aborting Transition: 10377 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:53.440  1401  2247 I WindowManager: Relayout Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:53.441  1401  2247 I WindowManager: Relayout hash=dea7911, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:53.441  1401  2247 I WindowManager:   fl=8d810100
12-20 00:05:53.441  1401  2247 I WindowManager:   pfl=10008040
12-20 00:05:53.441  1401  2247 I WindowManager:   vsysui=700
12-20 00:05:53.441  1401  2247 I WindowManager:   bhv=1
12-20 00:05:53.441  1401  2247 I WindowManager:   fitSides=0
12-20 00:05:53.441  1401  2247 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:53.441  1401  2247 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:53.512  1401  2247 D WindowManager: Transition is created, t=TransitionRecord{84dd07e id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:53.517  1401  2247 D InputDispatcher: Focused application(0): ActivityRecord{229157376 u0 com.google.android.apps.bard/.shellapp.BardEntryPointActivity t18332}
12-20 00:05:53.526  1401  1544 I ActivityManager: Changes in 10272 19 to 2, 0 to 255
12-20 00:05:53.530  1401  3549 D InputDispatcher: Focused application(0): ActivityRecord{226153195 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink t18332}
12-20 00:05:53.539  1401  1544 I ActivityManager: Changes in 10272 2 to 19, 255 to 128
12-20 00:05:53.539  7725  7725 D ViewRootImpl: desktopMode is false
12-20 00:05:53.539  7725  7725 I ViewRootImpl: dVRR is disabled
12-20 00:05:53.541  1401  2724 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{2573e45 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}
12-20 00:05:53.544  1401  1868 I WindowManager: Relayout Window{2573e45 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}: viewVisibility=0 req=0x0 ty=1 d0
12-20 00:05:53.545  1401  1868 D WindowManager: makeSurface duration=0 name=com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink$_7725
12-20 00:05:53.546  1401  1868 I WindowManager: Relayout hash=2573e45, pid=7725, syncId=-1: mAttrs={(0,0)(wrapxwrap) sim={adjust=pan forwardNavigation} ty=BASE_APPLICATION fmt=TRANSPARENT
12-20 00:05:53.546  1401  1868 I WindowManager:   fl=1800000
12-20 00:05:53.546  1401  1868 I WindowManager:   pfl=40000880
12-20 00:05:53.546  1401  1868 I WindowManager:   bhv=1
12-20 00:05:53.546  1401  1868 I WindowManager:   fitTypes=207
12-20 00:05:53.546  1401  1868 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:53.546  1401  1868 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:53.549  1401  1868 D WindowManager: finishDrawingWindow: Window{2573e45 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:53.552  1401  1868 D WindowManager: Transition is created, t=TransitionRecord{a654325 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityStartController.startActivities:98 
12-20 00:05:53.553  1401  1868 D InputDispatcher: Focused application(0): ActivityRecord{74458888 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity t18331}
12-20 00:05:53.553  1401  1868 D WindowManager: Aborting Transition: 10379 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:53.553  1401  1868 D WindowManager: deferringAddStartActivities clear
12-20 00:05:53.553  1401  3548 D WindowManager: Transition is created, t=TransitionRecord{c4beca1 id=-1 type=CLOSE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createTransition:17 com.android.server.wm.TransitionController.requestCloseTransitionIfNeeded:73 com.android.server.wm.ActivityRecord.finishIfPossible:38 com.android.server.wm.ActivityClientController.finishActivity:268 
12-20 00:05:53.554  1401  3548 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{2573e45 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}
12-20 00:05:53.584  1401  2237 D WindowManager: Transition is created, t=TransitionRecord{ad93729 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:53.588  1401  2237 D InputDispatcher: Focused application(0): ActivityRecord{213399539 u0 com.google.android.apps.bard/.shellapp.BardEntryPointActivity t18333}
12-20 00:05:53.594  1401  1544 I ActivityManager: Changes in 10272 19 to 2, 128 to 255
12-20 00:05:53.600  1401  1645 D InputDispatcher: Focused application(0): ActivityRecord{204354164 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink t18333}
12-20 00:05:53.606  1401  1544 I ActivityManager: Changes in 10272 2 to 19, 255 to 128
12-20 00:05:53.607  7725  7725 D ViewRootImpl: desktopMode is false
12-20 00:05:53.607  7725  7725 I ViewRootImpl: dVRR is disabled
12-20 00:05:53.610  1401  1645 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{4c7f040 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}
12-20 00:05:53.612  1401  2724 I WindowManager: Relayout Window{4c7f040 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}: viewVisibility=0 req=0x0 ty=1 d0
12-20 00:05:53.613  1401  2724 D WindowManager: makeSurface duration=0 name=com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink$_7725
12-20 00:05:53.613  1401  2724 I WindowManager: Relayout hash=4c7f040, pid=7725, syncId=-1: mAttrs={(0,0)(wrapxwrap) sim={adjust=pan forwardNavigation} ty=BASE_APPLICATION fmt=TRANSPARENT
12-20 00:05:53.613  1401  2724 I WindowManager:   fl=1800000
12-20 00:05:53.613  1401  2724 I WindowManager:   pfl=40000880
12-20 00:05:53.613  1401  2724 I WindowManager:   bhv=1
12-20 00:05:53.613  1401  2724 I WindowManager:   fitTypes=207
12-20 00:05:53.613  1401  2724 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:53.613  1401  2724 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:53.616  1401  2773 D WindowManager: finishDrawingWindow: Window{4c7f040 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:53.626  1401  2151 I WindowManager: Relayout Window{2573e45 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}: viewVisibility=8 req=0x0 ty=1 d0
12-20 00:05:53.627  1401  2151 I WindowManager: Relayout hash=2573e45, pid=7725, syncId=-1: mAttrs={(0,0)(wrapxwrap) sim={adjust=pan forwardNavigation} ty=BASE_APPLICATION fmt=TRANSPARENT
12-20 00:05:53.627  1401  2151 I WindowManager:   fl=1800000
12-20 00:05:53.627  1401  2151 I WindowManager:   pfl=40000880
12-20 00:05:53.627  1401  2151 I WindowManager:   bhv=1
12-20 00:05:53.627  1401  2151 I WindowManager:   fitTypes=207
12-20 00:05:53.627  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:53.627  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:53.629  1401  1645 D WindowManager: Transition is created, t=TransitionRecord{787bb7e id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityStartController.startActivities:98 
12-20 00:05:53.631  1401  1645 D InputDispatcher: Focused application(0): ActivityRecord{74458888 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity t18331}
12-20 00:05:53.632  1401  1645 D WindowManager: Aborting Transition: 10382 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:53.632  1401  1645 D WindowManager: deferringAddStartActivities clear
12-20 00:05:53.632  1401  2773 D WindowManager: Transition is created, t=TransitionRecord{2d8002e id=-1 type=CLOSE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createTransition:17 com.android.server.wm.TransitionController.requestCloseTransitionIfNeeded:73 com.android.server.wm.ActivityRecord.finishIfPossible:38 com.android.server.wm.ActivityClientController.finishActivity:268 
12-20 00:05:53.633  1401  2773 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{4c7f040 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}
12-20 00:05:53.636  7725  7725 D ViewRootImpl: Skipping stats log for color mode
12-20 00:05:53.735  1401  2151 D WindowManager: Transition is created, t=TransitionRecord{8208aee id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:53.737  1401  2151 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}
12-20 00:05:53.814  1401  2151 D WindowManager: Transition is created, t=TransitionRecord{7519b23 id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:53.815  1401  2151 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{315cb86 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}
12-20 00:05:53.823  1401  2151 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{c1b1e27 u0 com.katsuyamaki.DroidOSLauncher}, navColorWin=Window{8d8ec89 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.DisplayPolicy.finishPostLayoutPolicyLw:17 com.android.server.wm.RootWindowContainer.applySurfaceChangesTransaction$1:195 com.android.server.wm.RootWindowContainer.performSurfacePlacementNoTrace:86 
12-20 00:05:53.823  1401  2151 D WindowManager: updateSystemBarAttributes, bhv=1, apr=1048576, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-20 00:05:53.892  1401  3076 I WindowManager: Relayout Window{315cb86 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}: viewVisibility=0 req=918x1260 ty=1 d0
12-20 00:05:53.893  1401  3076 I WindowManager: Relayout hash=315cb86, pid=7725, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:53.893  1401  3076 I WindowManager:   fl=80810100
12-20 00:05:53.893  1401  3076 I WindowManager:   pfl=10008840
12-20 00:05:53.893  1401  3076 I WindowManager:   bhv=1
12-20 00:05:53.893  1401  3076 I WindowManager:   fitSides=0
12-20 00:05:53.893  1401  3076 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:53.893  1401  3076 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:53.903  1401  2591 D WindowManager: finishDrawingWindow: Window{315cb86 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:53.903  1401  2591 I WindowManager: finishDrawing of relaunch: Window{315cb86 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity} 81ms
12-20 00:05:53.913  1401  1544 I ActivityManager: Changes in 10272 19 to 19, 128 to 0
12-20 00:05:53.915  1401  3076 I WindowManager: Relayout Window{315cb86 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:53.916  1401  3076 I WindowManager: Relayout hash=315cb86, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:53.916  1401  3076 I WindowManager:   fl=80810100
12-20 00:05:53.916  1401  3076 I WindowManager:   pfl=10008840
12-20 00:05:53.916  1401  3076 I WindowManager:   bhv=1
12-20 00:05:53.916  1401  3076 I WindowManager:   fitSides=0
12-20 00:05:53.916  1401  3076 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:53.916  1401  3076 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:53.919  1401  2773 D WindowManager: finishDrawingWindow: Window{315cb86 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity} mDrawState=HAS_DRAWN seqId=0
12-20 00:05:53.919  7725  7725 D ViewRootImpl: Skipping stats log for color mode
12-20 00:05:53.921  1401  2773 W WindowManager: Failed looking up window session=Session{bf5052b 7725:u0a10270} callers=com.android.server.wm.WindowManagerService.windowForClientLocked:1 com.android.server.wm.Session.setOnBackInvokedCallbackInfo:15 android.view.IWindowSession$Stub.onTransact:1390 
12-20 00:05:53.921  1401  2773 I WindowManager: setOnBackInvokedCallback(): No window state for package:com.google.android.googlequicksearchbox
12-20 00:05:53.935  1401  3076 D WindowManager: Transition is created, t=TransitionRecord{8e99eba id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:53.936  1401  3076 D InputDispatcher: Focused application(0): ActivityRecord{147709724 u0 com.termux/.app.TermuxActivity t18195}
12-20 00:05:53.937  1401  3076 D WindowManager: Aborting Transition: 10386 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:53.941  1401  3076 I WindowManager: Relayout Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:53.944  1401  3076 I WindowManager: Relayout hash=dea7911, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:53.944  1401  3076 I WindowManager:   fl=8d810100
12-20 00:05:53.944  1401  3076 I WindowManager:   pfl=10008040
12-20 00:05:53.944  1401  3076 I WindowManager:   vsysui=700
12-20 00:05:53.944  1401  3076 I WindowManager:   bhv=1
12-20 00:05:53.944  1401  3076 I WindowManager:   fitSides=0
12-20 00:05:53.944  1401  3076 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:53.944  1401  3076 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:54.012  1401  1868 D WindowManager: Transition is created, t=TransitionRecord{1f428a6 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:54.014  1401  1868 D WindowManager: Aborting Transition: 10387 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:54.023  1401  1868 I WindowManager: Relayout Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:54.024  1401  1868 I WindowManager: Relayout hash=dea7911, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:54.024  1401  1868 I WindowManager:   fl=8d810100
12-20 00:05:54.024  1401  1868 I WindowManager:   pfl=10008040
12-20 00:05:54.024  1401  1868 I WindowManager:   vsysui=700
12-20 00:05:54.024  1401  1868 I WindowManager:   bhv=1
12-20 00:05:54.024  1401  1868 I WindowManager:   fitSides=0
12-20 00:05:54.024  1401  1868 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:54.024  1401  1868 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:54.085  1401  1868 D WindowManager: Transition is created, t=TransitionRecord{5427d71 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:54.089  1401  1868 D InputDispatcher: Focused application(0): ActivityRecord{205304571 u0 com.google.android.apps.bard/.shellapp.BardEntryPointActivity t18334}
12-20 00:05:54.090  1401  1868 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{c1b1e27 u0 com.katsuyamaki.DroidOSLauncher}, navColorWin=Window{8d8ec89 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.DisplayPolicy.finishPostLayoutPolicyLw:17 com.android.server.wm.RootWindowContainer.applySurfaceChangesTransaction$1:195 com.android.server.wm.RootWindowContainer.performSurfacePlacementNoTrace:86 
12-20 00:05:54.090  1401  1868 D WindowManager: updateSystemBarAttributes, bhv=1, apr=0, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-20 00:05:54.096  1401  1544 I ActivityManager: Changes in 10272 19 to 2, 0 to 255
12-20 00:05:54.103  1401  2245 D InputDispatcher: Focused application(0): ActivityRecord{220197475 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink t18334}
12-20 00:05:54.109  1401  1544 I ActivityManager: Changes in 10272 2 to 19, 255 to 128
12-20 00:05:54.111  7725  7725 D ViewRootImpl: desktopMode is false
12-20 00:05:54.111  7725  7725 I ViewRootImpl: dVRR is disabled
12-20 00:05:54.112  1401  3509 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{c8a4f90 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}
12-20 00:05:54.116  1401  2151 I WindowManager: Relayout Window{c8a4f90 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}: viewVisibility=0 req=0x0 ty=1 d0
12-20 00:05:54.117  1401  2151 D WindowManager: makeSurface duration=0 name=com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink$_7725
12-20 00:05:54.118  1401  2151 I WindowManager: Relayout hash=c8a4f90, pid=7725, syncId=-1: mAttrs={(0,0)(wrapxwrap) sim={adjust=pan forwardNavigation} ty=BASE_APPLICATION fmt=TRANSPARENT
12-20 00:05:54.118  1401  2151 I WindowManager:   fl=1800000
12-20 00:05:54.118  1401  2151 I WindowManager:   pfl=40000880
12-20 00:05:54.118  1401  2151 I WindowManager:   bhv=1
12-20 00:05:54.118  1401  2151 I WindowManager:   fitTypes=207
12-20 00:05:54.118  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:54.118  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:54.120  1401  3076 D WindowManager: finishDrawingWindow: Window{c8a4f90 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:54.122  1401  1545 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{c1b1e27 u0 com.katsuyamaki.DroidOSLauncher}, navColorWin=Window{8d8ec89 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.DisplayPolicy.finishPostLayoutPolicyLw:17 com.android.server.wm.RootWindowContainer.applySurfaceChangesTransaction$1:195 com.android.server.wm.RootWindowContainer.performSurfacePlacementNoTrace:86 
12-20 00:05:54.123  1401  1545 D WindowManager: updateSystemBarAttributes, bhv=1, apr=1048576, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-20 00:05:54.129  1401  3703 D WindowManager: Transition is created, t=TransitionRecord{2b02014 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityStartController.startActivities:98 
12-20 00:05:54.131  1401  3703 D InputDispatcher: Focused application(0): ActivityRecord{74458888 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity t18331}
12-20 00:05:54.131  1401  3703 D WindowManager: Aborting Transition: 10389 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:54.132  1401  3703 D WindowManager: deferringAddStartActivities clear
12-20 00:05:54.133  1401  2245 D WindowManager: Transition is created, t=TransitionRecord{c792980 id=-1 type=CLOSE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createTransition:17 com.android.server.wm.TransitionController.requestCloseTransitionIfNeeded:73 com.android.server.wm.ActivityRecord.finishIfPossible:38 com.android.server.wm.ActivityClientController.finishActivity:268 
12-20 00:05:54.133  1401  2245 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{c8a4f90 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}
12-20 00:05:54.158  1401  1868 I WindowManager: Relayout Window{315cb86 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-20 00:05:54.160  1401  1868 I WindowManager: Relayout hash=315cb86, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION wanim=0x1030317
12-20 00:05:54.160  1401  1868 I WindowManager:   fl=80810100
12-20 00:05:54.160  1401  1868 I WindowManager:   pfl=10008840
12-20 00:05:54.160  1401  1868 I WindowManager:   bhv=1
12-20 00:05:54.160  1401  1868 I WindowManager:   fitSides=0
12-20 00:05:54.160  1401  1868 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:54.160  1401  1868 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:54.167  1401  3509 D WindowManager: Transition is created, t=TransitionRecord{b9d67c8 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-20 00:05:54.176  1401  3509 D InputDispatcher: Focused application(0): ActivityRecord{244710991 u0 com.google.android.apps.bard/.shellapp.BardEntryPointActivity t18335}
12-20 00:05:54.178  1401  3509 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{c1b1e27 u0 com.katsuyamaki.DroidOSLauncher}, navColorWin=Window{8d8ec89 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.DisplayPolicy.finishPostLayoutPolicyLw:17 com.android.server.wm.RootWindowContainer.applySurfaceChangesTransaction$1:195 com.android.server.wm.RootWindowContainer.performSurfacePlacementNoTrace:86 
12-20 00:05:54.178  1401  3509 D WindowManager: updateSystemBarAttributes, bhv=1, apr=0, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-20 00:05:54.188  1401  1544 I ActivityManager: Changes in 10272 19 to 2, 128 to 255
12-20 00:05:54.198  1401  2168 D InputDispatcher: Focused application(0): ActivityRecord{180023607 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink t18335}
12-20 00:05:54.202  1401  1544 I ActivityManager: Changes in 10272 2 to 19, 255 to 128
12-20 00:05:54.207  7725  7725 D ViewRootImpl: desktopMode is false
12-20 00:05:54.207  7725  7725 I ViewRootImpl: dVRR is disabled
12-20 00:05:54.209  1401  2168 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{71e9f22 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}
12-20 00:05:54.217  1401  2590 I WindowManager: Relayout Window{71e9f22 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}: viewVisibility=0 req=0x0 ty=1 d0
12-20 00:05:54.217  1401  2590 D WindowManager: makeSurface duration=0 name=com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink$_7725
12-20 00:05:54.218  1401  2590 I WindowManager: Relayout hash=71e9f22, pid=7725, syncId=-1: mAttrs={(0,0)(wrapxwrap) sim={adjust=pan forwardNavigation} ty=BASE_APPLICATION fmt=TRANSPARENT
12-20 00:05:54.218  1401  2590 I WindowManager:   fl=1800000
12-20 00:05:54.218  1401  2590 I WindowManager:   pfl=40000880
12-20 00:05:54.218  1401  2590 I WindowManager:   bhv=1
12-20 00:05:54.218  1401  2590 I WindowManager:   fitTypes=207
12-20 00:05:54.218  1401  2590 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:54.218  1401  2590 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:54.220  1401  2591 D WindowManager: finishDrawingWindow: Window{71e9f22 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:54.225  1401  1545 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{c1b1e27 u0 com.katsuyamaki.DroidOSLauncher}, navColorWin=Window{8d8ec89 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.DisplayPolicy.finishPostLayoutPolicyLw:17 com.android.server.wm.RootWindowContainer.applySurfaceChangesTransaction$1:195 com.android.server.wm.RootWindowContainer.performSurfacePlacementNoTrace:86 
12-20 00:05:54.225  1401  1545 D WindowManager: updateSystemBarAttributes, bhv=1, apr=1048576, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-20 00:05:54.227  1401  1645 D WindowManager: Transition is created, t=TransitionRecord{d245682 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityStartController.startActivities:98 
12-20 00:05:54.228  1401  1645 D InputDispatcher: Focused application(0): ActivityRecord{74458888 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity t18331}
12-20 00:05:54.229  1401  1645 D WindowManager: Aborting Transition: 10392 in state 0 called from com.android.server.wm.ActivityStarter.handleStartResult:802
12-20 00:05:54.229  1401  1645 D WindowManager: deferringAddStartActivities clear
12-20 00:05:54.231  1401  2168 D WindowManager: Transition is created, t=TransitionRecord{438b00b id=-1 type=CLOSE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createTransition:17 com.android.server.wm.TransitionController.requestCloseTransitionIfNeeded:73 com.android.server.wm.ActivityRecord.finishIfPossible:38 com.android.server.wm.ActivityClientController.finishActivity:268 
12-20 00:05:54.232  1401  2168 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{71e9f22 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}
12-20 00:05:54.261  7725  7725 D ViewRootImpl: Skipping stats log for color mode
12-20 00:05:54.301  1401  3703 D WindowManager: Transition is created, t=TransitionRecord{e83de69 id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:54.301  1401  3703 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}
12-20 00:05:54.379  1401  2591 D WindowManager: Transition is created, t=TransitionRecord{ce3a503 id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:54.379  1401  2591 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}
12-20 00:05:54.392  1401  2591 E InputDispatcher: Embedded{TaskInputSink of Surface(name=Decor container of Task=18331)/@0x5c6c553} has feature NO_INPUT_WINDOW, but a non-null token. Clearing
12-20 00:05:54.437  1401  2591 D WindowManager: Transition is created, t=TransitionRecord{c3facdc id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:54.438  1401  2591 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{315cb86 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}
12-20 00:05:54.495  1401  2251 D WindowManager: Transition is created, t=TransitionRecord{21a1ae0 id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:54.496  1401  2251 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{315cb86 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}
12-20 00:05:54.539  1401  1544 I ActivityManager: Changes in 10272 19 to 19, 128 to 0
12-20 00:05:54.541  1401  2590 I WindowManager: Relayout Window{71e9f22 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.deeplinks.handlers.gateway.impl.MainAssistantDeeplink}: viewVisibility=8 req=0x0 ty=1 d0
12-20 00:05:54.542  1401  2590 I WindowManager: Relayout hash=71e9f22, pid=7725, syncId=-1: mAttrs={(0,0)(wrapxwrap) sim={adjust=pan forwardNavigation} ty=BASE_APPLICATION fmt=TRANSPARENT
12-20 00:05:54.542  1401  2590 I WindowManager:   fl=1800000
12-20 00:05:54.542  1401  2590 I WindowManager:   pfl=40000880
12-20 00:05:54.542  1401  2590 I WindowManager:   bhv=1
12-20 00:05:54.542  1401  2590 I WindowManager:   fitTypes=207
12-20 00:05:54.542  1401  2590 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:54.542  1401  2590 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:54.546  7725  7725 D ViewRootImpl: Skipping stats log for color mode
12-20 00:05:54.594  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=185522438498000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-20 00:05:54.595  1401  1700 I InputDispatcher: Delivering touch to (3972): action: 0x0, f=0x0, d=0, 'c1b1e27', t=1 +(0,-116)
12-20 00:05:54.652  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=185522496592000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-20 00:05:54.652  1401  1700 I InputDispatcher: Delivering touch to (3972): action: 0x1, f=0x0, d=0, 'c1b1e27', t=1 +(0,-116)
12-20 00:05:54.653  3972  3972 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{ffc88d0 VFE...C.. .F.P.... 0,0-1080,2404 aid=1}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.quadrantlauncher.FloatingLauncherService.toggleDrawer:537 
12-20 00:05:54.658  1401  2151 I WindowManager: Relayout Window{c3b8059 u0 com.katsuyamaki.DroidOSLauncher}: viewVisibility=0 req=63x63 ty=2032 d0
12-20 00:05:54.659  1401  2151 D WindowManager: makeSurface duration=0 name=$_3972
12-20 00:05:54.660  1401  2151 I WindowManager: Relayout hash=c3b8059, pid=3972, syncId=-1: mAttrs={(50,200)(wrapxwrap) gr=TOP START CENTER sim={adjust=pan} ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-20 00:05:54.660  1401  2151 I WindowManager:   fl=1040308
12-20 00:05:54.660  1401  2151 I WindowManager:   bhv=1
12-20 00:05:54.660  1401  2151 I WindowManager:   fitTypes=206
12-20 00:05:54.660  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:54.660  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-20 00:05:54.666  1401  1645 D WindowManager: finishDrawingWindow: Window{c3b8059 u0 com.katsuyamaki.DroidOSLauncher} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:54.669  1401  1645 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=b217ba3 InputMethod)/@0xfd8bc1b - animation-leash of insets_animation)/@0x432bc07
12-20 00:05:54.669  1401  1645 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{c321922 type=2011 android.os.Binder@edfc6ed})/@0x7a81b8, destroy=false, surface=Surface(name=b217ba3 InputMethod)/@0xfd8bc1b
12-20 00:05:54.669  1401  1645 I WindowManager: Reparenting to leash, surface=Surface(name=b217ba3 InputMethod)/@0xfd8bc1b, leashParent=Surface(name=WindowToken{c321922 type=2011 android.os.Binder@edfc6ed})/@0x7a81b8
12-20 00:05:54.669  1401  1645 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=b217ba3 InputMethod)/@0xfd8bc1b - animation-leash of insets_animation)/@0x7fd6309
12-20 00:05:54.670  1401  1645 D WindowManager: Changing focus from Window{c1b1e27 u0 com.katsuyamaki.DroidOSLauncher} to Window{315cb86 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity} displayId=0 Callers=com.android.server.wm.WindowState.removeIfPossible:647 com.android.server.wm.Session.remove:16 android.view.IWindowSession$Stub.onTransact:804 com.android.server.wm.Session.onTransact:1 
12-20 00:05:54.670  1401  1645 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0xc8bab1f
12-20 00:05:54.670  1401  1645 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf, destroy=false, surface=Surface(name=253deac NavigationBar0)/@0x344c78e
12-20 00:05:54.670  1401  1645 I WindowManager: Reparenting to leash, surface=Surface(name=253deac NavigationBar0)/@0x344c78e, leashParent=Surface(name=WindowToken{742645f type=2019 android.os.BinderProxy@3f7f8b9})/@0xeea6baf
12-20 00:05:54.670  1401  1645 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=253deac NavigationBar0)/@0x344c78e - animation-leash of insets_animation)/@0xd4ac93c
12-20 00:05:54.671  1401  1645 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=7a1affc StatusBar)/@0x9878745 - animation-leash of insets_animation)/@0x5b3ec35
12-20 00:05:54.671  1401  1645 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{ea68ef type=2000 android.os.BinderProxy@acba6c9})/@0xe49ce9a, destroy=false, surface=Surface(name=7a1affc StatusBar)/@0x9878745
12-20 00:05:54.671  1401  1645 I WindowManager: Reparenting to leash, surface=Surface(name=7a1affc StatusBar)/@0x9878745, leashParent=Surface(name=WindowToken{ea68ef type=2000 android.os.BinderProxy@acba6c9})/@0xe49ce9a
12-20 00:05:54.671  1401  1645 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=7a1affc StatusBar)/@0x9878745 - animation-leash of insets_animation)/@0x29026c5
12-20 00:05:54.671  1401  1645 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{315cb86 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}, navColorWin=Window{8d8ec89 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.WindowManagerService.updateFocusedWindowLocked:372 com.android.server.wm.WindowState.removeIfPossible:647 com.android.server.wm.Session.remove:16 
12-20 00:05:54.671  1401  1645 D WindowManager: updateSystemBarAttributes, bhv=1, apr=1048576, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-20 00:05:54.676  1401  2151 D InputDispatcher: Focus left window (0): c1b1e27 com.katsuyamaki.DroidOSLauncher
12-20 00:05:54.685  1401  2251 D InputDispatcher: Once focus requested (0): 315cb86 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity
12-20 00:05:54.685  1401  2251 D InputDispatcher: Focus entered window (0): 315cb86 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity
12-20 00:05:54.689  1401  2151 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-20 00:05:54.689  1401  2151 D InputMethodManagerService: shouldShowImeSwitcherLocked : checking vis : 3
12-20 00:05:54.689  1401  2151 D InputMethodManagerService: checkDisplayOfStartInputAndUpdateKeyboard: displayId=0, mFocusedDisplayId=0
12-20 00:05:54.876  1401  2590 D WindowManager: Transition is created, t=TransitionRecord{7fd9dcc id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:54.876  1401  2590 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}
12-20 00:05:55.039  1401  1645 D WindowManager: Transition is created, t=TransitionRecord{9805ac4 id=-1 type=CHANGE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.ActivityTaskManagerService.resizeTask:129 com.android.server.am.ActivityManagerShellCommand.runTask:220 com.android.server.am.ActivityManagerShellCommand.onCommand:1690 com.android.modules.utils.BasicShellCommandHandler.exec:97 
12-20 00:05:55.039  1401  1645 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{315cb86 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}
12-20 00:05:55.430  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=185523271518000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-20 00:05:55.432  1401  1700 I InputDispatcher: Delivering touch to (3972): action: 0x4, f=0x0, d=0, 'c3b8059', t=1 
12-20 00:05:55.432  1401  1700 I InputDispatcher: Delivering touch to (2045): action: 0x4, f=0x0, d=0, '253deac', t=1 
12-20 00:05:55.432  1401  1700 I InputDispatcher: Delivering touch to (13489): action: 0x0, f=0x0, d=0, 'dea7911', t=1 +(0,-116)
12-20 00:05:55.439  1401  1544 D WindowManager: Transition is created, t=TransitionRecord{42dceeb id=-1 type=TO_FRONT flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createTransition:17 com.android.server.wm.ActivityTaskManagerService.setFocusedTask:29 com.android.server.wm.WindowManagerService.handleTaskFocusChange:62 com.android.server.wm.WindowState.handleTapOutsideFocusInsideSelf:18 
12-20 00:05:55.448  1401  1544 D InputDispatcher: Focused application(0): ActivityRecord{147709724 u0 com.termux/.app.TermuxActivity t18195}
12-20 00:05:55.449  1401  1544 D WindowManager: Changing focus from Window{315cb86 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity} to Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity} displayId=0 Callers=com.android.server.wm.ActivityTaskManagerService.setLastResumedActivityUncheckLocked:264 com.android.server.wm.ActivityTaskSupervisor.updateTopResumedActivityIfNeeded:49 com.android.server.wm.TaskDisplayArea.positionChildAt:252 com.android.server.wm.Task.moveToFront:40 
12-20 00:05:55.449  1401  1544 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{dea7911 u0 com.termux/com.termux.app.TermuxActivity}, navColorWin=Window{8d8ec89 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.WindowManagerService.updateFocusedWindowLocked:372 com.android.server.wm.ActivityTaskManagerService.setLastResumedActivityUncheckLocked:264 com.android.server.wm.ActivityTaskSupervisor.updateTopResumedActivityIfNeeded:49 
12-20 00:05:55.449  1401  1544 D WindowManager: updateSystemBarAttributes, bhv=1, apr=1048576, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-1
12-20 00:05:55.450  1401  2251 E InputDispatcher: Embedded{TaskInputSink of Surface(name=Decor container of Task=18331)/@0x5c6c553} has feature NO_INPUT_WINDOW, but a non-null token. Clearing
12-20 00:05:55.468  1401  2151 D InputDispatcher: Once focus requested (0): dea7911 com.termux/com.termux.app.TermuxActivity
12-20 00:05:55.468  1401  2151 D InputDispatcher: Focus left window (0): 315cb86 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity
12-20 00:05:55.468  1401  2151 D InputDispatcher: Focus entered window (0): dea7911 com.termux/com.termux.app.TermuxActivity
12-20 00:05:55.479  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=185523321698000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-20 00:05:55.479  1401  1700 I InputDispatcher: Delivering touch to (13489): action: 0x1, f=0x0, d=0, 'dea7911', t=1 +(0,-116)
12-20 00:05:55.484  1401  1763 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-20 00:05:55.484  1401  1763 D InputMethodManagerService: shouldShowImeSwitcherLocked : checking vis : 3
12-20 00:05:55.485  1401  1763 D InputMethodManagerService: checkDisplayOfStartInputAndUpdateKeyboard: displayId=0, mFocusedDisplayId=0
12-20 00:05:55.486  1401  1763 D InputMethodManagerService: ACCESS_CONTROL_ENABLED = false, ACCESS_CONTROL_KEYBOARD_BLOCK = true
12-20 00:05:55.491  1401  1763 I ActivityManager: Changes in 10332 7 to 5, 128 to 255
12-20 00:05:55.493  1401  2591 I InputMethodManagerService: isAccessoryKeyboard 0
12-20 00:05:55.494  1401  2251 I InputMethodManagerService: isAccessoryKeyboard 0
12-20 00:05:55.496  1401  1763 I InputMethodManagerService: attachNewInputLocked: showCurrentInputInternal, softInputModeState=STATE_UNSPECIFIED|ADJUST_RESIZE|IS_FORWARD_NAVIGATION
12-20 00:05:55.506  1401  3509 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-20 00:05:55.507  1401  2151 I WindowManager: Relayout Window{5b7421b u0 com.android.systemui.wallpapers.ImageWallpaper}: viewVisibility=0 req=2486x2520 ty=2013 d0
12-20 00:05:55.508  1401  3509 D InputMethodManagerService: shouldShowImeSwitcherLocked : checking vis : 3
12-20 00:05:55.508  1401  3509 I InputMethodManagerService: setImeWindowStatus: vis=3, backDisposition=0
12-20 00:05:55.508  1401  2151 I WindowManager: Relayout hash=5b7421b, pid=2045, syncId=-1: mAttrs={(0,0)(2486x2520) gr=TOP START CENTER layoutInDisplayCutoutMode=always ty=WALLPAPER fmt=RGBX_8888 wanim=0x1030328
12-20 00:05:55.508  1401  2151 I WindowManager:   fl=14318
12-20 00:05:55.508  1401  2151 I WindowManager:   pfl=14
12-20 00:05:55.508  1401  2151 I WindowManager:   bhv=1
12-20 00:05:55.508  1401  2151 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:55.508  1401  2151 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-20 00:05:55.508  1401  2151 I WindowManager:   sfl=8}
12-20 00:05:55.517  1401  1544 D InputMethodManagerService: ACCESS_CONTROL_ENABLED = false, ACCESS_CONTROL_KEYBOARD_BLOCK = true
12-20 00:05:55.518  1401  3703 I WindowManager: Relayout Window{b217ba3 u0 InputMethod}: viewVisibility=0 req=1080x2404 ty=2011 d0
12-20 00:05:55.518  1401  3703 D WindowManager: makeSurface duration=0 name=InputMethod$_15168
12-20 00:05:55.534  1401  3703 I WindowManager: Relayout hash=b217ba3, pid=15168, syncId=-1: mAttrs={(0,0)(fillxfill) gr=BOTTOM CENTER_VERTICAL sim={adjust=pan} ty=INPUT_METHOD fmt=TRANSPARENT wanim=0x1030056 preferredMinDisplayRefreshRate=60.0 receive insets ignoring z-order
12-20 00:05:55.534  1401  3703 I WindowManager:   fl=81800108
12-20 00:05:55.534  1401  3703 I WindowManager:   pfl=14000000
12-20 00:05:55.534  1401  3703 I WindowManager:   bhv=1
12-20 00:05:55.534  1401  3703 I WindowManager:   fitTypes=3
12-20 00:05:55.534  1401  3703 I WindowManager:   fitSides=7
12-20 00:05:55.534  1401  3703 I WindowManager:   fitIgnoreVis
12-20 00:05:55.534  1401  3703 I WindowManager:   dvrrWindowFrameRateHint=true
12-20 00:05:55.534  1401  3703 I WindowManager:  dimAmount=0.18 dimDuration=150 naviIconColor=0}
12-20 00:05:55.547  1401  2247 I InputMethodManagerService: isAccessoryKeyboard 0
12-20 00:05:55.547  1401  2590 I InputMethodManagerService: isAccessoryKeyboard 0
12-20 00:05:55.560  1401  3703 D WindowManager: setInsetsWindow Window{b217ba3 u0 InputMethod}, contentInsets=Rect(0, 2329 - 0, 0) -> Rect(0, 1904 - 0, 0), visibleInsets=Rect(0, 2329 - 0, 0) -> Rect(0, 1904 - 0, 0), touchableRegion=SkRegion() -> SkRegion((0,1904,1080,2404)), touchableInsets 3 -> 3
12-20 00:05:55.569  1401  2251 I WindowManager: Relayout Window{5b7421b u0 com.android.systemui.wallpapers.ImageWallpaper}: viewVisibility=0 req=2486x2520 ty=2013 d0
12-20 00:05:55.571  1401  3703 D WindowManager: finishDrawingWindow: Window{b217ba3 u0 InputMethod} mDrawState=DRAW_PENDING seqId=0
12-20 00:05:55.571  1401  2251 I WindowManager: Relayout hash=5b7421b, pid=2045, syncId=-1: mAttrs={(0,0)(2486x2520) gr=TOP START CENTER layoutInDisplayCutoutMode=always ty=WALLPAPER fmt=RGBX_8888 wanim=0x1030328
12-20 00:05:55.571  1401  2251 I WindowManager:   fl=14318
12-20 00:05:55.571  1401  2251 I WindowManager:   pfl=14
12-20 00:05:55.571  1401  2251 I WindowManager:   bhv=1
12-20 00:05:55.571  1401  2251 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:55.571  1401  2251 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-20 00:05:55.571  1401  2251 I WindowManager:   sfl=8}
12-20 00:05:55.592  1401  2590 D WindowManager: finishDrawingWindow: Window{b217ba3 u0 InputMethod} mDrawState=HAS_DRAWN seqId=0
12-20 00:05:55.598  1401  2591 I WindowManager: Relayout Window{5b7421b u0 com.android.systemui.wallpapers.ImageWallpaper}: viewVisibility=0 req=2486x2520 ty=2013 d0
12-20 00:05:55.602  1401  2591 I WindowManager: Relayout hash=5b7421b, pid=2045, syncId=-1: mAttrs={(0,0)(2486x2520) gr=TOP START CENTER layoutInDisplayCutoutMode=always ty=WALLPAPER fmt=RGBX_8888 wanim=0x1030328
12-20 00:05:55.602  1401  2591 I WindowManager:   fl=14318
12-20 00:05:55.602  1401  2591 I WindowManager:   pfl=14
12-20 00:05:55.602  1401  2591 I WindowManager:   bhv=1
12-20 00:05:55.602  1401  2591 I WindowManager:   frameRateBoostOnTouch=true
12-20 00:05:55.602  1401  2591 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-20 00:05:55.602  1401  2591 I WindowManager:   sfl=8}
12-20 00:05:56.672  1401  2724 I ActivityManager: Process com.samsung.euicc (pid 3576) has died: fg  SVC (703,2155)
12-20 00:05:56.935  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=185524771216000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-20 00:05:56.936  1401  1700 I InputDispatcher: Delivering touch to (3972): action: 0x4, f=0x0, d=0, 'c3b8059', t=1 
12-20 00:05:56.936  1401  1700 I InputDispatcher: Delivering touch to (2045): action: 0x4, f=0x0, d=0, '253deac', t=1 
12-20 00:05:56.937  1401  1700 I InputDispatcher: Delivering touch to (13489): action: 0x0, f=0x0, d=0, 'dea7911', t=1 +(0,-116)
12-20 00:05:56.946  1401  1469 E InputDispatcher: Embedded{TaskInputSink of Surface(name=Decor container of Task=18195)/@0x417d4e1} has feature NO_INPUT_WINDOW, but a non-null token. Clearing
12-20 00:05:57.018  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x1, time=185524861637000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-20 00:05:57.019  1401  1700 I InputDispatcher: Delivering touch to (13489): action: 0x1, f=0x0, d=0, 'dea7911', t=1 +(0,-116)
12-20 00:05:57.902  1401  1401 D InputDispatcher: Inject motion (0/0): action=0x0, time=185525744257000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-20 00:05:57.903  1401  1700 I InputDispatcher: Delivering touch to (3972): action: 0x4, f=0x0, d=0, 'c3b8059', t=1 
12-20 00:05:57.903  1401  1700 I InputDispatcher: Delivering touch to (2045): action: 0x4, f=0x0, d=0, '253deac', t=1 
12-20 00:05:57.903  1401  1700 I InputDispatcher: Delivering touch to (15168): action: 0x0, f=0x0, d=0, 'b217ba3', t=1 +(0,-116)
