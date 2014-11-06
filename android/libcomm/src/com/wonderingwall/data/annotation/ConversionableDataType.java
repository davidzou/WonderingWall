package com.wonderingwall.data.annotation;

/**
 * ClassName: DATA_TYPE <br/>
 * Function: TODO 数据转换类型. <br/>
 * Reason: TODO 用于特殊类型，数组及对象等的转换. <br/>
 * date: 2014年10月24日 <br/>
 * 
 * <pre>
 *  <em>支持的数据类型</em>
 *  <em>注：Primitive（标准类型）包含 -- byte, short, int, float, double, boolean</em>
 *  <table border="1">
 *  	<tr>
 *  		<th>Data（数据类型）</th>
 *  		<th>DataType（使用的类型标识）</th>
 *  		<th>Supportable（是否支持）</th>
 *  		<th>Remark（备注）</th>
 *  	</tr>
 *  	<tr>
 *  		<th>Primitive（标准）</th>
 *  		<th>4</th>
 *  	</tr>
 *  	<tr>
 *  		<th>String（字符串）</th>
 *  		<th>4</th>
 *  	</tr>
 *  	<tr>
 *  		<th>Enum（枚举）</th>
 *  		<th>4</th>
 *  	</tr>
 *  	<tr>
 *  		<th>Array（数组）</th>
 *  		<th>4</th>
 *  	</tr>
 *  	<tr>
 *  		<th>List（）</th>
 *  		<th>4</th>
 *  	</tr>  
 *  	<tr>
 *  		<th>Queue</th>
 *  		<th>4</th>
 *  	</tr>  
 *  	<tr>
 *  		<th>Deque</th>
 *  		<th>4</th>
 *  	</tr>  
 *  	<tr>
 *  		<th>Map</th>
 *  		<th>4</th>
 *  	</tr>  
 *  	<tr>
 *  		<th>BaseModel</th>
 *  		<th>4</th>
 *  	</tr>
 *  </table>
 * </pre>
 * 
 * @author DavidZou -- spt_genius@hotmail.com
 * @version ConvertName
 */
public enum ConversionableDataType {
	/**
	 * 一般数据类型，Only used for byte, short, int, long, float, double, string,
	 * boolean.<br>
	 * 
	 * @support All
	 */
	NORMAL,

	/**
	 * 枚举类型
	 */

	ENUM,

	/**
	 * 自定义对象
	 * 
	 * @support
	 */

	OBJECT,

	/**
	 * 数组（一般数据类型）
	 * 
	 * @support All -- primitive array, string array, enum array, object array
	 */

	ARRAY,

	/**
	 * 列表容器
	 * 
	 * @support Option
	 */
	LIST,

	/**
	 * 表容器
	 * 
	 * @support Not
	 */
	MAP
}