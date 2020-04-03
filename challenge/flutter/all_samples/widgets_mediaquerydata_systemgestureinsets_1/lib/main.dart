// Flutter code sample for MediaQueryData.systemGestureInsets

// For apps that might be deployed on Android Q devices with full gesture
// navigation enabled, use [MediaQuery.systemGestureInsets] with [Padding]
// to avoid having the left and right edges of the [Slider] from appearing
// within the area reserved for system gesture navigation.
//
// By default, [Slider]s expand to fill the available width. So, we pad the
// left and right sides.

import 'package:flutter/material.dart';

void main() => runApp(MyApp());

/// This Widget is the main application widget.
class MyApp extends StatelessWidget {
  static const String _title = 'Flutter Code Sample';

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: _title,
      home: MyStatefulWidget(),
    );
  }
}

class MyStatefulWidget extends StatefulWidget {
  MyStatefulWidget({Key key}) : super(key: key);

  @override
  _MyStatefulWidgetState createState() => _MyStatefulWidgetState();
}

class _MyStatefulWidgetState extends State<MyStatefulWidget> {
  double _currentValue = 0.2;

  @override
  Widget build(BuildContext context) {
    EdgeInsets systemGestureInsets = MediaQuery.of(context).systemGestureInsets;
    return Scaffold(
      appBar: AppBar(title: Text('Pad Slider to avoid systemGestureInsets')),
      body: Padding(
        padding: EdgeInsets.only(
          // only left and right padding are needed here
          left: systemGestureInsets.left,
          right: systemGestureInsets.right,
        ),
        child: Slider(
          value: _currentValue.toDouble(),
          onChanged: (double newValue) {
            setState(() {
              _currentValue = newValue;
            });
          },
        ),
      ),
    );
  }
}
