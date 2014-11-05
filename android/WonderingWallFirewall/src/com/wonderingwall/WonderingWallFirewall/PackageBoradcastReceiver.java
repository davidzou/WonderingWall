package com.wonderingwall.WonderingWallFirewall;  

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/** 
 * ClassName:PackageBoradcastReceiver <br/> 
 * Function: TODO 程序包广播监听 <br/> 
 * Reason:   TODO 用于程序监听覆盖安装，其他等需要监听的特殊用途. <br/> 
 * Date:     2014年6月18日 下午2:41:04 <br/> 
 * @author   DavidZou
 * @version   
 * @see       
 */
public class PackageBoradcastReceiver extends BroadcastReceiver {
	private final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(PackageBoradcastReceiver.class);
	/**
	 * 包被安装
	 */
	public static final String PACKAGE_ADD = "android.intent.action.PACKAGE_ADDED";
	/**
	 * 包被删除，覆盖安装也会被监听。
	 */
	public static final String PACKAGE_REMOVED = "android.intent.action.PACKAGE_REMOVED";

	@Override
	public void onReceive(Context context, Intent intent) {
		logger.info("onReceive()");
		if(intent ==  null)	return;
		String action = intent.getAction();
		if(PACKAGE_ADD.equals(action)){
			String packageName = intent.getDataString();
			logger.info("Package:" + packageName + " added.");
			//  用于监听某些被安装的包，可以用来统计。 Statistics
			return;
		}
		if(PACKAGE_REMOVED.equals(action)){
			String packageName = intent.getDataString();
			logger.info("Package: |" + packageName + "| removed.|" + context.getPackageName() + "|");
			// 删除文件，当前只有一个，但是如果很耗时的时候必须放到Service中完成。
			if(packageName.endsWith(context.getPackageName())){
			}
			return;
		}
	}

}
 