# NOOBS

**New Out Of the Box Software** - 树莓派的简易系统安装管理 

![NOOBS系统的选择](images/noobs.png)

## 如何获得NOOBS

### 购买一块原先安装的SD卡

最简单的途径就是否买预装好NOOBS的SD卡，需要花费£4在 [swag store](http://swag.raspberrypi.org/collections/frontpage/products/noobs-8gb-sd-card).

### 下载（个人推荐）

另外，NOOBS可用版可以从树莓派网址上下载：[raspberrypi.org/downloads](http://www.raspberrypi.org/downloads)

#### 如何安装NOOBS到SD卡

一旦你已经下载了NOOBS zip文件，可以通过你的电脑将内容复制到已经格式化好的SD卡上。

为空SD卡安装NOOBS

- 以FAT方式格式化至少4GB的SD卡。怎样做请参照下面的说明。
- 下载并解压文件NOOBS。
- Copy the extracted files onto the SD card that you just formatted so that this file is at the root directory of the SD card. Please note that in some cases it may extract the files into a folder; if this is the case then please copy across the files from inside the folder rather than the folder itself.
- On first boot the "RECOVERY" FAT partition will be automatically resized to a minimum, and a list of OSs that are available to install will be displayed.

#### 如何以FAT文件格式来格式化SD卡

##### Windows
Windows用户我们推荐使用
For Windows users we recommend formatting your SD card using the SD Association's Formatting Tool, which can be downloaded from [sdcard.org](https://www.sdcard.org/downloads/formatter_4/). You will need to set "FORMAT SIZE ADJUSTMENT" option to "ON" in the "Options" menu to ensure that the entire SD card volume is formatted, and not just a single partition.

##### Mac OS

The [SD Association's Formatting Tool](https://www.sdcard.org/downloads/formatter_4/) is also available for Mac users, although the default OSX Disk Utility is also capable of formatting the entire disk. To do this, select the SD card volume and choose `Erase` with `MS-DOS` format.

##### Linux

For Linux users we recommend `gparted` (or the command line version `parted`). Norman Dunbar has written up [instructions](http://qdosmsq.dunbar-it.co.uk/blog/2013/06/noobs-for-raspberry-pi/) for Linux users.

## What's included in NOOBS

The following Operating Systems are currently included in NOOBS:

- [Raspbian](http://raspbian.org/)
- [Pidora](http://pidora.ca/)
- [OpenELEC](http://wiki.openelec.tv/index.php?title=Raspberry_Pi_FAQ)
- [RaspBMC](http://www.raspbmc.com/)
- [RISC OS](https://www.riscosopen.org/wiki/documentation/show/Welcome%20to%20RISC%20OS%20Pi)
- [Arch Linux](http://archlinuxarm.org/platforms/armv6/raspberry-pi)

As of NOOBS v1.3.10 (September 2014), only Raspbian is installed by default in NOOBS. The others can be installed with a network connection.

## NOOBS and NOOBS Lite

NOOBS is available in two forms: offline and network install; or network install only.

The full version has the images of each of the operating systems included, so they can be installed from the SD card while offline, whereas NOOBS Lite requires an internet connection to download the selected operating system.

Note that the operating system images on the full version can be outdated if a new version of the OS is released, but if connected to the internet you will be shown the option of downloading the latest version of the OS if there is a newer one available.

## NOOBS Development

### NOOBS最新稳定版

The latest NOOBS release is **v1.3.10**, released on **12th September 2014**.

### NOOBS文档

A more comprehensive documentation, including more advanced configuration of NOOBS, is available on [GitHub](https://github.com/raspberrypi/noobs/blob/master/README.md).

### NOOBS源码

See the NOOBS source code on [GitHub](https://github.com/raspberrypi/noobs).
