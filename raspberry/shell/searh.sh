#!/bin/bash
arp-scan -I en0 -l | grep e8:4e

exit 0
##	查找网段内的IP地址

clear
ipLine="`ifconfig | grep "inet 192.168" `"
preIp=${ipLine:5:12}

read choice
if test $choice = "y"
then
read i
read j
else
i=2
j=255
fi

while test $i -ne $j
do
	ip=$preIp.$i
	"`ping -t 1 -q $ip `"
	let i=i+1
	clear
done
clear

result="`arp -a | grep "e8:4e:" ` "
resultIp=${result:3:18}
resultMac=${result:19:17}

clear
echo "$resultIp"
