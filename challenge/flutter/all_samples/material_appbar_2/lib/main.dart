/// Flutter code sample for AppBar

import 'package:flutter/material.dart';

void main() => runApp(const MyApp());

/// This is the main application widget.
class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  static const String _title = 'Flutter Code Sample';

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      title: _title,
      home: MyStatelessWidget(),
    );
  }
}

/// This is the stateless widget that the main application instantiates.
class MyStatelessWidget extends StatelessWidget {
  const MyStatelessWidget({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final ButtonStyle style =
        TextButton.styleFrom(primary: Theme.of(context).colorScheme.onPrimary);
    return Scaffold(
      appBar: AppBar(
        actions: <Widget>[
          TextButton(
            style: style,
            onPressed: () {},
            child: const Text('Action 1'),
          ),
          TextButton(
            style: style,
            onPressed: () {},
            child: const Text('Action 2'),
          )
        ],
      ),
    );
  }
}
