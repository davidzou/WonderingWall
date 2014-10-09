/** 
 * Project Name:libcomm 
 * File Name:JSONObjectConverionable.java 
 * Package Name:com.wonderingwall.data 
 * Date:Oct 8, 201411:25:51 AM 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.data;  

import org.json.JSONException;
import org.json.JSONObject;

/** 
 * ClassName:JSONObjectConverionable <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     Oct 8, 2014 11:25:51 AM <br/> 
 * @author   DavidZou
 * @version   
 * @see       
 */
public abstract class JSONObjectConverionable implements Conversionable<JSONObject> {
	@Override
    public void convert(JSONObject t){
	    
    }

	public void convert(String str) throws JSONException{
		convert(new JSONObject(str));
	}
	
	@Override
    public JSONObject reconvert(){
		JSONObject data = new JSONObject();
	    return data;
    }
}
