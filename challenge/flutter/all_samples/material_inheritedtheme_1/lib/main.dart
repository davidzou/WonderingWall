/// Flutter code sample for InheritedTheme

// This example demonstrates how `InheritedTheme.capture()` can be used
// to wrap the contents of a new route with the inherited themes that
// are present when the route was built - but are not present when route
// is actually shown.
//
// If the same code is run without `InheritedTheme.capture(), the
// new route's Text widget will inherit the "something must be wrong"
// fallback text style, rather than the default text style defined in MyApp.

import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyAppBody extends StatelessWidget {
  const MyAppBody({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    final NavigatorState navigator = Navigator.of(context);
    // This InheritedTheme.capture() saves references to themes that are
    // found above the context provided to this widget's build method
    // excluding themes are found above the navigator. Those themes do
    // not have to be captured, because they will already be visible from
    // the new route pushed onto said navigator.
    // Themes are captured outside of the route's builder because when the
    // builder executes, the context may not be valid anymore.
    final CapturedThemes themes =
        InheritedTheme.capture(from: context, to: navigator.context);
    return GestureDetector(
      onTap: () {
        Navigator.of(context).push(
          MaterialPageRoute<void>(
            builder: (BuildContext _) {
              // Wrap the actual child of the route in the previously
              // captured themes.
              return themes.wrap(
                Container(
                  alignment: Alignment.center,
                  color: Colors.white,
                  child: const Text('Hello World'),
                ),
              );
            },
          ),
        );
      },
      child: const Center(child: Text('Tap Here')),
    );
  }
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
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
