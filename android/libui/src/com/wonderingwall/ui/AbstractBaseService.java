/** 
 * Project Name:libui 
 * File Name:BaseServiceImpl.java 
 * Package Name:com.wonderingwall.ui 
 * Date:Sep 18, 20145:10:22 PM 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.ui;  

import java.util.Collections;
import java.util.List;

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
	protected List<BaseModel> _model = Collections.emptyList();
	
	@Override
	public <T extends BaseModel> void bind(T... t) {
	    // TODO 绑定数据对象
		// Service中可以有多个数据对象来处理界面数据，比如局部刷新的数据，和整体显示的数据等，但可能对应的数据请求也是不一样的
		for(T simple: t){
			_model.add(simple);
		}
	}
	
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
	 * Conditions(适用条件): 请求网络数据，不包括大量的图片请求，主要是快速的json请求<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项): 此请求应该是只有一个，如果有新的就被新的取代<br/> 
	 * 
	 * @param refresh 
	 */ 
	protected abstract void request(boolean refresh);
	
	/**
	 * Description(描述): 取消请求<br/> 
	 * Conditions(适用条件):请求网络数据，不包括大量的图片请求，主要是快速的json请求的取消<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 *  
	 */ 
	protected abstract void cancel();
	
	/**
	 * Description(描述): 请求图片<br/> 
	 * Conditions(适用条件): 默认强制启动一个图片请求，否则自动加入队列的自动请求，比如打开一个图片详情的时候，强制图片最先打开。<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @param url	图片路径
	 */ 
	protected abstract void requestImage(String url);
	
	/**
	 * Description(描述):<br/> 
	 * Conditions(适用条件): 特定图片打开时关闭时调用，比如看原图的时候，但是下了一半又不想看了，那么删除任务，减小开销。<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 */ 
	protected abstract void cancelImage();

	/**
	 * Description(描述):<br/> 
	 * Conditions(适用条件): 当destroy的时候被调用，减少网络消耗。否者缓存，或者优先级降低，以保证最新的数据被最先发出<br/> 
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
		cancelImageAll();
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
 