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

import com.wonderingwall.base.BaseModel;
import com.wonderingwall.data.annotation.ConvertName;

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
	
	private ArrayList<User> friends;

	public User() {
	}

	@ConvertName("name")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@ConvertName(value="pwd")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@ConvertName(value="age")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@ConvertName(value="gender")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@ConvertName("friends")
	public ArrayList<User> getFriends() {
		return friends;
	}

	public void setFriends(ArrayList<User> friends) {
		this.friends = friends;
	}

	public String toString(){
		return "username:" + username + "|password:" + password + "|age:" + age + "|gender:" + gender;
	}

}
