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
 * Reason:   基本UI框架. <br/> 
 * Date:     Sep 18, 2014 10:51:34 AM <br/> 
 * @author   DavidZou
 * @version   1.0.0
 */
public class BaseActivity<T extends BaseService> extends Activity {
	protected T _service;
	
	@SuppressWarnings("unchecked")
    @Override
	protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    if(_service == null){
	    	try {
	            _service = (T) Class.forName(_service.getClass().getName()).newInstance();
	            _service.onCreate(savedInstanceState, getIntent());
            } catch (InstantiationException e) {
	            e.printStackTrace();
            } catch (IllegalAccessException e) {
	            e.printStackTrace();
            } catch (ClassNotFoundException e) {
	            e.printStackTrace();
            }
	    }
	}
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
	    super.onSaveInstanceState(outState);
	    if(_service != null)
	    	_service.onSaveInstanceState(outState);
	}
	
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
	    super.onRestoreInstanceState(savedInstanceState);
	    if(_service != null)
	    	_service.onRestoreInstanceState(savedInstanceState);
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	    super.onActivityResult(requestCode, resultCode, data);
	    if(_service != null)
	    	_service.onActivityResult(requestCode, resultCode, data);
	}
	
	@Override
	protected void onStart() {
	    super.onStart();
	    if(_service != null)
	    	_service.onStart();
	}
	
	@Override
	protected void onRestart() {
	    super.onRestart();
	    if(_service != null)
	    	_service.onRestart();
	}
	
	@Override
	protected void onResume() {
	    super.onResume();
	    if(_service != null)
	    	_service.onResume();
	}
	
	@Override
	protected void onPause() {
	    super.onPause();
	    if(_service != null)
	    	_service.onPause();
	}
	
	@Override
	protected void onStop() {
	    super.onStop();
	    if(_service != null)
	    	_service.onStop();
	}
	
	@Override
	protected void onDestroy() {
	    super.onDestroy();
	    if(_service != null)
	    	_service.onDestroy();
	}
}
 