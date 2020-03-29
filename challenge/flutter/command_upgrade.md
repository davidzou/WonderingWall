Command -- *` upgrade `*
====

***

### 索引

* [描述](#description)

* [详解](#details)

    1. [`flutter upgrade`](#upgrade)
    2. [`flutter upgrade [-f | --force]`](#upgrade_force)
    3. [`flutter upgrade [-h | --help]`](#upgrade_help)

* [帮助文档](#help_doc)

***

### 描述<a name="description"></a>

__升级你的Flutter版本__

***

### 详解<a name="details"></a>

* `flutter upgrade` <a name="upgrade"></a>

    更新，其实和`git`的操作效果是一样的。

    ```
    zzw:flutter zzw$ flutter upgrade
    Upgrading Flutter from /Users/zzw/Develop/env/flutter...
    From https://github.com/flutter/flutter
     * [new branch]          revert-53226-revert -> origin/revert-53226-revert
    Updating cf37c2cd0..0b8abb472
     46 files changed, 940 insertions(+), 434 deletions(-)
    Flutter is already up to date on channel stable
    Flutter 1.12.13+hotfix.8 • channel stable • https://github.com/flutter/flutter.git
    Framework • revision 0b8abb4724 (6 weeks ago) • 2020-02-11 11:44:36 -0800
    Engine • revision e1e6ced81d
    Tools • Dart 2.7.0
    ```

* `flutter upgrade [-f | --force]` <a name="upgrade_force"></a>

    强制更新Flutter分支，可能会放弃本地更改。

    ```
    **修改flutter文件**

    zzw:flutter zzw$ git s
    On branch stable
    Your branch is up to date with 'origin/stable'.

    Changes not staged for commit:
      (use "git add <file>..." to update what will be committed)
      (use "git checkout -- <file>..." to discard changes in working directory)

    	modified:   bin/flutter

    no changes added to commit (use "git add" and/or "git commit -a")

    **执行强制更新**

    zzw:flutter zzw$ flutter upgrade -f
    Observatory listening on http://127.0.0.1:65432/LnxBk-K6FC0=/
    Upgrading Flutter from /Users/zzw/Develop/env/flutter...
    Updating cf37c2cd0..0b8abb472
     46 files changed, 940 insertions(+), 434 deletions(-)
    Flutter is already up to date on channel stable
    Flutter 1.12.13+hotfix.8 • channel stable • https://github.com/flutter/flutter.git
    Framework • revision 0b8abb4724 (6 weeks ago) • 2020-02-11 11:44:36 -0800
    Engine • revision e1e6ced81d
    Tools • Dart 2.7.0

    **修改被抛弃了**

    zzw:flutter zzw$ git s
    On branch stable
    Your branch is behind 'origin/stable' by 10 commits, and can be fast-forwarded.
      (use "git pull" to update your local branch)

    nothing to commit, working tree clean
    ```

* `flutter upgrade [-h | --help]`<a name="upgrade_help"></a>

    显示[帮助文档](#help_doc)

***

### 帮助文档<a name="help_doc"></a>

```
zzw:flutter zzw$ flutter upgrade --help
Upgrade your copy of Flutter.

Usage: flutter upgrade [arguments]
-h, --help     Print this usage information.
-f, --force    Force upgrade the flutter branch, potentially discarding local changes.

Run "flutter help" to see global options.
```
