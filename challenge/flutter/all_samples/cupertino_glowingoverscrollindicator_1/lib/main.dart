/// Flutter code sample for GlowingOverscrollIndicator

// This example demonstrates how to use a [NotificationListener] to manipulate
// the placement of a [GlowingOverscrollIndicator] when building a
// [CustomScrollView]. Drag the scrollable to see the bounds of the overscroll
// indicator.

import 'package:flutter/material.dart';

void main() => runApp(const MyApp());

/// This is the main application widget.
class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  static const String _title = 'Flutter Code Sample';

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: _title,
      home: Scaffold(
        appBar: AppBar(title: const Text(_title)),
        body: const MyStatelessWidget(),
      ),
    );
  }
}

/// This is the stateless widget that the main application instantiates.
class MyStatelessWidget extends StatelessWidget {
  const MyStatelessWidget({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final double leadingPaintOffset =
        MediaQuery.of(context).padding.top + AppBar().preferredSize.height;
    return NotificationListener<OverscrollIndicatorNotification>(
      onNotification: (OverscrollIndicatorNotification notification) {
        if (notification.leading) {
          notification.paintOffset = leadingPaintOffset;
        }
        return false;
      },
      child: CustomScrollView(
        slivers: <Widget>[
          const SliverAppBar(title: Text('Custom PaintOffset')),
          SliverToBoxAdapter(
            child: Container(
              color: Colors.amberAccent,
              height: 100,
              child: const Center(child: Text('Glow all day!')),
            ),
          ),
          const SliverFillRemaining(child: FlutterLogo()),
        ],
      ),
    );
  }
}
