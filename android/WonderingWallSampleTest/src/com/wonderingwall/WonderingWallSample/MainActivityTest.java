package com.wonderingwall.WonderingWallSample;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

import org.json.JSONException;
import org.json.JSONObject;

import android.content.res.AssetManager;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import com.google.gson.Gson;
import com.wonderingwall.WonderingWallSample.model.ClassType;
import com.wonderingwall.WonderingWallSample.model.User1;
import com.wonderingwall.WonderingWallSample.model.User2;
import com.wonderingwall.WonderingWallSample.model.User3;
import com.wonderingwall.WonderingWallSample.model.User4;
import com.wonderingwall.data.ConversionUtils;
import com.wonderingwall.data.impl.JSONObjectConverionable;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.wonderingwall.WonderingWallSample.MainActivityTest \
 * com.wonderingwall.WonderingWallSample.tests/android.test.InstrumentationTestRunner
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
	
    public MainActivityTest() {
        super(MainActivity.class);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    public void testClassType(){
    	
    }

    public void testType() throws ClassNotFoundException{
    	Class<?> clazz = Class.forName(ClassType.class.getName());
    	for(Field field : clazz.getDeclaredFields()){
    		if(field.getType().isPrimitive()){
    			Log.e("", field.getName() + "-- primitive:" + field.getType().isPrimitive() + ", name:" + field.getType().getName());
    			// 基本类
    		}else
    		if(field.getType().isArray()){
    			// 数组
    			Log.e("", field.getName() + "-- primitive: array" + ", name:" + field.getType().getName());
    		}else{
    			if(field.getGenericType() instanceof ParameterizedType){
    				// List
    				if(((ParameterizedType) field.getGenericType()).getActualTypeArguments().length > 1){
    					Log.e("", field.getName() + "-- primitive: map" + ", name:" + field.getType().getName());
    				}else{
    					Log.e("", field.getName() + "-- primitive: List" + ", name:" + field.getType().getName());
    				}
    			}else 
    			if(field.getGenericType() instanceof WildcardType){
    				Log.e("", field.getName() + "-- primitive: wild" + ", name:" + field.getType().getName());
    			}else{
    				// Object String
	    			if(field.getType() == String.class){
	    				Log.e("", field.getName() + "-- primitive: string" + ", name:" + field.getType().getName());
	    			}else{
	    				// Object
	    				Log.e("", field.getName() + "-- primitive: object" + ", name:" + field.getType().getName());
	    			}
    			}
    		}
    	}
    	
    	for(Method method : clazz.getDeclaredMethods()){
    		if(method.getGenericParameterTypes().length > 0){
    			Log.e("", method.getName() + ": set method");
    		}else{
    			Log.e("", method.getName() + ": get method");
    		}
    		
    		Type returnType = method.getGenericReturnType();
    		Log.e("", "type:" + ConversionUtils.getClass(returnType, 0));
    	}
    }
    
//	public void testJSONObjectConversionByGenericData() {
//		Log.e("", "hello world");
//		assertNotNull("MainActivity is null.", MainActivity.class);
//		long start = System.currentTimeMillis();
//		long start_nano = System.nanoTime();
//
//		JSONObjectConverionable convert = new JSONObjectConverionable();
//		User1 user = convert.convert(readJSON("user1.json"), User1.class);
//		assertNotNull("user1 is null.", user);
//		if (user != null)
//			Log.e("", "user: {" + user.toString() + "}");
//
//		Log.e("", "times:" + (System.currentTimeMillis() - start));
//		Log.e("", "times_nano:" + (System.nanoTime() - start_nano));
//	}
//	
//	public void testJSONObjectGSONByGenericData(){
//		long start = System.currentTimeMillis();
//		long start_nano = System.nanoTime();
//		
//		Gson gson = new Gson();
//		User1 user = gson.fromJson(readJSON("user1.json").toString(), User1.class);
//		
//		if (user != null)
//			Log.e("gson", "user: {" + user.toString() + "}");
//
//		Log.e("gson", "times:" + (System.currentTimeMillis() - start));
//		Log.e("gson", "times_nano:" + (System.nanoTime() - start_nano));
//	
//	}
//    
//    public void testJSONObjectConversionByArray(){
//		long start = System.currentTimeMillis();
//		long start_nano = System.nanoTime();
//		
//    	JSONObjectConverionable convert = new JSONObjectConverionable();
//        User2 user = convert.convert(readJSON("user2.json"), User2.class);
//        assertNotNull("user2 is null.", user);
//        if(user != null) Log.e("", "user: {" + user.toString() + "}");
//        
//		Log.e("", "times:" + (System.currentTimeMillis() - start));
//		Log.e("", "times_nano:" + (System.nanoTime() - start_nano));
//    }
    
//    public void testJSONObjectGSONByArray(){
//		long start = System.currentTimeMillis();
//		long start_nano = System.nanoTime();
//		
//		Gson gson = new Gson();
//		User2 user = gson.fromJson(readJSON("user1.json").toString(), User2.class);
//		
//		if (user != null)
//			Log.e("gson", "user: {" + user.toString() + "}");
//
//		Log.e("gson", "times:" + (System.currentTimeMillis() - start));
//		Log.e("gson", "times_nano:" + (System.nanoTime() - start_nano));
//    }
    
//    public void testJSONObjectConversionByObjcect(){
//		long start = System.currentTimeMillis();
//		long start_nano = System.nanoTime();
//		
//    	JSONObjectConverionable convert = new JSONObjectConverionable();
//        User3 user = convert.convert(readJSON("user3.json"), User3.class);
//        assertNotNull("user3 is null.", user);
//        if(user != null) Log.e("", "user: {" + user.toString() + "}");
//        
//		Log.e("", "times:" + (System.currentTimeMillis() - start));
//		Log.e("", "times_nano:" + (System.nanoTime() - start_nano));
//    }
//    
//    public void testJSONObjectConversionByList(){
//		long start = System.currentTimeMillis();
//		long start_nano = System.nanoTime();
//		
//    	JSONObjectConverionable convert = new JSONObjectConverionable();
//        User4 user = convert.convert(readJSON("user4.json"), User4.class);
//        assertNotNull("user4 is null.", user);
//        if(user != null) Log.e("", "user: {" + user.toString() + "}");
//        
//		Log.e("", "times:" + (System.currentTimeMillis() - start));
//		Log.e("", "times_nano:" + (System.nanoTime() - start_nano));
//    }
    
    
//    public void testJSONObjectGSONByObjcect(){
//		long start = System.currentTimeMillis();
//		long start_nano = System.nanoTime();
//		
//		Gson gson = new Gson();
//		User3 user = gson.fromJson(readJSON("user1.json").toString(), User3.class);
//		
//		if (user != null)
//			Log.e("gson", "user: {" + user.toString() + "}");
//
//		Log.e("gson", "times:" + (System.currentTimeMillis() - start));
//		Log.e("gson", "times_nano:" + (System.nanoTime() - start_nano));
//    }
    
    /**
     * Description(描述): 读取本地测试数据<br/> 
     * Conditions(适用条件):<br/> 
     * Execution flow(执行流程):<br/> 
     * Usage(用法):<br/> 
     * Cautions(注意事项):<br/> 
     * 
     * @param filename
     * @return 
     */ 
    private JSONObject readJSON(String filename){
    	InputStream in = null;
    	AssetManager assetManager = null;
    	try {
    		assetManager = getInstrumentation().getContext().getAssets();
	        in = assetManager.open(filename);
	        int c = -1;
	        StringBuffer buffer = new StringBuffer();
	        while((c = in.read()) != -1){
	        	if((char) c == ' ') continue;
	        	buffer.append((char) c);
	        }
	        return new JSONObject(buffer.toString());
        } catch (IOException e1) {
	        e1.printStackTrace();
        } catch (JSONException e) {
	        e.printStackTrace();
        } finally {
        	if(in != null){
        		try {
	                in.close();
                } catch (IOException e) {
	                e.printStackTrace();
                }
        		in = null;
        	}
        }
    	return null;
    }
    
//    public void testgson(){
//    	Log.e("", "gson");
//    	long start = System.currentTimeMillis();
//    	long start_nano = System.nanoTime();
//    	Gson gson = new Gson();
//    	User user = gson.fromJson(MainActivity.JSON, User.class);
//		Log.e("", "times:" + (System.currentTimeMillis() - start));
//		Log.e("", "times_nano:" + (System.nanoTime() - start_nano));
//		Log.e("", "" + user.toString());
//    }
}
