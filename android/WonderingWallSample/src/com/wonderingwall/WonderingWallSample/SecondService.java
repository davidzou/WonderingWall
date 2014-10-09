/** 
 * Project Name:WonderingWallSample 
 * File Name:SecondService.java 
 * Package Name:com.wonderingwall.WonderingWallSample 
 * Date:Sep 22, 20142:04:22 PM 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.WonderingWallSample;  

import android.content.Intent;
import android.os.Bundle;

import com.wonderingwall.base.AbstractBaseService;

/** 
 * ClassName:SecondService <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     Sep 22, 2014 2:04:22 PM <br/> 
 * @author   DavidZou
 * @version   
 * @see       
 */
public class SecondService extends AbstractBaseService {
	private static SecondService _instance;
	private SecondService(){}
	public static SecondService getInstance(){
		if(_instance == null)
			_instance = new SecondService();
		return _instance;
	}
	
	@Override
	protected void resetData(Bundle savedInstanceState) {

	}

	@Override
	protected void setExtraData(Intent intent) {

	}

	@Override
	protected void setDafaultData() {

	}

	@Override
	protected void request(boolean refresh) {
		// 网络数据请求
		// showDialog();
		// Request.request(new CallBack(){
		//    public void callback(Response resp){
		// 		 if(resp.isError()){
		//			// do excute error info
		//			showError();
		// 		 }else{
		//			// do excute current info
		//			updateView();
		//		 }
		//		 dismissDialog();
		//    }
		// })
	}
	
	@Override
	protected void cancel() {
	    
	}

	@Override
	protected void requestImage(String url) {
		// 图片数据请求
		// 默认强制启动一个图片请求，否则自动加入队列的自动请求，比如打开一个图片详情的时候，强制图片最想打开。
	}

	@Override
	protected void cancelImage() {
		// 特定图片打开时关闭时调用，比如看原图的时候，但是下了一半又不想看了，那么删除任务，减小开销。
	}

	@Override
	protected void cancelImageAll() {
		// 当destroy的时候被调用，减少网络消耗。否者缓存，或者优先级降低，以保证最新的数据被最新发出
	}
}
 