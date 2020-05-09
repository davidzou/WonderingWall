Command -- *` devices `*
====

***

### 索引

* [描述](#description)

* [参数](#options)

* [详解](#details)

    1. [`flutter devices`](#flutter_devices)
    2. [`flutter devices [-h | --help]`](#devices_help)


* [帮助文档](#help_doc)

***

### 描述<a name="description"></a>

__列出所有当前连接的设备信息__

***

### 参数<a name="options"></a>

* `-h | --help`

    显示帮助信息。

***

### 详解<a name="details"></a>

* `flutter devices` <a name="flutter_devices"></a>

    显示连接的设备，这个和`adb devices`类似。

    ```
    zzw:cache zzw$ flutter devices
    2 connected devices:

    Nexus 5        • 05364ff7002e619a                         • android-arm • Android 6.0.1 (API 23)
    DavidZou'Phone • 6f7d8023f15b051dda5653587912259edaf8451f • ios         • iOS 13.3.1

    ```

* `flutter devices [-h | --help]` <a name="devices_help"></a>

    显示[帮助文档](#help_doc)。

***

### 帮助文档<a name="help_doc"></a>

```
zzw:cache zzw$ flutter devices --help
List all connected devices.

Usage: flutter devices [arguments]
-h, --help    Print this usage information.

Run "flutter help" to see global options.
```
