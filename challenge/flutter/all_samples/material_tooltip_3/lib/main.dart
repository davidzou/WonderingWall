import 'package:flutter/material.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  static const String _title = 'Tooltip Sample';

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: _title,
      home: Scaffold(
        appBar: AppBar(title: const Text(_title)),
        body: const Center(
          child: TooltipSample(),
        ),
      ),
    );
  }
}

class TooltipSample extends StatelessWidget {
  const TooltipSample({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return const Tooltip(
      richMessage: TextSpan(
        text: 'I am a rich tooltip. ',
        style: TextStyle(color: Colors.red),
        children: <InlineSpan>[
          TextSpan(
            text: 'I am another span of this rich tooltip',
            style: TextStyle(fontWeight: FontWeight.bold),
          ),
        ],
      ),
      child: Text('Tap this text and hold down to show a tooltip.'),
    );
  }
}
