// Flutter code sample for SliverFillRemaining

// In this sample the [SliverFillRemaining]'s child stretches to fill the
// overscroll area when [fillOverscroll] is true. This sample also features a
// button that is pinned to the bottom of the sliver, regardless of size or
// overscroll behavior. Try switching [fillOverscroll] to see the difference.

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
      // The ScrollPhysics are overridden here to illustrate the functionality
      // of fillOverscroll on all devices this sample may be run on.
      // fillOverscroll only changes the behavior of your layout when applied
      // to Scrollables that allow for overscroll. BouncingScrollPhysics are
      // one example, which are provided by default on the iOS platform.
      physics: BouncingScrollPhysics(),
      slivers: <Widget>[
        SliverToBoxAdapter(
          child: Container(
            color: Colors.tealAccent[700],
            height: 150.0,
          ),
        ),
        SliverFillRemaining(
          hasScrollBody: false,
          // Switch for different overscroll behavior in your layout.
          // If your ScrollPhysics do not allow for overscroll, setting
          // fillOverscroll to true will have no effect.
          fillOverscroll: true,
          child: Container(
            color: Colors.teal[100],
            child: Align(
              alignment: Alignment.bottomCenter,
              child: Padding(
                padding: const EdgeInsets.all(16.0),
                child: RaisedButton(
                  onPressed: () {
                    /* Place your onPressed code here! */
                  },
                  child: Text('Bottom Pinned Button!'),
                ),
              ),
            ),
          ),
        ),
      ],
    );
  }
}
