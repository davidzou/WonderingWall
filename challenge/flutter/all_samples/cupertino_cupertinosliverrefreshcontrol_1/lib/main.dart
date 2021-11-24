/// Flutter code sample for CupertinoSliverRefreshControl

// When the user scrolls past [refreshTriggerPullDistance],
// this sample shows the default iOS pull to refresh indicator for 1 second and
// adds a new item to the top of the list view.

import 'package:flutter/cupertino.dart';

void main() => runApp(const MyApp());

/// This is the main application widget.
class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  static const String _title = 'Flutter Code Sample';

  @override
  Widget build(BuildContext context) {
    return const CupertinoApp(
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
  List<Color> colors = <Color>[
    CupertinoColors.systemYellow,
    CupertinoColors.systemOrange,
    CupertinoColors.systemPink
  ];
  List<Widget> items = <Widget>[
    Container(color: CupertinoColors.systemPink, height: 100.0),
    Container(color: CupertinoColors.systemOrange, height: 100.0),
    Container(color: CupertinoColors.systemYellow, height: 100.0),
  ];

  @override
  Widget build(BuildContext context) {
    return CupertinoApp(
        home: CupertinoPageScaffold(
            child: CustomScrollView(
      physics:
          const BouncingScrollPhysics(parent: AlwaysScrollableScrollPhysics()),
      slivers: <Widget>[
        const CupertinoSliverNavigationBar(largeTitle: Text('Scroll down')),
        CupertinoSliverRefreshControl(
          refreshTriggerPullDistance: 100.0,
          refreshIndicatorExtent: 60.0,
          onRefresh: () async {
            await Future<void>.delayed(const Duration(milliseconds: 1000));
            setState(() {
              items.insert(
                  0, Container(color: colors[items.length % 3], height: 100.0));
            });
          },
        ),
        SliverList(
          delegate: SliverChildBuilderDelegate(
            (BuildContext context, int index) => items[index],
            childCount: items.length,
          ),
        ),
      ],
    )));
  }
}
