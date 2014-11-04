/** 
 * Project Name:WonderingWallFirewall 
 * File Name:App.java 
 * Package Name:com.wonderingwall.WonderingWallFirewall 
 * Date:2014年11月4日下午2:50:42 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.WonderingWallFirewall;  

import java.lang.Thread.UncaughtExceptionHandler;

import android.app.Application;
import android.os.StrictMode;
import android.os.StrictMode.VmPolicy;

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
	private static App _instance;
	public App() {_instance = this;}
	public static App getInstance(){
		if(_instance == null){
			_instance = new App();
		}
		return _instance;
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
	}
	
	@Override
    public void uncaughtException(Thread thread, Throwable ex) {
	    
    }
	
	// ##############################################-############################################
	// #            自定义方法
	// ##############################################-############################################

	// ##############################################-############################################
	// #            内部类
	// ##############################################-############################################

	// ##############################################-############################################
	// #            getset
	// ##############################################-############################################
}
 