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
        body: const MyStatefulWidget(),
      ),
    );
  }
}

class MyStatefulWidget extends StatefulWidget {
  const MyStatefulWidget({Key? key}) : super(key: key);

  @override
  State<MyStatefulWidget> createState() => _MyStatefulWidgetState();
}

class _MyStatefulWidgetState extends State<MyStatefulWidget> {
  Offset offset = Offset.zero;

  void _slideUp() {
    setState(() => offset -= const Offset(0, 1));
  }

  void _slideDown() {
    setState(() => offset += const Offset(0, 1));
  }

  @override
  Widget build(BuildContext context) {
    return Column(
      mainAxisSize: MainAxisSize.min,
      children: <Widget>[
        ElevatedButton(
          onPressed: _slideUp,
          child: const Text('Slide up'),
        ),
        ElevatedButton(
          onPressed: _slideDown,
          child: const Text('Slide down'),
        ),
        Padding(
          padding: const EdgeInsets.all(50),
          child: AnimatedSlide(
            offset: offset,
            duration: const Duration(milliseconds: 500),
            curve: Curves.easeInOut,
            child: const FlutterLogo(),
          ),
        ),
      ],
    );
  }
}
