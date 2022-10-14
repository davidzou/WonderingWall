import 'package:flutter/material.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  static const String _title = 'Flutter Code Sample';

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: _title,
      home: Scaffold(
        appBar: AppBar(title: const Text(_title)),
        body: const MyStatelessWidget(),
      ),
    );
  }
}

class MyStatelessWidget extends StatelessWidget {
  const MyStatelessWidget({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Center(
      child: Column(
        children: <Widget>[
          Expanded(
            child: Container(
              color: Colors.amber,
              child: const Center(
                child: Text('Above'),
              ),
            ),
          ),
          const Divider(
            height: 20,
            thickness: 5,
            indent: 20,
            endIndent: 0,
            color: Colors.black,
          ),
          // Subheader example from Material spec.
          // https://material.io/components/dividers#types
          Container(
            padding: const EdgeInsets.only(left: 20),
            child: Align(
              alignment: AlignmentDirectional.centerStart,
              child: Text(
                'Subheader',
                style: Theme.of(context).textTheme.caption,
                textAlign: TextAlign.start,
              ),
            ),
          ),
          Expanded(
            child: Container(
              color: Theme.of(context).colorScheme.primary,
              child: const Center(
                child: Text('Below'),
              ),
            ),
          ),
        ],
      ),
    );
  }
}
