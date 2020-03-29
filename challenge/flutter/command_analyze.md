Command -- *` analyze `*
====

***

### 索引

* [描述](#description)

* [详解](#details)

    1. [`flutter analyze`](#analyze)
    2. [`flutter analyze --watch`](#analyze_watch)
    3. [`flutter analyze --write=<file>`](#analyze_write_file)
    4. [`flutter analyze [-h | --help]`](#analyze_help)

* [帮助文档](#help_doc)

***

### 描述<a name="description"></a>

__分析项目的Dart代码。__

***

### 详解<a name="details"></a>

* `flutter analyze` <a name="analyze"></a>

    分析当前项目中的dart代码。类似Android的Lint，静态代码检测。

    ```
    zzw:my_first_flutter_demo zzw$ flutter analyze
    Analyzing my_first_flutter_demo...                                      

       info • Unused import: 'package:my_first_flutter_demo/main.dart' • test/widget_test.dart:11:8 • unused_import
      error • The function 'MyApp' isn't defined • test/widget_test.dart:16:29 • undefined_function

    2 issues found. (ran in 6.1s)
    ```

* `flutter analyze --watch` <a name="analyze_watch"></a>

    打开实时监听窗口

* `flutter analyze --write=<file>` <a name="analyze_write_file"></a>

    同`--watch`, 只是实时监听变为了文件，可以使用`tail`来实时查看。

    ```
    zzw:my_first_flutter_demo zzw$ flutter analyze --write=watch.log
    Analyzing my_first_flutter_demo...                                      

       info • Unused import: 'package:my_first_flutter_demo/main.dart' • test/widget_test.dart:11:8 • unused_import
      error • The function 'MyApp' isn't defined • test/widget_test.dart:16:29 • undefined_function

    2 issues found. (ran in 2.6s)
    zzw:my_first_flutter_demo zzw$ ls
    README.md      android        flutter_01.png ios            lib            pubspec.lock   pubspec.yaml   test           watch.log
    zzw:my_first_flutter_demo zzw$ cat watch.log
    [error] The function 'MyApp' isn't defined (/Users/zzw/Develop/workspace/github/WonderingWall/challenge/flutter/my_first_flutter_demo/test/widget_test.dart:16:29)
    [info] Unused import: 'package:my_first_flutter_demo/main.dart' (/Users/zzw/Develop/workspace/github/WonderingWall/challenge/flutter/my_first_flutter_demo/test/widget_test.dart:11:8)
    ```

* `flutter analyze [-h | --help]`<a name="analyze_help"></a>

    显示[帮助文档](#help_doc)

***

### 帮助文档 <a name="help_doc"></a>

```
Analyze the project's Dart code.

Usage: flutter analyze [arguments]
-h, --help                    Print this usage information.
    --[no-]current-package    Analyze the current project, if applicable.
                              (defaults to on)

    --watch                   Run analysis continuously, watching the filesystem for changes.
    --write=<file>            Also output the results to a file. This is useful with --watch if you want a file to always contain the latest results.
    --[no-]pub                Whether to run "flutter pub get" before executing this command.
                              (defaults to on)

    --[no-]congratulate       Show output even when there are no errors, warnings, hints, or lints. Ignored if --watch is specified.
                              (defaults to on)

    --[no-]preamble           When analyzing the flutter repository, display the number of files that will be analyzed.
                              Ignored if --watch is specified.
                              (defaults to on)

Run "flutter help" to see global options.

```
