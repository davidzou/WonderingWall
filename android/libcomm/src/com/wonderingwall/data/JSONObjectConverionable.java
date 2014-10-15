/** 
 * Project Name:libcomm 
 * File Name:JSONObjectConverionable.java 
 * Package Name:com.wonderingwall.data 
 * Date:Oct 8, 201411:25:51 AM 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.data;  

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.json.JSONException;
import org.json.JSONObject;

import com.wonderingwall.base.BaseModel;

/** 
 * ClassName:JSONObjectConverionable <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     Oct 8, 2014 11:25:51 AM <br/> 
 * @author   DavidZou
 * @version   
 * @see       
 */
public class JSONObjectConverionable implements Conversionable<JSONObject> {
	@Override
    public void convert(JSONObject t, BaseModel model){
	    // 遍历data中的可以要和model中的变量相符。
		Method[] methods = model.getClass().getDeclaredMethods();
		
		// 1. 不能排序，看自觉
		for(Method method : methods){
			// 方法名method.getName();必须和filed名字相同
			if(method.getReturnType().getName().equals(JSONObject.class.getName())){
				// 对象数据，
			}
			for(Annotation anno : method.getAnnotations()){
				if(anno == null) continue; // 没有标记，惯例为get方法上标注
				anno.annotationType();
			}
		}
    }

	public void convert(String str, BaseModel model) throws JSONException{
		convert(new JSONObject(str), model);
	}
	
	@Override
    public JSONObject reconvert(){
		JSONObject data = new JSONObject();
	    return data;
    }
}
