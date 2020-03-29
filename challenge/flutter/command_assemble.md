Command -- *` assemble `*
====

***

### 索引

* [描述](#description)

* [详解](#details)

    1. [`flutter `](#)
    2. [`flutter `](#)
    3. [`flutter `](#)
    4. [`flutter assemble [-h | --help]`](#assemble_help)

* [帮助文档](#help_doc)

***

### 描述<a name="description"></a>

__编译和构建flutter资源__

***

### 详解<a name="details"></a>

* `flutter assemble [-h | --help]`<a name="assemble_help"></a>

    显示[帮助文档](#help_doc)

***

### 帮助文档<a name="help_doc"></a>

```
zzw:blog zzw$ flutter assemble --help
Assemble and build flutter resources.

Usage: flutter assemble [arguments]
-h, --help                  Print this usage information.
-d, --define                Allows passing configuration to a target with --define=target=key=value.
    --depfile               A file path where a depfile will be written. This contains all build inputs and outputs in a make style syntax
    --build-inputs          A file path where a newline separated file containing all inputs used will be written after a build. This file is not included as a build input or
                            output. This file is not written if the build fails for any reason.

    --build-outputs         A file path where a newline separated file containing all outputs used will be written after a build. This file is not included as a build input or
                            output. This file is not written if the build fails for any reason.

-o, --output                A directory where output files will be written. Must be either absolute or relative from the root of the current Flutter project.
    --resource-pool-size    The maximum number of concurrent tasks the build system will run.

Run "flutter help" to see global options.
```
