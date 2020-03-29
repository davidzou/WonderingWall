The logs what executed the command `flutter run`
====

```
zzw:my_first_flutter_demo zzw$ flutter run

Using hardware rendering with device Android SDK built for x86. If you get graphics artifacts, consider enabling software rendering with "--enable-software-rendering".
Launching lib/main.dart on Android SDK built for x86 in debug mode...
Running Gradle task 'assembleDebug'...                                  
Running Gradle task 'assembleDebug'... Done                        14.0s
✓ Built build/app/outputs/apk/debug/app-debug.apk.
D/FlutterActivity(12557): Using the launch theme as normal theme.
D/FlutterActivityAndFragmentDelegate(12557): Setting up FlutterEngine.
D/FlutterActivityAndFragmentDelegate(12557): No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.
D/FlutterActivityAndFragmentDelegate(12557): Attaching FlutterEngine to the Activity that owns this Fragment.
D/FlutterView(12557): Attaching to a FlutterEngine: io.flutter.embedding.engine.FlutterEngine@4c266ab
D/FlutterActivityAndFragmentDelegate(12557): Executing Dart entrypoint: main, and sending initial route: /
D/EGL_emulation(12557): eglMakeCurrent: 0xdc31a0c0: ver 3 0 (tinfo 0xdc30f130)
D/eglCodecCommon(12557): setVertexArrayObject: set vao to 0 (0) 1 0     
I/OpenGLRenderer(12557): Davey! duration=1798ms; Flags=1, IntendedVsync=26926057076837, Vsync=26926223743497, OldestInputEvent=9223372036854775807, NewestInputEvent=0, HandleInputStart=26926231962421, AnimationStart=26926232513421, PerformTraversalsStart=26926232686421, DrawStart=26927537263421, SyncQueued=26927538533421, SyncStart=26927598071421, IssueDrawCommandsStart=26927599517421, SwapBuffers=26927810099421, FrameCompleted=26927915294421, DequeueBufferDuration=26033000, QueueBufferDuration=7612000,
I/Choreographer(12557): Skipped 102 frames!  The application may be doing too much work on its main thread.
Syncing files to device Android SDK built for x86...                    
D/EGL_emulation(12557): eglMakeCurrent: 0xe43a1900: ver 3 0 (tinfo 0xe4482be0)
D/eglCodecCommon(12557): setVertexArrayObject: set vao to 0 (0) 1 0                                                
Syncing files to device Android SDK built for x86...            16,157ms (!)                                       

🔥  To hot reload changes while running, press "r". To hot restart (and rebuild state), press "R".
An Observatory debugger and profiler on Android SDK built for x86 is available at: http://127.0.0.1:52339/r9zJ5-RoZUI=/
For a more detailed help message, press "h". To detach, press "d"; to quit, press "q".

Initializing hot reload...                                              
Reloaded 0 of 478 libraries in 312ms.

🔥  To hot reload changes while running, press "r". To hot restart (and rebuild state), press "R".
An Observatory debugger and profiler on Android SDK built for x86 is available at: http://127.0.0.1:52339/r9zJ5-RoZUI=/
You can dump the widget hierarchy of the app (debugDumpApp) by pressing "w".
To dump the rendering tree of the app (debugDumpRenderTree), press "t".
For layers (debugDumpLayerTree), use "L"; for accessibility (debugDumpSemantics), use "S" (for traversal order) or "U" (for inverse hit test order).
To toggle the widget inspector (WidgetsApp.showWidgetInspectorOverride), press "i".
To toggle the display of construction lines (debugPaintSizeEnabled), press "p".
To simulate different operating systems, (defaultTargetPlatform), press "o".
To toggle the elevation checker, press "z".
To display the performance overlay (WidgetsApp.showPerformanceOverlay), press "P".
To enable timeline events for all widget build methods, (debugProfileWidgetBuilds), press "a"
To save a screenshot to flutter.png, press "s".
To repeat this help message, press "h". To detach, press "d"; to quit, press "q".

I/flutter (12557): RenderView#bee0c
I/flutter (12557):  │ debug mode enabled - android
I/flutter (12557):  │ window size: Size(1080.0, 1794.0) (in physical pixels)
I/flutter (12557):  │ device pixel ratio: 2.6 (physical pixels per logical pixel)
I/flutter (12557):  │ configuration: Size(411.4, 683.4) at 2.6x (in logical pixels)
I/flutter (12557):  │
I/flutter (12557):  └─child: RenderSemanticsAnnotations#c36d3
I/flutter (12557):    │ needs compositing
I/flutter (12557):    │ creator: Semantics ← _FocusMarker ← Focus ← Shortcuts ←
I/flutter (12557):    │   WidgetsApp-[GlobalObjectKey _MaterialAppState#7ac03] ←
I/flutter (12557):    │   ScrollConfiguration ← MaterialApp ← MyApp ← [root]
I/flutter (12557):    │ parentData: <none>
I/flutter (12557):    │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):    │ size: Size(411.4, 683.4)
I/flutter (12557):    │
I/flutter (12557):    └─child: RenderSemanticsAnnotations#1a359
I/flutter (12557):      │ needs compositing
I/flutter (12557):      │ creator: Semantics ← Localizations ← MediaQuery ←
I/flutter (12557):      │   _MediaQueryFromWindow ← DefaultFocusTraversal ← Actions ←
I/flutter (12557):      │   _ShortcutsMarker ← Semantics ← _FocusMarker ← Focus ← Shortcuts
I/flutter (12557):      │   ← WidgetsApp-[GlobalObjectKey _MaterialAppState#7ac03] ← ⋯
I/flutter (12557):      │ parentData: <none> (can use size)
I/flutter (12557):      │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):      │ size: Size(411.4, 683.4)
I/flutter (12557):      │
I/flutter (12557):      └─child: RenderCustomPaint#a4e14
I/flutter (12557):        │ needs compositing
I/flutter (12557):        │ creator: CustomPaint ← Banner ← CheckedModeBanner ← Title ←
I/flutter (12557):        │   Directionality ← _LocalizationsScope-[GlobalKey#e7c72] ←
I/flutter (12557):        │   Semantics ← Localizations ← MediaQuery ← _MediaQueryFromWindow
I/flutter (12557):        │   ← DefaultFocusTraversal ← Actions ← ⋯
I/flutter (12557):        │ parentData: <none> (can use size)
I/flutter (12557):        │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):        │ size: Size(411.4, 683.4)
I/flutter (12557):        │
I/flutter (12557):        └─child: RenderPointerListener#ab7cd
I/flutter (12557):          │ needs compositing
I/flutter (12557):          │ creator: _PointerListener ← Listener ←
I/flutter (12557):          │   Navigator-[GlobalObjectKey<NavigatorState>
I/flutter (12557):          │   _WidgetsAppState#d96c5] ← IconTheme ← IconTheme ←
I/flutter (12557):          │   _InheritedCupertinoTheme ← CupertinoTheme ← _InheritedTheme ←
I/flutter (12557):          │   Theme ← AnimatedTheme ← Builder ← DefaultTextStyle ← ⋯
I/flutter (12557):          │ parentData: <none> (can use size)
I/flutter (12557):          │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):          │ size: Size(411.4, 683.4)
I/flutter (12557):          │ behavior: deferToChild
I/flutter (12557):          │ listeners: down, up, cancel
I/flutter (12557):          │
I/flutter (12557):          └─child: RenderAbsorbPointer#900a6
I/flutter (12557):            │ needs compositing
I/flutter (12557):            │ creator: AbsorbPointer ← _PointerListener ← Listener ←
I/flutter (12557):            │   Navigator-[GlobalObjectKey<NavigatorState>
I/flutter (12557):            │   _WidgetsAppState#d96c5] ← IconTheme ← IconTheme ←
I/flutter (12557):            │   _InheritedCupertinoTheme ← CupertinoTheme ← _InheritedTheme ←
I/flutter (12557):            │   Theme ← AnimatedTheme ← Builder ← ⋯
I/flutter (12557):            │ parentData: <none> (can use size)
I/flutter (12557):            │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):            │ size: Size(411.4, 683.4)
I/flutter (12557):            │ absorbing: false
I/flutter (12557):            │ ignoringSemantics: implicitly false
I/flutter (12557):            │
I/flutter (12557):            └─child: RenderSemanticsAnnotations#9b67e
I/flutter (12557):              │ needs compositing
I/flutter (12557):              │ creator: Semantics ← FocusScope ← AbsorbPointer ←
I/flutter (12557):              │   _PointerListener ← Listener ←
I/flutter (12557):              │   Navigator-[GlobalObjectKey<NavigatorState>
I/flutter (12557):              │   _WidgetsAppState#d96c5] ← IconTheme ← IconTheme ←
I/flutter (12557):              │   _InheritedCupertinoTheme ← CupertinoTheme ← _InheritedTheme ←
I/flutter (12557):              │   Theme ← ⋯
I/flutter (12557):              │ parentData: <none> (can use size)
I/flutter (12557):              │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):              │ size: Size(411.4, 683.4)
I/flutter (12557):              │
I/flutter (12557):              └─child: _RenderTheatre#59c1d
I/flutter (12557):                │ needs compositing
I/flutter (12557):                │ creator: _Theatre ←
I/flutter (12557):                │   Overlay-[LabeledGlobalKey<OverlayState>#c5964] ← _FocusMarker ←
I/flutter (12557):                │   Semantics ← FocusScope ← AbsorbPointer ← _PointerListener ←
I/flutter (12557):                │   Listener ← Navigator-[GlobalObjectKey<NavigatorState>
I/flutter (12557):                │   _WidgetsAppState#d96c5] ← IconTheme ← IconTheme ←
I/flutter (12557):                │   _InheritedCupertinoTheme ← ⋯
I/flutter (12557):                │ parentData: <none> (can use size)
I/flutter (12557):                │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):                │ size: Size(411.4, 683.4)
I/flutter (12557):                │
I/flutter (12557):                ├─onstage: RenderStack#2520f
I/flutter (12557):                ╎ │ needs compositing
I/flutter (12557):                ╎ │ creator: Stack ← _Theatre ←
I/flutter (12557):                ╎ │   Overlay-[LabeledGlobalKey<OverlayState>#c5964] ← _FocusMarker ←
I/flutter (12557):                ╎ │   Semantics ← FocusScope ← AbsorbPointer ← _PointerListener ←
I/flutter (12557):                ╎ │   Listener ← Navigator-[GlobalObjectKey<NavigatorState>
I/flutter (12557):                ╎ │   _WidgetsAppState#d96c5] ← IconTheme ← IconTheme ← ⋯
I/flutter (12557):                ╎ │ parentData: not positioned; offset=Offset(0.0, 0.0) (can use
I/flutter (12557):                ╎ │   size)
I/flutter (12557):                ╎ │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):                ╎ │ size: Size(411.4, 683.4)
I/flutter (12557):                ╎ │ alignment: AlignmentDirectional.topStart
I/flutter (12557):                ╎ │ textDirection: ltr
I/flutter (12557):                ╎ │ fit: expand
I/flutter (12557):                ╎ │ overflow: clip
I/flutter (12557):                ╎ │
I/flutter (12557):                ╎ ├─child 1: RenderIgnorePointer#57865
I/flutter (12557):                ╎ │ │ creator: IgnorePointer ←
I/flutter (12557):                ╎ │ │   _OverlayEntry-[LabeledGlobalKey<_OverlayEntryState>#930b1] ←
I/flutter (12557):                ╎ │ │   Stack ← _Theatre ←
I/flutter (12557):                ╎ │ │   Overlay-[LabeledGlobalKey<OverlayState>#c5964] ← _FocusMarker ←
I/flutter (12557):                ╎ │ │   Semantics ← FocusScope ← AbsorbPointer ← _PointerListener ←
I/flutter (12557):                ╎ │ │   Listener ← Navigator-[GlobalObjectKey<NavigatorState>
I/flutter (12557):                ╎ │ │   _WidgetsAppState#d96c5] ← ⋯
I/flutter (12557):                ╎ │ │ parentData: not positioned; offset=Offset(0.0, 0.0) (can use
I/flutter (12557):                ╎ │ │   size)
I/flutter (12557):                ╎ │ │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):                ╎ │ │ size: Size(411.4, 683.4)
I/flutter (12557):                ╎ │ │ ignoring: false
I/flutter (12557):                ╎ │ │ ignoringSemantics: implicitly false
I/flutter (12557):                ╎ │ │
I/flutter (12557):                ╎ │ └─child: RenderBlockSemantics#080bf
I/flutter (12557):                ╎ │   │ creator: BlockSemantics ← ModalBarrier ← IgnorePointer ←
I/flutter (12557):                ╎ │   │   _OverlayEntry-[LabeledGlobalKey<_OverlayEntryState>#930b1] ←
I/flutter (12557):                ╎ │   │   Stack ← _Theatre ←
I/flutter (12557):                ╎ │   │   Overlay-[LabeledGlobalKey<OverlayState>#c5964] ← _FocusMarker ←
I/flutter (12557):                ╎ │   │   Semantics ← FocusScope ← AbsorbPointer ← _PointerListener ← ⋯
I/flutter (12557):                ╎ │   │ parentData: <none> (can use size)
I/flutter (12557):                ╎ │   │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):                ╎ │   │ blocks semantics of earlier render objects below the common
I/flutter (12557):                ╎ │   │ boundary
I/flutter (12557):                ╎ │   │ size: Size(411.4, 683.4)
I/flutter (12557):                ╎ │   │ blocking: true
I/flutter (12557):                ╎ │   │
I/flutter (12557):                ╎ │   └─child: RenderExcludeSemantics#9ef04
I/flutter (12557):                ╎ │     │ creator: ExcludeSemantics ← BlockSemantics ← ModalBarrier ←
I/flutter (12557):                ╎ │     │   IgnorePointer ←
I/flutter (12557):                ╎ │     │   _OverlayEntry-[LabeledGlobalKey<_OverlayEntryState>#930b1] ←
I/flutter (12557):                ╎ │     │   Stack ← _Theatre ←
I/flutter (12557):                ╎ │     │   Overlay-[LabeledGlobalKey<OverlayState>#c5964] ← _FocusMarker ←
I/flutter (12557):                ╎ │     │   Semantics ← FocusScope ← AbsorbPointer ← ⋯
I/flutter (12557):                ╎ │     │ parentData: <none> (can use size)
I/flutter (12557):                ╎ │     │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):                ╎ │     │ size: Size(411.4, 683.4)
I/flutter (12557):                ╎ │     │ excluding: true
I/flutter (12557):                ╎ │     │
I/flutter (12557):                ╎ │     └─child: RenderSemanticsGestureHandler#33c80
I/flutter (12557):                ╎ │       │ creator: _GestureSemantics ← RawGestureDetector ←
I/flutter (12557):                ╎ │       │   _ModalBarrierGestureDetector ← ExcludeSemantics ←
I/flutter (12557):                ╎ │       │   BlockSemantics ← ModalBarrier ← IgnorePointer ←
I/flutter (12557):                ╎ │       │   _OverlayEntry-[LabeledGlobalKey<_OverlayEntryState>#930b1] ←
I/flutter (12557):                ╎ │       │   Stack ← _Theatre ←
I/flutter (12557):                ╎ │       │   Overlay-[LabeledGlobalKey<OverlayState>#c5964] ← _FocusMarker ←
I/flutter (12557):                ╎ │       │   ⋯
I/flutter (12557):                ╎ │       │ parentData: <none> (can use size)
I/flutter (12557):                ╎ │       │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):                ╎ │       │ size: Size(411.4, 683.4)
I/flutter (12557):                ╎ │       │ gestures: tap
I/flutter (12557):                ╎ │       │
I/flutter (12557):                ╎ │       └─child: RenderPointerListener#af296
I/flutter (12557):                ╎ │         │ creator: _PointerListener ← Listener ← _GestureSemantics ←
I/flutter (12557):                ╎ │         │   RawGestureDetector ← _ModalBarrierGestureDetector ←
I/flutter (12557):                ╎ │         │   ExcludeSemantics ← BlockSemantics ← ModalBarrier ←
I/flutter (12557):                ╎ │         │   IgnorePointer ←
I/flutter (12557):                ╎ │         │   _OverlayEntry-[LabeledGlobalKey<_OverlayEntryState>#930b1] ←
I/flutter (12557):                ╎ │         │   Stack ← _Theatre ← ⋯
I/flutter (12557):                ╎ │         │ parentData: <none> (can use size)
I/flutter (12557):                ╎ │         │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):                ╎ │         │ size: Size(411.4, 683.4)
I/flutter (12557):                ╎ │         │ behavior: opaque
I/flutter (12557):                ╎ │         │ listeners: down
I/flutter (12557):                ╎ │         │
I/flutter (12557):                ╎ │         └─child: RenderSemanticsAnnotations#31856
I/flutter (12557):                ╎ │           │ creator: Semantics ← _PointerListener ← Listener ←
I/flutter (12557):                ╎ │           │   _GestureSemantics ← RawGestureDetector ←
I/flutter (12557):                ╎ │           │   _ModalBarrierGestureDetector ← ExcludeSemantics ←
I/flutter (12557):                ╎ │           │   BlockSemantics ← ModalBarrier ← IgnorePointer ←
I/flutter (12557):                ╎ │           │   _OverlayEntry-[LabeledGlobalKey<_OverlayEntryState>#930b1] ←
I/flutter (12557):                ╎ │           │   Stack ← ⋯
I/flutter (12557):                ╎ │           │ parentData: <none> (can use size)
I/flutter (12557):                ╎ │           │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):                ╎ │           │ size: Size(411.4, 683.4)
I/flutter (12557):                ╎ │           │
I/flutter (12557):                ╎ │           └─child: RenderMouseRegion#4ea5b
I/flutter (12557):                ╎ │             │ creator: MouseRegion ← Semantics ← _PointerListener ← Listener ←
I/flutter (12557):                ╎ │             │   _GestureSemantics ← RawGestureDetector ←
I/flutter (12557):                ╎ │             │   _ModalBarrierGestureDetector ← ExcludeSemantics ←
I/flutter (12557):                ╎ │             │   BlockSemantics ← ModalBarrier ← IgnorePointer ←
I/flutter (12557):                ╎ │             │   _OverlayEntry-[LabeledGlobalKey<_OverlayEntryState>#930b1] ← ⋯
I/flutter (12557):                ╎ │             │ parentData: <none> (can use size)
I/flutter (12557):                ╎ │             │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):                ╎ │             │ size: Size(411.4, 683.4)
I/flutter (12557):                ╎ │             │ listeners: <none>
I/flutter (12557):                ╎ │             │
I/flutter (12557):                ╎ │             └─child: RenderConstrainedBox#d4c60
I/flutter (12557):                ╎ │                 creator: ConstrainedBox ← MouseRegion ← Semantics ←
I/flutter (12557):                ╎ │                   _PointerListener ← Listener ← _GestureSemantics ←
I/flutter (12557):                ╎ │                   RawGestureDetector ← _ModalBarrierGestureDetector ←
I/flutter (12557):                ╎ │                   ExcludeSemantics ← BlockSemantics ← ModalBarrier ←
I/flutter (12557):                ╎ │                   IgnorePointer ← ⋯
I/flutter (12557):                ╎ │                 parentData: <none> (can use size)
I/flutter (12557):                ╎ │                 constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):                ╎ │                 size: Size(411.4, 683.4)
I/flutter (12557):                ╎ │                 additionalConstraints: BoxConstraints(biggest)
I/flutter (12557):                ╎ │
I/flutter (12557):                ╎ └─child 2: RenderOffstage#8877d
I/flutter (12557):                ╎   │ needs compositing
I/flutter (12557):                ╎   │ creator: Offstage ← _ModalScopeStatus ←
I/flutter (12557):                ╎   │   _ModalScope<dynamic>-[LabeledGlobalKey<_ModalScopeState<dynamic>>#b6128]
I/flutter (12557):                ╎   │   ← _OverlayEntry-[LabeledGlobalKey<_OverlayEntryState>#73703] ←
I/flutter (12557):                ╎   │   Stack ← _Theatre ←
I/flutter (12557):                ╎   │   Overlay-[LabeledGlobalKey<OverlayState>#c5964] ← _FocusMarker ←
I/flutter (12557):                ╎   │   Semantics ← FocusScope ← AbsorbPointer ← _PointerListener ← ⋯
I/flutter (12557):                ╎   │ parentData: not positioned; offset=Offset(0.0, 0.0) (can use
I/flutter (12557):                ╎   │   size)
I/flutter (12557):                ╎   │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):                ╎   │ size: Size(411.4, 683.4)
I/flutter (12557):                ╎   │ offstage: false
I/flutter (12557):                ╎   │
I/flutter (12557):                ╎   └─child: RenderSemanticsAnnotations#beceb
I/flutter (12557):                ╎     │ needs compositing
I/flutter (12557):                ╎     │ creator: Semantics ← FocusScope ← PageStorage ← Offstage ←
I/flutter (12557):                ╎     │   _ModalScopeStatus ←
I/flutter (12557):                ╎     │   _ModalScope<dynamic>-[LabeledGlobalKey<_ModalScopeState<dynamic>>#b6128]
I/flutter (12557):                ╎     │   ← _OverlayEntry-[LabeledGlobalKey<_OverlayEntryState>#73703] ←
I/flutter (12557):                ╎     │   Stack ← _Theatre ←
I/flutter (12557):                ╎     │   Overlay-[LabeledGlobalKey<OverlayState>#c5964] ← _FocusMarker ←
I/flutter (12557):                ╎     │   Semantics ← ⋯
I/flutter (12557):                ╎     │ parentData: <none> (can use size)
I/flutter (12557):                ╎     │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):                ╎     │ size: Size(411.4, 683.4)
I/flutter (12557):                ╎     │
I/flutter (12557):                ╎     └─child: RenderRepaintBoundary#1ec95
I/flutter (12557):                ╎       │ needs compositing
I/flutter (12557):                ╎       │ creator: RepaintBoundary ← _FocusMarker ← Semantics ← FocusScope
I/flutter (12557):                ╎       │   ← PageStorage ← Offstage ← _ModalScopeStatus ←
I/flutter (12557):                ╎       │   _ModalScope<dynamic>-[LabeledGlobalKey<_ModalScopeState<dynamic>>#b6128]
I/flutter (12557):                ╎       │   ← _OverlayEntry-[LabeledGlobalKey<_OverlayEntryState>#73703] ←
I/flutter (12557):                ╎       │   Stack ← _Theatre ←
I/flutter (12557):                ╎       │   Overlay-[LabeledGlobalKey<OverlayState>#c5964] ← ⋯
I/flutter (12557):                ╎       │ parentData: <none> (can use size)
I/flutter (12557):                ╎       │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):                ╎       │ layer: OffsetLayer#e6160
I/flutter (12557):                ╎       │ size: Size(411.4, 683.4)
I/flutter (12557):                ╎       │ metrics: 66.7% useful (1 bad vs 2 good)
I/flutter (12557):                ╎       │ diagnosis: insufficient data to draw conclusion (less than five
I/flutter (12557):                ╎       │   repaints)
I/flutter (12557):                ╎       │
I/flutter (12557):                ╎       └─child: RenderFractionalTranslation#2b338
I/flutter (12557):                ╎         │ needs compositing
I/flutter (12557):                ╎         │ creator: FractionalTranslation ← SlideTransition ←
I/flutter (12557):                ╎         │   _FadeUpwardsPageTransition ← AnimatedBuilder ← RepaintBoundary
I/flutter (12557):                ╎         │   ← _FocusMarker ← Semantics ← FocusScope ← PageStorage ←
I/flutter (12557):                ╎         │   Offstage ← _ModalScopeStatus ←
I/flutter (12557):                ╎         │   _ModalScope<dynamic>-[LabeledGlobalKey<_ModalScopeState<dynamic>>#b6128]
I/flutter (12557):                ╎         │   ← ⋯
I/flutter (12557):                ╎         │ parentData: <none> (can use size)
I/flutter (12557):                ╎         │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):                ╎         │ size: Size(411.4, 683.4)
I/flutter (12557):                ╎         │ translation: Offset(0.0, 0.0)
I/flutter (12557):                ╎         │ transformHitTests: true
I/flutter (12557):                ╎         │
I/flutter (12557):                ╎         └─child: RenderAnimatedOpacity#40af3
I/flutter (12557):                ╎           │ needs compositing
I/flutter (12557):                ╎           │ creator: FadeTransition ← FractionalTranslation ← SlideTransition
I/flutter (12557):                ╎           │   ← _FadeUpwardsPageTransition ← AnimatedBuilder ←
I/flutter (12557):                ╎           │   RepaintBoundary ← _FocusMarker ← Semantics ← FocusScope ←
I/flutter (12557):                ╎           │   PageStorage ← Offstage ← _ModalScopeStatus ← ⋯
I/flutter (12557):                ╎           │ parentData: <none> (can use size)
I/flutter (12557):                ╎           │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):                ╎           │ size: Size(411.4, 683.4)
I/flutter (12557):                ╎           │ opacity: AnimationController#f3e37(⏭ 1.000; paused; for
I/flutter (12557):                ╎           │   MaterialPageRoute<dynamic>(/))➩ProxyAnimation➩CurveTween(curve:
I/flutter (12557):                ╎           │   Cubic(0.42, 0.00, 1.00, 1.00))➩1.0
I/flutter (12557):                ╎           │
I/flutter (12557):                ╎           └─child: RenderIgnorePointer#597b3
I/flutter (12557):                ╎             │ needs compositing
I/flutter (12557):                ╎             │ creator: IgnorePointer ← AnimatedBuilder ← FadeTransition ←
I/flutter (12557):                ╎             │   FractionalTranslation ← SlideTransition ←
I/flutter (12557):                ╎             │   _FadeUpwardsPageTransition ← AnimatedBuilder ← RepaintBoundary
I/flutter (12557):                ╎             │   ← _FocusMarker ← Semantics ← FocusScope ← PageStorage ← ⋯
I/flutter (12557):                ╎             │ parentData: <none> (can use size)
I/flutter (12557):                ╎             │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):                ╎             │ size: Size(411.4, 683.4)
I/flutter (12557):                ╎             │ ignoring: false
I/flutter (12557):                ╎             │ ignoringSemantics: implicitly false
I/flutter (12557):                ╎             │
I/flutter (12557):                ╎             └─child: RenderRepaintBoundary#529ac
I/flutter (12557):                ╎               │ needs compositing
I/flutter (12557):                ╎               │ creator: RepaintBoundary-[GlobalKey#26496] ← IgnorePointer ←
I/flutter (12557):                ╎               │   AnimatedBuilder ← FadeTransition ← FractionalTranslation ←
I/flutter (12557):                ╎               │   SlideTransition ← _FadeUpwardsPageTransition ← AnimatedBuilder
I/flutter (12557):                ╎               │   ← RepaintBoundary ← _FocusMarker ← Semantics ← FocusScope ← ⋯
I/flutter (12557):                ╎               │ parentData: <none> (can use size)
I/flutter (12557):                ╎               │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):                ╎               │ layer: OffsetLayer#46da4
I/flutter (12557):                ╎               │ size: Size(411.4, 683.4)
I/flutter (12557):                ╎               │ metrics: 66.7% useful (1 bad vs 2 good)
I/flutter (12557):                ╎               │ diagnosis: insufficient data to draw conclusion (less than five
I/flutter (12557):                ╎               │   repaints)
I/flutter (12557):                ╎               │
I/flutter (12557):                ╎               └─child: RenderSemanticsAnnotations#b2b2a
I/flutter (12557):                ╎                 │ needs compositing
I/flutter (12557):                ╎                 │ creator: Semantics ← Builder ← RepaintBoundary-[GlobalKey#26496]
I/flutter (12557):                ╎                 │   ← IgnorePointer ← AnimatedBuilder ← FadeTransition ←
I/flutter (12557):                ╎                 │   FractionalTranslation ← SlideTransition ←
I/flutter (12557):                ╎                 │   _FadeUpwardsPageTransition ← AnimatedBuilder ← RepaintBoundary
I/flutter (12557):                ╎                 │   ← _FocusMarker ← ⋯
I/flutter (12557):                ╎                 │ parentData: <none> (can use size)
I/flutter (12557):                ╎                 │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):                ╎                 │ size: Size(411.4, 683.4)
I/flutter (12557):                ╎                 │
I/flutter (12557):                ╎                 └─child: RenderPhysicalModel#87b6e
I/flutter (12557):                ╎                   │ needs compositing
I/flutter (12557):                ╎                   │ creator: PhysicalModel ← AnimatedPhysicalModel ← Material ←
I/flutter (12557):                ╎                   │   PrimaryScrollController ← _ScaffoldScope ← Scaffold ←
I/flutter (12557):                ╎                   │   MyHomePage ← Semantics ← Builder ←
I/flutter (12557):                ╎                   │   RepaintBoundary-[GlobalKey#26496] ← IgnorePointer ←
I/flutter (12557):                ╎                   │   AnimatedBuilder ← ⋯
I/flutter (12557):                ╎                   │ parentData: <none> (can use size)
I/flutter (12557):                ╎                   │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):                ╎                   │ layer: PhysicalModelLayer#b30c8
I/flutter (12557):                ╎                   │ size: Size(411.4, 683.4)
I/flutter (12557):                ╎                   │ elevation: 0.0
I/flutter (12557):                ╎                   │ color: Color(0xfffafafa)
I/flutter (12557):                ╎                   │ shadowColor: Color(0xfffafafa)
I/flutter (12557):                ╎                   │ shape: BoxShape.rectangle
I/flutter (12557):                ╎                   │ borderRadius: BorderRadius.zero
I/flutter (12557):                ╎                   │
I/flutter (12557):                ╎                   └─child: _RenderInkFeatures#2ebb4
I/flutter (12557):                ╎                     │ needs compositing
I/flutter (12557):                ╎                     │ creator: _InkFeatures-[GlobalKey#4f5f5 ink renderer] ←
I/flutter (12557):                ╎                     │   NotificationListener<LayoutChangedNotification> ← PhysicalModel
I/flutter (12557):                ╎                     │   ← AnimatedPhysicalModel ← Material ← PrimaryScrollController ←
I/flutter (12557):                ╎                     │   _ScaffoldScope ← Scaffold ← MyHomePage ← Semantics ← Builder ←
I/flutter (12557):                ╎                     │   RepaintBoundary-[GlobalKey#26496] ← ⋯
I/flutter (12557):                ╎                     │ parentData: <none> (can use size)
I/flutter (12557):                ╎                     │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):                ╎                     │ size: Size(411.4, 683.4)
I/flutter (12557):                ╎                     │
I/flutter (12557):                ╎                     └─child: RenderCustomMultiChildLayoutBox#753ac
I/flutter (12557):                ╎                       │ needs compositing
I/flutter (12557):                ╎                       │ creator: CustomMultiChildLayout ← AnimatedBuilder ←
I/flutter (12557):                ╎                       │   DefaultTextStyle ← AnimatedDefaultTextStyle ←
I/flutter (12557):                ╎                       │   _InkFeatures-[GlobalKey#4f5f5 ink renderer] ←
I/flutter (12557):                ╎                       │   NotificationListener<LayoutChangedNotification> ← PhysicalModel
I/flutter (12557):                ╎                       │   ← AnimatedPhysicalModel ← Material ← PrimaryScrollController ←
I/flutter (12557):                ╎                       │   _ScaffoldScope ← Scaffold ← ⋯
I/flutter (12557):                ╎                       │ parentData: <none> (can use size)
I/flutter (12557):                ╎                       │ constraints: BoxConstraints(w=411.4, h=683.4)
I/flutter (12557):                ╎                       │ size: Size(411.4, 683.4)
I/flutter (12557):                ╎                       │
I/flutter (12557):                ╎                       ├─child 1: RenderPositionedBox#ba909 relayoutBoundary=up1
I/flutter (12557):                ╎                       │ │ creator: Center ← _BodyBuilder ← MediaQuery ←
I/flutter (12557):                ╎                       │ │   LayoutId-[<_ScaffoldSlot.body>] ← CustomMultiChildLayout ←
I/flutter (12557):                ╎                       │ │   AnimatedBuilder ← DefaultTextStyle ← AnimatedDefaultTextStyle ←
I/flutter (12557):                ╎                       │ │   _InkFeatures-[GlobalKey#4f5f5 ink renderer] ←
I/flutter (12557):                ╎                       │ │   NotificationListener<LayoutChangedNotification> ← PhysicalModel
I/flutter (12557):                ╎                       │ │   ← AnimatedPhysicalModel ← ⋯
I/flutter (12557):                ╎                       │ │ parentData: offset=Offset(0.0, 80.0); id=_ScaffoldSlot.body (can
I/flutter (12557):                ╎                       │ │   use size)
I/flutter (12557):                ╎                       │ │ constraints: BoxConstraints(0.0<=w<=411.4, 0.0<=h<=603.4)
I/flutter (12557):                ╎                       │ │ size: Size(411.4, 603.4)
I/flutter (12557):                ╎                       │ │ alignment: center
I/flutter (12557):                ╎                       │ │ textDirection: ltr
I/flutter (12557):                ╎                       │ │ widthFactor: expand
I/flutter (12557):                ╎                       │ │ heightFactor: expand
I/flutter (12557):                ╎                       │ │
I/flutter (12557):                ╎                       │ └─child: RenderFlex#9b74b relayoutBoundary=up2
I/flutter (12557):                ╎                       │   │ creator: Column ← Center ← _BodyBuilder ← MediaQuery ←
I/flutter (12557):                ╎                       │   │   LayoutId-[<_ScaffoldSlot.body>] ← CustomMultiChildLayout ←
I/flutter (12557):                ╎                       │   │   AnimatedBuilder ← DefaultTextStyle ← AnimatedDefaultTextStyle ←
I/flutter (12557):                ╎                       │   │   _InkFeatures-[GlobalKey#4f5f5 ink renderer] ←
I/flutter (12557):                ╎                       │   │   NotificationListener<LayoutChangedNotification> ← PhysicalModel
I/flutter (12557):                ╎                       │   │   ← ⋯
I/flutter (12557):                ╎                       │   │ parentData: offset=Offset(66.2, 0.0) (can use size)
I/flutter (12557):                ╎                       │   │ constraints: BoxConstraints(0.0<=w<=411.4, 0.0<=h<=603.4)
I/flutter (12557):                ╎                       │   │ size: Size(279.0, 603.4)
I/flutter (12557):                ╎                       │   │ direction: vertical
I/flutter (12557):                ╎                       │   │ mainAxisAlignment: center
I/flutter (12557):                ╎                       │   │ mainAxisSize: max
I/flutter (12557):                ╎                       │   │ crossAxisAlignment: center
I/flutter (12557):                ╎                       │   │ verticalDirection: down
I/flutter (12557):                ╎                       │   │
I/flutter (12557):                ╎                       │   ├─child 1: RenderParagraph#22160 relayoutBoundary=up3
I/flutter (12557):                ╎                       │   │ │ creator: RichText ← Text ← Column ← Center ← _BodyBuilder ←
I/flutter (12557):                ╎                       │   │ │   MediaQuery ← LayoutId-[<_ScaffoldSlot.body>] ←
I/flutter (12557):                ╎                       │   │ │   CustomMultiChildLayout ← AnimatedBuilder ← DefaultTextStyle ←
I/flutter (12557):                ╎                       │   │ │   AnimatedDefaultTextStyle ← _InkFeatures-[GlobalKey#4f5f5 ink
I/flutter (12557):                ╎                       │   │ │   renderer] ← ⋯
I/flutter (12557):                ╎                       │   │ │ parentData: offset=Offset(0.0, 273.7); flex=null; fit=null (can
I/flutter (12557):                ╎                       │   │ │   use size)
I/flutter (12557):                ╎                       │   │ │ constraints: BoxConstraints(0.0<=w<=411.4, 0.0<=h<=Infinity)
I/flutter (12557):                ╎                       │   │ │ size: Size(279.0, 16.0)
I/flutter (12557):                ╎                       │   │ │ textAlign: start
I/flutter (12557):                ╎                       │   │ │ textDirection: ltr
I/flutter (12557):                ╎                       │   │ │ softWrap: wrapping at box width
I/flutter (12557):                ╎                       │   │ │ overflow: clip
I/flutter (12557):                ╎                       │   │ │ locale: en_US
I/flutter (12557):                ╎                       │   │ │ maxLines: unlimited
I/flutter (12557):                ╎                       │   │ ╘═╦══ text ═══
I/flutter (12557):                ╎                       │   │   ║ TextSpan:
I/flutter (12557):                ╎                       │   │   ║   debugLabel: (englishLike body1 2014).merge(blackMountainView
I/flutter (12557):                ╎                       │   │   ║     body1)
I/flutter (12557):                ╎                       │   │   ║   inherit: false
I/flutter (12557):                ╎                       │   │   ║   color: Color(0xdd000000)
I/flutter (12557):                ╎                       │   │   ║   family: Roboto
I/flutter (12557):                ╎                       │   │   ║   size: 14.0
I/flutter (12557):                ╎                       │   │   ║   weight: 400
I/flutter (12557):                ╎                       │   │   ║   baseline: alphabetic
I/flutter (12557):                ╎                       │   │   ║   decoration: TextDecoration.none
I/flutter (12557):                ╎                       │   │   ║   "You have pushed the button this many times:"
I/flutter (12557):                ╎                       │   │   ╚═══════════
I/flutter (12557):                ╎                       │   └─child 2: RenderParagraph#e3ad5 relayoutBoundary=up3
I/flutter (12557):                ╎                       │     │ creator: RichText ← Text ← Column ← Center ← _BodyBuilder ←
I/flutter (12557):                ╎                       │     │   MediaQuery ← LayoutId-[<_ScaffoldSlot.body>] ←
I/flutter (12557):                ╎                       │     │   CustomMultiChildLayout ← AnimatedBuilder ← DefaultTextStyle ←
I/flutter (12557):                ╎                       │     │   AnimatedDefaultTextStyle ← _InkFeatures-[GlobalKey#4f5f5 ink
I/flutter (12557):                ╎                       │     │   renderer] ← ⋯
I/flutter (12557):                ╎                       │     │ parentData: offset=Offset(129.5, 289.7); flex=null; fit=null (can
I/flutter (12557):                ╎                       │     │   use size)
I/flutter (12557):                ╎                       │     │ constraints: BoxConstraints(0.0<=w<=411.4, 0.0<=h<=Infinity)
I/flutter (12557):                ╎                       │     │ size: Size(20.0, 40.0)
I/flutter (12557):                ╎                       │     │ textAlign: start
I/flutter (12557):                ╎                       │     │ textDirection: ltr
I/flutter (12557):                ╎                       │     │ softWrap: wrapping at box width
I/flutter (12557):                ╎                       │     │ overflow: clip
I/flutter (12557):                ╎                       │     │ locale: en_US
I/flutter (12557):                ╎                       │     │ maxLines: unlimited
I/flutter (12557):                ╎                       │     ╘═╦══ text ═══
I/flutter (12557):                ╎                       │       ║ TextSpan:
I/flutter (12557):                ╎                       │       ║   debugLabel: (englishLike display1 2014).merge(blackMountainView
I/flutter (12557):                ╎                       │       ║     display1)
I/flutter (12557):                ╎                       │       ║   inherit: false
I/flutter (12557):                ╎                       │       ║   color: Color(0x8a000000)
I/flutter (12557):                ╎                       │       ║   family: Roboto
I/flutter (12557):                ╎                       │       ║   size: 34.0
I/flutter (12557):                ╎                       │       ║   weight: 400
I/flutter (12557):                ╎                       │       ║   baseline: alphabetic
I/flutter (12557):                ╎                       │       ║   decoration: TextDecoration.none
I/flutter (12557):                ╎                       │       ║   "0"
I/flutter (12557):                ╎                       │       ╚═══════════
I/flutter (12557):                ╎                       ├─child 2: RenderConstrainedBox#36c06 relayoutBoundary=up1
I/flutter (12557):                ╎                       │ │ needs compositing
I/flutter (12557):                ╎                       │ │ creator: ConstrainedBox ← MediaQuery ←
I/flutter (12557):                ╎                       │ │   LayoutId-[<_ScaffoldSlot.appBar>] ← CustomMultiChildLayout ←
I/flutter (12557):                ╎                       │ │   AnimatedBuilder ← DefaultTextStyle ← AnimatedDefaultTextStyle ←
I/flutter (12557):                ╎                       │ │   _InkFeatures-[GlobalKey#4f5f5 ink renderer] ←
I/flutter (12557):                ╎                       │ │   NotificationListener<LayoutChangedNotification> ← PhysicalModel
I/flutter (12557):                ╎                       │ │   ← AnimatedPhysicalModel ← Material ← ⋯
I/flutter (12557):                ╎                       │ │ parentData: offset=Offset(0.0, 0.0); id=_ScaffoldSlot.appBar (can
I/flutter (12557):                ╎                       │ │   use size)
I/flutter (12557):                ╎                       │ │ constraints: BoxConstraints(w=411.4, 0.0<=h<=683.4)
I/flutter (12557):                ╎                       │ │ size: Size(411.4, 80.0)
I/flutter (12557):                ╎                       │ │ additionalConstraints: BoxConstraints(0.0<=w<=Infinity,
I/flutter (12557):                ╎                       │ │   0.0<=h<=80.0)
I/flutter (12557):                ╎                       │ │
I/flutter (12557):                ╎                       │ └─child: RenderSemanticsAnnotations#4ab88 relayoutBoundary=up2
I/flutter (12557):                ╎                       │   │ needs compositing
I/flutter (12557):                ╎                       │   │ creator: Semantics ← AppBar ← FlexibleSpaceBarSettings ←
I/flutter (12557):                ╎                       │   │   ConstrainedBox ← MediaQuery ← LayoutId-[<_ScaffoldSlot.appBar>]
I/flutter (12557):                ╎                       │   │   ← CustomMultiChildLayout ← AnimatedBuilder ← DefaultTextStyle ←
I/flutter (12557):                ╎                       │   │   AnimatedDefaultTextStyle ← _InkFeatures-[GlobalKey#4f5f5 ink
I/flutter (12557):                ╎                       │   │   renderer] ← NotificationListener<LayoutChangedNotification> ← ⋯
I/flutter (12557):                ╎                       │   │ parentData: <none> (can use size)
I/flutter (12557):                ╎                       │   │ constraints: BoxConstraints(w=411.4, 0.0<=h<=80.0)
I/flutter (12557):                ╎                       │   │ semantic boundary
I/flutter (12557):                ╎                       │   │ size: Size(411.4, 80.0)
I/flutter (12557):                ╎                       │   │
I/flutter (12557):                ╎                       │   └─child: RenderAnnotatedRegion<SystemUiOverlayStyle>#091ca relayoutBoundary=up3
I/flutter (12557):                ╎                       │     │ needs compositing
I/flutter (12557):                ╎                       │     │ creator: AnnotatedRegion<SystemUiOverlayStyle> ← Semantics ←
I/flutter (12557):                ╎                       │     │   AppBar ← FlexibleSpaceBarSettings ← ConstrainedBox ← MediaQuery
I/flutter (12557):                ╎                       │     │   ← LayoutId-[<_ScaffoldSlot.appBar>] ← CustomMultiChildLayout ←
I/flutter (12557):                ╎                       │     │   AnimatedBuilder ← DefaultTextStyle ← AnimatedDefaultTextStyle ←
I/flutter (12557):                ╎                       │     │   _InkFeatures-[GlobalKey#4f5f5 ink renderer] ← ⋯
I/flutter (12557):                ╎                       │     │ parentData: <none> (can use size)
I/flutter (12557):                ╎                       │     │ constraints: BoxConstraints(w=411.4, 0.0<=h<=80.0)
I/flutter (12557):                ╎                       │     │ size: Size(411.4, 80.0)
I/flutter (12557):                ╎                       │     │
I/flutter (12557):                ╎                       │     └─child: RenderPhysicalModel#97eba relayoutBoundary=up4
I/flutter (12557):                ╎                       │       │ needs compositing
I/flutter (12557):                ╎                       │       │ creator: PhysicalModel ← AnimatedPhysicalModel ← Material ←
I/flutter (12557):                ╎                       │       │   AnnotatedRegion<SystemUiOverlayStyle> ← Semantics ← AppBar ←
I/flutter (12557):                ╎                       │       │   FlexibleSpaceBarSettings ← ConstrainedBox ← MediaQuery ←
I/flutter (12557):                ╎                       │       │   LayoutId-[<_ScaffoldSlot.appBar>] ← CustomMultiChildLayout ←
I/flutter (12557):                ╎                       │       │   AnimatedBuilder ← ⋯
I/flutter (12557):                ╎                       │       │ parentData: <none> (can use size)
I/flutter (12557):                ╎                       │       │ constraints: BoxConstraints(w=411.4, 0.0<=h<=80.0)
I/flutter (12557):                ╎                       │       │ layer: PhysicalModelLayer#164da
I/flutter (12557):                ╎                       │       │ size: Size(411.4, 80.0)
I/flutter (12557):                ╎                       │       │ elevation: 4.0
I/flutter (12557):                ╎                       │       │ color: MaterialColor(primary value: Color(0xff2196f3))
I/flutter (12557):                ╎                       │       │ shadowColor: MaterialColor(primary value: Color(0xff2196f3))
I/flutter (12557):                ╎                       │       │ shape: BoxShape.rectangle
I/flutter (12557):                ╎                       │       │ borderRadius: BorderRadius.zero
I/flutter (12557):                ╎                       │       │
I/flutter (12557):                ╎                       │       └─child: _RenderInkFeatures#9169f relayoutBoundary=up5
I/flutter (12557):                ╎                       │         │ creator: _InkFeatures-[GlobalKey#06409 ink renderer] ←
I/flutter (12557):                ╎                       │         │   NotificationListener<LayoutChangedNotification> ← PhysicalModel
I/flutter (12557):                ╎                       │         │   ← AnimatedPhysicalModel ← Material ←
I/flutter (12557):                ╎                       │         │   AnnotatedRegion<SystemUiOverlayStyle> ← Semantics ← AppBar ←
I/flutter (12557):                ╎                       │         │   FlexibleSpaceBarSettings ← ConstrainedBox ← MediaQuery ←
I/flutter (12557):                ╎                       │         │   LayoutId-[<_ScaffoldSlot.appBar>] ← ⋯
I/flutter (12557):                ╎                       │         │ parentData: <none> (can use size)
I/flutter (12557):                ╎                       │         │ constraints: BoxConstraints(w=411.4, 0.0<=h<=80.0)
I/flutter (12557):                ╎                       │         │ size: Size(411.4, 80.0)
I/flutter (12557):                ╎                       │         │
I/flutter (12557):                ╎                       │         └─child: RenderSemanticsAnnotations#bd3dd relayoutBoundary=up6
I/flutter (12557):                ╎                       │           │ creator: Semantics ← DefaultTextStyle ← AnimatedDefaultTextStyle
I/flutter (12557):                ╎                       │           │   ← _InkFeatures-[GlobalKey#06409 ink renderer] ←
I/flutter (12557):                ╎                       │           │   NotificationListener<LayoutChangedNotification> ← PhysicalModel
I/flutter (12557):                ╎                       │           │   ← AnimatedPhysicalModel ← Material ←
I/flutter (12557):                ╎                       │           │   AnnotatedRegion<SystemUiOverlayStyle> ← Semantics ← AppBar ←
I/flutter (12557):                ╎                       │           │   FlexibleSpaceBarSettings ← ⋯
I/flutter (12557):                ╎                       │           │ parentData: <none> (can use size)
I/flutter (12557):                ╎                       │           │ constraints: BoxConstraints(w=411.4, 0.0<=h<=80.0)
I/flutter (12557):                ╎                       │           │ size: Size(411.4, 80.0)
I/flutter (12557):                ╎                       │           │
I/flutter (12557):                ╎                       │           └─child: RenderPositionedBox#a3bf2 relayoutBoundary=up7
I/flutter (12557):                ╎                       │             │ creator: Align ← Semantics ← DefaultTextStyle ←
I/flutter (12557):                ╎                       │             │   AnimatedDefaultTextStyle ← _InkFeatures-[GlobalKey#06409 ink
I/flutter (12557):                ╎                       │             │   renderer] ← NotificationListener<LayoutChangedNotification> ←
I/flutter (12557):                ╎                       │             │   PhysicalModel ← AnimatedPhysicalModel ← Material ←
I/flutter (12557):                ╎                       │             │   AnnotatedRegion<SystemUiOverlayStyle> ← Semantics ← AppBar ← ⋯
I/flutter (12557):                ╎                       │             │ parentData: <none> (can use size)
I/flutter (12557):                ╎                       │             │ constraints: BoxConstraints(w=411.4, 0.0<=h<=80.0)
I/flutter (12557):                ╎                       │             │ size: Size(411.4, 80.0)
I/flutter (12557):                ╎                       │             │ alignment: topCenter
I/flutter (12557):                ╎                       │             │ textDirection: ltr
I/flutter (12557):                ╎                       │             │ widthFactor: expand
I/flutter (12557):                ╎                       │             │ heightFactor: expand
I/flutter (12557):                ╎                       │             │
I/flutter (12557):                ╎                       │             └─child: RenderPadding#37ffe relayoutBoundary=up8
I/flutter (12557):                ╎                       │               │ creator: Padding ← SafeArea ← Align ← Semantics ←
I/flutter (12557):                ╎                       │               │   DefaultTextStyle ← AnimatedDefaultTextStyle ←
I/flutter (12557):                ╎                       │               │   _InkFeatures-[GlobalKey#06409 ink renderer] ←
I/flutter (12557):                ╎                       │               │   NotificationListener<LayoutChangedNotification> ← PhysicalModel
I/flutter (12557):                ╎                       │               │   ← AnimatedPhysicalModel ← Material ←
I/flutter (12557):                ╎                       │               │   AnnotatedRegion<SystemUiOverlayStyle> ← ⋯
I/flutter (12557):                ╎                       │               │ parentData: offset=Offset(0.0, 0.0) (can use size)
I/flutter (12557):                ╎                       │               │ constraints: BoxConstraints(0.0<=w<=411.4, 0.0<=h<=80.0)
I/flutter (12557):                ╎                       │               │ size: Size(411.4, 80.0)
I/flutter (12557):                ╎                       │               │ padding: EdgeInsets(0.0, 24.0, 0.0, 0.0)
I/flutter (12557):                ╎                       │               │ textDirection: ltr
I/flutter (12557):                ╎                       │               │
I/flutter (12557):                ╎                       │               └─child: RenderClipRect#501db relayoutBoundary=up9
I/flutter (12557):                ╎                       │                 │ creator: ClipRect ← MediaQuery ← Padding ← SafeArea ← Align ←
I/flutter (12557):                ╎                       │                 │   Semantics ← DefaultTextStyle ← AnimatedDefaultTextStyle ←
I/flutter (12557):                ╎                       │                 │   _InkFeatures-[GlobalKey#06409 ink renderer] ←
I/flutter (12557):                ╎                       │                 │   NotificationListener<LayoutChangedNotification> ← PhysicalModel
I/flutter (12557):                ╎                       │                 │   ← AnimatedPhysicalModel ← ⋯
I/flutter (12557):                ╎                       │                 │ parentData: offset=Offset(0.0, 24.0) (can use size)
I/flutter (12557):                ╎                       │                 │ constraints: BoxConstraints(0.0<=w<=411.4, 0.0<=h<=56.0)
I/flutter (12557):                ╎                       │                 │ size: Size(411.4, 56.0)
I/flutter (12557):                ╎                       │                 │
I/flutter (12557):                ╎                       │                 └─child: RenderCustomSingleChildLayoutBox#d2ac2 relayoutBoundary=up10
I/flutter (12557):                ╎                       │                   │ creator: CustomSingleChildLayout ← ClipRect ← MediaQuery ←
I/flutter (12557):                ╎                       │                   │   Padding ← SafeArea ← Align ← Semantics ← DefaultTextStyle ←
I/flutter (12557):                ╎                       │                   │   AnimatedDefaultTextStyle ← _InkFeatures-[GlobalKey#06409 ink
I/flutter (12557):                ╎                       │                   │   renderer] ← NotificationListener<LayoutChangedNotification> ←
I/flutter (12557):                ╎                       │                   │   PhysicalModel ← ⋯
I/flutter (12557):                ╎                       │                   │ parentData: <none> (can use size)
I/flutter (12557):                ╎                       │                   │ constraints: BoxConstraints(0.0<=w<=411.4, 0.0<=h<=56.0)
I/flutter (12557):                ╎                       │                   │ size: Size(411.4, 56.0)
I/flutter (12557):                ╎                       │                   │
I/flutter (12557):                ╎                       │                   └─child: RenderCustomMultiChildLayoutBox#21b4e relayoutBoundary=up11
I/flutter (12557):                ╎                       │                     │ creator: CustomMultiChildLayout ← NavigationToolbar ←
I/flutter (12557):                ╎                       │                     │   DefaultTextStyle ← IconTheme ← Builder ←
I/flutter (12557):                ╎                       │                     │   CustomSingleChildLayout ← ClipRect ← MediaQuery ← Padding ←
I/flutter (12557):                ╎                       │                     │   SafeArea ← Align ← Semantics ← ⋯
I/flutter (12557):                ╎                       │                     │ parentData: offset=Offset(0.0, 0.0) (can use size)
I/flutter (12557):                ╎                       │                     │ constraints: BoxConstraints(0.0<=w<=411.4, h=56.0)
I/flutter (12557):                ╎                       │                     │ size: Size(411.4, 56.0)
I/flutter (12557):                ╎                       │                     │
I/flutter (12557):                ╎                       │                     └─child 1: RenderSemanticsAnnotations#ca2bf relayoutBoundary=up12
I/flutter (12557):                ╎                       │                       │ creator: Semantics ← DefaultTextStyle ←
I/flutter (12557):                ╎                       │                       │   LayoutId-[<_ToolbarSlot.middle>] ← CustomMultiChildLayout ←
I/flutter (12557):                ╎                       │                       │   NavigationToolbar ← DefaultTextStyle ← IconTheme ← Builder ←
I/flutter (12557):                ╎                       │                       │   CustomSingleChildLayout ← ClipRect ← MediaQuery ← Padding ← ⋯
I/flutter (12557):                ╎                       │                       │ parentData: offset=Offset(16.0, 16.5); id=_ToolbarSlot.middle
I/flutter (12557):                ╎                       │                       │   (can use size)
I/flutter (12557):                ╎                       │                       │ constraints: BoxConstraints(0.0<=w<=379.4, 0.0<=h<=56.0)
I/flutter (12557):                ╎                       │                       │ size: Size(226.0, 23.0)
I/flutter (12557):                ╎                       │                       │
I/flutter (12557):                ╎                       │                       └─child: _RenderAppBarTitleBox#063d2 relayoutBoundary=up13
I/flutter (12557):                ╎                       │                         │ creator: _AppBarTitleBox ← Semantics ← DefaultTextStyle ←
I/flutter (12557):                ╎                       │                         │   LayoutId-[<_ToolbarSlot.middle>] ← CustomMultiChildLayout ←
I/flutter (12557):                ╎                       │                         │   NavigationToolbar ← DefaultTextStyle ← IconTheme ← Builder ←
I/flutter (12557):                ╎                       │                         │   CustomSingleChildLayout ← ClipRect ← MediaQuery ← ⋯
I/flutter (12557):                ╎                       │                         │ parentData: <none> (can use size)
I/flutter (12557):                ╎                       │                         │ constraints: BoxConstraints(0.0<=w<=379.4, 0.0<=h<=56.0)
I/flutter (12557):                ╎                       │                         │ size: Size(226.0, 23.0)
I/flutter (12557):                ╎                       │                         │ alignment: center
I/flutter (12557):                ╎                       │                         │ textDirection: ltr
I/flutter (12557):                ╎                       │                         │
I/flutter (12557):                ╎                       │                         └─child: RenderParagraph#be9c8 relayoutBoundary=up14
I/flutter (12557):                ╎                       │                           │ creator: RichText ← Text ← _AppBarTitleBox ← Semantics ←
I/flutter (12557):                ╎                       │                           │   DefaultTextStyle ← LayoutId-[<_ToolbarSlot.middle>] ←
I/flutter (12557):                ╎                       │                           │   CustomMultiChildLayout ← NavigationToolbar ← DefaultTextStyle ←
I/flutter (12557):                ╎                       │                           │   IconTheme ← Builder ← CustomSingleChildLayout ← ⋯
I/flutter (12557):                ╎                       │                           │ parentData: offset=Offset(0.0, 0.0) (can use size)
I/flutter (12557):                ╎                       │                           │ constraints: BoxConstraints(0.0<=w<=379.4, 0.0<=h<=Infinity)
I/flutter (12557):                ╎                       │                           │ size: Size(226.0, 23.0)
I/flutter (12557):                ╎                       │                           │ textAlign: start
I/flutter (12557):                ╎                       │                           │ textDirection: ltr
I/flutter (12557):                ╎                       │                           │ softWrap: no wrapping except at line break characters
I/flutter (12557):                ╎                       │                           │ overflow: ellipsis
I/flutter (12557):                ╎                       │                           │ locale: en_US
I/flutter (12557):                ╎                       │                           │ maxLines: unlimited
I/flutter (12557):                ╎                       │                           ╘═╦══ text ═══
I/flutter (12557):                ╎                       │                             ║ TextSpan:
I/flutter (12557):                ╎                       │                             ║   debugLabel: (englishLike title 2014).merge(whiteMountainView
I/flutter (12557):                ╎                       │                             ║     title)
I/flutter (12557):                ╎                       │                             ║   inherit: false
I/flutter (12557):                ╎                       │                             ║   color: Color(0xffffffff)
I/flutter (12557):                ╎                       │                             ║   family: Roboto
I/flutter (12557):                ╎                       │                             ║   size: 20.0
I/flutter (12557):                ╎                       │                             ║   weight: 500
I/flutter (12557):                ╎                       │                             ║   baseline: alphabetic
I/flutter (12557):                ╎                       │                             ║   decoration: TextDecoration.none
I/flutter (12557):                ╎                       │                             ║   "Flutter Demo Home Page"
I/flutter (12557):                ╎                       │                             ╚═══════════
I/flutter (12557):                ╎                       └─child 3: RenderStack#891db relayoutBoundary=up1
I/flutter (12557):                ╎                         │ needs compositing
I/flutter (12557):                ╎                         │ creator: Stack ← _FloatingActionButtonTransition ← MediaQuery ←
I/flutter (12557):                ╎                         │   LayoutId-[<_ScaffoldSlot.floatingActionButton>] ←
I/flutter (12557):                ╎                         │   CustomMultiChildLayout ← AnimatedBuilder ← DefaultTextStyle ←
I/flutter (12557):                ╎                         │   AnimatedDefaultTextStyle ← _InkFeatures-[GlobalKey#4f5f5 ink
I/flutter (12557):                ╎                         │   renderer] ← NotificationListener<LayoutChangedNotification> ←
I/flutter (12557):                ╎                         │   PhysicalModel ← AnimatedPhysicalModel ← ⋯
I/flutter (12557):                ╎                         │ parentData: offset=Offset(339.4, 611.4);
I/flutter (12557):                ╎                         │   id=_ScaffoldSlot.floatingActionButton (can use size)
I/flutter (12557):                ╎                         │ constraints: BoxConstraints(0.0<=w<=411.4, 0.0<=h<=683.4)
I/flutter (12557):                ╎                         │ size: Size(56.0, 56.0)
I/flutter (12557):                ╎                         │ alignment: centerRight
I/flutter (12557):                ╎                         │ textDirection: ltr
I/flutter (12557):                ╎                         │ fit: loose
I/flutter (12557):                ╎                         │ overflow: clip
I/flutter (12557):                ╎                         │
I/flutter (12557):                ╎                         └─child 1: RenderTransform#aa844 relayoutBoundary=up2
I/flutter (12557):                ╎                           │ needs compositing
I/flutter (12557):                ╎                           │ creator: Transform ← ScaleTransition ← Stack ←
I/flutter (12557):                ╎                           │   _FloatingActionButtonTransition ← MediaQuery ←
I/flutter (12557):                ╎                           │   LayoutId-[<_ScaffoldSlot.floatingActionButton>] ←
I/flutter (12557):                ╎                           │   CustomMultiChildLayout ← AnimatedBuilder ← DefaultTextStyle ←
I/flutter (12557):                ╎                           │   AnimatedDefaultTextStyle ← _InkFeatures-[GlobalKey#4f5f5 ink
I/flutter (12557):                ╎                           │   renderer] ← NotificationListener<LayoutChangedNotification> ← ⋯
I/flutter (12557):                ╎                           │ parentData: not positioned; offset=Offset(0.0, 0.0) (can use
I/flutter (12557):                ╎                           │   size)
I/flutter (12557):                ╎                           │ constraints: BoxConstraints(0.0<=w<=411.4, 0.0<=h<=683.4)
I/flutter (12557):                ╎                           │ size: Size(56.0, 56.0)
I/flutter (12557):                ╎                           │ transform matrix:
I/flutter (12557):                ╎                           │   [0] 1.0,0.0,0.0,0.0
I/flutter (12557):                ╎                           │   [1] 0.0,1.0,0.0,0.0
I/flutter (12557):                ╎                           │   [2] 0.0,0.0,1.0,0.0
I/flutter (12557):                ╎                           │   [3] 0.0,0.0,0.0,1.0
I/flutter (12557):                ╎                           │ origin: null
I/flutter (12557):                ╎                           │ alignment: center
I/flutter (12557):                ╎                           │ textDirection: ltr
I/flutter (12557):                ╎                           │ transformHitTests: true
I/flutter (12557):                ╎                           │
I/flutter (12557):                ╎                           └─child: RenderTransform#393ed relayoutBoundary=up3
I/flutter (12557):                ╎                             │ needs compositing
I/flutter (12557):                ╎                             │ creator: Transform ← RotationTransition ← Transform ←
I/flutter (12557):                ╎                             │   ScaleTransition ← Stack ← _FloatingActionButtonTransition ←
I/flutter (12557):                ╎                             │   MediaQuery ← LayoutId-[<_ScaffoldSlot.floatingActionButton>] ←
I/flutter (12557):                ╎                             │   CustomMultiChildLayout ← AnimatedBuilder ← DefaultTextStyle ←
I/flutter (12557):                ╎                             │   AnimatedDefaultTextStyle ← ⋯
I/flutter (12557):                ╎                             │ parentData: <none> (can use size)
I/flutter (12557):                ╎                             │ constraints: BoxConstraints(0.0<=w<=411.4, 0.0<=h<=683.4)
I/flutter (12557):                ╎                             │ layer: TransformLayer#7f686
I/flutter (12557):                ╎                             │ size: Size(56.0, 56.0)
I/flutter (12557):                ╎                             │ transform matrix:
I/flutter (12557):                ╎                             │   [0] 1.0,0.0,0.0,0.0
I/flutter (12557):                ╎                             │   [1] -0.0,1.0,0.0,0.0
I/flutter (12557):                ╎                             │   [2] 0.0,0.0,1.0,0.0
I/flutter (12557):                ╎                             │   [3] 0.0,0.0,0.0,1.0
I/flutter (12557):                ╎                             │ origin: null
I/flutter (12557):                ╎                             │ alignment: center
I/flutter (12557):                ╎                             │ textDirection: ltr
I/flutter (12557):                ╎                             │ transformHitTests: true
I/flutter (12557):                ╎                             │
I/flutter (12557):                ╎                             └─child: RenderMergeSemantics#8bb5f relayoutBoundary=up4
I/flutter (12557):                ╎                               │ needs compositing
I/flutter (12557):                ╎                               │ creator: MergeSemantics ← FloatingActionButton ← Transform ←
I/flutter (12557):                ╎                               │   RotationTransition ← Transform ← ScaleTransition ← Stack ←
I/flutter (12557):                ╎                               │   _FloatingActionButtonTransition ← MediaQuery ←
I/flutter (12557):                ╎                               │   LayoutId-[<_ScaffoldSlot.floatingActionButton>] ←
I/flutter (12557):                ╎                               │   CustomMultiChildLayout ← AnimatedBuilder ← ⋯
I/flutter (12557):                ╎                               │ parentData: <none> (can use size)
I/flutter (12557):                ╎                               │ constraints: BoxConstraints(0.0<=w<=411.4, 0.0<=h<=683.4)
I/flutter (12557):                ╎                               │ semantic boundary
I/flutter (12557):                ╎                               │ size: Size(56.0, 56.0)
I/flutter (12557):                ╎                               │
I/flutter (12557):                ╎                               └─child: RenderConstrainedBox#04470 relayoutBoundary=up5
I/flutter (12557):                ╎                                 │ needs compositing
I/flutter (12557):                ╎                                 │ creator: SizedBox ← Hero ← MergeSemantics ← FloatingActionButton
I/flutter (12557):                ╎                                 │   ← Transform ← RotationTransition ← Transform ← ScaleTransition
I/flutter (12557):                ╎                                 │   ← Stack ← _FloatingActionButtonTransition ← MediaQuery ←
I/flutter (12557):                ╎                                 │   LayoutId-[<_ScaffoldSlot.floatingActionButton>] ← ⋯
I/flutter (12557):                ╎                                 │ parentData: <none> (can use size)
I/flutter (12557):                ╎                                 │ constraints: BoxConstraints(0.0<=w<=411.4, 0.0<=h<=683.4)
I/flutter (12557):                ╎                                 │ size: Size(56.0, 56.0)
I/flutter (12557):                ╎                                 │ additionalConstraints: BoxConstraints(unconstrained)
I/flutter (12557):                ╎                                 │
I/flutter (12557):                ╎                                 └─child: RenderOffstage#5f71e relayoutBoundary=up6
I/flutter (12557):                ╎                                   │ needs compositing
I/flutter (12557):                ╎                                   │ creator: Offstage ← SizedBox ← Hero ← MergeSemantics ←
I/flutter (12557):                ╎                                   │   FloatingActionButton ← Transform ← RotationTransition ←
I/flutter (12557):                ╎                                   │   Transform ← ScaleTransition ← Stack ←
I/flutter (12557):                ╎                                   │   _FloatingActionButtonTransition ← MediaQuery ← ⋯
I/flutter (12557):                ╎                                   │ parentData: <none> (can use size)
I/flutter (12557):                ╎                                   │ constraints: BoxConstraints(0.0<=w<=411.4, 0.0<=h<=683.4)
I/flutter (12557):                ╎                                   │ size: Size(56.0, 56.0)
I/flutter (12557):                ╎                                   │ offstage: false
I/flutter (12557):                ╎                                   │
I/flutter (12557):                ╎                                   └─child: RenderPointerListener#78c8a relayoutBoundary=up7
I/flutter (12557):                ╎                                     │ needs compositing
I/flutter (12557):                ╎                                     │ creator: _PointerListener ← Listener ← RawGestureDetector ←
I/flutter (12557):                ╎                                     │   GestureDetector ← Tooltip ← KeyedSubtree-[GlobalKey#dde2c] ←
I/flutter (12557):                ╎                                     │   TickerMode ← Offstage ← SizedBox ← Hero ← MergeSemantics ←
I/flutter (12557):                ╎                                     │   FloatingActionButton ← ⋯
I/flutter (12557):                ╎                                     │ parentData: <none> (can use size)
I/flutter (12557):                ╎                                     │ constraints: BoxConstraints(0.0<=w<=411.4, 0.0<=h<=683.4)
I/flutter (12557):                ╎                                     │ size: Size(56.0, 56.0)
I/flutter (12557):                ╎                                     │ behavior: opaque
I/flutter (12557):                ╎                                     │ listeners: down
I/flutter (12557):                ╎                                     │
I/flutter (12557):                ╎                                     └─child: RenderSemanticsAnnotations#15e7e relayoutBoundary=up8
I/flutter (12557):                ╎                                       │ needs compositing
I/flutter (12557):                ╎                                       │ creator: Semantics ← _PointerListener ← Listener ←
I/flutter (12557):                ╎                                       │   RawGestureDetector ← GestureDetector ← Tooltip ←
I/flutter (12557):                ╎                                       │   KeyedSubtree-[GlobalKey#dde2c] ← TickerMode ← Offstage ←
I/flutter (12557):                ╎                                       │   SizedBox ← Hero ← MergeSemantics ← ⋯
I/flutter (12557):                ╎                                       │ parentData: <none> (can use size)
I/flutter (12557):                ╎                                       │ constraints: BoxConstraints(0.0<=w<=411.4, 0.0<=h<=683.4)
I/flutter (12557):                ╎                                       │ size: Size(56.0, 56.0)
I/flutter (12557):                ╎                                       │
I/flutter (12557):                ╎                                       └─child: RenderSemanticsAnnotations#77142 relayoutBoundary=up9
I/flutter (12557):                ╎                                         │ needs compositing
I/flutter (12557):                ╎                                         │ creator: Semantics ← RawMaterialButton ← Semantics ←
I/flutter (12557):                ╎                                         │   _PointerListener ← Listener ← RawGestureDetector ←
I/flutter (12557):                ╎                                         │   GestureDetector ← Tooltip ← KeyedSubtree-[GlobalKey#dde2c] ←
I/flutter (12557):                ╎                                         │   TickerMode ← Offstage ← SizedBox ← ⋯
I/flutter (12557):                ╎                                         │ parentData: <none> (can use size)
I/flutter (12557):                ╎                                         │ constraints: BoxConstraints(0.0<=w<=411.4, 0.0<=h<=683.4)
I/flutter (12557):                ╎                                         │ semantic boundary
I/flutter (12557):                ╎                                         │ size: Size(56.0, 56.0)
I/flutter (12557):                ╎                                         │
I/flutter (12557):                ╎                                         └─child: _RenderInputPadding#c1598 relayoutBoundary=up10
I/flutter (12557):                ╎                                           │ needs compositing
I/flutter (12557):                ╎                                           │ creator: _InputPadding ← Semantics ← RawMaterialButton ←
I/flutter (12557):                ╎                                           │   Semantics ← _PointerListener ← Listener ← RawGestureDetector ←
I/flutter (12557):                ╎                                           │   GestureDetector ← Tooltip ← KeyedSubtree-[GlobalKey#dde2c] ←
I/flutter (12557):                ╎                                           │   TickerMode ← Offstage ← ⋯
I/flutter (12557):                ╎                                           │ parentData: <none> (can use size)
I/flutter (12557):                ╎                                           │ constraints: BoxConstraints(0.0<=w<=411.4, 0.0<=h<=683.4)
I/flutter (12557):                ╎                                           │ size: Size(56.0, 56.0)
I/flutter (12557):                ╎                                           │
I/flutter (12557):                ╎                                           └─child: RenderConstrainedBox#8dd4a relayoutBoundary=up11
I/flutter (12557):                ╎                                             │ needs compositing
I/flutter (12557):                ╎                                             │ creator: ConstrainedBox ← _InputPadding ← Semantics ←
I/flutter (12557):                ╎                                             │   RawMaterialButton ← Semantics ← _PointerListener ← Listener ←
I/flutter (12557):                ╎                                             │   RawGestureDetector ← GestureDetector ← Tooltip ←
I/flutter (12557):                ╎                                             │   KeyedSubtree-[GlobalKey#dde2c] ← TickerMode ← ⋯
I/flutter (12557):                ╎                                             │ parentData: offset=Offset(0.0, 0.0) (can use size)
I/flutter (12557):                ╎                                             │ constraints: BoxConstraints(0.0<=w<=411.4, 0.0<=h<=683.4)
I/flutter (12557):                ╎                                             │ size: Size(56.0, 56.0)
I/flutter (12557):                ╎                                             │ additionalConstraints: BoxConstraints(w=56.0, h=56.0)
I/flutter (12557):                ╎                                             │
I/flutter (12557):                ╎                                             └─child: RenderPhysicalShape#c0a63
I/flutter (12557):                ╎                                               │ needs compositing
I/flutter (12557):                ╎                                               │ creator: PhysicalShape ← _MaterialInterior ← Material ←
I/flutter (12557):                ╎                                               │   ConstrainedBox ← _InputPadding ← Semantics ← RawMaterialButton
I/flutter (12557):                ╎                                               │   ← Semantics ← _PointerListener ← Listener ← RawGestureDetector
I/flutter (12557):                ╎                                               │   ← GestureDetector ← ⋯
I/flutter (12557):                ╎                                               │ parentData: <none> (can use size)
I/flutter (12557):                ╎                                               │ constraints: BoxConstraints(w=56.0, h=56.0)
I/flutter (12557):                ╎                                               │ layer: PhysicalModelLayer#8ca72
I/flutter (12557):                ╎                                               │ size: Size(56.0, 56.0)
I/flutter (12557):                ╎                                               │ elevation: 6.0
I/flutter (12557):                ╎                                               │ color: Color(0xff2196f3)
I/flutter (12557):                ╎                                               │ shadowColor: Color(0xff2196f3)
I/flutter (12557):                ╎                                               │ clipper: ShapeBorderClipper
I/flutter (12557):                ╎                                               │
I/flutter (12557):                ╎                                               └─child: RenderCustomPaint#5b171
I/flutter (12557):                ╎                                                 │ creator: CustomPaint ← _ShapeBorderPaint ← PhysicalShape ←
I/flutter (12557):                ╎                                                 │   _MaterialInterior ← Material ← ConstrainedBox ← _InputPadding ←
I/flutter (12557):                ╎                                                 │   Semantics ← RawMaterialButton ← Semantics ← _PointerListener ←
I/flutter (12557):                ╎                                                 │   Listener ← ⋯
I/flutter (12557):                ╎                                                 │ parentData: <none> (can use size)
I/flutter (12557):                ╎                                                 │ constraints: BoxConstraints(w=56.0, h=56.0)
I/flutter (12557):                ╎                                                 │ size: Size(56.0, 56.0)
I/flutter (12557):                ╎                                                 │
I/flutter (12557):                ╎                                                 └─child: _RenderInkFeatures#91d5e
I/flutter (12557):                ╎                                                   │ creator: _InkFeatures-[GlobalKey#8d401 ink renderer] ←
I/flutter (12557):                ╎                                                   │   NotificationListener<LayoutChangedNotification> ← CustomPaint ←
I/flutter (12557):                ╎                                                   │   _ShapeBorderPaint ← PhysicalShape ← _MaterialInterior ←
I/flutter (12557):                ╎                                                   │   Material ← ConstrainedBox ← _InputPadding ← Semantics ←
I/flutter (12557):                ╎                                                   │   RawMaterialButton ← Semantics ← ⋯
I/flutter (12557):                ╎                                                   │ parentData: <none> (can use size)
I/flutter (12557):                ╎                                                   │ constraints: BoxConstraints(w=56.0, h=56.0)
I/flutter (12557):                ╎                                                   │ size: Size(56.0, 56.0)
I/flutter (12557):                ╎                                                   │
I/flutter (12557):                ╎                                                   └─child: RenderSemanticsAnnotations#11511
I/flutter (12557):                ╎                                                     │ creator: Semantics ← _FocusMarker ← Focus ← Actions ← InkWell ←
I/flutter (12557):                ╎                                                     │   DefaultTextStyle ← AnimatedDefaultTextStyle ←
I/flutter (12557):                ╎                                                     │   _InkFeatures-[GlobalKey#8d401 ink renderer] ←
I/flutter (12557):                ╎                                                     │   NotificationListener<LayoutChangedNotification> ← CustomPaint ←
I/flutter (12557):                ╎                                                     │   _ShapeBorderPaint ← PhysicalShape ← ⋯
I/flutter (12557):                ╎                                                     │ parentData: <none> (can use size)
I/flutter (12557):                ╎                                                     │ constraints: BoxConstraints(w=56.0, h=56.0)
I/flutter (12557):                ╎                                                     │ size: Size(56.0, 56.0)
I/flutter (12557):                ╎                                                     │
I/flutter (12557):                ╎                                                     └─child: RenderMouseRegion#831af
I/flutter (12557):                ╎                                                       │ creator: MouseRegion ← Semantics ← _FocusMarker ← Focus ← Actions
I/flutter (12557):                ╎                                                       │   ← InkWell ← DefaultTextStyle ← AnimatedDefaultTextStyle ←
I/flutter (12557):                ╎                                                       │   _InkFeatures-[GlobalKey#8d401 ink renderer] ←
I/flutter (12557):                ╎                                                       │   NotificationListener<LayoutChangedNotification> ← CustomPaint ←
I/flutter (12557):                ╎                                                       │   _ShapeBorderPaint ← ⋯
I/flutter (12557):                ╎                                                       │ parentData: <none> (can use size)
I/flutter (12557):                ╎                                                       │ constraints: BoxConstraints(w=56.0, h=56.0)
I/flutter (12557):                ╎                                                       │ size: Size(56.0, 56.0)
I/flutter (12557):                ╎                                                       │ listeners: enter, exit
I/flutter (12557):                ╎                                                       │
I/flutter (12557):                ╎                                                       └─child: RenderSemanticsGestureHandler#78f72
I/flutter (12557):                ╎                                                         │ creator: _GestureSemantics ← RawGestureDetector ← GestureDetector
I/flutter (12557):                ╎                                                         │   ← MouseRegion ← Semantics ← _FocusMarker ← Focus ← Actions ←
I/flutter (12557):                ╎                                                         │   InkWell ← DefaultTextStyle ← AnimatedDefaultTextStyle ←
I/flutter (12557):                ╎                                                         │   _InkFeatures-[GlobalKey#8d401 ink renderer] ← ⋯
I/flutter (12557):                ╎                                                         │ parentData: <none> (can use size)
I/flutter (12557):                ╎                                                         │ constraints: BoxConstraints(w=56.0, h=56.0)
I/flutter (12557):                ╎                                                         │ size: Size(56.0, 56.0)
I/flutter (12557):                ╎                                                         │ gestures: tap
I/flutter (12557):                ╎                                                         │
I/flutter (12557):                ╎                                                         └─child: RenderPointerListener#53414
I/flutter (12557):                ╎                                                           │ creator: _PointerListener ← Listener ← _GestureSemantics ←
I/flutter (12557):                ╎                                                           │   RawGestureDetector ← GestureDetector ← MouseRegion ← Semantics
I/flutter (12557):                ╎                                                           │   ← _FocusMarker ← Focus ← Actions ← InkWell ← DefaultTextStyle ←
I/flutter (12557):                ╎                                                           │   ⋯
I/flutter (12557):                ╎                                                           │ parentData: <none> (can use size)
I/flutter (12557):                ╎                                                           │ constraints: BoxConstraints(w=56.0, h=56.0)
I/flutter (12557):                ╎                                                           │ size: Size(56.0, 56.0)
I/flutter (12557):                ╎                                                           │ behavior: opaque
I/flutter (12557):                ╎                                                           │ listeners: down
I/flutter (12557):                ╎                                                           │
I/flutter (12557):                ╎                                                           └─child: RenderPadding#8804c
I/flutter (12557):                ╎                                                             │ creator: Padding ← Container ← IconTheme ← Builder ←
I/flutter (12557):                ╎                                                             │   _PointerListener ← Listener ← _GestureSemantics ←
I/flutter (12557):                ╎                                                             │   RawGestureDetector ← GestureDetector ← MouseRegion ← Semantics
I/flutter (12557):                ╎                                                             │   ← _FocusMarker ← ⋯
I/flutter (12557):                ╎                                                             │ parentData: <none> (can use size)
I/flutter (12557):                ╎                                                             │ constraints: BoxConstraints(w=56.0, h=56.0)
I/flutter (12557):                ╎                                                             │ size: Size(56.0, 56.0)
I/flutter (12557):                ╎                                                             │ padding: EdgeInsets.zero
I/flutter (12557):                ╎                                                             │ textDirection: ltr
I/flutter (12557):                ╎                                                             │
I/flutter (12557):                ╎                                                             └─child: RenderPositionedBox#7069f
I/flutter (12557):                ╎                                                               │ creator: Center ← Padding ← Container ← IconTheme ← Builder ←
I/flutter (12557):                ╎                                                               │   _PointerListener ← Listener ← _GestureSemantics ←
I/flutter (12557):                ╎                                                               │   RawGestureDetector ← GestureDetector ← MouseRegion ← Semantics
I/flutter (12557):                ╎                                                               │   ← ⋯
I/flutter (12557):                ╎                                                               │ parentData: offset=Offset(0.0, 0.0) (can use size)
I/flutter (12557):                ╎                                                               │ constraints: BoxConstraints(w=56.0, h=56.0)
I/flutter (12557):                ╎                                                               │ size: Size(56.0, 56.0)
I/flutter (12557):                ╎                                                               │ alignment: center
I/flutter (12557):                ╎                                                               │ textDirection: ltr
I/flutter (12557):                ╎                                                               │ widthFactor: 1.0
I/flutter (12557):                ╎                                                               │ heightFactor: 1.0
I/flutter (12557):                ╎                                                               │
I/flutter (12557):                ╎                                                               └─child: RenderSemanticsAnnotations#22c22 relayoutBoundary=up1
I/flutter (12557):                ╎                                                                 │ creator: Semantics ← Icon ← Center ← Padding ← Container ←
I/flutter (12557):                ╎                                                                 │   IconTheme ← Builder ← _PointerListener ← Listener ←
I/flutter (12557):                ╎                                                                 │   _GestureSemantics ← RawGestureDetector ← GestureDetector ← ⋯
I/flutter (12557):                ╎                                                                 │ parentData: offset=Offset(16.0, 16.0) (can use size)
I/flutter (12557):                ╎                                                                 │ constraints: BoxConstraints(0.0<=w<=56.0, 0.0<=h<=56.0)
I/flutter (12557):                ╎                                                                 │ size: Size(24.0, 24.0)
I/flutter (12557):                ╎                                                                 │
I/flutter (12557):                ╎                                                                 └─child: RenderExcludeSemantics#22367 relayoutBoundary=up2
I/flutter (12557):                ╎                                                                   │ creator: ExcludeSemantics ← Semantics ← Icon ← Center ← Padding ←
I/flutter (12557):                ╎                                                                   │   Container ← IconTheme ← Builder ← _PointerListener ← Listener ←
I/flutter (12557):                ╎                                                                   │   _GestureSemantics ← RawGestureDetector ← ⋯
I/flutter (12557):                ╎                                                                   │ parentData: <none> (can use size)
I/flutter (12557):                ╎                                                                   │ constraints: BoxConstraints(0.0<=w<=56.0, 0.0<=h<=56.0)
I/flutter (12557):                ╎                                                                   │ size: Size(24.0, 24.0)
I/flutter (12557):                ╎                                                                   │ excluding: true
I/flutter (12557):                ╎                                                                   │
I/flutter (12557):                ╎                                                                   └─child: RenderConstrainedBox#eeee1 relayoutBoundary=up3
I/flutter (12557):                ╎                                                                     │ creator: SizedBox ← ExcludeSemantics ← Semantics ← Icon ← Center
I/flutter (12557):                ╎                                                                     │   ← Padding ← Container ← IconTheme ← Builder ← _PointerListener
I/flutter (12557):                ╎                                                                     │   ← Listener ← _GestureSemantics ← ⋯
I/flutter (12557):                ╎                                                                     │ parentData: <none> (can use size)
I/flutter (12557):                ╎                                                                     │ constraints: BoxConstraints(0.0<=w<=56.0, 0.0<=h<=56.0)
I/flutter (12557):                ╎                                                                     │ size: Size(24.0, 24.0)
I/flutter (12557):                ╎                                                                     │ additionalConstraints: BoxConstraints(w=24.0, h=24.0)
I/flutter (12557):                ╎                                                                     │
I/flutter (12557):                ╎                                                                     └─child: RenderPositionedBox#5a4a0
I/flutter (12557):                ╎                                                                       │ creator: Center ← SizedBox ← ExcludeSemantics ← Semantics ← Icon
I/flutter (12557):                ╎                                                                       │   ← Center ← Padding ← Container ← IconTheme ← Builder ←
I/flutter (12557):                ╎                                                                       │   _PointerListener ← Listener ← ⋯
I/flutter (12557):                ╎                                                                       │ parentData: <none> (can use size)
I/flutter (12557):                ╎                                                                       │ constraints: BoxConstraints(w=24.0, h=24.0)
I/flutter (12557):                ╎                                                                       │ size: Size(24.0, 24.0)
I/flutter (12557):                ╎                                                                       │ alignment: center
I/flutter (12557):                ╎                                                                       │ textDirection: ltr
I/flutter (12557):                ╎                                                                       │ widthFactor: expand
I/flutter (12557):                ╎                                                                       │ heightFactor: expand
I/flutter (12557):                ╎                                                                       │
I/flutter (12557):                ╎                                                                       └─child: RenderParagraph#b5e01 relayoutBoundary=up1
I/flutter (12557):                ╎                                                                         │ creator: RichText ← Center ← SizedBox ← ExcludeSemantics ←
I/flutter (12557):                ╎                                                                         │   Semantics ← Icon ← Center ← Padding ← Container ← IconTheme ←
I/flutter (12557):                ╎                                                                         │   Builder ← _PointerListener ← ⋯
I/flutter (12557):                ╎                                                                         │ parentData: offset=Offset(0.0, 0.0) (can use size)
I/flutter (12557):                ╎                                                                         │ constraints: BoxConstraints(0.0<=w<=24.0, 0.0<=h<=24.0)
I/flutter (12557):                ╎                                                                         │ size: Size(24.0, 24.0)
I/flutter (12557):                ╎                                                                         │ textAlign: start
I/flutter (12557):                ╎                                                                         │ textDirection: ltr
I/flutter (12557):                ╎                                                                         │ softWrap: wrapping at box width
I/flutter (12557):                ╎                                                                         │ overflow: visible
I/flutter (12557):                ╎                                                                         │ locale: en_US
I/flutter (12557):                ╎                                                                         │ maxLines: unlimited
I/flutter (12557):                ╎                                                                         ╘═╦══ text ═══
I/flutter (12557):                ╎                                                                           ║ TextSpan:
I/flutter (12557):                ╎                                                                           ║   inherit: false
I/flutter (12557):                ╎                                                                           ║   color: Color(0xffffffff)
I/flutter (12557):                ╎                                                                           ║   family: MaterialIcons
I/flutter (12557):                ╎                                                                           ║   size: 24.0
I/flutter (12557):                ╎                                                                           ║   ""
I/flutter (12557):                ╎                                                                           ╚═══════════
I/flutter (12557):                └╌no offstage children
I/flutter (12557):

🔥  To hot reload changes while running, press "r". To hot restart (and rebuild state), press "R".
An Observatory debugger and profiler on Android SDK built for x86 is available at: http://127.0.0.1:52339/r9zJ5-RoZUI=/
You can dump the widget hierarchy of the app (debugDumpApp) by pressing "w".
To dump the rendering tree of the app (debugDumpRenderTree), press "t".
For layers (debugDumpLayerTree), use "L"; for accessibility (debugDumpSemantics), use "S" (for traversal order) or "U" (for inverse hit test order).
To toggle the widget inspector (WidgetsApp.showWidgetInspectorOverride), press "i".
To toggle the display of construction lines (debugPaintSizeEnabled), press "p".
To simulate different operating systems, (defaultTargetPlatform), press "o".
To toggle the elevation checker, press "z".
To display the performance overlay (WidgetsApp.showPerformanceOverlay), press "P".
To enable timeline events for all widget build methods, (debugProfileWidgetBuilds), press "a"
To save a screenshot to flutter.png, press "s".
To repeat this help message, press "h". To detach, press "d"; to quit, press "q".

Switched operating system to iOS








Taking screenshot for Android SDK built for x86...                      
 3,313ms (!)                                       
Screenshot written to flutter_01.png (53kB).

I/flutter (12557): WidgetsFlutterBinding - CHECKED MODE
I/flutter (12557): [root](renderObject: RenderView#bee0c)
I/flutter (12557): └MyApp
I/flutter (12557):  └MaterialApp(state: _MaterialAppState#7ac03)
I/flutter (12557):   └ScrollConfiguration(behavior: _MaterialScrollBehavior)
I/flutter (12557):    └WidgetsApp-[GlobalObjectKey _MaterialAppState#7ac03](state: _WidgetsAppState#d96c5)
I/flutter (12557):     └Shortcuts(manager: null, shortcuts: {LogicalKeySet#2c1db(keys: {LogicalKeyboardKey#7002b(keyId: "0x10007002b", keyLabel: null, debugName: "Tab")}): Intent#2bbec(key: [<NextFocusAction>]), LogicalKeySet#1212e(keys: {LogicalKeyboardKey#700e1(keyId: "0x201000700e1", keyLabel: null, debugName: "Shift"), LogicalKeyboardKey#7002b(keyId: "0x10007002b", keyLabel: null, debugName: "Tab")}): Intent#162b0(key: [<PreviousFocusAction>]), LogicalKeySet#56cb4(keys: {LogicalKeyboardKey#70050(keyId: "0x100070050", keyLabel: null, debugName: "Arrow Left")}): DirectionalFocusIntent#cb273(key: [<DirectionalFocusAction>]), LogicalKeySet#0058e(keys: {LogicalKeyboardKey#7004f(keyId: "0x10007004f", keyLabel: null, debugName: "Arrow Right")}): DirectionalFocusIntent#f0208(key: [<DirectionalFocusAction>]), LogicalKeySet#40831(keys: {LogicalKeyboardKey#70051(keyId: "0x100070051", keyLabel: null, debugName: "Arrow Down")}): DirectionalFocusIntent#1c204(key: [<DirectionalFocusAction>]), LogicalKeySet#a327d(keys: {LogicalKeyboardK
I/flutter (12557):      └Focus(debugLabel: "Shortcuts", state: _FocusState#1091c)
I/flutter (12557):       └_FocusMarker
I/flutter (12557):        └Semantics(container: false, properties: SemanticsProperties, label: null, value: null, hint: null, hintOverrides: null, renderObject: RenderSemanticsAnnotations#c36d3)
I/flutter (12557):         └_ShortcutsMarker
I/flutter (12557):          └Actions(dispatcher: null, actions: {[<DoNothingAction>]: Closure: () => DoNothingAction, [<RequestFocusAction>]: Closure: () => RequestFocusAction, [<NextFocusAction>]: Closure: () => NextFocusAction, [<PreviousFocusAction>]: Closure: () => PreviousFocusAction, [<DirectionalFocusAction>]: Closure: () => DirectionalFocusAction})
I/flutter (12557):           └DefaultFocusTraversal
I/flutter (12557):            └_MediaQueryFromWindow(state: _MediaQueryFromWindowsState#59ffa)
I/flutter (12557):             └MediaQuery(MediaQueryData(size: Size(411.4, 683.4), devicePixelRatio: 2.6, textScaleFactor: 1.0, platformBrightness: Brightness.light, padding: EdgeInsets(0.0, 24.0, 0.0, 0.0), viewPadding: EdgeInsets(0.0, 24.0, 0.0, 0.0), viewInsets: EdgeInsets.zero, physicalDepth: 1.7976931348623157e+308, alwaysUse24HourFormat: false, accessibleNavigation: false, highContrast: false,disableAnimations: false, invertColors: false, boldText: false))
I/flutter (12557):              └Localizations(locale: en_US, delegates: [DefaultMaterialLocalizations.delegate(en_US), DefaultCupertinoLocalizations.delegate(en_US), DefaultWidgetsLocalizations.delegate(en_US)], state: _LocalizationsState#3c184)
I/flutter (12557):               └Semantics(container: false, properties: SemanticsProperties, label: null, value: null, hint: null, textDirection: ltr, hintOverrides: null, renderObject: RenderSemanticsAnnotations#1a359)
I/flutter (12557):                └_LocalizationsScope-[GlobalKey#e7c72]
I/flutter (12557):                 └Directionality(textDirection: ltr)
I/flutter (12557):                  └Title(title: "Flutter Demo", color: MaterialColor(primary value: Color(0xff2196f3)))
I/flutter (12557):                   └CheckedModeBanner("DEBUG")
I/flutter (12557):                    └Banner("DEBUG", textDirection: ltr, location: topEnd, Color(0xa0b71c1c), text inherit: true, text color: Color(0xffffffff), text size: 10.2, text weight: 900, text height: 1.0x, dependencies: [Directionality])
I/flutter (12557):                     └CustomPaint(renderObject: RenderCustomPaint#056d5)
I/flutter (12557):                      └DefaultTextStyle(debugLabel: fallback style; consider putting your text in a Material, inherit: true, color: Color(0xd0ff0000), family: monospace, size: 48.0, weight: 900, decoration: double Color(0xffffff00) TextDecoration.underline, softWrap: wrapping at box width, overflow: clip)
I/flutter (12557):                       └Builder
I/flutter (12557):                        └AnimatedTheme(duration: 200ms, state: _AnimatedThemeState#abe81(ticker inactive, ThemeDataTween(ThemeData#5b368(buttonTheme: ButtonThemeData#0eb8a(buttonColor: Color(0xffe0e0e0), focusColor: Color(0x1f000000), hoverColor: Color(0x0a000000), colorScheme: ColorScheme#89f24(primary: MaterialColor(primary value: Color(0xff2196f3)), primaryVariant: Color(0xff1976d2), secondary: Color(0xff2196f3), secondaryVariant: Color(0xff1976d2), background: Color(0xff90caf9), error: Color(0xffd32f2f), onSecondary: Color(0xffffffff), onBackground: Color(0xffffffff)), materialTapTargetSize: MaterialTapTargetSize.padded), toggleButtonsTheme: ToggleButtonsThemeData#ab29b, textTheme: TextTheme#36f00, primaryTextTheme: TextTheme#93d8f(display4: TextStyle(debugLabel: whiteCupertino display4, inherit: true, color: Color(0xb3ffffff), family: .SF UI Display, decoration: TextDecoration.none), display3: TextStyle(debugLabel: whiteCupertino display3, inherit: true, color: Color(0xb3ffffff), family: .SF UI Display
I/flutter (12557):                         └Theme(ThemeData#5b368(buttonTheme: ButtonThemeData#0eb8a(buttonColor: Color(0xffe0e0e0), focusColor: Color(0x1f000000), hoverColor: Color(0x0a000000), colorScheme: ColorScheme#89f24(primary: MaterialColor(primary value: Color(0xff2196f3)), primaryVariant: Color(0xff1976d2), secondary: Color(0xff2196f3), secondaryVariant: Color(0xff1976d2), background: Color(0xff90caf9), error: Color(0xffd32f2f), onSecondary: Color(0xffffffff), onBackground: Color(0xffffffff)), materialTapTargetSize: MaterialTapTargetSize.padded), toggleButtonsTheme: ToggleButtonsThemeData#ab29b, textTheme: TextTheme#36f00, primaryTextTheme: TextTheme#93d8f(display4: TextStyle(debugLabel: whiteCupertino display4, inherit: true, color: Color(0xb3ffffff), family: .SF UI Display, decoration: TextDecoration.none), display3: TextStyle(debugLabel: whiteCupertino display3, inherit: true, color: Color(0xb3ffffff), family: .SF UI Display, decoration: TextDecoration.none), display2: TextStyle(debugLabel: whiteCupertino displa
I/flutter (12557):                          └_InheritedTheme
I/flutter (12557):                           └CupertinoTheme(
I/flutter (12557):                            │primaryColor: MaterialColor(primary value: Color(0xff2196f3))
I/flutter (12557):                            │,
I/flutter (12557):                            │primaryContrastingColor: Color(0xffffffff)
I/flutter (12557):                            │,
I/flutter (12557):                            │scaffoldBackgroundColor: Color(0xfffafafa)
I/flutter (12557):                            │, actionTextStyle: TextStyle(inherit: false, color: MaterialColor(primary value: Color(0xff2196f3)), family: .SF Pro Text, size: 17.0, letterSpacing: -0.4, decoration: TextDecoration.none), navActionTextStyle: TextStyle(inherit: false, color: MaterialColor(primary value: Color(0xff2196f3)), family: .SF Pro Text, size: 17.0, letterSpacing: -0.4, decoration: TextDecoration.none))
I/flutter (12557):                            └_InheritedCupertinoTheme
I/flutter (12557):                             └IconTheme(
I/flutter (12557):                              │color: MaterialColor(primary value: Color(0xff2196f3))
I/flutter (12557):                              │)
I/flutter (12557):                              └IconTheme(color: Color(0xdd000000))
I/flutter (12557):                               └Navigator-[GlobalObjectKey<NavigatorState> _WidgetsAppState#d96c5](state: NavigatorState#3f9d9(tickers: tracking 1 ticker))
I/flutter (12557):                                └Listener
I/flutter (12557):                                 └_PointerListener(listeners: [down, up, cancel], behavior: deferToChild, renderObject: RenderPointerListener#ab7cd)
I/flutter (12557):                                  └AbsorbPointer(absorbing: false, renderObject: RenderAbsorbPointer#900a6)
I/flutter (12557):                                   └FocusScope(AUTOFOCUS, node: FocusScopeNode#479e1(Navigator Scope), dependencies: [_FocusMarker], state: _FocusScopeState#0703b)
I/flutter (12557):                                    └Semantics(container: false, properties: SemanticsProperties, label: null, value: null, hint: null, hintOverrides: null, renderObject: RenderSemanticsAnnotations#9b67e)
I/flutter (12557):                                     └_FocusMarker
I/flutter (12557):                                      └Overlay-[LabeledGlobalKey<OverlayState>#c5964](state: OverlayState#13410(entries: [OverlayEntry#20e5d(opaque: true; maintainState: false), OverlayEntry#6093a(opaque: false; maintainState: true)]))
I/flutter (12557):                                       └_Theatre(renderObject: _RenderTheatre#59c1d)
I/flutter (12557):                                        └Stack(alignment: AlignmentDirectional.topStart, fit: expand, overflow: clip, dependencies: [Directionality], renderObject: RenderStack#2520f)
I/flutter (12557):                                         ├_OverlayEntry-[LabeledGlobalKey<_OverlayEntryState>#930b1](state: _OverlayEntryState#871c1)
I/flutter (12557):                                         │└IgnorePointer(ignoring: false, renderObject: RenderIgnorePointer#57865)
I/flutter (12557):                                         │ └ModalBarrier
I/flutter (12557):                                         │  └BlockSemantics(blocking: true, renderObject: RenderBlockSemantics#080bf)
I/flutter (12557):                                         │   └ExcludeSemantics(excluding: true, renderObject: RenderExcludeSemantics#9ef04)
I/flutter (12557):                                         │    └_ModalBarrierGestureDetector
I/flutter (12557):                                         │     └RawGestureDetector(state: RawGestureDetectorState#5cd13(gestures: [any tap], semantics: _ModalBarrierSemanticsDelegate(), behavior: opaque))
I/flutter (12557):                                         │      └_GestureSemantics(renderObject: RenderSemanticsGestureHandler#33c80)
I/flutter (12557):                                         │       └Listener
I/flutter (12557):                                         │        └_PointerListener(listeners: [down], behavior: opaque, renderObject: RenderPointerListener#af296)
I/flutter (12557):                                         │         └Semantics(container: false, properties: SemanticsProperties, label: null, value: null, hint: null, hintOverrides: null, renderObject: RenderSemanticsAnnotations#31856)
I/flutter (12557):                                         │          └MouseRegion(listeners: <none>, renderObject: RenderMouseRegion#4ea5b)
I/flutter (12557):                                         │           └ConstrainedBox(BoxConstraints(biggest), renderObject: RenderConstrainedBox#d4c60)
I/flutter (12557):                                         └_OverlayEntry-[LabeledGlobalKey<_OverlayEntryState>#73703](state: _OverlayEntryState#0c1eb)
I/flutter (12557):                                          └_ModalScope<dynamic>-[LabeledGlobalKey<_ModalScopeState<dynamic>>#b6128](state: _ModalScopeState<dynamic>#9885e)
I/flutter (12557):                                           └_ModalScopeStatus(active)
I/flutter (12557):                                            └Offstage(offstage: false, renderObject: RenderOffstage#8877d)
I/flutter (12557):                                             └PageStorage
I/flutter (12557):                                              └FocusScope(node: FocusScopeNode#57a44(_ModalScopeState<dynamic> Focus Scope), dependencies: [_FocusMarker], state: _FocusScopeState#9aaee)
I/flutter (12557):                                               └Semantics(container: false, properties: SemanticsProperties, label: null, value: null, hint: null, hintOverrides: null, renderObject: RenderSemanticsAnnotations#beceb)
I/flutter (12557):                                                └_FocusMarker
I/flutter (12557):                                                 └RepaintBoundary(renderObject: RenderRepaintBoundary#1ec95)
I/flutter (12557):                                                  └AnimatedBuilder(animation: Listenable.merge([AnimationController#f3e37(⏭ 1.000; paused; for MaterialPageRoute<dynamic>(/))➩ProxyAnimation, kAlwaysDismissedAnimation➩ProxyAnimation➩ProxyAnimation]), dependencies: [_LocalizationsScope-[GlobalKey#e7c72], _InheritedTheme], state: _AnimatedState#33828)
I/flutter (12557):                                                   └CupertinoPageTransition(dependencies: [Directionality])
I/flutter (12557):                                                    └SlideTransition(animation: kAlwaysDismissedAnimation➩ProxyAnimation➩ProxyAnimation➩Cubic(0.35, 0.91, 0.33, 0.97)ₒₙ/Cubic(0.67, 0.03, 0.65, 0.09)➩Tween<Offset>(Offset(0.0, 0.0) → Offset(-0.3, 0.0))➩Offset(0.0, 0.0), state: _AnimatedState#52651)
I/flutter (12557):                                                     └FractionalTranslation(renderObject: RenderFractionalTranslation#28316)
I/flutter (12557):                                                      └SlideTransition(animation: AnimationController#f3e37(⏭ 1.000; paused; for MaterialPageRoute<dynamic>(/))➩ProxyAnimation➩Cubic(0.35, 0.91, 0.33, 0.97)ₒₙ/Cubic(0.67, 0.03, 0.65, 0.09)➩Tween<Offset>(Offset(1.0, 0.0) → Offset(0.0, 0.0))➩Offset(0.0, 0.0), state: _AnimatedState#5359c)
I/flutter (12557):                                                       └FractionalTranslation(renderObject: RenderFractionalTranslation#f7b00)
I/flutter (12557):                                                        └DecoratedBoxTransition(animation: AnimationController#f3e37(⏭ 1.000; paused; for MaterialPageRoute<dynamic>(/))➩ProxyAnimation➩Cubic(0.35, 0.91, 0.33, 0.97)➩DecorationTween(_CupertinoEdgeShadowDecoration(edgeGradient: null) → _CupertinoEdgeShadowDecoration(edgeGradient: LinearGradient(AlignmentDirectional(0.9, 0.0), AlignmentDirectional.centerEnd, [Color(0x00000000), Color(0x04000000), Color(0x12000000), Color(0x38000000)], [0.0, 0.3, 0.6, 1.0], TileMode.clamp)))➩_CupertinoEdgeShadowDecoration(edgeGradient: LinearGradient(AlignmentDirectional(0.9, 0.0), AlignmentDirectional.centerEnd, [Color(0x00000000), Color(0x04000000), Color(0x12000000), Color(0x38000000)], [0.0, 0.3, 0.6, 1.0], TileMode.clamp)), state: _AnimatedState#863a6)
I/flutter (12557):                                                         └DecoratedBox(bg: _CupertinoEdgeShadowDecoration(edgeGradient: LinearGradient(AlignmentDirectional(0.9, 0.0), AlignmentDirectional.centerEnd, [Color(0x00000000), Color(0x04000000), Color(0x12000000), Color(0x38000000)], [0.0, 0.3, 0.6, 1.0], TileMode.clamp)), dependencies: [_LocalizationsScope-[GlobalKey#e7c72], Directionality, MediaQuery], renderObject: RenderDecoratedBox#6e153)
I/flutter (12557):                                                          └_CupertinoBackGestureDetector<dynamic>(dependencies: [Directionality, MediaQuery], state: _CupertinoBackGestureDetectorState<dynamic>#50abe)
I/flutter (12557):                                                           └Stack(alignment: AlignmentDirectional.topStart, fit: passthrough, overflow: clip, dependencies: [Directionality], renderObject: RenderStack#cd73d)
I/flutter (12557):                                                            ├AnimatedBuilder(animation: ValueNotifier<bool>#d6871(false), state: _AnimatedState#51f2f)
I/flutter (12557):                                                            │└IgnorePointer(ignoring: false, renderObject: RenderIgnorePointer#d0fc4)
I/flutter (12557):                                                            │ └RepaintBoundary-[GlobalKey#26496](renderObject: RenderRepaintBoundary#529ac)
I/flutter (12557):                                                            │  └Builder
I/flutter (12557):                                                            │   └Semantics(container: false, properties: SemanticsProperties, label: null, value: null, hint: null, hintOverrides: null, renderObject: RenderSemanticsAnnotations#b2b2a)
I/flutter (12557):                                                            │    └MyHomePage(dependencies: [_LocalizationsScope-[GlobalKey#e7c72], _InheritedTheme], state: _MyHomePageState#c4df5)
I/flutter (12557):                                                            │     └Scaffold(dependencies: [_LocalizationsScope-[GlobalKey#e7c72], Directionality, _InheritedTheme, MediaQuery], state: ScaffoldState#e894c(tickers: tracking 2 tickers))
I/flutter (12557):                                                            │      └_ScaffoldScope
I/flutter (12557):                                                            │       └PrimaryScrollController(ScrollController#d0d82(no clients))
I/flutter (12557):                                                            │        └Material(type: canvas, color: Color(0xfffafafa), dependencies: [_LocalizationsScope-[GlobalKey#e7c72], _InheritedTheme], state: _MaterialState#60e45)
I/flutter (12557):                                                            │         └AnimatedPhysicalModel(duration: 200ms, shape: rectangle, borderRadius: BorderRadius.zero, elevation: 0.0, color: Color(0xfffafafa), animateColor: false, shadowColor: Color(0xff000000), animateShadowColor: true, state: _AnimatedPhysicalModelState#0f50e(ticker inactive))
I/flutter (12557):                                                            │          └PhysicalModel(shape: rectangle, borderRadius: BorderRadius.zero, elevation: 0.0, color: Color(0xfffafafa), shadowColor: Color(0xff000000), renderObject: RenderPhysicalModel#87b6e)
I/flutter (12557):                                                            │           └NotificationListener<LayoutChangedNotification>
I/flutter (12557):                                                            │            └_InkFeatures-[GlobalKey#4f5f5 ink renderer](renderObject: _RenderInkFeatures#2ebb4)
I/flutter (12557):                                                            │             └AnimatedDefaultTextStyle(duration: 200ms, debugLabel: (englishLike body1 2014).merge(blackCupertino body1), inherit: false, color: Color(0xdd000000), family: .SF UI Text, size: 14.0, weight: 400, baseline: alphabetic, decoration: TextDecoration.none, softWrap: wrapping at box width, overflow: clip, state: _AnimatedDefaultTextStyleState#ac329(ticker inactive))
I/flutter (12557):                                                            │              └DefaultTextStyle(debugLabel: (lerp(englishLike body1 2014 ⎯0.7→ englishLike body1 2014)).merge(lerp(blackMountainView body1 ⎯0.7→ blackCupertino body1)), inherit: false, color: Color(0xdd000000), family: .SF UI Text, size: 14.0, weight: 400, baseline: alphabetic, decoration: TextDecoration.none, softWrap: wrapping at box width, overflow: clip)
I/flutter (12557):                                                            │               └AnimatedBuilder(animation: AnimationController#c8d25(⏭ 1.000; paused), state: _AnimatedState#c1aa6)
I/flutter (12557):                                                            │                └CustomMultiChildLayout(renderObject: RenderCustomMultiChildLayoutBox#753ac)
I/flutter (12557):                                                            │                 ├LayoutId-[<_ScaffoldSlot.body>](id: _ScaffoldSlot.body)
I/flutter (12557):                                                            │                 │└MediaQuery(MediaQueryData(size: Size(411.4, 683.4), devicePixelRatio: 2.6, textScaleFactor: 1.0, platformBrightness: Brightness.light, padding: EdgeInsets.zero, viewPadding: EdgeInsets.zero, viewInsets: EdgeInsets.zero, physicalDepth: 1.7976931348623157e+308, alwaysUse24HourFormat: false, accessibleNavigation: false, highContrast: false,disableAnimations: false, invertColors: false, boldText: false))
I/flutter (12557):                                                            │                 │ └_BodyBuilder
I/flutter (12557):                                                            │                 │  └Center(alignment: center, dependencies: [Directionality], renderObject: RenderPositionedBox#ba909 relayoutBoundary=up1)
I/flutter (12557):                                                            │                 │   └Column(direction: vertical, mainAxisAlignment: center, crossAxisAlignment: center, renderObject: RenderFlex#9b74b relayoutBoundary=up2)
I/flutter (12557):                                                            │                 │    ├Text("You have pushed the button this many times:", dependencies: [MediaQuery, DefaultTextStyle])
I/flutter (12557):                                                            │                 │    │└RichText(softWrap: wrapping at box width, maxLines: unlimited, text: "You have pushed the button this many times:", dependencies: [_LocalizationsScope-[GlobalKey#e7c72], Directionality], renderObject: RenderParagraph#22160 relayoutBoundary=up3)
I/flutter (12557):                                                            │                 │    └Text("1", debugLabel: (englishLike display1 2014).merge(blackCupertino display1), inherit: false, color: Color(0x8a000000), family: .SF UI Display, size: 34.0, weight: 400, baseline: alphabetic, decoration: TextDecoration.none, dependencies: [MediaQuery, DefaultTextStyle])
I/flutter (12557):                                                            │                 │     └RichText(softWrap: wrapping at box width, maxLines: unlimited, text: "1", dependencies: [_LocalizationsScope-[GlobalKey#e7c72], Directionality], renderObject: RenderParagraph#e3ad5 relayoutBoundary=up3)
I/flutter (12557):                                                            │                 ├LayoutId-[<_ScaffoldSlot.appBar>](id: _ScaffoldSlot.appBar)
I/flutter (12557):                                                            │                 │└MediaQuery(MediaQueryData(size: Size(411.4, 683.4), devicePixelRatio: 2.6, textScaleFactor: 1.0, platformBrightness: Brightness.light, padding: EdgeInsets(0.0, 24.0, 0.0, 0.0), viewPadding: EdgeInsets(0.0, 24.0, 0.0, 0.0), viewInsets: EdgeInsets.zero, physicalDepth: 1.7976931348623157e+308, alwaysUse24HourFormat: false, accessibleNavigation: false, highContrast: false,disableAnimations: false, invertColors: false, boldText: false))
I/flutter (12557):                                                            │                 │ └ConstrainedBox(BoxConstraints(0.0<=w<=Infinity, 0.0<=h<=80.0), renderObject: RenderConstrainedBox#36c06 relayoutBoundary=up1)
I/flutter (12557):                                                            │                 │  └FlexibleSpaceBarSettings
I/flutter (12557):                                                            │                 │   └AppBar(dependencies: [_ModalScopeStatus, _LocalizationsScope-[GlobalKey#e7c72], _InheritedTheme], state: _AppBarState#ef4b3)
I/flutter (12557):                                                            │                 │    └Semantics(container: true, properties: SemanticsProperties, label: null, value: null, hint: null, hintOverrides: null, renderObject: RenderSemanticsAnnotations#4ab88 relayoutBoundary=up2)
I/flutter (12557):                                                            │                 │     └AnnotatedRegion<SystemUiOverlayStyle>(renderObject: RenderAnnotatedRegion<SystemUiOverlayStyle>#091ca relayoutBoundary=up3)
I/flutter (12557):                                                            │                 │      └Material(type: canvas, elevation: 4.0, color: MaterialColor(primary value: Color(0xff2196f3)), dependencies: [_LocalizationsScope-[GlobalKey#e7c72], _InheritedTheme], state: _MaterialState#c62ac)
I/flutter (12557):                                                            │                 │       └AnimatedPhysicalModel(duration: 200ms, shape: rectangle, borderRadius: BorderRadius.zero, elevation: 4.0, color: MaterialColor(primary value: Color(0xff2196f3)), animateColor: false, shadowColor: Color(0xff000000), animateShadowColor: true, state: _AnimatedPhysicalModelState#cf3df(ticker inactive))
I/flutter (12557):                                                            │                 │        └PhysicalModel(shape: rectangle, borderRadius: BorderRadius.zero, elevation: 4.0, color: MaterialColor(primary value: Color(0xff2196f3)), shadowColor: Color(0xff000000), renderObject: RenderPhysicalModel#97eba relayoutBoundary=up4)
I/flutter (12557):                                                            │                 │         └NotificationListener<LayoutChangedNotification>
I/flutter (12557):                                                            │                 │          └_InkFeatures-[GlobalKey#06409 ink renderer](renderObject: _RenderInkFeatures#9169f relayoutBoundary=up5)
I/flutter (12557):                                                            │                 │           └AnimatedDefaultTextStyle(duration: 200ms, debugLabel: (englishLike body1 2014).merge(blackCupertino body1), inherit: false, color: Color(0xdd000000), family: .SF UI Text, size: 14.0, weight: 400, baseline: alphabetic, decoration: TextDecoration.none, softWrap: wrapping at box width, overflow: clip, state: _AnimatedDefaultTextStyleState#59a9c(ticker inactive))
I/flutter (12557):                                                            │                 │            └DefaultTextStyle(debugLabel: (lerp(englishLike body1 2014 ⎯0.7→ englishLike body1 2014)).merge(lerp(blackMountainView body1 ⎯0.7→ blackCupertino body1)), inherit: false, color: Color(0xdd000000), family: .SF UI Text, size: 14.0, weight: 400, baseline: alphabetic, decoration: TextDecoration.none, softWrap: wrapping at box width, overflow: clip)
I/flutter (12557):                                                            │                 │             └Semantics(container: false, properties: SemanticsProperties, label: null, value: null, hint: null, hintOverrides: null, renderObject: RenderSemanticsAnnotations#bd3dd relayoutBoundary=up6)
I/flutter (12557):                                                            │                 │              └Align(alignment: topCenter, dependencies: [Directionality], renderObject: RenderPositionedBox#a3bf2 relayoutBoundary=up7)
I/flutter (12557):                                                            │                 │               └SafeArea(avoid left padding, avoid top padding, avoid right padding, avoid bottom padding, dependencies: [MediaQuery])
I/flutter (12557):                                                            │                 │                └Padding(padding: EdgeInsets(0.0, 24.0, 0.0, 0.0), dependencies: [Directionality], renderObject: RenderPadding#37ffe relayoutBoundary=up8)
I/flutter (12557):                                                            │                 │                 └MediaQuery(MediaQueryData(size: Size(411.4, 683.4), devicePixelRatio: 2.6, textScaleFactor: 1.0, platformBrightness: Brightness.light, padding: EdgeInsets.zero, viewPadding: EdgeInsets.zero, viewInsets: EdgeInsets.zero, physicalDepth: 1.7976931348623157e+308, alwaysUse24HourFormat: false, accessibleNavigation: false, highContrast: false,disableAnimations: false, invertColors: false, boldText: false))
I/flutter (12557):                                                            │                 │                  └ClipRect(renderObject: RenderClipRect#501db relayoutBoundary=up9)
I/flutter (12557):                                                            │                 │                   └CustomSingleChildLayout(renderObject: RenderCustomSingleChildLayoutBox#d2ac2 relayoutBoundary=up10)
I/flutter (12557):                                                            │                 │                    └Builder(dependencies: [IconTheme])
I/flutter (12557):                                                            │                 │                     └IconTheme(color: Color(0xffffffff))
I/flutter (12557):                                                            │                 │                      └DefaultTextStyle(debugLabel: (englishLike body1 2014).merge(whiteCupertino body1), inherit: false, color: Color(0xffffffff), family: .SF UI Text, size: 14.0, weight: 400, baseline: alphabetic, decoration: TextDecoration.none, softWrap: wrapping at box width, overflow: clip)
I/flutter (12557):                                                            │                 │                       └NavigationToolbar(dependencies: [Directionality])
I/flutter (12557):                                                            │                 │                        └CustomMultiChildLayout(renderObject: RenderCustomMultiChildLayoutBox#21b4e relayoutBoundary=up11)
I/flutter (12557):                                                            │                 │                         └LayoutId-[<_ToolbarSlot.middle>](id: _ToolbarSlot.middle)
I/flutter (12557):                                                            │                 │                          └DefaultTextStyle(debugLabel: (englishLike title 2014).merge(whiteCupertino title), inherit: false, color: Color(0xffffffff), family: .SF UI Display, size: 20.0, weight: 500, baseline: alphabetic, decoration: TextDecoration.none, softWrap: no wrapping except at line break characters, overflow: ellipsis)
I/flutter (12557):                                                            │                 │                           └Semantics(container: false, properties: SemanticsProperties, label: null, value: null, hint: null, hintOverrides: null, renderObject: RenderSemanticsAnnotations#ca2bf relayoutBoundary=up12)
I/flutter (12557):                                                            │                 │                            └_AppBarTitleBox(dependencies: [Directionality], renderObject: _RenderAppBarTitleBox#063d2 relayoutBoundary=up13)
I/flutter (12557):                                                            │                 │                             └Text("Flutter Demo Home Page", dependencies: [MediaQuery, DefaultTextStyle])
I/flutter (12557):                                                            │                 │                              └RichText(softWrap: no wrapping except at line break characters, overflow: ellipsis, maxLines: unlimited, text: "Flutter Demo Home Page", dependencies: [_LocalizationsScope-[GlobalKey#e7c72], Directionality], renderObject: RenderParagraph#be9c8 relayoutBoundary=up14)
I/flutter (12557):                                                            │                 ├LayoutId-[<_ScaffoldSlot.floatingActionButton>](id: _ScaffoldSlot.floatingActionButton)
I/flutter (12557):                                                            │                 │└MediaQuery(MediaQueryData(size: Size(411.4, 683.4), devicePixelRatio: 2.6, textScaleFactor: 1.0, platformBrightness: Brightness.light, padding: EdgeInsets.zero, viewPadding: EdgeInsets.zero, viewInsets: EdgeInsets.zero, physicalDepth: 1.7976931348623157e+308, alwaysUse24HourFormat: false, accessibleNavigation: false, highContrast: false,disableAnimations: false, invertColors: false, boldText: false))
I/flutter (12557):                                                            │                 │ └_FloatingActionButtonTransition(state: _FloatingActionButtonTransitionState#54383(tickers: tracking 1 ticker))
I/flutter (12557):                                                            │                 │  └Stack(alignment: centerRight, fit: loose, overflow: clip, dependencies: [Directionality], renderObject: RenderStack#891db relayoutBoundary=up1)
I/flutter (12557):                                                            │                 │   └ScaleTransition(animation: AnimationMin<double>(_AnimationSwap<double>(AnimationController#c8d25(⏭ 1.000; paused)➩CurveTween(curve: FlippedCurve(Interval(0.5⋯1.0)➩Cubic(0.25, 0.10, 0.25, 1.00)))➩1.0➪ReverseAnimation, AnimationController#c8d25(⏭ 1.000; paused)➩CurveTween(curve: Interval(0.5⋯1.0)➩Cubic(0.25, 0.10, 0.25, 1.00))➩1.0), AnimationController#d699a(⏭ 1.000; paused)➩Cubic(0.42, 0.00, 1.00, 1.00)), state: _AnimatedState#32919)
I/flutter (12557):                                                            │                 │    └Transform(dependencies: [Directionality], renderObject: RenderTransform#aa844 relayoutBoundary=up2)
I/flutter (12557):                                                            │                 │     └RotationTransition(animation: AnimationController#d699a(⏭ 1.000; paused)➩CurveTween(curve: Cubic(0.42, 0.00, 1.00, 1.00))➩Tween<double>(0.875 → 1.0)➩1.0➩TrainHoppingAnimation(next: _AnimationSwap<double>(AnimationController#c8d25(⏭ 1.000; paused)➩Tween<double>(0.75 → 1.0)➩1.0, AnimationController#c8d25(⏭ 1.000; paused)➩CurveTween(curve: Threshold)➩1.0➪ReverseAnimation)), state: _AnimatedState#7e47f)
I/flutter (12557):                                                            │                 │      └Transform(dependencies: [Directionality], renderObject: RenderTransform#393ed relayoutBoundary=up3)
I/flutter (12557):                                                            │                 │       └FloatingActionButton(tooltip: "Increment", hero, dependencies: [_LocalizationsScope-[GlobalKey#e7c72], _InheritedTheme])
I/flutter (12557):                                                            │                 │        └MergeSemantics(renderObject: RenderMergeSemantics#8bb5f relayoutBoundary=up4)
I/flutter (12557):                                                            │                 │         └Hero(tag: <default FloatingActionButton tag>, state: _HeroState#99e1d)
I/flutter (12557):                                                            │                 │          └SizedBox(renderObject: RenderConstrainedBox#04470 relayoutBoundary=up5)
I/flutter (12557):                                                            │                 │           └Offstage(offstage: false, renderObject: RenderOffstage#5f71e relayoutBoundary=up6)
I/flutter (12557):                                                            │                 │            └TickerMode(mode: enabled)
I/flutter (12557):                                                            │                 │             └KeyedSubtree-[GlobalKey#dde2c]
I/flutter (12557):                                                            │                 │              └Tooltip("Increment", dependencies: [_LocalizationsScope-[GlobalKey#e7c72], _InheritedTheme, TickerMode], state: _TooltipState#25280(ticker inactive))
I/flutter (12557):                                                            │                 │               └GestureDetector(startBehavior: start)
I/flutter (12557):                                                            │                 │                └RawGestureDetector(state: RawGestureDetectorState#d99ac(gestures: [long press], excludeFromSemantics: true, behavior: opaque))
I/flutter (12557):                                                            │                 │                 └Listener
I/flutter (12557):                                                            │                 │                  └_PointerListener(listeners: [down], behavior: opaque, renderObject: RenderPointerListener#78c8a relayoutBoundary=up7)
I/flutter (12557):                                                            │                 │                   └Semantics(container: false, properties: SemanticsProperties, label: "Increment", value: null, hint: null, hintOverrides: null, dependencies: [Directionality], renderObject: RenderSemanticsAnnotations#15e7e relayoutBoundary=up8)
I/flutter (12557):                                                            │                 │                    └RawMaterialButton(state: _RawMaterialButtonState#1f475)
I/flutter (12557):                                                            │                 │                     └Semantics(container: true, properties: SemanticsProperties, label: null, value: null, hint: null, hintOverrides: null, renderObject: RenderSemanticsAnnotations#77142 relayoutBoundary=up9)
I/flutter (12557):                                                            │                 │                      └_InputPadding(renderObject: _RenderInputPadding#c1598 relayoutBoundary=up10)
I/flutter (12557):                                                            │                 │                       └ConstrainedBox(BoxConstraints(w=56.0, h=56.0), renderObject: RenderConstrainedBox#8dd4a relayoutBoundary=up11)
I/flutter (12557):                                                            │                 │                        └Material(type: button, elevation: 6.0, color: Color(0xff2196f3), textStyle.debugLabel: (((englishLike button 2014).merge(whiteCupertino button)).copyWith).copyWith, textStyle.inherit: false, textStyle.color: Color(0xffffffff), textStyle.family: .SF UI Text, textStyle.size: 14.0, textStyle.weight: 500, textStyle.letterSpacing: 1.2, textStyle.baseline: alphabetic, textStyle.decoration: TextDecoration.none, shape: CircleBorder(BorderSide(Color(0xff000000), 0.0, BorderStyle.none)), dependencies: [_LocalizationsScope-[GlobalKey#e7c72], _InheritedTheme, TickerMode], state: _MaterialState#ade0e(tickers: tracking 0 tickers))
I/flutter (12557):                                                            │                 │                         └_MaterialInterior(duration: 200ms, shape: CircleBorder(BorderSide(Color(0xff000000), 0.0, BorderStyle.none)), elevation: 6.0, color: Color(0xff2196f3), shadowColor: Color(0xff000000), dependencies: [_LocalizationsScope-[GlobalKey#e7c72], Directionality, _InheritedTheme, TickerMode], state: _MaterialInteriorState#49a0d(ticker inactive))
I/flutter (12557):                                                            │                 │                          └PhysicalShape(clipper: ShapeBorderClipper, elevation: 6.0, color: Color(0xff2196f3), shadowColor: Color(0xff000000), renderObject: RenderPhysicalShape#c0a63)
I/flutter (12557):                                                            │                 │                           └_ShapeBorderPaint(dependencies: [Directionality])
I/flutter (12557):                                                            │                 │                            └CustomPaint(renderObject: RenderCustomPaint#5b171)
I/flutter (12557):                                                            │                 │                             └NotificationListener<LayoutChangedNotification>
I/flutter (12557):                                                            │                 │                              └_InkFeatures-[GlobalKey#8d401 ink renderer](renderObject: _RenderInkFeatures#91d5e)
I/flutter (12557):                                                            │                 │                               └AnimatedDefaultTextStyle(duration: 200ms, debugLabel: (((englishLike button 2014).merge(whiteCupertino button)).copyWith).copyWith, inherit: false, color: Color(0xffffffff), family: .SF UI Text, size: 14.0, weight: 500, letterSpacing: 1.2, baseline: alphabetic, decoration: TextDecoration.none, softWrap: wrapping at box width, overflow: clip, dependencies: [TickerMode], state: _AnimatedDefaultTextStyleState#3f6ee(ticker inactive))
I/flutter (12557):                                                            │                 │                                └DefaultTextStyle(debugLabel: (((lerp(englishLike button 2014 ⎯0.7→ englishLike button 2014)).merge(lerp(whiteMountainView button ⎯0.7→ whiteCupertino button))).copyWith).copyWith, inherit: false, color: Color(0xffffffff), family: .SF UI Text, size: 14.0, weight: 500, letterSpacing: 1.2, baseline: alphabetic, decoration: TextDecoration.none, softWrap: wrapping at box width, overflow: clip)
I/flutter (12557):                                                            │                 │                                 └InkWell(gestures: [tap], clipped to BoxShape.rectangle, state: _InkResponseState<InkResponse>#98ff0)
I/flutter (12557):                                                            │                 │                                  └Actions(dispatcher: null, actions: {[<SelectAction>]: Closure: () => Action from Function '_createAction@186059085':., [<ActivateAction>]: Closure: () => Action from Function '_createAction@186059085':.})
I/flutter (12557):                                                            │                 │                                   └Focus(dependencies: [_FocusMarker], state: _FocusState#7d4c6)
I/flutter (12557):                                                            │                 │                                    └_FocusMarker
I/flutter (12557):                                                            │                 │                                     └Semantics(container: false, properties: SemanticsProperties, label: null, value: null, hint: null, hintOverrides: null, renderObject: RenderSemanticsAnnotations#11511)
I/flutter (12557):                                                            │                 │                                      └MouseRegion(listeners: [enter, exit], renderObject: RenderMouseRegion#831af)
I/flutter (12557):                                                            │                 │                                       └GestureDetector(startBehavior: start)
I/flutter (12557):                                                            │                 │                                        └RawGestureDetector(state: RawGestureDetectorState#1aadf(gestures: [tap], behavior: opaque))
I/flutter (12557):                                                            │                 │                                         └_GestureSemantics(renderObject: RenderSemanticsGestureHandler#78f72)
I/flutter (12557):                                                            │                 │                                          └Listener
I/flutter (12557):                                                            │                 │                                           └_PointerListener(listeners: [down], behavior: opaque, renderObject: RenderPointerListener#53414)
I/flutter (12557):                                                            │                 │                                            └Builder(dependencies: [IconTheme])
I/flutter (12557):                                                            │                 │                                             └IconTheme(color: Color(0xffffffff))
I/flutter (12557):                                                            │                 │                                              └Container(padding: EdgeInsets.zero)
I/flutter (12557):                                                            │                 │                                               └Padding(padding: EdgeInsets.zero, dependencies: [Directionality], renderObject: RenderPadding#8804c)
I/flutter (12557):                                                            │                 │                                                └Center(alignment: center, widthFactor: 1.0, heightFactor: 1.0, dependencies: [Directionality], renderObject: RenderPositionedBox#7069f)
I/flutter (12557):                                                            │                 │                                                 └Icon(IconData(U+0E145), dependencies: [Directionality, IconTheme])
I/flutter (12557):                                                            │                 │                                                  └Semantics(container: false, properties: SemanticsProperties, label: null, value: null, hint: null, hintOverrides: null, renderObject: RenderSemanticsAnnotations#22c22 relayoutBoundary=up1)
I/flutter (12557):                                                            │                 │                                                   └ExcludeSemantics(excluding: true, renderObject: RenderExcludeSemantics#22367 relayoutBoundary=up2)
I/flutter (12557):                                                            │                 │                                                    └SizedBox(width: 24.0, height: 24.0, renderObject: RenderConstrainedBox#eeee1 relayoutBoundary=up3)
I/flutter (12557):                                                            │                 │                                                     └Center(alignment: center, dependencies: [Directionality], renderObject: RenderPositionedBox#5a4a0)
I/flutter (12557):                                                            │                 │                                                      └RichText(textDirection: ltr, softWrap: wrapping at box width, overflow: visible, maxLines: unlimited, text: "", dependencies: [_LocalizationsScope-[GlobalKey#e7c72]], renderObject: RenderParagraph#b5e01 relayoutBoundary=up1)
I/flutter (12557):                                                            │                 └LayoutId-[<_ScaffoldSlot.statusBar>](id: _ScaffoldSlot.statusBar)
I/flutter (12557):                                                            │                  └MediaQuery(MediaQueryData(size: Size(411.4, 683.4), devicePixelRatio: 2.6, textScaleFactor: 1.0, platformBrightness: Brightness.light, padding: EdgeInsets.zero, viewPadding: EdgeInsets.zero, viewInsets: EdgeInsets.zero, physicalDepth: 1.7976931348623157e+308, alwaysUse24HourFormat: false, accessibleNavigation: false, highContrast: false,disableAnimations: false, invertColors: false, boldText: false))
I/flutter (12557):                                                            │                   └GestureDetector(startBehavior: start)
I/flutter (12557):                                                            │                    └RawGestureDetector(state: RawGestureDetectorState#b0030(gestures: [tap], excludeFromSemantics: true, behavior: opaque))
I/flutter (12557):                                                            │                     └Listener
I/flutter (12557):                                                            │                      └_PointerListener(listeners: [down], behavior: opaque, renderObject: RenderPointerListener#8ea15)
I/flutter (12557):                                                            └PositionedDirectional(dependencies: [Directionality])
I/flutter (12557):                                                             └Positioned(left: 0.0, top: 0.0, bottom: 0.0, width: 20.0)
I/flutter (12557):                                                              └Listener
I/flutter (12557):                                                               └_PointerListener(listeners: [down], behavior: translucent, renderObject: RenderPointerListener#1205a)
I/flutter (12557):
```
