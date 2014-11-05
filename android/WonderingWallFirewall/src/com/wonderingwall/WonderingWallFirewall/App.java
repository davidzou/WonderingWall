/** 
 * Project Name:WonderingWallFirewall 
 * File Name:App.java 
 * Package Name:com.wonderingwall.WonderingWallFirewall 
 * Date:2014年11月4日下午2:50:42 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.WonderingWallFirewall;  

import java.io.FileNotFoundException;
import java.lang.Thread.UncaughtExceptionHandler;

import android.app.Application;
import android.content.Context;
import android.os.StrictMode;
import android.os.StrictMode.VmPolicy;

import com.wonderingwall.log.Log4jConfiguare;
import com.wonderingwall.util.ApplicationParticipant;

/** 
 * ClassName:App <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年11月4日 下午2:50:42 <br/> 
 * @author   DavidZou
 * @version   
 * @see       
 */
public class App extends Application implements UncaughtExceptionHandler{
	// ##############################################-############################################
	// #            变量声明
	// ##############################################-############################################
	private ApplicationParticipant participant;
	
	
	private static App _instance;
	public App() {_instance = this;}
	public static Context getContext(){
		if(_instance == null){
			_instance = new App();
		}
		return _instance.getApplicationContext();
	}
	
	// ##############################################-############################################
	// #            继承方法
	// ##############################################-############################################
	@Override
	public void onCreate() {
	    super.onCreate();
	    StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
	    builder.detectAll();
	    builder.penaltyLog();
	    VmPolicy vmp = builder.build();
	    StrictMode.setVmPolicy(vmp);
	    
		try {
	        Log4jConfiguare.configure();
        } catch (FileNotFoundException e) {
	        e.printStackTrace();
        }
		participant = ApplicationParticipant.init(getContext());
		
//		registerReceiver(new ServiceBroadcastReceiver(), new IntentFilter(Intent.ACTION_TIME_TICK));
	}
	
	@Override
    public void uncaughtException(Thread thread, Throwable ex) {
		participant.uncaughtException(thread, ex);
    }
	
	@Override
	public void onTrimMemory(int level) {
	    super.onTrimMemory(level);
	}
	
	@Override
	public void onLowMemory() {
		System.gc();
		System.runFinalization();
		System.gc();
		super.onLowMemory();
	}

	@Override
	public void onTerminate() {
		super.onTerminate();
	}
}
 