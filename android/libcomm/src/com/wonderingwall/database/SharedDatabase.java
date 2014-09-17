package com.wonderingwall.database;


import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;

import java.util.Set;

/**
 * <pre>
 * <em>How to used:</em>
 * <code>
 *     public class MyApplication extends Application{
 *     		public void onCreate(){
 *     			...
 *     			SharedDatabase.configure(getApplicationContext());
 *     		}
 *     }
 *     
 *     public void used(){
 *         SharedDatabase.instance().put(key, value);
 *         SharedDatabase.instance().getString(key, defValue);
 *         ...
 *     }
 * </code>
 * </pre>
 * @author DavidZou  2014-1-5上午11:57:25
 * @email spt_genius@hotmail.com
 */
public class SharedDatabase{
	/***/
	private static final String DEFALUT_PREFS_NAME = "zz-sharedb";
	private SharedPreferences sp;
	private static SharedDatabase _instance;
	
	private SharedDatabase(Context context, String name){
		Log.e("ShareDatabase", "sharedatebase -- " + name + " is created");
		if(TextUtils.isEmpty(name)){
			sp = context.getSharedPreferences(DEFALUT_PREFS_NAME, 0);
		}else{
			sp = context.getSharedPreferences(name, 0);
		}
	}
	
	/** 
	 * Description（描述）: 配置并且生成新对象.<br/> 
	 * Conditions（适用条件）:<br/> 
	 * Execution flow（执行流程）:<br/> 
	 * Usage（用法）:<br/> 
	 * Cautions（注意事项）:<br/> 
	 * 
	 * @author DavidZou 
	 * @param context
	 * @param name
	 * @return 
	 */ 
	public static SharedDatabase configure(Context context, String name){
		if(_instance ==  null){
			_instance = new SharedDatabase(context, name);
		}
		return _instance;
	}
	
	/** 
	 * Description（描述）: 获得数据存储对象实例.<br/> 
	 * Conditions（适用条件）:<br/> 
	 * Execution flow（执行流程）:<br/> 
	 * Usage（用法）:<br/> 
	 * Cautions（注意事项）:<br/> 
	 * 
	 * @author DavidZou 
	 * @return
	 * @throws SharedDatabaseException 	if not execute method what name is {@link SharedDatabase#configure(Context)}.<br> 
	 */ 
	public static SharedDatabase instance() throws SharedDatabaseException{
		if(_instance == null){
			throw new SharedDatabaseException("ShareDatabase can not to be configured!");
		}
		return _instance;
	}
	
	public boolean put(String key, boolean value){
		if(sp == null) throw new SharedDatabaseException("SharedPreferences is null. put key--" + key);
		SharedPreferences.Editor edit = sp.edit();
		edit.putBoolean(key, value);
		return edit.commit();
	}
	
	public boolean put(String key, float value){
		if(sp == null) throw new SharedDatabaseException("SharedPreferences is null. put key--" + key);
		SharedPreferences.Editor edit = sp.edit();
		edit.putFloat(key, value);
		return edit.commit();
	}
	
	public boolean put(String key, int value){
		if(sp == null) throw new SharedDatabaseException("SharedPreferences is null. put key--" + key);
		SharedPreferences.Editor edit = sp.edit();
		edit.putInt(key, value);
		return edit.commit();
	}
	
	public boolean put(String key, long value){
		if(sp == null) throw new SharedDatabaseException("SharedPreferences is null. put key--" + key);
		Log.e("ShareDatabase", "" + key);
		SharedPreferences.Editor edit = sp.edit();
		edit.putLong(key, value);
		return edit.commit();
	}
	
	public boolean put(String key, String value){
		if(sp == null) throw new SharedDatabaseException("SharedPreferences is null. put key--" + key);
		Log.e("ShareDatabase", "" + key);
		SharedPreferences.Editor edit = sp.edit();
		edit.putString(key, value);
		return edit.commit();
	}
	
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	public boolean put(String key, Set<String> value){
		if(sp == null) throw new SharedDatabaseException("SharedPreferences is null. put key--" + key);
		SharedPreferences.Editor edit = sp.edit();
		edit.putStringSet(key, value);
		return edit.commit();
	}
	
	public boolean getBoolean(String key, boolean defValue) throws ClassCastException{
		return sp.getBoolean(key, defValue);
	}
	
	public float getFloat(String key, float defValue) throws ClassCastException{
		return sp.getFloat(key, defValue);
	}
	
	public int getInt(String key, int defValue) throws ClassCastException{
		return sp.getInt(key, defValue);
	}
	
	public long getLong(String key, long defValue) throws ClassCastException{
		return sp.getLong(key, defValue);
	}
	
	public String getString(String key, String defValue) throws ClassCastException{
		return sp.getString(key, defValue);
	}
	
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	public Set<String> getStringSet(String key, Set<String> defValue) throws ClassCastException{
		return sp.getStringSet(key, defValue);
	}
	
	/** 
	 * Description（描述）: 删除一个持久化数据. <br/> 
	 * Conditions（适用条件）:<br/> 
	 * Execution flow（执行流程）:<br/> 
	 * Usage（用法）:<br/> 
	 * Cautions（注意事项）:<br/> 
	 * 
	 * @author DavidZou 
	 * @param key 
	 */ 
	public void remove(String key){
		if(sp == null) throw new SharedDatabaseException("SharedPreferences is null. remove key--" + key + " is error.");
		SharedPreferences.Editor edit = sp.edit();
		edit.remove(key);
		edit.commit();
	}
	
	/** 
	 * Description（描述）: 关闭持久化数据对象. <br/> 
	 * Conditions（适用条件）:<br/> 
	 * Execution flow（执行流程）:<br/> 
	 * Usage（用法）:<br/> 
	 * Cautions（注意事项）:<br/> 
	 * 
	 * @author DavidZou  
	 */ 
	public void close(){
		sp.edit().clear();
		sp.edit().commit();
		sp = null;
	}
}
