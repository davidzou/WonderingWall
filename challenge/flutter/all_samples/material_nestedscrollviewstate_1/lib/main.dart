import 'package:flutter/material.dart';

void main() => runApp(const MyApp());

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

final GlobalKey<NestedScrollViewState> globalKey = GlobalKey();

class MyStatelessWidget extends StatelessWidget {
  const MyStatelessWidget({Key? key}) : super(key: key);

  @override
  @override
  Widget build(BuildContext context) {
    return NestedScrollView(
      key: globalKey,
      headerSliverBuilder: (BuildContext context, bool innerBoxIsScrolled) {
        return const <Widget>[
          SliverAppBar(
            title: Text('NestedScrollViewState Demo!'),
          ),
        ];
      },
      body: const CustomScrollView(
          // Body slivers go here!
          ),
    );
  }

  ScrollController get innerController {
    return globalKey.currentState!.innerController;
  }
}
