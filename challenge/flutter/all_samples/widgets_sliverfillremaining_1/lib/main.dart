// Flutter code sample for SliverFillRemaining

// In this sample the [SliverFillRemaining] sizes its [child] to fill the
// remaining extent of the viewport in both axes. The icon is centered in the
// sliver, and would be in any computed extent for the sliver.

import 'package:flutter/material.dart';

void main() => runApp(MyApp());

/// This Widget is the main application widget.
class MyApp extends StatelessWidget {
  static const String _title = 'Flutter Code Sample';

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: _title,
      home: Scaffold(
        appBar: AppBar(title: const Text(_title)),
        body: MyStatelessWidget(),
      ),
    );
  }
}

/// This is the stateless widget that the main application instantiates.
class MyStatelessWidget extends StatelessWidget {
  MyStatelessWidget({Key key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return CustomScrollView(
      slivers: <Widget>[
        SliverToBoxAdapter(
          child: Container(
            color: Colors.amber[300],
            height: 150.0,
          ),
        ),
        SliverFillRemaining(
          hasScrollBody: false,
          child: Container(
            color: Colors.blue[100],
            child: Icon(
              Icons.sentiment_very_satisfied,
              size: 75,
              color: Colors.blue[900],
            ),
          ),
        ),
      ],
    );
  }
}
