/** 
 * Project Name:WonderingWallSample 
 * File Name:User.java 
 * Package Name:com.wonderingwall.WonderingWallSample 
 * Date:Oct 17, 20141:31:32 PM 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */

package com.wonderingwall.WonderingWallSample;

import java.util.ArrayList;
import java.util.HashMap;

import com.wonderingwall.base.BaseModel;
import com.wonderingwall.data.annotation.Conversionable;
import com.wonderingwall.data.annotation.ConversionableDataType;

/**
 * ClassName:User <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: Oct 17, 2014 1:31:32 PM <br/>
 * 
 * @author DavidZou
 * @version
 * @see
 */
public class User implements BaseModel {
	private String username;
	private String password;
	private int age;
	private String gender;
	private boolean sex;
	
	private String[] list;
	
	private ArrayList<String> maps;
	
	private User[] users;
	
	private User own;
	
	private HashMap<String, User> other;
	
	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	private ArrayList<User> friends;

	public User() {
	}

	@Conversionable(value="name", type=ConversionableDataType.NORMAL)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Conversionable(value="pwd")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Conversionable(value="age")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Conversionable(value="gender")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Conversionable("friends")
	public ArrayList<User> getFriends() {
		return friends;
	}

	public void setFriends(ArrayList<User> friends) {
		this.friends = friends;
	}
	
	@Conversionable("list")
	public String[] getList() {
		return list;
	}

	public void setList(String[] list) {
		this.list = list;
	}

	@Conversionable("map")
	public ArrayList<String> getMaps() {
		return maps;
	}
	
	@Conversionable("users")
	public User[] getUsers() {
		return users;
	}

	public void setUsers(User[] users) {
		this.users = users;
	}

	@Conversionable("own")
	public User getOwn() {
		return own;
	}

	public void setOwn(User own) {
		this.own = own;
	}
	
	@Conversionable("others")
	public HashMap<String, User> getOther() {
		return other;
	}

	public void setOther(HashMap<String, User> other) {
		this.other = other;
	}

	public void setMaps(ArrayList<String> maps) {
		this.maps = maps;
	}

	public String toString(){
		return "username:" + username + "|password:" + password + "|age:" + age + "|gender:" + gender;
	}

}
