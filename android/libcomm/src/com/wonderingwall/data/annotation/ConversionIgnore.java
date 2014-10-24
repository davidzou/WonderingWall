/** 
 * Project Name:libcomm 
 * File Name:ConversionIgnoe.java 
 * Package Name:com.wonderingwall.data.annotation 
 * Date:2014年10月24日下午3:03:38 
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
 * ClassName:ConversionIgnoe <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年10月24日 下午3:03:38 <br/> 
 * @author   DavidZou
 * @version   
 * @see       
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ConversionIgnore {

}
 