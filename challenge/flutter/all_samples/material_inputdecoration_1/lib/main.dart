/// Flutter code sample for InputDecoration

// This sample shows how to style a `TextField` using an `InputDecorator`. The
// TextField displays a "send message" icon to the left of the input area,
// which is surrounded by a border an all sides. It displays the `hintText`
// inside the input area to help the user understand what input is required. It
// displays the `helperText` and `counterText` below the input area.
//
// ![](https://flutter.github.io/assets-for-api-docs/assets/material/input_decoration.png)

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
      decoration: InputDecoration(
        icon: Icon(Icons.send),
        hintText: 'Hint Text',
        helperText: 'Helper Text',
        counterText: '0 characters',
        border: OutlineInputBorder(),
      ),
    );
  }
}
