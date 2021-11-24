/// Flutter code sample for ScaffoldMessengerState.showMaterialBanner

// Here is an example of showing a [MaterialBanner] when the user presses a button.

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
        body: const Center(
          child: MyStatelessWidget(),
        ),
      ),
    );
  }
}

/// This is the stateless widget that the main application instantiates.
class MyStatelessWidget extends StatelessWidget {
  const MyStatelessWidget({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return OutlinedButton(
      onPressed: () {
        ScaffoldMessenger.of(context).showMaterialBanner(
          const MaterialBanner(
            content: Text('This is a MaterialBanner'),
            actions: <Widget>[
              TextButton(
                child: Text('DISMISS'),
                onPressed: null,
              ),
            ],
          ),
        );
      },
      child: const Text('Show MaterialBanner'),
    );
  }
}
