# 通过命令行设置WiFi

对于没有图形界面的用户而言，这是一种可行的方法用以设置树莓派WiFi。它特别适合于使用串行控制电缆，而没有访问到屏幕或有线以太网网络的那些用户。值得注意的是，不需要任何扩充的软件，树莓派为你准备好了一切。

## 获得WiFi网络详情  

搜索WiFi网络，使用命令`sudo iwlist wlan0 scan`. 这将列出所有可用WiFi网络和它的其他可用信息。如同：

1. `ESSID:"testing"`. 这是一个WiFi网络的名字   
1. `IE: IEEE 802.11i/WPA2 Version 1`. 这是使用的认证信息；当前使用的是WPA2协议，是一种取代WPA1的更新更安全的无线标准。本指南的介绍可工作在WEP, WPA or WPA2, 但可能不能工作在WPA2企业级。   
您还是需要一个WiFi网络的密码。它位于大多数家庭路由器背面的贴纸上。这种情形下ESSID (ssid) 是`testing` 和密码 (psk) `testingPassword`.

## 添加一个网络描述到树莓派上
  
使用编辑器nano打开配置文件 `wpa-supplicant`:  (我还是习惯vi，当然高手都是用vi的。:P) 

`sudo nano /etc/wpa_supplicant/wpa_supplicant.conf`  

在文件的最后添加以下内容：   

```
network={
    ssid="The_ESSID_from_earlier"
    psk="Your_wifi_password"
}
```

上述示例情形下，需要键入：  

```
network={
    ssid="testing"
    psk="testingPassword"
}
```
   
现在通过键入**ctrl+x** 然后 **y** 保存文件, 最后键入 **enter**.  

在这一点上，`wpa supplicant`通常会通知在几秒钟内发生变化的，它会尝试连接到网络。如果没有，使用`sudo ifdown wlan0`和`sudo ifup wlan0`接口来手动重启 ，或重新启动树莓派可使用 `sudo reboot`。（再次吐槽，不会用reboot，年纪大了，这么高深的单词记不住，`sudo init 6`）

你可以验证是否已成功连接使用`ifconfig wlan0`。如果`inet addr`领域有一个地址在它旁边，PI已连接到网络。如果不是，请检查您的密码和ESSID是正确的。
