Command -- *` screenshot `*
====

***

### 索引

* [描述](#description)

* [详解](#details)

    1. [`flutter `](#)
    2. [`flutter `](#)
    3. [`flutter `](#)
    4. [`flutter screenshot [-h | --help]`](#screenshot_help)

* [帮助文档](#help_doc)

***

### 描述<a name="description"></a>

__从连接的设备上截图。__

***

### 详解<a name="details"></a>

* `flutter screenshot [-h | --help]`<a name="screenshot_help"></a>

    显示[帮助文档](#help_doc)

***

### 帮助文档<a name="help_doc"></a>

```
zzw:flutter zzw$ flutter screenshot --help
Take a screenshot from a connected device.

Usage: flutter screenshot [arguments]
-h, --help                      Print this usage information.
-o, --out=<path/to/file>        Location to write the screenshot.
    --observatory-uri=<URI>     The observatory URI to connect to.
                                This is required when --type is "skia" or "rasterizer".
                                To find the observatory URI, use "flutter run" and look for"An Observatory ... is available at" in the output.

    --type=<type>               The type of screenshot to retrieve.

          [device] (default)    Delegate to the device's native screenshot capabilities. This screenshots the entire screen currently being displayed (including content not rendered
                                by Flutter, like the device status bar).
          [rasterizer]          Render the Flutter app using the rasterizer. Requires --observatory-uri
          [skia]                Render the Flutter app as a Skia picture. Requires --observatory-uri

Run "flutter help" to see global options.
```
