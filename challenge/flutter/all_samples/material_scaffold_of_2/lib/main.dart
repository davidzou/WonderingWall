// Flutter code sample for Scaffold.of

// When the [Scaffold] is actually created in the same `build` function, the
// `context` argument to the `build` function can't be used to find the
// [Scaffold] (since it's "above" the widget being returned in the widget
// tree). In such cases, the following technique with a [Builder] can be used
// to provide a new scope with a [BuildContext] that is "under" the
// [Scaffold]:

import 'package:flutter/material.dart';

void main() => runApp(MyApp());

/// This Widget is the main application widget.
class MyApp extends StatelessWidget {
  static const String _title = 'Flutter Code Sample';

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: _title,
      home: MyStatelessWidget(),
    );
  }
}

/// This is the stateless widget that the main application instantiates.
class MyStatelessWidget extends StatelessWidget {
  MyStatelessWidget({Key key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text('Demo')),
      body: Builder(
        // Create an inner BuildContext so that the onPressed methods
        // can refer to the Scaffold with Scaffold.of().
        builder: (BuildContext context) {
          return Center(
            child: RaisedButton(
              child: Text('SHOW A SNACKBAR'),
              onPressed: () {
                Scaffold.of(context).showSnackBar(SnackBar(
                  content: Text('Have a snack!'),
                ));
              },
            ),
          );
        },
      ),
    );
  }
}
