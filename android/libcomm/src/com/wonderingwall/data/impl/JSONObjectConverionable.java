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
import java.util.LinkedHashMap;

import org.json.JSONObject;

import com.wonderingwall.base.BaseModel;
import com.wonderingwall.data.ConversionException;
import com.wonderingwall.data.ConversionUtils;
import com.wonderingwall.data.Conversionable;
import com.wonderingwall.data.ConversionableMapObject;

/**
 * ClassName:JSONObjectConverionable <br/>
 * Function: TODO JSON和数据模型间的转换实现。 <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: Oct 8, 2014 11:25:51 AM <br/>
 * 
 * @author DavidZou
 * @version
 * @see
 */
public class JSONObjectConverionable implements Conversionable<JSONObject> {
	/*
	 * 功能描述
	 * 1. 将数据转换为响应的模型数据。
	 * 2. 可以使用注释的方式，也可以不使用注释的方式。
	 * 3. 可以转换的对象数据包含标准的，还有数组，容器和对象（递归，但是很耗资源啊）。
	 */
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
		LinkedHashMap<String, ConversionableMapObject> hash = new LinkedHashMap<String, ConversionableMapObject>();
		for (Method method : methods) {
			ConversionUtils.getInstance().parser(method, hash);
		}

		for (ConversionableMapObject conversionMapObject : hash.values()) {
			ConversionUtils.getInstance().invoke(conversionMapObject, b, json);
		}

		if (methods != null) { methods = null; }
		if (hash != null) {	hash.clear(); hash = null; }
		return b;
	}

	@Override
	public <B extends BaseModel> JSONObject reconvert(B model) throws ConversionException {
		// FIXME
		JSONObject data = new JSONObject();
		Method[] methods = model.getClass().getDeclaredMethods();
		LinkedHashMap<String, ConversionableMapObject> hash = new LinkedHashMap<String, ConversionableMapObject>();
		for(Method method : methods){
			ConversionUtils.getInstance().parser(method, hash);
		}
		for(ConversionableMapObject conversionableMapObject : hash.values()){
			ConversionUtils.getInstance().assemble(conversionableMapObject, model, data);
		}
		if (methods != null) { methods = null; }
		if (hash != null) {	hash.clear(); hash = null; }
		return data;
	}

}
