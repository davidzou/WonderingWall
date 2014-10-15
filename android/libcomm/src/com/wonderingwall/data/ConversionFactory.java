/** 
 * Project Name:libcomm 
 * File Name:ConverionFactory.java 
 * Package Name:com.wonderingwall.data 
 * Date:Oct 8, 20141:25:46 PM 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.data;  

import java.lang.annotation.Annotation;

import android.util.Log;

import com.wonderingwall.base.BaseModel;

/** 
 * ClassName:ConverionFactory <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     Oct 8, 2014 1:25:46 PM <br/> 
 * @author   DavidZou
 * @version   
 * @see       
 */
public class ConversionFactory {
	public static void convert(BaseModel model, Class<? extends Conversionable<?>> clazz){
		// 将模型数据转化为需要的数据对象
		Annotation[] d = model.getClass().getAnnotations();
		
		Log.e("abcd", d.getClass().getName());
	}
	
    /**
     * Description(描述):<br/> 
     * Conditions(适用条件):<br/> 
     * Execution flow(执行流程):<br/> 
     * Usage(用法):<br/> 
     * Cautions(注意事项):<br/> 
     * 
     * @param clazz	
     * @param data
     * @return 
     */ 
    public static <T extends BaseModel, D> T convert(Class<T> clazz, Conversionable<D> con, D data){
		T t = null;
		Class<T> c = null;
		try{
			c = (Class<T>) Class.forName(clazz.getName());
			t = c.newInstance();
			
			con.convert(data, t);
			
		} catch (ClassNotFoundException e) {
	        e.printStackTrace();
        } catch (InstantiationException e) {
	        e.printStackTrace();
        } catch (IllegalAccessException e) {
	        e.printStackTrace();
        }finally{
			// clean
		}
		return t;
	}
}
 