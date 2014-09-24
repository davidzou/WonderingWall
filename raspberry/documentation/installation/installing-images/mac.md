# MacOS安装系统

在苹果系统上你可以选择命令行工具`dd`或者使用图形化工具ImageWriter来讲镜像烧入到你的SD卡。

## (多数情形) 图形化接口s

- 连接包含SD卡的读卡器，注意的是必须为FAT32格式。
- 从苹果菜单上选择“关于苹果”项，点击“更多信息”；10.8.x以上版本的系统请点击“系统报告”。
- 点击“USB”项(或者“读卡器”，你使用内置读卡器的话) 然后搜索你的SD卡在窗口的右上部分。点击它, 右下窗口来查找它的BSD名称；它看起来类似'diskn'，其中n是数字(如, disk4). 要确保记住这个数字。
- 退出分区，你可以重写这个磁盘。 步骤如下, 打开磁盘工具并卸载它(不是退出, 否者你不得不重连它). 注意的时10.8.x山狮系统中，"Verify Disk" (卸载之前)BSD名会被以"/dev/disk1s1"或者更短的形式展现, 以此可以跳过上面2步。
- 在终端中键入:

    ```
    sudo dd bs=1m if=path_of_your_image.img of=/dev/diskn
    ```

    记住替换`n`这个数值，之前曾提示你记住的！

## 命令行

- 如果你对命令行驾轻就熟，那么烧入时就不需要额外的软件。运行：

    `diskutil list`

- 没有分区的SD卡的磁盘被标示为，如：`disk4` (而不是`disk4s1`):

    `diskutil unmountDisk /dev/<disk# from diskutil>`

    e.g. `diskutil unmountDisk /dev/disk4`

    `sudo dd bs=1m if=image.img of=/dev/DISK`

    e.g. `sudo dd bs=1m if=2014-09-09-wheezy-raspbian.img of=/dev/disk4`

    这可能会得到这么一个``dd: invalid number '1m'``错误的结果，原因是你安装了GNU coreutils . 在这种情形下你只要将其改为``1M``:

    `sudo dd bs=1M if=image.img of=/dev/DISK`

    你将花上较长时间.

## 替代的方式

**提示: 一些用户的反馈中提到关于使用Max OS X来创建SD卡。**

这些命令和操作都需要管理员权限才能够执行。

- 在终端中运行`df -h`.
- 连接SD卡通过内置读卡器
- 再次运行`df -h`，查看最新连接的设备而不是列表最下的。记入下设备名的绝对路径，如`/dev/disk3s1`.
- 卸载分区来允许对磁盘的写操作：

    ```
    sudo diskutil unmount /dev/disk3s1
    ```

    (或者打开磁盘工具并卸载SD卡分区（而不是退出它，否者你将不得不重连）)
- 使用设备分区名，省略“s1”和替换"disk"为"rdisk"以此解决系统盘和扩展盘的问题. 这非常重要，如果提供了错误的盘符名称，可能会丢失所有的数据。确保设备名和SD卡上的描述是一致的，而不仅仅是一个分区(如, rdisk3, 而不是 rdisk3s1). 同样的, 你可能有另一个SD设备名/号（类似rdisk2 或者 rdisk4）; 你可以再次使用`df -h`命令比较插入SD卡前后两者的区别。例如, `/dev/disk3s1`变为`/dev/rdisk3`.
- 通过终端烧入到SD卡的，使用上述扩展设备名的。仔细阅读上述步骤以确保你使用正确的rdisk的号码:
    ```
    sudo dd bs=1m if=2014-06-20-wheezy-raspbian/2014-09-09-wheezy-raspbian.img of=/dev/rdisk3
    ```

    如果命令行提示错误 (`dd: bs: illegal numeric value`), 请修改 `bs=1M` 为 `bs=1m`.
    
    如果命令行提示错误 `dd: /dev/rdisk3: Permission denied` 那是因为SD卡的分区表被保护防止被复写在MacOS下。檫除SD卡分区表使用命令：
    ```
    sudo diskutil partitionDisk /dev/disk3 1 MBR "Free Space" "%noformat%" 100%
    ```
    那个命令还可以设置设备的访问权限。现在再次尝试`dd`.

    值得注意的是`dd`不会有任何反馈直到有错误发生或者完成；磁盘被重新挂载成功后这些信息将被显示。无论如何都想查看进度的你可以使用'ctrl-T'; 这是一个通常的信号状态（SIGINFO）, 作为tty状态参数就可以显示进度信息。
- `dd`命令完成, 退出SD卡：

    ```
    sudo diskutil eject /dev/rdisk3
    ```

    (或: 打开磁盘工具并退出SD卡)

---

*此文件内容源于eLinux wiki页 [RPi_Easy_SD_Card_Setup](http://elinux.org/RPi_Easy_SD_Card_Setup), 分享基于 [Creative Commons Attribution-ShareAlike 3.0 Unported license](http://creativecommons.org/licenses/by-sa/3.0/)*
