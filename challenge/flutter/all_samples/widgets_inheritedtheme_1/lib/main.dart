// Flutter code sample for InheritedTheme

// This example demonstrates how `InheritedTheme.captureAll()` can be used
// to wrap the contents of a new route with the inherited themes that
// are present when the route is built - but are not present when route
// is actually shown.
//
// If the same code is run without `InheritedTheme.captureAll(), the
// new route's Text widget will inherit the "something must be wrong"
// fallback text style, rather than the default text style defined in MyApp.

import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyAppBody extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: () {
        Navigator.of(context).push(
          MaterialPageRoute(
            builder: (BuildContext _) {
              // InheritedTheme.captureAll() saves references to themes that
              // are found above the context provided to this widget's build
              // method, notably the DefaultTextStyle defined in MyApp. The
              // context passed to the MaterialPageRoute's builder is not used,
              // because its ancestors are above MyApp's home.
              return InheritedTheme.captureAll(
                  context,
                  Container(
                    alignment: Alignment.center,
                    color: Theme.of(context).colorScheme.surface,
                    child: Text('Hello World'),
                  ));
            },
          ),
        );
      },
      child: Center(child: Text('Tap Here')),
    );
  }
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        // Override the DefaultTextStyle defined by the Scaffold.
        // Descendant widgets will inherit this big blue text style.
        body: DefaultTextStyle(
          style: TextStyle(fontSize: 48, color: Colors.blue),
          child: MyAppBody(),
        ),
      ),
    );
  }
}
