/** 
 * Project Name:zzlibcore 
 * File Name:DataBase.java 
 * Package Name:com.zzwzm.libcore.database.sql 
 * Date:2014年7月16日下午1:17:08 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.database.sql;  

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;


/** 
 * ClassName:DataBase <br/> 
 * Function: TODO 数据库对象. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月16日 下午1:17:08 <br/> 
 * @author   DavidZou
 * @version   
 * @see       
 */
public class DataBase extends SDSQLiteOpenHelper{
	public static final int VERSION = 1;
	
	public DataBase(Context context, String name){
		super(context, name, null, VERSION);
	}
	
	@Override
    public void onCreate(SQLiteDatabase db) {
		try{
			db.execSQL("");
		}catch(SQLException e){
			e.printStackTrace();
		}
    }

	@Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	    
    }

	@Override
    public String saveAsPath() {
	    // TODO Auto-generated method stub
	    return null;
    }

//    /**
//     * Description（描述）: 创建数据库表<br/> 
//     * Conditions（适用条件）:<br/> 
//     * Execution flow（执行流程）:<br/> 
//     * Usage（用法）:<br/> 
//     * Cautions（注意事项）:<br/> 
//     * 
//     * @author DavidZou
//     * @param name
//     * @param t
//     * @return
//     * @throws InstantiationException
//     * @throws IllegalAccessException 
//     */ 
//    public <T extends Table<?>> T createTable(String name, Class<T> t) throws InstantiationException, IllegalAccessException{
//		try {
//	        return t.newInstance();
//        } catch (InstantiationException e) {
//        	throw new InstantiationException(e.getMessage());
//        } catch (IllegalAccessException e) {
//        	throw new IllegalAccessException(e.getMessage());
//        }
//	}
//	
//	/**
//	 * Description（描述）: 删除一个数据库表。<br/> 
//	 * Conditions（适用条件）:<br/> 
//	 * Execution flow（执行流程）:<br/> 
//	 * Usage（用法）:<br/> 
//	 * Cautions（注意事项）:<br/> 
//	 * 
//	 * @author DavidZou
//	 * @param name 
//	 */ 
//	public void dropTable(String name){
//		
//	}
//	
//	public String getName() {
//		return name;
//	}

}
 