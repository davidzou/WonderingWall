Command -- *` help `*
====

***

### 索引

* [描述](#description)

* [详解](#details)

    1. [`flutter help`](#help_help_normal)
    2. [`flutter help -v`](#help_help_verbose)
    3. [`flutter help [-h | --help]`](#help_help)


* [帮助文档](#help_doc)

***

### 描述<a name="description"></a>

__用于显示flutter帮助文档__

***

### 详解<a name="details"></a>

* `flutter help` <a name="help_help_normal"></a>

    显示[帮助文档](#help_doc)

* `flutter help -v` <a name="help_help_verbose"></a>

    显示帮助文档，包含不常用选项在内。

    ```
    zzw:challenge zzw$ flutter help -v
    Manage your Flutter app development.

    Common commands:

      flutter create <output directory>
        Create a new Flutter project in the specified directory.

      flutter run [options]
        Run your Flutter application on an attached device or in an emulator.

    Usage: flutter <command> [arguments]

    Global options:
    -h, --help                     Print this usage information.
    -v, --verbose                  Noisy logging, including all shell commands executed.
                                   If used with --help, shows hidden options.

        --quiet                    Reduce the amount of output from some commands.
        --[no-]wrap                Toggles output word wrapping, regardless of whether or not the output is a terminal.
                                   (defaults to on)

        --wrap-column              Sets the output wrap column. If not set, uses the width of the terminal. No wrapping occurs if not writing to a terminal. Use --no-wrap to turn off
                                   wrapping when connected to a terminal.

    -d, --device-id                Target device id or name (prefixes allowed).
        --version                  Reports the version of this tool.
        --machine                  When used with the --version flag, outputs the information using JSON.
        --[no-]color               Whether to use terminal colors (requires support for ANSI escape sequences).
                                   (defaults to on)

        --[no-]version-check       Allow Flutter to check for updates when this command runs.
                                   (defaults to on)

        --suppress-analytics       Suppress analytics reporting when this command runs.
        --bug-report               Captures a bug report file to submit to the Flutter team.
                                   Contains local paths, device identifiers, and log snippets.

        --packages                 Path to your ".packages" file.
                                   (required, since the current directory does not contain a ".packages" file)

        --flutter-root             The root directory of the Flutter repository.
                                   Defaults to $FLUTTER_ROOT if set, otherwise uses the parent of the directory that the "flutter" script itself is in.

    Local build selection options (not normally required):
        --local-engine-src-path    Path to your engine src directory, if you are building Flutter locally.
                                   Defaults to $FLUTTER_ENGINE if set, otherwise defaults to the path given in your pubspec.yaml dependency_overrides for sky_engine, if any, or, failing
                                   that, tries to guess at the location based on the value of the --flutter-root option.

        --local-engine             Name of a build output within the engine out directory, if you are building Flutter locally.
                                   Use this to select a specific version of the engine if you have built multiple engine targets.
                                   This path is relative to --local-engine-src-path/out.

    Options for testing the "flutter" tool itself:
        --record-to                Enables recording of process invocations (including stdout and stderr of all such invocations), and file system access (reads and writes).
                                   Serializes that recording to a directory with the path specified in this flag. If the directory does not already exist, it will be created.

        --replay-from              Enables mocking of process invocations by replaying their stdout, stderr, and exit code from the specified recording (obtained via --record-to). The
                                   path specified in this flag must refer to a directory that holds serialized process invocations structured according to the output of --record-to.

        --show-test-device         List the special 'flutter-tester' device in device listings. This headless device is used to
                                   test Flutter tooling.

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
      daemon                   Run a persistent, JSON-RPC based server to communicate with devices.
      devices                  List all connected devices.
      doctor                   Show information about the installed tooling.
      drive                    Runs Flutter Driver tests for the current project.
      emulators                List, launch and create emulators.
      format                   Format one or more dart files.
      generate                 run code generators.
      help                     Display help information for flutter.
      ide-config               Configure the IDE for use in the Flutter tree.
      inject-plugins           Re-generates the GeneratedPluginRegistrants.
      install                  Install a Flutter app on an attached device.
      logs                     Show log output for running Flutter apps.
      make-host-app-editable   Moves host apps from generated directories to non-generated directories so that they can be edited by developers.
      precache                 Populates the Flutter tool's cache of binary artifacts.
      pub                      Commands for managing Flutter packages.
      run                      Run your Flutter app on an attached device.
      screenshot               Take a screenshot from a connected device.
      test                     Run Flutter unit tests for the current project.
      update-packages          Update the packages inside the Flutter repo.
      upgrade                  Upgrade your copy of Flutter.
      version                  List or switch flutter versions.

    Run "flutter help <command>" for more information about a command.
    Run "flutter help -v" for verbose help output, including less commonly used options.
    ```

* `flutter help [-h | --help]`<a name="help_help"></a>

    显示[帮助文档](#help_doc)

***

### 帮助文档<a name="help_doc"></a>

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
