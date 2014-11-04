/** 
 * Project Name:libcomm 
 * File Name:ApplicationParticipant.java 
 * Package Name:com.wonderingwall.util 
 * Date:2014年11月4日下午2:24:18 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.util;  

import android.content.Context;
import android.content.Intent;

/** 
 * ClassName:ApplicationParticipant <br/> 
 * Function: TODO Application程序的参与者，为Application提供预先实现的功能。 <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年11月4日 下午2:24:18 <br/> 
 * @author   DavidZou
 * @version   
 * @see       
 */
public class ApplicationParticipant {

	public ApplicationParticipant() {
	}
	
	/**
	 * Description(描述): 重启程序<br/> 
	 * Conditions(适用条件):<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @param context 
	 */ 
	public void restartApp(Context context) {
		try {
			Intent intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
			intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			context.startActivity(intent);
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}
 