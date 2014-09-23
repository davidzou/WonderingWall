/** 
 * Project Name:WonderingWallSample 
 * File Name:SecondActivity.java 
 * Package Name:com.wonderingwall.WonderingWallSample 
 * Date:Sep 22, 20142:03:54 PM 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */

package com.wonderingwall.WonderingWallSample;

import android.os.Bundle;

import com.wonderingwall.ui.BaseServiceActivity;

/**
 * ClassName:SecondActivity <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: Sep 22, 2014 2:03:54 PM <br/>
 * 
 * @author DavidZou
 * @version
 * @see
 */
public class SecondActivity extends BaseServiceActivity<SecondService> {
	// ##############################################-############################################
	// # 变量声明
	// ##############################################-############################################

	// ##############################################-############################################
	// # 继承方法
	// ##############################################-############################################
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		bindService(SecondService.getInstance(), new SecondModel());
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity);
	}

	@Override
	protected void onStart() {
	    super.onStart();
	    getService().request(true);
	}
	
	@Override
	protected void onResume() {
	    super.onResume();
	}
	
	protected void onPullMore(){
		// 获取更多数据，列表
		getService().request(false);
	}
	
	// ##############################################-############################################
	// # 自定义方法
	// ##############################################-############################################

	// ##############################################-############################################
	// # 内部类
	// ##############################################-############################################

	// ##############################################-############################################
	// # getset
	// ##############################################-############################################
}
