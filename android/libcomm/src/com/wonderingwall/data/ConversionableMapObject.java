/** 
 * Project Name:libcomm 
 * File Name:ConversionMapObject.java 
 * Package Name:com.wonderingwall.data 
 * Date:2014年10月24日下午3:47:20 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */

package com.wonderingwall.data;

import java.lang.ref.SoftReference;
import java.lang.reflect.Method;

import com.wonderingwall.data.annotation.ConversionableDataType;

/**
 * ClassName:ConversionMapObject <br/>
 * Function: TODO 数据转换时的映射数据对象. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2014年10月24日 下午3:47:20 <br/>
 * 
 * @author DavidZou
 * @version
 * @see
 */
public class ConversionableMapObject {
	/**
	 * 键值（索引，对应数据模型的变量名）
	 */
	private String indentity;
	/**
	 * 数据模型变量的数据类型
	 */
	public ConversionableDataType type = ConversionableDataType.NORMAL;
	/**
	 * 方法默认的注释值，用于解析数据
	 */
	private String annotationValue;
	/**
	 * set方法名
	 */
	private String setterName;
	/**
	 * get方法名
	 */
	private String getterName;
	/**
	 * get方法
	 */
	private SoftReference<Method> getter;
	/**
	 * set方法
	 */
	private SoftReference<Method> setter;
	
	public ConversionableMapObject() {
	    super();
    }
	
	public String getIndentity() {
		return indentity;
	}

	public void setIndentity(String indentity) {
		this.indentity = indentity;
	}

	public String getAnnotationValue() {
		return annotationValue;
	}

	public void setAnnotationValue(String annotationValue) {
		this.annotationValue = annotationValue;
	}

	public ConversionableDataType getType() {
		return type;
	}

	public void setType(ConversionableDataType type) {
		this.type = type;
	}

	public String getSetterName() {
		return setterName;
	}

	public void setSetterName(String setterName) {
		this.setterName = setterName;
	}

	public String getGetterName() {
		return getterName;
	}

	public void setGetterName(String getterName) {
		this.getterName = getterName;
	}

	public SoftReference<Method> getGetter() {
		return getter;
	}

	public void setGetter(SoftReference<Method> getter) {
		this.getter = getter;
	}

	public SoftReference<Method> getSetter() {
		return setter;
	}

	public void setSetter(SoftReference<Method> setter) {
		this.setter = setter;
	}

}
