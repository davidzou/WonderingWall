/** 
 * Project Name:libui 
 * File Name:BaseLifeCircle.java 
 * Package Name:com.wonderingwall.ui 
 * Date:Sep 18, 20144:42:37 PM 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */

package com.wonderingwall.ui;

import android.content.Intent;
import android.os.Bundle;

/**
 * ClassName:BaseLifeCircle <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: Sep 18, 2014 4:42:37 PM <br/>
 * 
 * @author DavidZou
 * @version
 * @see
 */
public interface BaseService {
	/**
	 * Description(描述): 绑定数据模型对象<br/> 
	 * Conditions(适用条件):<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @param t 
	 */ 
	<T> void bind(T t);
	
	void onCreate(Bundle savedInstanceState, Intent intent);

	void onSaveInstanceState(Bundle outState);

	void onRestoreInstanceState(Bundle savedInstanceState);

	void onActivityResult(int requestCode, int resultCode, Intent data);

	void onStart();

	void onRestart();

	void onResume();

	void onPause();

	void onStop();

	void onDestroy();
}
