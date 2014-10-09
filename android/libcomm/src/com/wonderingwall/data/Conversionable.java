/** 
 * Project Name:libcomm 
 * File Name:Converionable.java 
 * Package Name:com.wonderingwall.data 
 * Date:Oct 8, 201411:23:42 AM 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.data;  
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
	void convert(T t);
	T reconvert();
}
 