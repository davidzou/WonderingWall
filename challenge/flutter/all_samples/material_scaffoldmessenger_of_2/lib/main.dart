/// Flutter code sample for ScaffoldMessenger.of

// Sometimes [SnackBar]s are produced by code that doesn't have ready access
// to a valid [BuildContext]. One such example of this is when you show a
// SnackBar from a method outside of the `build` function. In these
// cases, you can assign a [GlobalKey] to the [ScaffoldMessenger]. This
// example shows a key being used to obtain the [ScaffoldMessengerState]
// provided by the [MaterialApp].

import 'package:flutter/material.dart';

void main() => runApp(const MyApp());

class MyApp extends StatefulWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  final GlobalKey<ScaffoldMessengerState> _scaffoldMessengerKey =
      GlobalKey<ScaffoldMessengerState>();
  int _counter = 0;

  void _incrementCounter() {
    setState(() {
      _counter++;
    });
    if (_counter % 10 == 0) {
      _scaffoldMessengerKey.currentState!.showSnackBar(const SnackBar(
        content: Text('A multiple of ten!'),
      ));
    }
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      scaffoldMessengerKey: _scaffoldMessengerKey,
      home: Scaffold(
        appBar: AppBar(title: const Text('ScaffoldMessenger Demo')),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              const Text(
                'You have pushed the button this many times:',
              ),
              Text(
                '$_counter',
                style: Theme.of(context).textTheme.headline4,
              ),
            ],
          ),
        ),
        floatingActionButton: FloatingActionButton(
          onPressed: _incrementCounter,
          tooltip: 'Increment',
          child: const Icon(Icons.add),
        ),
      ),
    );
  }
}
