/** 
 * Project Name:WonderingWallSampleTest 
 * File Name:User5.java 
 * Package Name:com.wonderingwall.WonderingWallSample.model 
 * Date:2014年11月6日上午10:24:24 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */

package com.wonderingwall.WonderingWallSample.model;

import com.google.gson.annotations.SerializedName;
import com.wonderingwall.base.BaseModel;
import com.wonderingwall.data.annotation.Conversionable;
import com.wonderingwall.data.annotation.ConversionableDataType;
import com.wonderingwall.util.StringUtils;

/**
 * ClassName:User5 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2014年11月6日 上午10:24:24 <br/>
 * 
 * @author DavidZou
 * @version
 * @see
 */
public class User5 implements BaseModel {
	@SerializedName("int_array")
	private int[] intArray;
	@SerializedName("user1")
	private User1[] user1;
	@SerializedName("enum")
	private ConversionableDataType[] types;
	@SerializedName("clazz")
	private Object[] a;
	@SerializedName("data_type")
	private ConversionableDataType dataType;
	
	public User5() {
	}

	@Conversionable(value = "int_array", type = ConversionableDataType.ARRAY)
	public int[] getIntArray() {
		return intArray;
	}

	public void setIntArray(int[] intArray) {
		this.intArray = intArray;
	}

	@Conversionable(value = "user1", type = ConversionableDataType.ARRAY)
	public User1[] getUser1() {
		return user1;
	}

	public void setUser1(User1[] user1) {
		this.user1 = user1;
	}

	@Conversionable(value = "enum", type = ConversionableDataType.ARRAY)
	public ConversionableDataType[] getTypes() {
		return types;
	}

	@Conversionable(value="data_type", type = ConversionableDataType.ENUM)
	public ConversionableDataType getDataType() {
		return dataType;
	}

	public void setDataType(ConversionableDataType dataType) {
		this.dataType = dataType;
	}

	@Conversionable(value = "clazz", type = ConversionableDataType.ARRAY)
	public Object[] getA() {
		return a;
	}

	public void setA(Object[] a) {
		this.a = a;
	}

	public void setTypes(ConversionableDataType[] types) {
		this.types = types;
	}

	public String toString() {
		return "intArray:{" + StringUtils.assemble(intArray) + "}" + " user:{" + StringUtils.assemble(user1) + "}" + " enum:{" + StringUtils.assemble(types) + "}" + " a:{" + StringUtils.assemble(a) + "}" + " data_type:" + dataType.name() + "}";
	}

}
