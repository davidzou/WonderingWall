/** 
 * Project Name:libui 
 * File Name:BaseActivity.java 
 * Package Name:com.wonderingwall.ui 
 * Date:Sep 18, 201410:51:34 AM 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */

package com.wonderingwall.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * ClassName:BaseActivity <br/>
 * Function: 基础类. <br/>
 * Reason: 基本UI框架. <br/>
 * Date: Sep 18, 2014 10:51:34 AM <br/>
 * 
 * @author DavidZou
 * @version 1.0.0
 */
public class BaseServiceActivity<T extends BaseService> extends Activity {
	protected T _service;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		_service.onCreate(savedInstanceState, getIntent());
	}

	/**
	 * Description(描述): 绑定服务<br/> 
	 * Conditions(适用条件):<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @param t 
	 */ 
	public <M extends BaseModel> void bindService(T t, M... m) {
		this._service = t;
		this._service.bind(m);
	}

	/**
	 * Description(描述): 获得一个服务<br/> 
	 * Conditions(适用条件):<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @return 
	 */ 
	public T getService() {
		return _service;
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		if (_service != null)
			_service.onSaveInstanceState(outState);
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		if (_service != null)
			_service.onRestoreInstanceState(savedInstanceState);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if (_service != null)
			_service.onActivityResult(requestCode, resultCode, data);
	}

	@Override
	protected void onStart() {
		super.onStart();
		if (_service != null)
			_service.onStart();
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		if (_service != null)
			_service.onRestart();
	}

	@Override
	protected void onResume() {
		super.onResume();
		if (_service != null)
			_service.onResume();
	}

	@Override
	protected void onPause() {
		super.onPause();
		if (_service != null)
			_service.onPause();
	}

	@Override
	protected void onStop() {
		super.onStop();
		if (_service != null)
			_service.onStop();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		if (_service != null) {
			_service.onDestroy();
			_service = null;
		}

	}
}
