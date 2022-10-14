import 'package:flutter/material.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  static const String _title = 'Tooltip Sample';

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      title: _title,
      home: TooltipSample(title: _title),
    );
  }
}

class TooltipSample extends StatelessWidget {
  const TooltipSample({Key? key, required this.title}) : super(key: key);

  final String title;

  @override
  Widget build(BuildContext context) {
    final GlobalKey<TooltipState> tooltipkey = GlobalKey<TooltipState>();

    return Scaffold(
      appBar: AppBar(title: Text(title)),
      body: Center(
        child: Tooltip(
          // Provide a global key with the "TooltipState" type to show
          // the tooltip manually when trigger mode is set to manual.
          key: tooltipkey,
          triggerMode: TooltipTriggerMode.manual,
          showDuration: const Duration(seconds: 1),
          message: 'I am a Tooltip',
          child: const Text('Tap on the FAB'),
        ),
      ),
      floatingActionButton: FloatingActionButton.extended(
        onPressed: () {
          // Show Tooltip programmatically on button tap.
          tooltipkey.currentState?.ensureTooltipVisible();
        },
        label: const Text('Show Tooltip'),
      ),
    );
  }
}
