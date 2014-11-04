/** 
 * Project Name:WonderingWallFirewall 
 * File Name:PhoneCallListener.java 
 * Package Name:com.wonderingwall.WonderingWallFirewall 
 * Date:2014年11月4日下午3:35:33 
 * Copyright (c) 2014, spt_genius@hotmail.com All Rights Reserved. 
 * 
 */  
 
package com.wonderingwall.WonderingWallFirewall;  

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;

/** 
 * ClassName:PhoneCallListener <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年11月4日 下午3:35:33 <br/> 
 * @author   DavidZou
 * @version   
 * @see       
 */
public class PhoneCallListener extends PhoneStateListener {

	public PhoneCallListener() {
	}
	
	@Override
	public void onCallStateChanged(int state, String incomingNumber) {
	    super.onCallStateChanged(state, incomingNumber);
	    switch(state){
	    case TelephonyManager.CALL_STATE_IDLE:
	    	Log.e("", "idle");
	    	break;
	    case TelephonyManager.CALL_STATE_OFFHOOK:
	    	Log.e("", "offhook");
	    	break;
	    case TelephonyManager.CALL_STATE_RINGING:
	    	Log.e("", "calling");
	    	break;
	    }
	}
	
	@Override
	public void onCallForwardingIndicatorChanged(boolean cfi) {
	    super.onCallForwardingIndicatorChanged(cfi);
	}
}
 