// Flutter code sample for DropdownButton.selectedItemBuilder

// This sample shows a `DropdownButton` with a button with [Text] that
// corresponds to but is unique from [DropdownMenuItem].

import 'package:flutter/material.dart';

void main() => runApp(MyApp());

/// This Widget is the main application widget.
class MyApp extends StatelessWidget {
  static const String _title = 'Flutter Code Sample';

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: _title,
      home: Scaffold(
        appBar: AppBar(title: const Text(_title)),
        body: MyStatefulWidget(),
      ),
    );
  }
}

class MyStatefulWidget extends StatefulWidget {
  MyStatefulWidget({Key key}) : super(key: key);

  @override
  _MyStatefulWidgetState createState() => _MyStatefulWidgetState();
}

class _MyStatefulWidgetState extends State<MyStatefulWidget> {
  final List<String> items = <String>['1', '2', '3'];
  String selectedItem = '1';

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.symmetric(horizontal: 12.0),
      child: DropdownButton<String>(
        value: selectedItem,
        onChanged: (String string) => setState(() => selectedItem = string),
        selectedItemBuilder: (BuildContext context) {
          return items.map<Widget>((String item) {
            return Text(item);
          }).toList();
        },
        items: items.map((String item) {
          return DropdownMenuItem<String>(
            child: Text('Log $item'),
            value: item,
          );
        }).toList(),
      ),
    );
  }
}
