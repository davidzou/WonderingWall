package com.wonderingwall.data.annotation;

/**
 * ClassName: DATA_TYPE <br/>
 * Function: TODO 数据转换类型. <br/>
 * Reason: TODO 用于特殊类型，数组及对象等的转换. <br/>
 * date: 2014年10月24日 <br/>
 * 
 * @author DavidZou -- spt_genius@hotmail.com
 * @version ConvertName
 */
public enum DATA_TYPE {
	/**
	 * 一般数据类型，Only used for byte, short, int, long, float, double, string, boolean.
	 */
	NORMAL,
	/**
	 * 自定义对象
	 */
	OBJECT,
	/**
	 * 数组（一般数据类型）
	 */
	ARRAY,
	/**
	 * 列表容器
	 */
	LIST,
	/**
	 * 表容器
	 */
	MAP
}