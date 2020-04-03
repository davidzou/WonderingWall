// Flutter code sample for EditableText.onSubmitted

// When a non-completion action is pressed, such as "next" or "previous", it
// is often desirable to move the focus to the next or previous field.  To do
// this, handle it as in this example, by calling [FocusNode.focusNext] in
// the [TextFormField.onFieldSubmitted] callback ([TextFormField] wraps
// [EditableText] internally, and uses the value of `onFieldSubmitted` as its
// [onSubmitted]).

import 'package:flutter/material.dart';

void main() => runApp(MyApp());

/// This Widget is the main application widget.
class MyApp extends StatelessWidget {
  static const String _title = 'Flutter Code Sample';

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: _title,
      home: MyStatefulWidget(),
    );
  }
}

class MyStatefulWidget extends StatefulWidget {
  MyStatefulWidget({Key key}) : super(key: key);

  @override
  _MyStatefulWidgetState createState() => _MyStatefulWidgetState();
}

class _MyStatefulWidgetState extends State<MyStatefulWidget> {
  FocusScopeNode _focusScopeNode = FocusScopeNode();
  final _controller1 = TextEditingController();
  final _controller2 = TextEditingController();

  void dispose() {
    _focusScopeNode.dispose();
    _controller1.dispose();
    _controller2.dispose();
    super.dispose();
  }

  void _handleSubmitted(String value) {
    _focusScopeNode.nextFocus();
  }

  Widget build(BuildContext context) {
    return Scaffold(
      body: FocusScope(
        node: _focusScopeNode,
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Padding(
              padding: const EdgeInsets.all(8.0),
              child: TextFormField(
                textInputAction: TextInputAction.next,
                onFieldSubmitted: _handleSubmitted,
                controller: _controller1,
                decoration: InputDecoration(border: OutlineInputBorder()),
              ),
            ),
            Padding(
              padding: const EdgeInsets.all(8.0),
              child: TextFormField(
                textInputAction: TextInputAction.next,
                onFieldSubmitted: _handleSubmitted,
                controller: _controller2,
                decoration: InputDecoration(border: OutlineInputBorder()),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
