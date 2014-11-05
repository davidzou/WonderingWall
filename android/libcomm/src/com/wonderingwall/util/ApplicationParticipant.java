/** 
 * Project Name:libcomm 
 * File Name:ApplicationParticipant.java 
 * Package Name:com.wonderingwall.util 
 * Date:2014年11月4日下午2:24:18 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */

package com.wonderingwall.util;

import java.lang.Thread.UncaughtExceptionHandler;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.Toast;

/**
 * ClassName:ApplicationParticipant <br/>
 * Function: TODO Application程序的参与者，为Application提供预先实现的功能。 <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2014年11月4日 下午2:24:18 <br/>
 * 
 * @author DavidZou
 * @version
 * @see
 */
public class ApplicationParticipant {
	private final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(ApplicationParticipant.class);
	private Context context;

	private ApplicationParticipant(Context context) {
		this.context = context;
	}

	public static final ApplicationParticipant init(Context context) {
		ApplicationParticipant participant = new ApplicationParticipant(context);
		return participant;
	}

	/**
	 * Description(描述): 程序未捕获异常处理<br/>
	 * Conditions(适用条件): Application中<br/>
	 * Execution flow(执行流程):<br/>
	 * Usage(用法):<br/>
	 * Cautions(注意事项):<br/>
	 * 
	 * @param thread
	 * @param ex
	 */
	public void uncaughtException(Thread thread, Throwable ex) {
		if (!handlerException(ex)) {
			// 如果用户没有处理则让系统默认的异常处理器来处理
			UncaughtExceptionHandler ueHandler = Thread.getDefaultUncaughtExceptionHandler();
			if (ueHandler != null) {
				ueHandler.uncaughtException(thread, ex);
			}
		}

		Thread t = new Thread() {
			public void run() {
				try {
					SystemClock.sleep(2000);
				} catch (Throwable t) {
				}
//				 killProcess();
//				destryComponents();
//				 restartApp();
				exit();
			}
		};
		t.start();
	}

	private boolean handlerException(Throwable ex) {
		if (ex == null)
			return false;
		// 使用Toast来显示异常信息
		new Thread() {
			@Override
			public void run() {
				Looper.prepare();
				Toast.makeText(context, "For repair that told to admin.", Toast.LENGTH_LONG).show();
				Looper.loop();
			}
		}.start();
		// write to log
		logger.error(ex.getMessage());
		return true;
	}

	private void exit() {
		int pid = android.os.Process.myPid();
		android.os.Process.killProcess(pid);
		System.exit(0);
	}

	@SuppressWarnings("deprecation")
	@TargetApi(8)
	public void killProcess() {
		if (Build.VERSION.SDK_INT < 8) {	// build version < 2.2
			ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
			manager.restartPackage(context.getPackageName());
		} else {
			ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
			am.killBackgroundProcesses(context.getPackageName());
		}
	}
	
//	public <T extends Activity> void relaunchApp(Class<T> clazz) {
//		try {
//			Intent intent = new Intent().setClass(context, clazz);
//			intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//			intent.putExtra("PARENT_PID", android.os.Process.myPid());
//			context.startActivity(intent);
//		} catch (Throwable t) {
//			t.printStackTrace();
//		}
//		// Just in case the relaunching is not successful
//		Thread t = new Thread() {
//			public void run() {
//				try {
//					SystemClock.sleep(2000);
//				} catch (Throwable t) {
//				}
//				exit();
//			}
//		};
//		t.start();
//	}

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
