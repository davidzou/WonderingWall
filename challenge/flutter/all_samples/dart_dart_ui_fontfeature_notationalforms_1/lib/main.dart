import 'dart:ui';

import 'package:flutter/widgets.dart';

void main() => runApp(const ExampleApp());

class ExampleApp extends StatelessWidget {
  const ExampleApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return WidgetsApp(
      builder: (BuildContext context, Widget? navigator) =>
          const ExampleWidget(),
      color: const Color(0xffffffff),
    );
  }
}

class ExampleWidget extends StatelessWidget {
  const ExampleWidget({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    // The Gothic A1 font can be downloaded from Google Fonts (https://www.google.com/fonts).
    return const Text(
      'abc 123',
      style: TextStyle(
        fontFamily: 'Gothic A1',
        fontFeatures: <FontFeature>[
          FontFeature.notationalForms(3), // circled letters and digits
        ],
      ),
    );
  }
}
