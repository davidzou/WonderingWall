/// Flutter code sample for CupertinoScrollbar

// This sample shows a [CupertinoScrollbar] that fades in and out of view as scrolling occurs.
// The scrollbar will fade into view as the user scrolls, and fade out when scrolling stops.
// The `thickness` of the scrollbar will animate from 6 pixels to the `thicknessWhileDragging` of 10
// when it is dragged by the user. The `radius` of the scrollbar thumb corners will animate from 34
// to the `radiusWhileDragging` of 0 when the scrollbar is being dragged by the user.

import 'package:flutter/cupertino.dart';
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
  @override
  Widget build(BuildContext context) {
    return CupertinoScrollbar(
      thickness: 6.0,
      thicknessWhileDragging: 10.0,
      radius: const Radius.circular(34.0),
      radiusWhileDragging: Radius.zero,
      child: ListView.builder(
        itemCount: 120,
        itemBuilder: (BuildContext context, int index) {
          return Center(
            child: Text('item $index'),
          );
        },
      ),
    );
  }
}
