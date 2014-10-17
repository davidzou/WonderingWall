# 本地化

设置树莓派匹配你所在的区域设置。


## 语言

### NOOBS

为NOOBS修改语言环境，在NOOBS中选择语言，你可以通过键入`L`，向上/向下箭头按钮选择你所需要的语言，敲击`Enter`完成操作; 或者通过鼠标完成相同的操作。NOOBS会记住你得选择，以致下次会使用相同的语言设置。

另外，在第一次启动之前你可以为NOOBS设置预选语言。可参考 [here](https://github.com/raspberrypi/noobs/blob/master/README.md#how-to-change-the-default-language-keyboard-layout-display-mode-or-boot-partition).

### Raspbian

如果你已经通过NOOBS安装了Raspbian，它会自动配置为您在NOOBS安装设置中的语言。但是如果你像选择不同语言，或者安装时使用的是Raspbian的独立镜像。请使用 [raspi-config](raspi-config.md#change-locale).


## 键盘

### NOOBS

To change the keyboard layout used by NOOBS, you can either press the `9` key on your keyboard, press the up/down arrows to choose the keyboard you want, and then press `Enter`; or you can do the same thing using the mouse. Note that changing the language (as described above) may automatically change the keyboard layout as appropriate too. NOOBS will remember your selection and use the same keyboard layout again next time.

Alternatively, you can pre-select the keyboard before booting NOOBS for the first time. See [here](https://github.com/raspberrypi/noobs/blob/master/README.md#how-to-change-the-default-language-keyboard-layout-display-mode-or-boot-partition).

### Raspbian

If you've installed Raspbian using NOOBS, it should automatically pick up the same keyboard you were using in NOOBS. But if you want to select a different keyboard, or if you've installed Raspbian from a standalone image, use [raspi-config](raspi-config.md#change-keyboard-layout).


## 时区

### NOOBS

There's no part of NOOBS that uses the time, so consequently there's no option for changing the timezone.

### Raspbian

Once again, this is something else you can change using the [raspi-config](raspi-config.md#change-timezone) tool.
