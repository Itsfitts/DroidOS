--------- beginning of system
12-22 20:14:58.970  1423  1554 I ActivityManager: Changes in 10053 6 to 15, 128 to 0
12-22 20:14:58.980  1423  1549 D WindowManager: onStateChanged, state=2
12-22 20:14:59.279  1423  1423 I WindowManager: getCoverScreenRotation 0, sensor= 0, isFlat=false, isDual=false
--------- beginning of main
12-22 20:14:59.370  1423  1423 D InputDispatcher: Inject motion (0/0): action=0x0, time=31058972596000, f=0x0, d=1 dsdx=1.000000 dtdx=0.000000
12-22 20:14:59.374  1423  1695 I InputDispatcher: No new touched window at (87.7, 495.1) in display 1
12-22 20:14:59.374  1423  1695 I InputDispatcher: Dropping event because there is no touchable window at (87.7178, 495.088) on display 1: MotionEvent
12-22 20:14:59.377  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-22 20:14:59.384  1423  1473 E InputDispatcher: Embedded{TaskInputSink of Surface(name=Decor container of Task=19124)/@0xb4feb99} has feature NO_INPUT_WINDOW, but a non-null token. Clearing
12-22 20:14:59.387  1423  1423 D InputDispatcher: Inject motion (0/0): action=0x1, time=31058983385000, f=0x0, d=1 dsdx=1.000000 dtdx=0.000000
12-22 20:14:59.397  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-22 20:14:59.614  1423  1549 D WindowManager: onStateChanged, state=0
12-22 20:14:59.623  1423  1549 D WindowManager: Changing focus from Window{67a5228 u0 com.termux/com.termux.app.TermuxActivity} to null displayId=0 Callers=com.android.server.wm.RootWindowContainer.onChildPositionChanged:8 com.android.server.wm.WindowContainer.positionChildAt:69 com.android.server.wm.RootWindowContainer.positionChildAt:8 com.android.server.wm.WindowManagerServiceExt.moveDisplayToTop:37 
12-22 20:14:59.624  1423  1549 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{64185e1 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, navColorWin=Window{82d55a2 u0 InputMethod}, caller=com.android.server.wm.WindowManagerService.updateFocusedWindowLocked:372 com.android.server.wm.RootWindowContainer.onChildPositionChanged:8 com.android.server.wm.WindowContainer.positionChildAt:69 
12-22 20:14:59.624  1423  1549 D WindowManager: updateSystemBarAttributes, bhv=2, apr=0, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-22 20:14:59.625  1423  1549 D InputDispatcher: Focused display: 0 -> 1
12-22 20:14:59.625  1423  1549 W InputDispatcher: Focused display #1 does not have a focused window.
12-22 20:14:59.625  1423  1549 E InputDispatcher: But another display has a focused window
12-22 20:14:59.625  1423  1549 E InputDispatcher:   FocusedWindows:
12-22 20:14:59.625  1423  1549 E InputDispatcher:     displayId=0, name='67a5228 com.termux/com.termux.app.TermuxActivity'
12-22 20:14:59.637  1423  4811 I ActivityManager: Changes in 10210 19 to 5, 0 to 144
12-22 20:14:59.645  1423  2267 D InputDispatcher: Once focus requested (0): <null>
12-22 20:14:59.645  1423  2267 D InputDispatcher: Focus request (0): <null> but waiting because NO_WINDOW
12-22 20:14:59.645  1423  2267 D InputDispatcher: Focus left window (0): 67a5228 com.termux/com.termux.app.TermuxActivity
12-22 20:14:59.661  1423  1754 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-22 20:14:59.661  1423  1754 W InputMethodManagerService: callbackImeWindowStatus: skipped topFocusedDisplayId=1, curTokenDisplayId=0
12-22 20:14:59.680  1423  1604 D WindowManager: Create SleepToken: tag=Display-off, displayId=0
12-22 20:14:59.689  1423  1473 W WindowManager: Cannot find window which accessibility connection is added to
12-22 20:14:59.693  1423  2267 W WindowManager: Failed looking up window session=Session{eef2b83 2022:u0a10055} callers=com.android.server.wm.Session.remove:10 android.view.IWindowSession$Stub.onTransact:804 com.android.server.wm.Session.onTransact:1 
12-22 20:14:59.697  2022  2022 I WindowManager: WindowManagerGlobal#addView, ty=2024, view=com.android.systemui.navigationbar.gestural.SamsungBackPanel{e24fbc1 G.ED..... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.android.systemui.navigationbar.gestural.BackPanelController.setLayoutParams:7 com.android.systemui.navigationbar.gestural.EdgeBackGestureHandler.setEdgeBackPlugin:20 
12-22 20:14:59.697  1423  1635 I WindowManager: Relayout Window{67a5228 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=8 req=1080x1260 ty=1 d0
12-22 20:14:59.697  2022  2022 D ViewRootImpl: desktopMode is false
12-22 20:14:59.697  2022  2022 I ViewRootImpl: dVRR is disabled
12-22 20:14:59.698  1423  2230 W WindowManager: Cannot find window which accessibility connection is added to
12-22 20:14:59.699  1423  1635 I WindowManager: Relayout hash=67a5228, pid=22381, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} ty=BASE_APPLICATION wanim=0x1030317
12-22 20:14:59.699  1423  1635 I WindowManager:   fl=8d810100
12-22 20:14:59.699  1423  1635 I WindowManager:   pfl=10008040
12-22 20:14:59.699  1423  1635 I WindowManager:   vsysui=700
12-22 20:14:59.699  1423  1635 I WindowManager:   bhv=1
12-22 20:14:59.699  1423  1635 I WindowManager:   fitSides=0
12-22 20:14:59.699  1423  1635 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:14:59.699  1423  1635 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:14:59.699  1423  4811 I WindowManager: Relayout Window{64185e1 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}: viewVisibility=8 req=1080x2520 ty=1 d0
12-22 20:14:59.699  1423  4811 I WindowManager: Relayout hash=64185e1, pid=2712, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=nothing} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION fmt=TRANSPARENT wanim=0x1030306
12-22 20:14:59.699  1423  4811 I WindowManager:   fl=81910100
12-22 20:14:59.699  1423  4811 I WindowManager:   pfl=10008840
12-22 20:14:59.699  1423  4811 I WindowManager:   bhv=2
12-22 20:14:59.699  1423  4811 I WindowManager:   fitSides=0
12-22 20:14:59.699  1423  4811 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:14:59.699  1423  4811 I WindowManager:   dvrrWindowFrameRateHint=true screenDimDuration=200000 naviIconColor=0}
12-22 20:14:59.703  1423  1423 I ActivityManager: Changes in 10516 5 to 6, 255 to 239
12-22 20:14:59.704  1423  1423 I ActivityManager: Changes in 10375 2 to 12, 255 to 0
12-22 20:14:59.704  1423  1423 I ActivityManager: Changes in 10342 2 to 4, 255 to 254
12-22 20:14:59.704  1423  1423 I ActivityManager: Changes in 10155 2 to 5, 255 to 184
12-22 20:14:59.704  1423  1423 I ActivityManager: Changes in 10122 3 to 12, 184 to 128
12-22 20:14:59.705  1423  1473 W WindowManager: Failed looking up window session=Session{eef2b83 2022:u0a10055} callers=com.android.server.wm.Session.remove:10 android.view.IWindowSession$Stub.onTransact:804 com.android.server.wm.Session.onTransact:1 
12-22 20:14:59.706  1423  2934 I WindowManager: Relayout Window{db572d5 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}: viewVisibility=8 req=1080x1260 ty=1 d0
12-22 20:14:59.707  1423  2934 I WindowManager: Relayout hash=db572d5, pid=14008, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION wanim=0x1030317
12-22 20:14:59.707  1423  2934 I WindowManager:   fl=80810100
12-22 20:14:59.707  1423  2934 I WindowManager:   pfl=10008840
12-22 20:14:59.707  1423  2934 I WindowManager:   bhv=1
12-22 20:14:59.707  1423  2934 I WindowManager:   fitSides=0
12-22 20:14:59.707  1423  2934 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:14:59.707  1423  2934 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:14:59.715  2022  2022 I WindowManager: WindowManagerGlobal#addView, ty=2019, view=com.android.systemui.navigationbar.views.NavigationBarFrame{d6824b5 V.E...... ......I. 0,0-0,0 #7f0a083a app:id/navigation_bar_frame}, caller=android.view.WindowManagerImpl.addView:158 com.android.systemui.navigationbar.views.NavigationBar.onInit:237 com.android.systemui.util.ViewController.init:6 
12-22 20:14:59.716  2022  2022 D ViewRootImpl: desktopMode is false
12-22 20:14:59.716  2022  2022 I ViewRootImpl: dVRR is disabled
12-22 20:14:59.723  1423  1473 I ActivityManager: Changes in 10122 12 to 10, 128 to 0
12-22 20:14:59.731  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-22 20:14:59.736  1423  2270 I ActivityManager: Changes in 10122 10 to 15, 0 to 128
12-22 20:14:59.743  1423  2697 E WindowManager: win=Window{64185e1 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=8 caller=com.android.server.wm.ActivityRecord.destroySurfaces:25 com.android.server.wm.ActivityRecord.activityStopped:192 com.android.server.wm.ActivityClientController.activityStopped:97 android.app.IActivityClientController$Stub.onTransact:726 com.android.server.wm.ActivityClientController.onTransact:1 android.os.Binder.execTransactInternal:1462 android.os.Binder.execTransact:1401 
12-22 20:14:59.750  1423  2933 E WindowManager: win=Window{67a5228 u0 com.termux/com.termux.app.TermuxActivity} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=8 caller=com.android.server.wm.ActivityRecord.destroySurfaces:25 com.android.server.wm.ActivityRecord.activityStopped:192 com.android.server.wm.ActivityClientController.activityStopped:97 android.app.IActivityClientController$Stub.onTransact:726 com.android.server.wm.ActivityClientController.onTransact:1 android.os.Binder.execTransactInternal:1462 android.os.Binder.execTransact:1401 
12-22 20:14:59.781  1423  2886 E WindowManager: win=Window{db572d5 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=8 caller=com.android.server.wm.ActivityRecord.destroySurfaces:25 com.android.server.wm.ActivityRecord.activityStopped:192 com.android.server.wm.ActivityClientController.activityStopped:97 android.app.IActivityClientController$Stub.onTransact:726 com.android.server.wm.ActivityClientController.onTransact:1 android.os.Binder.execTransactInternal:1462 android.os.Binder.execTransact:1401 
12-22 20:14:59.787  1423  2886 I ActivityManager: Changes in 10122 15 to 19, 128 to 0
12-22 20:14:59.860  1423  1855 I WindowManager: Relayout Window{4fc6b6b u0 EdgeBackGestureHandler1}: viewVisibility=8 req=164x419 ty=2024 d1
12-22 20:14:59.861  1423  1855 I WindowManager: Relayout hash=4fc6b6b, pid=2022, syncId=-1: mAttrs={(0,0)(164x419) sim={adjust=pan} ty=NAVIGATION_BAR_PANEL fmt=TRANSLUCENT
12-22 20:14:59.861  1423  1855 I WindowManager:   fl=1000118
12-22 20:14:59.861  1423  1855 I WindowManager:   pfl=30200010
12-22 20:14:59.861  1423  1855 I WindowManager:   bhv=1
12-22 20:14:59.861  1423  1855 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:14:59.861  1423  1855 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:14:59.878  2022  2022 I WindowManager: WindowManagerGlobal#addView, ty=2024, view=com.android.systemui.navigationbar.gestural.QuickswitchOrientedNavHandle{11c299a V.E...... ......I. 0,0-0,0 #7f0a0b72 app:id/secondary_home_handle}, caller=android.view.WindowManagerImpl.addView:158 com.android.systemui.navigationbar.views.NavigationBar.initSecondaryHomeHandleForRotation:87 com.android.systemui.navigationbar.views.NavigationBar.onViewAttached:417 
12-22 20:14:59.878  2022  2022 D ViewRootImpl: desktopMode is false
12-22 20:14:59.878  2022  2022 I ViewRootImpl: dVRR is disabled
12-22 20:14:59.885  1423  2270 I WindowManager: Relayout Window{a93450e u0 NavigationBar1}: viewVisibility=0 req=1422x75 ty=2019 d1
12-22 20:14:59.885  1423  2270 D WindowManager: makeSurface duration=1 name=NavigationBar1$_2022
12-22 20:14:59.890  1423  2270 I WindowManager: Relayout hash=a93450e, pid=2022, syncId=-1: mAttrs={(0,0)(fillx75) gr=BOTTOM CENTER_VERTICAL sim={adjust=pan} layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:14:59.890  1423  2270 I WindowManager:   fl=20040028
12-22 20:14:59.890  1423  2270 I WindowManager:   pfl=31000000
12-22 20:14:59.890  1423  2270 I WindowManager:   bhv=1
12-22 20:14:59.890  1423  2270 I WindowManager:   providedInsets:
12-22 20:14:59.890  1423  2270 I WindowManager:     InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=23}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:14:59.890  1423  2270 I WindowManager:     InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:14:59.890  1423  2270 I WindowManager:     InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:14:59.890  1423  2270 I WindowManager:     InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:14:59.890  1423  2270 I WindowManager:     InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:14:59.890  1423  2270 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:14:59.890  1423  2270 I WindowManager:   dvrrWindowFrameRateHint=true
12-22 20:14:59.890  1423  2270 I WindowManager:   paramsForRotation:
12-22 20:14:59.890  1423  2270 I WindowManager:     ROTATION_0={(0,0)(fillx75) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:14:59.890  1423  2270 I WindowManager:       fl=20040028
12-22 20:14:59.890  1423  2270 I WindowManager:       pfl=31000000
12-22 20:14:59.890  1423  2270 I WindowManager:       bhv=1
12-22 20:14:59.890  1423  2270 I WindowManager:       providedInsets:
12-22 20:14:59.890  1423  2270 I WindowManager:         InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=23}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:14:59.890  1423  2270 I WindowManager:         InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:14:59.890  1423  2270 I WindowManager:         InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:14:59.890  1423  2270 I WindowManager:         InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:14:59.890  1423  2270 I WindowManager:         InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:14:59.890  1423  2270 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:14:59.890  1423  2270 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:14:59.890  1423  2270 I WindowManager:     ROTATION_90={(0,0)(fillx75) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:14:59.890  1423  2270 I WindowManager:       fl=20040028
12-22 20:14:59.890  1423  2270 I WindowManager:       pfl=31000000
12-22 20:14:59.890  1423  2270 I WindowManager:       bhv=1
12-22 20:14:59.890  1423  2270 I WindowManager:       providedInsets:
12-22 20:14:59.890  1423  2270 I WindowManager:         InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=23}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=Insets{left=0, top=0, right=0, bottom=23}}]}
12-22 20:14:59.890  1423  2270 I WindowManager:         InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:14:59.890  1423  2270 I WindowManager:         InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:14:59.890  1423  2270 I WindowManager:         InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:14:59.890  1423  2270 I WindowManager:         InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:14:59.890  1423  2270 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:14:59.890  1423  2270 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:14:59.890  1423  2270 I WindowManager:     ROTATION_180={(0,0)(fillx75) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:14:59.890  1423  2270 I WindowManager:       fl=20040028
12-22 20:14:59.890  1423  2270 I WindowManager:       pfl=31000000
12-22 20:14:59.890  1423  2270 I WindowManager:       bhv=1
12-22 20:14:59.890  1423  2270 I WindowManager:       providedInsets:
12-22 20:14:59.890  1423  2270 I WindowManager:         InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=23}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:14:59.890  1423  2270 I WindowManager:         InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:14:59.890  1423  2270 I WindowManager:         InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:14:59.890  1423  2270 I WindowManager:         InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:14:59.890  1423  2270 I WindowManager:         InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:14:59.890  1423  2270 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:14:59.890  1423  2270 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:14:59.890  1423  2270 I WindowManager:     ROTATION_270={(0,0)(fillx75) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:14:59.890  1423  2270 I WindowManager:       fl=20040028
12-22 20:14:59.890  1423  2270 I WindowManager:       pfl=31000000
12-22 20:14:59.890  1423  2270 I WindowManager:       bhv=1
12-22 20:14:59.890  1423  2270 I WindowManager:       providedInsets:
12-22 20:14:59.890  1423  2270 I WindowManager:         InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=23}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=Insets{left=0, top=0, right=0, bottom=23}}]}
12-22 20:14:59.890  1423  2270 I WindowManager:         InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:14:59.890  1423  2270 I WindowManager:         InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:14:59.890  1423  2270 I WindowManager:         InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:14:59.890  1423  2270 I WindowManager:         InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:14:59.890  1423  2270 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:14:59.890  1423  2270 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0} naviIconColor=0}
12-22 20:14:59.896  1423  2229 D WindowManager: finishDrawingWindow: Window{a93450e u0 NavigationBar1} mDrawState=DRAW_PENDING seqId=0
12-22 20:14:59.953  1423  2933 I WindowManager: Relayout Window{a93450e u0 NavigationBar1}: viewVisibility=0 req=1422x66 ty=2019 d1
12-22 20:14:59.954  1423  2933 I WindowManager: Relayout hash=a93450e, pid=2022, syncId=-1: mAttrs={(0,0)(fillx66) gr=BOTTOM CENTER_VERTICAL sim={adjust=pan} layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:14:59.954  1423  2933 I WindowManager:   fl=20040028
12-22 20:14:59.954  1423  2933 I WindowManager:   pfl=31000000
12-22 20:14:59.954  1423  2933 I WindowManager:   bhv=1
12-22 20:14:59.954  1423  2933 I WindowManager:   providedInsets:
12-22 20:14:59.954  1423  2933 I WindowManager:     InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=66}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:14:59.954  1423  2933 I WindowManager:     InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:14:59.954  1423  2933 I WindowManager:     InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:14:59.954  1423  2933 I WindowManager:     InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:14:59.954  1423  2933 I WindowManager:     InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:14:59.954  1423  2933 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:14:59.954  1423  2933 I WindowManager:   dvrrWindowFrameRateHint=true
12-22 20:14:59.954  1423  2933 I WindowManager:   paramsForRotation:
12-22 20:14:59.954  1423  2933 I WindowManager:     ROTATION_0={(0,0)(fillx66) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:14:59.954  1423  2933 I WindowManager:       fl=20040028
12-22 20:14:59.954  1423  2933 I WindowManager:       pfl=31000000
12-22 20:14:59.954  1423  2933 I WindowManager:       bhv=1
12-22 20:14:59.954  1423  2933 I WindowManager:       providedInsets:
12-22 20:14:59.954  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=66}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:14:59.954  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:14:59.954  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:14:59.954  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:14:59.954  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:14:59.954  1423  2933 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:14:59.954  1423  2933 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:14:59.954  1423  2933 I WindowManager:     ROTATION_90={(0,0)(fillx66) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:14:59.954  1423  2933 I WindowManager:       fl=20040028
12-22 20:14:59.954  1423  2933 I WindowManager:       pfl=31000000
12-22 20:14:59.954  1423  2933 I WindowManager:       bhv=1
12-22 20:14:59.954  1423  2933 I WindowManager:       providedInsets:
12-22 20:14:59.954  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=38}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=Insets{left=0, top=0, right=0, bottom=38}}]}
12-22 20:14:59.954  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:14:59.954  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:14:59.954  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:14:59.954  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:14:59.954  1423  2933 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:14:59.954  1423  2933 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:14:59.954  1423  2933 I WindowManager:     ROTATION_180={(0,0)(fillx66) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:14:59.954  1423  2933 I WindowManager:       fl=20040028
12-22 20:14:59.954  1423  2933 I WindowManager:       pfl=31000000
12-22 20:14:59.954  1423  2933 I WindowManager:       bhv=1
12-22 20:14:59.954  1423  2933 I WindowManager:       providedInsets:
12-22 20:14:59.954  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=38}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:14:59.954  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:14:59.954  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:14:59.954  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:14:59.954  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:14:59.954  1423  2933 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:14:59.954  1423  2933 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:14:59.954  1423  2933 I WindowManager:     ROTATION_270={(0,0)(fillx66) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:14:59.954  1423  2933 I WindowManager:       fl=20040028
12-22 20:14:59.954  1423  2933 I WindowManager:       pfl=31000000
12-22 20:14:59.954  1423  2933 I WindowManager:       bhv=1
12-22 20:14:59.954  1423  2933 I WindowManager:       providedInsets:
12-22 20:14:59.954  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=38}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=Insets{left=0, top=0, right=0, bottom=38}}]}
12-22 20:14:59.954  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:14:59.954  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:14:59.954  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:14:59.954  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:14:59.954  1423  2933 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:14:59.954  1423  2933 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0} naviIconColor=0}
12-22 20:14:59.958  1423  2886 I WindowManager: Relayout Window{58eab59 u0 SecondaryHomeHandle1}: viewVisibility=8 req=0x0 ty=2024 d1
12-22 20:14:59.958  1423  2886 I WindowManager: Relayout hash=58eab59, pid=2022, syncId=-1: mAttrs={(0,0)(0x0) sim={adjust=pan} ty=NAVIGATION_BAR_PANEL fmt=TRANSLUCENT
12-22 20:14:59.958  1423  2886 I WindowManager:   fl=21000138
12-22 20:14:59.958  1423  2886 I WindowManager:   pfl=1040
12-22 20:14:59.958  1423  2886 I WindowManager:   bhv=1
12-22 20:14:59.958  1423  2886 I WindowManager:   fitTypes=206
12-22 20:14:59.958  1423  2886 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:14:59.958  1423  2886 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:14:59.958  1423  2933 D WindowManager: finishDrawingWindow: Window{a93450e u0 NavigationBar1} mDrawState=READY_TO_SHOW seqId=0
12-22 20:14:59.968  1423  1754 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-22 20:14:59.969  1423  1754 D InputMethodManagerService: shouldShowImeSwitcherLocked : checking vis : 3
12-22 20:14:59.971  1423  1604 D WindowManager: Remove SleepToken: tag=Display-off, displayId=1
12-22 20:14:59.971  1423  1604 D WindowManager: Transition is created, t=TransitionRecord{e86f73d id=-1 type=WAKE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createTransition:17 com.android.server.wm.RootWindowContainer.applySleepTokens:209 com.android.server.wm.ActivityTaskManagerService.updateSleepIfNeededLocked:90 com.android.server.wm.RootWindowContainer.removeSleepToken:131 
12-22 20:14:59.972  1423  1604 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity}
12-22 20:14:59.973  1423  1604 I WindowManager: getCoverScreenRotation 0, sensor= 0, isFlat=false, isDual=false
12-22 20:14:59.974  1423  1604 I WindowManager: Waiting for transition
12-22 20:14:59.976  1423  1550 I WindowManager: Waiting for transition
12-22 20:14:59.980  1423  1423 I ActivityManager: Changes in 10516 6 to 5, 239 to 255
12-22 20:14:59.980  1423  1423 I ActivityManager: updateOomAdj start time is before than pendingPid added, don't delete it
12-22 20:14:59.981  1423  1423 D InputDispatcher: Inject key (0/0): action=0, f=0x8, d=-1, time=31059566473000
12-22 20:14:59.984  1423  2189 D WindowManager: Create SleepToken: tag=keyguard, displayId=0
12-22 20:14:59.988  1423  1754 W InputMethodManagerService: callbackImeWindowStatus: skipped topFocusedDisplayId=1, curTokenDisplayId=0
12-22 20:14:59.988  1423  1754 W InputMethodManagerService: callbackImeWindowStatus: skipped topFocusedDisplayId=1, curTokenDisplayId=0
12-22 20:14:59.989  1423  1549 I ActivityManager: Changes in 10375 12 to 2, 0 to 255
12-22 20:14:59.996  1423  1555 I ActivityManager: Changes in 10384 19 to 11, 0 to 128
12-22 20:15:00.003  1423  1555 I ActivityManager: Changes in 10176 19 to 11, 0 to 128
12-22 20:15:00.003  1423  4811 I ActivityManager: Changes in 10384 11 to 19, 128 to 0
12-22 20:15:00.008  1423  4811 I ActivityManager: Changes in 10176 11 to 19, 128 to 0
12-22 20:15:00.021  1423  1555 I ActivityManager: Changes in 10329 8 to 8, 0 to 128
12-22 20:15:00.028  1423  2266 I WindowManager: Relayout Window{9f6c9d1 u0 ThumbsUpHandler_L}: viewVisibility=8 req=41x2520 ty=2601 d0
12-22 20:15:00.028  1423  2266 E WindowManager: win=Window{9f6c9d1 u0 ThumbsUpHandler_L} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=8 caller=com.android.server.wm.WindowManagerService.tryStartExitingAnimation:134 com.android.server.wm.WindowManagerService.relayoutWindow:1147 com.android.server.wm.Session.relayout:27 android.view.IWindowSession$Stub.onTransact:829 com.android.server.wm.Session.onTransact:1 android.os.Binder.execTransactInternal:1457 android.os.Binder.execTransact:1401 
12-22 20:15:00.029  1423  2266 I WindowManager: Waiting for transition
12-22 20:15:00.030  1423  2266 I WindowManager: Relayout hash=9f6c9d1, pid=6554, syncId=-1: mAttrs={(0,0)(41x2520) gr=TOP LEFT CENTER sim={state=hidden adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=2601 fmt=TRANSLUCENT alpha=0.0
12-22 20:15:00.030  1423  2266 I WindowManager:   fl=5800528
12-22 20:15:00.030  1423  2266 I WindowManager:   pfl=10000050
12-22 20:15:00.030  1423  2266 I WindowManager:   vsysui=500
12-22 20:15:00.030  1423  2266 I WindowManager:   bhv=2
12-22 20:15:00.030  1423  2266 I WindowManager:   fitTypes=207
12-22 20:15:00.030  1423  2266 I WindowManager:   fitSides=0
12-22 20:15:00.030  1423  2266 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.030  1423  2266 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-22 20:15:00.030  1423  2266 I WindowManager:   sfl=20000}
12-22 20:15:00.032  1423  1550 I WindowManager: Waiting for transition
12-22 20:15:00.033  1423  2230 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=6146b28 NavigationBar0)/@0x1b76ee0 - animation-leash of insets_animation)/@0x20df05f
12-22 20:15:00.033  1423  2230 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{abeb61a type=2019 android.os.BinderProxy@2cf173c})/@0x22a599, destroy=false, surface=Surface(name=6146b28 NavigationBar0)/@0x1b76ee0
12-22 20:15:00.033  1423  2230 I WindowManager: Reparenting to leash, surface=Surface(name=6146b28 NavigationBar0)/@0x1b76ee0, leashParent=Surface(name=WindowToken{abeb61a type=2019 android.os.BinderProxy@2cf173c})/@0x22a599
12-22 20:15:00.033  1423  2230 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=6146b28 NavigationBar0)/@0x1b76ee0 - animation-leash of insets_animation)/@0x3a79843
12-22 20:15:00.034  1423  2784 I WindowManager: Relayout Window{7aff3c3 u0 ThumbsUpHandler_R}: viewVisibility=8 req=41x2520 ty=2601 d0
12-22 20:15:00.034  1423  2784 E WindowManager: win=Window{7aff3c3 u0 ThumbsUpHandler_R} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=8 caller=com.android.server.wm.WindowManagerService.tryStartExitingAnimation:134 com.android.server.wm.WindowManagerService.relayoutWindow:1147 com.android.server.wm.Session.relayout:27 android.view.IWindowSession$Stub.onTransact:829 com.android.server.wm.Session.onTransact:1 android.os.Binder.execTransactInternal:1457 android.os.Binder.execTransact:1401 
12-22 20:15:00.035  1423  2784 I WindowManager: Waiting for transition
12-22 20:15:00.036  1423  2784 I WindowManager: Relayout hash=7aff3c3, pid=6554, syncId=-1: mAttrs={(0,0)(41x2520) gr=TOP RIGHT CENTER sim={state=hidden adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=2601 fmt=TRANSLUCENT alpha=0.0
12-22 20:15:00.036  1423  2784 I WindowManager:   fl=5800528
12-22 20:15:00.036  1423  2784 I WindowManager:   pfl=10000050
12-22 20:15:00.036  1423  2784 I WindowManager:   vsysui=500
12-22 20:15:00.036  1423  2784 I WindowManager:   bhv=2
12-22 20:15:00.036  1423  2784 I WindowManager:   fitTypes=207
12-22 20:15:00.036  1423  2784 I WindowManager:   fitSides=0
12-22 20:15:00.036  1423  2784 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.036  1423  2784 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-22 20:15:00.036  1423  2784 I WindowManager:   sfl=20000}
12-22 20:15:00.037  1423  2109 I ActivityManager: Changes in 10329 8 to 8, 128 to 0
12-22 20:15:00.038  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(948 x 1048) immediately
12-22 20:15:00.039  1423  1547 I WindowManager: Waiting for transition
12-22 20:15:00.040  1423  1550 I WindowManager: Waiting for transition
12-22 20:15:00.042  1423  1555 I ActivityManager: Changes in 5006 8 to 8, 0 to 128
12-22 20:15:00.044  1423  2109 I ActivityManager: Changes in 5006 8 to 8, 128 to 0
12-22 20:15:00.051  1423  1555 I ActivityManager: Changes in 10373 16 to 11, 0 to 128
12-22 20:15:00.060  1423  2264 I ActivityManager: Changes in 10373 11 to 16, 128 to 0
12-22 20:15:00.066  1423  4808 I InputMethodManagerService: isInputMethodShown: isShown=true
12-22 20:15:00.066  1423  4808 I InputMethodManagerService: fhsi
12-22 20:15:00.070  1423  4806 I WindowManager: Waiting for transition
12-22 20:15:00.072  1423  1555 I ActivityManager: Changes in 10113 10 to 10, 0 to 128
12-22 20:15:00.074  1423  1550 I WindowManager: Waiting for transition
12-22 20:15:00.079  1423  1549 I ActivityManager: Changes in 10332 5 to 7, 255 to 128
12-22 20:15:00.080  1423  2228 W InputMethodManagerService: callbackImeWindowStatus: skipped topFocusedDisplayId=1, curTokenDisplayId=0
12-22 20:15:00.080  1423  2228 I InputMethodManagerService: setImeWindowStatus: vis=0, backDisposition=0
12-22 20:15:00.087  1423  1555 I ActivityManager: Changes in 10386 19 to 11, 0 to 128
12-22 20:15:00.087  1423  1555 I ActivityManager: Changes in 10362 16 to 11, 0 to 128
12-22 20:15:00.093  1423  4807 I WindowManager: Relayout Window{82d55a2 u0 InputMethod}: viewVisibility=0 req=1080x2404 ty=2011 d0
12-22 20:15:00.093  1423  4807 I WindowManager: Waiting for transition
12-22 20:15:00.093  1423  4807 I WindowManager: Relayout hash=82d55a2, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) gr=BOTTOM CENTER_VERTICAL sim={adjust=pan} ty=INPUT_METHOD fmt=TRANSPARENT wanim=0x1030056 preferredMinDisplayRefreshRate=60.0 receive insets ignoring z-order
12-22 20:15:00.093  1423  4807 I WindowManager:   fl=81800108
12-22 20:15:00.093  1423  4807 I WindowManager:   pfl=14000000
12-22 20:15:00.093  1423  4807 I WindowManager:   bhv=1
12-22 20:15:00.093  1423  4807 I WindowManager:   fitTypes=3
12-22 20:15:00.093  1423  4807 I WindowManager:   fitSides=7
12-22 20:15:00.093  1423  4807 I WindowManager:   fitIgnoreVis
12-22 20:15:00.093  1423  4807 I WindowManager:   dvrrWindowFrameRateHint=true
12-22 20:15:00.093  1423  4807 I WindowManager:  dimAmount=0.18 dimDuration=150 naviIconColor=0}
12-22 20:15:00.093  1423  4807 D WindowManager: setInsetsWindow Window{82d55a2 u0 InputMethod}, contentInsets=Rect(0, 1904 - 0, 0) -> Rect(0, 1904 - 0, 0), visibleInsets=Rect(0, 1904 - 0, 0) -> Rect(0, 1904 - 0, 0), touchableRegion=SkRegion((0,1904,1080,2404)) -> SkRegion((0,1904,1080,2404)), touchableInsets 3 -> 3
12-22 20:15:00.094  1423  4807 I WindowManager: Waiting for transition
12-22 20:15:00.097  1423  4800 I ActivityManager: Changes in 10362 11 to 16, 128 to 0
12-22 20:15:00.099  1423  2230 I ActivityManager: Changes in 10386 11 to 19, 128 to 0
12-22 20:15:00.104  1423  1555 I ActivityManager: Changes in 10100 19 to 11, 0 to 128
12-22 20:15:00.106  1423  2784 I ActivityManager: Changes in 10100 11 to 19, 128 to 0
12-22 20:15:00.108  1423  2784 I ActivityManager: Changes in 10113 10 to 10, 128 to 0
12-22 20:15:00.117  1423  2230 I WindowManager: Relayout Window{b5eb294 u0 NotificationShade}: viewVisibility=0 req=1080x2520 ty=2040 d0
12-22 20:15:00.118  1423  2230 D WindowManager: makeSurface duration=0 name=NotificationShade$_2022
12-22 20:15:00.118  1423  2230 I WindowManager: Waiting for transition
12-22 20:15:00.119  1423  2230 I WindowManager: Relayout hash=b5eb294, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) gr=TOP CENTER_VERTICAL sim={adjust=pan} layoutInDisplayCutoutMode=always ty=NOTIFICATION_SHADE fmt=TRANSLUCENT or=SCREEN_ORIENTATION_NOSENSOR if=INPUT_FEATURE_DISABLE_USER_ACTIVITY userActivityTimeout=5000
12-22 20:15:00.119  1423  2230 I WindowManager:   fl=81160040
12-22 20:15:00.119  1423  2230 I WindowManager:   pfl=10000200
12-22 20:15:00.119  1423  2230 I WindowManager:   bhv=2
12-22 20:15:00.119  1423  2230 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.119  1423  2230 I WindowManager:   dvrrWindowFrameRateHint=true screenDimDuration=0 naviIconColor=0
12-22 20:15:00.119  1423  2230 I WindowManager:   sfl=40000}
12-22 20:15:00.121  1423  2230 I WindowManager: Relayout Window{41abd5c u0 com.sec.android.app.launcher/com.samsung.app.honeyspace.edge.edgepanel.app.CocktailBarService}: viewVisibility=8 req=0x0 ty=2226 d0
12-22 20:15:00.121  1423  2230 E WindowManager: win=Window{41abd5c u0 com.sec.android.app.launcher/com.samsung.app.honeyspace.edge.edgepanel.app.CocktailBarService} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=8 caller=com.android.server.wm.WindowManagerService.tryStartExitingAnimation:134 com.android.server.wm.WindowManagerService.relayoutWindow:1147 com.android.server.wm.Session.relayout:27 android.view.IWindowSession$Stub.onTransact:829 com.android.server.wm.Session.onTransact:1 android.os.Binder.execTransactInternal:1457 android.os.Binder.execTransact:1401 
12-22 20:15:00.123  1423  2230 I WindowManager: Waiting for transition
12-22 20:15:00.123  1423  2230 I WindowManager: Waiting for transition
12-22 20:15:00.125  1423  1550 I WindowManager: Waiting for transition
12-22 20:15:00.125  1423  1555 I ActivityManager: Changes in 10384 19 to 11, 0 to 128
12-22 20:15:00.126  1423  2230 I WindowManager: Relayout hash=41abd5c, pid=2712, syncId=-1: mAttrs={(0,628)(0x0) gr=TOP RIGHT CENTER sim={adjust=nothing} layoutInDisplayCutoutMode=always ty=2226 fmt=TRANSPARENT
12-22 20:15:00.126  1423  2230 I WindowManager:   fl=81800108
12-22 20:15:00.126  1423  2230 I WindowManager:   pfl=10000070
12-22 20:15:00.126  1423  2230 I WindowManager:   apr=10
12-22 20:15:00.126  1423  2230 I WindowManager:   bhv=1
12-22 20:15:00.126  1423  2230 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.126  1423  2230 I WindowManager:   dvrrWindowFrameRateHint=true
12-22 20:15:00.126  1423  2230 I WindowManager:  dimAmount=0.0 dimDuration=0 naviIconColor=0
12-22 20:15:00.126  1423  2230 I WindowManager:   sfl=420000}
12-22 20:15:00.128  1423  2784 I WindowManager: Waiting for transition
12-22 20:15:00.131  1423  2264 W ActivityManager: Background start not allowed: service Intent { xflg=0x4 cmp=com.facebook.katana/com.facebook.mqtt.service.MqttServiceV2 (has extras) } to com.facebook.katana/com.facebook.mqtt.service.MqttServiceV2 from pid=12897 uid=10384 pkg=com.facebook.katana startFg?=false
12-22 20:15:00.132  1423  4799 I ActivityManager: Changes in 10384 11 to 19, 128 to 0
12-22 20:15:00.132  1423  2697 I WindowManager: Waiting for transition
12-22 20:15:00.134  1423  1555 I ActivityManager: Changes in 10176 19 to 11, 0 to 128
12-22 20:15:00.140  1423  1855 I WindowManager: Relayout Window{9f6c9d1 u0 ThumbsUpHandler_L}: viewVisibility=0 req=41x2520 ty=2601 d0
12-22 20:15:00.140  1423  2264 I ActivityManager: Changes in 10176 11 to 19, 128 to 0
12-22 20:15:00.141  1423  1855 D WindowManager: makeSurface duration=0 name=ThumbsUpHandler_L$_6554
12-22 20:15:00.141  1423  1855 I WindowManager: Waiting for transition
12-22 20:15:00.141  1423  2697 I WindowManager: Relayout Window{4ad78ec u0 Bouncer}: viewVisibility=4 req=1080x0 ty=2009 d0
12-22 20:15:00.142  1423  2697 I WindowManager: Waiting for transition
12-22 20:15:00.142  1423  1855 I WindowManager: Relayout hash=9f6c9d1, pid=6554, syncId=-1: mAttrs={(0,0)(41x2520) gr=TOP LEFT CENTER sim={state=hidden adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=2601 fmt=TRANSLUCENT alpha=0.0
12-22 20:15:00.142  1423  1855 I WindowManager:   fl=5800528
12-22 20:15:00.142  1423  1855 I WindowManager:   pfl=10000050
12-22 20:15:00.142  1423  1855 I WindowManager:   vsysui=500
12-22 20:15:00.142  1423  1855 I WindowManager:   bhv=2
12-22 20:15:00.142  1423  1855 I WindowManager:   fitTypes=207
12-22 20:15:00.142  1423  1855 I WindowManager:   fitSides=0
12-22 20:15:00.142  1423  1855 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.142  1423  1855 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-22 20:15:00.142  1423  1855 I WindowManager:   sfl=20000}
12-22 20:15:00.142  1423  2784 D WindowManager: finishDrawingWindow: Window{b5eb294 u0 NotificationShade} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:00.142  1423  2697 I WindowManager: Relayout hash=4ad78ec, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) gr=TOP CENTER_VERTICAL sim={adjust=resize} layoutInDisplayCutoutMode=shortEdges ty=KEYGUARD_DIALOG fmt=TRANSLUCENT if=INPUT_FEATURE_DISABLE_USER_ACTIVITY userActivityTimeout=10000
12-22 20:15:00.142  1423  2697 I WindowManager:   fl=85000548
12-22 20:15:00.142  1423  2697 I WindowManager:   pfl=10000000
12-22 20:15:00.142  1423  2697 I WindowManager:   vsysui=500
12-22 20:15:00.142  1423  2697 I WindowManager:   bhv=2
12-22 20:15:00.142  1423  2697 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.142  1423  2697 I WindowManager:   dvrrWindowFrameRateHint=true
12-22 20:15:00.142  1423  2697 I WindowManager:  dimAmount=0.0 screenDimDuration=0 naviIconColor=0
12-22 20:15:00.142  1423  2697 I WindowManager:   sfl=40000}
12-22 20:15:00.143  1423  2784 I InputMethodManagerService: isInputMethodShown: isShown=false
12-22 20:15:00.145  1423  1550 I WindowManager: Waiting for transition
12-22 20:15:00.145  1423  1550 I WindowManager: Waiting for transition
12-22 20:15:00.145  1423  2220 I WindowManager: Relayout Window{6146b28 u0 NavigationBar0}: viewVisibility=0 req=1080x75 ty=2019 d0
12-22 20:15:00.145  1423  2220 I WindowManager: Waiting for transition
12-22 20:15:00.146  1423  1855 I WindowManager: Waiting for transition
12-22 20:15:00.146  1423  2933 I WindowManager: Relayout Window{a93450e u0 NavigationBar1}: viewVisibility=0 req=1422x66 ty=2019 d1
12-22 20:15:00.146  1423  2933 I WindowManager: Waiting for transition
12-22 20:15:00.146  1423  2886 I WindowManager: Relayout Window{7aff3c3 u0 ThumbsUpHandler_R}: viewVisibility=0 req=41x2520 ty=2601 d0
12-22 20:15:00.147  1423  2886 D WindowManager: makeSurface duration=0 name=ThumbsUpHandler_R$_6554
12-22 20:15:00.147  1423  2220 I WindowManager: Relayout hash=6146b28, pid=0, syncId=-1: mAttrs={(0,0)(fillx75) gr=BOTTOM CENTER_VERTICAL sim={adjust=pan} layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:00.147  1423  2220 I WindowManager:   fl=20040028
12-22 20:15:00.147  1423  2220 I WindowManager:   pfl=31001000
12-22 20:15:00.147  1423  2220 I WindowManager:   bhv=1
12-22 20:15:00.147  1423  2220 I WindowManager:   providedInsets:
12-22 20:15:00.147  1423  2220 I WindowManager:     InsetsFrameProvider: {id=#44140001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=23}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:15:00.147  1423  2220 I WindowManager:     InsetsFrameProvider: {id=#44140006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:00.147  1423  2220 I WindowManager:     InsetsFrameProvider: {id=#44140005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:00.147  1423  2220 I WindowManager:     InsetsFrameProvider: {id=#44140004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:00.147  1423  2220 I WindowManager:     InsetsFrameProvider: {id=#44140024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:00.147  1423  2220 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.147  1423  2220 I WindowManager:   dvrrWindowFrameRateHint=true
12-22 20:15:00.147  1423  2220 I WindowManager:   paramsForRotation:
12-22 20:15:00.147  1423  2220 I WindowManager:     ROTATION_0={(0,0)(fillx75) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:00.147  1423  2220 I WindowManager:       fl=20040028
12-22 20:15:00.147  1423  2220 I WindowManager:       pfl=31001000
12-22 20:15:00.147  1423  2220 I WindowManager:       bhv=1
12-22 20:15:00.147  1423  2220 I WindowManager:       providedInsets:
12-22 20:15:00.147  1423  2220 I WindowManager:         InsetsFrameProvider: {id=#44140001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=23}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:15:00.147  1423  2220 I WindowManager:         InsetsFrameProvider: {id=#44140006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:00.147  1423  2220 I WindowManager:         InsetsFrameProvider: {id=#44140005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:00.147  1423  2220 I WindowManager:         InsetsFrameProvider: {id=#44140004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:00.147  1423  2220 I WindowManager:         InsetsFrameProvider: {id=#44140024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:00.147  1423  2220 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:00.147  1423  2220 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:00.147  1423  2220 I WindowManager:     ROTATION_90={(0,0)(fillx75) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:00.147  1423  2220 I WindowManager:       fl=20040028
12-22 20:15:00.147  1423  2220 I WindowManager:       pfl=31001000
12-22 20:15:00.147  1423  2220 I WindowManager:       bhv=1
12-22 20:15:00.147  1423  2220 I WindowManager:       providedInsets:
12-22 20:15:00.147  1423  2220 I WindowManager:         InsetsFrameProvider: {id=#44140001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=23}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=Insets{left=0, top=0, right=0, bottom=23}}]}
12-22 20:15:00.147  1423  2220 I WindowManager:         InsetsFrameProvider: {id=#44140006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:00.147  1423  2220 I WindowManager:         InsetsFrameProvider: {id=#44140005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:00.147  1423  2220 I WindowManager:         InsetsFrameProvider: {id=#44140004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:00.147  1423  2220 I WindowManager:         InsetsFrameProvider: {id=#44140024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:00.147  1423  2220 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:00.147  1423  2220 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:00.147  1423  2220 I WindowManager:     ROTATION_180={(0,0)(fillx75) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:00.147  1423  2220 I WindowManager:       fl=20040028
12-22 20:15:00.147  1423  2220 I WindowManager:       pfl=31001000
12-22 20:15:00.147  1423  2220 I WindowManager:       bhv=1
12-22 20:15:00.147  1423  2220 I WindowManager:       providedInsets:
12-22 20:15:00.147  1423  2220 I WindowManager:         InsetsFrameProvider: {id=#44140001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=23}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:15:00.147  1423  2220 I WindowManager:         InsetsFrameProvider: {id=#44140006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:00.147  1423  2220 I WindowManager:         InsetsFrameProvider: {id=#44140005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:00.147  1423  2220 I WindowManager:         InsetsFrameProvider: {id=#44140004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:00.147  1423  2220 I WindowManager:         InsetsFrameProvider: {id=#44140024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:00.147  1423  2220 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:00.147  1423  2220 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:00.147  1423  2220 I WindowManager:     ROTATION_270={(0,0)(fillx75) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:00.147  1423  2220 I WindowManager:       fl=20040028
12-22 20:15:00.147  1423  2220 I WindowManager:       pfl=31001000
12-22 20:15:00.147  1423  2220 I WindowManager:       bhv=1
12-22 20:15:00.147  1423  2220 I WindowManager:       providedInsets:
12-22 20:15:00.147  1423  2220 I WindowManager:         InsetsFrameProvider: {id=#44140001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=23}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=Insets{left=0, top=0, right=0, bottom=23}}]}
12-22 20:15:00.147  1423  2220 I WindowManager:         InsetsFrameProvider: {id=#44140006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:00.147  1423  2220 I WindowManager:         InsetsFrameProvider: {id=#44140005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:00.147  1423  2220 I WindowManager:         InsetsFrameProvider: {id=#44140004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:00.147  1423  2220 I WindowManager:         InsetsFrameProvider: {id=#44140024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:00.147  1423  2220 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:00.147  1423  2220 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0} naviIconColor=0}
12-22 20:15:00.147  1423  2886 I WindowManager: Waiting for transition
12-22 20:15:00.147  1423  1855 D WindowManager: finishDrawingWindow: Window{9f6c9d1 u0 ThumbsUpHandler_L} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:00.147  1423  2886 I WindowManager: Relayout hash=7aff3c3, pid=6554, syncId=-1: mAttrs={(0,0)(41x2520) gr=TOP RIGHT CENTER sim={state=hidden adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=2601 fmt=TRANSLUCENT alpha=0.0
12-22 20:15:00.147  1423  2886 I WindowManager:   fl=5800528
12-22 20:15:00.147  1423  2886 I WindowManager:   pfl=10000050
12-22 20:15:00.147  1423  2886 I WindowManager:   vsysui=500
12-22 20:15:00.147  1423  2886 I WindowManager:   bhv=2
12-22 20:15:00.147  1423  2886 I WindowManager:   fitTypes=207
12-22 20:15:00.147  1423  2886 I WindowManager:   fitSides=0
12-22 20:15:00.147  1423  2886 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.147  1423  2886 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-22 20:15:00.147  1423  2886 I WindowManager:   sfl=20000}
12-22 20:15:00.148  1423  2933 I WindowManager: Relayout hash=a93450e, pid=2022, syncId=-1: mAttrs={(0,0)(fillx66) gr=BOTTOM CENTER_VERTICAL sim={adjust=pan} layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:00.148  1423  2933 I WindowManager:   fl=20040028
12-22 20:15:00.148  1423  2933 I WindowManager:   pfl=31000000
12-22 20:15:00.148  1423  2933 I WindowManager:   bhv=1
12-22 20:15:00.148  1423  2933 I WindowManager:   providedInsets:
12-22 20:15:00.148  1423  2933 I WindowManager:     InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=66}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:15:00.148  1423  2933 I WindowManager:     InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:00.148  1423  2933 I WindowManager:     InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:00.148  1423  2933 I WindowManager:     InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:00.148  1423  2933 I WindowManager:     InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:00.148  1423  2933 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.148  1423  2933 I WindowManager:   dvrrWindowFrameRateHint=true
12-22 20:15:00.148  1423  2933 I WindowManager:   paramsForRotation:
12-22 20:15:00.148  1423  2933 I WindowManager:     ROTATION_0={(0,0)(fillx66) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:00.148  1423  2933 I WindowManager:       fl=20040028
12-22 20:15:00.148  1423  2933 I WindowManager:       pfl=31000000
12-22 20:15:00.148  1423  2933 I WindowManager:       bhv=1
12-22 20:15:00.148  1423  2933 I WindowManager:       providedInsets:
12-22 20:15:00.148  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=66}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:15:00.148  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:00.148  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:00.148  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:00.148  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:00.148  1423  2933 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:00.148  1423  2933 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:00.148  1423  2933 I WindowManager:     ROTATION_90={(0,0)(fillx66) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:00.148  1423  2933 I WindowManager:       fl=20040028
12-22 20:15:00.148  1423  2933 I WindowManager:       pfl=31000000
12-22 20:15:00.148  1423  2933 I WindowManager:       bhv=1
12-22 20:15:00.148  1423  2933 I WindowManager:       providedInsets:
12-22 20:15:00.148  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=38}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=Insets{left=0, top=0, right=0, bottom=38}}]}
12-22 20:15:00.148  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:00.148  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:00.148  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:00.148  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:00.148  1423  2933 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:00.148  1423  2933 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:00.148  1423  2933 I WindowManager:     ROTATION_180={(0,0)(fillx66) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:00.148  1423  2933 I WindowManager:       fl=20040028
12-22 20:15:00.148  1423  2933 I WindowManager:       pfl=31000000
12-22 20:15:00.148  1423  2933 I WindowManager:       bhv=1
12-22 20:15:00.148  1423  2933 I WindowManager:       providedInsets:
12-22 20:15:00.148  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=38}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:15:00.148  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:00.148  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:00.148  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:00.148  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:00.148  1423  2933 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:00.148  1423  2933 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:00.148  1423  2933 I WindowManager:     ROTATION_270={(0,0)(fillx66) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:00.148  1423  2933 I WindowManager:       fl=20040028
12-22 20:15:00.148  1423  2933 I WindowManager:       pfl=31000000
12-22 20:15:00.148  1423  2933 I WindowManager:       bhv=1
12-22 20:15:00.148  1423  2933 I WindowManager:       providedInsets:
12-22 20:15:00.148  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=38}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=Insets{left=0, top=0, right=0, bottom=38}}]}
12-22 20:15:00.148  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:00.148  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:00.148  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:00.148  1423  2933 I WindowManager:         InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:00.148  1423  2933 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:00.148  1423  2933 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0} naviIconColor=0}
12-22 20:15:00.148  1423  1550 I WindowManager: Waiting for transition
12-22 20:15:00.150  1423  4799 D WindowManager: finishDrawingWindow: Window{a93450e u0 NavigationBar1} mDrawState=READY_TO_SHOW seqId=0
12-22 20:15:00.150  1423  2697 I WindowManager: Waiting for transition
12-22 20:15:00.150  1423  4807 I WindowManager: Relayout Window{e382cc2 u0 SubLauncherWindow}: viewVisibility=0 req=1422x1500 ty=1000 d1
12-22 20:15:00.151  1423  4807 D WindowManager: makeSurface duration=0 name=SubLauncherWindow$_2022
12-22 20:15:00.151  1423  4807 I WindowManager: Waiting for transition
12-22 20:15:00.152  1423  4807 I WindowManager: Relayout hash=e382cc2, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=pan} layoutInDisplayCutoutMode=always ty=APPLICATION_PANEL fmt=TRANSLUCENT if=INPUT_FEATURE_DISABLE_USER_ACTIVITY
12-22 20:15:00.152  1423  4807 I WindowManager:   fl=81080278
12-22 20:15:00.152  1423  4807 I WindowManager:   vsysui=1600400
12-22 20:15:00.152  1423  4807 I WindowManager:   bhv=1
12-22 20:15:00.152  1423  4807 I WindowManager:   fitTypes=206
12-22 20:15:00.152  1423  4807 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.152  1423  4807 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:00.153  1423  4799 D WindowManager: finishDrawingWindow: Window{7aff3c3 u0 ThumbsUpHandler_R} mDrawState=DRAW_PENDING seqId=14
12-22 20:15:00.154  1423  1550 I WindowManager: Waiting for transition
12-22 20:15:00.155  1423  1550 I WindowManager: Waiting for transition
12-22 20:15:00.156  1423  4799 D WindowManager: finishDrawingWindow: Window{e382cc2 u0 SubLauncherWindow} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:00.157  1423  1550 I WindowManager: Waiting for transition
12-22 20:15:00.159  1423  4799 I WindowManager: Relayout Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity}: viewVisibility=0 req=1422x1500 ty=1 d1
12-22 20:15:00.159  1423  4799 D WindowManager: makeSurface duration=0 name=com.android.systemui/com.android.systemui.subscreen.SubHomeActivity$_2022
12-22 20:15:00.159  1423  1555 I ActivityManager: Changes in 10329 8 to 8, 0 to 128
12-22 20:15:00.159  1423  4799 I WindowManager: Waiting for transition
12-22 20:15:00.160  1423  4799 D WindowManager: Changing focus from null to Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity} displayId=1 Callers=com.android.server.wm.WindowManagerService.relayoutWindow:1359 com.android.server.wm.Session.relayout:27 android.view.IWindowSession$Stub.onTransact:829 com.android.server.wm.Session.onTransact:1 
12-22 20:15:00.160  1423  4799 I WindowManager: Reparenting to leash, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9, leashParent=Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e
12-22 20:15:00.160  1423  4799 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0xf5b6c0f
12-22 20:15:00.160  1423  4799 I WindowManager: Relayout hash=9a3d1c6, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION fmt=TRANSPARENT if=INPUT_FEATURE_DISABLE_USER_ACTIVITY userActivityTimeout=30000
12-22 20:15:00.160  1423  4799 I WindowManager:   fl=81910100
12-22 20:15:00.160  1423  4799 I WindowManager:   pfl=10008850
12-22 20:15:00.160  1423  4799 I WindowManager:   vsysui=1600000
12-22 20:15:00.160  1423  4799 I WindowManager:   bhv=1
12-22 20:15:00.160  1423  4799 I WindowManager:   fitSides=0
12-22 20:15:00.160  1423  4799 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.160  1423  4799 I WindowManager:   dvrrWindowFrameRateHint=true screenDimDuration=0 naviIconColor=0}
12-22 20:15:00.163  1423  1555 I ActivityManager: Changes in 5006 8 to 8, 0 to 128
12-22 20:15:00.165  1423  2230 I ActivityManager: Changes in 5006 8 to 8, 128 to 0
12-22 20:15:00.169  1423  1550 W WindowManager: Don't apply multiCrop on extra display
12-22 20:15:00.169  1423  1550 I WindowManager: Waiting for transition
12-22 20:15:00.169  1423  1550 I WindowManager: Waiting for transition
12-22 20:15:00.172  1423  2933 D WindowManager: finishDrawingWindow: Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:00.172  1423  1423 D InputDispatcher: Inject key (0/0): action=1, f=0x8, d=-1, time=31059776182000
12-22 20:15:00.176  1423  1550 D WindowManager: All windows drawn!
12-22 20:15:00.177  1423  4807 I InputMethodManagerService: isInputMethodShown: isShown=false
12-22 20:15:00.178  1423  1555 I ActivityManager: Changes in 10373 16 to 11, 0 to 128
12-22 20:15:00.181  1423  2264 I ActivityManager: Changes in 10373 11 to 16, 128 to 0
12-22 20:15:00.182  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(948 x 1048) immediately
12-22 20:15:00.185  1423  2886 E ActivityManager: Sending non-protected broadcast com.samsung.android.app.aodservice.ACTION_COVER_HOME_FOCUS_CHANGED from system 2022:com.android.systemui/u0a55 pkg com.android.systemui
12-22 20:15:00.185  1423  2886 E ActivityManager: java.lang.Throwable
12-22 20:15:00.185  1423  2886 E ActivityManager: 	at com.android.server.am.BroadcastController.checkBroadcastFromSystem(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:252)
12-22 20:15:00.185  1423  2886 E ActivityManager: 	at com.android.server.am.BroadcastController.broadcastIntentLockedTraced(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:344)
12-22 20:15:00.185  1423  2886 E ActivityManager: 	at com.android.server.am.BroadcastController.broadcastIntentLocked(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:18)
12-22 20:15:00.185  1423  2886 E ActivityManager: 	at com.android.server.am.ActivityManagerService.broadcastIntentWithFeature(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:149)
12-22 20:15:00.185  1423  2886 E ActivityManager: 	at android.app.IActivityManager$Stub.onTransact$broadcastIntentWithFeature$(IActivityManager.java:12241)
12-22 20:15:00.185  1423  2886 E ActivityManager: 	at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:3154)
12-22 20:15:00.185  1423  2886 E ActivityManager: 	at com.android.server.am.ActivityManagerService.onTransact(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:425)
12-22 20:15:00.185  1423  2886 E ActivityManager: 	at android.os.Binder.execTransactInternal(Binder.java:1462)
12-22 20:15:00.185  1423  2886 E ActivityManager: 	at android.os.Binder.execTransact(Binder.java:1401)
12-22 20:15:00.186  1423  2697 E ActivityManager: Sending non-protected broadcast com.samsung.android.app.aodservice.ACTION_FLOATING_SHORTCUT_AVAILABLE_CHANGED from system 2022:com.android.systemui/u0a55 pkg com.android.systemui
12-22 20:15:00.186  1423  2697 E ActivityManager: java.lang.Throwable
12-22 20:15:00.186  1423  2697 E ActivityManager: 	at com.android.server.am.BroadcastController.checkBroadcastFromSystem(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:252)
12-22 20:15:00.186  1423  2697 E ActivityManager: 	at com.android.server.am.BroadcastController.broadcastIntentLockedTraced(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:344)
12-22 20:15:00.186  1423  2697 E ActivityManager: 	at com.android.server.am.BroadcastController.broadcastIntentLocked(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:18)
12-22 20:15:00.186  1423  2697 E ActivityManager: 	at com.android.server.am.ActivityManagerService.broadcastIntentWithFeature(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:149)
12-22 20:15:00.186  1423  2697 E ActivityManager: 	at android.app.IActivityManager$Stub.onTransact$broadcastIntentWithFeature$(IActivityManager.java:12241)
12-22 20:15:00.186  1423  2697 E ActivityManager: 	at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:3154)
12-22 20:15:00.186  1423  2697 E ActivityManager: 	at com.android.server.am.ActivityManagerService.onTransact(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:425)
12-22 20:15:00.186  1423  2697 E ActivityManager: 	at android.os.Binder.execTransactInternal(Binder.java:1462)
12-22 20:15:00.186  1423  2697 E ActivityManager: 	at android.os.Binder.execTransact(Binder.java:1401)
12-22 20:15:00.187  1423  2264 E ActivityManager: Sending non-protected broadcast com.samsung.android.app.aodservice.ACTION_COVER_HOME_QUICK_PANEL_TOUCH_AREA_CHANGED from system 2022:com.android.systemui/u0a55 pkg com.android.systemui
12-22 20:15:00.187  1423  2264 E ActivityManager: java.lang.Throwable
12-22 20:15:00.187  1423  2264 E ActivityManager: 	at com.android.server.am.BroadcastController.checkBroadcastFromSystem(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:252)
12-22 20:15:00.187  1423  2264 E ActivityManager: 	at com.android.server.am.BroadcastController.broadcastIntentLockedTraced(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:344)
12-22 20:15:00.187  1423  2264 E ActivityManager: 	at com.android.server.am.BroadcastController.broadcastIntentLocked(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:18)
12-22 20:15:00.187  1423  2264 E ActivityManager: 	at com.android.server.am.ActivityManagerService.broadcastIntentWithFeature(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:149)
12-22 20:15:00.187  1423  2264 E ActivityManager: 	at android.app.IActivityManager$Stub.onTransact$broadcastIntentWithFeature$(IActivityManager.java:12241)
12-22 20:15:00.187  1423  2264 E ActivityManager: 	at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:3154)
12-22 20:15:00.187  1423  2264 E ActivityManager: 	at com.android.server.am.ActivityManagerService.onTransact(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:425)
12-22 20:15:00.187  1423  2264 E ActivityManager: 	at android.os.Binder.execTransactInternal(Binder.java:1462)
12-22 20:15:00.187  1423  2264 E ActivityManager: 	at android.os.Binder.execTransact(Binder.java:1401)
12-22 20:15:00.189  1423  2229 I ActivityManager: Changes in 10329 8 to 8, 128 to 0
12-22 20:15:00.198  1423  4794 D InputDispatcher: Once focus requested (1): 9a3d1c6 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity
12-22 20:15:00.198  1423  4794 D InputDispatcher: Focus request (1): 9a3d1c6 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity but waiting because NO_WINDOW
12-22 20:15:00.198  1423  2230 D InputDispatcher: Focus entered window (1): 9a3d1c6 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity
12-22 20:15:00.200  1423  1555 I ActivityManager: Changes in 10386 19 to 11, 0 to 128
12-22 20:15:00.200  1423  1555 I ActivityManager: Changes in 10361 19 to 11, 0 to 128
12-22 20:15:00.200  1423  1555 I ActivityManager: Changes in 10113 10 to 10, 0 to 128
12-22 20:15:00.207  1423  2933 I ActivityManager: Changes in 5009 6 to 5, 128 to 144
12-22 20:15:00.210  1423  1754 I InputMethodManagerService: startInputOrWindowGainedFocusInternalLocked: Rejecting unbind in case of no editor in cover screen.
12-22 20:15:00.213  1423  1555 I ActivityManager: Changes in 10362 16 to 11, 0 to 128
12-22 20:15:00.214  1423  4800 I ActivityManager: Changes in 10386 11 to 19, 128 to 0
12-22 20:15:00.215  1423  2784 I InputMethodManagerService: isInputMethodShown: isShown=false
12-22 20:15:00.216  1423  1754 I InputMethodManagerService: startInputUncheckedLocked: Rejecting unbind/bind in case of no editor in cover screen.
12-22 20:15:00.221  1423  4806 I InputMethodManagerService: isInputMethodShown: isShown=false
12-22 20:15:00.221  1423  2697 I ActivityManager: Changes in 10361 11 to 19, 128 to 0
12-22 20:15:00.221  1423  2697 I ActivityManager: Changes in 10113 10 to 10, 128 to 0
12-22 20:15:00.221  1423  2697 I ActivityManager: Changes in 10362 11 to 16, 128 to 0
12-22 20:15:00.225  1423  1555 I ActivityManager: Changes in 10100 19 to 11, 0 to 128
12-22 20:15:00.227  1423  4806 I ActivityManager: Changes in 10100 11 to 19, 128 to 0
12-22 20:15:00.241 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{acd2d5d VFE...C.. ........ 0,0-93,93}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:790 
12-22 20:15:00.243 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{bcd8e1e V.E...... ........ 0,0-50,50}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:791 
12-22 20:15:00.245  1423  2697 I WindowManager: Relayout Window{41abd5c u0 com.sec.android.app.launcher/com.samsung.app.honeyspace.edge.edgepanel.app.CocktailBarService}: viewVisibility=0 req=67x342 ty=2226 d0
12-22 20:15:00.245 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{6d6b021 G.E...... ......ID 0,0-527,444}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:794 
12-22 20:15:00.245  1423  2697 D WindowManager: makeSurface duration=0 name=com.sec.android.app.launcher/com.samsung.app.honeyspace.edge.edgepanel.app.CocktailBarService$_2712
12-22 20:15:00.246  1423  2697 I WindowManager: Relayout hash=41abd5c, pid=2712, syncId=-1: mAttrs={(0,628)(67x342) gr=TOP RIGHT CENTER sim={adjust=nothing} layoutInDisplayCutoutMode=always ty=2226 fmt=TRANSPARENT
12-22 20:15:00.246  1423  2697 I WindowManager:   fl=81800108
12-22 20:15:00.246  1423  2697 I WindowManager:   pfl=10000070
12-22 20:15:00.246  1423  2697 I WindowManager:   apr=10
12-22 20:15:00.246  1423  2697 I WindowManager:   bhv=1
12-22 20:15:00.246  1423  2697 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.246  1423  2697 I WindowManager:   dvrrWindowFrameRateHint=true
12-22 20:15:00.246  1423  2697 I WindowManager:  dimAmount=0.0 dimDuration=0 naviIconColor=0
12-22 20:15:00.246  1423  2697 I WindowManager:   sfl=420000}
12-22 20:15:00.248 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{de1e98d G.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupTrackpad:938 com.example.coverscreentester.OverlayService.setupUI:822 
12-22 20:15:00.249 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:00.249 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:00.249  1423  4806 D WindowManager: finishDrawingWindow: Window{41abd5c u0 com.sec.android.app.launcher/com.samsung.app.honeyspace.edge.edgepanel.app.CocktailBarService} mDrawState=DRAW_PENDING seqId=53
12-22 20:15:00.253 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{56631af VFE...C.. ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupBubble:903 com.example.coverscreentester.OverlayService.setupUI:825 
12-22 20:15:00.253 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:00.253 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:00.256 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{ee39cb V.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupCursor:957 com.example.coverscreentester.OverlayService.setupUI:826 
12-22 20:15:00.256 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:00.256 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:00.259 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{56631af VFE...C.. ......I. 0,0-0,0}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:790 
12-22 20:15:00.260 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{ee39cb V.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:791 
12-22 20:15:00.260 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{de1e98d G.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:794 
12-22 20:15:00.263 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{1854f2 G.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupTrackpad:938 com.example.coverscreentester.OverlayService.setupUI:822 
12-22 20:15:00.263 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:00.263 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:00.267 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{3d2ce3e VFE...C.. ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupBubble:903 com.example.coverscreentester.OverlayService.setupUI:825 
12-22 20:15:00.267 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:00.267 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:00.272 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{529904a V.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupCursor:957 com.example.coverscreentester.OverlayService.setupUI:826 
12-22 20:15:00.272 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:00.272 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:00.281 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{3d2ce3e VFE...C.. ......I. 0,0-0,0}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:790 
12-22 20:15:00.282 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{529904a V.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:791 
12-22 20:15:00.282 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{1854f2 G.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:794 
12-22 20:15:00.285 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{f97326d G.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupTrackpad:938 com.example.coverscreentester.OverlayService.setupUI:822 
12-22 20:15:00.285 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:00.285 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:00.289 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{6018869 VFE...C.. ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupBubble:903 com.example.coverscreentester.OverlayService.setupUI:825 
12-22 20:15:00.289 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:00.289 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:00.293 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{fa14225 V.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupCursor:957 com.example.coverscreentester.OverlayService.setupUI:826 
12-22 20:15:00.293 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:00.293 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:00.300  1423  2697 I WindowManager: Relayout Window{9c80bf4 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=8 req=681x551 ty=2032 d1
12-22 20:15:00.301  1423  2697 I WindowManager: Relayout hash=9c80bf4, pid=26287, syncId=-1: mAttrs={(683,640)(681x551) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:00.301  1423  2697 I WindowManager:   fl=1040228
12-22 20:15:00.301  1423  2697 I WindowManager:   pfl=40000000
12-22 20:15:00.301  1423  2697 I WindowManager:   bhv=1
12-22 20:15:00.301  1423  2697 I WindowManager:   fitTypes=207
12-22 20:15:00.301  1423  2697 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.301  1423  2697 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:00.301  1423  4806 I WindowManager: Relayout Window{f7e94d5 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=93x93 ty=2032 d1
12-22 20:15:00.302  1423  4806 D WindowManager: makeSurface duration=0 name=$_26287
12-22 20:15:00.303  1423  4806 I WindowManager: Relayout hash=f7e94d5, pid=26287, syncId=-1: mAttrs={(95,1058)(93x93) gr=TOP START CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:00.303  1423  4806 I WindowManager:   fl=1000308
12-22 20:15:00.303  1423  4806 I WindowManager:   bhv=1
12-22 20:15:00.303  1423  4806 I WindowManager:   fitTypes=206
12-22 20:15:00.303  1423  4806 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.303  1423  4806 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:00.314  1423  2220 D WindowManager: finishDrawingWindow: Window{f7e94d5 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:00.315  1423  2697 I WindowManager: Relayout Window{682b742 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=50x50 ty=2032 d1
12-22 20:15:00.316  1423  2697 D WindowManager: makeSurface duration=0 name=$_26287
12-22 20:15:00.316  1423  2697 I WindowManager: Relayout hash=682b742, pid=26287, syncId=-1: mAttrs={(711,750)(wrapxwrap) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:00.316  1423  2697 I WindowManager:   fl=1000318
12-22 20:15:00.316  1423  2697 I WindowManager:   bhv=1
12-22 20:15:00.316  1423  2697 I WindowManager:   fitTypes=206
12-22 20:15:00.316  1423  2697 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.316  1423  2697 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:00.319  1423  2220 I WindowManager: Relayout Window{550c5a8 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=8 req=681x551 ty=2032 d1
12-22 20:15:00.320  1423  2697 D WindowManager: finishDrawingWindow: Window{682b742 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:00.320  1423  2220 I WindowManager: Relayout hash=550c5a8, pid=26287, syncId=-1: mAttrs={(683,640)(681x551) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:00.320  1423  2220 I WindowManager:   fl=1040228
12-22 20:15:00.320  1423  2220 I WindowManager:   pfl=40000000
12-22 20:15:00.320  1423  2220 I WindowManager:   bhv=1
12-22 20:15:00.320  1423  2220 I WindowManager:   fitTypes=207
12-22 20:15:00.320  1423  2220 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.320  1423  2220 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:00.321  1423  2229 I WindowManager: Relayout Window{e198ef9 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=93x93 ty=2032 d1
12-22 20:15:00.321  1423  2229 D WindowManager: makeSurface duration=0 name=$_26287
12-22 20:15:00.322  1423  2229 I WindowManager: Relayout hash=e198ef9, pid=26287, syncId=-1: mAttrs={(95,1058)(93x93) gr=TOP START CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:00.322  1423  2229 I WindowManager:   fl=1000308
12-22 20:15:00.322  1423  2229 I WindowManager:   bhv=1
12-22 20:15:00.322  1423  2229 I WindowManager:   fitTypes=206
12-22 20:15:00.322  1423  2229 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.322  1423  2229 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:00.334  1423  2229 D WindowManager: finishDrawingWindow: Window{e198ef9 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:00.334  1423  2933 I WindowManager: Relayout Window{75bba84 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=50x50 ty=2032 d1
12-22 20:15:00.335  1423  2933 D WindowManager: makeSurface duration=0 name=$_26287
12-22 20:15:00.336  1423  2933 I WindowManager: Relayout hash=75bba84, pid=26287, syncId=-1: mAttrs={(711,750)(wrapxwrap) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:00.336  1423  2933 I WindowManager:   fl=1000318
12-22 20:15:00.336  1423  2933 I WindowManager:   bhv=1
12-22 20:15:00.336  1423  2933 I WindowManager:   fitTypes=206
12-22 20:15:00.336  1423  2933 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.336  1423  2933 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:00.339  1423  2229 D WindowManager: finishDrawingWindow: Window{75bba84 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:00.340  1423  2933 I WindowManager: Relayout Window{25c0020 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=8 req=681x551 ty=2032 d1
12-22 20:15:00.340  1423  2933 I WindowManager: Relayout hash=25c0020, pid=26287, syncId=-1: mAttrs={(683,640)(681x551) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:00.340  1423  2933 I WindowManager:   fl=1040228
12-22 20:15:00.340  1423  2933 I WindowManager:   pfl=40000000
12-22 20:15:00.340  1423  2933 I WindowManager:   bhv=1
12-22 20:15:00.340  1423  2933 I WindowManager:   fitTypes=207
12-22 20:15:00.340  1423  2933 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.340  1423  2933 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:00.342  1423  2229 I WindowManager: Relayout Window{fa24876 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=93x93 ty=2032 d1
12-22 20:15:00.342  1423  2229 D WindowManager: makeSurface duration=0 name=$_26287
12-22 20:15:00.343  1423  2229 I WindowManager: Relayout hash=fa24876, pid=26287, syncId=-1: mAttrs={(95,1058)(93x93) gr=TOP START CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:00.343  1423  2229 I WindowManager:   fl=1000308
12-22 20:15:00.343  1423  2229 I WindowManager:   bhv=1
12-22 20:15:00.343  1423  2229 I WindowManager:   fitTypes=206
12-22 20:15:00.343  1423  2229 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.343  1423  2229 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:00.358  1423  2229 D WindowManager: finishDrawingWindow: Window{fa24876 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:00.359  1423  4806 I WindowManager: Relayout Window{a13456f u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=50x50 ty=2032 d1
12-22 20:15:00.360  1423  4806 D WindowManager: makeSurface duration=0 name=$_26287
12-22 20:15:00.361  1423  4806 I WindowManager: Relayout hash=a13456f, pid=26287, syncId=-1: mAttrs={(711,750)(wrapxwrap) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:00.361  1423  4806 I WindowManager:   fl=1000318
12-22 20:15:00.361  1423  4806 I WindowManager:   bhv=1
12-22 20:15:00.361  1423  4806 I WindowManager:   fitTypes=206
12-22 20:15:00.361  1423  4806 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.361  1423  4806 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:00.365  1423  4806 D WindowManager: finishDrawingWindow: Window{a13456f u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:00.413  1423  2229 D WindowManager: finishDrawingWindow: Window{fa24876 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=HAS_DRAWN seqId=0
12-22 20:15:00.413  1423  2229 D WindowManager: finishDrawingWindow: Window{a13456f u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=HAS_DRAWN seqId=0
12-22 20:15:00.602  1423  2220 I WindowManager: Relayout Window{82d55a2 u0 InputMethod}: viewVisibility=8 req=1080x2404 ty=2011 d0
12-22 20:15:00.602  1423  2220 E WindowManager: win=Window{82d55a2 u0 InputMethod} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=8 caller=com.android.server.wm.WindowManagerService.tryStartExitingAnimation:134 com.android.server.wm.WindowManagerService.relayoutWindow:1147 com.android.server.wm.Session.relayout:27 android.view.IWindowSession$Stub.onTransact:829 com.android.server.wm.Session.onTransact:1 android.os.Binder.execTransactInternal:1462 android.os.Binder.execTransact:1401 
12-22 20:15:00.604  1423  2220 I WindowManager: Relayout hash=82d55a2, pid=4255, syncId=-1: mAttrs={(0,0)(fillxfill) gr=BOTTOM CENTER_VERTICAL sim={adjust=pan} ty=INPUT_METHOD fmt=TRANSPARENT wanim=0x1030056 preferredMinDisplayRefreshRate=60.0 receive insets ignoring z-order
12-22 20:15:00.604  1423  2220 I WindowManager:   fl=81800108
12-22 20:15:00.604  1423  2220 I WindowManager:   pfl=14000000
12-22 20:15:00.604  1423  2220 I WindowManager:   bhv=1
12-22 20:15:00.604  1423  2220 I WindowManager:   fitTypes=3
12-22 20:15:00.604  1423  2220 I WindowManager:   fitSides=7
12-22 20:15:00.604  1423  2220 I WindowManager:   fitIgnoreVis
12-22 20:15:00.604  1423  2220 I WindowManager:   dvrrWindowFrameRateHint=true
12-22 20:15:00.604  1423  2220 I WindowManager:  dimAmount=0.18 dimDuration=150 naviIconColor=0}
12-22 20:15:00.607  1423  2220 D WindowManager: setInsetsWindow Window{82d55a2 u0 InputMethod}, contentInsets=Rect(0, 1904 - 0, 0) -> Rect(0, 2329 - 0, 0), visibleInsets=Rect(0, 1904 - 0, 0) -> Rect(0, 2329 - 0, 0), touchableRegion=SkRegion((0,1904,1080,2404)) -> SkRegion(), touchableInsets 3 -> 3
12-22 20:15:00.610  1423  4806 I WindowManager: Relayout Window{5a7dcc6 u0 com.android.systemui.wallpapers.ImageWallpaper}: viewVisibility=0 req=2486x2520 ty=2013 d0
12-22 20:15:00.612  1423  4806 I WindowManager: Relayout hash=5a7dcc6, pid=2022, syncId=-1: mAttrs={(0,0)(2486x2520) gr=TOP START CENTER layoutInDisplayCutoutMode=always ty=WALLPAPER fmt=RGBX_8888 wanim=0x1030328
12-22 20:15:00.612  1423  4806 I WindowManager:   fl=14318
12-22 20:15:00.612  1423  4806 I WindowManager:   pfl=14
12-22 20:15:00.612  1423  4806 I WindowManager:   bhv=1
12-22 20:15:00.612  1423  4806 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.612  1423  4806 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-22 20:15:00.612  1423  4806 I WindowManager:   sfl=8}
12-22 20:15:00.656 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{6018869 VFE...C.. ........ 0,0-93,93}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:790 
12-22 20:15:00.658 16182 16182 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{315e86 VFE...C.. ........ 0,0-63,63}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.quadrantlauncher.FloatingLauncherService.performDisplayChange:998 
12-22 20:15:00.660 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{fa14225 V.E...... ........ 0,0-50,50}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:791 
12-22 20:15:00.662 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{f97326d G.E...... ......ID 0,0-681,551}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:794 
12-22 20:15:00.675 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{b520d09 G.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupTrackpad:938 com.example.coverscreentester.OverlayService.setupUI:822 
12-22 20:15:00.676 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:00.677 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:00.689 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{617d94b VFE...C.. ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupBubble:903 com.example.coverscreentester.OverlayService.setupUI:825 
12-22 20:15:00.690 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:00.690 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:00.694 16182 16182 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{5c104c0 VFE...C.. ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.quadrantlauncher.FloatingLauncherService.setupBubble:551 com.example.quadrantlauncher.FloatingLauncherService.performDisplayChange:1015 
12-22 20:15:00.694 16182 16182 D ViewRootImpl: desktopMode is false
12-22 20:15:00.695 16182 16182 I ViewRootImpl: dVRR is disabled
12-22 20:15:00.697 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{488bf27 V.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupCursor:957 com.example.coverscreentester.OverlayService.setupUI:826 
12-22 20:15:00.697 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:00.697 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:00.717  1423  2697 W WindowManager: Failed looking up window session=Session{298fe90 26287:u0a10515} callers=com.android.server.wm.WindowManagerService.windowForClientLocked:1 com.android.server.wm.Session.setOnBackInvokedCallbackInfo:15 android.view.IWindowSession$Stub.onTransact:1390 
12-22 20:15:00.717  1423  2697 I WindowManager: setOnBackInvokedCallback(): No window state for package:com.katsuyamaki.DroidOSTrackpadKeyboard
12-22 20:15:00.717  1423  2697 W WindowManager: Failed looking up window session=Session{298fe90 26287:u0a10515} callers=com.android.server.wm.WindowManagerService.windowForClientLocked:1 com.android.server.wm.Session.setOnBackInvokedCallbackInfo:15 android.view.IWindowSession$Stub.onTransact:1390 
12-22 20:15:00.717  1423  2697 I WindowManager: setOnBackInvokedCallback(): No window state for package:com.katsuyamaki.DroidOSTrackpadKeyboard
12-22 20:15:00.718  1423  4806 I WindowManager: Relayout Window{fcde5e u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=8 req=681x551 ty=2032 d1
12-22 20:15:00.719  1423  2697 W WindowManager: Failed looking up window session=Session{298fe90 26287:u0a10515} callers=com.android.server.wm.WindowManagerService.windowForClientLocked:1 com.android.server.wm.Session.setOnBackInvokedCallbackInfo:15 android.view.IWindowSession$Stub.onTransact:1390 
12-22 20:15:00.719  1423  2697 I WindowManager: setOnBackInvokedCallback(): No window state for package:com.katsuyamaki.DroidOSTrackpadKeyboard
12-22 20:15:00.719  1423  4806 I WindowManager: Relayout hash=fcde5e, pid=26287, syncId=-1: mAttrs={(683,640)(681x551) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:00.719  1423  4806 I WindowManager:   fl=1040228
12-22 20:15:00.719  1423  4806 I WindowManager:   pfl=40000000
12-22 20:15:00.719  1423  4806 I WindowManager:   bhv=1
12-22 20:15:00.719  1423  4806 I WindowManager:   fitTypes=207
12-22 20:15:00.719  1423  4806 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.719  1423  4806 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:00.721  1423  4806 I WindowManager: Relayout Window{7057a37 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=93x93 ty=2032 d1
12-22 20:15:00.721  1423  4806 D WindowManager: makeSurface duration=0 name=$_26287
12-22 20:15:00.722  1423  4806 I WindowManager: Relayout hash=7057a37, pid=26287, syncId=-1: mAttrs={(95,1058)(93x93) gr=TOP START CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:00.722  1423  4806 I WindowManager:   fl=1000308
12-22 20:15:00.722  1423  4806 I WindowManager:   bhv=1
12-22 20:15:00.722  1423  4806 I WindowManager:   fitTypes=206
12-22 20:15:00.722  1423  4806 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.722  1423  4806 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:00.724  1423  2697 I WindowManager: Relayout Window{3d2f441 u0 com.katsuyamaki.DroidOSLauncher}: viewVisibility=0 req=63x63 ty=2032 d1
12-22 20:15:00.724  1423  2697 D WindowManager: makeSurface duration=1 name=$_16182
12-22 20:15:00.726  1423  2697 I WindowManager: Relayout hash=3d2f441, pid=16182, syncId=-1: mAttrs={(50,200)(wrapxwrap) gr=TOP START CENTER sim={adjust=pan} ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:00.726  1423  2697 I WindowManager:   fl=1040308
12-22 20:15:00.726  1423  2697 I WindowManager:   bhv=1
12-22 20:15:00.726  1423  2697 I WindowManager:   fitTypes=206
12-22 20:15:00.726  1423  2697 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.726  1423  2697 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:00.740  1423  2697 I WindowManager: Relayout Window{a4795d4 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=50x50 ty=2032 d1
12-22 20:15:00.741  1423  2697 D WindowManager: makeSurface duration=0 name=$_26287
12-22 20:15:00.742  1423  2697 I WindowManager: Relayout hash=a4795d4, pid=26287, syncId=-1: mAttrs={(711,750)(wrapxwrap) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:00.742  1423  2697 I WindowManager:   fl=1000318
12-22 20:15:00.742  1423  2697 I WindowManager:   bhv=1
12-22 20:15:00.742  1423  2697 I WindowManager:   fitTypes=206
12-22 20:15:00.742  1423  2697 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:00.742  1423  2697 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:00.742  1423  2933 D WindowManager: finishDrawingWindow: Window{7057a37 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:00.747  1423  4800 D WindowManager: finishDrawingWindow: Window{a4795d4 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:00.750  1423  2220 D WindowManager: finishDrawingWindow: Window{3d2f441 u0 com.katsuyamaki.DroidOSLauncher} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:00.754  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(948 x 1048) immediately
12-22 20:15:00.755  1423  1855 D WindowManager: finishDrawingWindow: Window{7057a37 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=HAS_DRAWN seqId=0
12-22 20:15:00.762  1423  2220 D WindowManager: finishDrawingWindow: Window{a4795d4 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=HAS_DRAWN seqId=0
12-22 20:15:00.770  1423  2220 D WindowManager: finishDrawingWindow: Window{3d2f441 u0 com.katsuyamaki.DroidOSLauncher} mDrawState=HAS_DRAWN seqId=0
12-22 20:15:02.017  1423  2220 W ActivityManager: Background start not allowed: service Intent { act=com.whatsapp.messageservice.messaging.MessageService.START xflg=0x4 cmp=com.whatsapp/.messageservice.messaging.MessageService } to com.whatsapp/.messageservice.messaging.MessageService from pid=8940 uid=10373 pkg=com.whatsapp startFg?=false
12-22 20:15:02.961  1423  2220 I ActivityManager: Changes in 10373 16 to 8, 0 to 128
12-22 20:15:03.000  1423  1855 I ActivityManager: Changes in 10373 8 to 10, 128 to 0
12-22 20:15:03.909  1423  1423 D InputDispatcher: Inject motion (0/0): action=0x0, time=31063502981000, f=0x0, d=1 dsdx=1.500000 dtdx=-0.000000
12-22 20:15:03.911  1423  1695 I InputDispatcher: Delivering touch to (16182): action: 0x0, f=0x0, d=1, '3d2f441', t=1 +(-50,-236)*(1.50)
12-22 20:15:03.941  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(948 x 1048) immediately
12-22 20:15:03.969  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(948 x 1048) immediately
12-22 20:15:03.976  1423  1423 D InputDispatcher: Inject motion (0/0): action=0x1, time=31063578361000, f=0x0, d=1 dsdx=1.500000 dtdx=-0.000000
12-22 20:15:03.976  1423  1695 I InputDispatcher: Delivering touch to (16182): action: 0x1, f=0x0, d=1, '3d2f441', t=1 +(-50,-236)*(1.50)
12-22 20:15:03.978 16182 16182 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{a86cb4e VFE...C.. ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.quadrantlauncher.FloatingLauncherService.toggleDrawer:655 com.example.quadrantlauncher.FloatingLauncherService.access$toggleDrawer:54 
12-22 20:15:03.978 16182 16182 D ViewRootImpl: desktopMode is false
12-22 20:15:03.979 16182 16182 I ViewRootImpl: dVRR is disabled
12-22 20:15:03.984  1423  4806 D WindowManager: Changing focus from Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity} to Window{4e263fc u0 com.katsuyamaki.DroidOSLauncher} displayId=1 Callers=com.android.server.wm.WindowManagerService.addWindowInner:565 com.android.server.wm.WindowManagerService.addWindow:1842 com.android.server.wm.Session.addToDisplayAsUser:24 android.view.IWindowSession$Stub.onTransact:757 
12-22 20:15:03.984  1423  4806 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0xf5b6c0f
12-22 20:15:03.984  1423  4806 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e, destroy=false, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9
12-22 20:15:03.984  1423  4806 I WindowManager: Reparenting to leash, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9, leashParent=Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e
12-22 20:15:03.984  1423  4806 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0x7f13694
12-22 20:15:03.985  1423  4806 D WindowManager: updateSystemBarAttributes: displayId=1, focusedCanBeNavColorWin=false, win=Window{4e263fc u0 com.katsuyamaki.DroidOSLauncher}, navColorWin=Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity}, caller=com.android.server.wm.WindowManagerService.updateFocusedWindowLocked:372 com.android.server.wm.WindowManagerService.addWindowInner:565 com.android.server.wm.WindowManagerService.addWindow:1842 
12-22 20:15:03.985  1423  4806 D WindowManager: updateSystemBarAttributes, bhv=1, apr=0, statusBarAprRegions=[], requestedVisibilities=-9
12-22 20:15:04.000  1423  4806 I WindowManager: Relayout Window{d2cc959 u0 com.android.systemui.wallpapers.ImageWallpaper}: viewVisibility=0 req=-1x-1 ty=2013 d1
12-22 20:15:04.002  1423  4806 I WindowManager: Relayout hash=d2cc959, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) gr=TOP START CENTER layoutInDisplayCutoutMode=always ty=WALLPAPER fmt=RGBX_8888 wanim=0x1030328
12-22 20:15:04.002  1423  4806 I WindowManager:   fl=10318
12-22 20:15:04.002  1423  4806 I WindowManager:   pfl=14
12-22 20:15:04.002  1423  4806 I WindowManager:   bhv=1
12-22 20:15:04.002  1423  4806 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:04.002  1423  4806 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:04.002  1423  4807 I WindowManager: Relayout Window{4e263fc u0 com.katsuyamaki.DroidOSLauncher}: viewVisibility=0 req=1422x1169 ty=2032 d1
12-22 20:15:04.002  1423  4807 D WindowManager: makeSurface duration=1 name=$_16182
12-22 20:15:04.004  1423  4807 I WindowManager: Relayout hash=4e263fc, pid=16182, syncId=-1: mAttrs={(0,0)(fillxfill) gr=TOP START CENTER sim={adjust=nothing} ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:04.004  1423  4807 I WindowManager:   fl=1000300
12-22 20:15:04.004  1423  4807 I WindowManager:   bhv=1
12-22 20:15:04.004  1423  4807 I WindowManager:   fitTypes=206
12-22 20:15:04.004  1423  4807 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:04.004  1423  4807 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:04.023  1423  4807 D InputDispatcher: Once focus requested (1): 4e263fc com.katsuyamaki.DroidOSLauncher
12-22 20:15:04.024  1423  4807 D InputDispatcher: Focus request (1): 4e263fc com.katsuyamaki.DroidOSLauncher but waiting because NOT_VISIBLE
12-22 20:15:04.024  1423  4807 D InputDispatcher: Focus left window (1): 9a3d1c6 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity
12-22 20:15:04.262  1423  1855 I WindowManager: Relayout Window{3d2f441 u0 com.katsuyamaki.DroidOSLauncher}: viewVisibility=8 req=63x63 ty=2032 d1
12-22 20:15:04.262  1423  1855 E WindowManager: win=Window{3d2f441 u0 com.katsuyamaki.DroidOSLauncher} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=8 caller=com.android.server.wm.WindowManagerService.tryStartExitingAnimation:134 com.android.server.wm.WindowManagerService.relayoutWindow:1147 com.android.server.wm.Session.relayout:27 android.view.IWindowSession$Stub.onTransact:829 com.android.server.wm.Session.onTransact:1 android.os.Binder.execTransactInternal:1457 android.os.Binder.execTransact:1401 
12-22 20:15:04.264  1423  1855 I WindowManager: Relayout hash=3d2f441, pid=16182, syncId=-1: mAttrs={(50,200)(wrapxwrap) gr=TOP START CENTER sim={adjust=pan} ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:04.264  1423  1855 I WindowManager:   fl=1040308
12-22 20:15:04.264  1423  1855 I WindowManager:   bhv=1
12-22 20:15:04.264  1423  1855 I WindowManager:   fitTypes=206
12-22 20:15:04.264  1423  1855 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:04.264  1423  1855 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:04.265  1423  4807 D WindowManager: finishDrawingWindow: Window{4e263fc u0 com.katsuyamaki.DroidOSLauncher} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:04.280  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(948 x 1048) immediately
12-22 20:15:04.295  1423  2229 D InputDispatcher: Focus entered window (1): 4e263fc com.katsuyamaki.DroidOSLauncher
12-22 20:15:04.340  1423  1754 I InputMethodManagerService: startInputOrWindowGainedFocusInternalLocked: Rejecting unbind in case of no editor in cover screen.
12-22 20:15:04.341  1423  1754 I InputMethodManagerService: startInputUncheckedLocked: Rejecting unbind/bind in case of no editor in cover screen.
12-22 20:15:05.117  1423  1423 D InputDispatcher: Inject motion (0/0): action=0x0, time=31064716172000, f=0x0, d=1 dsdx=1.500000 dtdx=-0.000000
12-22 20:15:05.118  1423  1695 I InputDispatcher: Delivering touch to (16182): action: 0x0, f=0x0, d=1, '4e263fc', t=1 +(0,-35)*(1.50)
12-22 20:15:05.149  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(948 x 1048) immediately
12-22 20:15:05.199  1423  1423 D InputDispatcher: Inject motion (0/0): action=0x1, time=31064803086000, f=0x0, d=1 dsdx=1.500000 dtdx=-0.000000
12-22 20:15:05.199  1423  1695 I InputDispatcher: Delivering touch to (16182): action: 0x1, f=0x0, d=1, '4e263fc', t=1 +(0,-35)*(1.50)
12-22 20:15:05.738  1423  1554 I ActivityManager: Changes in 10210 5 to 15, 144 to 0
12-22 20:15:06.218  1423  1554 I ActivityManager: Changes in 5009 5 to 6, 144 to 128
12-22 20:15:07.489  1423  1555 I ActivityManager: Changes in 10100 19 to 11, 0 to 128
12-22 20:15:07.496  1423  2697 I ActivityManager: Changes in 10100 11 to 19, 128 to 0
12-22 20:15:08.440  1423  1555 I ActivityManager: Changes in 10277 19 to 11, 0 to 128
12-22 20:15:08.516  1423  2784 I ActivityManager: Changes in 10277 11 to 19, 128 to 0
12-22 20:15:11.372  1423  1423 D InputDispatcher: Inject motion (0/0): action=0x0, time=31070961557000, f=0x0, d=1 dsdx=1.500000 dtdx=-0.000000
12-22 20:15:11.372  1423  1695 I InputDispatcher: Delivering touch to (16182): action: 0x0, f=0x0, d=1, '4e263fc', t=1 +(0,-35)*(1.50)
12-22 20:15:11.375  1423  2697 I InputMethodManagerService: isInputMethodShown: isShown=false
12-22 20:15:11.377  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(948 x 1048) immediately
12-22 20:15:11.410  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(948 x 1048) immediately
12-22 20:15:11.467  1423  1423 D InputDispatcher: Inject motion (0/0): action=0x1, time=31071070472000, f=0x0, d=1 dsdx=1.500000 dtdx=-0.000000
12-22 20:15:11.467  1423  1695 I InputDispatcher: Delivering touch to (16182): action: 0x1, f=0x0, d=1, '4e263fc', t=1 +(0,-35)*(1.50)
12-22 20:15:11.478 16182 16182 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{5c104c0 GFE...C.. ......ID 0,0-63,63}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.quadrantlauncher.FloatingLauncherService.performDisplayChange:998 
12-22 20:15:11.479 16182 16182 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{a86cb4e VFE...C.. ........ 0,0-1422,1169 aid=182}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.quadrantlauncher.FloatingLauncherService.performDisplayChange:1004 
12-22 20:15:11.503 16182 16182 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{90c9fa2 VFE...C.. ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.quadrantlauncher.FloatingLauncherService.setupBubble:551 com.example.quadrantlauncher.FloatingLauncherService.performDisplayChange:1015 
12-22 20:15:11.504 16182 16182 D ViewRootImpl: desktopMode is false
12-22 20:15:11.504 16182 16182 I ViewRootImpl: dVRR is disabled
12-22 20:15:11.535  1423  2784 D WindowManager: Changing focus from Window{4e263fc u0 com.katsuyamaki.DroidOSLauncher} to Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity} displayId=1 Callers=com.android.server.wm.WindowState.removeIfPossible:647 com.android.server.wm.Session.remove:16 android.view.IWindowSession$Stub.onTransact:804 com.android.server.wm.Session.onTransact:1 
12-22 20:15:11.535  1423  2784 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0x7f13694
12-22 20:15:11.535  1423  2784 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e, destroy=false, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9
12-22 20:15:11.535  1423  2784 I WindowManager: Reparenting to leash, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9, leashParent=Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e
12-22 20:15:11.536  1423  2784 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0xc453275
12-22 20:15:11.536  1423  2784 D WindowManager: updateSystemBarAttributes: displayId=1, focusedCanBeNavColorWin=false, win=Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity}, navColorWin=Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity}, caller=com.android.server.wm.WindowManagerService.updateFocusedWindowLocked:372 com.android.server.wm.WindowState.removeIfPossible:647 com.android.server.wm.Session.remove:16 
12-22 20:15:11.536  1423  2784 D WindowManager: updateSystemBarAttributes, bhv=1, apr=0, statusBarAprRegions=[], requestedVisibilities=-11
12-22 20:15:11.539  1423  4806 I WindowManager: Relayout Window{e3ea267 u0 com.katsuyamaki.DroidOSLauncher}: viewVisibility=0 req=63x63 ty=2032 d0
12-22 20:15:11.539  1423  4806 D WindowManager: makeSurface duration=1 name=$_16182
12-22 20:15:11.541  1423  4806 I WindowManager: Relayout hash=e3ea267, pid=16182, syncId=-1: mAttrs={(50,200)(wrapxwrap) gr=TOP START CENTER sim={adjust=pan} ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:11.541  1423  4806 I WindowManager:   fl=1040308
12-22 20:15:11.541  1423  4806 I WindowManager:   bhv=1
12-22 20:15:11.541  1423  4806 I WindowManager:   fitTypes=206
12-22 20:15:11.541  1423  4806 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:11.541  1423  4806 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:11.545  1423  1855 D InputDispatcher: Focus left window (1): 4e263fc com.katsuyamaki.DroidOSLauncher
12-22 20:15:11.551  1423  4806 D InputDispatcher: Once focus requested (1): 9a3d1c6 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity
12-22 20:15:11.551  1423  4806 D InputDispatcher: Focus entered window (1): 9a3d1c6 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity
12-22 20:15:11.555  1423  4806 I WindowManager: Relayout Window{d2cc959 u0 com.android.systemui.wallpapers.ImageWallpaper}: viewVisibility=0 req=-1x-1 ty=2013 d1
12-22 20:15:11.556  1423  4806 I WindowManager: Relayout hash=d2cc959, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) gr=TOP START CENTER layoutInDisplayCutoutMode=always ty=WALLPAPER fmt=RGBX_8888 wanim=0x1030328
12-22 20:15:11.556  1423  4806 I WindowManager:   fl=10318
12-22 20:15:11.556  1423  4806 I WindowManager:   pfl=14
12-22 20:15:11.556  1423  4806 I WindowManager:   bhv=1
12-22 20:15:11.556  1423  4806 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:11.556  1423  4806 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:11.558  1423  1754 I InputMethodManagerService: startInputOrWindowGainedFocusInternalLocked: Rejecting unbind in case of no editor in cover screen.
12-22 20:15:11.559  1423  1754 I InputMethodManagerService: startInputUncheckedLocked: Rejecting unbind/bind in case of no editor in cover screen.
12-22 20:15:11.568  1423  2784 D WindowManager: finishDrawingWindow: Window{e3ea267 u0 com.katsuyamaki.DroidOSLauncher} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:13.129  1423  1423 D InputDispatcher: Inject motion (0/0): action=0x0, time=31072712446000, f=0x0, d=1 dsdx=1.500000 dtdx=-0.000000
12-22 20:15:13.132  1423  1695 I InputDispatcher: Delivering touch to (2022): action: 0x4, f=0x0, d=1, 'a93450e', t=1 
12-22 20:15:13.132  1423  1695 I InputDispatcher: Delivering touch to (2022): action: 0x0, f=0x0, d=1, '9a3d1c6', t=1 +(0,-35)*(1.50)
12-22 20:15:13.151  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(948 x 1048) immediately
12-22 20:15:13.172  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(948 x 1048) immediately
12-22 20:15:13.183  1423  1423 D InputDispatcher: Inject motion (0/0): action=0x1, time=31072787083000, f=0x0, d=1 dsdx=1.500000 dtdx=-0.000000
12-22 20:15:13.183  1423  1695 I InputDispatcher: Delivering touch to (2022): action: 0x1, f=0x0, d=1, '9a3d1c6', t=1 +(0,-35)*(1.50)
12-22 20:15:14.064  1423  1423 D InputDispatcher: Inject key (0/0): action=0, f=0x8, d=-1, time=31073661692000
12-22 20:15:14.191  1423  1423 D InputDispatcher: Inject key (0/0): action=1, f=0x8, d=-1, time=31073792392000
12-22 20:15:14.275  1423  1423 D InputDispatcher: Inject key (0/0): action=0, f=0x8, d=-1, time=31073876336000
12-22 20:15:14.417  1423  1423 D InputDispatcher: Inject key (0/0): action=1, f=0x8, d=-1, time=31074017750000
12-22 20:15:14.594  1423  2230 D WindowManager: Transition is created, t=TransitionRecord{a356df3 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityStartController.startActivityInPackage:33 
12-22 20:15:14.603  1423  2230 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{e382cc2 u0 SubLauncherWindow}
12-22 20:15:14.603  1423  2230 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity}
12-22 20:15:14.603  1423  2230 I WindowManager: getCoverScreenRotation 0, sensor= 0, isFlat=false, isDual=false
12-22 20:15:14.606  2022  2160 D ViewRootImpl: desktopMode is false
12-22 20:15:14.606  2022  2160 I ViewRootImpl: dVRR is disabled
12-22 20:15:14.612  1423  2784 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{a876af8 u0 Splash Screen com.katsuyamaki.DroidOSLauncher}
12-22 20:15:14.617  1423  2784 D WindowManager: App launched activity=ActivityRecord{221383344 u0 com.katsuyamaki.DroidOSLauncher/com.example.quadrantlauncher.MainActivity t19239}, state=1
12-22 20:15:14.617  1423  2784 I WindowManager: getCoverScreenRotation 0, sensor= 0, isFlat=false, isDual=false
12-22 20:15:14.618  1423  2784 D InputDispatcher: Focused application(1): ActivityRecord{221383344 u0 com.katsuyamaki.DroidOSLauncher/com.example.quadrantlauncher.MainActivity t19239}
12-22 20:15:14.618  1423  2784 D WindowManager: Changing focus from Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity} to null displayId=1 Callers=com.android.server.wm.ActivityTaskManagerService.setLastResumedActivityUncheckLocked:264 com.android.server.wm.ActivityTaskSupervisor.updateTopResumedActivityIfNeeded:49 com.android.server.wm.TaskFragment.setResumedActivity:30 com.android.server.wm.ActivityRecord.setState:100 
12-22 20:15:14.619  1423  1549 I ActivityManager: updateOomAdj start time is before than pendingPid added, don't delete it
12-22 20:15:14.619  1423  4806 I WindowManager: Relayout Window{a876af8 u0 Splash Screen com.katsuyamaki.DroidOSLauncher}: viewVisibility=0 req=1422x1169 ty=3 d1
12-22 20:15:14.620  1423  4806 D WindowManager: makeSurface duration=0 name=Splash Screen com.katsuyamaki.DroidOSLauncher$_2022
12-22 20:15:14.621  1423  4806 I WindowManager: Relayout hash=a876af8, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=pan} ty=APPLICATION_STARTING fmt=TRANSLUCENT wanim=0x1030317
12-22 20:15:14.621  1423  4806 I WindowManager:   fl=81030118
12-22 20:15:14.621  1423  4806 I WindowManager:   pfl=10000010
12-22 20:15:14.621  1423  4806 I WindowManager:   bhv=1
12-22 20:15:14.621  1423  4806 I WindowManager:   fitSides=0
12-22 20:15:14.621  1423  4806 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:14.621  1423  4806 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:14.622  1423  4806 E ActivityManager: Sending non-protected broadcast com.samsung.android.app.aodservice.ACTION_COVER_HOME_QUICK_PANEL_TOUCH_AREA_CHANGED from system 2022:com.android.systemui/u0a55 pkg com.android.systemui
12-22 20:15:14.622  1423  4806 E ActivityManager: java.lang.Throwable
12-22 20:15:14.622  1423  4806 E ActivityManager: 	at com.android.server.am.BroadcastController.checkBroadcastFromSystem(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:252)
12-22 20:15:14.622  1423  4806 E ActivityManager: 	at com.android.server.am.BroadcastController.broadcastIntentLockedTraced(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:344)
12-22 20:15:14.622  1423  4806 E ActivityManager: 	at com.android.server.am.BroadcastController.broadcastIntentLocked(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:18)
12-22 20:15:14.622  1423  4806 E ActivityManager: 	at com.android.server.am.ActivityManagerService.broadcastIntentWithFeature(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:149)
12-22 20:15:14.622  1423  4806 E ActivityManager: 	at android.app.IActivityManager$Stub.onTransact$broadcastIntentWithFeature$(IActivityManager.java:12241)
12-22 20:15:14.622  1423  4806 E ActivityManager: 	at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:3154)
12-22 20:15:14.622  1423  4806 E ActivityManager: 	at com.android.server.am.ActivityManagerService.onTransact(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:425)
12-22 20:15:14.622  1423  4806 E ActivityManager: 	at android.os.Binder.execTransactInternal(Binder.java:1462)
12-22 20:15:14.622  1423  4806 E ActivityManager: 	at android.os.Binder.execTransact(Binder.java:1401)
12-22 20:15:14.622  1423  2230 D InputDispatcher: Focus left window (1): 9a3d1c6 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity
12-22 20:15:14.630  1423  1635 D InputDispatcher: Focused application(1): ActivityRecord{260071160 u0 com.android.systemui/.subscreen.SubHomeActivity t9}
12-22 20:15:14.630  1423  1635 D WindowManager: Changing focus from null to Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity} displayId=1 Callers=com.android.server.wm.ActivityTaskManagerService.setLastResumedActivityUncheckLocked:264 com.android.server.wm.ActivityTaskSupervisor.updateTopResumedActivityIfNeeded:49 com.android.server.wm.TaskFragment.setResumedActivity:30 com.android.server.wm.ActivityRecord.setState:100 
12-22 20:15:14.630  1423  1635 I WindowManager: getCoverScreenRotation 0, sensor= 0, isFlat=false, isDual=false
12-22 20:15:14.633  1423  1549 I ActivityManager: updateOomAdj start time is before than pendingPid added, don't delete it
12-22 20:15:14.633  1423  4806 I InputMethodManagerService: isInputMethodShown: isShown=false
12-22 20:15:14.636  1423  2784 D WindowManager: finishDrawingWindow: Window{a876af8 u0 Splash Screen com.katsuyamaki.DroidOSLauncher} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:14.641  1423  2784 D WindowManager: Starting window removed Window{a876af8 u0 Splash Screen com.katsuyamaki.DroidOSLauncher}
12-22 20:15:14.646  1423  2784 W WindowManager: Failed looking up window session=Session{eef2b83 2022:u0a10055} callers=com.android.server.wm.WindowManagerService.windowForClientLocked:1 com.android.server.wm.WindowManagerService.relayoutWindow:84 com.android.server.wm.Session.relayout:27 
12-22 20:15:14.647  1423  2229 D InputDispatcher: Once focus requested (1): 9a3d1c6 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity
12-22 20:15:14.647  1423  2229 D InputDispatcher: Focus request (1): 9a3d1c6 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity but waiting because NO_WINDOW
12-22 20:15:14.647  2022  2022 I WindowManager: WindowManagerGlobal#addView, ty=2005, view=android.widget.LinearLayout{43951ee V.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 android.widget.ToastPresenter.addToastView:424 android.widget.ToastPresenter.show:325 
12-22 20:15:14.647  2022  2022 D ViewRootImpl: desktopMode is false
12-22 20:15:14.647  2022  2022 I ViewRootImpl: dVRR is disabled
12-22 20:15:14.649  1423  2784 D InputDispatcher: Focus entered window (1): 9a3d1c6 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity
12-22 20:15:14.650  1423  2230 W WindowManager: Cannot find window which accessibility connection is added to
12-22 20:15:14.650  1423  2228 W WindowManager: Failed looking up window session=Session{eef2b83 2022:u0a10055} callers=com.android.server.wm.Session.remove:10 android.view.IWindowSession$Stub.onTransact:804 com.android.server.wm.Session.onTransact:1 
12-22 20:15:14.651  1423  2697 W WindowManager: Failed looking up window session=Session{eef2b83 2022:u0a10055} callers=com.android.server.wm.WindowManagerService.windowForClientLocked:1 com.android.server.wm.Session.setOnBackInvokedCallbackInfo:15 android.view.IWindowSession$Stub.onTransact:1390 
12-22 20:15:14.651  1423  2697 I WindowManager: setOnBackInvokedCallback(): No window state for package:com.android.systemui
12-22 20:15:14.653  1423  2266 I InputMethodManagerService: isInputMethodShown: isShown=false
12-22 20:15:14.653  1423  1754 I InputMethodManagerService: startInputUncheckedLocked: Rejecting unbind/bind in case of no editor in cover screen.
12-22 20:15:14.653  1423  2784 I WindowManager: Relayout Window{52cdc35 u0 Toast}: viewVisibility=0 req=343x69 ty=2005 d1
12-22 20:15:14.654  1423  2784 D WindowManager: makeSurface duration=0 name=Toast$_2022
12-22 20:15:14.654  1423  2784 I WindowManager: Relayout hash=52cdc35, pid=2022, syncId=-1: mAttrs={(0,50)(wrapxwrap) gr=BOTTOM CENTER sim={adjust=pan} ty=TOAST fmt=TRANSLUCENT wanim=0x1030004 receive insets ignoring z-order
12-22 20:15:14.654  1423  2784 I WindowManager:   fl=1000098
12-22 20:15:14.654  1423  2784 I WindowManager:   pfl=30000000
12-22 20:15:14.654  1423  2784 I WindowManager:   bhv=1
12-22 20:15:14.654  1423  2784 I WindowManager:   fitTypes=20f
12-22 20:15:14.654  1423  2784 I WindowManager:   fitIgnoreVis
12-22 20:15:14.654  1423  2784 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:14.654  1423  2784 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:14.674  1423  2228 D WindowManager: finishDrawingWindow: Window{52cdc35 u0 Toast} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:14.674  1423  2784 I WindowManager: Relayout Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity}: viewVisibility=0 req=1422x1500 ty=1 d1
12-22 20:15:14.675  1423  2784 I WindowManager: Reparenting to leash, surface=Surface(name=52cdc35 Toast)/@0x4e3ca5, leashParent=Surface(name=WindowToken{fa577c5 type=2005 android.os.Binder@10ebe3c})/@0x468487a
12-22 20:15:14.676  1423  2784 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=52cdc35 Toast)/@0x4e3ca5 - animation-leash of window_animation)/@0xed8382b
12-22 20:15:14.677  1423  2784 I WindowManager: Relayout hash=9a3d1c6, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION fmt=TRANSPARENT if=INPUT_FEATURE_DISABLE_USER_ACTIVITY userActivityTimeout=30000
12-22 20:15:14.677  1423  2784 I WindowManager:   fl=81910100
12-22 20:15:14.677  1423  2784 I WindowManager:   pfl=10008850
12-22 20:15:14.677  1423  2784 I WindowManager:   vsysui=1600000
12-22 20:15:14.677  1423  2784 I WindowManager:   bhv=1
12-22 20:15:14.677  1423  2784 I WindowManager:   fitSides=0
12-22 20:15:14.677  1423  2784 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:14.677  1423  2784 I WindowManager:   dvrrWindowFrameRateHint=true screenDimDuration=0 naviIconColor=0}
12-22 20:15:14.681  1423  2697 E ActivityManager: Sending non-protected broadcast com.samsung.android.app.aodservice.ACTION_COVER_HOME_FOCUS_CHANGED from system 2022:com.android.systemui/u0a55 pkg com.android.systemui
12-22 20:15:14.681  1423  2697 E ActivityManager: java.lang.Throwable
12-22 20:15:14.681  1423  2697 E ActivityManager: 	at com.android.server.am.BroadcastController.checkBroadcastFromSystem(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:252)
12-22 20:15:14.681  1423  2697 E ActivityManager: 	at com.android.server.am.BroadcastController.broadcastIntentLockedTraced(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:344)
12-22 20:15:14.681  1423  2697 E ActivityManager: 	at com.android.server.am.BroadcastController.broadcastIntentLocked(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:18)
12-22 20:15:14.681  1423  2697 E ActivityManager: 	at com.android.server.am.ActivityManagerService.broadcastIntentWithFeature(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:149)
12-22 20:15:14.681  1423  2697 E ActivityManager: 	at android.app.IActivityManager$Stub.onTransact$broadcastIntentWithFeature$(IActivityManager.java:12241)
12-22 20:15:14.681  1423  2697 E ActivityManager: 	at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:3154)
12-22 20:15:14.681  1423  2697 E ActivityManager: 	at com.android.server.am.ActivityManagerService.onTransact(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:425)
12-22 20:15:14.681  1423  2697 E ActivityManager: 	at android.os.Binder.execTransactInternal(Binder.java:1462)
12-22 20:15:14.681  1423  2697 E ActivityManager: 	at android.os.Binder.execTransact(Binder.java:1401)
12-22 20:15:14.682  1423  2229 E ActivityManager: Sending non-protected broadcast com.samsung.android.app.aodservice.ACTION_FLOATING_SHORTCUT_AVAILABLE_CHANGED from system 2022:com.android.systemui/u0a55 pkg com.android.systemui
12-22 20:15:14.682  1423  2229 E ActivityManager: java.lang.Throwable
12-22 20:15:14.682  1423  2229 E ActivityManager: 	at com.android.server.am.BroadcastController.checkBroadcastFromSystem(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:252)
12-22 20:15:14.682  1423  2229 E ActivityManager: 	at com.android.server.am.BroadcastController.broadcastIntentLockedTraced(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:344)
12-22 20:15:14.682  1423  2229 E ActivityManager: 	at com.android.server.am.BroadcastController.broadcastIntentLocked(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:18)
12-22 20:15:14.682  1423  2229 E ActivityManager: 	at com.android.server.am.ActivityManagerService.broadcastIntentWithFeature(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:149)
12-22 20:15:14.682  1423  2229 E ActivityManager: 	at android.app.IActivityManager$Stub.onTransact$broadcastIntentWithFeature$(IActivityManager.java:12241)
12-22 20:15:14.682  1423  2229 E ActivityManager: 	at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:3154)
12-22 20:15:14.682  1423  2229 E ActivityManager: 	at com.android.server.am.ActivityManagerService.onTransact(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:425)
12-22 20:15:14.682  1423  2229 E ActivityManager: 	at android.os.Binder.execTransactInternal(Binder.java:1462)
12-22 20:15:14.682  1423  2229 E ActivityManager: 	at android.os.Binder.execTransact(Binder.java:1401)
12-22 20:15:14.682  1423  2230 E ActivityManager: Sending non-protected broadcast com.samsung.android.app.aodservice.ACTION_COVER_HOME_QUICK_PANEL_TOUCH_AREA_CHANGED from system 2022:com.android.systemui/u0a55 pkg com.android.systemui
12-22 20:15:14.682  1423  2230 E ActivityManager: java.lang.Throwable
12-22 20:15:14.682  1423  2230 E ActivityManager: 	at com.android.server.am.BroadcastController.checkBroadcastFromSystem(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:252)
12-22 20:15:14.682  1423  2230 E ActivityManager: 	at com.android.server.am.BroadcastController.broadcastIntentLockedTraced(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:344)
12-22 20:15:14.682  1423  2230 E ActivityManager: 	at com.android.server.am.BroadcastController.broadcastIntentLocked(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:18)
12-22 20:15:14.682  1423  2230 E ActivityManager: 	at com.android.server.am.ActivityManagerService.broadcastIntentWithFeature(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:149)
12-22 20:15:14.682  1423  2230 E ActivityManager: 	at android.app.IActivityManager$Stub.onTransact$broadcastIntentWithFeature$(IActivityManager.java:12241)
12-22 20:15:14.682  1423  2230 E ActivityManager: 	at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:3154)
12-22 20:15:14.682  1423  2230 E ActivityManager: 	at com.android.server.am.ActivityManagerService.onTransact(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:425)
12-22 20:15:14.682  1423  2230 E ActivityManager: 	at android.os.Binder.execTransactInternal(Binder.java:1462)
12-22 20:15:14.682  1423  2230 E ActivityManager: 	at android.os.Binder.execTransact(Binder.java:1401)
12-22 20:15:14.768  1423  2229 D WindowManager: Remove SleepToken: tag=keyguard, displayId=0
12-22 20:15:14.769  1423  1754 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-22 20:15:14.770  1423  1754 W InputMethodManagerService: callbackImeWindowStatus: skipped topFocusedDisplayId=1, curTokenDisplayId=0
12-22 20:15:14.770  1423  1754 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-22 20:15:14.770  1423  1754 W InputMethodManagerService: callbackImeWindowStatus: skipped topFocusedDisplayId=1, curTokenDisplayId=0
12-22 20:15:14.771  1423  1855 I WindowManager: Relayout Window{b5eb294 u0 NotificationShade}: viewVisibility=0 req=1080x2520 ty=2040 d0
12-22 20:15:14.773  1423  2266 I WindowManager: Relayout Window{a93450e u0 NavigationBar1}: viewVisibility=0 req=1422x66 ty=2019 d1
12-22 20:15:14.773  1423  1855 I WindowManager: Relayout hash=b5eb294, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) gr=TOP CENTER_VERTICAL sim={adjust=pan} layoutInDisplayCutoutMode=always ty=NOTIFICATION_SHADE fmt=TRANSLUCENT
12-22 20:15:14.773  1423  1855 I WindowManager:   fl=81040048
12-22 20:15:14.773  1423  1855 I WindowManager:   pfl=10000200
12-22 20:15:14.773  1423  1855 I WindowManager:   bhv=2
12-22 20:15:14.773  1423  1855 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:14.773  1423  1855 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-22 20:15:14.773  1423  1855 I WindowManager:   sfl=40000}
12-22 20:15:14.773  1423  1855 I WindowManager: Relayout Window{6146b28 u0 NavigationBar0}: viewVisibility=0 req=1080x75 ty=2019 d0
12-22 20:15:14.774  1423  2266 I WindowManager: Relayout hash=a93450e, pid=2022, syncId=-1: mAttrs={(0,0)(fillx66) gr=BOTTOM CENTER_VERTICAL sim={adjust=pan} layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:14.774  1423  2266 I WindowManager:   fl=20040028
12-22 20:15:14.774  1423  2266 I WindowManager:   pfl=31000000
12-22 20:15:14.774  1423  2266 I WindowManager:   bhv=1
12-22 20:15:14.774  1423  2266 I WindowManager:   providedInsets:
12-22 20:15:14.774  1423  2266 I WindowManager:     InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=66}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:15:14.774  1423  2266 I WindowManager:     InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:14.774  1423  2266 I WindowManager:     InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:14.774  1423  2266 I WindowManager:     InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:14.774  1423  2266 I WindowManager:     InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:14.774  1423  2266 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:14.774  1423  2266 I WindowManager:   dvrrWindowFrameRateHint=true
12-22 20:15:14.774  1423  2266 I WindowManager:   paramsForRotation:
12-22 20:15:14.774  1423  2266 I WindowManager:     ROTATION_0={(0,0)(fillx66) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:14.774  1423  2266 I WindowManager:       fl=20040028
12-22 20:15:14.774  1423  2266 I WindowManager:       pfl=31000000
12-22 20:15:14.774  1423  2266 I WindowManager:       bhv=1
12-22 20:15:14.774  1423  2266 I WindowManager:       providedInsets:
12-22 20:15:14.774  1423  2266 I WindowManager:         InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=66}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:15:14.774  1423  2266 I WindowManager:         InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:14.774  1423  2266 I WindowManager:         InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:14.774  1423  2266 I WindowManager:         InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:14.774  1423  2266 I WindowManager:         InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:14.774  1423  2266 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:14.774  1423  2266 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:14.774  1423  2266 I WindowManager:     ROTATION_90={(0,0)(fillx66) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:14.774  1423  2266 I WindowManager:       fl=20040028
12-22 20:15:14.774  1423  2266 I WindowManager:       pfl=31000000
12-22 20:15:14.774  1423  2266 I WindowManager:       bhv=1
12-22 20:15:14.774  1423  2266 I WindowManager:       providedInsets:
12-22 20:15:14.774  1423  2266 I WindowManager:         InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=38}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=Insets{left=0, top=0, right=0, bottom=38}}]}
12-22 20:15:14.774  1423  2266 I WindowManager:         InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:14.774  1423  2266 I WindowManager:         InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:14.774  1423  2266 I WindowManager:         InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:14.774  1423  2266 I WindowManager:         InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:14.774  1423  2266 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:14.774  1423  2266 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:14.774  1423  2266 I WindowManager:     ROTATION_180={(0,0)(fillx66) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:14.774  1423  2266 I WindowManager:       fl=20040028
12-22 20:15:14.774  1423  2266 I WindowManager:       pfl=31000000
12-22 20:15:14.774  1423  2266 I WindowManager:       bhv=1
12-22 20:15:14.774  1423  2266 I WindowManager:       providedInsets:
12-22 20:15:14.774  1423  2266 I WindowManager:         InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=38}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:15:14.774  1423  2266 I WindowManager:         InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:14.774  1423  2266 I WindowManager:         InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:14.774  1423  2266 I WindowManager:         InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:14.774  1423  2266 I WindowManager:         InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:14.774  1423  2266 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:14.774  1423  2266 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:14.774  1423  2266 I WindowManager:     ROTATION_270={(0,0)(fillx66) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:14.774  1423  2266 I WindowManager:       fl=20040028
12-22 20:15:14.774  1423  2266 I WindowManager:       pfl=31000000
12-22 20:15:14.774  1423  2266 I WindowManager:       bhv=1
12-22 20:15:14.774  1423  2266 I WindowManager:       providedInsets:
12-22 20:15:14.774  1423  2266 I WindowManager:         InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=38}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=Insets{left=0, top=0, right=0, bottom=38}}]}
12-22 20:15:14.774  1423  2266 I WindowManager:         InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:14.774  1423  2266 I WindowManager:         InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:14.774  1423  2266 I WindowManager:         InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:14.774  1423  2266 I WindowManager:         InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:14.774  1423  2266 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:14.774  1423  2266 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0} naviIconColor=0}
12-22 20:15:14.775  1423  1855 I WindowManager: Relayout hash=6146b28, pid=0, syncId=-1: mAttrs={(0,0)(fillx75) gr=BOTTOM CENTER_VERTICAL sim={adjust=pan} layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:14.775  1423  1855 I WindowManager:   fl=20040028
12-22 20:15:14.775  1423  1855 I WindowManager:   pfl=31001000
12-22 20:15:14.775  1423  1855 I WindowManager:   bhv=1
12-22 20:15:14.775  1423  1855 I WindowManager:   providedInsets:
12-22 20:15:14.775  1423  1855 I WindowManager:     InsetsFrameProvider: {id=#44140001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=23}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:15:14.775  1423  1855 I WindowManager:     InsetsFrameProvider: {id=#44140006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:14.775  1423  1855 I WindowManager:     InsetsFrameProvider: {id=#44140005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:14.775  1423  1855 I WindowManager:     InsetsFrameProvider: {id=#44140004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:14.775  1423  1855 I WindowManager:     InsetsFrameProvider: {id=#44140024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:14.775  1423  1855 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:14.775  1423  1855 I WindowManager:   dvrrWindowFrameRateHint=true
12-22 20:15:14.775  1423  1855 I WindowManager:   paramsForRotation:
12-22 20:15:14.775  1423  1855 I WindowManager:     ROTATION_0={(0,0)(fillx75) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:14.775  1423  1855 I WindowManager:       fl=20040028
12-22 20:15:14.775  1423  1855 I WindowManager:       pfl=31001000
12-22 20:15:14.775  1423  1855 I WindowManager:       bhv=1
12-22 20:15:14.775  1423  1855 I WindowManager:       providedInsets:
12-22 20:15:14.775  1423  1855 I WindowManager:         InsetsFrameProvider: {id=#44140001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=23}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:15:14.775  1423  1855 I WindowManager:         InsetsFrameProvider: {id=#44140006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:14.775  1423  1855 I WindowManager:         InsetsFrameProvider: {id=#44140005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:14.775  1423  1855 I WindowManager:         InsetsFrameProvider: {id=#44140004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:14.775  1423  1855 I WindowManager:         InsetsFrameProvider: {id=#44140024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:14.775  1423  1855 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:14.775  1423  1855 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:14.775  1423  1855 I WindowManager:     ROTATION_90={(0,0)(fillx75) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:14.775  1423  1855 I WindowManager:       fl=20040028
12-22 20:15:14.775  1423  1855 I WindowManager:       pfl=31001000
12-22 20:15:14.775  1423  1855 I WindowManager:       bhv=1
12-22 20:15:14.775  1423  1855 I WindowManager:       providedInsets:
12-22 20:15:14.775  1423  1855 I WindowManager:         InsetsFrameProvider: {id=#44140001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=23}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=Insets{left=0, top=0, right=0, bottom=23}}]}
12-22 20:15:14.775  1423  1855 I WindowManager:         InsetsFrameProvider: {id=#44140006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:14.775  1423  1855 I WindowManager:         InsetsFrameProvider: {id=#44140005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:14.775  1423  1855 I WindowManager:         InsetsFrameProvider: {id=#44140004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:14.775  1423  1855 I WindowManager:         InsetsFrameProvider: {id=#44140024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:14.775  1423  1855 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:14.775  1423  1855 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:14.775  1423  1855 I WindowManager:     ROTATION_180={(0,0)(fillx75) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:14.775  1423  1855 I WindowManager:       fl=20040028
12-22 20:15:14.775  1423  1855 I WindowManager:       pfl=31001000
12-22 20:15:14.775  1423  1855 I WindowManager:       bhv=1
12-22 20:15:14.775  1423  1855 I WindowManager:       providedInsets:
12-22 20:15:14.775  1423  1855 I WindowManager:         InsetsFrameProvider: {id=#44140001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=23}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:15:14.775  1423  1855 I WindowManager:         InsetsFrameProvider: {id=#44140006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:14.775  1423  1855 I WindowManager:         InsetsFrameProvider: {id=#44140005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:14.775  1423  1855 I WindowManager:         InsetsFrameProvider: {id=#44140004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:14.775  1423  1855 I WindowManager:         InsetsFrameProvider: {id=#44140024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:14.775  1423  1855 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:14.775  1423  1855 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:14.775  1423  1855 I WindowManager:     ROTATION_270={(0,0)(fillx75) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:14.775  1423  1855 I WindowManager:       fl=20040028
12-22 20:15:14.775  1423  1855 I WindowManager:       pfl=31001000
12-22 20:15:14.775  1423  1855 I WindowManager:       bhv=1
12-22 20:15:14.775  1423  1855 I WindowManager:       providedInsets:
12-22 20:15:14.775  1423  1855 I WindowManager:         InsetsFrameProvider: {id=#44140001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=23}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=Insets{left=0, top=0, right=0, bottom=23}}]}
12-22 20:15:14.775  1423  1855 I WindowManager:         InsetsFrameProvider: {id=#44140006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:14.775  1423  1855 I WindowManager:         InsetsFrameProvider: {id=#44140005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:14.775  1423  1855 I WindowManager:         InsetsFrameProvider: {id=#44140004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:14.775  1423  1855 I WindowManager:         InsetsFrameProvider: {id=#44140024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:14.775  1423  1855 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:14.775  1423  1855 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0} naviIconColor=0}
12-22 20:15:14.778  1423  1555 I ActivityManager: Changes in 10228 19 to 11, 0 to 128
12-22 20:15:14.780  1423  1555 I ActivityManager: Changes in 10213 19 to 11, 0 to 128
12-22 20:15:14.781  1423  1855 I ActivityManager: Changes in 10228 11 to 19, 128 to 0
12-22 20:15:14.784  1423  1892 W ActivityManager: ProcessListener no registered
12-22 20:15:14.784  1423  2228 I ActivityManager: Changes in 10213 11 to 19, 128 to 0
12-22 20:15:14.785  1423  1892 W ActivityManager: ProcessListener no registered
12-22 20:15:14.785  1423  1892 W ActivityManager: ProcessListener no registered
12-22 20:15:14.802  1423  4806 I ActivityManager: Changes in 10122 10 to 5, 0 to 184
12-22 20:15:14.805  1423  2266 D WindowManager: finishDrawingWindow: Window{a93450e u0 NavigationBar1} mDrawState=HAS_DRAWN seqId=0
12-22 20:15:14.808  1423  4806 I WindowManager: Relayout Window{4ad78ec u0 Bouncer}: viewVisibility=4 req=1080x0 ty=2009 d0
12-22 20:15:14.809  1423  4806 I WindowManager: Relayout hash=4ad78ec, pid=2022, syncId=-1: mAttrs={(0,0)(fillx0) gr=TOP CENTER_VERTICAL sim={adjust=resize} layoutInDisplayCutoutMode=shortEdges ty=KEYGUARD_DIALOG fmt=TRANSLUCENT if=INPUT_FEATURE_DISABLE_USER_ACTIVITY userActivityTimeout=10000
12-22 20:15:14.809  1423  4806 I WindowManager:   fl=85000548
12-22 20:15:14.809  1423  4806 I WindowManager:   pfl=10000000
12-22 20:15:14.809  1423  4806 I WindowManager:   vsysui=500
12-22 20:15:14.809  1423  4806 I WindowManager:   bhv=2
12-22 20:15:14.809  1423  4806 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:14.809  1423  4806 I WindowManager:   dvrrWindowFrameRateHint=true
12-22 20:15:14.809  1423  4806 I WindowManager:  dimAmount=0.0 screenDimDuration=0 naviIconColor=0
12-22 20:15:14.809  1423  4806 I WindowManager:   sfl=40000}
12-22 20:15:14.810  1423  2266 I InputMethodManagerService: isInputMethodShown: isShown=false
12-22 20:15:14.840  1423  2886 I WindowManager: Relayout Window{6146b28 u0 NavigationBar0}: viewVisibility=0 req=1080x75 ty=2019 d0
12-22 20:15:14.841  1423  4807 I WindowManager: Relayout Window{5a7dcc6 u0 com.android.systemui.wallpapers.ImageWallpaper}: viewVisibility=0 req=2486x2520 ty=2013 d0
12-22 20:15:14.842  1423  4807 I WindowManager: Relayout hash=5a7dcc6, pid=2022, syncId=-1: mAttrs={(0,0)(2486x2520) gr=TOP START CENTER layoutInDisplayCutoutMode=always ty=WALLPAPER fmt=RGBX_8888 wanim=0x1030328
12-22 20:15:14.842  1423  4807 I WindowManager:   fl=14318
12-22 20:15:14.842  1423  4807 I WindowManager:   pfl=14
12-22 20:15:14.842  1423  4807 I WindowManager:   bhv=1
12-22 20:15:14.842  1423  4807 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:14.842  1423  4807 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-22 20:15:14.842  1423  4807 I WindowManager:   sfl=8}
12-22 20:15:14.842  1423  2886 I WindowManager: Relayout hash=6146b28, pid=0, syncId=-1: mAttrs={(0,0)(fillx75) gr=BOTTOM CENTER_VERTICAL sim={adjust=pan} layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:14.842  1423  2886 I WindowManager:   fl=40028
12-22 20:15:14.842  1423  2886 I WindowManager:   pfl=31001000
12-22 20:15:14.842  1423  2886 I WindowManager:   bhv=1
12-22 20:15:14.842  1423  2886 I WindowManager:   providedInsets:
12-22 20:15:14.842  1423  2886 I WindowManager:     InsetsFrameProvider: {id=#44140001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=23}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:15:14.842  1423  2886 I WindowManager:     InsetsFrameProvider: {id=#44140006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:14.842  1423  2886 I WindowManager:     InsetsFrameProvider: {id=#44140005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:14.842  1423  2886 I WindowManager:     InsetsFrameProvider: {id=#44140004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:14.842  1423  2886 I WindowManager:     InsetsFrameProvider: {id=#44140024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:14.842  1423  2886 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:14.842  1423  2886 I WindowManager:   dvrrWindowFrameRateHint=true
12-22 20:15:14.842  1423  2886 I WindowManager:   paramsForRotation:
12-22 20:15:14.842  1423  2886 I WindowManager:     ROTATION_0={(0,0)(fillx75) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:14.842  1423  2886 I WindowManager:       fl=20040028
12-22 20:15:14.842  1423  2886 I WindowManager:       pfl=31001000
12-22 20:15:14.842  1423  2886 I WindowManager:       bhv=1
12-22 20:15:14.842  1423  2886 I WindowManager:       providedInsets:
12-22 20:15:14.842  1423  2886 I WindowManager:         InsetsFrameProvider: {id=#44140001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=23}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:15:14.842  1423  2886 I WindowManager:         InsetsFrameProvider: {id=#44140006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:14.842  1423  2886 I WindowManager:         InsetsFrameProvider: {id=#44140005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:14.842  1423  2886 I WindowManager:         InsetsFrameProvider: {id=#44140004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:14.842  1423  2886 I WindowManager:         InsetsFrameProvider: {id=#44140024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:14.842  1423  2886 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:14.842  1423  2886 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:14.842  1423  2886 I WindowManager:     ROTATION_90={(0,0)(fillx75) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:14.842  1423  2886 I WindowManager:       fl=20040028
12-22 20:15:14.842  1423  2886 I WindowManager:       pfl=31001000
12-22 20:15:14.842  1423  2886 I WindowManager:       bhv=1
12-22 20:15:14.842  1423  2886 I WindowManager:       providedInsets:
12-22 20:15:14.842  1423  2886 I WindowManager:         InsetsFrameProvider: {id=#44140001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=23}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=Insets{left=0, top=0, right=0, bottom=23}}]}
12-22 20:15:14.842  1423  2886 I WindowManager:         InsetsFrameProvider: {id=#44140006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:14.842  1423  2886 I WindowManager:         InsetsFrameProvider: {id=#44140005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:14.842  1423  2886 I WindowManager:         InsetsFrameProvider: {id=#44140004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:14.842  1423  2886 I WindowManager:         InsetsFrameProvider: {id=#44140024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:14.842  1423  2886 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:14.842  1423  2886 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:14.842  1423  2886 I WindowManager:     ROTATION_180={(0,0)(fillx75) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:14.842  1423  2886 I WindowManager:       fl=20040028
12-22 20:15:14.842  1423  2886 I WindowManager:       pfl=31001000
12-22 20:15:14.842  1423  2886 I WindowManager:       bhv=1
12-22 20:15:14.842  1423  2886 I WindowManager:       providedInsets:
12-22 20:15:14.842  1423  2886 I WindowManager:         InsetsFrameProvider: {id=#44140001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=23}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:15:14.842  1423  2886 I WindowManager:         InsetsFrameProvider: {id=#44140006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:14.842  1423  2886 I WindowManager:         InsetsFrameProvider: {id=#44140005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:14.842  1423  2886 I WindowManager:         InsetsFrameProvider: {id=#44140004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:14.842  1423  2886 I WindowManager:         InsetsFrameProvider: {id=#44140024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:14.842  1423  2886 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:14.842  1423  2886 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:14.842  1423  2886 I WindowManager:     ROTATION_270={(0,0)(fillx75) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:14.842  1423  2886 I WindowManager:       fl=20040028
12-22 20:15:14.842  1423  2886 I WindowManager:       pfl=31001000
12-22 20:15:14.842  1423  2886 I WindowManager:       bhv=1
12-22 20:15:14.842  1423  2886 I WindowManager:       providedInsets:
12-22 20:15:14.842  1423  2886 I WindowManager:         InsetsFrameProvider: {id=#44140001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=23}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=Insets{left=0, top=0, right=0, bottom=23}}]}
12-22 20:15:14.842  1423  2886 I WindowManager:         InsetsFrameProvider: {id=#44140006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:14.842  1423  2886 I WindowManager:         InsetsFrameProvider: {id=#44140005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:14.842  1423  2886 I WindowManager:         InsetsFrameProvider: {id=#44140004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:14.842  1423  2886 I WindowManager:         InsetsFrameProvider: {id=#44140024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:14.842  1423  2886 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:14.842  1423  2886 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0} naviIconColor=0}
12-22 20:15:14.845  1423  2697 D WindowManager: finishDrawingWindow: Window{5a7dcc6 u0 com.android.systemui.wallpapers.ImageWallpaper} mDrawState=HAS_DRAWN seqId=2147483647
12-22 20:15:14.849  1423  2230 I WindowManager: Relayout Window{b5eb294 u0 NotificationShade}: viewVisibility=4 req=1080x2520 ty=2040 d0
12-22 20:15:14.849  1423  2230 E WindowManager: win=Window{b5eb294 u0 NotificationShade} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=4 caller=com.android.server.wm.WindowManagerService.tryStartExitingAnimation:134 com.android.server.wm.WindowManagerService.relayoutWindow:1147 com.android.server.wm.Session.relayout:27 android.view.IWindowSession$Stub.onTransact:829 com.android.server.wm.Session.onTransact:1 android.os.Binder.execTransactInternal:1462 android.os.Binder.execTransact:1401 
12-22 20:15:14.850  1423  2230 I WindowManager: Relayout hash=b5eb294, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) gr=TOP CENTER_VERTICAL sim={adjust=pan} layoutInDisplayCutoutMode=always ty=NOTIFICATION_SHADE fmt=TRANSLUCENT
12-22 20:15:14.850  1423  2230 I WindowManager:   fl=81040048
12-22 20:15:14.850  1423  2230 I WindowManager:   pfl=11000200
12-22 20:15:14.850  1423  2230 I WindowManager:   bhv=2
12-22 20:15:14.850  1423  2230 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:14.850  1423  2230 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-22 20:15:14.850  1423  2230 I WindowManager:   sfl=40000}
12-22 20:15:15.179  1423  1550 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{fa577c5 type=2005 android.os.Binder@10ebe3c})/@0x468487a, destroy=true, surface=Surface(name=52cdc35 Toast)/@0x4e3ca5
12-22 20:15:16.714  1423  1423 D InputDispatcher: Inject motion (0/0): action=0x0, time=31076307148000, f=0x0, d=1 dsdx=1.500000 dtdx=-0.000000
12-22 20:15:16.716  1423  1695 I InputDispatcher: Delivering touch to (2022): action: 0x4, f=0x0, d=1, 'a93450e', t=1 
12-22 20:15:16.716  1423  1695 I InputDispatcher: Delivering touch to (2022): action: 0x0, f=0x0, d=1, '9a3d1c6', t=1 +(0,-35)*(1.50)
12-22 20:15:16.729  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(948 x 1048) immediately
12-22 20:15:16.746  1423  1855 E ActivityManager: Sending non-protected broadcast com.samsung.android.app.aodservice.ACTION_COVER_HOME_QUICK_PANEL_TOUCH_AREA_CHANGED from system 2022:com.android.systemui/u0a55 pkg com.android.systemui
12-22 20:15:16.746  1423  1855 E ActivityManager: java.lang.Throwable
12-22 20:15:16.746  1423  1855 E ActivityManager: 	at com.android.server.am.BroadcastController.checkBroadcastFromSystem(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:252)
12-22 20:15:16.746  1423  1855 E ActivityManager: 	at com.android.server.am.BroadcastController.broadcastIntentLockedTraced(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:344)
12-22 20:15:16.746  1423  1855 E ActivityManager: 	at com.android.server.am.BroadcastController.broadcastIntentLocked(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:18)
12-22 20:15:16.746  1423  1855 E ActivityManager: 	at com.android.server.am.ActivityManagerService.broadcastIntentWithFeature(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:149)
12-22 20:15:16.746  1423  1855 E ActivityManager: 	at android.app.IActivityManager$Stub.onTransact$broadcastIntentWithFeature$(IActivityManager.java:12241)
12-22 20:15:16.746  1423  1855 E ActivityManager: 	at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:3154)
12-22 20:15:16.746  1423  1855 E ActivityManager: 	at com.android.server.am.ActivityManagerService.onTransact(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:425)
12-22 20:15:16.746  1423  1855 E ActivityManager: 	at android.os.Binder.execTransactInternal(Binder.java:1462)
12-22 20:15:16.746  1423  1855 E ActivityManager: 	at android.os.Binder.execTransact(Binder.java:1401)
12-22 20:15:16.758  1423  1855 I WindowManager: Relayout Window{e382cc2 u0 SubLauncherWindow}: viewVisibility=0 req=1422x1500 ty=1000 d1
12-22 20:15:16.759  1423  1855 D WindowManager: Changing focus from Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity} to Window{e382cc2 u0 SubLauncherWindow} displayId=1 Callers=com.android.server.wm.WindowManagerService.relayoutWindow:1359 com.android.server.wm.Session.relayout:27 android.view.IWindowSession$Stub.onTransact:829 com.android.server.wm.Session.onTransact:1 
12-22 20:15:16.759  1423  1855 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0xc453275
12-22 20:15:16.759  1423  1855 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e, destroy=false, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9
12-22 20:15:16.759  1423  1855 I WindowManager: Reparenting to leash, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9, leashParent=Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e
12-22 20:15:16.759  1423  1855 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0x5ec8430
12-22 20:15:16.760  1423  1855 I WindowManager: Relayout hash=e382cc2, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize} layoutInDisplayCutoutMode=always ty=APPLICATION_PANEL fmt=TRANSLUCENT if=INPUT_FEATURE_DISABLE_USER_ACTIVITY
12-22 20:15:16.760  1423  1855 I WindowManager:   fl=80080260
12-22 20:15:16.760  1423  1855 I WindowManager:   vsysui=1600400
12-22 20:15:16.760  1423  1855 I WindowManager:   bhv=1
12-22 20:15:16.760  1423  1855 I WindowManager:   fitTypes=206
12-22 20:15:16.760  1423  1855 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:16.760  1423  1855 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:16.765  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(948 x 1048) immediately
12-22 20:15:16.783  1423  1855 D InputDispatcher: Once focus requested (1): e382cc2 SubLauncherWindow
12-22 20:15:16.783  1423  1855 D InputDispatcher: Focus left window (1): 9a3d1c6 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity
12-22 20:15:16.783  1423  1855 D InputDispatcher: Focus entered window (1): e382cc2 SubLauncherWindow
12-22 20:15:16.800  1423  1754 I InputMethodManagerService: startInputOrWindowGainedFocusInternalLocked: Rejecting unbind in case of no editor in cover screen.
12-22 20:15:16.800  1423  1754 I InputMethodManagerService: startInputUncheckedLocked: Rejecting unbind/bind in case of no editor in cover screen.
12-22 20:15:16.832  1423  1423 D InputDispatcher: Inject motion (0/0): action=0x1, time=31076436227000, f=0x0, d=1 dsdx=1.500000 dtdx=-0.000000
12-22 20:15:16.833  1423  1695 I InputDispatcher: Delivering touch to (2022): action: 0x1, f=0x0, d=1, '9a3d1c6', t=1 +(0,-35)*(1.50)
12-22 20:15:16.839  1423  2886 I ActivityManager: Changes in 5009 6 to 5, 128 to 144
12-22 20:15:16.845  1423  2886 E ActivityManager: Sending non-protected broadcast com.samsung.android.app.aodservice.ACTION_COVER_HOME_FOCUS_CHANGED from system 2022:com.android.systemui/u0a55 pkg com.android.systemui
12-22 20:15:16.845  1423  2886 E ActivityManager: java.lang.Throwable
12-22 20:15:16.845  1423  2886 E ActivityManager: 	at com.android.server.am.BroadcastController.checkBroadcastFromSystem(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:252)
12-22 20:15:16.845  1423  2886 E ActivityManager: 	at com.android.server.am.BroadcastController.broadcastIntentLockedTraced(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:344)
12-22 20:15:16.845  1423  2886 E ActivityManager: 	at com.android.server.am.BroadcastController.broadcastIntentLocked(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:18)
12-22 20:15:16.845  1423  2886 E ActivityManager: 	at com.android.server.am.ActivityManagerService.broadcastIntentWithFeature(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:149)
12-22 20:15:16.845  1423  2886 E ActivityManager: 	at android.app.IActivityManager$Stub.onTransact$broadcastIntentWithFeature$(IActivityManager.java:12241)
12-22 20:15:16.845  1423  2886 E ActivityManager: 	at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:3154)
12-22 20:15:16.845  1423  2886 E ActivityManager: 	at com.android.server.am.ActivityManagerService.onTransact(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:425)
12-22 20:15:16.845  1423  2886 E ActivityManager: 	at android.os.Binder.execTransactInternal(Binder.java:1462)
12-22 20:15:16.845  1423  2886 E ActivityManager: 	at android.os.Binder.execTransact(Binder.java:1401)
12-22 20:15:16.846  1423  4806 E ActivityManager: Sending non-protected broadcast com.samsung.android.app.aodservice.ACTION_FLOATING_SHORTCUT_AVAILABLE_CHANGED from system 2022:com.android.systemui/u0a55 pkg com.android.systemui
12-22 20:15:16.846  1423  4806 E ActivityManager: java.lang.Throwable
12-22 20:15:16.846  1423  4806 E ActivityManager: 	at com.android.server.am.BroadcastController.checkBroadcastFromSystem(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:252)
12-22 20:15:16.846  1423  4806 E ActivityManager: 	at com.android.server.am.BroadcastController.broadcastIntentLockedTraced(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:344)
12-22 20:15:16.846  1423  4806 E ActivityManager: 	at com.android.server.am.BroadcastController.broadcastIntentLocked(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:18)
12-22 20:15:16.846  1423  4806 E ActivityManager: 	at com.android.server.am.ActivityManagerService.broadcastIntentWithFeature(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:149)
12-22 20:15:16.846  1423  4806 E ActivityManager: 	at android.app.IActivityManager$Stub.onTransact$broadcastIntentWithFeature$(IActivityManager.java:12241)
12-22 20:15:16.846  1423  4806 E ActivityManager: 	at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:3154)
12-22 20:15:16.846  1423  4806 E ActivityManager: 	at com.android.server.am.ActivityManagerService.onTransact(qb/103888019 03a5a67e5cf815856c8cb02a780996d8495d88e5abfc1f4625d73e5d10674898:425)
12-22 20:15:16.846  1423  4806 E ActivityManager: 	at android.os.Binder.execTransactInternal(Binder.java:1462)
12-22 20:15:16.846  1423  4806 E ActivityManager: 	at android.os.Binder.execTransact(Binder.java:1401)
12-22 20:15:16.967  2022  2022 I WindowManager: WindowManagerGlobal#removeView, ty=2005, view=android.widget.LinearLayout{43951ee V.E...... ........ 0,0-343,69}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeViewImmediate:216 android.widget.ToastPresenter.hide:348 
12-22 20:15:16.974  1423  2886 I WindowManager: Reparenting to leash, surface=Surface(name=52cdc35 Toast)/@0x4e3ca5, leashParent=Surface(name=WindowToken{fa577c5 type=2005 android.os.Binder@10ebe3c})/@0x468487a
12-22 20:15:16.974  1423  2886 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=52cdc35 Toast)/@0x4e3ca5 - animation-leash of window_animation)/@0x6e4b7c7
12-22 20:15:16.979  1423  1754 I InputMethodManagerService: startInputUncheckedLocked: Rejecting unbind/bind in case of no editor in cover screen.
12-22 20:15:17.153  1423  2886 D WindowManager: updateSystemBarAttributes: displayId=1, focusedCanBeNavColorWin=false, win=Window{e382cc2 u0 SubLauncherWindow}, navColorWin=Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity}, caller=com.android.server.wm.InsetsStateController.onRequestedVisibleTypesChanged:86 com.android.server.wm.InsetsPolicy.onRequestedVisibleTypesChanged:3 com.android.server.wm.Session.updateRequestedVisibleTypes:37 
12-22 20:15:17.153  1423  2886 D WindowManager: updateSystemBarAttributes, bhv=1, apr=0, statusBarAprRegions=[], requestedVisibilities=-9
12-22 20:15:17.158  1423  2229 I WindowManager: Relayout Window{e382cc2 u0 SubLauncherWindow}: viewVisibility=0 req=1422x1500 ty=1000 d1
12-22 20:15:17.162  1423  2229 I WindowManager: Relayout hash=e382cc2, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize} layoutInDisplayCutoutMode=always ty=APPLICATION_PANEL fmt=TRANSLUCENT if=INPUT_FEATURE_DISABLE_USER_ACTIVITY
12-22 20:15:17.162  1423  2229 I WindowManager:   fl=80080260
12-22 20:15:17.162  1423  2229 I WindowManager:   vsysui=400
12-22 20:15:17.162  1423  2229 I WindowManager:   bhv=1
12-22 20:15:17.162  1423  2229 I WindowManager:   fitTypes=206
12-22 20:15:17.162  1423  2229 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:17.162  1423  2229 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:17.165  1423  4807 I WindowManager: Relayout Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity}: viewVisibility=0 req=1422x1500 ty=1 d1
12-22 20:15:17.166  1423  4807 I WindowManager: Relayout hash=9a3d1c6, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION fmt=TRANSPARENT if=INPUT_FEATURE_DISABLE_USER_ACTIVITY userActivityTimeout=30000
12-22 20:15:17.166  1423  4807 I WindowManager:   fl=81910100
12-22 20:15:17.166  1423  4807 I WindowManager:   pfl=10008850
12-22 20:15:17.166  1423  4807 I WindowManager:   bhv=1
12-22 20:15:17.166  1423  4807 I WindowManager:   fitSides=0
12-22 20:15:17.166  1423  4807 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:17.166  1423  4807 I WindowManager:   dvrrWindowFrameRateHint=true screenDimDuration=0 naviIconColor=0}
12-22 20:15:17.169  1423  4807 I WindowManager: Relayout Window{d2cc959 u0 com.android.systemui.wallpapers.ImageWallpaper}: viewVisibility=0 req=-1x-1 ty=2013 d1
12-22 20:15:17.171  1423  4807 I WindowManager: Relayout hash=d2cc959, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) gr=TOP START CENTER layoutInDisplayCutoutMode=always ty=WALLPAPER fmt=RGBX_8888 wanim=0x1030328
12-22 20:15:17.171  1423  4807 I WindowManager:   fl=10318
12-22 20:15:17.171  1423  4807 I WindowManager:   pfl=14
12-22 20:15:17.171  1423  4807 I WindowManager:   bhv=1
12-22 20:15:17.171  1423  4807 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:17.171  1423  4807 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:17.173  1423  4807 I WindowManager: Relayout Window{a93450e u0 NavigationBar1}: viewVisibility=0 req=1422x66 ty=2019 d1
12-22 20:15:17.176  1423  4807 I WindowManager: Relayout hash=a93450e, pid=2022, syncId=-1: mAttrs={(0,0)(fillx66) gr=BOTTOM CENTER_VERTICAL sim={adjust=pan} layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:17.176  1423  4807 I WindowManager:   fl=40028
12-22 20:15:17.176  1423  4807 I WindowManager:   pfl=31000000
12-22 20:15:17.176  1423  4807 I WindowManager:   bhv=1
12-22 20:15:17.176  1423  4807 I WindowManager:   providedInsets:
12-22 20:15:17.176  1423  4807 I WindowManager:     InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=66}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:15:17.176  1423  4807 I WindowManager:     InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:17.176  1423  4807 I WindowManager:     InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:17.176  1423  4807 I WindowManager:     InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:17.176  1423  4807 I WindowManager:     InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:17.176  1423  4807 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:17.176  1423  4807 I WindowManager:   dvrrWindowFrameRateHint=true
12-22 20:15:17.176  1423  4807 I WindowManager:   paramsForRotation:
12-22 20:15:17.176  1423  4807 I WindowManager:     ROTATION_0={(0,0)(fillx66) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:17.176  1423  4807 I WindowManager:       fl=20040028
12-22 20:15:17.176  1423  4807 I WindowManager:       pfl=31000000
12-22 20:15:17.176  1423  4807 I WindowManager:       bhv=1
12-22 20:15:17.176  1423  4807 I WindowManager:       providedInsets:
12-22 20:15:17.176  1423  4807 I WindowManager:         InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=66}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:15:17.176  1423  4807 I WindowManager:         InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:17.176  1423  4807 I WindowManager:         InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:17.176  1423  4807 I WindowManager:         InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:17.176  1423  4807 I WindowManager:         InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:17.176  1423  4807 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:17.176  1423  4807 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:17.176  1423  4807 I WindowManager:     ROTATION_90={(0,0)(fillx66) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:17.176  1423  4807 I WindowManager:       fl=20040028
12-22 20:15:17.176  1423  4807 I WindowManager:       pfl=31000000
12-22 20:15:17.176  1423  4807 I WindowManager:       bhv=1
12-22 20:15:17.176  1423  4807 I WindowManager:       providedInsets:
12-22 20:15:17.176  1423  4807 I WindowManager:         InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=38}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=Insets{left=0, top=0, right=0, bottom=38}}]}
12-22 20:15:17.176  1423  4807 I WindowManager:         InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:17.176  1423  4807 I WindowManager:         InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:17.176  1423  4807 I WindowManager:         InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:17.176  1423  4807 I WindowManager:         InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:17.176  1423  4807 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:17.176  1423  4807 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:17.176  1423  4807 I WindowManager:     ROTATION_180={(0,0)(fillx66) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:17.176  1423  4807 I WindowManager:       fl=20040028
12-22 20:15:17.176  1423  4807 I WindowManager:       pfl=31000000
12-22 20:15:17.176  1423  4807 I WindowManager:       bhv=1
12-22 20:15:17.176  1423  4807 I WindowManager:       providedInsets:
12-22 20:15:17.176  1423  4807 I WindowManager:         InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=38}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=null}]}
12-22 20:15:17.176  1423  4807 I WindowManager:         InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:17.176  1423  4807 I WindowManager:         InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:17.176  1423  4807 I WindowManager:         InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:17.176  1423  4807 I WindowManager:         InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:17.176  1423  4807 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:17.176  1423  4807 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:17.176  1423  4807 I WindowManager:     ROTATION_270={(0,0)(fillx66) gr=BOTTOM CENTER_VERTICAL layoutInDisplayCutoutMode=always ty=NAVIGATION_BAR fmt=TRANSLUCENT
12-22 20:15:17.176  1423  4807 I WindowManager:       fl=20040028
12-22 20:15:17.176  1423  4807 I WindowManager:       pfl=31000000
12-22 20:15:17.176  1423  4807 I WindowManager:       bhv=1
12-22 20:15:17.176  1423  4807 I WindowManager:       providedInsets:
12-22 20:15:17.176  1423  4807 I WindowManager:         InsetsFrameProvider: {id=#e0c00001, index=0, type=navigationBars, source=FRAME, flags=[SUPPRESS_SCRIM], insetsSize=Insets{left=0, top=0, right=0, bottom=38}, insetsSizeOverrides=[TypedInsetsSize: {windowType=INPUT_METHOD, insetsSize=Insets{left=0, top=0, right=0, bottom=38}}]}
12-22 20:15:17.176  1423  4807 I WindowManager:         InsetsFrameProvider: {id=#e0c00006, index=0, type=tappableElement, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=0}}
12-22 20:15:17.176  1423  4807 I WindowManager:         InsetsFrameProvider: {id=#e0c00005, index=0, type=mandatorySystemGestures, source=FRAME, flags=[], insetsSize=Insets{left=0, top=0, right=0, bottom=50}}
12-22 20:15:17.176  1423  4807 I WindowManager:         InsetsFrameProvider: {id=#e0c00004, index=0, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=46, top=0, right=0, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=46, top=0, right=0, bottom=0}}
12-22 20:15:17.176  1423  4807 I WindowManager:         InsetsFrameProvider: {id=#e0c00024, index=1, type=systemGestures, source=DISPLAY, flags=[], insetsSize=Insets{left=0, top=0, right=46, bottom=0}, mMinimalInsetsSizeInDisplayCutoutSafe=Insets{left=0, top=0, right=46, bottom=0}}
12-22 20:15:17.176  1423  4807 I WindowManager:       frameRateBoostOnTouch=true
12-22 20:15:17.176  1423  4807 I WindowManager:       dvrrWindowFrameRateHint=true naviIconColor=0} naviIconColor=0}
12-22 20:15:17.356  1423  1555 I ActivityManager: Changes in 10100 19 to 11, 0 to 128
12-22 20:15:17.359  1423  2230 I ActivityManager: Changes in 10100 11 to 19, 128 to 0
12-22 20:15:17.480  1423  1550 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{fa577c5 type=2005 android.os.Binder@10ebe3c})/@0x468487a, destroy=true, surface=Surface(name=52cdc35 Toast)/@0x4e3ca5
12-22 20:15:18.652  1423  1549 W WindowManager: Unable to start animation, surface is null or no children.
12-22 20:15:19.831  1423  1423 D InputDispatcher: Inject motion (0/0): action=0x0, time=31079433407000, f=0x0, d=1 dsdx=1.500000 dtdx=-0.000000
12-22 20:15:19.831  1423  1695 I InputDispatcher: Delivering touch to (2022): action: 0x4, f=0x0, d=1, 'a93450e', t=1 
12-22 20:15:19.831  1423  1695 I InputDispatcher: Delivering touch to (2022): action: 0x0, f=0x0, d=1, 'e382cc2', t=1 +(0,-35)*(1.50)
12-22 20:15:19.916  1423  1423 D InputDispatcher: Inject motion (0/0): action=0x1, time=31079519891000, f=0x0, d=1 dsdx=1.500000 dtdx=-0.000000
12-22 20:15:19.916  1423  1695 I InputDispatcher: Delivering touch to (2022): action: 0x1, f=0x0, d=1, 'e382cc2', t=1 +(0,-35)*(1.50)
12-22 20:15:20.005  1423  4807 D WindowManager: Transition is created, t=TransitionRecord{aa0f543 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-22 20:15:20.013  2022  2160 D ViewRootImpl: desktopMode is false
12-22 20:15:20.014  2022  2160 I ViewRootImpl: dVRR is disabled
12-22 20:15:20.014  1423  4807 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{e382cc2 u0 SubLauncherWindow}
12-22 20:15:20.014  1423  4807 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity}
12-22 20:15:20.016  1423  4807 I WindowManager: getCoverScreenRotation 0, sensor= 0, isFlat=false, isDual=false
12-22 20:15:20.021  1423  2886 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{b0c97ab u0 Splash Screen com.katsuyamaki.DroidOSLauncher}
12-22 20:15:20.023  1423  1855 I ActivityManager: Changes in 10333 19 to 6, 0 to 128
12-22 20:15:20.024  1423  2229 I WindowManager: getCoverScreenRotation 0, sensor= 0, isFlat=false, isDual=false
12-22 20:15:20.026  1423  2229 D InputDispatcher: Focused application(1): ActivityRecord{102041536 u0 com.katsuyamaki.DroidOSLauncher/com.example.quadrantlauncher.MainActivity t19240}
12-22 20:15:20.026  1423  2229 D WindowManager: Changing focus from Window{e382cc2 u0 SubLauncherWindow} to null displayId=1 Callers=com.android.server.wm.ActivityTaskManagerService.setLastResumedActivityUncheckLocked:264 com.android.server.wm.ActivityTaskSupervisor.updateTopResumedActivityIfNeeded:49 com.android.server.wm.TaskFragment.setResumedActivity:30 com.android.server.wm.ActivityRecord.setState:100 
12-22 20:15:20.026  1423  2229 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0x5ec8430
12-22 20:15:20.026  1423  2229 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e, destroy=false, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9
12-22 20:15:20.026  1423  2229 I WindowManager: Reparenting to leash, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9, leashParent=Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e
12-22 20:15:20.026  1423  2229 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0xa7fca52
12-22 20:15:20.029  1423  2697 I WindowManager: Relayout Window{b0c97ab u0 Splash Screen com.katsuyamaki.DroidOSLauncher}: viewVisibility=0 req=1422x1169 ty=3 d1
12-22 20:15:20.030  1423  2697 D WindowManager: makeSurface duration=0 name=Splash Screen com.katsuyamaki.DroidOSLauncher$_2022
12-22 20:15:20.031  1423  2697 I WindowManager: Relayout hash=b0c97ab, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=pan} ty=APPLICATION_STARTING fmt=TRANSLUCENT wanim=0x1030317
12-22 20:15:20.031  1423  2697 I WindowManager:   fl=81030118
12-22 20:15:20.031  1423  2697 I WindowManager:   pfl=10000010
12-22 20:15:20.031  1423  2697 I WindowManager:   bhv=1
12-22 20:15:20.031  1423  2697 I WindowManager:   fitSides=0
12-22 20:15:20.031  1423  2697 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:20.031  1423  2697 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:20.032  1423  2229 D InputDispatcher: Focus left window (1): e382cc2 SubLauncherWindow
12-22 20:15:20.037  1423  2784 D InputDispatcher: Focused application(1): ActivityRecord{260071160 u0 com.android.systemui/.subscreen.SubHomeActivity t9}
12-22 20:15:20.037  1423  2784 D WindowManager: Changing focus from null to Window{e382cc2 u0 SubLauncherWindow} displayId=1 Callers=com.android.server.wm.ActivityTaskManagerService.setLastResumedActivityUncheckLocked:264 com.android.server.wm.ActivityTaskSupervisor.updateTopResumedActivityIfNeeded:49 com.android.server.wm.TaskFragment.setResumedActivity:30 com.android.server.wm.ActivityRecord.setState:100 
12-22 20:15:20.037  1423  2784 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0xa7fca52
12-22 20:15:20.037  1423  2784 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e, destroy=false, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9
12-22 20:15:20.037  1423  2784 I WindowManager: Reparenting to leash, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9, leashParent=Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e
12-22 20:15:20.038  1423  2784 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0xabeec95
12-22 20:15:20.038  1423  2784 I WindowManager: getCoverScreenRotation 0, sensor= 0, isFlat=false, isDual=false
12-22 20:15:20.040  1423  4806 D WindowManager: finishDrawingWindow: Window{b0c97ab u0 Splash Screen com.katsuyamaki.DroidOSLauncher} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:20.041  2022  2022 I WindowManager: WindowManagerGlobal#addView, ty=2005, view=android.widget.LinearLayout{7acabe3 V.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 android.widget.ToastPresenter.addToastView:424 android.widget.ToastPresenter.show:325 
12-22 20:15:20.041  2022  2022 D ViewRootImpl: desktopMode is false
12-22 20:15:20.041  2022  2022 I ViewRootImpl: dVRR is disabled
12-22 20:15:20.048  1423  4807 I WindowManager: Relayout Window{745dc77 u0 Toast}: viewVisibility=0 req=343x69 ty=2005 d1
12-22 20:15:20.048  1423  4807 D WindowManager: makeSurface duration=0 name=Toast$_2022
12-22 20:15:20.049  1423  4807 I WindowManager: Relayout hash=745dc77, pid=2022, syncId=-1: mAttrs={(0,50)(wrapxwrap) gr=BOTTOM CENTER sim={adjust=pan} ty=TOAST fmt=TRANSLUCENT wanim=0x1030004 receive insets ignoring z-order
12-22 20:15:20.049  1423  4807 I WindowManager:   fl=1000098
12-22 20:15:20.049  1423  4807 I WindowManager:   pfl=30000000
12-22 20:15:20.049  1423  4807 I WindowManager:   bhv=1
12-22 20:15:20.049  1423  4807 I WindowManager:   fitTypes=20f
12-22 20:15:20.049  1423  4807 I WindowManager:   fitIgnoreVis
12-22 20:15:20.049  1423  4807 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:20.049  1423  4807 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:20.053  1423  1635 D WindowManager: Starting window removed Window{b0c97ab u0 Splash Screen com.katsuyamaki.DroidOSLauncher}
12-22 20:15:20.055  1423  4807 W WindowManager: Failed looking up window session=Session{eef2b83 2022:u0a10055} callers=com.android.server.wm.WindowManagerService.windowForClientLocked:1 com.android.server.wm.WindowManagerService.relayoutWindow:84 com.android.server.wm.Session.relayout:27 
12-22 20:15:20.057  1423  2784 D InputDispatcher: Once focus requested (1): e382cc2 SubLauncherWindow
12-22 20:15:20.057  1423  2784 D InputDispatcher: Focus request (1): e382cc2 SubLauncherWindow but waiting because NO_WINDOW
12-22 20:15:20.057  1423  1635 D InputDispatcher: Focus entered window (1): e382cc2 SubLauncherWindow
12-22 20:15:20.058  1423  2784 W WindowManager: Failed looking up window session=Session{eef2b83 2022:u0a10055} callers=com.android.server.wm.WindowManagerService.windowForClientLocked:1 com.android.server.wm.Session.setOnBackInvokedCallbackInfo:15 android.view.IWindowSession$Stub.onTransact:1390 
12-22 20:15:20.058  1423  2784 I WindowManager: setOnBackInvokedCallback(): No window state for package:com.android.systemui
12-22 20:15:20.058  1423  4807 W WindowManager: Cannot find window which accessibility connection is added to
12-22 20:15:20.058  1423  2784 W WindowManager: Failed looking up window session=Session{eef2b83 2022:u0a10055} callers=com.android.server.wm.Session.remove:10 android.view.IWindowSession$Stub.onTransact:804 com.android.server.wm.Session.onTransact:1 
12-22 20:15:20.070  1423  4807 D WindowManager: finishDrawingWindow: Window{745dc77 u0 Toast} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:20.070  1423  1550 I WindowManager: Reparenting to leash, surface=Surface(name=745dc77 Toast)/@0xd680c81, leashParent=Surface(name=WindowToken{82c399e type=2005 android.os.Binder@5fc6bd9})/@0x5e2d126
12-22 20:15:20.070  1423  1550 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=745dc77 Toast)/@0xd680c81 - animation-leash of window_animation)/@0x6b0d167
12-22 20:15:20.072  1423  4807 I WindowManager: Relayout Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity}: viewVisibility=0 req=1422x1500 ty=1 d1
12-22 20:15:20.072  1423  4807 I WindowManager: Relayout hash=9a3d1c6, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize forwardNavigation} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION fmt=TRANSPARENT if=INPUT_FEATURE_DISABLE_USER_ACTIVITY userActivityTimeout=30000
12-22 20:15:20.072  1423  4807 I WindowManager:   fl=81910100
12-22 20:15:20.072  1423  4807 I WindowManager:   pfl=10008850
12-22 20:15:20.072  1423  4807 I WindowManager:   bhv=1
12-22 20:15:20.072  1423  4807 I WindowManager:   fitSides=0
12-22 20:15:20.072  1423  4807 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:20.072  1423  4807 I WindowManager:   dvrrWindowFrameRateHint=true screenDimDuration=0 naviIconColor=0}
12-22 20:15:20.075  1423  1754 I InputMethodManagerService: startInputUncheckedLocked: Rejecting unbind/bind in case of no editor in cover screen.
12-22 20:15:20.580  1423  1550 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{82c399e type=2005 android.os.Binder@5fc6bd9})/@0x5e2d126, destroy=true, surface=Surface(name=745dc77 Toast)/@0xd680c81
12-22 20:15:20.708  1423  1423 D InputDispatcher: Inject motion (0/0): action=0x0, time=31080310883000, f=0x0, d=1 dsdx=1.500000 dtdx=-0.000000
12-22 20:15:20.709  1423  1695 I InputDispatcher: Delivering touch to (2022): action: 0x4, f=0x0, d=1, 'a93450e', t=1 
12-22 20:15:20.709  1423  1695 I InputDispatcher: Delivering touch to (2022): action: 0x0, f=0x0, d=1, 'e382cc2', t=1 +(0,-35)*(1.50)
12-22 20:15:20.792  1423  1423 D InputDispatcher: Inject motion (0/0): action=0x1, time=31080395234000, f=0x0, d=1 dsdx=1.500000 dtdx=-0.000000
12-22 20:15:20.792  1423  1695 I InputDispatcher: Delivering touch to (2022): action: 0x1, f=0x0, d=1, 'e382cc2', t=1 +(0,-35)*(1.50)
12-22 20:15:20.888  1423  2266 D WindowManager: Transition is created, t=TransitionRecord{84d297b id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-22 20:15:20.900  1423  2266 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{e382cc2 u0 SubLauncherWindow}
12-22 20:15:20.900  1423  2266 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity}
12-22 20:15:20.901  1423  2266 I WindowManager: getCoverScreenRotation 0, sensor= 0, isFlat=false, isDual=false
12-22 20:15:20.902  2022  2160 D ViewRootImpl: desktopMode is false
12-22 20:15:20.902  2022  2160 I ViewRootImpl: dVRR is disabled
12-22 20:15:20.905  1423  1635 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{aa1da86 u0 Splash Screen com.katsuyamaki.DroidOSTrackpadKeyboard}
12-22 20:15:20.913  1423  2228 I WindowManager: getCoverScreenRotation 0, sensor= 0, isFlat=false, isDual=false
12-22 20:15:20.915  1423  2228 D InputDispatcher: Focused application(1): ActivityRecord{195056536 u0 com.katsuyamaki.DroidOSTrackpadKeyboard/com.example.coverscreentester.MainActivity t19241}
12-22 20:15:20.915  1423  2228 D WindowManager: Changing focus from Window{e382cc2 u0 SubLauncherWindow} to null displayId=1 Callers=com.android.server.wm.ActivityTaskManagerService.setLastResumedActivityUncheckLocked:264 com.android.server.wm.ActivityTaskSupervisor.updateTopResumedActivityIfNeeded:49 com.android.server.wm.TaskFragment.setResumedActivity:30 com.android.server.wm.ActivityRecord.setState:100 
12-22 20:15:20.915  1423  2228 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0xabeec95
12-22 20:15:20.915  1423  2228 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e, destroy=false, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9
12-22 20:15:20.915  1423  2228 I WindowManager: Reparenting to leash, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9, leashParent=Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e
12-22 20:15:20.915  1423  2228 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0x63ca03f
12-22 20:15:20.918  1423  2266 I WindowManager: Relayout Window{aa1da86 u0 Splash Screen com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=1422x1169 ty=3 d1
12-22 20:15:20.918  1423  2266 D WindowManager: makeSurface duration=0 name=Splash Screen com.katsuyamaki.DroidOSTrackpadKeyboard$_2022
12-22 20:15:20.919  1423  2266 I WindowManager: Relayout hash=aa1da86, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=pan} ty=APPLICATION_STARTING fmt=TRANSLUCENT wanim=0x1030317
12-22 20:15:20.919  1423  2266 I WindowManager:   fl=81030118
12-22 20:15:20.919  1423  2266 I WindowManager:   pfl=10000010
12-22 20:15:20.919  1423  2266 I WindowManager:   bhv=1
12-22 20:15:20.919  1423  2266 I WindowManager:   fitSides=0
12-22 20:15:20.919  1423  2266 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:20.919  1423  2266 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:20.924  1423  1635 D InputDispatcher: Focus left window (1): e382cc2 SubLauncherWindow
12-22 20:15:20.925  1423  1635 D WindowManager: finishDrawingWindow: Window{aa1da86 u0 Splash Screen com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:20.935  1423  1550 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0x63ca03f
12-22 20:15:20.935  1423  1550 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e, destroy=false, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9
12-22 20:15:20.936  1423  1550 I WindowManager: Reparenting to leash, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9, leashParent=Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e
12-22 20:15:20.936  1423  1550 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0x3edeac2
12-22 20:15:20.936  1423  1550 D WindowManager: updateSystemBarAttributes: displayId=1, focusedCanBeNavColorWin=false, win=Window{aa1da86 u0 Splash Screen com.katsuyamaki.DroidOSTrackpadKeyboard}, navColorWin=Window{aa1da86 u0 Splash Screen com.katsuyamaki.DroidOSTrackpadKeyboard}, caller=com.android.server.wm.DisplayPolicy.finishPostLayoutPolicyLw:17 com.android.server.wm.RootWindowContainer.applySurfaceChangesTransaction$1:195 com.android.server.wm.RootWindowContainer.performSurfacePlacementNoTrace:86 
12-22 20:15:20.936  1423  1550 D WindowManager: updateSystemBarAttributes, bhv=1, apr=0, statusBarAprRegions=[], requestedVisibilities=-9
12-22 20:15:20.936  1423  2229 D WindowManager: Transition is created, t=TransitionRecord{de040d3 id=-1 type=CLOSE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createTransition:17 com.android.server.wm.TransitionController.requestCloseTransitionIfNeeded:73 com.android.server.wm.ActivityRecord.finishIfPossible:38 com.android.server.wm.ActivityClientController.finishActivity:268 
12-22 20:15:20.937  1423  2229 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{aa1da86 u0 Splash Screen com.katsuyamaki.DroidOSTrackpadKeyboard}
12-22 20:15:20.937  1423  2229 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0x3edeac2
12-22 20:15:20.937  1423  2229 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e, destroy=false, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9
12-22 20:15:20.937  1423  2229 I WindowManager: Reparenting to leash, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9, leashParent=Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e
12-22 20:15:20.937  1423  2229 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0x75b9b09
12-22 20:15:20.937  1423  2229 D WindowManager: updateSystemBarAttributes: displayId=1, focusedCanBeNavColorWin=false, win=Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity}, navColorWin=Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity}, caller=com.android.server.wm.DisplayPolicy.finishPostLayoutPolicyLw:17 com.android.server.wm.RootWindowContainer.applySurfaceChangesTransaction$1:195 com.android.server.wm.RootWindowContainer.performSurfacePlacementNoTrace:86 
12-22 20:15:20.937  1423  2229 D WindowManager: updateSystemBarAttributes, bhv=1, apr=0, statusBarAprRegions=[], requestedVisibilities=-9
12-22 20:15:20.939  1423  4807 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{e382cc2 u0 SubLauncherWindow}
12-22 20:15:20.939  1423  4807 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity}
12-22 20:15:20.939  1423  4807 D InputDispatcher: Focused application(1): ActivityRecord{260071160 u0 com.android.systemui/.subscreen.SubHomeActivity t9}
12-22 20:15:20.939  1423  4807 D WindowManager: Changing focus from null to Window{e382cc2 u0 SubLauncherWindow} displayId=1 Callers=com.android.server.wm.ActivityTaskManagerService.setLastResumedActivityUncheckLocked:264 com.android.server.wm.ActivityTaskSupervisor.updateTopResumedActivityIfNeeded:49 com.android.server.wm.TaskFragment.setResumedActivity:30 com.android.server.wm.ActivityRecord.setState:100 
12-22 20:15:20.939  1423  4807 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0x75b9b09
12-22 20:15:20.939  1423  4807 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e, destroy=false, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9
12-22 20:15:20.939  1423  4807 I WindowManager: Reparenting to leash, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9, leashParent=Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e
12-22 20:15:20.939  1423  4807 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0x164172f
12-22 20:15:20.940  1423  4807 I WindowManager: getCoverScreenRotation 0, sensor= 0, isFlat=false, isDual=false
12-22 20:15:20.955  1423  1550 I WindowManager: notifyInsetsControlChanged, removed=false, win=Window{aa1da86 u0 Splash Screen com.katsuyamaki.DroidOSTrackpadKeyboard}, caller=com.android.server.wm.InsetsStateController$$ExternalSyntheticLambda1.run:137 com.android.server.wm.WindowAnimator$$ExternalSyntheticLambda2.onTransactionCommitted:26 android.view.SurfaceControl$Transaction$$ExternalSyntheticLambda4.run:0 android.os.Handler.handleCallback:995 android.os.Handler.dispatchMessage:103 android.os.Looper.loopOnce:273 
12-22 20:15:20.956  1423  2266 I WindowManager: Relayout Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity}: viewVisibility=0 req=1422x1500 ty=1 d1
12-22 20:15:20.956  1423  2266 I WindowManager: Relayout hash=9a3d1c6, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION fmt=TRANSPARENT if=INPUT_FEATURE_DISABLE_USER_ACTIVITY userActivityTimeout=30000
12-22 20:15:20.956  1423  2266 I WindowManager:   fl=81910100
12-22 20:15:20.956  1423  2266 I WindowManager:   pfl=10008850
12-22 20:15:20.956  1423  2266 I WindowManager:   bhv=1
12-22 20:15:20.956  1423  2266 I WindowManager:   fitSides=0
12-22 20:15:20.956  1423  2266 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:20.956  1423  2266 I WindowManager:   dvrrWindowFrameRateHint=true screenDimDuration=0 naviIconColor=0}
12-22 20:15:20.965  1423  2784 D InputDispatcher: Once focus requested (1): e382cc2 SubLauncherWindow
12-22 20:15:20.965  1423  2784 D InputDispatcher: Focus request (1): e382cc2 SubLauncherWindow but waiting because NO_WINDOW
12-22 20:15:20.965  1423  2266 D InputDispatcher: Focus entered window (1): e382cc2 SubLauncherWindow
12-22 20:15:20.972  1423  1754 I InputMethodManagerService: startInputUncheckedLocked: Rejecting unbind/bind in case of no editor in cover screen.
12-22 20:15:21.363  1423  2697 D WindowManager: Starting window removed Window{aa1da86 u0 Splash Screen com.katsuyamaki.DroidOSTrackpadKeyboard}
12-22 20:15:21.371  1423  2784 W WindowManager: Failed looking up window session=Session{eef2b83 2022:u0a10055} callers=com.android.server.wm.WindowManagerService.windowForClientLocked:1 com.android.server.wm.WindowManagerService.relayoutWindow:84 com.android.server.wm.Session.relayout:27 
12-22 20:15:21.375  1423  2266 W WindowManager: Cannot find window which accessibility connection is added to
12-22 20:15:21.375  1423  2229 W WindowManager: Failed looking up window session=Session{eef2b83 2022:u0a10055} callers=com.android.server.wm.Session.remove:10 android.view.IWindowSession$Stub.onTransact:804 com.android.server.wm.Session.onTransact:1 
12-22 20:15:21.375  1423  2228 W WindowManager: Failed looking up window session=Session{eef2b83 2022:u0a10055} callers=com.android.server.wm.WindowManagerService.windowForClientLocked:1 com.android.server.wm.Session.setOnBackInvokedCallbackInfo:15 android.view.IWindowSession$Stub.onTransact:1390 
12-22 20:15:21.375  1423  2228 I WindowManager: setOnBackInvokedCallback(): No window state for package:com.android.systemui
12-22 20:15:22.371  2022  2022 I WindowManager: WindowManagerGlobal#removeView, ty=2005, view=android.widget.LinearLayout{7acabe3 V.E...... ........ 0,0-343,69}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeViewImmediate:216 android.widget.ToastPresenter.hide:348 
12-22 20:15:22.384  1423  2266 I WindowManager: Reparenting to leash, surface=Surface(name=745dc77 Toast)/@0xd680c81, leashParent=Surface(name=WindowToken{82c399e type=2005 android.os.Binder@5fc6bd9})/@0x5e2d126
12-22 20:15:22.385  1423  2266 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=745dc77 Toast)/@0xd680c81 - animation-leash of window_animation)/@0xec58788
12-22 20:15:22.851  1423  1554 I ActivityManager: Changes in 5009 5 to 6, 144 to 128
12-22 20:15:22.900  1423  1550 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{82c399e type=2005 android.os.Binder@5fc6bd9})/@0x5e2d126, destroy=true, surface=Surface(name=745dc77 Toast)/@0xd680c81
12-22 20:15:23.657  1423  1555 I ActivityManager: Changes in 10277 19 to 11, 0 to 128
12-22 20:15:23.742  1423  2266 I ActivityManager: Changes in 10277 11 to 19, 128 to 0
12-22 20:15:24.032  1423  1423 D InputDispatcher: Inject motion (0/0): action=0x0, time=31083625614000, f=0x0, d=1 dsdx=1.500000 dtdx=-0.000000
12-22 20:15:24.034  1423  1695 I InputDispatcher: Delivering touch to (2022): action: 0x4, f=0x0, d=1, 'a93450e', t=1 
12-22 20:15:24.034  1423  1695 I InputDispatcher: Delivering touch to (2022): action: 0x0, f=0x0, d=1, 'e382cc2', t=1 +(0,-35)*(1.50)
12-22 20:15:24.037  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(948 x 1048) immediately
12-22 20:15:24.051  1423  1549 W WindowManager: Unable to start animation, surface is null or no children.
12-22 20:15:24.056  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(948 x 1048) immediately
12-22 20:15:24.091  1423  1423 D InputDispatcher: Inject motion (0/0): action=0x1, time=31083695403000, f=0x0, d=1 dsdx=1.500000 dtdx=-0.000000
12-22 20:15:24.091  1423  1695 I InputDispatcher: Delivering touch to (2022): action: 0x1, f=0x0, d=1, 'e382cc2', t=1 +(0,-35)*(1.50)
12-22 20:15:24.166  1423  4807 I ActivityManager: Changes in 5009 6 to 5, 128 to 144
12-22 20:15:24.186  1423  2266 D WindowManager: Transition is created, t=TransitionRecord{3ac7893 id=-1 type=OPEN flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createAndStartCollecting:106 com.android.server.wm.ActivityStarter.executeRequest:3537 com.android.server.wm.ActivityStarter.execute:1873 com.android.server.wm.ActivityTaskManagerService.startActivityAsUser:87 
12-22 20:15:24.196  2022  2160 D ViewRootImpl: desktopMode is false
12-22 20:15:24.197  2022  2160 I ViewRootImpl: dVRR is disabled
12-22 20:15:24.198  1423  2266 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{e382cc2 u0 SubLauncherWindow}
12-22 20:15:24.198  1423  2266 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity}
12-22 20:15:24.199  1423  2266 I WindowManager: getCoverScreenRotation 0, sensor= 0, isFlat=false, isDual=false
12-22 20:15:24.208  1423  2784 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{6423a8a u0 Splash Screen com.katsuyamaki.DroidOSTrackpadKeyboard}
12-22 20:15:24.209  1423  4806 I WindowManager: getCoverScreenRotation 0, sensor= 0, isFlat=false, isDual=false
12-22 20:15:24.210  1423  4806 D InputDispatcher: Focused application(1): ActivityRecord{31346896 u0 com.katsuyamaki.DroidOSTrackpadKeyboard/com.example.coverscreentester.MainActivity t19242}
12-22 20:15:24.210  1423  4806 D WindowManager: Changing focus from Window{e382cc2 u0 SubLauncherWindow} to null displayId=1 Callers=com.android.server.wm.ActivityTaskManagerService.setLastResumedActivityUncheckLocked:264 com.android.server.wm.ActivityTaskSupervisor.updateTopResumedActivityIfNeeded:49 com.android.server.wm.TaskFragment.setResumedActivity:30 com.android.server.wm.ActivityRecord.setState:100 
12-22 20:15:24.210  1423  4806 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0x164172f
12-22 20:15:24.210  1423  4806 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e, destroy=false, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9
12-22 20:15:24.211  1423  4806 I WindowManager: Reparenting to leash, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9, leashParent=Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e
12-22 20:15:24.211  1423  4806 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0xc36e371
12-22 20:15:24.215  1423  1635 I WindowManager: Relayout Window{6423a8a u0 Splash Screen com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=1422x1169 ty=3 d1
12-22 20:15:24.216  1423  1635 D WindowManager: makeSurface duration=0 name=Splash Screen com.katsuyamaki.DroidOSTrackpadKeyboard$_2022
12-22 20:15:24.216  1423  1635 I WindowManager: Relayout hash=6423a8a, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=pan} ty=APPLICATION_STARTING fmt=TRANSLUCENT wanim=0x1030317
12-22 20:15:24.216  1423  1635 I WindowManager:   fl=81030118
12-22 20:15:24.216  1423  1635 I WindowManager:   pfl=10000010
12-22 20:15:24.216  1423  1635 I WindowManager:   bhv=1
12-22 20:15:24.216  1423  1635 I WindowManager:   fitSides=0
12-22 20:15:24.216  1423  1635 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:24.216  1423  1635 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:24.217  1423  2229 D InputDispatcher: Focus left window (1): e382cc2 SubLauncherWindow
12-22 20:15:24.222  1423  2266 D WindowManager: finishDrawingWindow: Window{6423a8a u0 Splash Screen com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:24.226  1423  2230 D WindowManager: Transition is created, t=TransitionRecord{d1d92e id=-1 type=CLOSE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createTransition:17 com.android.server.wm.TransitionController.requestCloseTransitionIfNeeded:73 com.android.server.wm.ActivityRecord.finishIfPossible:38 com.android.server.wm.ActivityClientController.finishActivity:268 
12-22 20:15:24.227  1423  2230 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{6423a8a u0 Splash Screen com.katsuyamaki.DroidOSTrackpadKeyboard}
12-22 20:15:24.228  1423  4806 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{e382cc2 u0 SubLauncherWindow}
12-22 20:15:24.228  1423  4806 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity}
12-22 20:15:24.229  1423  4806 D InputDispatcher: Focused application(1): ActivityRecord{260071160 u0 com.android.systemui/.subscreen.SubHomeActivity t9}
12-22 20:15:24.229  1423  4806 D WindowManager: Changing focus from null to Window{e382cc2 u0 SubLauncherWindow} displayId=1 Callers=com.android.server.wm.ActivityTaskManagerService.setLastResumedActivityUncheckLocked:264 com.android.server.wm.ActivityTaskSupervisor.updateTopResumedActivityIfNeeded:49 com.android.server.wm.TaskFragment.setResumedActivity:30 com.android.server.wm.ActivityRecord.setState:100 
12-22 20:15:24.229  1423  4806 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0xc36e371
12-22 20:15:24.229  1423  4806 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e, destroy=false, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9
12-22 20:15:24.229  1423  4806 I WindowManager: Reparenting to leash, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9, leashParent=Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e
12-22 20:15:24.229  1423  4806 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0x2567d65
12-22 20:15:24.229  1423  4806 I WindowManager: getCoverScreenRotation 0, sensor= 0, isFlat=false, isDual=false
12-22 20:15:24.240  1423  4806 D InputDispatcher: Once focus requested (1): e382cc2 SubLauncherWindow
12-22 20:15:24.240  1423  4806 D InputDispatcher: Focus request (1): e382cc2 SubLauncherWindow but waiting because NO_WINDOW
12-22 20:15:24.251  1423  2229 D InputDispatcher: Focus entered window (1): e382cc2 SubLauncherWindow
12-22 20:15:24.257  1423  1754 I InputMethodManagerService: startInputUncheckedLocked: Rejecting unbind/bind in case of no editor in cover screen.
12-22 20:15:24.655  1423  2266 D WindowManager: Starting window removed Window{6423a8a u0 Splash Screen com.katsuyamaki.DroidOSTrackpadKeyboard}
12-22 20:15:24.663  1423  1635 W WindowManager: Failed looking up window session=Session{eef2b83 2022:u0a10055} callers=com.android.server.wm.WindowManagerService.windowForClientLocked:1 com.android.server.wm.WindowManagerService.relayoutWindow:84 com.android.server.wm.Session.relayout:27 
12-22 20:15:24.667  1423  2229 W WindowManager: Failed looking up window session=Session{eef2b83 2022:u0a10055} callers=com.android.server.wm.WindowManagerService.windowForClientLocked:1 com.android.server.wm.Session.setOnBackInvokedCallbackInfo:15 android.view.IWindowSession$Stub.onTransact:1390 
12-22 20:15:24.667  1423  2229 I WindowManager: setOnBackInvokedCallback(): No window state for package:com.android.systemui
12-22 20:15:24.667  1423  2784 W WindowManager: Cannot find window which accessibility connection is added to
12-22 20:15:24.667  1423  2229 W WindowManager: Failed looking up window session=Session{eef2b83 2022:u0a10055} callers=com.android.server.wm.Session.remove:10 android.view.IWindowSession$Stub.onTransact:804 com.android.server.wm.Session.onTransact:1 
12-22 20:15:25.637  1423  1549 D WindowManager: onStateChanged, state=1
12-22 20:15:25.638  1423  1549 D WindowManager: rotationForOrientation, orientationSource=DefaultTaskDisplayArea_d0@131230281
12-22 20:15:25.646  1423  1549 I WindowManager: getCoverScreenRotation 0, sensor= 0, isFlat=false, isDual=false
12-22 20:15:25.967  1423  1549 D WindowManager: onStateChanged, state=2
12-22 20:15:25.969  1423  1549 D WindowManager: Changing focus from Window{e382cc2 u0 SubLauncherWindow} to null displayId=1 Callers=com.android.server.wm.RootWindowContainer.onChildPositionChanged:8 com.android.server.wm.WindowContainer.positionChildAt:69 com.android.server.wm.RootWindowContainer.positionChildAt:8 com.android.server.wm.WindowManagerServiceExt.moveDisplayToTop:37 
12-22 20:15:25.969  1423  1549 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0x2567d65
12-22 20:15:25.969  1423  1549 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e, destroy=false, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9
12-22 20:15:25.970  1423  1549 I WindowManager: Reparenting to leash, surface=Surface(name=a93450e NavigationBar1)/@0xe8ece9, leashParent=Surface(name=WindowToken{413bf09 type=2019 android.os.BinderProxy@2eac4d3})/@0x920d6e
12-22 20:15:25.970  1423  1549 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0xdf9d54
12-22 20:15:25.971  1423  1549 D InputDispatcher: Focused display: 1 -> 0
12-22 20:15:25.971  1423  1549 W InputDispatcher: Focused display #0 does not have a focused window.
12-22 20:15:25.971  1423  1549 E InputDispatcher: But another display has a focused window
12-22 20:15:25.971  1423  1549 E InputDispatcher:   FocusedWindows:
12-22 20:15:25.971  1423  1549 E InputDispatcher:     displayId=1, name='e382cc2 SubLauncherWindow'
12-22 20:15:25.973  1423  1549 I WindowManager: getCoverScreenRotation 0, sensor= 0, isFlat=false, isDual=false
12-22 20:15:25.976  2022  2022 I WindowManager: WindowManagerGlobal#removeView, ty=2019, view=com.android.systemui.navigationbar.views.NavigationBarFrame{d6824b5 V.E...... ......I. 0,0-1422,66 #7f0a083a app:id/navigation_bar_frame}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeViewImmediate:216 com.android.systemui.navigationbar.views.NavigationBar.destroyView:32 
12-22 20:15:25.977  2022  2022 I WindowManager: WindowManagerGlobal#removeView, ty=2024, view=com.android.systemui.navigationbar.gestural.QuickswitchOrientedNavHandle{11c299a G.E...... ......I. 0,0-0,0 #7f0a0b72 app:id/secondary_home_handle}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.android.systemui.navigationbar.views.NavigationBar.onViewDetached:75 
12-22 20:15:25.980  1423  1604 D WindowManager: Create SleepToken: tag=Display-off, displayId=1
12-22 20:15:25.983  1423  4807 I WindowManager: Cancelling animation restarting=false, leash=Surface(name=Surface(name=a93450e NavigationBar1)/@0xe8ece9 - animation-leash of insets_animation)/@0xdf9d54
12-22 20:15:25.986  2022  2022 I WindowManager: WindowManagerGlobal#removeView, ty=2024, view=com.android.systemui.navigationbar.gestural.SamsungBackPanel{e24fbc1 G.ED..... ......I. 0,0-164,419}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.android.systemui.navigationbar.gestural.BackPanelController.onDestroy:12 
12-22 20:15:25.992  1423  2784 D InputDispatcher: Once focus requested (1): <null>
12-22 20:15:25.992  1423  2784 D InputDispatcher: Focus request (1): <null> but waiting because NO_WINDOW
12-22 20:15:25.992  1423  2784 D InputDispatcher: Focus left window (1): e382cc2 SubLauncherWindow
12-22 20:15:26.005  1423  4806 I WindowManager: Relayout Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity}: viewVisibility=0 req=1422x1500 ty=1 d1
12-22 20:15:26.005  1423  4806 D WindowManager: updateSystemBarAttributes: displayId=1, focusedCanBeNavColorWin=false, win=Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity}, navColorWin=null, caller=com.android.server.wm.DisplayPolicy.finishPostLayoutPolicyLw:17 com.android.server.wm.RootWindowContainer.applySurfaceChangesTransaction$1:195 com.android.server.wm.RootWindowContainer.performSurfacePlacementNoTrace:86 
12-22 20:15:26.005  1423  4806 D WindowManager: updateSystemBarAttributes, bhv=1, apr=0, statusBarAprRegions=[], requestedVisibilities=-11
12-22 20:15:26.005  1423  1549 I ActivityManager: Changes in 10375 2 to 12, 255 to 0
12-22 20:15:26.006  1423  4806 I WindowManager: Relayout hash=9a3d1c6, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=pan} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION fmt=TRANSPARENT if=INPUT_FEATURE_DISABLE_USER_ACTIVITY userActivityTimeout=30000
12-22 20:15:26.006  1423  4806 I WindowManager:   fl=81910100
12-22 20:15:26.006  1423  4806 I WindowManager:   pfl=10008850
12-22 20:15:26.006  1423  4806 I WindowManager:   vsysui=1600000
12-22 20:15:26.006  1423  4806 I WindowManager:   bhv=1
12-22 20:15:26.006  1423  4806 I WindowManager:   fitSides=0
12-22 20:15:26.006  1423  4806 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.006  1423  4806 I WindowManager:   dvrrWindowFrameRateHint=true screenDimDuration=0 naviIconColor=0}
12-22 20:15:26.008  1423  2886 I WindowManager: Relayout Window{e382cc2 u0 SubLauncherWindow}: viewVisibility=0 req=1422x1500 ty=1000 d1
12-22 20:15:26.009  1423  2886 I WindowManager: Relayout hash=e382cc2, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize} layoutInDisplayCutoutMode=always ty=APPLICATION_PANEL fmt=TRANSLUCENT if=INPUT_FEATURE_DISABLE_USER_ACTIVITY
12-22 20:15:26.009  1423  2886 I WindowManager:   fl=80080260
12-22 20:15:26.009  1423  2886 I WindowManager:   vsysui=1600400
12-22 20:15:26.009  1423  2886 I WindowManager:   bhv=1
12-22 20:15:26.009  1423  2886 I WindowManager:   fitTypes=206
12-22 20:15:26.009  1423  2886 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.009  1423  2886 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.011  1423  1604 D WindowManager: Remove SleepToken: tag=Display-off, displayId=0
12-22 20:15:26.013  1423  1604 D WindowManager: Transition is created, t=TransitionRecord{d676816 id=-1 type=WAKE flags=0x0}, caller=com.android.server.wm.Transition.<init>:182 com.android.server.wm.TransitionController.createTransition:17 com.android.server.wm.RootWindowContainer.applySleepTokens:209 com.android.server.wm.ActivityTaskManagerService.updateSleepIfNeededLocked:90 com.android.server.wm.RootWindowContainer.removeSleepToken:131 
12-22 20:15:26.014  1423  1604 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{67a5228 u0 com.termux/com.termux.app.TermuxActivity}
12-22 20:15:26.016  1423  1604 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{db572d5 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}
12-22 20:15:26.017  1423  1604 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{64185e1 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}
12-22 20:15:26.017  1423  1604 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{e382cc2 u0 SubLauncherWindow}
12-22 20:15:26.017  1423  1604 D WindowManager: prepareSync <SYNC_STATE_WAITING_FOR_DRAW>, mPrepareSyncSeqId=0, win=Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity}
12-22 20:15:26.018  1423  1604 D WindowManager: rotationForOrientation, orientationSource=ActivityRecord{127106347 u0 com.sec.android.app.launcher/.activities.LauncherActivity t18982}
12-22 20:15:26.025  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(948 x 1048) immediately
12-22 20:15:26.025 22381 22381 D ViewRootImpl: Skipping stats log for color mode
12-22 20:15:26.028  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-22 20:15:26.034  1423  1855 I ActivityManager: Changes in 10395 19 to 3, 0 to 144
12-22 20:15:26.034  1423  2784 I WindowManager: Relayout Window{d2cc959 u0 com.android.systemui.wallpapers.ImageWallpaper}: viewVisibility=0 req=-1x-1 ty=2013 d1
12-22 20:15:26.035  1423  1855 I ActivityManager: Changes in 10342 4 to 2, 254 to 255
12-22 20:15:26.035  1423  1855 I ActivityManager: Changes in 10155 5 to 2, 184 to 255
12-22 20:15:26.036  1423  2784 I WindowManager: Relayout hash=d2cc959, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) gr=TOP START CENTER layoutInDisplayCutoutMode=always ty=WALLPAPER fmt=RGBX_8888 wanim=0x1030328
12-22 20:15:26.036  1423  2784 I WindowManager:   fl=10318
12-22 20:15:26.036  1423  2784 I WindowManager:   pfl=14
12-22 20:15:26.036  1423  2784 I WindowManager:   bhv=1
12-22 20:15:26.036  1423  2784 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.036  1423  2784 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.042  1423  1547 I WindowManager: Waiting for transition
12-22 20:15:26.044  1423  1550 I WindowManager: Waiting for transition
12-22 20:15:26.051  1423  1549 I ActivityManager: Changes in 10375 12 to 2, 0 to 255
12-22 20:15:26.058  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-22 20:15:26.059 14008 14008 D ViewRootImpl: Skipping stats log for color mode
12-22 20:15:26.059  1423  1547 I WindowManager: Waiting for transition
12-22 20:15:26.062  1423  2266 I WindowManager: Relayout Window{67a5228 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-22 20:15:26.062  1423  2266 D WindowManager: makeSurface duration=1 name=com.termux/com.termux.app.TermuxActivity$_22381
12-22 20:15:26.063  1423  2266 I WindowManager: Waiting for transition
12-22 20:15:26.063  1423  2266 D WindowManager: Changing focus from null to Window{67a5228 u0 com.termux/com.termux.app.TermuxActivity} displayId=0 Callers=com.android.server.wm.WindowManagerService.relayoutWindow:1359 com.android.server.wm.Session.relayout:27 android.view.IWindowSession$Stub.onTransact:829 com.android.server.wm.Session.onTransact:1 
12-22 20:15:26.063  1423  2266 I WindowManager: Cancelling animation restarting=true, leash=Surface(name=Surface(name=6146b28 NavigationBar0)/@0x1b76ee0 - animation-leash of insets_animation)/@0x3a79843
12-22 20:15:26.063  1423  2266 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{abeb61a type=2019 android.os.BinderProxy@2cf173c})/@0x22a599, destroy=false, surface=Surface(name=6146b28 NavigationBar0)/@0x1b76ee0
12-22 20:15:26.063  1423  2266 I WindowManager: Reparenting to leash, surface=Surface(name=6146b28 NavigationBar0)/@0x1b76ee0, leashParent=Surface(name=WindowToken{abeb61a type=2019 android.os.BinderProxy@2cf173c})/@0x22a599
12-22 20:15:26.063  1423  2266 D WindowManager: makeSurface duration=0 leash=Surface(name=Surface(name=6146b28 NavigationBar0)/@0x1b76ee0 - animation-leash of insets_animation)/@0xf5ca976
12-22 20:15:26.063  1423  2266 I WindowManager: Cancelling animation restarting=false, leash=Surface(name=Surface(name=88c439 StatusBar)/@0x6820c3f - animation-leash of insets_animation)/@0x7a67aac
12-22 20:15:26.063  1423  2266 I WindowManager: Reparenting to original parent: Surface(name=WindowToken{9be6400 type=2000 android.os.BinderProxy@ec85d32})/@0xcd4990c, destroy=false, surface=Surface(name=88c439 StatusBar)/@0x6820c3f
12-22 20:15:26.064  1423  2266 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{67a5228 u0 com.termux/com.termux.app.TermuxActivity}, navColorWin=null, caller=com.android.server.wm.WindowManagerService.updateFocusedWindowLocked:372 com.android.server.wm.WindowManagerService.relayoutWindow:1359 com.android.server.wm.Session.relayout:27 
12-22 20:15:26.064  1423  2266 D WindowManager: updateSystemBarAttributes, bhv=1, apr=0, statusBarAprRegions=[], requestedVisibilities=-9
12-22 20:15:26.064  1423  2266 I WindowManager: Relayout hash=67a5228, pid=22381, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize} ty=BASE_APPLICATION wanim=0x1030317
12-22 20:15:26.064  1423  2266 I WindowManager:   fl=8d810100
12-22 20:15:26.064  1423  2266 I WindowManager:   pfl=10008040
12-22 20:15:26.064  1423  2266 I WindowManager:   vsysui=700
12-22 20:15:26.064  1423  2266 I WindowManager:   bhv=1
12-22 20:15:26.064  1423  2266 I WindowManager:   fitSides=0
12-22 20:15:26.064  1423  2266 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.064  1423  2266 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.073  1423  1550 I WindowManager: Waiting for transition
12-22 20:15:26.079  1423  4807 D WindowManager: finishDrawingWindow: Window{67a5228 u0 com.termux/com.termux.app.TermuxActivity} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:26.080  1423  1550 I WindowManager: Waiting for transition
12-22 20:15:26.080  1423  1550 I WindowManager: Waiting for transition
12-22 20:15:26.085  1423  2784 I WindowManager: Relayout Window{64185e1 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}: viewVisibility=0 req=1080x2520 ty=1 d0
12-22 20:15:26.085  1423  2784 D WindowManager: makeSurface duration=1 name=com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity$_2712
12-22 20:15:26.086  1423  2784 I WindowManager: Waiting for transition
12-22 20:15:26.086  1423  2784 I WindowManager: Relayout hash=64185e1, pid=2712, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=nothing} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION fmt=TRANSPARENT wanim=0x1030306
12-22 20:15:26.086  1423  2784 I WindowManager:   fl=81910100
12-22 20:15:26.086  1423  2784 I WindowManager:   pfl=10008840
12-22 20:15:26.086  1423  2784 I WindowManager:   bhv=2
12-22 20:15:26.086  1423  2784 I WindowManager:   fitSides=0
12-22 20:15:26.086  1423  2784 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.086  1423  2784 I WindowManager:   dvrrWindowFrameRateHint=true screenDimDuration=200000 naviIconColor=0}
12-22 20:15:26.087  1423  2784 I WindowManager: Relayout Window{e382cc2 u0 SubLauncherWindow}: viewVisibility=0 req=1422x1500 ty=1000 d1
12-22 20:15:26.088  1423  2784 I WindowManager: Waiting for transition
12-22 20:15:26.088  1423  2784 I WindowManager: Waiting for transition
12-22 20:15:26.090  1423  2784 I WindowManager: Relayout hash=e382cc2, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize} layoutInDisplayCutoutMode=always ty=APPLICATION_PANEL fmt=TRANSLUCENT if=INPUT_FEATURE_DISABLE_USER_ACTIVITY
12-22 20:15:26.090  1423  2784 I WindowManager:   fl=81080278
12-22 20:15:26.090  1423  2784 I WindowManager:   vsysui=1600400
12-22 20:15:26.090  1423  2784 I WindowManager:   bhv=1
12-22 20:15:26.090  1423  2784 I WindowManager:   fitTypes=206
12-22 20:15:26.090  1423  2784 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.090  1423  2784 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.090  1423  2220 D InputDispatcher: Once focus requested (0): 67a5228 com.termux/com.termux.app.TermuxActivity
12-22 20:15:26.090  1423  2220 D InputDispatcher: Focus request (0): 67a5228 com.termux/com.termux.app.TermuxActivity but waiting because NO_WINDOW
12-22 20:15:26.093  1423  2220 I WindowManager: Relayout Window{db572d5 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-22 20:15:26.094  1423  2220 D WindowManager: makeSurface duration=0 name=com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity$_14008
12-22 20:15:26.094  1423  2220 I WindowManager: Waiting for transition
12-22 20:15:26.095  1423  2266 D WindowManager: finishDrawingWindow: Window{64185e1 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:26.095  1423  2220 I WindowManager: Relayout hash=db572d5, pid=14008, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION wanim=0x1030317
12-22 20:15:26.095  1423  2220 I WindowManager:   fl=80810100
12-22 20:15:26.095  1423  2220 I WindowManager:   pfl=10008840
12-22 20:15:26.095  1423  2220 I WindowManager:   bhv=1
12-22 20:15:26.095  1423  2220 I WindowManager:   fitSides=0
12-22 20:15:26.095  1423  2220 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.095  1423  2220 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.095  1423  1550 I WindowManager: Waiting for transition
12-22 20:15:26.096  1423  1550 I WindowManager: Waiting for transition
12-22 20:15:26.122  1423  2230 D WindowManager: finishDrawingWindow: Window{db572d5 u0 com.google.android.googlequicksearchbox/com.google.android.apps.search.assistant.surfaces.voice.robin.main.MainActivity} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:26.128  1423  1550 D WindowManager: All windows drawn!
12-22 20:15:26.128  1423  1550 I WindowManager: Reparenting to leash, surface=Surface(name=88c439 StatusBar)/@0x6820c3f, leashParent=Surface(name=WindowToken{9be6400 type=2000 android.os.BinderProxy@ec85d32})/@0xcd4990c
12-22 20:15:26.128  1423  1550 D WindowManager: makeSurface duration=1 leash=Surface(name=Surface(name=88c439 StatusBar)/@0x6820c3f - animation-leash of insets_animation)/@0xf5a5099
12-22 20:15:26.128  1423  1550 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{67a5228 u0 com.termux/com.termux.app.TermuxActivity}, navColorWin=Window{64185e1 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.DisplayPolicy.finishPostLayoutPolicyLw:17 com.android.server.wm.RootWindowContainer.applySurfaceChangesTransaction$1:195 com.android.server.wm.RootWindowContainer.performSurfacePlacementNoTrace:86 
12-22 20:15:26.129  1423  1550 D WindowManager: updateSystemBarAttributes, bhv=1, apr=1048576, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-9
12-22 20:15:26.129  1423  1547 D WindowManager: finishScreenTurningOn: mAwake=true, mScreenOnEarly=true, mScreenOnFully=false, mKeyguardDrawComplete=true, mWindowManagerDrawComplete=true
12-22 20:15:26.133  2022  2106 D ViewRootImpl: desktopMode is false
12-22 20:15:26.133  2022  2106 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.134  1423  1549 D WindowManager: onStateChanged, state=3
12-22 20:15:26.157  1423  2266 W WindowManager: Cannot find window which accessibility connection is added to
12-22 20:15:26.159  1423  4807 W WindowManager: Failed looking up window session=Session{eef2b83 2022:u0a10055} callers=com.android.server.wm.Session.remove:10 android.view.IWindowSession$Stub.onTransact:804 com.android.server.wm.Session.onTransact:1 
12-22 20:15:26.160  1423  2886 W WindowManager: Failed looking up window session=Session{eef2b83 2022:u0a10055} callers=com.android.server.wm.Session.remove:10 android.view.IWindowSession$Stub.onTransact:804 com.android.server.wm.Session.onTransact:1 
12-22 20:15:26.160  2022  2106 D ViewRootImpl: desktopMode is false
12-22 20:15:26.160  2022  2106 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.168  1423  2886 W WindowManager: Cannot find window which accessibility connection is added to
12-22 20:15:26.169  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-22 20:15:26.171  1423  2220 W WindowManager: Failed looking up window session=Session{eef2b83 2022:u0a10055} callers=com.android.server.wm.Session.remove:10 android.view.IWindowSession$Stub.onTransact:804 com.android.server.wm.Session.onTransact:1 
12-22 20:15:26.172  1423  2220 W WindowManager: Failed looking up window session=Session{eef2b83 2022:u0a10055} callers=com.android.server.wm.Session.remove:10 android.view.IWindowSession$Stub.onTransact:804 com.android.server.wm.Session.onTransact:1 
12-22 20:15:26.172  1423  2220 I WindowManager: Relayout Window{5a7dcc6 u0 com.android.systemui.wallpapers.ImageWallpaper}: viewVisibility=0 req=2486x2520 ty=2013 d0
12-22 20:15:26.173  1423  2220 I WindowManager: Relayout hash=5a7dcc6, pid=2022, syncId=-1: mAttrs={(0,0)(2486x2520) gr=TOP START CENTER layoutInDisplayCutoutMode=always ty=WALLPAPER fmt=RGBX_8888 wanim=0x1030328
12-22 20:15:26.173  1423  2220 I WindowManager:   fl=14318
12-22 20:15:26.173  1423  2220 I WindowManager:   pfl=14
12-22 20:15:26.173  1423  2220 I WindowManager:   bhv=1
12-22 20:15:26.173  1423  2220 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.173  1423  2220 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-22 20:15:26.173  1423  2220 I WindowManager:   sfl=8}
12-22 20:15:26.174  1423  2229 E InputDispatcher: Embedded{TaskInputSink of Surface(name=Decor container of Task=19124)/@0x958b23f} has feature NO_INPUT_WINDOW, but a non-null token. Clearing
12-22 20:15:26.176  1423  2230 D WindowManager: finishDrawingWindow: Window{5a7dcc6 u0 com.android.systemui.wallpapers.ImageWallpaper} mDrawState=HAS_DRAWN seqId=2147483647
12-22 20:15:26.186  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-22 20:15:26.196  1423  2266 I WindowManager: Relayout Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity}: viewVisibility=8 req=1422x1500 ty=1 d1
12-22 20:15:26.197  1423  1635 D InputDispatcher: Focus entered window (0): 67a5228 com.termux/com.termux.app.TermuxActivity
12-22 20:15:26.197  1423  2266 I WindowManager: Relayout hash=9a3d1c6, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=pan} layoutInDisplayCutoutMode=always ty=BASE_APPLICATION fmt=TRANSPARENT if=INPUT_FEATURE_DISABLE_USER_ACTIVITY userActivityTimeout=30000
12-22 20:15:26.197  1423  2266 I WindowManager:   fl=81910100
12-22 20:15:26.197  1423  2266 I WindowManager:   pfl=10008850
12-22 20:15:26.197  1423  2266 I WindowManager:   vsysui=1600000
12-22 20:15:26.197  1423  2266 I WindowManager:   bhv=1
12-22 20:15:26.197  1423  2266 I WindowManager:   fitSides=0
12-22 20:15:26.197  1423  2266 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.197  1423  2266 I WindowManager:   dvrrWindowFrameRateHint=true screenDimDuration=0 naviIconColor=0}
12-22 20:15:26.202  1423  1754 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-22 20:15:26.202  1423  1754 D InputMethodManagerService: shouldShowImeSwitcherLocked : checking vis : 3
12-22 20:15:26.202  1423  1754 D InputMethodManagerService: checkDisplayOfStartInputAndUpdateKeyboard: displayId=0, mFocusedDisplayId=0
12-22 20:15:26.202  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-22 20:15:26.203  1423  1754 D InputMethodManagerService: ACCESS_CONTROL_ENABLED = false, ACCESS_CONTROL_KEYBOARD_BLOCK = true
12-22 20:15:26.204  1423  1754 I ActivityManager: Changes in 10332 7 to 5, 128 to 255
12-22 20:15:26.205  1423  4807 I InputMethodManagerService: isAccessoryKeyboard 0
12-22 20:15:26.205  1423  1754 I InputMethodManagerService: attachNewInputLocked: showCurrentInputInternal, softInputModeState=STATE_UNSPECIFIED|ADJUST_RESIZE
12-22 20:15:26.206  1423  4812 I InputMethodManagerService: isAccessoryKeyboard 0
12-22 20:15:26.207  1423  1473 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{67a5228 u0 com.termux/com.termux.app.TermuxActivity}, navColorWin=Window{64185e1 u0 com.sec.android.app.launcher/com.sec.android.app.launcher.activities.LauncherActivity}, caller=com.android.server.wm.InsetsStateController.onRequestedVisibleTypesChanged:86 com.android.server.wm.WindowManagerService.updateDisplayWindowRequestedVisibleTypes:148 android.view.IWindowManager$Stub.onTransact:3601 
12-22 20:15:26.207  1423  1473 D WindowManager: updateSystemBarAttributes, bhv=1, apr=1048576, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-1
12-22 20:15:26.209  1423  1549 D InputMethodManagerService: ACCESS_CONTROL_ENABLED = false, ACCESS_CONTROL_KEYBOARD_BLOCK = true
12-22 20:15:26.214  1423  1474 I WindowManager: Relayout Window{e382cc2 u0 SubLauncherWindow}: viewVisibility=8 req=1422x1500 ty=1000 d1
12-22 20:15:26.215  1423  1474 I WindowManager: Relayout hash=e382cc2, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize} layoutInDisplayCutoutMode=always ty=APPLICATION_PANEL fmt=TRANSLUCENT if=INPUT_FEATURE_DISABLE_USER_ACTIVITY
12-22 20:15:26.215  1423  1474 I WindowManager:   fl=81080278
12-22 20:15:26.215  1423  1474 I WindowManager:   vsysui=1600400
12-22 20:15:26.215  1423  1474 I WindowManager:   bhv=1
12-22 20:15:26.215  1423  1474 I WindowManager:   fitTypes=206
12-22 20:15:26.215  1423  1474 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.215  1423  1474 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.229  1423  4812 E WindowManager: win=Window{e382cc2 u0 SubLauncherWindow} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=8 caller=com.android.server.wm.WindowState.destroySurface:24 com.android.server.wm.ActivityRecord.destroySurfaces:25 com.android.server.wm.ActivityRecord.activityStopped:192 com.android.server.wm.ActivityClientController.activityStopped:97 android.app.IActivityClientController$Stub.onTransact:726 com.android.server.wm.ActivityClientController.onTransact:1 android.os.Binder.execTransactInternal:1462 
12-22 20:15:26.230  1423  4812 E WindowManager: win=Window{9a3d1c6 u0 com.android.systemui/com.android.systemui.subscreen.SubHomeActivity} destroySurfaces: appStopped=true cleanupOnResume=false win.mWindowRemovalAllowed=false win.mRemoveOnExit=false win.mViewVisibility=8 caller=com.android.server.wm.ActivityRecord.destroySurfaces:25 com.android.server.wm.ActivityRecord.activityStopped:192 com.android.server.wm.ActivityClientController.activityStopped:97 android.app.IActivityClientController$Stub.onTransact:726 com.android.server.wm.ActivityClientController.onTransact:1 android.os.Binder.execTransactInternal:1462 android.os.Binder.execTransact:1401 
12-22 20:15:26.230  1423  2697 I WindowManager: Relayout Window{5a7dcc6 u0 com.android.systemui.wallpapers.ImageWallpaper}: viewVisibility=0 req=2486x2520 ty=2013 d0
12-22 20:15:26.231  1423  2697 I WindowManager: Relayout hash=5a7dcc6, pid=2022, syncId=-1: mAttrs={(0,0)(2486x2520) gr=TOP START CENTER layoutInDisplayCutoutMode=always ty=WALLPAPER fmt=RGBX_8888 wanim=0x1030328
12-22 20:15:26.231  1423  2697 I WindowManager:   fl=14318
12-22 20:15:26.231  1423  2697 I WindowManager:   pfl=14
12-22 20:15:26.231  1423  2697 I WindowManager:   bhv=1
12-22 20:15:26.231  1423  2697 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.231  1423  2697 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-22 20:15:26.231  1423  2697 I WindowManager:   sfl=8}
12-22 20:15:26.234  1423  4812 D InputMethodManagerService: isImeSwitcherDisabledPackage : false
12-22 20:15:26.234  1423  4812 D InputMethodManagerService: shouldShowImeSwitcherLocked : checking vis : 3
12-22 20:15:26.234  1423  4812 I InputMethodManagerService: setImeWindowStatus: vis=3, backDisposition=0
12-22 20:15:26.237  1423  2933 I InputMethodManagerService: isAccessoryKeyboard 0
12-22 20:15:26.237  1423  2189 I InputMethodManagerService: isAccessoryKeyboard 0
12-22 20:15:26.238  1423  2266 I WindowManager: Relayout Window{e382cc2 u0 SubLauncherWindow}: viewVisibility=8 req=1422x1500 ty=1000 d1
12-22 20:15:26.240  1423  2266 I WindowManager: Relayout hash=e382cc2, pid=2022, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=pan} layoutInDisplayCutoutMode=always ty=APPLICATION_PANEL fmt=TRANSLUCENT if=INPUT_FEATURE_DISABLE_USER_ACTIVITY
12-22 20:15:26.240  1423  2266 I WindowManager:   fl=81080278
12-22 20:15:26.240  1423  2266 I WindowManager:   vsysui=1600400
12-22 20:15:26.240  1423  2266 I WindowManager:   bhv=1
12-22 20:15:26.240  1423  2266 I WindowManager:   fitTypes=206
12-22 20:15:26.240  1423  2266 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.240  1423  2266 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.240  1423  1473 I WindowManager: Relayout Window{82d55a2 u0 InputMethod}: viewVisibility=0 req=1080x2404 ty=2011 d0
12-22 20:15:26.240  1423  1473 D WindowManager: makeSurface duration=0 name=InputMethod$_4255
12-22 20:15:26.241  1423  1473 I WindowManager: Relayout hash=82d55a2, pid=4255, syncId=-1: mAttrs={(0,0)(fillxfill) gr=BOTTOM CENTER_VERTICAL sim={adjust=pan} ty=INPUT_METHOD fmt=TRANSPARENT wanim=0x1030056 preferredMinDisplayRefreshRate=60.0 receive insets ignoring z-order
12-22 20:15:26.241  1423  1473 I WindowManager:   fl=81800108
12-22 20:15:26.241  1423  1473 I WindowManager:   pfl=14000000
12-22 20:15:26.241  1423  1473 I WindowManager:   bhv=1
12-22 20:15:26.241  1423  1473 I WindowManager:   fitTypes=3
12-22 20:15:26.241  1423  1473 I WindowManager:   fitSides=7
12-22 20:15:26.241  1423  1473 I WindowManager:   fitIgnoreVis
12-22 20:15:26.241  1423  1473 I WindowManager:   dvrrWindowFrameRateHint=true
12-22 20:15:26.241  1423  1473 I WindowManager:  dimAmount=0.18 dimDuration=150 naviIconColor=0}
12-22 20:15:26.244  1423  1473 D WindowManager: setInsetsWindow Window{82d55a2 u0 InputMethod}, contentInsets=Rect(0, 2329 - 0, 0) -> Rect(0, 1904 - 0, 0), visibleInsets=Rect(0, 2329 - 0, 0) -> Rect(0, 1904 - 0, 0), touchableRegion=SkRegion() -> SkRegion((0,1904,1080,2404)), touchableInsets 3 -> 3
12-22 20:15:26.248  1423  2697 D WindowManager: finishDrawingWindow: Window{82d55a2 u0 InputMethod} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:26.267  1423  2697 I WindowManager: Relayout Window{5a7dcc6 u0 com.android.systemui.wallpapers.ImageWallpaper}: viewVisibility=0 req=2486x2520 ty=2013 d0
12-22 20:15:26.271  1423  2697 I WindowManager: Relayout hash=5a7dcc6, pid=2022, syncId=-1: mAttrs={(0,0)(2486x2520) gr=TOP START CENTER layoutInDisplayCutoutMode=always ty=WALLPAPER fmt=RGBX_8888 wanim=0x1030328
12-22 20:15:26.271  1423  2697 I WindowManager:   fl=14318
12-22 20:15:26.271  1423  2697 I WindowManager:   pfl=14
12-22 20:15:26.271  1423  2697 I WindowManager:   bhv=1
12-22 20:15:26.271  1423  2697 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.271  1423  2697 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0
12-22 20:15:26.271  1423  2697 I WindowManager:   sfl=8}
12-22 20:15:26.277  1423  1473 D WindowManager: updateSystemBarAttributes: displayId=0, focusedCanBeNavColorWin=false, win=Window{67a5228 u0 com.termux/com.termux.app.TermuxActivity}, navColorWin=Window{82d55a2 u0 InputMethod}, caller=com.android.server.wm.DisplayPolicy.finishPostLayoutPolicyLw:17 com.android.server.wm.RootWindowContainer.applySurfaceChangesTransaction$1:195 com.android.server.wm.RootWindowContainer.performSurfacePlacementNoTrace:86 
12-22 20:15:26.277  1423  1473 D WindowManager: updateSystemBarAttributes, bhv=1, apr=0, statusBarAprRegions=[AppearanceRegion{ bounds=[0,0][1080,2520]}], requestedVisibilities=-1
12-22 20:15:26.281  1423  1474 D WindowManager: finishDrawingWindow: Window{82d55a2 u0 InputMethod} mDrawState=HAS_DRAWN seqId=0
12-22 20:15:26.307  1423  1473 I WindowManager: Relayout Window{67a5228 u0 com.termux/com.termux.app.TermuxActivity}: viewVisibility=0 req=1080x1260 ty=1 d0
12-22 20:15:26.311  1423  1473 I WindowManager: Relayout hash=67a5228, pid=0, syncId=-1: mAttrs={(0,0)(fillxfill) sim={adjust=resize} ty=BASE_APPLICATION wanim=0x1030317
12-22 20:15:26.311  1423  1473 I WindowManager:   fl=8d810100
12-22 20:15:26.311  1423  1473 I WindowManager:   pfl=10008040
12-22 20:15:26.311  1423  1473 I WindowManager:   vsysui=700
12-22 20:15:26.311  1423  1473 I WindowManager:   bhv=1
12-22 20:15:26.311  1423  1473 I WindowManager:   fitSides=0
12-22 20:15:26.311  1423  1473 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.311  1423  1473 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.312  1423  1473 D WindowManager: finishDrawingWindow: Window{67a5228 u0 com.termux/com.termux.app.TermuxActivity} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:26.450  1423  1423 I WindowManager: getCoverScreenRotation 0, sensor= 0, isFlat=false, isDual=false
12-22 20:15:26.453  1423  1473 I ActivityManager: Changes in 10053 19 to 6, 0 to 128
12-22 20:15:26.561 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{617d94b VFE...C.. ........ 0,0-93,93}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:790 
12-22 20:15:26.562 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{488bf27 V.E...... ........ 0,0-50,50}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:791 
12-22 20:15:26.564 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{b520d09 G.E...... ......ID 0,0-681,551}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:794 
12-22 20:15:26.570 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{7dbaa3b G.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupTrackpad:938 com.example.coverscreentester.OverlayService.setupUI:822 
12-22 20:15:26.570 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:26.570 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.582 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{955bced VFE...C.. ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupBubble:903 com.example.coverscreentester.OverlayService.setupUI:825 
12-22 20:15:26.582 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:26.582 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.588 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{15e3ae9 V.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupCursor:957 com.example.coverscreentester.OverlayService.setupUI:826 
12-22 20:15:26.588 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:26.588 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.597  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-22 20:15:26.601  1423  4800 W WindowManager: Failed looking up window session=Session{298fe90 26287:u0a10515} callers=com.android.server.wm.WindowManagerService.windowForClientLocked:1 com.android.server.wm.Session.setOnBackInvokedCallbackInfo:15 android.view.IWindowSession$Stub.onTransact:1390 
12-22 20:15:26.601  1423  4800 I WindowManager: setOnBackInvokedCallback(): No window state for package:com.katsuyamaki.DroidOSTrackpadKeyboard
12-22 20:15:26.606  1423  4799 I WindowManager: Relayout Window{69854de u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=8 req=527x444 ty=2032 d0
12-22 20:15:26.607  1423  4799 I WindowManager: Relayout hash=69854de, pid=26287, syncId=-1: mAttrs={(520,1916)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:26.607  1423  4799 I WindowManager:   fl=1040228
12-22 20:15:26.607  1423  4799 I WindowManager:   pfl=40000000
12-22 20:15:26.607  1423  4799 I WindowManager:   bhv=1
12-22 20:15:26.607  1423  4799 I WindowManager:   fitTypes=207
12-22 20:15:26.607  1423  4799 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.607  1423  4799 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.609  1423  4799 I WindowManager: Relayout Window{4dbfeb7 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=93x93 ty=2032 d0
12-22 20:15:26.609  1423  4799 D WindowManager: makeSurface duration=1 name=$_26287
12-22 20:15:26.611  1423  4799 I WindowManager: Relayout hash=4dbfeb7, pid=26287, syncId=-1: mAttrs={(50,1260)(93x93) gr=TOP START CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:26.611  1423  4799 I WindowManager:   fl=1000308
12-22 20:15:26.611  1423  4799 I WindowManager:   bhv=1
12-22 20:15:26.611  1423  4799 I WindowManager:   fitTypes=206
12-22 20:15:26.611  1423  4799 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.611  1423  4799 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.626  1423  4799 D WindowManager: finishDrawingWindow: Window{4dbfeb7 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:26.628  1423  2227 I WindowManager: Relayout Window{a2955bc u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=50x50 ty=2032 d0
12-22 20:15:26.628  1423  2227 D WindowManager: makeSurface duration=0 name=$_26287
12-22 20:15:26.629  1423  2227 I WindowManager: Relayout hash=a2955bc, pid=26287, syncId=-1: mAttrs={(540,1260)(wrapxwrap) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:26.629  1423  2227 I WindowManager:   fl=1000318
12-22 20:15:26.629  1423  2227 I WindowManager:   bhv=1
12-22 20:15:26.629  1423  2227 I WindowManager:   fitTypes=206
12-22 20:15:26.629  1423  2227 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.629  1423  2227 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.634  1423  1473 D WindowManager: finishDrawingWindow: Window{a2955bc u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:26.642  1423  1473 D WindowManager: finishDrawingWindow: Window{4dbfeb7 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=HAS_DRAWN seqId=0
12-22 20:15:26.647  1423  2227 D WindowManager: finishDrawingWindow: Window{a2955bc u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=HAS_DRAWN seqId=0
12-22 20:15:26.667 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{955bced VFE...C.. ........ 0,0-93,93}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:790 
12-22 20:15:26.669 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{15e3ae9 V.E...... ........ 0,0-50,50}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:791 
12-22 20:15:26.670 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{7dbaa3b G.E...... ......ID 0,0-527,444}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:794 
12-22 20:15:26.675 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{b043b00 G.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupTrackpad:938 com.example.coverscreentester.OverlayService.setupUI:822 
12-22 20:15:26.676 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:26.676 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.684 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{d497f8a VFE...C.. ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupBubble:903 com.example.coverscreentester.OverlayService.setupUI:825 
12-22 20:15:26.685 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:26.685 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.691 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{7c80a56 V.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupCursor:957 com.example.coverscreentester.OverlayService.setupUI:826 
12-22 20:15:26.691 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:26.691 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.703 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{d497f8a VFE...C.. ......I. 0,0-0,0}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:790 
12-22 20:15:26.704 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{7c80a56 V.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:791 
12-22 20:15:26.704 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{b043b00 G.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:794 
12-22 20:15:26.707 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{6bd78a9 G.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupTrackpad:938 com.example.coverscreentester.OverlayService.setupUI:822 
12-22 20:15:26.707 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:26.707 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.712 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{9cbf665 VFE...C.. ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupBubble:903 com.example.coverscreentester.OverlayService.setupUI:825 
12-22 20:15:26.712 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:26.712 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.718 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{88a93e1 V.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupCursor:957 com.example.coverscreentester.OverlayService.setupUI:826 
12-22 20:15:26.718 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:26.718 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.732  1423  4799 I WindowManager: Relayout Window{44ba5ec u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=8 req=527x444 ty=2032 d0
12-22 20:15:26.735  1423  4799 I WindowManager: Relayout hash=44ba5ec, pid=26287, syncId=-1: mAttrs={(520,1916)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:26.735  1423  4799 I WindowManager:   fl=1040228
12-22 20:15:26.735  1423  4799 I WindowManager:   pfl=40000000
12-22 20:15:26.735  1423  4799 I WindowManager:   bhv=1
12-22 20:15:26.735  1423  4799 I WindowManager:   fitTypes=207
12-22 20:15:26.735  1423  4799 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.735  1423  4799 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.738  1423  4799 I WindowManager: Relayout Window{262ee6d u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=93x93 ty=2032 d0
12-22 20:15:26.739  1423  4799 D WindowManager: makeSurface duration=0 name=$_26287
12-22 20:15:26.740  1423  4799 I WindowManager: Relayout hash=262ee6d, pid=26287, syncId=-1: mAttrs={(929,1211)(93x93) gr=TOP START CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:26.740  1423  4799 I WindowManager:   fl=1000308
12-22 20:15:26.740  1423  4799 I WindowManager:   bhv=1
12-22 20:15:26.740  1423  4799 I WindowManager:   fitTypes=206
12-22 20:15:26.740  1423  4799 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.740  1423  4799 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.754  1423  4799 D WindowManager: finishDrawingWindow: Window{262ee6d u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:26.754  1423  1473 I WindowManager: Relayout Window{3cb2bfa u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=50x50 ty=2032 d0
12-22 20:15:26.755  1423  1473 D WindowManager: makeSurface duration=0 name=$_26287
12-22 20:15:26.756  1423  1473 I WindowManager: Relayout hash=3cb2bfa, pid=26287, syncId=-1: mAttrs={(540,1260)(wrapxwrap) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:26.756  1423  1473 I WindowManager:   fl=1000318
12-22 20:15:26.756  1423  1473 I WindowManager:   bhv=1
12-22 20:15:26.756  1423  1473 I WindowManager:   fitTypes=206
12-22 20:15:26.756  1423  1473 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.756  1423  1473 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.761  1423  2227 I WindowManager: Relayout Window{5d5fa7f u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=8 req=527x444 ty=2032 d0
12-22 20:15:26.762  1423  4799 D WindowManager: finishDrawingWindow: Window{3cb2bfa u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:26.762  1423  2227 I WindowManager: Relayout hash=5d5fa7f, pid=26287, syncId=-1: mAttrs={(520,1916)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:26.762  1423  2227 I WindowManager:   fl=1040228
12-22 20:15:26.762  1423  2227 I WindowManager:   pfl=40000000
12-22 20:15:26.762  1423  2227 I WindowManager:   bhv=1
12-22 20:15:26.762  1423  2227 I WindowManager:   fitTypes=207
12-22 20:15:26.762  1423  2227 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.762  1423  2227 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.765  1423  2227 I WindowManager: Relayout Window{5246202 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=93x93 ty=2032 d0
12-22 20:15:26.765  1423  2227 D WindowManager: makeSurface duration=1 name=$_26287
12-22 20:15:26.766  1423  2227 I WindowManager: Relayout hash=5246202, pid=26287, syncId=-1: mAttrs={(50,1260)(93x93) gr=TOP START CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:26.766  1423  2227 I WindowManager:   fl=1000308
12-22 20:15:26.766  1423  2227 I WindowManager:   bhv=1
12-22 20:15:26.766  1423  2227 I WindowManager:   fitTypes=206
12-22 20:15:26.766  1423  2227 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.766  1423  2227 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.783  1423  2886 I WindowManager: Relayout Window{7e5c58b u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=50x50 ty=2032 d0
12-22 20:15:26.784  1423  2886 D WindowManager: makeSurface duration=0 name=$_26287
12-22 20:15:26.785  1423  2886 I WindowManager: Relayout hash=7e5c58b, pid=26287, syncId=-1: mAttrs={(540,1260)(wrapxwrap) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:26.785  1423  2886 I WindowManager:   fl=1000318
12-22 20:15:26.785  1423  2886 I WindowManager:   bhv=1
12-22 20:15:26.785  1423  2886 I WindowManager:   fitTypes=206
12-22 20:15:26.785  1423  2886 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.785  1423  2886 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.786  1423  4800 D WindowManager: finishDrawingWindow: Window{5246202 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:26.790 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{9cbf665 VFE...C.. ........ 0,0-93,93}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:790 
12-22 20:15:26.791 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{88a93e1 V.E...... ........ 0,0-50,50}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:791 
12-22 20:15:26.792  1423  4800 D WindowManager: finishDrawingWindow: Window{7e5c58b u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:26.792 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{6bd78a9 G.E...... ......ID 0,0-527,444}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:794 
12-22 20:15:26.797 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{b53406d G.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupTrackpad:938 com.example.coverscreentester.OverlayService.setupUI:822 
12-22 20:15:26.797 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:26.797 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.806 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{5a9d18f VFE...C.. ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupBubble:903 com.example.coverscreentester.OverlayService.setupUI:825 
12-22 20:15:26.806 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:26.806 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.811 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{fbf7ab V.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupCursor:957 com.example.coverscreentester.OverlayService.setupUI:826 
12-22 20:15:26.811 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:26.811 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.815 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{5a9d18f VFE...C.. ......I. 0,0-0,0}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:790 
12-22 20:15:26.816 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{fbf7ab V.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:791 
12-22 20:15:26.816 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{b53406d G.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:794 
12-22 20:15:26.820 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{44caa52 G.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupTrackpad:938 com.example.coverscreentester.OverlayService.setupUI:822 
12-22 20:15:26.820 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:26.820 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.826 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{1e7199e VFE...C.. ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupBubble:903 com.example.coverscreentester.OverlayService.setupUI:825 
12-22 20:15:26.826 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:26.826 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.831 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{a2731aa V.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupCursor:957 com.example.coverscreentester.OverlayService.setupUI:826 
12-22 20:15:26.831 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:26.831 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.836 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{1e7199e VFE...C.. ......I. 0,0-0,0}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:790 
12-22 20:15:26.837 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{a2731aa V.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:791 
12-22 20:15:26.837 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{44caa52 G.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:794 
12-22 20:15:26.841 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{cbd794d G.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupTrackpad:938 com.example.coverscreentester.OverlayService.setupUI:822 
12-22 20:15:26.841 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:26.841 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.846 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{bf55d49 VFE...C.. ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupBubble:903 com.example.coverscreentester.OverlayService.setupUI:825 
12-22 20:15:26.846 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:26.846 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.850 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{8ad8505 V.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupCursor:957 com.example.coverscreentester.OverlayService.setupUI:826 
12-22 20:15:26.851 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:26.851 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.869 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{bf55d49 VFE...C.. ......I. 0,0-0,0}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:790 
12-22 20:15:26.869 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{8ad8505 V.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:791 
12-22 20:15:26.870 26287 26287 I WindowManager: WindowManagerGlobal#removeView, ty=2032, view=android.widget.FrameLayout{cbd794d G.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerGlobal.removeView:654 android.view.WindowManagerImpl.removeView:211 com.example.coverscreentester.OverlayService.setupUI:794 
12-22 20:15:26.873 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{d3a9b14 G.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupTrackpad:938 com.example.coverscreentester.OverlayService.setupUI:822 
12-22 20:15:26.873 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:26.873 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.878 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{4b05480 VFE...C.. ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupBubble:903 com.example.coverscreentester.OverlayService.setupUI:825 
12-22 20:15:26.878 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:26.878 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.884 26287 26287 I WindowManager: WindowManagerGlobal#addView, ty=2032, view=android.widget.FrameLayout{b0638ac V.E...... ......I. 0,0-0,0}, caller=android.view.WindowManagerImpl.addView:158 com.example.coverscreentester.OverlayService.setupCursor:957 com.example.coverscreentester.OverlayService.setupUI:826 
12-22 20:15:26.884 26287 26287 D ViewRootImpl: desktopMode is false
12-22 20:15:26.884 26287 26287 I ViewRootImpl: dVRR is disabled
12-22 20:15:26.897  1423  2933 I WindowManager: Relayout Window{5246202 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=93x93 ty=2032 d0
12-22 20:15:26.898  1423  2933 I WindowManager: Relayout hash=5246202, pid=0, syncId=-1: mAttrs={(929,1211)(93x93) gr=TOP START CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:26.898  1423  2933 I WindowManager:   fl=1000308
12-22 20:15:26.898  1423  2933 I WindowManager:   bhv=1
12-22 20:15:26.898  1423  2933 I WindowManager:   fitTypes=206
12-22 20:15:26.898  1423  2933 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.898  1423  2933 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.908  1423  2933 I WindowManager: Relayout Window{c9065d6 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=8 req=527x444 ty=2032 d0
12-22 20:15:26.909  1423  2933 I WindowManager: Relayout hash=c9065d6, pid=26287, syncId=-1: mAttrs={(520,1916)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:26.909  1423  2933 I WindowManager:   fl=1040228
12-22 20:15:26.909  1423  2933 I WindowManager:   pfl=40000000
12-22 20:15:26.909  1423  2933 I WindowManager:   bhv=1
12-22 20:15:26.909  1423  2933 I WindowManager:   fitTypes=207
12-22 20:15:26.909  1423  2933 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.909  1423  2933 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.910  1423  2933 I WindowManager: Relayout Window{5a3634f u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=93x93 ty=2032 d0
12-22 20:15:26.910  1423  2933 D WindowManager: makeSurface duration=1 name=$_26287
12-22 20:15:26.911  1423  2933 I WindowManager: Relayout hash=5a3634f, pid=26287, syncId=-1: mAttrs={(929,1211)(93x93) gr=TOP START CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:26.911  1423  2933 I WindowManager:   fl=1000308
12-22 20:15:26.911  1423  2933 I WindowManager:   bhv=1
12-22 20:15:26.911  1423  2933 I WindowManager:   fitTypes=206
12-22 20:15:26.911  1423  2933 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.911  1423  2933 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.916  1423  1554 I ActivityManager: Changes in 10333 6 to 15, 128 to 0
12-22 20:15:26.924  1423  4800 I WindowManager: Relayout Window{79e5974 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=50x50 ty=2032 d0
12-22 20:15:26.924  1423  4800 D WindowManager: makeSurface duration=0 name=$_26287
12-22 20:15:26.926  1423  4800 I WindowManager: Relayout hash=79e5974, pid=26287, syncId=-1: mAttrs={(540,1260)(wrapxwrap) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:26.926  1423  4800 I WindowManager:   fl=1000318
12-22 20:15:26.926  1423  4800 I WindowManager:   bhv=1
12-22 20:15:26.926  1423  4800 I WindowManager:   fitTypes=206
12-22 20:15:26.926  1423  4800 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.926  1423  4800 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.926  1423  2266 D WindowManager: finishDrawingWindow: Window{5a3634f u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:26.928  1423  2266 D WindowManager: finishDrawingWindow: Window{79e5974 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:26.931  1423  2697 I WindowManager: Relayout Window{e20ee6a u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=8 req=527x444 ty=2032 d0
12-22 20:15:26.933  1423  2697 I WindowManager: Relayout hash=e20ee6a, pid=26287, syncId=-1: mAttrs={(520,1916)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:26.933  1423  2697 I WindowManager:   fl=1040228
12-22 20:15:26.933  1423  2697 I WindowManager:   pfl=40000000
12-22 20:15:26.933  1423  2697 I WindowManager:   bhv=1
12-22 20:15:26.933  1423  2697 I WindowManager:   fitTypes=207
12-22 20:15:26.933  1423  2697 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.933  1423  2697 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.935  1423  2266 I WindowManager: Relayout Window{e82fed3 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=93x93 ty=2032 d0
12-22 20:15:26.935  1423  2266 D WindowManager: makeSurface duration=0 name=$_26287
12-22 20:15:26.937  1423  2266 I WindowManager: Relayout hash=e82fed3, pid=26287, syncId=-1: mAttrs={(929,1211)(93x93) gr=TOP START CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:26.937  1423  2266 I WindowManager:   fl=1000308
12-22 20:15:26.937  1423  2266 I WindowManager:   bhv=1
12-22 20:15:26.937  1423  2266 I WindowManager:   fitTypes=206
12-22 20:15:26.937  1423  2266 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.937  1423  2266 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.951  1423  2697 D WindowManager: finishDrawingWindow: Window{e82fed3 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:26.951  1423  4800 I WindowManager: Relayout Window{ffdfb28 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=50x50 ty=2032 d0
12-22 20:15:26.951  1423  4800 D WindowManager: makeSurface duration=0 name=$_26287
12-22 20:15:26.952  1423  4800 I WindowManager: Relayout hash=ffdfb28, pid=26287, syncId=-1: mAttrs={(540,1260)(wrapxwrap) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:26.952  1423  4800 I WindowManager:   fl=1000318
12-22 20:15:26.952  1423  4800 I WindowManager:   bhv=1
12-22 20:15:26.952  1423  4800 I WindowManager:   fitTypes=206
12-22 20:15:26.952  1423  4800 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.952  1423  4800 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.955  1423  2933 D WindowManager: finishDrawingWindow: Window{ffdfb28 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:26.955  1423  2697 I WindowManager: Relayout Window{25e8fbe u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=8 req=527x444 ty=2032 d0
12-22 20:15:26.956  1423  2697 I WindowManager: Relayout hash=25e8fbe, pid=26287, syncId=-1: mAttrs={(520,1916)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:26.956  1423  2697 I WindowManager:   fl=1040228
12-22 20:15:26.956  1423  2697 I WindowManager:   pfl=40000000
12-22 20:15:26.956  1423  2697 I WindowManager:   bhv=1
12-22 20:15:26.956  1423  2697 I WindowManager:   fitTypes=207
12-22 20:15:26.956  1423  2697 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.956  1423  2697 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.957  1423  2933 I WindowManager: Relayout Window{a201c17 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=93x93 ty=2032 d0
12-22 20:15:26.957  1423  2933 D WindowManager: makeSurface duration=0 name=$_26287
12-22 20:15:26.958  1423  2933 I WindowManager: Relayout hash=a201c17, pid=26287, syncId=-1: mAttrs={(929,1211)(93x93) gr=TOP START CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:26.958  1423  2933 I WindowManager:   fl=1000308
12-22 20:15:26.958  1423  2933 I WindowManager:   bhv=1
12-22 20:15:26.958  1423  2933 I WindowManager:   fitTypes=206
12-22 20:15:26.958  1423  2933 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.958  1423  2933 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.970  1423  4799 D WindowManager: finishDrawingWindow: Window{a201c17 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:26.970  1423  2266 I WindowManager: Relayout Window{c17739c u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=50x50 ty=2032 d0
12-22 20:15:26.971  1423  2266 D WindowManager: makeSurface duration=0 name=$_26287
12-22 20:15:26.972  1423  2266 I WindowManager: Relayout hash=c17739c, pid=26287, syncId=-1: mAttrs={(540,1260)(wrapxwrap) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:26.972  1423  2266 I WindowManager:   fl=1000318
12-22 20:15:26.972  1423  2266 I WindowManager:   bhv=1
12-22 20:15:26.972  1423  2266 I WindowManager:   fitTypes=206
12-22 20:15:26.972  1423  2266 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.972  1423  2266 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.975  1423  4799 D WindowManager: finishDrawingWindow: Window{c17739c u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:26.975  1423  2933 I WindowManager: Relayout Window{f0741ff u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=8 req=527x444 ty=2032 d0
12-22 20:15:26.976  1423  2933 I WindowManager: Relayout hash=f0741ff, pid=26287, syncId=-1: mAttrs={(520,1916)(527x444) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:26.976  1423  2933 I WindowManager:   fl=1040228
12-22 20:15:26.976  1423  2933 I WindowManager:   pfl=40000000
12-22 20:15:26.976  1423  2933 I WindowManager:   bhv=1
12-22 20:15:26.976  1423  2933 I WindowManager:   fitTypes=207
12-22 20:15:26.976  1423  2933 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.976  1423  2933 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.977  1423  2266 I WindowManager: Relayout Window{39cf864 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=93x93 ty=2032 d0
12-22 20:15:26.977  1423  2266 D WindowManager: makeSurface duration=0 name=$_26287
12-22 20:15:26.979  1423  2266 I WindowManager: Relayout hash=39cf864, pid=26287, syncId=-1: mAttrs={(50,1260)(93x93) gr=TOP START CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:26.979  1423  2266 I WindowManager:   fl=1000308
12-22 20:15:26.979  1423  2266 I WindowManager:   bhv=1
12-22 20:15:26.979  1423  2266 I WindowManager:   fitTypes=206
12-22 20:15:26.979  1423  2266 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.979  1423  2266 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.991  1423  2933 I WindowManager: Relayout Window{e892685 u0 com.katsuyamaki.DroidOSTrackpadKeyboard}: viewVisibility=0 req=50x50 ty=2032 d0
12-22 20:15:26.992  1423  2933 D WindowManager: makeSurface duration=0 name=$_26287
12-22 20:15:26.993  1423  2266 D WindowManager: finishDrawingWindow: Window{39cf864 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:26.993  1423  2933 I WindowManager: Relayout hash=e892685, pid=26287, syncId=-1: mAttrs={(540,1260)(wrapxwrap) gr=TOP LEFT CENTER sim={adjust=pan} layoutInDisplayCutoutMode=shortEdges ty=ACCESSIBILITY_OVERLAY fmt=TRANSLUCENT
12-22 20:15:26.993  1423  2933 I WindowManager:   fl=1000318
12-22 20:15:26.993  1423  2933 I WindowManager:   bhv=1
12-22 20:15:26.993  1423  2933 I WindowManager:   fitTypes=206
12-22 20:15:26.993  1423  2933 I WindowManager:   frameRateBoostOnTouch=true
12-22 20:15:26.993  1423  2933 I WindowManager:   dvrrWindowFrameRateHint=true naviIconColor=0}
12-22 20:15:26.997  1423  4800 D WindowManager: finishDrawingWindow: Window{e892685 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=DRAW_PENDING seqId=0
12-22 20:15:27.055  1423  2697 D WindowManager: finishDrawingWindow: Window{39cf864 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=HAS_DRAWN seqId=0
12-22 20:15:27.056  1423  4799 D WindowManager: finishDrawingWindow: Window{e892685 u0 com.katsuyamaki.DroidOSTrackpadKeyboard} mDrawState=HAS_DRAWN seqId=0
12-22 20:15:27.059  1423  2266 W ActivityManager: Receiver with filter android.content.IntentFilter@9d72977 already registered for pid 28918, callerPackage is com.samsung.android.rubin.app
12-22 20:15:27.874  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-22 20:15:28.011  1423  4799 E InputDispatcher: Embedded{TaskInputSink of Surface(name=Decor container of Task=19124)/@0x958b23f} has feature NO_INPUT_WINDOW, but a non-null token. Clearing
12-22 20:15:30.083  1423  1473 E InputDispatcher: Embedded{TaskInputSink of Surface(name=Decor container of Task=19124)/@0x958b23f} has feature NO_INPUT_WINDOW, but a non-null token. Clearing
12-22 20:15:30.223  1423  1554 I ActivityManager: Changes in 5009 5 to 6, 144 to 128
12-22 20:15:30.379  1423  1423 D InputDispatcher: Inject motion (0/0): action=0x0, time=31089976259000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-22 20:15:30.381  1423  1695 I InputDispatcher: Delivering touch to (16182): action: 0x4, f=0x0, d=0, 'e3ea267', t=1 
12-22 20:15:30.381  1423  1695 I InputDispatcher: Delivering touch to (2022): action: 0x4, f=0x0, d=0, '6146b28', t=1 
12-22 20:15:30.381  1423  1695 I InputDispatcher: Delivering touch to (22381): action: 0x0, f=0x0, d=0, '67a5228', t=1 +(0,-760)
12-22 20:15:30.414  1423  1547 D WindowManager: DeferredDisplayUpdater: partially applying DisplayInfo(1080 x 2520) immediately
12-22 20:15:30.463  1423  1423 D InputDispatcher: Inject motion (0/0): action=0x1, time=31090066857000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-22 20:15:30.463  1423  1695 I InputDispatcher: Delivering touch to (22381): action: 0x1, f=0x0, d=0, '67a5228', t=1 +(0,-760)
12-22 20:15:30.780  1423  1423 D InputDispatcher: Inject motion (0/0): action=0x0, time=31090383466000, f=0x0, d=0 dsdx=1.000000 dtdx=0.000000
12-22 20:15:30.781  1423  1695 I InputDispatcher: Delivering touch to (16182): action: 0x4, f=0x0, d=0, 'e3ea267', t=1 
12-22 20:15:30.781  1423  1695 I InputDispatcher: Delivering touch to (2022): action: 0x4, f=0x0, d=0, '6146b28', t=1 
12-22 20:15:30.781  1423  1695 I InputDispatcher: Delivering touch to (4255): action: 0x0, f=0x0, d=0, '82d55a2', t=1 +(0,-116)
