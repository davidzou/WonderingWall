# 本地化

设置树莓派匹配你所在的区域设置。


## 语言

### NOOBS

为NOOBS修改语言环境，在NOOBS中选择语言，你可以通过键入`L`，向上/向下箭头按钮选择你所需要的语言，敲击`Enter`完成操作; 或者通过鼠标完成相同的操作。NOOBS会记住你得选择，以致下次会使用相同的语言设置。

另外，在第一次启动之前你可以为NOOBS设置预选语言。请看 [here](https://github.com/raspberrypi/noobs/blob/master/README.md#how-to-change-the-default-language-keyboard-layout-display-mode-or-boot-partition).

### Raspbian

如果你已经通过NOOBS安装了Raspbian，它会自动配置为您在NOOBS安装设置中的语言。但是如果你像选择不同语言，或者安装时使用的是Raspbian的独立镜像。请使用 [raspi-config](raspi-config.md#change-locale).


## 键盘

### NOOBS

为NOOBS修改键盘布局，你可以通过键入`9`，通过向上/向下箭头按钮选择你所需要的键盘设置，敲击`Enter`完成操作; 或者通过鼠标完成相同的操作。请注意改变语言键盘布局也可能会随之作出适当的调整。NOOBS会记住你的选择，以致下次会使用相同的设置。

另外，在第一次启动之前你可以为NOOBS设置预选键盘布局. 请看 [here](https://github.com/raspberrypi/noobs/blob/master/README.md#how-to-change-the-default-language-keyboard-layout-display-mode-or-boot-partition).

### Raspbian

如果您使用NOOBS安装Raspbian，NOOBS会自动选择相同的键盘布局。但如果你想选择不同的键盘布局，或者你是从独立镜像中安装的Raspbian，使用 [raspi-config](raspi-config.md#change-keyboard-layout).

## 时区

### NOOBS

使用时间设置不是NOOBS的一部分，所以没有时区的选项可供选择。

### Raspbian

再次声明，你可以使用工具 [raspi-config](raspi-config.md#change-timezone) 来改变它。
