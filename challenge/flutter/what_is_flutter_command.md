Flutter 命令行全解
====

***

### 目录

1. [开始](#start)

2. [语法](#grammar)

3. [命令](#commands)

    * [analyze](#analyze)
    * [assemble](#assemble)
    * [attach](#attach)
    * [bash-completion](#bash-completion)
    * [build](#build)
    * [channel](#channel)
    * [clean](#clean)
    * [config](#config)
    * [create](#create)
    * [devices](#devices)
    * [doctor](#dector)
    * [drive](#drive)
    * [emulators](#emulators)
    * [format](#format)
    * [generate](#generate)
    * [help](#help)
    * [install](#install)
    * [logs](#logs)
    * [make-host-app-editable](#make-host-app-editable)
    * [precache](#precache)
    * [pub](#pub)
    * [run](#run)
    * [screenshot](#screenshot)
    * [test](#test)
    * [upgrade](#upgrade)
    * [version](#version)


4. [全局参数](#global_options)

    * [`-h | --help`](#global_option_help)
    * [`-v | --verbose`](#global_option_verbose)
    * [`-d | --device-id`](#global_opotion_device_id)
    * [`--version`](#global_option_version)
    * [`--suppress-analytics`](#global_option_suppress_analytics)
    * [`--bug-report`](#global_option_bug_report)


5. [其他已知](#others)

    * [`flutter update-packages`](#other_update_packages)

***

### 开始<a name="start"></a>

当命令行键入flutter后出现如下帮助文件，这里基于帮助文档我们来探索一下flutter命令行的世界。

```
zzw:flutter zzw$ flutter
Manage your Flutter app development.

Common commands:

  flutter create <output directory>
    Create a new Flutter project in the specified directory.

  flutter run [options]
    Run your Flutter application on an attached device or in an emulator.

Usage: flutter <command> [arguments]

Global options:
-h, --help                  Print this usage information.
-v, --verbose               Noisy logging, including all shell commands executed.
                            If used with --help, shows hidden options.

-d, --device-id             Target device id or name (prefixes allowed).
    --version               Reports the version of this tool.
    --suppress-analytics    Suppress analytics reporting when this command runs.
    --bug-report            Captures a bug report file to submit to the Flutter team.
                            Contains local paths, device identifiers, and log snippets.

Available commands:
  analyze                  Analyze the project's Dart code.
  assemble                 Assemble and build flutter resources.
  attach                   Attach to a running application.
  bash-completion          Output command line shell completion setup scripts.
  build                    Flutter build commands.
  channel                  List or switch flutter channels.
  clean                    Delete the build/ and .dart_tool/ directories.
  config                   Configure Flutter settings.
  create                   Create a new Flutter project.
  devices                  List all connected devices.
  doctor                   Show information about the installed tooling.
  drive                    Runs Flutter Driver tests for the current project.
  emulators                List, launch and create emulators.
  format                   Format one or more dart files.
  generate                 run code generators.
  help                     Display help information for flutter.
  install                  Install a Flutter app on an attached device.
  logs                     Show log output for running Flutter apps.
  make-host-app-editable   Moves host apps from generated directories to non-generated directories so that they can be edited by developers.
  precache                 Populates the Flutter tool's cache of binary artifacts.
  pub                      Commands for managing Flutter packages.
  run                      Run your Flutter app on an attached device.
  screenshot               Take a screenshot from a connected device.
  test                     Run Flutter unit tests for the current project.
  upgrade                  Upgrade your copy of Flutter.
  version                  List or switch flutter versions.

Run "flutter help <command>" for more information about a command.
Run "flutter help -v" for verbose help output, including less commonly used options.
```

***

### 语法<a name="grammar"></a>

```
flutter <command> [arguments]
```

flutter命令提供两部分命令行参数，`<command>`表示子指令，`[arguments]`表示指令可接受的参数或者全局参数。

***

### 命令<a name="commands"></a>

* [analyze](command_analyze.md)<a name="analyze"></a>

* [assemble](command_assemble.md)<a name="assemble"></a>

* attach<a name="attach"></a>

* [bash-completion](command_bash_completion.md)<a name="bash-completion"></a> *输出命令行补全设置脚本。*

* [channel](command_channel.md)<a name="channel"></a> *查看和切换flutter版本*

* clean<a name="clean"></a>

* config<a name="config"></a>

* create<a name="create"></a>

* [devices](command_devices.md)<a name="devices"></a> *查看可用连接设备。*

* doctor<a name="dector"></a>

* drive<a name="drive"></a>

* emulators<a name="emulators"></a>

* format<a name="format"></a>

* generate<a name="generate"></a>

* [help](command_help.md)<a name="help"></a> 帮助。

* install<a name="install"></a>

* logs<a name="logs"></a>

* make-host-app-editable<a name="make-host-app-editable"></a>

* precache<a name="precache"></a>

* pub<a name="pub"></a>

* run<a name="run"></a>

* [screenshot](command_screenshot.md)<a name="screenshot"></a> *截屏*

* test<a name="test"></a>

* [upgrade](command_upgrade.md)<a name="upgrade"></a> *升级更新*

* [version](command_version.md)<a name="version"></a> *版本信息，版本操作。*

***

### 全局参数<a name="global_options"></a>

* `-h | --help`<a name="global_option_help"></a>

    显示帮助文档，同[`flutter help`](#command_help.md)

* `-v | --verbose`<a name="global_option_verbose"></a>

* `-d | --device-id`<a name="global_opotion_device_id"></a>

* `--version`<a name="global_option_version"></a>

	 查看当前flutter的版本。我这里是1.12.13稳定版本。

    ```
    zzw:flutter zzw$ flutter --version
    Flutter 1.12.13 • channel stable • https://github.com/flutter/flutter.git
    Framework • revision cf37c2cd07 (4 months ago) • 2019-11-25 12:04:30 -0800
    Engine • revision b6b54fd606
    Tools • Dart 2.7.0
    ```


* `--suppress-analytics`<a name="global_option_suppress_analytics"></a>

* `--bug-report`<a name="global_option_bug_report"></a>

***

### 其他已知命令<a name="others"></a>

* [`flutter update-packages`]<a name="other_update_packages"></a>

    ```
    zzw:cache zzw$ flutter update-packages
    Running "flutter pub get" in snippets...                           80.2s
    Running "flutter pub get" in bots...                               61.2s
    Running "flutter pub get" in vitool...                             16.1s
    Running "flutter pub get" in gen_keycodes...                       11.2s
    Running "flutter pub get" in tools...                              15.3s
    Running "flutter pub get" in ui...                                 34.6s
    Running "flutter pub get" in android_views...                      46.8s
    Running "flutter pub get" in web...                                 3.5s
    Running "flutter pub get" in web_compile_tests...                   3.3s
    Running "flutter pub get" in release_smoke_test...                 21.0s
    Running "flutter pub get" in external_ui...                        32.5s
    Running "flutter pub get" in codegen...                            51.7s
    Running "flutter pub get" in flavors...                            38.5s
    Running "flutter pub get" in android_embedding_v2_smoke_test...        24.9s
    Running "flutter pub get" in flutterapp...                         16.6s
    Running "flutter pub get" in android_semantics_testing...          32.5s
    Running "flutter pub get" in splash_screen_load_rotate...          16.9s
    Running "flutter pub get" in splash_screen_trans_rotate...         47.1s
    Running "flutter pub get" in splash_screen_kitchen_sink...         48.3s
    Running "flutter pub get" in simple_codegen...                     19.2s
    Running "flutter pub get" in image_loading...                      41.0s
    Running "flutter pub get" in named_isolates...                      1.2s
    Running "flutter pub get" in platform_interaction...               32.4s
    Running "flutter pub get" in abstract_method_smoke_test...          3.2s
    Running "flutter pub get" in channels...                           33.0s
    Running "flutter pub get" in manual_tests...                       15.3s
    Running "flutter pub get" in devicelab...                          55.1s
    Running "flutter pub get" in customer_testing...                    9.6s
    Running "flutter pub get" in complex_layout...                     52.6s
    Running "flutter pub get" in macrobenchmarks...                    50.3s
    Running "flutter pub get" in microbenchmarks...                    44.0s
    Running "flutter pub get" in automated_tests...                    38.5s
    Running "flutter pub get" in hello_world...                        18.3s
    Running "flutter pub get" in layers...                             13.8s
    Running "flutter pub get" in platform_view...                       1.5s
    Running "flutter pub get" in platform_channel_swift...             39.8s
    Running "flutter pub get" in catalog...                            38.9s
    Running "flutter pub get" in flutter_view...                        1.5s
    Running "flutter pub get" in stocks...                             41.8s
    Running "flutter pub get" in platform_channel...                   61.7s
    Running "flutter pub get" in image_list...                         15.5s
    Running "flutter pub get" in flutter_gallery...                    41.0s
    Running "flutter pub get" in flutter_web_plugins...                19.1s
    Running "flutter pub get" in flutter_goldens...                    15.6s
    Running "flutter pub get" in flutter_goldens_client...              4.6s
    Running "flutter pub get" in flutter...                            22.2s
    Running "flutter pub get" in main...                                0.5s
    Running "flutter pub get" in flutter_tools...                       1.5s
    Running "flutter pub get" in flutter_localizations...              14.3s
    Running "flutter pub get" in fuchsia_remote_debug_protocol...        16.0s
    Running "flutter pub get" in flutter_driver...                     28.1s
    Running "flutter pub get" in project_root...                        0.3s
    Running "flutter pub get" in flutter_test...                       14.2s
    Downloading lcov data for package:flutter...                        1.6s

    Ran 'pub' 53 times and fetched coverage data in 1409.5s.
    ```

***

### 快速上手

* `flutter create` 创建

	```
	flutter create my-first-flutter-demo
	```

	随后可得到如下输出：

	```
	zzw:flutter zzw$ flutter create my-first-flutter-demo
	"my-first-flutter-demo" is not a valid Dart package name.


	From the [Pubspec format description](https://www.dartlang.org/tools/pub/pubspec.html):

	**DO** use `lowercase_with_underscores` for package names.

	Package names should be all lowercase, with underscores to separate words,
	`just_like_this`.  Use only basic Latin letters and Arabic digits: [a-z0-9_].
	Also, make sure the name is a valid Dart identifier -- that it doesn't start
	with digits and isn't a reserved word.
	```

	命名上需要

*

* flutter build apk

```
zzw:my_first_flutter_demo zzw$ flutter build apk
You are building a fat APK that includes binaries for android-arm, android-arm64, android-x64.
If you are deploying the app to the Play Store, it's recommended to use app bundles or split the APK to reduce the APK size.
    To generate an app bundle, run:
        flutter build appbundle --target-platform android-arm,android-arm64,android-x64
        Learn more on: https://developer.android.com/guide/app-bundle
    To split the APKs per ABI, run:
        flutter build apk --target-platform android-arm,android-arm64,android-x64 --split-per-abi
        Learn more on:  https://developer.android.com/studio/build/configure-apk-splits#configure-abi-split
Running Gradle task 'assembleRelease'...                                
Calling mockable JAR artifact transform to create file: /Users/zzw/.gradle/caches/transforms-2/files-2.1/5391dd7ff7efce0746c4751e96eb24a1/android.jar with input /Users/zzw/Develop/env/android-sdk-macosx/platforms/android-28/android.jar
Removed unused resources: Binary resource data reduced from 44KB to 35KB: Removed 20%                              
Running Gradle task 'assembleRelease'...                                                                           
Running Gradle task 'assembleRelease'... Done                    1392.1s (!)
✓ Built build/app/outputs/apk/release/app-release.apk (15.2MB).
```

* flutter run

其中大篇幅日志见 -- [执行日志](fultter_run_log.md)
