// Flutter code sample for Scaffold.of

// Typical usage of the [Scaffold.of] function is to call it from within the
// `build` method of a child of a [Scaffold].

import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Code Sample for Scaffold.of.',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: Scaffold(
        body: MyScaffoldBody(),
        appBar: AppBar(title: Text('Scaffold.of Example')),
      ),
      color: Colors.white,
    );
  }
}

class MyScaffoldBody extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Center(
      child: RaisedButton(
        child: Text('SHOW A SNACKBAR'),
        onPressed: () {
          Scaffold.of(context).showSnackBar(
            SnackBar(
              content: Text('Have a snack!'),
            ),
          );
        },
      ),
    );
  }
}
