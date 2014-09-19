/** 
 * Project Name:libui 
 * File Name:BaseServiceImpl.java 
 * Package Name:com.wonderingwall.ui 
 * Date:Sep 18, 20145:10:22 PM 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.ui;  

import android.content.Intent;
import android.os.Bundle;

/** 
 * ClassName:BaseServiceImpl <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     Sep 18, 2014 5:10:22 PM <br/> 
 * @author   DavidZou
 * @version   
 * @see       
 */
public abstract class AbstractBaseService implements BaseService {

	@Override
	public void onCreate(Bundle savedInstanceState, Intent intent) {
		if(savedInstanceState != null){
			// resetData
			resetData(savedInstanceState);
		}else{
			// read form intent;
			if(intent != null && intent.getExtras() != null){
				setExtraData(intent);
			}else{
				setDafaultData();
			}
		}
	}
	
	/**
	 * Description(描述): 恢复缓存数据<br/> 
	 * Conditions(适用条件): 界面被系统销毁后重建界面的数据恢复<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @param savedInstanceState 
	 */ 
	protected abstract void resetData(Bundle savedInstanceState);
	
	/**
	 * Description(描述): 初始化数据<br/> 
	 * Conditions(适用条件): 界面被第一次创建后的界面传递的数据对象赋值<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @param intent 
	 */ 
	protected abstract void setExtraData(Intent intent);
	
	/**
	 * Description(描述): 初始化数据<br/> 
	 * Conditions(适用条件): 界面被第一次创建后的界面传递值获取失败，或者没传的设置对象数据默认值<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 */ 
	protected abstract void setDafaultData();

	@Override
	public void onSaveInstanceState(Bundle outState) {

	}

	@Override
	public void onRestoreInstanceState(Bundle savedInstanceState) {
		resetData(savedInstanceState);
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart() {

	}
	
	/**
	 * Description(描述): 数据请求<br/> 
	 * Conditions(适用条件):<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @param refresh 
	 */ 
	protected abstract void request(boolean refresh);
	
	/**
	 * Description(描述): 请求图片<br/> 
	 * Conditions(适用条件):<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 */ 
	protected abstract void requestImage();
	
	/**
	 * Description(描述):<br/> 
	 * Conditions(适用条件):<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 */ 
	protected abstract void cancel();

	/**
	 * Description(描述):<br/> 
	 * Conditions(适用条件):<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 */ 
	protected abstract void cancelImageAll();
	
	@Override
	public void onRestart() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onResume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub

	}

}
 