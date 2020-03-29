Command -- *` bash-completion `*
====

***

### 索引

* [描述](#description)

* [详解](#details)

    1. [`flutter bash-completion`](#bash_completion)
    2. [`flutter bash-completion --overwrite`](#bash_completion_overwrite)
    3. [`flutter bash-completion [-h | --help]`](#bash_completion_help)


* [如何设置](#how_setup)

    1. [Linux](#setup_in_linux)
    2. [MacOS](#setup_in_mac_os)
    3. [Windows](#setup_in_windows)


* [帮助文档](#help_doc)

***

### 描述<a name="description"></a>

__输出命令行补全设置脚本__

***

### 详解<a name="details"></a>

* `flutter bash-completion` <a name="bash_completion"></a>

    显示命令补全脚本。按照安装步骤添加到配置文件中。

    ```
    zzw:cache zzw$ flutter bash-completion
    #
    # Installation:
    #
    # Via shell config file  ~/.bashrc  (or ~/.zshrc)
    #
    #   Append the contents to config file
    #   'source' the file in the config file
    #
    # You may also have a directory on your system that is configured
    #    for completion files, such as:
    #
    #    /usr/local/etc/bash_completion.d/

    ###-begin-flutter-completion-###

    if type complete &>/dev/null; then
      __flutter_completion() {
        local si="$IFS"
        IFS=$'\n' COMPREPLY=($(COMP_CWORD="$COMP_CWORD" \
                               COMP_LINE="$COMP_LINE" \
                               COMP_POINT="$COMP_POINT" \
                               flutter completion -- "${COMP_WORDS[@]}" \
                               2>/dev/null)) || return $?
        IFS="$si"
      }
      complete -F __flutter_completion flutter
    elif type compdef &>/dev/null; then
      __flutter_completion() {
        si=$IFS
        compadd -- $(COMP_CWORD=$((CURRENT-1)) \
                     COMP_LINE=$BUFFER \
                     COMP_POINT=0 \
                     flutter completion -- "${words[@]}" \
                     2>/dev/null)
        IFS=$si
      }
      compdef __flutter_completion flutter
    elif type compctl &>/dev/null; then
      __flutter_completion() {
        local cword line point words si
        read -Ac words
        read -cn cword
        let cword-=1
        read -l line
        read -ln point
        si="$IFS"
        IFS=$'\n' reply=($(COMP_CWORD="$cword" \
                           COMP_LINE="$line" \
                           COMP_POINT="$point" \
                           flutter completion -- "${words[@]}" \
                           2>/dev/null)) || return $?
        IFS="$si"
      }
      compctl -K __flutter_completion flutter
    fi

    ###-end-flutter-completion-###

    ## Generated 2020-03-25 05:21:07.824906Z
    ## By /Users/zzw/Develop/env/flutter/bin/cache/flutter_tools.snapshot
    ```

* `flutter bash-completion --overwrite`<a name="bash_completion_overwrite"></a>

	效果同时上。


* `flutter bash-completion [-h | --help]`<a name="bash_completion_help"></a>

    显示[帮助文档](#help_doc)

***

### 如何设置<a name="how_setup"></a>

* Linux <a name="setup_in_linux"></a>

    基本同Mac的设置，只是配置文件`~/.bashrc`

* MacOS <a name="setup_in_mac_os"></a>

    * 添加一下内容到`~/.bash_profile`中，`zsh`的添加在`~/.zshrc`中

        ```
        ## Flutter bash-completion
        if [ -f ~/.bash_flutter_completion ] ; then
            . ~/.bash_flutter_completion
        fi
        ```

    * 创建新文件 `~/.bash_flutter_completion`, 将`flutter bash-completion`执行所获得的的脚本复制其中。

* Windows <a name="setup_in_windows"></a>

    “菩提本无树，明镜亦非台，本来无一物，何处惹尘埃”。自求多福吧！

***

### 帮助文档<a name="help_doc"></a>

```
zzw:cache zzw$ flutter bash-completion --help
Output command line shell completion setup scripts.

This command prints the flutter command line completion setup script for Bash and Zsh. To use it, specify an output file and follow the instructions in the generated output file to
install it in your shell environment. Once it is sourced, your shell will be able to complete flutter commands and options.

Usage: flutter bash-completion [arguments]
-h, --help              Print this usage information.
    --[no-]overwrite    Causes the given shell completion setup script to be overwritten if it already exists.

Run "flutter help" to see global options.
```
