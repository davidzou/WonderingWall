/** 
 * Project Name:WonderingWallSampleTest 
 * File Name:User2.java 
 * Package Name:com.wonderingwall.WonderingWallSample.model 
 * Date:2014年10月24日下午4:11:29 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */

package com.wonderingwall.WonderingWallSample.model;

import com.wonderingwall.base.BaseModel;
import com.wonderingwall.data.annotation.Conversionable;
import com.wonderingwall.data.annotation.ConversionableDataType;

/**
 * ClassName:User1 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2014年10月24日 下午12:31:46 <br/>
 * 
 * @author DavidZou
 * @version
 * @see
 */
public class User2 implements BaseModel {
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
	private int[] data;

	public User2() {
	}

	@Conversionable(value = "username", type = ConversionableDataType.NORMAL)
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

	@Conversionable(value="data", type=ConversionableDataType.ARRAY)
	public int[] getData() {
		return data;
	}

	public void setData(int[] data) {
		this.data = data;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		for(int i : data){
			builder.append("" + i);
			builder.append(",");
		}
		return "username:" + username + ", password:" + password + ", age:" + age + ", readable:" + readable + ", money:" + money + ", data:" + data.length + "-" + builder.toString();
	}
}
