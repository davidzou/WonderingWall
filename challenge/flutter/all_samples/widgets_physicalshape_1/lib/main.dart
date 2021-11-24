/// Flutter code sample for PhysicalShape

// This example shows how to use a [PhysicalShape] on a centered [SizedBox]
// to clip it to a rounded rectangle using a [ShapeBorderClipper] and give it
// an orange color along with a shadow.

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
      home: MyStatelessWidget(),
    );
  }
}

/// This is the stateless widget that the main application instantiates.
class MyStatelessWidget extends StatelessWidget {
  const MyStatelessWidget({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('PhysicalShape Sample'),
      ),
      body: Center(
        child: PhysicalShape(
          elevation: 5.0,
          child: const SizedBox(
            child: Center(
              child: Text(
                'Hello, World!',
                style: TextStyle(
                  color: Colors.white,
                  fontSize: 20.0,
                ),
              ),
            ),
            height: 200.0,
            width: 200.0,
          ),
          clipper: ShapeBorderClipper(
              shape: RoundedRectangleBorder(
            borderRadius: BorderRadius.circular(10.0),
          )),
          color: Colors.orange,
        ),
      ),
    );
  }
}
