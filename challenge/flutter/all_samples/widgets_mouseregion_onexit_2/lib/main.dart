/// Flutter code sample for MouseRegion.onExit

// The following example shows a widget that hides its content one second
// after being hovered, and also exposes the enter and exit callbacks.
// Because the widget conditionally creates the `MouseRegion`, and leaks the
// hover state, it needs to take the restriction into consideration. In this
// case, since it has access to the event that triggers the disappearance of
// the `MouseRegion`, it simply trigger the exit callback during that event
// as well.

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

// A region that hides its content one second after being hovered.
class MyTimedButton extends StatefulWidget {
  const MyTimedButton(
      {Key? key, required this.onEnterButton, required this.onExitButton})
      : super(key: key);

  final VoidCallback onEnterButton;
  final VoidCallback onExitButton;

  @override
  State<MyTimedButton> createState() => _MyTimedButton();
}

class _MyTimedButton extends State<MyTimedButton> {
  bool regionIsHidden = false;
  bool hovered = false;

  Future<void> startCountdown() async {
    await Future<void>.delayed(const Duration(seconds: 1));
    hideButton();
  }

  void hideButton() {
    setState(() {
      regionIsHidden = true;
    });
    // This statement is necessary.
    if (hovered) {
      widget.onExitButton();
    }
  }

  @override
  Widget build(BuildContext context) {
    return SizedBox(
      width: 100,
      height: 100,
      child: MouseRegion(
        child: regionIsHidden
            ? null
            : MouseRegion(
                onEnter: (_) {
                  widget.onEnterButton();
                  setState(() {
                    hovered = true;
                  });
                  startCountdown();
                },
                onExit: (_) {
                  setState(() {
                    hovered = false;
                  });
                  widget.onExitButton();
                },
                child: Container(color: Colors.red),
              ),
      ),
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
  Key key = UniqueKey();
  bool hovering = false;

  @override
  Widget build(BuildContext context) {
    return Column(
      children: <Widget>[
        ElevatedButton(
          onPressed: () {
            setState(() {
              key = UniqueKey();
            });
          },
          child: const Text('Refresh'),
        ),
        if (hovering) const Text('Hovering'),
        if (!hovering) const Text('Not hovering'),
        MyTimedButton(
          key: key,
          onEnterButton: () {
            setState(() {
              hovering = true;
            });
          },
          onExitButton: () {
            setState(() {
              hovering = false;
            });
          },
        ),
      ],
    );
  }
}
