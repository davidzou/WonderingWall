/// Flutter code sample for ScrollMetricsNotification

// This sample shows how a [ScrollMetricsNotification] is dispatched when
// the `windowSize` is changed. Press the floating action button to increase
// the scrollable window's size.

import 'package:flutter/material.dart';

void main() => runApp(const ScrollMetricsDemo());

class ScrollMetricsDemo extends StatefulWidget {
  const ScrollMetricsDemo({Key? key}) : super(key: key);

  @override
  State<ScrollMetricsDemo> createState() => ScrollMetricsDemoState();
}

class ScrollMetricsDemoState extends State<ScrollMetricsDemo> {
  double windowSize = 200.0;

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('ScrollMetrics Demo'),
        ),
        floatingActionButton: FloatingActionButton(
          child: const Icon(Icons.add),
          onPressed: () => setState(() {
            windowSize += 10.0;
          }),
        ),
        body: NotificationListener<ScrollMetricsNotification>(
          onNotification: (ScrollMetricsNotification notification) {
            ScaffoldMessenger.of(notification.context).showSnackBar(
              const SnackBar(
                content: Text('Scroll metrics changed!'),
              ),
            );
            return false;
          },
          child: Scrollbar(
            isAlwaysShown: true,
            child: SizedBox(
              height: windowSize,
              width: double.infinity,
              child: const SingleChildScrollView(
                child: FlutterLogo(
                  size: 300.0,
                ),
              ),
            ),
          ),
        ),
      ),
    );
  }
}
