import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';

void main() => runApp(const AutocompleteExampleApp());

class AutocompleteExampleApp extends StatelessWidget {
  const AutocompleteExampleApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: const Text('RawAutocomplete Basic'),
        ),
        body: const Center(
          child: AutocompleteBasicExample(),
        ),
      ),
    );
  }
}

class AutocompleteBasicExample extends StatelessWidget {
  const AutocompleteBasicExample({Key? key}) : super(key: key);

  static const List<String> _options = <String>[
    'aardvark',
    'bobcat',
    'chameleon',
  ];

  @override
  Widget build(BuildContext context) {
    return RawAutocomplete<String>(
      optionsBuilder: (TextEditingValue textEditingValue) {
        return _options.where((String option) {
          return option.contains(textEditingValue.text.toLowerCase());
        });
      },
      fieldViewBuilder: (BuildContext context,
          TextEditingController textEditingController,
          FocusNode focusNode,
          VoidCallback onFieldSubmitted) {
        return TextFormField(
          controller: textEditingController,
          focusNode: focusNode,
          onFieldSubmitted: (String value) {
            onFieldSubmitted();
          },
        );
      },
      optionsViewBuilder: (BuildContext context,
          AutocompleteOnSelected<String> onSelected, Iterable<String> options) {
        return Align(
          alignment: Alignment.topLeft,
          child: Material(
            elevation: 4.0,
            child: SizedBox(
              height: 200.0,
              child: ListView.builder(
                padding: const EdgeInsets.all(8.0),
                itemCount: options.length,
                itemBuilder: (BuildContext context, int index) {
                  final String option = options.elementAt(index);
                  return GestureDetector(
                    onTap: () {
                      onSelected(option);
                    },
                    child: ListTile(
                      title: Text(option),
                    ),
                  );
                },
              ),
            ),
          ),
        );
      },
    );
  }
}
