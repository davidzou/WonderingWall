/** 
 * Project Name:libcomm 
 * File Name:ConversionMapObject.java 
 * Package Name:com.wonderingwall.data 
 * Date:2014年10月24日下午3:47:20 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */

package com.wonderingwall.data;

import java.lang.reflect.Method;

import com.wonderingwall.data.annotation.DATA_TYPE;

/**
 * ClassName:ConversionMapObject <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2014年10月24日 下午3:47:20 <br/>
 * 
 * @author DavidZou
 * @version
 * @see
 */
public class ConversionMapObject {
	/**
	 * 键值（索引，对应数据模型的变量名）
	 */
	public String key;
	/**
	 * 数据模型的变量设置方法
	 */
	public String setMethod;
	/**
	 * 数据模型的变量获取方法
	 */
	public Method getMethod;
	/**
	 * 数据模型变量的数据类型
	 */
	public DATA_TYPE type;
	/**
	 * 数据模型方法反射对象类
	 */
	public Method method;
	
	public ConversionMapObject() {
	    super();
    }
	
	
}
