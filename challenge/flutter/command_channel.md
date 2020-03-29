Command -- *` channel `*
====

***

### 索引

* [描述](#description)

* [详解](#details)

    1. [`flutter channel`](#channel_list)
    2. [`flutter channel <channel-name>`](#channel_switch)
    3. [`flutter channel [-h | --help]`](#channel_help)

* [帮助文档](#help_doc)

***

### 描述<a name="description"></a>

__用于查看和切换flutter版本__

***

### 详解<a name="details"></a>

* `flutter channel` <a name="channel_list"></a>

    ```
    zzw:~ zzw$ flutter channel
    Flutter channels:
      beta
      dev
      master
    * stable
    ```

* `flutter channel <channel-name>` <a name="channel_switch"></a>

    切换到master分支上。

    ```
    zzw:~ zzw$ flutter channel master
    Switching to flutter channel 'master'...
    git: Switched to a new branch 'master'
    git: Branch 'master' set up to track remote branch 'master' from 'origin'.

    ```

* `flutter channel [-h | --help]`<a name="channel_help"></a>

    显示[帮助文档](#help_doc)

***

### 帮助文档<a name="help_doc"></a>

```
zzw:~ zzw$ flutter help channel
List or switch flutter channels.

Usage: flutter channel [<channel-name>]
-h, --help    Print this usage information.

Run "flutter help" to see global options.
```
