/** 
 * Project Name:libcomm 
 * File Name:BundleConversionable.java 
 * Package Name:com.wonderingwall.data 
 * Date:Oct 17, 20141:19:43 PM 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.data.impl;  

import android.os.Bundle;

import com.wonderingwall.base.BaseModel;
import com.wonderingwall.data.Conversionable;

/** 
 * ClassName:BundleConversionable <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     Oct 17, 2014 1:19:43 PM <br/> 
 * @author   DavidZou
 * @version   
 * @see       
 */
public class BundleConversionable implements Conversionable<Bundle> {

	@Override
    public <B extends BaseModel> B convert(Bundle t, Class<B> model) {
	    return null;
    }

	@Override
    public Bundle reconvert() {
	    return null;
    }

}
 