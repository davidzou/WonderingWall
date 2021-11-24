/// Flutter code sample for FocusNode.unfocus

// This example shows the difference between the different [UnfocusDisposition]
// values for [unfocus].
//
// Try setting focus on the four text fields by selecting them, and then
// select "UNFOCUS" to see what happens when the current
// [FocusManager.primaryFocus] is unfocused.
//
// Try pressing the TAB key after unfocusing to see what the next widget
// chosen is.

import 'package:flutter/foundation.dart';
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
  UnfocusDisposition disposition = UnfocusDisposition.scope;

  @override
  Widget build(BuildContext context) {
    return Material(
      child: Container(
        color: Colors.white,
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Wrap(
              children: List<Widget>.generate(4, (int index) {
                return const SizedBox(
                  width: 200,
                  child: Padding(
                    padding: EdgeInsets.all(8.0),
                    child: TextField(
                      decoration: InputDecoration(border: OutlineInputBorder()),
                    ),
                  ),
                );
              }),
            ),
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceAround,
              children: <Widget>[
                ...List<Widget>.generate(UnfocusDisposition.values.length,
                    (int index) {
                  return Row(
                    mainAxisSize: MainAxisSize.min,
                    children: <Widget>[
                      Radio<UnfocusDisposition>(
                        groupValue: disposition,
                        onChanged: (UnfocusDisposition? value) {
                          setState(() {
                            if (value != null) {
                              disposition = value;
                            }
                          });
                        },
                        value: UnfocusDisposition.values[index],
                      ),
                      Text(describeEnum(UnfocusDisposition.values[index])),
                    ],
                  );
                }),
                OutlinedButton(
                  child: const Text('UNFOCUS'),
                  onPressed: () {
                    setState(() {
                      primaryFocus!.unfocus(disposition: disposition);
                    });
                  },
                ),
              ],
            ),
          ],
        ),
      ),
    );
  }
}
