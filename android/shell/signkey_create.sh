#!/bin/bash
## 需求：创建Android项目的SignKey
## 流程： 	1. 输入签名文件的昵称（Alias name）
##			2. 输入签名数据库的文件名（keystore name）

echo "Please type keystore.alias value:"
read ALIAS
echo "key.alias.name = $ALIAS"
echo "Please type keystore file name:"
read KEY_NAME
echo "key.store.name = $KEY_NAME"

keytool -genkey -alias ${ALIAS} -keyalg RSA -validity 20000 -keystore ${KEY_NAME}.keystore