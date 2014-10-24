/** 
 * Project Name:libcomm 
 * File Name:ConvertsionException.java 
 * Package Name:com.wonderingwall.data 
 * Date:2014年10月24日下午1:33:25 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.data;  
/** 
 * ClassName:ConvertsionException <br/> 
 * Function: TODO 转换异常 <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年10月24日 下午1:33:25 <br/> 
 * @author   DavidZou
 * @version   
 * @see       
 */
public class ConversionException extends RuntimeException {
	/***/
    private static final long serialVersionUID = 3992017549636184347L;

	public ConversionException() {
	}

	public ConversionException(String detailMessage) {
		super(detailMessage);
	}

	public ConversionException(Throwable throwable) {
		super(throwable);
	}

	public ConversionException(String detailMessage, Throwable throwable) {
		super(detailMessage, throwable);
	}
}
 