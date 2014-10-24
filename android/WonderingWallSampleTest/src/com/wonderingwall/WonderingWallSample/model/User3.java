/** 
 * Project Name:WonderingWallSampleTest 
 * File Name:User1.java 
 * Package Name:com.wonderingwall.WonderingWallSample.model 
 * Date:2014年10月24日下午12:31:46 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.WonderingWallSample.model;  

import com.wonderingwall.base.BaseModel;
import com.wonderingwall.data.annotation.Conversionable;
import com.wonderingwall.data.annotation.DATA_TYPE;

/** 
 * ClassName:User1 <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年10月24日 下午12:31:46 <br/> 
 * @author   DavidZou
 * @version   
 * @see       
 */
public class User3 implements BaseModel {
//	"username":"user1",
//	"password":"123456789",
//	"age":13,
//	"readable":true,
//	"money":123456789.02
	private String username;
	private String password;
	private int age;
	private boolean readable;
	private double money;
	
	private User1 user1;
	
	public User3() {
	}

	@Conversionable(value="username", type=DATA_TYPE.NORMAL)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Conversionable("password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Conversionable("age")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Conversionable("readable")
	public boolean isReadable() {
		return readable;
	}

	public void setReadable(boolean readable) {
		this.readable = readable;
	}

	@Conversionable("money")
	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	@Conversionable(value="user1", type=DATA_TYPE.OBJECT)
	public User1 getUser1() {
		return user1;
	}

	public void setUser1(User1 user1) {
		this.user1 = user1;
	}

	public String toString(){
		return "username:" + getUsername() + ", password:" + getPassword() + ", age:" + getAge() + ", readable:" + isReadable() + ", money:" + getMoney() + ", user1:" + user1.toString();
	}
}
 