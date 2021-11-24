/// Flutter code sample for Notification

// This example shows a [NotificationListener] widget
// that listens for [ScrollNotification] notifications. When a scroll
// event occurs in the [NestedScrollView],
// this widget is notified. The events could be either a
// [ScrollStartNotification]or[ScrollEndNotification].

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
      home: MyStatelessWidget(),
    );
  }
}

/// This is the stateless widget that the main application instantiates.
class MyStatelessWidget extends StatelessWidget {
  const MyStatelessWidget({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    const List<String> _tabs = <String>['Months', 'Days'];
    const List<String> _months = <String>[
      'January',
      'February',
      'March',
    ];
    const List<String> _days = <String>[
      'Sunday',
      'Monday',
      'Tuesday',
    ];
    return DefaultTabController(
      length: _tabs.length,
      child: Scaffold(
        // Listens to the scroll events and returns the current position.
        body: NotificationListener<ScrollNotification>(
          onNotification: (ScrollNotification scrollNotification) {
            if (scrollNotification is ScrollStartNotification) {
              print('Scrolling has started');
            } else if (scrollNotification is ScrollEndNotification) {
              print('Scrolling has ended');
            }
            // Return true to cancel the notification bubbling.
            return true;
          },
          child: NestedScrollView(
            headerSliverBuilder:
                (BuildContext context, bool innerBoxIsScrolled) {
              return <Widget>[
                SliverAppBar(
                  title: const Text('Flutter Code Sample'),
                  pinned: true,
                  floating: true,
                  bottom: TabBar(
                    tabs: _tabs.map((String name) => Tab(text: name)).toList(),
                  ),
                ),
              ];
            },
            body: TabBarView(
              children: <Widget>[
                ListView.builder(
                  itemCount: _months.length,
                  itemBuilder: (BuildContext context, int index) {
                    return ListTile(title: Text(_months[index]));
                  },
                ),
                ListView.builder(
                  itemCount: _days.length,
                  itemBuilder: (BuildContext context, int index) {
                    return ListTile(title: Text(_days[index]));
                  },
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}
