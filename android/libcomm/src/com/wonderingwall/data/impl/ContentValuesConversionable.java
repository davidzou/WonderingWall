/** 
 * Project Name:libcomm 
 * File Name:ContentValueConversionable.java 
 * Package Name:com.wonderingwall.data.impl 
 * Date:Nov 4, 201412:06:50 AM 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.data.impl;  

import android.content.ContentValues;

import com.wonderingwall.base.BaseModel;
import com.wonderingwall.data.ConversionException;
import com.wonderingwall.data.Conversionable;

/** 
 * ClassName:ContentValueConversionable <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     Nov 4, 2014 12:06:50 AM <br/> 
 * @author   DavidZou
 * @version   
 * @see       
 */
public class ContentValuesConversionable implements Conversionable<ContentValues> {

	@Override
    public <B extends BaseModel> B convert(ContentValues t, Class<B> model) throws ConversionException {
	    return null;
    }

	@Override
    public <B extends BaseModel> ContentValues reconvert(B model) throws ConversionException {
	    return null;
    }
}
 