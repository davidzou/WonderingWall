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
    // The Noto family of fonts can be downloaded from Google Fonts (https://www.google.com/fonts).
    return const Text(
      '次 化 刃 直 入 令',
      locale: Locale(
          'zh', 'CN'), // or Locale('ja'), Locale('ko'), Locale('zh', 'TW'), etc
      style: TextStyle(
        fontFamily: 'Noto Sans',
      ),
    );
  }
}
