// Flutter code sample for SliverFillRemaining

// In this sample the [SliverFillRemaining] defers to the size of its [child]
// because the [precedingScrollExtent] of the [SliverConstraints] has gone
// beyond that of the viewport's main axis.

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
        SliverFixedExtentList(
          itemExtent: 130.0,
          delegate: SliverChildBuilderDelegate(
            (BuildContext context, int index) {
              return Container(
                color: index % 2 == 0 ? Colors.indigo[200] : Colors.orange[200],
              );
            },
            childCount: 5,
          ),
        ),
        SliverFillRemaining(
          hasScrollBody: false,
          child: Container(
            child: Padding(
              padding: const EdgeInsets.all(50.0),
              child: Icon(
                Icons.pan_tool,
                size: 60,
                color: Colors.blueGrey,
              ),
            ),
          ),
        ),
      ],
    );
  }
}
