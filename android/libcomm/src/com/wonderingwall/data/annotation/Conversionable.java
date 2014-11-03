/** 
 * Project Name:libcomm 
 * File Name:ConvertName.java 
 * Package Name:com.wonderingwall.data 
 * Date:Oct 13, 20145:44:10 PM 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */

package com.wonderingwall.data.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ClassName:ConvertName <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: Oct 13, 2014 5:44:10 PM <br/>
 * 
 * @author DavidZou
 * @version
 * @see
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Conversionable {
	
	String value();

	ConversionableDataType type() default ConversionableDataType.NORMAL;
}
