/** 
 * Project Name:WonderingWallFirewall 
 * File Name:ServiceBroadcastReceiver.java 
 * Package Name:com.wonderingwall.WonderingWallFirewall 
 * Date:2014年11月5日上午10:06:31 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.WonderingWallFirewall;  

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/** 
 * ClassName: ServiceBroadcastReceiver <br/> 
 * Function: TODO 捕获android设备开机状态广播，已启动服务. <br/> 
 * Reason: TODO 强制启动自定义服务，闹钟等 <br/> 
 * date: 2014年6月18日 下午4:06:45 <br/> 
 * 
 * @author 
 * @version  
 * @modified	DavidZou -- spt_genius@hotmail.com
 */  
public class ServiceBroadcastReceiver extends BroadcastReceiver {
	private final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ServiceBroadcastReceiver.class);
	@Override
	public void onReceive(Context context, Intent intent) {
		logger.debug("onReceive()");
		String action = intent.getAction();
		if(Intent.ACTION_BOOT_COMPLETED.equals(action)) {
			//  一开机就自启动服务
			logger.debug("boot completed");
			// 启动一个循环服务，比如监听消息。
		}else
		if(Intent.ACTION_TIME_TICK.equals(action)){
			// 每分钟一次的系统广播，以防止服务被kill掉
			logger.debug("action heart ...");
		}
	}

}
 