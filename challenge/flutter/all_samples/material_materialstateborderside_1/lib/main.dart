/// Flutter code sample for MaterialStateBorderSide

// This example defines a subclass of [MaterialStateBorderSide], that resolves
// to a red border side when its widget is selected.

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
  bool isSelected = true;

  @override
  Widget build(BuildContext context) {
    return FilterChip(
      label: const Text('Select chip'),
      selected: isSelected,
      onSelected: (bool value) {
        setState(() {
          isSelected = value;
        });
      },
      side: MaterialStateBorderSide.resolveWith((Set<MaterialState> states) {
        if (states.contains(MaterialState.selected)) {
          return const BorderSide(width: 1, color: Colors.red);
        }
        return null; // Defer to default value on the theme or widget.
      }),
    );
  }
}
