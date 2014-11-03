/** 
 * Project Name:libcomm 
 * File Name:JSONObjectConverionable.java 
 * Package Name:com.wonderingwall.data 
 * Date:Oct 8, 201411:25:51 AM 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */
package com.wonderingwall.data.impl;

import android.os.Parcel;

import com.wonderingwall.base.BaseModel;
import com.wonderingwall.data.ConversionException;
import com.wonderingwall.data.Conversionable;

/** 
 * ClassName: ParcelConversionable <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason: TODO ADD REASON(可选). <br/> 
 * date: Nov 4, 2014 12:01:57 AM <br/> 
 * 
 * @author DavidZou -- spt_genius@hotmail.com
 * @version  
 */  
public class ParcelConversionable implements Conversionable<Parcel> {

	@Override
    public <B extends BaseModel> B convert(Parcel t, Class<B> model) throws ConversionException {
	    return null;
    }

	@Override
    public <B extends BaseModel> Parcel reconvert(B model) throws ConversionException {
	    return null;
    }

}
