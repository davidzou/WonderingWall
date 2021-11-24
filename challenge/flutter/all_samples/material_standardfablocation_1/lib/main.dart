/// Flutter code sample for StandardFabLocation

// This is an example of a user-defined [FloatingActionButtonLocation].
//
// The example shows a [Scaffold] with an [AppBar], a [BottomAppBar], and a
// [FloatingActionButton] using a custom [FloatingActionButtonLocation].
//
// The new [FloatingActionButtonLocation] is defined
// by extending [StandardFabLocation] with two mixins,
// [FabEndOffsetX] and [FabFloatOffsetY], and overriding the
// [getOffsetX] method to adjust the FAB's x-coordinate, creating a
// [FloatingActionButtonLocation] slightly different from
// [FloatingActionButtonLocation.endFloat].

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

class AlmostEndFloatFabLocation extends StandardFabLocation
    with FabEndOffsetX, FabFloatOffsetY {
  @override
  double getOffsetX(
      ScaffoldPrelayoutGeometry scaffoldGeometry, double adjustment) {
    final double directionalAdjustment =
        scaffoldGeometry.textDirection == TextDirection.ltr ? -50.0 : 50.0;
    return super.getOffsetX(scaffoldGeometry, adjustment) +
        directionalAdjustment;
  }
}

/// This is the stateless widget that the main application instantiates.
class MyStatelessWidget extends StatelessWidget {
  const MyStatelessWidget({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Home page'),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          print('FAB pressed.');
        },
        tooltip: 'Increment',
        child: const Icon(Icons.add),
      ),
      floatingActionButtonLocation: AlmostEndFloatFabLocation(),
    );
  }
}
