# 使用Linux安装系统

请注意，使用`dd`工具能覆盖机器上得任何分区，如果指定错误分区将可能删除你主Linux分区。请小心使用。

- 运行`df -h`来查看设备是否被正确挂载。

- 如果你得电脑有SD卡槽，请插入，没有，则使用读卡器插入，来保证电脑能读取内容。

- 再次运行`df -h`. 显示的新设备即为SD卡.左边一列显示的SD卡设备名称；列出的内容类似`/dev/mmcblk0p1`或者`/dev/sdd1`. 最后一部分(`p1` 或者 `1` respectively)是分区号，但你需要写入整个SD卡而非一个分区。因此去除这一部分作为SD卡设备名(如`/dev/mmcblk0` 或者 `/dev/sdd`)。请注意，SD卡可以显示不止一次在DF的输出; 您之前已经烧入过树莓派镜像到SD卡后再进行此操作的，因为树莓派镜像会有多个分区。

- 现在你已经知道设备名称，你需要卸载它，因为这样才能将镜像拷贝到SD卡上，否则无法对其操作。

- 运行`umount /dev/sdd1`, 替换`sdd1`为你的SD卡设备名名称 (包含分区号).

- SD卡有多个分区而导致`df`输出不止一个，你应当卸载所有的这些分区。

- 在终端命令行下烧入镜像到SD卡, 确保替换`if=`你的`.img`文件路径, 和替换`/dev/sdd`为文件输出`of=正确的设备名`. 这点非常重要，由于你提供了错误的设备名而导致丢失所有硬盘驱动器中得数据。确保如以上描述的整个SD卡设备名，而不是其中一个分区；如 `sdd`, 而不是`sdds1` 或者 `sddp1`; `mmcblk0`, 而不是 `mmcblk0p1`.

    ```bash
    dd bs=4M if=2014-09-09-wheezy-raspbian.img of=/dev/sdd
    ```

- 请注意，将块大小设置为`4M`大部分情况运行良好；如果不是，请尝试`1M`，尽管这将需要相当长的时间。

- 还要注意如果你不是使用root登录的请使用前缀`sudo`。

- 命令`dd`不会给出任何进度信息，而且可能出现卡死状态; 这个过程可能需要超过5分钟才能完成。你可以根据观察带有LED灯的读卡器闪烁转台来判断写入的进度。需要打开另一个终端并运行`pkill -USR1 -n -x dd`来查看安装进度, 非root用户登录的需要在前面添加`sudo`。 进度将被现实在原窗口而并非键入`pkill`命令所在的窗口; 由于缓冲的问题，它可能不会立即被显示。

- 您可以使用`dcfldd`来替换`dd`; 它将给出关于写入多少的进度报告。

- You can check what's written to the SD card by `dd`-ing from the card back to another image on your hard disk, and then running `diff` (or `md5sum`) on those two images. There should be no difference.

- 运行`sync`; 这将确保写高速缓存结束，可以安全退出你的SD卡。

- 移除SD卡

---

*此文件内容源于eLinux wiki页 [RPi_Easy_SD_Card_Setup](http://elinux.org/RPi_Easy_SD_Card_Setup), 分享基于 [Creative Commons Attribution-ShareAlike 3.0 Unported license](http://creativecommons.org/licenses/by-sa/3.0/)*
