/** 
 * Project Name:libcomm 
 * File Name:JSONObjectConverionable.java 
 * Package Name:com.wonderingwall.data 
 * Date:Oct 8, 201411:25:51 AM 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */

package com.wonderingwall.data.impl;

import java.lang.reflect.Method;
import java.util.HashMap;

import org.json.JSONObject;

import com.wonderingwall.base.BaseModel;
import com.wonderingwall.data.ConversionException;
import com.wonderingwall.data.ConversionMapObject;
import com.wonderingwall.data.ConversionUtils;
import com.wonderingwall.data.Conversionable;

/**
 * ClassName:JSONObjectConverionable <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: Oct 8, 2014 11:25:51 AM <br/>
 * 
 * @author DavidZou
 * @version
 * @see
 */
public class JSONObjectConverionable implements Conversionable<JSONObject> {
	@Override
	public <B extends BaseModel> B convert(JSONObject json, Class<B> model) throws ConversionException {
		if (json == null) {
			throw new ConversionException("Cant't to convert in JSONObjectConversionable that data is null.");
		}
		// 遍历data中的可以要和model中的变量相符。
		B b = null;
		try {
			b = model.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		if (b == null) {
			throw new ConversionException("Can't init model class.");
		}
		// 模型类中的方法
		Method[] methods = b.getClass().getDeclaredMethods();
		HashMap<String, ConversionMapObject> hash = new HashMap<String, ConversionMapObject>();
		for (Method method : methods) {
			ConversionUtils.parser(method, hash);
		}

		for (ConversionMapObject conversionMapObject : hash.values()) {
			ConversionUtils.invoke(conversionMapObject, b, json);
		}

		if (methods != null) { methods = null; }
		if (hash != null) {	hash.clear(); hash = null; }
		return b;
	}

	@Override
	public <B extends BaseModel> JSONObject reconvert(B model) throws ConversionException {
		JSONObject data = new JSONObject();
		return data;
	}

//    private static Class<?> getClass(Type type, int i) {     
//        if (type instanceof ParameterizedType) { // 处理泛型类型     
//            return getGenericClass((ParameterizedType) type, i);     
//        } else if (type instanceof TypeVariable) {     
//            return (Class<?>) getClass(((TypeVariable<?>) type).getBounds()[0], 0); // 处理泛型擦拭对象     
//        } else {// class本身也是type，强制转型     
//            return (Class<?>) type;     
//        }     
//        
////        Type t = Type.GetType("System.Int32[]");
////        object array = new object();
////        array = t.InvokeMember("Set", BindingFlags.CreateInstance, null, array, new object[] { 10 });
//    }     
//    
//    private static Class<?> getGenericClass(ParameterizedType parameterizedType, int i) {     
//        Object genericClass = parameterizedType.getActualTypeArguments()[i];     
//        if (genericClass instanceof ParameterizedType) { // 处理多级泛型     
//            return (Class<?>) ((ParameterizedType) genericClass).getRawType();     
//        } else if (genericClass instanceof GenericArrayType) { // 处理数组泛型     
//            return (Class<?>) ((GenericArrayType) genericClass).getGenericComponentType();     
//        } else if (genericClass instanceof TypeVariable) { // 处理泛型擦拭对象     
//            return (Class<?>) getClass(((TypeVariable<?>) genericClass).getBounds()[0], 0);     
//        } else {     
//            return (Class<?>) genericClass;     
//        }     
//    }    
}
