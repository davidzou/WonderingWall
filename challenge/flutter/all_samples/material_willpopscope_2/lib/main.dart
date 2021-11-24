/// Flutter code sample for WillPopScope

import 'package:flutter/material.dart';

void main() => runApp(const MyApp());

/// This is the main application widget.
class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  static const String _title = 'Flutter Code Sample';

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      title: _title,
      home: MyStatefulWidget(),
    );
  }
}

/// This is the stateful widget that the main application instantiates.
class MyStatefulWidget extends StatefulWidget {
  const MyStatefulWidget({Key? key}) : super(key: key);

  @override
  State<MyStatefulWidget> createState() => _MyStatefulWidgetState();
}

/// This is the private State class that goes with MyStatefulWidget.
class _MyStatefulWidgetState extends State<MyStatefulWidget> {
  bool shouldPop = true;
  @override
  Widget build(BuildContext context) {
    return WillPopScope(
      onWillPop: () async {
        return shouldPop;
      },
      child: Scaffold(
        appBar: AppBar(
          title: const Text('Flutter WillPopScope demo'),
        ),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              OutlinedButton(
                child: const Text('Push'),
                onPressed: () {
                  Navigator.of(context).push<void>(
                    MaterialPageRoute<void>(
                      builder: (BuildContext context) {
                        return const MyStatefulWidget();
                      },
                    ),
                  );
                },
              ),
              OutlinedButton(
                child: Text('shouldPop: $shouldPop'),
                onPressed: () {
                  setState(
                    () {
                      shouldPop = !shouldPop;
                    },
                  );
                },
              ),
              const Text('Push to a new screen, then tap on shouldPop '
                  'button to toggle its value. Press the back '
                  'button in the appBar to check its behaviour '
                  'for different values of shouldPop'),
            ],
          ),
        ),
      ),
    );
  }
}
