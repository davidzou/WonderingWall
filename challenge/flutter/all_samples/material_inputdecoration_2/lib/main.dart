/// Flutter code sample for InputDecoration

// This sample shows how to style a "collapsed" `TextField` using an
// `InputDecorator`. The collapsed `TextField` surrounds the hint text and
// input area with a border, but does not add padding around them.
//
// ![](https://flutter.github.io/assets-for-api-docs/assets/material/input_decoration_collapsed.png)

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
    return const TextField(
      decoration: InputDecoration.collapsed(
        hintText: 'Hint Text',
        border: OutlineInputBorder(),
      ),
    );
  }
}
