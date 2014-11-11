/** 
 * Project Name:libcomm 
 * File Name:StringUtils.java 
 * Package Name:com.wonderingwall.util 
 * Date:2014年11月5日下午3:56:54 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */

package com.wonderingwall.util;

import java.lang.reflect.Array;

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
	 * Description(描述): 合成给定的数据类型<br/> 
	 * Conditions(适用条件):<br/> 
	 * Execution flow(执行流程):<br/> 
	 * Usage(用法):<br/> 
	 * Cautions(注意事项):<br/> 
	 * 
	 * @param t 
	 */ 
	public static <T> String assemble(T... t) {
		if(t == null){
			return "";
		}
		StringBuilder sb = new StringBuilder(t.length * 16); // well estimated buffer
		for (T p : t) {
			if (sb.length() > 0)
				sb.append(", ");
			if(p.getClass().isArray()){
				sb.append("[");
				int size = Array.getLength(p);
				for(int i = 0; i < size; i ++){
					if(i > 0){
						sb.append(", ");
					}
					sb.append(Array.get(p, i).toString());
				}
				sb.append("]");
			}else{
				sb.append(p.toString());
			}
		}
		return sb.toString();
	}
	
	public static String assemble(byte... values){
		if(values == null){
			return "";
		}
		StringBuilder sb = new StringBuilder(values.length * 4);
		for (byte p : values) {
			if (sb.length() > 0)
				sb.append(", ");
			sb.append(p);
		}
		return sb.toString();
	}
	
	public static String assemble(short... values){
		if(values == null){
			return "";
		}
		StringBuilder sb = new StringBuilder(values.length * 8);
		for (short p : values) {
			if (sb.length() > 0)
				sb.append(", ");
			sb.append(p);
		}
		return sb.toString();
	}
	
	public static String assemble(int... values){
		if(values == null){
			return "";
		}
		StringBuilder sb = new StringBuilder(values.length * 16);
		for (int p : values) {
			if (sb.length() > 0)
				sb.append(", ");
			sb.append(p);
		}
		return sb.toString();
	}
	
	public static String assemble(boolean... values){
		if(values == null){
			return "";
		}
		StringBuilder sb = new StringBuilder(values.length * 4);
		for (boolean p : values) {
			if (sb.length() > 0)
				sb.append(", ");
			sb.append(p);
		}
		return sb.toString();
	}
	
	public static String assemble(float... values){
		if(values == null){
			return "";
		}
		StringBuilder sb = new StringBuilder(values.length * 32);
		for (float p : values) {
			if (sb.length() > 0)
				sb.append(", ");
			sb.append(p);
		}
		return sb.toString();
	}
	
	public static String assemble(double... values){
		if(values == null){
			return "";
		}
		StringBuilder sb = new StringBuilder(values.length * 64);
		for (double p : values) {
			if (sb.length() > 0)
				sb.append(", ");
			sb.append(p);
		}
		return sb.toString();
	}
	
	public static String assemble(String... values){
		if(values == null){
			return "";
		}
		StringBuilder sb = new StringBuilder(values.length * 64);
		for (String p : values) {
			if (sb.length() > 0)
				sb.append(", ");
			sb.append(p);
		}
		return sb.toString();
	}
	
	public static String assemble(Enum<?>... values){
		if(values == null){
			return "";
		}
		StringBuilder sb = new StringBuilder(values.length * 64);
		for (Enum<?> p : values) {
			if (sb.length() > 0)
				sb.append(", ");
			sb.append(p.name());
		}
		return sb.toString();
	}
	
}
