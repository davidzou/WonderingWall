import 'package:flutter/material.dart';
import 'package:flutter/services.dart';

void main() => runApp(const MyApp());

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

class MyStatefulWidget extends StatefulWidget {
  const MyStatefulWidget({Key? key}) : super(key: key);

  @override
  State<MyStatefulWidget> createState() => _MyStatefulWidgetState();
}

class _MyStatefulWidgetState extends State<MyStatefulWidget> {
  @override
  Widget build(BuildContext context) {
    return Material(
      child: Center(
        child: Shortcuts(
          shortcuts: const <ShortcutActivator, Intent>{
            // Pressing space in the field will now move to the next field.
            SingleActivator(LogicalKeyboardKey.space): NextFocusIntent(),
          },
          child: FocusTraversalGroup(
            child: Form(
              autovalidateMode: AutovalidateMode.always,
              onChanged: () {
                Form.of(primaryFocus!.context!)!.save();
              },
              child: Wrap(
                children: List<Widget>.generate(5, (int index) {
                  return Padding(
                    padding: const EdgeInsets.all(8.0),
                    child: ConstrainedBox(
                      constraints: BoxConstraints.tight(const Size(200, 50)),
                      child: TextFormField(
                        onSaved: (String? value) {
                          debugPrint(
                              'Value for field $index saved as "$value"');
                        },
                      ),
                    ),
                  );
                }),
              ),
            ),
          ),
        ),
      ),
    );
  }
}
