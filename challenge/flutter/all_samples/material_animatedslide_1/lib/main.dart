/// Flutter code sample for AnimatedSlide

// This code defines a widget that uses [AnimatedSlide] to translate a [FlutterLogo]
// up or down by the amount of it's height with each press of the corresponding button.

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
        body: const MyStatefulWidget(),
      ),
    );
  }
}

/// This is the stateful widget that the main application instantiates.
class MyStatefulWidget extends StatefulWidget {
  const MyStatefulWidget({Key? key}) : super(key: key);

  @override
  State<MyStatefulWidget> createState() => _MyStatefulWidgetState();
}

/// This is the private State class that goes with MyStatefulWidget.
class _MyStatefulWidgetState extends State<MyStatefulWidget> {
  Offset offset = Offset.zero;

  void _slideUp() {
    setState(() => offset -= const Offset(0, 1));
  }

  void _slideDown() {
    setState(() => offset += const Offset(0, 1));
  }

  @override
  Widget build(BuildContext context) {
    return Column(
      mainAxisSize: MainAxisSize.min,
      children: <Widget>[
        ElevatedButton(
          child: const Text('Slide up'),
          onPressed: _slideUp,
        ),
        ElevatedButton(
          child: const Text('Slide down'),
          onPressed: _slideDown,
        ),
        Padding(
          padding: const EdgeInsets.all(50),
          child: AnimatedSlide(
            offset: offset,
            duration: const Duration(milliseconds: 500),
            curve: Curves.easeInOut,
            child: const FlutterLogo(),
          ),
        ),
      ],
    );
  }
}
