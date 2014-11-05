/** 
 * Project Name:libcomm 
 * File Name:StringUtils.java 
 * Package Name:com.wonderingwall.util 
 * Date:2014年11月5日下午3:56:54 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */

package com.wonderingwall.util;

/**
 * ClassName:StringUtils <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2014年11月5日 下午3:56:54 <br/>
 * 
 * @author DavidZou
 * @version
 * @see
 */
public class StringUtils {
	/**
	 * Description(描述):<br/> 
	 * Conditions(适用条件):<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @param t 
	 */ 
	public static <T> String assemble(T... t) {
		StringBuilder sb = new StringBuilder(t.length * 16); // well estimated buffer
		for (T p : t) {
			if (sb.length() > 0)
				sb.append(", ");
			sb.append(p.toString());
		}
		return sb.toString();
	}
}
