#!/bin/bash
################################################################################################################
## Feature：For ipaddress lookup Raspberry devices exist in the same network.
## Requirment:		<a href="http://www.nta-monitor.com/tools-resources/security-tools/arp-scan">arp-scan</a> 
##					or <a href="https://github.com/royhills/arp-scan">arp-scan</a>
################################################################################################################
arp-scan -I en0 -l | grep e8:4e

exit 0
## @Deprecated
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
