/** 
 * Project Name:libui 
 * File Name:BaseViewHolder.java 
 * Package Name:com.wonderingwall.ui 
 * Date:2014年11月13日下午4:41:55 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.ui;  
/** 
 * ClassName:BaseViewHolder <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年11月13日 下午4:41:55 <br/> 
 * @author   DavidZou
 * @version   
 * @see       
 */
public interface BaseViewHolder {
	/**
	 * Description(描述): 获取根路径<br/> 
	 * Conditions(适用条件):<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @return 
	 */ 
	android.view.View getRootView();
	
	/**
	 * Description(描述): 数据更新<br/> 
	 * Conditions(适用条件):<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @param data 
	 */ 
	<D> void updateView(D data);
}
 