import 'package:flutter/material.dart';

class CounterBody extends StatelessWidget {
  const CounterBody({Key? key, required this.counterValueNotifier})
      : super(key: key);

  final ValueNotifier<int> counterValueNotifier;

  @override
  Widget build(BuildContext context) {
    return Center(
      child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: <Widget>[
          const Text('Current counter value:'),
          // Thanks to the [AnimatedBuilder], only the widget displaying the
          // current count is rebuilt when `counterValueNotifier` notifies its
          // listeners. The [Text] widget above and [CounterBody] itself aren't
          // rebuilt.
          AnimatedBuilder(
            // [AnimatedBuilder] accepts any [Listenable] subtype.
            animation: counterValueNotifier,
            builder: (BuildContext context, Widget? child) {
              return Text('${counterValueNotifier.value}');
            },
          ),
        ],
      ),
    );
  }
}

class MyApp extends StatefulWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  final ValueNotifier<int> _counter = ValueNotifier<int>(0);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(title: const Text('AnimatedBuilder example')),
        body: CounterBody(counterValueNotifier: _counter),
        floatingActionButton: FloatingActionButton(
          onPressed: () => _counter.value++,
          child: const Icon(Icons.add),
        ),
      ),
    );
  }
}

void main() {
  runApp(const MyApp());
}
