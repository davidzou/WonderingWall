/// Flutter code sample for PositionedTransition

// The following code implements the [PositionedTransition] as seen in the video
// above:

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
/// AnimationControllers can be created with `vsync: this` because of TickerProviderStateMixin.
class _MyStatefulWidgetState extends State<MyStatefulWidget>
    with TickerProviderStateMixin {
  late final AnimationController _controller = AnimationController(
    duration: const Duration(seconds: 2),
    vsync: this,
  )..repeat(reverse: true);

  @override
  void dispose() {
    _controller.dispose();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    const double smallLogo = 100;
    const double bigLogo = 200;

    return LayoutBuilder(
      builder: (BuildContext context, BoxConstraints constraints) {
        final Size biggest = constraints.biggest;
        return Stack(
          children: <Widget>[
            PositionedTransition(
              rect: RelativeRectTween(
                begin: RelativeRect.fromSize(
                    const Rect.fromLTWH(0, 0, smallLogo, smallLogo), biggest),
                end: RelativeRect.fromSize(
                    Rect.fromLTWH(biggest.width - bigLogo,
                        biggest.height - bigLogo, bigLogo, bigLogo),
                    biggest),
              ).animate(CurvedAnimation(
                parent: _controller,
                curve: Curves.elasticInOut,
              )),
              child: const Padding(
                  padding: EdgeInsets.all(8), child: FlutterLogo()),
            ),
          ],
        );
      },
    );
  }
}
