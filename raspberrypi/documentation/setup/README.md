# 安装

您的树莓派安装指南

## 您所需要的

### 必要的 (普通用户)

- [SD卡](../installation/sd-cards.md)
    - 我们推荐一个8GB的class4 SD卡 - 理想情况下可预装 [NOOBS](../installation/noobs.md).
- [显示 & 连接电缆](monitor-connection.md)
    - 任何HDMI/DVI显示器和电视都可成为树莓派的显示设备。最好的还是使用HDMI输入的设备，但其他连接方式用于那些旧设备。
- 键盘和鼠标
    - 任何标准的USB键盘和鼠标都能用在树莓派上。
    - 无线键盘和鼠标在配对成功后可以正常运行。
    - 键盘布局的配置选项，请参考 [raspi-config](../configuration/raspi-config.md).
- [电源](../hardware/raspberrypi/power/README.md)
    - 树莓派的供电方式支持USB微电源（类似大多数标准的移动电话充电器）。
    - 你需要一个高质量的电源，其工作电压在5V，至少700mA的电流输出。
    - 低电流（~700mA）只能用于基本的使用，如多加载过多的扩展设备将导致树莓派的重启。

### 可选

- 网线 [Model B & Model B+]
    - 网线将你的树莓派连接到本地网和因特网。
- [USB无线适配器](../configuration/wireless/README.md)
    - 另外, 通过配置可以将USB无线适配器连接到无线网络。
- 音频线
    - 音频可以播放通过扬声器或耳机使用标准的3.5mm音频接口。
    - 不使用HDMI电缆情形下，音频线是提供声音输出的必需品。
    - 如果使用HDMI电缆连接显示器和扬声器，音频线的存在就不是必要的，音频可以直接通过显示器输出；但是如果你喜欢可以单独连接一个音频扬声器进行播放 - 这需要 [配置](../configuration/audio-config.md).

## 故障排除

在安装过程中遇到的任何问题, 请参考 [故障排除](../troubleshooting/README.md).
