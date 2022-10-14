import 'package:flutter/material.dart';

void main() => runApp(const MyApp());

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
          child: InputDecoratorExample(),
        ),
      ),
    );
  }
}

class InputDecoratorExample extends StatelessWidget {
  const InputDecoratorExample({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return TextFormField(
      decoration: InputDecoration(
        border: const OutlineInputBorder(),
        labelText: 'Name',
        // The MaterialStateProperty's value is a text style that is orange
        // by default, but the theme's error color if the input decorator
        // is in its error state.
        floatingLabelStyle:
            MaterialStateTextStyle.resolveWith((Set<MaterialState> states) {
          final Color color = states.contains(MaterialState.error)
              ? Theme.of(context).errorColor
              : Colors.orange;
          return TextStyle(color: color, letterSpacing: 1.3);
        }),
      ),
      validator: (String? value) {
        if (value == null || value == '') {
          return 'Enter name';
        }
        return null;
      },
      autovalidateMode: AutovalidateMode.always,
    );
  }
}
