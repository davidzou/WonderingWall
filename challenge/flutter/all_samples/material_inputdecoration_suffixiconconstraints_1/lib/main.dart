/// Flutter code sample for InputDecoration.suffixIconConstraints

// This example shows the differences between two `TextField` widgets when
// [suffixIconConstraints] is set to the default value and when one is not.
//
// Note that [isDense] must be set to true to be able to
// set the constraints smaller than 48px.
//
// If null, [BoxConstraints] with a minimum width and height of 48px is
// used.

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
    return Padding(
      padding: const EdgeInsets.symmetric(horizontal: 8.0),
      child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: const <Widget>[
          TextField(
            decoration: InputDecoration(
              hintText: 'Normal Icon Constraints',
              suffixIcon: Icon(Icons.search),
            ),
          ),
          SizedBox(height: 10),
          TextField(
            decoration: InputDecoration(
              isDense: true,
              hintText: 'Smaller Icon Constraints',
              suffixIcon: Icon(Icons.search),
              suffixIconConstraints: BoxConstraints(
                minHeight: 32,
                minWidth: 32,
              ),
            ),
          ),
        ],
      ),
    );
  }
}
