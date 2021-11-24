/// Flutter code sample for InputDecoration.label

// This example shows a `TextField` with a [Text.rich] widget as the [label].
// The widget contains multiple [Text] widgets with different [TextStyle]'s.

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
    return const Center(
      child: TextField(
        decoration: InputDecoration(
          label: Text.rich(
            TextSpan(
              children: <InlineSpan>[
                WidgetSpan(
                  child: Text(
                    'Username',
                  ),
                ),
                WidgetSpan(
                  child: Text(
                    '*',
                    style: TextStyle(color: Colors.red),
                  ),
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}
