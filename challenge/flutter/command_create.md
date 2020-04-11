Command -- *` create `*
====

***

### 索引

* [描述](#description)

* [详解](#details)

    1. [`flutter create my_first_flutter_demo`](#create_default)
    1. [`flutter create --list-samples=samples_all.json`](#create_list_samples)
    2. [`flutter create --sample=widgets.Flow.1 --no-pub --offline use_sample_demo1`](#create_custom_sample)
    3. [`flutter create --sample=widgets.Flow.1 --offline --overwrite use_sample_demo1`](#create_custom_sample_overwrite)
    4. [`flutter create [-h | --help]`](#create_help)

* [帮助文档](#help_doc)

***

### 描述<a name="description"></a>

__用于显示当前Flutter版本，版本操作__

***

### 详解<a name="details"></a>
* `flutter create my_first_flutter_demo` <a name="create_default"></a>

    默认方式创建Flutter项目，只是用`my_first_flutter_demo`作为项目名称。

* `flutter create --list-samples=samples_all.json`<a name="create_list_samples"></a>

    列出所有可用的[Sample模板](samples_all.json)。通过模板ID创建对应项目。

    ```
    zzw:flutter zzw$ flutter create --list-samples=samples_all.json
    Wrote samples JSON to "samples_all.json"
    zzw:flutter zzw$ cat samples_all.json | jq .
    [
      {
        "sourcePath": "lib/src/widgets/sliver.dart",
        "sourceLine": 1680,
        "id": "widgets.SliverFillRemaining.4",
        "serial": "4",
        "package": "flutter",
        "library": "widgets",
        "element": "SliverFillRemaining",
        "file": "widgets.SliverFillRemaining.4.dart",
        "description": "In this sample the [SliverFillRemaining]'s child stretches to fill the\noverscroll area when [fillOverscroll] is true. This sample also features a\nbutton that is pinned to the bottom of the sliver, regardless of size or\noverscroll behavior. Try switching [fillOverscroll] to see the difference."
      },
      ...
    ]
    ```

* `flutter create --sample=widgets.Flow.1 --no-pub --offline use_sample_demo1`<a name="create_custom_sample"></a>

    创建一个自定义示例模板到项目，关闭pub更新（有时真的很慢）。 初次创建的文件都是以`(created)`标注

    ```
    zzw:flutter zzw$ flutter create --sample=widgets.Flow.1 --no-pub --offline use_sample_demo1
    Creating project use_sample_demo1... androidx: true
      use_sample_demo1/ios/Runner.xcodeproj/project.xcworkspace/contents.xcworkspacedata (created)
      use_sample_demo1/ios/Runner.xcodeproj/xcshareddata/xcschemes/Runner.xcscheme (created)
      use_sample_demo1/ios/Flutter/Release.xcconfig (created)
      use_sample_demo1/ios/Flutter/Debug.xcconfig (created)
      use_sample_demo1/ios/Flutter/AppFrameworkInfo.plist (created)
      use_sample_demo1/ios/.gitignore (created)
      use_sample_demo1/ios/Runner/Base.lproj/LaunchScreen.storyboard (created)
      use_sample_demo1/ios/Runner/Base.lproj/Main.storyboard (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/LaunchImage.imageset/Contents.json (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/LaunchImage.imageset/README.md (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/LaunchImage.imageset/LaunchImage@2x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/LaunchImage.imageset/LaunchImage@3x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/LaunchImage.imageset/LaunchImage.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-1024x1024@1x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-60x60@2x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Contents.json (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-76x76@1x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-40x40@3x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-83.5x83.5@2x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-29x29@2x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-29x29@3x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-40x40@2x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-60x60@3x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-20x20@2x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-20x20@3x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-20x20@1x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-40x40@1x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-76x76@2x.png (created)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-29x29@1x.png (created)
      use_sample_demo1/ios/Runner/Info.plist (created)
      use_sample_demo1/ios/Runner.xcworkspace/contents.xcworkspacedata (created)
      use_sample_demo1/test/widget_test.dart (created)
      use_sample_demo1/.gitignore (created)
      use_sample_demo1/.metadata (created)
      use_sample_demo1/android/app/src/profile/AndroidManifest.xml (created)
      use_sample_demo1/android/app/src/main/res/mipmap-mdpi/ic_launcher.png (created)
      use_sample_demo1/android/app/src/main/res/mipmap-hdpi/ic_launcher.png (created)
      use_sample_demo1/android/app/src/main/res/drawable/launch_background.xml (created)
      use_sample_demo1/android/app/src/main/res/mipmap-xxxhdpi/ic_launcher.png (created)
      use_sample_demo1/android/app/src/main/res/mipmap-xxhdpi/ic_launcher.png (created)
      use_sample_demo1/android/app/src/main/res/values/styles.xml (created)
      use_sample_demo1/android/app/src/main/res/mipmap-xhdpi/ic_launcher.png (created)
      use_sample_demo1/android/app/src/main/AndroidManifest.xml (created)
      use_sample_demo1/android/app/src/debug/AndroidManifest.xml (created)
      use_sample_demo1/android/gradle/wrapper/gradle-wrapper.properties (created)
      use_sample_demo1/android/gradle.properties (created)
      use_sample_demo1/android/.gitignore (created)
      use_sample_demo1/android/settings.gradle (created)
      use_sample_demo1/android/app/build.gradle (created)
      use_sample_demo1/android/app/src/main/kotlin/com/example/use_sample_demo1/MainActivity.kt (created)
      use_sample_demo1/android/use_sample_demo1_android.iml (created)
      use_sample_demo1/android/build.gradle (created)
      use_sample_demo1/use_sample_demo1.iml (created)
      use_sample_demo1/README.md (created)
      use_sample_demo1/pubspec.yaml (created)
      use_sample_demo1/ios/Runner.xcodeproj/project.pbxproj (created)
      use_sample_demo1/ios/Runner/AppDelegate.swift (created)
      use_sample_demo1/ios/Runner/Runner-Bridging-Header.h (created)
      use_sample_demo1/lib/main.dart (created)
      use_sample_demo1/.idea/libraries/Dart_SDK.xml (created)
      use_sample_demo1/.idea/libraries/KotlinJavaRuntime.xml (created)
      use_sample_demo1/.idea/libraries/Flutter_for_Android.xml (created)
      use_sample_demo1/.idea/modules.xml (created)
      use_sample_demo1/.idea/workspace.xml (created)
      use_sample_demo1/.idea/runConfigurations/main_dart.xml (created)
    Wrote 67 files.

    All done!
    [✓] Flutter: is fully installed. (Channel stable, v1.12.13+hotfix.8, on Mac OS X 10.13.6 17G12034, locale zh-Hans-CN)
    [!] Android toolchain - develop for Android devices: is partially installed; more components are available. (Android SDK version 29.0.3)
    [!] Xcode - develop for iOS and macOS: is partially installed; more components are available. (Xcode 10.1)
    [✓] Android Studio: is fully installed. (version 3.6)
    [!] Android Studio: is partially installed; more components are available.
    [✓] IntelliJ IDEA Community Edition: is fully installed. (version 2019.3.3)
    [!] Connected device: is not available.

    Run "flutter doctor" for information about installing additional components.

    In order to run your sample application, type:

      $ cd use_sample_demo1
      $ flutter run

    Your sample application code is in use_sample_demo1/lib/main.dart.

    ```

* `flutter create --sample=widgets.Flow.1 --offline --overwrite use_sample_demo1` <a name="create_custom_sample_overwrite"></a>

    再次重新创建`use_sample_demo1`项目，使用`--overwrite`参数，此时可以看见代码后面是`(overwritten)`的标注

    ```
    zzw:flutter zzw$ flutter create --sample=widgets.Flow.1 --offline --overwrite use_sample_demo1
    Recreating project use_sample_demo1...
      use_sample_demo1/ios/Runner.xcodeproj/project.xcworkspace/contents.xcworkspacedata (overwritten)
      use_sample_demo1/ios/Runner.xcodeproj/xcshareddata/xcschemes/Runner.xcscheme (overwritten)
      use_sample_demo1/ios/Flutter/Release.xcconfig (overwritten)
      use_sample_demo1/ios/Flutter/Debug.xcconfig (overwritten)
      use_sample_demo1/ios/Flutter/AppFrameworkInfo.plist (overwritten)
      use_sample_demo1/ios/.gitignore (overwritten)
      use_sample_demo1/ios/Runner/Base.lproj/LaunchScreen.storyboard (overwritten)
      use_sample_demo1/ios/Runner/Base.lproj/Main.storyboard (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/LaunchImage.imageset/Contents.json (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/LaunchImage.imageset/README.md (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/LaunchImage.imageset/LaunchImage@2x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/LaunchImage.imageset/LaunchImage@3x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/LaunchImage.imageset/LaunchImage.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-1024x1024@1x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-60x60@2x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Contents.json (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-76x76@1x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-40x40@3x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-83.5x83.5@2x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-29x29@2x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-29x29@3x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-40x40@2x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-60x60@3x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-20x20@2x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-20x20@3x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-20x20@1x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-40x40@1x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-76x76@2x.png (overwritten)
      use_sample_demo1/ios/Runner/Assets.xcassets/AppIcon.appiconset/Icon-App-29x29@1x.png (overwritten)
      use_sample_demo1/ios/Runner/Info.plist (overwritten)
      use_sample_demo1/ios/Runner.xcworkspace/contents.xcworkspacedata (overwritten)
      use_sample_demo1/test/widget_test.dart (created)
      use_sample_demo1/.gitignore (overwritten)
      use_sample_demo1/.metadata (overwritten)
      use_sample_demo1/android/app/src/profile/AndroidManifest.xml (overwritten)
      use_sample_demo1/android/app/src/main/res/mipmap-mdpi/ic_launcher.png (overwritten)
      use_sample_demo1/android/app/src/main/res/mipmap-hdpi/ic_launcher.png (overwritten)
      use_sample_demo1/android/app/src/main/res/drawable/launch_background.xml (overwritten)
      use_sample_demo1/android/app/src/main/res/mipmap-xxxhdpi/ic_launcher.png (overwritten)
      use_sample_demo1/android/app/src/main/res/mipmap-xxhdpi/ic_launcher.png (overwritten)
      use_sample_demo1/android/app/src/main/res/values/styles.xml (overwritten)
      use_sample_demo1/android/app/src/main/res/mipmap-xhdpi/ic_launcher.png (overwritten)
      use_sample_demo1/android/app/src/main/AndroidManifest.xml (overwritten)
      use_sample_demo1/android/app/src/debug/AndroidManifest.xml (overwritten)
      use_sample_demo1/android/gradle/wrapper/gradle-wrapper.properties (overwritten)
      use_sample_demo1/android/gradle.properties (overwritten)
      use_sample_demo1/android/.gitignore (overwritten)
      use_sample_demo1/android/settings.gradle (overwritten)
      use_sample_demo1/android/app/build.gradle (overwritten)
      use_sample_demo1/android/app/src/main/kotlin/com/example/use_sample_demo1/MainActivity.kt (overwritten)
      use_sample_demo1/android/use_sample_demo1_android.iml (overwritten)
      use_sample_demo1/android/build.gradle (overwritten)
      use_sample_demo1/use_sample_demo1.iml (overwritten)
      use_sample_demo1/README.md (overwritten)
      use_sample_demo1/pubspec.yaml (overwritten)
      use_sample_demo1/ios/Runner.xcodeproj/project.pbxproj (overwritten)
      use_sample_demo1/ios/Runner.xcodeproj/xcshareddata/xcschemes/Runner.xcscheme (overwritten)
      use_sample_demo1/ios/Runner/AppDelegate.swift (overwritten)
      use_sample_demo1/ios/Runner/Runner-Bridging-Header.h (overwritten)
      use_sample_demo1/lib/main.dart (overwritten)
      use_sample_demo1/.idea/libraries/Dart_SDK.xml (overwritten)
      use_sample_demo1/.idea/libraries/KotlinJavaRuntime.xml (overwritten)
      use_sample_demo1/.idea/libraries/Flutter_for_Android.xml (overwritten)
      use_sample_demo1/.idea/modules.xml (overwritten)
      use_sample_demo1/.idea/workspace.xml (overwritten)
      use_sample_demo1/.idea/runConfigurations/main_dart.xml (overwritten)
    Running "flutter pub get" in use_sample_demo1...                    1.3s
    Wrote 68 files.

    All done!
    [✓] Flutter: is fully installed. (Channel stable, v1.12.13+hotfix.8, on Mac OS X 10.13.6 17G12034, locale zh-Hans-CN)
    [!] Android toolchain - develop for Android devices: is partially installed; more components are available. (Android SDK version 29.0.3)
    [!] Xcode - develop for iOS and macOS: is partially installed; more components are available. (Xcode 10.1)
    [✓] Android Studio: is fully installed. (version 3.6)
    [!] Android Studio: is partially installed; more components are available.
    [✓] IntelliJ IDEA Community Edition: is fully installed. (version 2019.3.3)
    [!] Connected device: is not available.

    Run "flutter doctor" for information about installing additional components.

    In order to run your sample application, type:

      $ cd use_sample_demo1
      $ flutter run

    Your sample application code is in use_sample_demo1/lib/main.dart.
    ```

    不使用`--overwrite`时会出现如下提示：

    ```
    zzw:flutter zzw$ flutter create --sample=widgets.Flow.1 --offline use_sample_demo1
    Will not overwrite existing project in use_sample_demo1: must specify --overwrite for samples to overwrite.
    ```

* `flutter create [-h | --help]`<a name="create_help"></a>

    显示[帮助文档](#help_doc)

***

### 帮助文档<a name="help_doc"></a>

```
Create a new Flutter project.

If run on a project that already exists, this will repair the project, recreating any files that are missing.

Usage: flutter create <output directory>
-h, --help                     Print this usage information.
    --[no-]pub                 Whether to run "flutter pub get" after the project has been created.
                               (defaults to on)

    --[no-]offline             When "flutter pub get" is run by the create command, this indicates whether to run it in offline mode or not. In offline mode, it will need to have
                               all dependencies already available in the pub cache to succeed.

    --[no-]with-driver-test    Also add a flutter_driver dependency and generate a sample 'flutter drive' test.
-t, --template=<type>          Specify the type of project to create.

          [app]                (default) Generate a Flutter application.
          [module]             Generate a project to add a Flutter module to an existing Android or iOS application.
          [package]            Generate a shareable Flutter project containing modular Dart code.
          [plugin]             Generate a shareable Flutter project containing an API in Dart code with a platform-specific implementation for Android, for iOS code, or for both.

-s, --sample=<id>              Specifies the Flutter code sample to use as the main.dart for an application. Implies --template=app. The value should be the sample ID of the desired
                               sample from the API documentation website (http://docs.flutter.dev). An example can be found at
                               https://master-api.flutter.dev/flutter/widgets/SingleChildScrollView-class.html

    --list-samples=<path>      Specifies a JSON output file for a listing of Flutter code samples that can created with --sample.
    --[no-]overwrite           When performing operations, overwrite existing files.
    --description              The description to use for your new Flutter project. This string ends up in the pubspec.yaml file.
                               (defaults to "A new Flutter project.")

    --org                      The organization responsible for your new Flutter project, in reverse domain name notation. This string is used in Java package names and as prefix in
                               the iOS bundle identifier.
                               (defaults to "com.example")

    --project-name             The project name for this new Flutter project. This must be a valid dart package name.
-i, --ios-language             [objc, swift (default)]
-a, --android-language         [java, kotlin (default)]
    --[no-]androidx            Generate a project using the AndroidX support libraries
                               (defaults to on)

Run "flutter help" to see global options.
```
