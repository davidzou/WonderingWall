/// Flutter code sample for MaterialBanner

// MaterialBanner's can also be presented through a [ScaffoldMessenger].
// Here is an example where ScaffoldMessengerState.showMaterialBanner() is used to show the MaterialBanner.

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
        title: const Text('The MaterialBanner is below'),
      ),
      body: Center(
        child: ElevatedButton(
          child: const Text('Show MaterialBanner'),
          onPressed: () => ScaffoldMessenger.of(context).showMaterialBanner(
            const MaterialBanner(
              padding: EdgeInsets.all(20),
              content: Text('Hello, I am a Material Banner'),
              leading: Icon(Icons.agriculture_outlined),
              backgroundColor: Colors.green,
              actions: <Widget>[
                TextButton(
                  child: Text('DISMISS'),
                  onPressed: null,
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}
