/** 
 * Project Name:libcomm 
 * File Name:ConversionUtils.java 
 * Package Name:com.wonderingwall.data 
 * Date:2014年10月24日下午1:46:08 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */

package com.wonderingwall.data;

import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.regex.Pattern;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.ContentValues;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;

import com.wonderingwall.base.BaseModel;
import com.wonderingwall.data.annotation.ConversionIgnore;
import com.wonderingwall.data.annotation.Conversionable;
import com.wonderingwall.data.annotation.ConversionableDataType;
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
	private static ConversionUtils _instance = new ConversionUtils();
	private ConversionUtils(){}
	public static ConversionUtils getInstance(){
		if(_instance == null){
			_instance = new ConversionUtils();
		}
		return _instance;
	}
	
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
	public String getName(String src) {
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
	 * @fix 如果value被设置为非小写的，带有连字符的状态时，会有错误解析，
	 */
	public String getConvertName(String src) {
		return Pattern.compile("^(get|is|set)").matcher(src).replaceAll("").toLowerCase();
	}

	/**
	 * Description(描述): 方法为get方法<br/>
	 * 
	 * <pre>
	 * <code> Xxx getXxx(){rerurn xxx;}</code>
	 * </pre>
	 * 
	 * Conditions(适用条件): 标准书写格式，get开头的方法，后面单词首字母大写。没有参数，且有返回值。<br/>
	 * Execution flow(执行流程):<br/>
	 * Usage(用法):<br/>
	 * Cautions(注意事项):<br/>
	 * 
	 * @param method
	 * @return if true that the condition is met, otherwise false;
	 */
	public boolean isGetter(Method method) {
		if (Pattern.compile("^(get|is)").matcher(method.getName()).matches())
			return false;
		if (method.getParameterTypes().length != 0)
			return false;
		if (void.class.equals(method.getReturnType()))
			return false;
		return true;
	}

	/**
	 * Description(描述): 判断方法为set方法<br/>
	 * Conditions(适用条件):<br/>
	 * Execution flow(执行流程):<br/>
	 * Usage(用法):<br/>
	 * Cautions(注意事项):<br/>
	 * 
	 * @param method
	 * @return if true that the condition is met, otherwise false;
	 */
	public boolean isSetter(Method method) {
		if (!method.getName().startsWith("set"))
			return false;
		if (method.getParameterTypes().length != 1)
			return false;
		return true;
	}

	/**
	 * Description(描述): 生成List实例对象<br/>
	 * Conditions(适用条件):<br/>
	 * Execution flow(执行流程):<br/>
	 * Usage(用法):<br/>
	 * Cautions(注意事项):<br/>
	 * 
	 * @param clazz
	 * @param compontent List中定义的类型
	 * @return
	 */
	public <T> java.util.List<T> prepareList(Class<?> clazz, Class<T> compontent) throws ConversionException {
		java.util.List<T> list = null;
		if (clazz.equals(java.util.ArrayList.class)) {
			list = new java.util.ArrayList<T>();
		} else if (clazz.equals(java.util.LinkedList.class)) {
			list = new java.util.LinkedList<T>();
		} else if (clazz.equals(java.util.Stack.class)) {
			list = new java.util.Stack<T>();
		} else if (clazz.equals(java.util.Vector.class)) {
			list = new java.util.Vector<T>();
		} else if (clazz.equals(java.util.List.class)) {
			// 接口定义的，默认使用ArrayList
			list = new java.util.ArrayList<T>();
		} else {
			throw new ConversionException("Unsupport clazz type:" + clazz.getName() + ", it maybe isn't a list instance.");
		}
		return list;
	}

	/**
	 * Description(描述): 生成Map实例对象<br/>
	 * Conditions(适用条件):<br/>
	 * Execution flow(执行流程):<br/>
	 * Usage(用法):<br/>
	 * Cautions(注意事项):<br/>
	 * 
	 * @param clazz
	 * @param compontentKey
	 * @param compontentValue
	 * @return
	 * @throws ConversionException
	 */
	public <K, V> java.util.Map<K, V> prepareMap(Class<?> clazz, Class<K> compontentKey, Class<V> compontentValue) throws ConversionException {
		java.util.Map<K, V> map = null;
		if (clazz.equals(java.util.HashMap.class)) {
			map = new java.util.HashMap<K, V>();
		} else if (clazz.equals(java.util.Hashtable.class)) {
			map = new java.util.Hashtable<K, V>();
		} else if (clazz.equals(java.util.LinkedHashMap.class)) {
			map = new java.util.LinkedHashMap<K, V>();
		} else if (clazz.equals(java.util.TreeMap.class)) {
			map = new java.util.TreeMap<K, V>();
		} else if (clazz.equals(java.util.Map.class)) {
			// 接口定义，默认使用HashMap
			map = new java.util.HashMap<K, V>();
		} else {
			throw new ConversionException("Unsupport clazz type:" + clazz.getName() + ", it maybe isn't a map instance.");
		}
		return map;
	}

	/**
	 * Description(描述): 生成Set实例对象<br/>
	 * Conditions(适用条件):<br/>
	 * Execution flow(执行流程):<br/>
	 * Usage(用法):<br/>
	 * Cautions(注意事项):<br/>
	 * 
	 * @param clazz
	 * @param compontent
	 * @return
	 * @throws ConversionException
	 */
	public <T> java.util.Set<T> prepareSet(Class<?> clazz, Class<T> compontent) throws ConversionException {
		java.util.Set<T> set = null;
		if (clazz.equals(java.util.HashSet.class)) {
			set = new java.util.HashSet<T>();
		} else if (clazz.equals(java.util.LinkedHashSet.class)) {
			set = new java.util.LinkedHashSet<T>();
		} else if (clazz.equals(java.util.TreeSet.class)) {
			set = new java.util.TreeSet<T>();
		} else if (clazz.equals(java.util.Set.class)) {
			// 接口定义，默认使用HashMap
			set = new java.util.HashSet<T>();
		} else {
			throw new ConversionException("Unsupport clazz type:" + clazz.getName() + ", it maybe isn't a set instance.");
		}
		return set;
	}
	
	/**
	 * Description(描述): 获取数据类型条件<br/> 
	 * Conditions(适用条件): 用于判断数组类型处理循环数据<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * <table border="1">
	 * 	<tr><th>value</th><th>means</th></tr>
	 * 	<tr><th>-1</th><th>not support, unknown type</th></tr>
	 * 	<tr><th>0</th><th>primitive or string</th></tr>
	 * 	<tr><th>1</th><th>Enum</th></tr>
	 * <tr><th>2</th><th>Custom Object class that implement {@link BaseModel}</th></tr>
	 * </table>
	 * @param compontentType
	 * @return 
	 */ 
	public byte getCondition(Class<?> compontentType){
		byte condition = -1;
		if(compontentType.isPrimitive() || compontentType.equals(String.class)){
			condition = 0;
		}else
		if(compontentType.isEnum()){
			condition = 1;
		}else{
			if(BaseModel.class.isAssignableFrom(compontentType)){
				condition = 2;
			}else{
				condition = -1;
			}
		}
		return condition;
	}
	
	/**
	 * Description(描述): 解析方法<br/>
	 * Conditions(适用条件):解析数据模型和处理映射类的生成，适用所有get/set方法<br/>
	 * Execution flow(执行流程): <br/>
	 * <pre>
	 * 	1. 获取方法名作为映射的身份标识。
	 *  2. 获取注解内容，有责使用注解的值，无则使用方法名为解析的值。
	 * </pre>
	 * Usage(用法):<br/>
	 * Cautions(注意事项):<br/>
	 * 
	 * @param method	方法（反射所得）
	 * @param hash		映射类容器
	 * @return	if hash were null or Annotation ignore be set and method what name is toStirng, return false; otherwise return true;
	 */
	public final boolean parser(Method method, java.util.Map<String, ConversionableMapObject> hash) {
		if (hash == null) {
			throw new ConversionException("Argument hash is null.");
		}
		if (method.getAnnotation(ConversionIgnore.class) != null) {
			// ignore
			return false;
		}
		if (method.getName().equals("toString")) {
			return false;
		}

		Conversionable conversionable = method.getAnnotation(Conversionable.class);
		String indentity = getConvertName(method.getName());
		update(indentity, method, conversionable, hash);
		return true;
	}

	/**
	 * Description(描述):更新映射表<br/>
	 * Conditions(适用条件):<br/>
	 * Execution flow(执行流程):<br/>
	 * Usage(用法):<br/>
	 * Cautions(注意事项):<br/>
	 * 
	 * @param indentity 变量名（小写）
	 * @param method 方法
	 * @param type 数据类型
	 * @param hash 映射表
	 */
	private void update(String indentity, Method method, Conversionable conversionable, java.util.Map<String, ConversionableMapObject> hash) {
		if (hash.containsKey(indentity)) {
			// 更新
			ConversionableMapObject map = (ConversionableMapObject) hash.get(indentity);
			if (isGetter(method)) {
				map.setGetter(new SoftReference<Method>(method));
				map.setGetterName(method.getName());
				if (conversionable != null) {
					if (map.getType() == null)
						map.setType(conversionable.type());
					if (!TextUtils.isEmpty(conversionable.value()))
						map.setAnnotationValue(conversionable.value());
				}
				hash.put(indentity, map);
			} else if (isSetter(method)) {
				map.setSetter(new SoftReference<Method>(method));
				map.setSetterName(method.getName());
				if (conversionable != null) {
					if (map.getType() == null)
						map.setType(conversionable.type());
					if (!TextUtils.isEmpty(conversionable.value()))
						map.setAnnotationValue(conversionable.value());
				}
				hash.put(indentity, map);
			}
		} else {
			// 新建
			ConversionableMapObject map = new ConversionableMapObject();
			map.setIndentity(indentity);
			if (isGetter(method)) {
				map.setGetter(new SoftReference<Method>(method));
				map.setGetterName(method.getName());
				if (conversionable != null) {
					map.setType(conversionable.type());
					map.setAnnotationValue(conversionable.value());
				} else {
					map.setType(ConversionableDataType.NORMAL);
					map.setAnnotationValue(indentity);
				}
				hash.put(indentity, map);
			} else if (isSetter(method)) {
				map.setSetter(new SoftReference<Method>(method));
				map.setSetterName(method.getName());
				if (conversionable != null) {
					map.setType(conversionable.type());
					map.setAnnotationValue(conversionable.value());
				} else {
					map.setType(ConversionableDataType.NORMAL);
					map.setAnnotationValue(indentity);
				}
				hash.put(indentity, map);
			}
		}
	}

	/**
	 * Description(描述): 数据装配为数据模型类<br/>
	 * Conditions(适用条件):<br/>
	 * Execution flow(执行流程):<br/>
	 * Usage(用法):<br/>
	 * Cautions(注意事项):<br/>
	 * 
	 * @param conversionMapObject 数据映射对象
	 * @param model 数据模型实体
	 * @param invokeObj 被转化的数据对象实体
	 * @throws ConversionException
	 */
	public final <B extends BaseModel, T> void invoke(ConversionableMapObject conversionMapObject, B model, T invokeObj) throws ConversionException {
		if (!invalid(conversionMapObject)) {
			throw new ConversionException("Invalid mapping data error!");
		}
		if (invokeObj instanceof JSONObject) {
			invoke(conversionMapObject, model, (JSONObject) invokeObj);
		} else if (invokeObj instanceof Bundle) {
			invoke(conversionMapObject, model, (Bundle) invokeObj);
		} else if (invokeObj instanceof Parcel) {
			invoke(conversionMapObject, model, (Parcel) invokeObj);
		} else if (invokeObj instanceof ContentValues) {
			invoke(conversionMapObject, model, (ContentValues) invokeObj);
		} else {
			throw new ConversionException("It what is unknow type can't invoke ");
		}
	}

    @SuppressWarnings("unchecked")
    protected final <B extends BaseModel, T extends Enum<T>> void invoke(ConversionableMapObject conversionableMapObject, B model, JSONObject json) {
		// 如果注释为空则使用标识符作为数据索引值。即变量名全小写。
		String key = TextUtils.isEmpty(conversionableMapObject.getAnnotationValue()) ? conversionableMapObject.getIndentity() : conversionableMapObject.getAnnotationValue();
		
		Method setter = conversionableMapObject.getSetter().get();
		if(setter == null){
			// FIXME renew it
			try {
	            setter = model.getClass().getDeclaredMethod(conversionableMapObject.getSetterName(), (Class<?>[]) null);
            } catch (NoSuchMethodException e) {
	            e.printStackTrace();
            }
			return;
		}
		if (json.has(key)) {
			switch (conversionableMapObject.type) {
			case NORMAL:{
				// normal
				ConversionUtils.this.invoke(setter, model, json.opt(key));
				break;
			}
			case ENUM:{
				Method method = conversionableMapObject.getGetter().get();
				if(method == null){
					// FIXME renew it
					return;
				}
				T value = Enum.valueOf((Class<T>) method.getReturnType(), json.optString(key));
				ConversionUtils.this.invoke(setter, model, value);
				break;
			}
			case ARRAY:{
				// normal array & it's should was a array.
				Method method = conversionableMapObject.getGetter().get();
				if(method == null){
					// TODO renew it
					return;
				}
				Class<?> compontentClass = method.getReturnType().getComponentType();
				if(compontentClass == null){
					// that is list or other not array
					throw new ConversionException("Invalid error! must be a array class -- method:" + method.getName() + "|type:" + method.getReturnType());
				}
				if(compontentClass.equals(Object.class)){
					// 特殊处理，如果定义的数据类型为Object[]时，将JSON数组数据解析为String
					ConversionUtils.this.invoke(setter, String.class, model, json.optJSONArray(key), (byte) 0);
					break;
				}
				ConversionUtils.this.invoke(setter, compontentClass, model, json.optJSONArray(key), getCondition(compontentClass));
				break;
			}
			case LIST:{
				Log.e("convert", "conversionMapObject:" + conversionableMapObject.toString());
				Method method = conversionableMapObject.getGetter().get();
				if(method == null){
					// FIXME renew it
					return;
				}
				Type type = method.getGenericReturnType();

				Log.e("", "return type:" + method.getReturnType());
				if (type instanceof ParameterizedType) {
					int length = ((ParameterizedType) type).getActualTypeArguments().length;
					switch (length) {
					case 0:
						// 非泛型？
						Log.e("", "0");
						break;
					case 1:
						// List
						Log.e("",
						        "1 list" + ConversionUtils.this.getClass(((ParameterizedType) type).getRawType(), 0) + " | "
						                + ConversionUtils.this.getClass(((ParameterizedType) type).getActualTypeArguments()[0], 0));
						java.util.List<?> l = prepareList(ConversionUtils.this.getClass(((ParameterizedType) type).getRawType(), 0),
						        ConversionUtils.this.getClass(((ParameterizedType) type).getActualTypeArguments()[0], 0));
						ConversionUtils.this.invoke(setter, l, ConversionUtils.this.getClass(((ParameterizedType) type).getActualTypeArguments()[0], 0), model,
						        json.optJSONArray(key));
						break;
					case 2:
						// TODO Map
						Log.e("",
						        "2 map" + ConversionUtils.this.getClass(((ParameterizedType) type).getRawType(), 0) + " | "
						                + ConversionUtils.this.getClass(((ParameterizedType) type).getActualTypeArguments()[0], 0) + " | " + " | "
						                + ConversionUtils.this.getClass(((ParameterizedType) type).getActualTypeArguments()[1], 0));
						break;
					default:
						break;
					}
				} else if (type instanceof WildcardType) {
					Log.e("", "is a wildcard type");
				}
				break;
			}
			case MAP:
				break;
			case OBJECT:{
				Method method = conversionableMapObject.getGetter().get();
				if(method == null){
					// FIXME renew it
					return;
				}
				Class<?> returnType = method.getReturnType();
				if(returnType != null && BaseModel.class.isAssignableFrom(returnType)){
					JSONObjectConverionable converionable = new JSONObjectConverionable();
					B object = converionable.convert(json.optJSONObject(key), (Class<B>) returnType);
					ConversionUtils.this.invoke(conversionableMapObject.getSetter().get(), model, object);
				}else{
					throw new ConversionException( "Not support unimplements BaseModel class.  -- method:" + conversionableMapObject.getGetterName() + " | type:" + (returnType == null ? "null" : returnType.getName()) );
				}
				break;
			}
			default:
				// type = null
				ConversionUtils.this.invoke(conversionableMapObject.getSetter().get(), model, json.opt(key));
				break;
			}
		}
	}

	protected final <B extends BaseModel> void invoke(ConversionableMapObject conversionMapObject, B model, Bundle bundle) {

	}

	protected final <B extends BaseModel> void invoke(ConversionableMapObject conversionMapObject, B model, Parcel parcel) {

	}

	protected final <B extends BaseModel> void invoke(ConversionableMapObject conversionMapObject, B model, ContentValues obj) {

	}

	/**
	 * Description(描述): 一般数据类型转化设置<br/>
	 * Conditions(适用条件):<br/>
	 * Execution flow(执行流程):<br/>
	 * Usage(用法):<br/>
	 * Cautions(注意事项):<br/>
	 * 
	 * @param method 方法
	 * @param model 数据模型类
	 * @param obj 数据
	 * @throws ConversionException
	 */
	private final <B extends BaseModel> void invoke(Method method, B model, Object obj) throws ConversionException {
		try {
			method.invoke(model, obj);
		} catch (IllegalAccessException e) {
			throw new ConversionException(e);
		} catch (IllegalArgumentException e) {
			throw new ConversionException(e);
		} catch (InvocationTargetException e) {
			throw new ConversionException(e);
		} catch (Exception e) {
			throw new ConversionException(e);
		}
	}

	/**
	 * Description(描述): 将数据转化为数组值后执行设置方法<br/>
	 * Conditions(适用条件):转化JSON数据的数组数据<br/>
	 * Execution flow(执行流程):<br/>
	 * Usage(用法):<br/>
	 * Cautions(注意事项): 只适用于数组数据的转化<br/>
	 * 
	 * @param method 			方法
	 * @param compontentType 	数组数据类型, 支持BaseModel, Primivite, String, Enum.
	 * @param model 			数据模型
	 * @param array 			数据（数组对象）
	 * @param condition			类型条件<br> 
	 * <table border="1">
	 * 	<tr><th>value</th><th>means</th></tr>
	 * 	<tr><th>-1</th><th>not support, unknown type</th></tr>
	 * 	<tr><th>0</th><th>primitive or string</th></tr>
	 * 	<tr><th>1</th><th>Enum</th></tr>
	 * <tr><th>2</th><th>Custom Object class that implement {@link BaseModel}</th></tr>
	 * </table>
	 * @throws ConversionException
	 */
	@SuppressWarnings("unchecked")
    private final <B extends BaseModel, T extends Enum<T>> void invoke(Method method, Class<?> compontentType, B model, JSONArray array, byte condition) throws ConversionException {
		if(condition == -1){
			throw new ConversionException("IllegalArgument exception, compontentType is not support!!! --- " + compontentType.getName());
		}
		JSONObjectConverionable converionable = null;
		Object arrayObj = null;
		try {
			arrayObj = Array.newInstance(compontentType, array.length());
			int length = array.length();
			for (int i = 0; i < length; i++) {
				switch(condition){
				case 0:
					Array.set(arrayObj, i, array.opt(i));
					break;
				case 1:
					T value = Enum.valueOf((Class<T>) compontentType, array.optString(i));
					Array.set(arrayObj, i, value);
					break;
				case 2:
					if(converionable == null) converionable = new JSONObjectConverionable();
					B object = converionable.convert(array.optJSONObject(i), (Class<B>) compontentType);
					Array.set(arrayObj, i, object);
					break;
				}
			}
			method.invoke(model, arrayObj);
		} catch (IllegalAccessException e) {
			throw new ConversionException(e);
		} catch (IllegalArgumentException e) {
			throw new ConversionException(e);
		} catch (InvocationTargetException e) {
			throw new ConversionException(e);
		} catch (Exception e) {
			throw new ConversionException(e);
		} finally {
			if(converionable != null)
				converionable = null;
			if(arrayObj != null)
				arrayObj = null;
		}
	}

	/**
	 * Description(描述):<br/>
	 * Conditions(适用条件):<br/>
	 * Execution flow(执行流程):<br/>
	 * Usage(用法):<br/>
	 * Cautions(注意事项):<br/>
	 * 
	 * @param method 方法
	 * @param list 容器
	 * @param compontentType 容器中的数据类型
	 * @param model 数据模型
	 * @param array 数据
	 * @throws ConversionException
	 * @FIXME if compontentType is a Object data.
	 */
	@SuppressWarnings("unchecked")
	private final <B extends BaseModel, T> void invoke(Method method, java.util.List<T> list, Class<?> compontentType, B model, JSONArray array) throws ConversionException {
		// FIXME list componentType maybe enum, string, object etc.
		if (compontentType.isArray()) {
			// TODO
			Log.e("", "not a primitive type");
		}
		if (compontentType.isMemberClass()) {
			Log.e("", "not a member type");
		}
		if (compontentType.isEnum()) {
			Log.e("", "not a enum type");
		}
		if (compontentType.isAssignableFrom(BaseModel.class)) {
			Log.e("", "not a base type");
		}
		try {
			int length = array.length();
			for (int i = 0; i < length; i++) {
				list.add((T) array.opt(i));
			}
			method.invoke(model, list);
		} catch (IllegalAccessException e) {
			throw new ConversionException(e);
		} catch (IllegalArgumentException e) {
			throw new ConversionException(e);
		} catch (InvocationTargetException e) {
			throw new ConversionException(e);
		} catch (Exception e) {
			throw new ConversionException(e);
		}
	}

	/**
	 * Description(描述): 装配数据为制定数据模型<br/>
	 * Conditions(适用条件):<br/>
	 * Execution flow(执行流程):<br/>
	 * Usage(用法):<br/>
	 * Cautions(注意事项):<br/>
	 * 
	 * @param conversionableMapObject 数据映射对象
	 * @param model 模型数据
	 * @param assembleObj 被装配数据
	 * @return
	 */
	public final <B extends BaseModel, T> T assemble(ConversionableMapObject conversionableMapObject, B model, T assembleObj) {
		if (!invalid(conversionableMapObject)) {
			throw new ConversionException("Invalid mapping data error!");
		}
		if (assembleObj instanceof JSONObject) {
			assemble(conversionableMapObject, model, (JSONObject) assembleObj);
		} else if (assembleObj instanceof Bundle) {
			assemble(conversionableMapObject, model, (Bundle) assembleObj);
		} else if (assembleObj instanceof Parcel) {
			assemble(conversionableMapObject, model, (Parcel) assembleObj);
		} else if (assembleObj instanceof ContentValues) {
			assemble(conversionableMapObject, model, (ContentValues) assembleObj);
		} else {
			throw new ConversionException("It what is unknow type can't invoke ");
		}
		return assembleObj;
	}

	/**
	 * Description(描述): 装配数据模型数据为JSON对象数据<br/> 
	 * Conditions(适用条件): 模型数据与JSON数据的转换<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @param conversionableMapObject	映射对象
	 * @param model						数据对象
	 * @param assembleObj				被转化的数据结构对象
	 * @return
	 * @throws ConversionException 
	 */ 
	@SuppressWarnings("unchecked")
    protected final <B extends BaseModel, T extends Enum<T>> JSONObject assemble(ConversionableMapObject conversionableMapObject, B model, JSONObject assembleObj) throws ConversionException{
		// 如果注释为空则使用标识符作为数据索引值。即变量名全小写。
		String indentity = TextUtils.isEmpty(conversionableMapObject.getAnnotationValue()) ? conversionableMapObject.getIndentity() : conversionableMapObject.getAnnotationValue();
		
		Method method = conversionableMapObject.getGetter().get();
		if(method == null){
			// FIXME renew it
			throw new ConversionException("IllegalArgument method is null!!!");
		}
		switch(conversionableMapObject.type){
		case NORMAL:{
			// normal -- string, primitive
			return ConversionUtils.this.assemble(indentity, method, model, assembleObj);
		}
		case ENUM:{
			// enum
			if(method.getReturnType().isEnum()){
				try {
	                T value = (T) method.invoke(model);
	                return assembleObj.putOpt(indentity, value);
                } catch (IllegalAccessException e) {
	                e.printStackTrace();
                } catch (IllegalArgumentException e) {
	                e.printStackTrace();
                } catch (InvocationTargetException e) {
	                e.printStackTrace();
                } catch (JSONException e) {
	                e.printStackTrace();
                }
			}else{
				throw new ConversionException();
			}
		}
		case ARRAY:{
			// normal array & it's should was a array.
			Class<?> compontentClass = method.getReturnType().getComponentType();
			if(compontentClass == null){
				// that is list or other not array
				throw new ConversionException("Invalid error! must be a array class -- method:" + method.getName() + "|type:" + method.getReturnType());
			}
			if(compontentClass.equals(Object.class)){
				// 特殊处理，如果定义的数据类型为Object[]时，将JSON数组数据解析为String
				return ConversionUtils.this.assemble(indentity, method, compontentClass, model, assembleObj, (byte) 0);
			}
			return ConversionUtils.this.assemble(indentity, method, compontentClass, model, assembleObj, getCondition(compontentClass));
		}
		case LIST:
			break;
		case MAP:
			break;
		case OBJECT:
			Class<?> returnType = conversionableMapObject.getGetter().get().getReturnType();
			if(returnType != null && BaseModel.class.isAssignableFrom(returnType)){
				B arrayObj = null;
	            try {
		            arrayObj = (B) method.invoke(model);
					JSONObjectConverionable converionable = new JSONObjectConverionable();
					return converionable.reconvert(arrayObj);
	            } catch (IllegalAccessException e) {
		            e.printStackTrace();
	            } catch (IllegalArgumentException e) {
		            e.printStackTrace();
	            } catch (InvocationTargetException e) {
		            e.printStackTrace();
	            } finally {
	            	if(arrayObj != null) arrayObj = null;
	            }
			}else{
				throw new ConversionException( "Not support unimplements BaseModel class.  -- method:" + conversionableMapObject.getGetterName() + " | type:" + (returnType == null ? "null" : returnType.getName()) );
			}
			
		default:
			break;
		}
		return assembleObj;
	}

	protected final <B extends BaseModel> Bundle assemble(ConversionableMapObject conversionableMapObject, B model, Bundle assembleObj) {
		return null;
	}

	protected final <B extends BaseModel> Parcel assemble(ConversionableMapObject conversionableMapObject, B model, Parcel assembleObj) {
		return null;
	}

	protected final <B extends BaseModel> ContentValues assemble(ConversionableMapObject conversionableMapObject, B model, ContentValues assembleObj) {
		return null;
	}

	/**
	 * Description(描述): 一般类型装配<br/> 
	 * Conditions(适用条件):<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @param indentity
	 * @param method
	 * @param model
	 * @param assembleObj
	 * @return 
	 */ 
	private final <B extends BaseModel> JSONObject assemble(String indentity, Method method, B model, JSONObject assembleObj){
		try {
            return assembleObj.putOpt(indentity, method.invoke(model));
        } catch (IllegalAccessException e) {
        	throw new ConversionException(e);
        } catch (IllegalArgumentException e) {
        	throw new ConversionException(e);
        } catch (InvocationTargetException e) {
        	throw new ConversionException(e);
        } catch (JSONException e) {
        	throw new ConversionException(e);
        }
	}
	
	/**
	 * Description(描述):<br/> 
	 * Conditions(适用条件):<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * <table border="1">
	 * 	<tr><th>value</th><th>means</th></tr>
	 * 	<tr><th>-1</th><th>not support, unknown type</th></tr>
	 * 	<tr><th>0</th><th>primitive or string</th></tr>
	 * 	<tr><th>1</th><th>Enum</th></tr>
	 * <tr><th>2</th><th>Custom Object class that implement {@link BaseModel}</th></tr>
	 * </table>
	 * @param indentity
	 * @param method
	 * @param compontentClass
	 * @param model
	 * @param assembleObje
	 * @param condition
	 * @return 
	 */ 
	private final <B extends BaseModel> JSONObject assemble(String indentity, Method method, Class<?> compontentClass, B model, JSONObject assembleObj, byte condition) throws ConversionException{
		if(condition == -1){
			throw new ConversionException("IllegalArgument exception, compontentType is not support!!! --- " + compontentClass.getName());
		}
		try {
	        return assembleObj.put(indentity, assembleJSONArray(method, model, condition));
        } catch (JSONException e) {
	        throw new ConversionException(e);
        }
	}
	
	@SuppressWarnings("unchecked")
    private final <B extends BaseModel, T extends Enum<T>> JSONArray assembleJSONArray(Method method, B model, byte condition) {
		JSONArray array = new JSONArray();
		Object arrayObj = null;
		JSONObjectConverionable converionable = null;
		try {
			arrayObj = method.invoke(model);
			int length = Array.getLength(arrayObj);
			for (int i = 0; i < length; i++) {
				switch(condition){
				case 0:
					array.put(Array.get(arrayObj, i));
					break;
				case 1:
					T t = (T) Array.get(arrayObj, i);
					array.put(t.name());
					break;
				case 2:
					if(converionable == null) converionable = new JSONObjectConverionable();
					B componentClass = (B) Array.get(arrayObj, i);
					JSONObject json = converionable.reconvert(componentClass);
					array.put(json);
					break;
				}
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} finally{
			if(arrayObj != null) arrayObj = null;
		}
		return array;
	}

	/**
	 * Description(描述): 获取泛型类型<br/>
	 * Conditions(适用条件):<br/>
	 * Execution flow(执行流程):<br/>
	 * Usage(用法):<br/>
	 * Cautions(注意事项):<br/>
	 * 
	 * @param type
	 * @param i
	 * @return
	 * @throws ConversionException
	 */
	public final Class<?> getClass(Type type, int i) throws ConversionException {
		if (type instanceof ParameterizedType) {
			// 处理泛型类型
			return getGenericClass((ParameterizedType) type, i);
		} else if (type instanceof TypeVariable) {
			// 处理泛型擦拭对象
			return (Class<?>) getClass(((TypeVariable<?>) type).getBounds()[0], 0);
		} else if (type instanceof WildcardType) {
			int upperBoundsSize = ((WildcardType) type).getUpperBounds().length;
			int lowerBountsSize = ((WildcardType) type).getLowerBounds().length;

			if (upperBoundsSize > 0 && lowerBountsSize > 0) {
				Log.e("", "" + upperBoundsSize + "|" + lowerBountsSize + "|" + ((WildcardType) type).getUpperBounds()[0] + " - " + ((WildcardType) type).getLowerBounds()[0]);
//				throw new ConversionException("Invalid error.");
//				return (Class<?>) getClass(((WildcardType) type).getLowerBounds()[0], 0) instanceof Object ? (Class<?>) getClass(((WildcardType) type).getUpperBounds()[0], 0) : (Class<?>) getClass(((WildcardType) type).getLowerBounds()[0], 0) ;
				// A<? super String> this used LowerBounds
				return (Class<?>) getClass(((WildcardType) type).getLowerBounds()[0], 0);
			}
			if (upperBoundsSize > 0) {
				// A<? extends T> this T is UpperBounds
				// A<? super String> this used LowerBounds
				return (Class<?>) getClass(((WildcardType) type).getUpperBounds()[0], 0);
			}
			if (lowerBountsSize > 0) {
				return (Class<?>) getClass(((WildcardType) type).getLowerBounds()[0], 0);
			}
			// A<?> this method not set bound limit.
			// 如果返回的是Object的就是没有限定擦拭类型的。
			return Object.class;
		} else {// class本身也是type，强制转型
			return (Class<?>) type;
		}
	}

	/**
	 * Description(描述): 获得封装对象中的数据类型类<br/>
	 * Conditions(适用条件):<br/>
	 * Execution flow(执行流程):<br/>
	 * Usage(用法):<br/>
	 * Cautions(注意事项):<br/>
	 * 
	 * @param field 变量
	 * @param i
	 * @return
	 */
	public Class<?> getClass(java.lang.reflect.Field field, int i) {
		if (field.getType().isPrimitive()) {
			// 基本类
			return ((Class<?>) field.getType());
		} else if (field.getType().isArray()) {
			// 数组
			return ((Class<?>) field.getType());
		} else {
			if (field.getGenericType() instanceof ParameterizedType) {
				// List
				if (((ParameterizedType) field.getGenericType()).getActualTypeArguments().length > 1) {
					Log.e("", field.getName() + "-- primitive: map" + ", name:" + field.getType().getName());
				} else {
					Log.e("", field.getName() + "-- primitive: List" + ", name:" + field.getType().getName());
				}
			} else if (field.getGenericType() instanceof WildcardType) {
				Log.e("", field.getName() + "-- primitive: wild" + ", name:" + field.getType().getName());
			} else {
				// Object String
				if (field.getType() == String.class) {
					Log.e("", field.getName() + "-- primitive: string" + ", name:" + field.getType().getName());
				} else {
					// Object
					Log.e("", field.getName() + "-- primitive: object" + ", name:" + field.getType().getName());
				}
			}
		}
		return null;
	}

	public Class<?> getClass(java.lang.reflect.Method method, int i) {
		return null;
	}

	private Class<?> getGenericClass(ParameterizedType parameterizedType, int i) {
		Object genericClass = parameterizedType.getActualTypeArguments()[i];
		if (genericClass instanceof ParameterizedType) { // 处理多级泛型
			return (Class<?>) ((ParameterizedType) genericClass).getRawType();
		} else if (genericClass instanceof GenericArrayType) { // 处理数组泛型
			return (Class<?>) ((GenericArrayType) genericClass).getGenericComponentType();
		} else if (genericClass instanceof TypeVariable) { // 处理泛型擦拭对象
			return (Class<?>) getClass(((TypeVariable<?>) genericClass).getBounds()[0], 0);
//		} else if (genericClass instanceof WildcardType){
//			return (Class<?>) getClass(((WildcardType) genericClass).getLowerBounds()[0], 0); // 如果返回的是Object的就是没有限定擦拭类型的。
		} else {
			return (Class<?>) genericClass;
		}
	}

	/**
	 * Description(描述):验证映射数据对象的合法性<br/> 
	 * Conditions(适用条件): 映射成功的对象必须包含get和set方法。<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @param conversionableMapObject
	 * @return 
	 */ 
	public boolean invalid(ConversionableMapObject conversionableMapObject) {
		if (!TextUtils.isEmpty(conversionableMapObject.getGetterName()) && !TextUtils.isEmpty(conversionableMapObject.getSetterName())) {
			return true;
		}
//		Log.e("", "" + conversionableMapObject.getIndentity());
		return false;
	}
}
