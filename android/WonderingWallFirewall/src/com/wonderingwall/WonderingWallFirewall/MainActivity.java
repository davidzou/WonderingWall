package com.wonderingwall.WonderingWallFirewall;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;

import com.android.internal.telephony.ITelephony;

public class MainActivity extends Activity {
//	private final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(MainActivity.class);
	
	private TelephonyManager telephonyManager;
	private PhoneStateListener listener;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.d("", "onCreate()");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	
	@Override
	protected void onStart() {
	    super.onStart();
	}
	
	@Override
	protected void onResume() {
	    super.onResume();
	    if(listener == null){
			listener = new PhoneStateListener(){
				@Override
				public void onCallStateChanged(int state, String incomingNumber) {
					super.onCallStateChanged(state, incomingNumber);
					switch (state) {
					case TelephonyManager.CALL_STATE_IDLE:
						Log.d("", "idle"); //
						break;
					case TelephonyManager.CALL_STATE_OFFHOOK:
						Log.d("", "offhook"); //
						break;
					case TelephonyManager.CALL_STATE_RINGING:
						Log.d("", "ringing"); //
						if(incomingNumber.equals("1234567")){
							endCall(telephonyManager);
						}
						break;
					}
				}
			};
	    }
	    if(telephonyManager == null){
	    	telephonyManager = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);
	    	telephonyManager.listen(listener, PhoneStateListener.LISTEN_CALL_STATE);
	    }
	}
	
	@Override
	protected void onPause() {
	    super.onPause();
	    if(telephonyManager != null) {
	    	telephonyManager.listen(listener, PhoneStateListener.LISTEN_NONE);
	    	telephonyManager = null;
	    	listener = null;
	    }
	}
	
	@Override
	protected void onDestroy() {
	    super.onDestroy();
	    telephonyManager = null;
	    listener = null;
	}
	
	private void endCall(TelephonyManager telephonyManager){
		try {
			Method it = telephonyManager.getClass().getDeclaredMethod("getITelephony", (Class[]) null);
			it.setAccessible(true);

			ITelephony iTelephony = (ITelephony) it.invoke(telephonyManager, (Object[]) null);
			iTelephony.endCall();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
