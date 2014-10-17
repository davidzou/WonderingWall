package com.wonderingwall.WonderingWallSample;

import org.json.JSONException;
import org.json.JSONObject;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import com.google.gson.Gson;
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
	private MainActivity testMainActivity;
	
    public MainActivityTest() {
        super("com.wonderingwall.WonderingWallSample", MainActivity.class);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        testMainActivity = getActivity();
    }

    public void test1(){
    	Log.e("", "hello world");
    	assertNotNull("MainActivity is null.", MainActivity.class);
    	JSONObjectConverionable convert = new JSONObjectConverionable();
    	try {
	        User user = convert.convert(new JSONObject(MainActivity.JSON), User.class);
	        Log.e("", "" + user.toString());
        } catch (JSONException e) {
	        e.printStackTrace();
        }
    }
    
    public void testgson(){
    	Log.e("", "gson");
    	long start = System.currentTimeMillis();
    	long start_nano = System.nanoTime();
    	Gson gson = new Gson();
    	User user = gson.fromJson(MainActivity.JSON, User.class);
		Log.e("", "times:" + (System.currentTimeMillis() - start));
		Log.e("", "times_nano:" + (System.nanoTime() - start_nano));
		Log.e("", "" + user.toString());
    }
}
