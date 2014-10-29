/** 
 * Project Name:WonderingWallSampleTest 
 * File Name:ClassType.java 
 * Package Name:com.wonderingwall.WonderingWallSample.model 
 * Date:2014年10月29日下午1:56:32 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.WonderingWallSample.model;  

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;

/** 
 * ClassName:ClassType <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年10月29日 下午1:56:32 <br/> 
 * @author   DavidZou
 * @version   
 * @see       
 */
public class ClassType {
	byte t_byte;
	short t_short;
	int t_int;
	long t_long;
	float t_float;
	double t_double;
	boolean t_boolean;
	String t_string;
	
	byte[] t_byte_array;
	short[] t_short_array;
	int[]  t_int_array;
	float[] t_float_array;
	double[] t_double_array;
	boolean[] t_boolean_array;
	String[] t_string_array;
	
//	ArrayList<?> t_list;
	ArrayList<Integer> t_list_int;
	ArrayList<String> t_list_string;
	ArrayList<? super Integer> t_list_super_int;
	ArrayList<? super String> t_list_super_string;
	ArrayList<User1> t_list_object_user1;
	ArrayList<? extends User1> t_list_object_extends_user1;
	
	ArrayDeque<? super String> t_deque;
	
	User1 t_object_user1;
	
	Map<String, String> t_map;
	
	public ClassType() {
	}

	public byte getT_byte() {
		return t_byte;
	}

	public void setT_byte(byte t_byte) {
		this.t_byte = t_byte;
	}

	public short getT_short() {
		return t_short;
	}

	public void setT_short(short t_short) {
		this.t_short = t_short;
	}

	public int getT_int() {
		return t_int;
	}

	public void setT_int(int t_int) {
		this.t_int = t_int;
	}

	public long getT_long() {
		return t_long;
	}

	public void setT_long(long t_long) {
		this.t_long = t_long;
	}

	public float getT_float() {
		return t_float;
	}

	public void setT_float(float t_float) {
		this.t_float = t_float;
	}

	public double getT_double() {
		return t_double;
	}

	public void setT_double(double t_double) {
		this.t_double = t_double;
	}

	public boolean isT_boolean() {
		return t_boolean;
	}

	public void setT_boolean(boolean t_boolean) {
		this.t_boolean = t_boolean;
	}

	public String getT_string() {
		return t_string;
	}

	public void setT_string(String t_string) {
		this.t_string = t_string;
	}

	public byte[] getT_byte_array() {
		return t_byte_array;
	}

	public void setT_byte_array(byte[] t_byte_array) {
		this.t_byte_array = t_byte_array;
	}

	public short[] getT_short_array() {
		return t_short_array;
	}

	public void setT_short_array(short[] t_short_array) {
		this.t_short_array = t_short_array;
	}

	public int[] getT_int_array() {
		return t_int_array;
	}

	public void setT_int_array(int[] t_int_array) {
		this.t_int_array = t_int_array;
	}

	public float[] getT_float_array() {
		return t_float_array;
	}

	public void setT_float_array(float[] t_float_array) {
		this.t_float_array = t_float_array;
	}

	public double[] getT_double_array() {
		return t_double_array;
	}

	public void setT_double_array(double[] t_double_array) {
		this.t_double_array = t_double_array;
	}

	public boolean[] getT_boolean_array() {
		return t_boolean_array;
	}

	public void setT_boolean_array(boolean[] t_boolean_array) {
		this.t_boolean_array = t_boolean_array;
	}

	public String[] getT_string_array() {
		return t_string_array;
	}

	public void setT_string_array(String[] t_string_array) {
		this.t_string_array = t_string_array;
	}

//	public ArrayList<?> getT_list() {
//		return t_list;
//	}
//
//	public void setT_list(ArrayList<?> t_list) {
//		this.t_list = t_list;
//	}

	public ArrayList<Integer> getT_list_int() {
		return t_list_int;
	}

	public void setT_list_int(ArrayList<Integer> t_list_int) {
		this.t_list_int = t_list_int;
	}

	public ArrayList<String> getT_list_string() {
		return t_list_string;
	}

	public void setT_list_string(ArrayList<String> t_list_string) {
		this.t_list_string = t_list_string;
	}

	public ArrayList<? super Integer> getT_list_super_int() {
		return t_list_super_int;
	}

	public void setT_list_super_int(ArrayList<? super Integer> t_list_super_int) {
		this.t_list_super_int = t_list_super_int;
	}

	public ArrayList<? super String> getT_list_super_string() {
		return t_list_super_string;
	}

	public void setT_list_super_string(ArrayList<? super String> t_list_super_string) {
		this.t_list_super_string = t_list_super_string;
	}

	public ArrayList<User1> getT_list_object_user1() {
		return t_list_object_user1;
	}

	public void setT_list_object_user1(ArrayList<User1> t_list_object_user1) {
		this.t_list_object_user1 = t_list_object_user1;
	}

	public ArrayList<? extends User1> getT_list_object_extends_user1() {
		return t_list_object_extends_user1;
	}

	public void setT_list_object_extends_user1(ArrayList<? extends User1> t_list_object_extends_user1) {
		this.t_list_object_extends_user1 = t_list_object_extends_user1;
	}

	public ArrayDeque<? super String> getT_deque() {
		return t_deque;
	}

	public void setT_deque(ArrayDeque<? super String> t_deque) {
		this.t_deque = t_deque;
	}

	public User1 getT_object_user1() {
		return t_object_user1;
	}

	public void setT_object_user1(User1 t_object_user1) {
		this.t_object_user1 = t_object_user1;
	}

	public Map<String, String> getT_map() {
		return t_map;
	}

	public void setT_map(Map<String, String> t_map) {
		this.t_map = t_map;
	}
	
	private void dododo(){
		
	}
}
 