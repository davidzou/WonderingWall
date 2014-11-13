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
	android.view.View getRootView();
	
	<D> void updateView(D data);
}
 