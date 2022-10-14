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
    const int rowCount = 48;
    const int columnCount = 6;

    return InteractiveViewer(
      alignPanAxis: true,
      constrained: false,
      scaleEnabled: false,
      child: Table(
        columnWidths: <int, TableColumnWidth>{
          for (int column = 0; column < columnCount; column += 1)
            column: const FixedColumnWidth(200.0),
        },
        children: <TableRow>[
          for (int row = 0; row < rowCount; row += 1)
            TableRow(
              children: <Widget>[
                for (int column = 0; column < columnCount; column += 1)
                  Container(
                    height: 26,
                    color: row % 2 + column % 2 == 1
                        ? Colors.white
                        : Colors.grey.withOpacity(0.1),
                    child: Align(
                      alignment: Alignment.centerLeft,
                      child: Text('$row x $column'),
                    ),
                  ),
              ],
            ),
        ],
      ),
    );
  }
}
