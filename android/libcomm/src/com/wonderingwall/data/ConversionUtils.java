/** 
 * Project Name:libcomm 
 * File Name:ConversionUtils.java 
 * Package Name:com.wonderingwall.data 
 * Date:2014年10月24日下午1:46:08 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */

package com.wonderingwall.data;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.regex.Pattern;

import org.json.JSONArray;
import org.json.JSONObject;

import android.content.ContentValues;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;

import com.wonderingwall.base.BaseModel;
import com.wonderingwall.data.annotation.ConversionIgnore;
import com.wonderingwall.data.annotation.Conversionable;
import com.wonderingwall.data.annotation.DATA_TYPE;
import com.wonderingwall.data.impl.JSONObjectConverionable;

/**
 * ClassName:ConversionUtils <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2014年10月24日 下午1:46:08 <br/>
 * 
 * @author DavidZou
 * @version
 * @see
 */
public final class ConversionUtils {
	/**
	 * Description(描述): 根据get|is方法获取set的方法名。<br/>
	 * Conditions(适用条件): 标准书写格式的get/set方法名。<br/>
	 * Execution flow(执行流程):<br/>
	 * Usage(用法):<br/>
	 * Cautions(注意事项):<br/>
	 * 
	 * @param src
	 * @return
	 */
	public static String getName(String src) {
		return Pattern.compile("^(get|is)").matcher(src).replaceAll("set");
	}

	/**
	 * Description(描述): 匹配相应的get|is方法来获取相对应的变量key值，对应map的键值。<br/>
	 * Conditions(适用条件): 标准书写格式的get/set方法名。<br/>
	 * Execution flow(执行流程):<br/>
	 * Usage(用法):<br/>
	 * Cautions(注意事项):<br/>
	 * 
	 * @param src
	 * @return
	 * @fix		如果value被设置为非小写的，带有连字符的状态时，会有错误解析，
	 */
	public static String getConvertName(String src) {
		return Pattern.compile("^(get|is|set)").matcher(src).replaceAll("").toLowerCase();
	}

	/**
	 * Description(描述): 解析方法<br/>
	 * Conditions(适用条件):<br/>
	 * Execution flow(执行流程): 1. 没有注解和有注解，默认不用注解，那么就是一般数据类型（byte, short, int,
	 * long, float, double, string, boolean）并且使用方法名get|is之后的字符串的小写形式作为映射键值使用。<br/>
	 * Usage(用法):<br/>
	 * Cautions(注意事项):<br/>
	 * 
	 * @param method
	 * @return
	 */
	public static final boolean parser(Method method, HashMap<String, ConversionMapObject> hash) {
		for(Type type : method.getGenericParameterTypes()){
			Log.e("", "type:" + getClass(type, 0).getName()); // 基础变量
		}
		for(Class<?> clazz: method.getParameterTypes()){
			Log.e("", "clazz type:" + clazz.getName() + "-" + clazz.isPrimitive() + "|" + clazz.isSynthetic() + "|"); // set传参类型
		}
		for(TypeVariable<?> variable : method.getTypeParameters()){
			Log.e("", "variable:" + variable.getName());
		}
		
//		if (hash == null) {
//			throw new ConversionException("Argument hash is null.");
//		}
//		if (method.getAnnotations().length > 0) {
//			ConversionIgnore ignore = method.getAnnotation(ConversionIgnore.class);
//			// TODO 直接忽略，不转化数据对象。这里就需要一个判断，不转化哪类数据，JSON或者其他Bundle？将来扩充
//			if (ignore != null) {
//				return false;
//			}
//
//			Conversionable convertName = method.getAnnotation(Conversionable.class);
//			if (convertName == null) {
//				// getConvertName， 直接使用默认的值
//				String methodName = getConvertName(method.getName()); // key
//																	  // name
//				update(methodName, method, null, hash);
//			} else {
//				if (TextUtils.isEmpty(convertName.value())) {
//					throw new ConversionException("value is null at " + method.getName());
//				}
//				convertName.value();
//				convertName.type();
//				update(convertName.value(), method, convertName.type(), hash);
//			}
//		} else {
//			// 没有注解 getConvertName， and data type is normal
//			// TODO 这里要求写在get之上，而非set之上，这里就需要处理set的方法。如果直接是在field上注释的呢？
//			String methodName = getConvertName(method.getName()); // key name
//			if(methodName.endsWith("toString")){
//				return false;
//			}
////			update(methodName, method, null, hash);
//		}
		return false;
	}

	/**
	 * Description(描述):<br/>
	 * Conditions(适用条件):<br/>
	 * Execution flow(执行流程):<br/>
	 * Usage(用法):<br/>
	 * Cautions(注意事项):<br/>
	 * 
	 * @param name 变量名（小写）
	 * @param method 方法
	 * @param type 数据类型
	 * @param hash 映射表
	 */
	private static void update(String name, Method method, DATA_TYPE type, HashMap<String, ConversionMapObject> hash) {
		if (hash.containsKey(name)) {
			// 更新
			ConversionMapObject map = (ConversionMapObject) hash.get(name);
			if (method.getName().startsWith("set")) {
				map.setMethod = method.getName();
				map.method = method;
			} else {
				map.getMethod = method;
			}
			if (!TextUtils.isEmpty(name))
				map.key = name;
			if (type != null)
				map.type = type;
		} else {
			// 新建
			ConversionMapObject map = new ConversionMapObject();
			if (method.getName().startsWith("set")) {
				map.setMethod = method.getName();
				map.method = method;
			} else {
				map.getMethod = method;
			}
			if (!TextUtils.isEmpty(name))
				map.key = name;
			if (type != null)
				map.type = type;
			hash.put(name, map);
		}
	}

	public static final <B extends BaseModel, T> void invoke(ConversionMapObject conversionMapObject, B b, T t) throws ConversionException {
		if (t instanceof JSONObject) {
			invoke(conversionMapObject, b, (JSONObject) t);
		} else if (t instanceof Bundle) {
			invoke(conversionMapObject, b, (Bundle) t);
		} else if (t instanceof Parcel) {
			invoke(conversionMapObject, b, (Parcel) t);
		} else if (t instanceof ContentValues) {
			invoke(conversionMapObject, b, (ContentValues) t);
		} else {
			throw new ConversionException("It what is unknow type can't invoke ");
		}
	}

	protected static final <B extends BaseModel> void invoke(ConversionMapObject conversionMapObject, B model, JSONObject json) {
		if (json.has(conversionMapObject.key)) {
			switch (conversionMapObject.type) {
			case NORMAL:
				// normal
				ConversionUtils.invoke(conversionMapObject.method, model, json.opt(conversionMapObject.key));
				break;
			case ARRAY:
				// normal array
				ConversionUtils.invoke(conversionMapObject.method, conversionMapObject.getMethod.getReturnType().getComponentType(), model, json.optJSONArray(conversionMapObject.key));
				break;
			case ARRAY_OBJECT:
				// special array
				break;
			case LIST:
				Log.e("convert", "conversionMapObject:" + conversionMapObject.toString());
				Type type = conversionMapObject.getMethod.getGenericReturnType();
				
				
				
				Type[] sets = conversionMapObject.method.getGenericParameterTypes();
				if(sets.length > 0){
					for(Type t : sets){
						Log.e("", "..." + t.getClass().getName() );
					}
				}else{
					Log.e("", "no params");
				}
				
				Log.e("", "generic return type:" + type.getClass().getName()); // 返回的集合类型
				if( type instanceof GenericArrayType){
					Log.e("", "generic type is array");
				}
				Log.e("", "return type:" + conversionMapObject.getMethod.getReturnType());
				if (type instanceof ParameterizedType) {
					// is list true
					Type t = ((ParameterizedType) type).getRawType();
//					Log.e("", t.getClass().getName());
					if (t.getClass().isInterface()) {
						// 如果是接口定义的泛型集合。
						Log.e("", "is a interface");
					}
					Class<?> c = getGenericClass(((ParameterizedType) type), 0);
					Log.e("", "type:" + c.getName());
//					Type[] types = ((ParameterizedType) type).getActualTypeArguments();
//					if (types.length > 1) {
//						Log.e("", "is a mapping");
//					} else {
//						Class<?> clazz = (Class<?>) types[0];
//						Log.e("", "just is a type:" + clazz.getName());
//					}
				}else
				if(type instanceof WildcardType){
					Log.e("", "is a wildcard type");
				}
				break;
			case MAP:
				break;
			case OBJECT:
				JSONObjectConverionable converionable = new JSONObjectConverionable();
				@SuppressWarnings("unchecked")
				B object = converionable.convert(json.optJSONObject(conversionMapObject.key), (Class<B>) conversionMapObject.getMethod.getReturnType());
				ConversionUtils.invoke(conversionMapObject.method, model, object);
				break;
			default:
				// type = null
				ConversionUtils.invoke(conversionMapObject.method, model, json.opt(conversionMapObject.key));
				break;
			}
		}
	}

	protected static final <B extends BaseModel> void invoke(ConversionMapObject conversionMapObject, B model, Bundle bundle) {
	}

	protected static final <B extends BaseModel> void invoke(ConversionMapObject conversionMapObject, B model, Parcel parcel) {

	}

	protected static final <B extends BaseModel> void invoke(ConversionMapObject conversionMapObject, B model, ContentValues obj) {

	}

	/**
	 * Description(描述): 一般数据类型转化设置<br/>
	 * Conditions(适用条件):<br/>
	 * Execution flow(执行流程):<br/>
	 * Usage(用法):<br/>
	 * Cautions(注意事项):<br/>
	 * 
	 * @param method 方法
	 * @param b 数据模型类
	 * @param obj 数据
	 * @throws ConversionException
	 */
	private static final <B extends BaseModel> void invoke(Method method, B b, Object obj) throws ConversionException {
		try {
			method.invoke(b, obj);
		} catch (IllegalAccessException e) {
			throw new ConversionException(e);
		} catch (IllegalArgumentException e) {
			throw new ConversionException(e);
		} catch (InvocationTargetException e) {
			throw new ConversionException(e);
		}
	}

	/**
	 * Description(描述):<br/>
	 * Conditions(适用条件):<br/>
	 * Execution flow(执行流程):<br/>
	 * Usage(用法):<br/>
	 * Cautions(注意事项):<br/>
	 * 
	 * @param method
	 * @param compontentType
	 * @param b
	 * @param obj
	 * @throws ConversionException
	 */
	private static final <B extends BaseModel> void invoke(Method method, Class<?> compontentType, B b, JSONArray array) throws ConversionException {
		try {
			Object obj = Array.newInstance(compontentType, array.length());
			int length = array.length();
			for (int i = 0; i < length; i++) {
				Array.set(obj, i, array.opt(i));
			}
			method.invoke(b, obj);
		} catch (IllegalAccessException e) {
			throw new ConversionException(e);
		} catch (IllegalArgumentException e) {
			throw new ConversionException(e);
		} catch (InvocationTargetException e) {
			throw new ConversionException(e);
		}
	}

	public static Class<?> getClass(Type type, int i) {
		if (type instanceof ParameterizedType) { // 处理泛型类型
			return getGenericClass((ParameterizedType) type, i);
		} else if (type instanceof TypeVariable) {
			return (Class<?>) getClass(((TypeVariable<?>) type).getBounds()[0], 0); // 处理泛型擦拭对象
		} else if (type instanceof WildcardType) {
			return (Class<?>) getClass(((WildcardType) type).getLowerBounds()[0], 0); // 如果返回的是Object的就是没有限定擦拭类型的。
		} else {// class本身也是type，强制转型
			return (Class<?>) type;
		}
	//  Type t = Type.GetType("System.Int32[]");
	//  object array = new object();
	//  array = t.InvokeMember("Set", BindingFlags.CreateInstance, null, array, new object[] { 10 });
	}

	private static Class<?> getGenericClass(ParameterizedType parameterizedType, int i) {
		Object genericClass = parameterizedType.getActualTypeArguments()[i];
		if (genericClass instanceof ParameterizedType) { // 处理多级泛型
			return (Class<?>) ((ParameterizedType) genericClass).getRawType();
		} else if (genericClass instanceof GenericArrayType) { // 处理数组泛型
			return (Class<?>) ((GenericArrayType) genericClass).getGenericComponentType();
		} else if (genericClass instanceof TypeVariable) { // 处理泛型擦拭对象
			return (Class<?>) getClass(((TypeVariable<?>) genericClass).getBounds()[0], 0);
		} else if (genericClass instanceof WildcardType){
			return (Class<?>) getClass(((WildcardType) genericClass).getLowerBounds()[0], 0); // 如果返回的是Object的就是没有限定擦拭类型的。
		} else {
			return (Class<?>) genericClass;
		}
	}
}
