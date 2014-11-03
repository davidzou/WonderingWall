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
import java.util.HashMap;
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
	 * @fix 如果value被设置为非小写的，带有连字符的状态时，会有错误解析，
	 */
	public static String getConvertName(String src) {
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
	public static boolean isGetter(Method method) {
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
	public static boolean isSetter(Method method) {
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
	public static <T> java.util.List<T> prepareList(Class<?> clazz, Class<T> compontent) throws ConversionException {
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
	public static <K, V> java.util.Map<K, V> prepareMap(Class<?> clazz, Class<K> compontentKey, Class<V> compontentValue) throws ConversionException {
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
	public static <T> java.util.Set<T> prepareSet(Class<?> clazz, Class<T> compontent) throws ConversionException {
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
	public static final boolean parser(Method method, HashMap<String, ConversionableMapObject> hash) {
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
	 * Description(描述):<br/>
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
	private static void update(String indentity, Method method, Conversionable conversionable, HashMap<String, ConversionableMapObject> hash) {
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
	public static final <B extends BaseModel, T> void invoke(ConversionableMapObject conversionMapObject, B model, T invokeObj) throws ConversionException {
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

	protected static final <B extends BaseModel> void invoke(ConversionableMapObject conversionMapObject, B model, JSONObject json) {
		// 如果注释为空则使用标识符作为数据索引值。即变量名全小写。
		String key = TextUtils.isEmpty(conversionMapObject.getAnnotationValue()) ? conversionMapObject.getIndentity() : conversionMapObject.getAnnotationValue();
		if (json.has(key)) {
			switch (conversionMapObject.type) {
			case NORMAL:
				// normal
				ConversionUtils.invoke(conversionMapObject.getSetter().get(), model, json.opt(key));
				break;
			case ARRAY:
				// normal array
				ConversionUtils.invoke(conversionMapObject.getSetter().get(), conversionMapObject.getGetter().get().getReturnType().getComponentType(), model, json.optJSONArray(key));
				break;
			case ARRAY_OBJECT:
				// special array
				break;
			case LIST:
				Log.e("convert", "conversionMapObject:" + conversionMapObject.toString());
				Type type = conversionMapObject.getGetter().get().getGenericReturnType();

				Log.e("", "return type:" + conversionMapObject.getGetter().get().getReturnType());
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
						        "1 list" + ConversionUtils.getClass(((ParameterizedType) type).getRawType(), 0) + " | "
						                + ConversionUtils.getClass(((ParameterizedType) type).getActualTypeArguments()[0], 0));
						java.util.List<?> l = prepareList(ConversionUtils.getClass(((ParameterizedType) type).getRawType(), 0),
						        ConversionUtils.getClass(((ParameterizedType) type).getActualTypeArguments()[0], 0));
						ConversionUtils.invoke(conversionMapObject.getSetter().get(), l, ConversionUtils.getClass(((ParameterizedType) type).getActualTypeArguments()[0], 0), model,
						        json.optJSONArray(key));
						break;
					case 2:
						// TODO Map
						Log.e("",
						        "2 map" + ConversionUtils.getClass(((ParameterizedType) type).getRawType(), 0) + " | "
						                + ConversionUtils.getClass(((ParameterizedType) type).getActualTypeArguments()[0], 0) + " | " + " | "
						                + ConversionUtils.getClass(((ParameterizedType) type).getActualTypeArguments()[1], 0));
						break;
					default:
						break;
					}
				} else if (type instanceof WildcardType) {
					Log.e("", "is a wildcard type");
				}
				break;
			case MAP:
				break;
			case OBJECT:
				JSONObjectConverionable converionable = new JSONObjectConverionable();
				@SuppressWarnings("unchecked")
				B object = converionable.convert(json.optJSONObject(key), (Class<B>) conversionMapObject.getGetter().get().getReturnType());
				ConversionUtils.invoke(conversionMapObject.getSetter().get(), model, object);
				break;
			default:
				// type = null
				ConversionUtils.invoke(conversionMapObject.getSetter().get(), model, json.opt(key));
				break;
			}
		}
	}

	protected static final <B extends BaseModel> void invoke(ConversionableMapObject conversionMapObject, B model, Bundle bundle) {

	}

	protected static final <B extends BaseModel> void invoke(ConversionableMapObject conversionMapObject, B model, Parcel parcel) {

	}

	protected static final <B extends BaseModel> void invoke(ConversionableMapObject conversionMapObject, B model, ContentValues obj) {

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
	private static final <B extends BaseModel> void invoke(Method method, B model, Object obj) throws ConversionException {
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
	 * Cautions(注意事项):<br/>
	 * 
	 * @param method 方法
	 * @param compontentType 数组数据类型
	 * @param model 数据模型
	 * @param array 数据
	 * @throws ConversionException
	 */
	private static final <B extends BaseModel> void invoke(Method method, Class<?> compontentType, B model, JSONArray array) throws ConversionException {
		try {
			Object obj = Array.newInstance(compontentType, array.length());
			int length = array.length();
			for (int i = 0; i < length; i++) {
				Array.set(obj, i, array.opt(i));
			}
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
	private static final <B extends BaseModel, T> void invoke(Method method, java.util.List<T> list, Class<?> compontentType, B model, JSONArray array) throws ConversionException {
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
	public static final <B extends BaseModel, T> T assemble(ConversionableMapObject conversionableMapObject, B model, T assembleObj) {
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

	protected static final <B extends BaseModel> JSONObject assemble(ConversionableMapObject conversionableMapObject, B model, JSONObject assembleObj) {
		String indentity = TextUtils.isEmpty(conversionableMapObject.getAnnotationValue()) ? conversionableMapObject.getIndentity() : conversionableMapObject.getAnnotationValue();
		Type type = conversionableMapObject.getGetter().get().getGenericReturnType();
		Class<?> clazz = conversionableMapObject.getGetter().get().getReturnType();
		if (type instanceof ParameterizedType) {
			// list
		} else {
			if (clazz.isPrimitive()) {
				try {
					assembleObj.putOpt(indentity, conversionableMapObject.getGetter().get().invoke(model));
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				} catch (JSONException e) {
	                e.printStackTrace();
                }
			} else if (clazz.isArray()) {
				try {
	                assembleObj.putOpt(indentity, assembleJSONArray(conversionableMapObject, model));
                } catch (JSONException e) {
	                e.printStackTrace();
                }
			} else if (clazz.equals(String.class)) {
				try {
					assembleObj.putOpt(indentity, conversionableMapObject.getGetter().get().invoke(model));
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				} catch (JSONException e) {
	                e.printStackTrace();
                }
			}
		}
		return assembleObj;
	}

	protected static final <B extends BaseModel> Bundle assemble(ConversionableMapObject conversionableMapObject, B model, Bundle assembleObj) {
		return null;
	}

	protected static final <B extends BaseModel> Parcel assemble(ConversionableMapObject conversionableMapObject, B model, Parcel assembleObj) {
		return null;
	}

	protected static final <B extends BaseModel> ContentValues assemble(ConversionableMapObject conversionableMapObject, B model, ContentValues assembleObj) {
		return null;
	}

	private static final <B extends BaseModel> JSONArray assembleJSONArray(ConversionableMapObject conversionableMapObject, B model) {
		JSONArray array = new JSONArray();
		if (conversionableMapObject.getGetter().get().getReturnType().isArray()) {
			Object obj;
			try {
				obj = conversionableMapObject.getGetter().get().invoke(model);
				int length = Array.getLength(obj);
				for (int i = 0; i < length; i++) {
					array.put(Array.get(obj, i));
				}
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
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
	public static final Class<?> getClass(Type type, int i) throws ConversionException {
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
	public static Class<?> getClass(java.lang.reflect.Field field, int i) {
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

	public static Class<?> getClass(java.lang.reflect.Method method, int i) {
		return null;
	}

	private static Class<?> getGenericClass(ParameterizedType parameterizedType, int i) {
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

	public static boolean invalid(ConversionableMapObject conversionableMapObject) {
		if (!TextUtils.isEmpty(conversionableMapObject.getGetterName()) && !TextUtils.isEmpty(conversionableMapObject.getAnnotationValue())) {
			return true;
		}
		Log.e("", "" + conversionableMapObject.getIndentity());
		return false;
	}
}
