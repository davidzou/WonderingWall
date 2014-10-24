/** 
 * Project Name:libcomm 
 * File Name:Converionable.java 
 * Package Name:com.wonderingwall.data 
 * Date:Oct 8, 201411:23:42 AM 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.data;  

import com.wonderingwall.base.BaseModel;

/** 
 * ClassName:Converionable <br/> 
 * Function: TODO 可转换的数据对象. <br/> 
 * Reason:   TODO 数据对象的转换 <br/> 
 * Date:     Oct 8, 2014 11:23:42 AM <br/> 
 * @author   DavidZou
 * @version   
 * @see       
 */
public interface Conversionable<T> {
	/**
	 * Description(描述): 转换数据为对象模型<br/> 
	 * Conditions(适用条件):<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @param t			Data what for convert to model. It like {@link org.json.JSONObject}, {@link android.os.Bundle}, etc.
	 * @param model 	Model what bean object.
	 */ 
	<B extends BaseModel> B convert(T t, Class<B> model) throws ConversionException;
	
	/**
	 * Description(描述): 转换数据模型对象<br/> 
	 * Conditions(适用条件):<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @return 
	 */ 
	<B extends BaseModel> T reconvert(B model) throws ConversionException;
}
 