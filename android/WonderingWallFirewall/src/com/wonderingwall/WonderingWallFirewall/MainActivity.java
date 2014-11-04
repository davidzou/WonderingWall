package com.wonderingwall.WonderingWallFirewall;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.android.internal.telephony.ITelephony;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;

public class MainActivity extends Activity {
	private TelephonyManager telephonyManager;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		telephonyManager = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);
		telephonyManager.listen(new PhoneStateListener() {
			@Override
			public void onCallStateChanged(int state, String incomingNumber) {
				super.onCallStateChanged(state, incomingNumber);
				switch (state) {
				case TelephonyManager.CALL_STATE_IDLE:
					Log.e("", "idle");
					break;
				case TelephonyManager.CALL_STATE_OFFHOOK:
					Log.e("", "offhook");
					break;
				case TelephonyManager.CALL_STATE_RINGING:
					Log.e("", "calling");
					if(incomingNumber.equals("1234567")){
						endCall(telephonyManager);
					}
					break;
				}
			}
		}, PhoneStateListener.LISTEN_CALL_STATE);
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
