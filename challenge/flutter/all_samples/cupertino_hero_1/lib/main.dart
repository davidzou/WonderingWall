/// Flutter code sample for Hero

// This sample shows a [Hero] used within a [ListTile].
//
// Tapping on the Hero-wrapped rectangle triggers a hero
// animation as a new [MaterialPageRoute] is pushed. Both the size
// and location of the rectangle animates.
//
// Both widgets use the same [Hero.tag].
//
// The Hero widget uses the matching tags to identify and execute this
// animation.

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
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: <Widget>[
        const SizedBox(
          height: 20.0,
        ),
        ListTile(
          leading: Hero(
            tag: 'hero-rectangle',
            child: _blueRectangle(const Size(50, 50)),
          ),
          onTap: () => _gotoDetailsPage(context),
          title:
              const Text('Tap on the icon to view hero animation transition.'),
        ),
      ],
    );
  }

  Widget _blueRectangle(Size size) {
    return Container(
      width: size.width,
      height: size.height,
      color: Colors.blue,
    );
  }

  void _gotoDetailsPage(BuildContext context) {
    Navigator.of(context).push(MaterialPageRoute<void>(
      builder: (BuildContext context) => Scaffold(
        appBar: AppBar(
          title: const Text('second Page'),
        ),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              Hero(
                tag: 'hero-rectangle',
                child: _blueRectangle(const Size(200, 200)),
              ),
            ],
          ),
        ),
      ),
    ));
  }
}
