#!/usr/bin
################################################################################################################
## Feature：Search WiFi hotspot, display the search to the ESSID name
## Requirment:	usb wifi
################################################################################################################
## 搜索WiFi热点，显示搜索到的ESSID名
## 使用命令 wpa_passphrase ESSID名 密码  以获得加密文件。如下：
## network={
##	ssid="MySSID"
##	#psk="111111"
##	psk=9eaff75bbf97665af033c936b7cbb7a3e7d777b49e39d53f7158468537c9f701
## }
## 将显示的内容写入 /etc/wpa_supplicant/wpa_supplicant.conf

i=0;
for line in `iwlist wlan0 scanning`; do
        if [[ $line == ESSID* ]]; then
                echo "$i) $line";
                let i=i+1;
        fi
done
echo "search $i wifi by essid."
