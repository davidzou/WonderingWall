/** 
 * Project Name:libcomm 
 * File Name:JSONObjectConverionable.java 
 * Package Name:com.wonderingwall.data 
 * Date:Oct 8, 201411:25:51 AM 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.data.impl;  

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;

import org.json.JSONObject;

import android.util.Log;

import com.wonderingwall.base.BaseModel;
import com.wonderingwall.data.Conversionable;
import com.wonderingwall.data.annotation.ConvertName;

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
    public <B extends BaseModel> B convert(JSONObject json, Class<B> model){
	    // 遍历data中的可以要和model中的变量相符。
		long start = System.currentTimeMillis();
		long start_nano = System.nanoTime();
		B b = null;
		Log.e("", "class-name:" + model.getName());
		try {
	        b = model.newInstance();
        } catch (InstantiationException e1) {
	        e1.printStackTrace();
        } catch (IllegalAccessException e1) {
	        e1.printStackTrace();
        }
		if(b == null){
			throw new IllegalArgumentException();
		}
		// 模型类中的方法
		Method[] methods = b.getClass().getDeclaredMethods();
		// 缓存设置的方法(所有setXXX方法)
		ArrayList<Method> setMethods = new ArrayList<Method>();
		// 注解对应的解析名称
		HashMap<String, String> names = new HashMap<String, String>();
		
		HashMap<String, String> returnType = new HashMap<String, String>();
		
		for(Method method : methods){
			// 默认方法写在get之上，那么这里需要获取到set方法的名字
			Log.e("", "method:" + method.getName() + "()");
			if(method.getName().startsWith("set")) { setMethods.add(method); continue; }
			Log.e("", "annotations-length:" + method.getDeclaredAnnotations().length);
			// 没有注解的直接跳过
			if(method.getDeclaredAnnotations().length == 0) continue;
			ConvertName name = method.getAnnotation(ConvertName.class);
			// 没有可用注解跳过（应当判断如果是get的则使用默认字段，或者说只是）
			if(name == null) continue;
			Log.e("", "annotation-name:" + name.value());
			if(json.has(name.value())){
				// 有字段，填充，判断数据类型，可能如果是数据对象的。如果是is开头的呢
//				Log.e("", "..." + method.getGenericReturnType());
				names.put(name.value(), getName(method.getName()));
			}
		}
		
		ArrayList<Method> done = new ArrayList<Method>();
		for(String name: names.keySet()){
			if(json.has(name)){
				for(Method method : setMethods){
					if(done.contains(method)) continue;
					Log.e("", "set:" + names.get(name) + "|" + method.getName());
//					if(method.getGenericParameterTypes().length > 0){
//						Log.e("", "parameter:" + method.getGenericParameterTypes()[0]);
//					}
					if(names.get(name).equals(method.getName())){
						
						// 调用反射方法，设置值。
						try {
	                        method.invoke(b, json.opt(name));
                        } catch (IllegalAccessException e) {
	                        e.printStackTrace();
                        } catch (IllegalArgumentException e) {
	                        e.printStackTrace();
                        } catch (InvocationTargetException e) {
	                        e.printStackTrace();
                        }
						done.add(method);
					}
				}
			}
		}
		Log.e("", "times:" + (System.currentTimeMillis() - start));
		Log.e("", "times_nano:" + (System.nanoTime() - start_nano));
		
		try{
			
		}finally{
			if(done != null){ done.clear();	done = null; }
			if(setMethods != null) { setMethods.clear(); setMethods = null; }
			if(names != null) { names.clear(); names = null; }
			if(methods != null) { methods = null; }
		}
		return b;
    }

	@Override
    public JSONObject reconvert(){
		JSONObject data = new JSONObject();
	    return data;
    }
	
	/**
	 * Description(描述): 替换方法名<br/> 
	 * Conditions(适用条件):<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @param src
	 * @return
	 */
	public String getName(String src){
		return Pattern.compile("^(get|is)").matcher(src).replaceAll("set");
	}
}
