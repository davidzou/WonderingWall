/// Flutter code sample for CharacterActivator

// In the following example, when a key combination results in a question mark,
// the counter is increased:

import 'package:flutter/material.dart';

void main() => runApp(const MyApp());

/// This is the main application widget.
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
          child: MyStatefulWidget(),
        ),
      ),
    );
  }
}

class HelpMenuIntent extends Intent {
  const HelpMenuIntent();
}

/// This is the stateful widget that the main application instantiates.
class MyStatefulWidget extends StatefulWidget {
  const MyStatefulWidget({Key? key}) : super(key: key);

  @override
  State<MyStatefulWidget> createState() => _MyStatefulWidgetState();
}

/// This is the private State class that goes with MyStatefulWidget.
class _MyStatefulWidgetState extends State<MyStatefulWidget> {
  @override
  Widget build(BuildContext context) {
    return Shortcuts(
      shortcuts: const <ShortcutActivator, Intent>{
        CharacterActivator('?'): HelpMenuIntent(),
      },
      child: Actions(
        actions: <Type, Action<Intent>>{
          HelpMenuIntent: CallbackAction<HelpMenuIntent>(
            onInvoke: (HelpMenuIntent intent) {
              ScaffoldMessenger.of(context).showSnackBar(
                const SnackBar(content: Text('Keep calm and carry on!')),
              );
              return null;
            },
          ),
        },
        child: Focus(
          autofocus: true,
          child: Column(
            children: const <Widget>[
              Text('Press question mark for help'),
            ],
          ),
        ),
      ),
    );
  }
}
