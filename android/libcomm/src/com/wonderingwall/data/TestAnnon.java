/** 
 * Project Name:libcomm 
 * File Name:TestAnnon.java 
 * Package Name:com.wonderingwall.data 
 * Date:Oct 14, 201410:55:29 AM 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.data;  

import com.wonderingwall.base.BaseModel;
import com.wonderingwall.data.ConvertName.DATA_TYPE;

/** 
 * ClassName:TestAnnon <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     Oct 14, 2014 10:55:29 AM <br/> 
 * @author   DavidZou
 * @version   
 * @see       
 */
public class TestAnnon implements BaseModel{
	private String name;
	
	private int age;
	
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ConvertName(name="age", types={DATA_TYPE.JSONOBJECT, DATA_TYPE.DATA})
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
 