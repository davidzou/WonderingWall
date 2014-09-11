#! /bin/bash
# if=(path to img) of=(write to devices path that find by command df -h)
# if unmount device look find name by diskutil list

# 查看设备
#diskutil list
# 格式化设备（可选），可使用界面工具
#diskutil reformat /dev/disk1d

# 卸载设备（这一步必须做，否则无法执行dd，如果使用界面卸载后也无法执行--导致设备找不到）
diskutil umount /dev/disk1s1

## 最核心的就是这里，烧录镜像到SD卡中。
#for filename in `ls .`; do
	#	echo $filename
#done
dd if=~/Desktop/2014-01-07-wheezy-raspbian.img of=/dev/disk1 bs=4m
