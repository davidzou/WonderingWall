/// Flutter code sample for OverflowBar

// This example defines a simple approximation of a dialog
// layout, where the layout of the dialog's action buttons are
// defined by an [OverflowBar]. The content is wrapped in a
// [SingleChildScrollView], so that if overflow occurs, the
// action buttons will still be accessible by scrolling,
// no matter how much vertical space is available.

import 'package:flutter/material.dart';

void main() => runApp(const MyApp());

/// This is the main application widget.
class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  static const String _title = 'Flutter Code Sample';

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: _title,
      home: Scaffold(
        appBar: AppBar(title: const Text(_title)),
        body: const Center(
          child: MyStatelessWidget(),
        ),
      ),
    );
  }
}

/// This is the stateless widget that the main application instantiates.
class MyStatelessWidget extends StatelessWidget {
  const MyStatelessWidget({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      alignment: Alignment.center,
      padding: const EdgeInsets.all(16),
      color: Colors.black.withOpacity(0.15),
      child: Material(
        color: Colors.white,
        elevation: 24,
        shape: const RoundedRectangleBorder(
            borderRadius: BorderRadius.all(Radius.circular(4))),
        child: Padding(
          padding: const EdgeInsets.all(8),
          child: SingleChildScrollView(
            child: Column(
              mainAxisSize: MainAxisSize.min,
              crossAxisAlignment: CrossAxisAlignment.stretch,
              children: <Widget>[
                const SizedBox(height: 128, child: Placeholder()),
                Align(
                  alignment: AlignmentDirectional.centerEnd,
                  child: OverflowBar(
                    spacing: 8,
                    overflowAlignment: OverflowBarAlignment.end,
                    children: <Widget>[
                      TextButton(child: const Text('Cancel'), onPressed: () {}),
                      TextButton(
                          child: const Text('Really Really Cancel'),
                          onPressed: () {}),
                      OutlinedButton(child: const Text('OK'), onPressed: () {}),
                    ],
                  ),
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}
