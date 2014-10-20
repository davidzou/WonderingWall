package com.wonderingwall.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION_CODES;
import android.view.Window;
import android.view.WindowManager;

/**
 * ClassName: AndroidUtils <br/>
 * Function: 工具类. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: Aug 26, 2014 11:27:56 PM <br/>
 * 
 * @author DavidZou -- spt_genius@hotmail.com
 * @version
 */
public class AndroidUtils {
	// ########################################################################################################
	// #### 设备版本相关
	// ########################################################################################################
	/**
	 * ClassName: VERSION <br/>
	 * Function: 设备版本信息. <br/>
	 * Reason: 用于获取设备系统版本信息，用作特殊版本的特殊处理逻辑判断等。<br/>
	 * date: 2014年6月4日 下午4:17:24 <br/>
	 * 
	 * @author DavidZou -- spt_genius@hotmail.com
	 * @version AndroidUtil
	 */
	public static class VERSION {
		public static final int VERSION_NAME = 0;
		public static final int VERSION_CODE = 1;

		/**
		 * Description（描述）: 获得软件版本号<br/>
		 * Conditions（适用条件）:<br/>
		 * Execution flow（执行流程）:<br/>
		 * Usage（用法）:<br/>
		 * Cautions（注意事项）:<br/>
		 * 
		 * @param context
		 * @return This that string array only had two data in it. The first
		 *         value is application's version_name, and anther is
		 *         application's version_code.
		 * @throws NameNotFoundException
		 */
		public static String[] appVersion(Context context) throws NameNotFoundException {
			String[] version = new String[2];
			PackageManager pm = context.getPackageManager();// context为当前Activity上下文
			PackageInfo pi = pm.getPackageInfo(context.getPackageName(), 0);
			version[0] = pi.versionName;
			version[1] = "" + pi.versionCode;
			return version;
		}
		
		/**
		 * Description（描述）: 获得系统版本号<br/> 
		 * Conditions（适用条件）:<br/> 
		 * Execution flow（执行流程）:<br/> 
		 * Usage（用法）:<br/> 
		 * Cautions（注意事项）:<br/> 
		 * 
		 * @return 
		 */ 
		public static int osVersion(){
			return android.os.Build.VERSION.SDK_INT;
		}
		
		/**
		 * Description（描述）:系统版本号名称<br/> 
		 * Conditions（适用条件）:<br/> 
		 * Execution flow（执行流程）:<br/> 
		 * Usage（用法）:<br/> 
		 * Cautions（注意事项）:<br/> 
		 * 
		 * @return index 0 version name, index 1 version code
		 */ 
		public static String[] osVersionName(){
			switch (android.os.Build.VERSION.SDK_INT) {
			case VERSION_CODES.BASE:
				return new String[]{"BASE", "1.0"};
			case VERSION_CODES.BASE_1_1:
				return new String[]{"BASE_1_1", "1.1"};
			case VERSION_CODES.CUPCAKE:
				return new String[]{"CUPCAKE", "1.5"};
			case VERSION_CODES.DONUT:
				return new String[]{"DONUT", "1.6"};
			case VERSION_CODES.ECLAIR:
				return new String[]{"ECLAIR", "2.0"};
			case VERSION_CODES.ECLAIR_0_1:
				return new String[]{"ECLAIR_0_1", "2.0.1"};
			case VERSION_CODES.ECLAIR_MR1:
				return new String[]{"ECLAIR_MR1", "2.1"};
			case VERSION_CODES.FROYO:
				return new String[]{"FROYO", "2.2"};
			case VERSION_CODES.GINGERBREAD:
				return new String[]{"GINGERBREAD", "2.3"};
			case VERSION_CODES.GINGERBREAD_MR1:
				return new String[]{"GINGERBREAD_MR1", "2.3.3"};
			case VERSION_CODES.HONEYCOMB:
				return new String[]{"HONEYCOMB", "3.0"};
			case VERSION_CODES.HONEYCOMB_MR1:
				return new String[]{"HONEYCOMB_MR1", "3.1"};
			case VERSION_CODES.HONEYCOMB_MR2:
				return new String[]{"HONEYCOMB_MR2", "3.2"};
			case VERSION_CODES.ICE_CREAM_SANDWICH:
				return new String[]{"ICE_CREAM_SANDWICH", "4.0"};
			case VERSION_CODES.ICE_CREAM_SANDWICH_MR1:
				return new String[]{"ICE_CREAM_SANDWICH_MR1", "4.0.3"};
			case VERSION_CODES.JELLY_BEAN:
				return new String[]{"JELLY_BEAN", "4.1"};
			case VERSION_CODES.JELLY_BEAN_MR1:
				return new String[]{"JELLY_BEAN_MR1", "4.2"};
			case VERSION_CODES.JELLY_BEAN_MR2:
				return new String[]{"JELLY_BEAN_MR2", "4.3"};
			case VERSION_CODES.KITKAT:
				return new String[]{"KITKAT", "4.4"};
			case VERSION_CODES.CUR_DEVELOPMENT:
				return new String[]{"CUR_DEVELOPMENT", "0"};
			default:
				return new String[]{"Unknown", "-1"};
			}
		}

		/**
		 * Description（描述）: 系统版本号是否为大于3.0（包含3.0系统），即API 11。<br/>
		 * Conditions（适用条件）:<br/>
		 * Execution flow（执行流程）:<br/>
		 * Usage（用法）:<br/>
		 * Cautions（注意事项）:<br/>
		 * 
		 * @return
		 */
		public static final boolean isSDKHoneyCombLater() {
			return Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB;
		}

		/**
		 * Description（描述）: 系统版本号是否为大于4.0（包含4.0系统），即API 14。<br/>
		 * Conditions（适用条件）:<br/>
		 * Execution flow（执行流程）:<br/>
		 * Usage（用法）:<br/>
		 * Cautions（注意事项）:<br/>
		 * 
		 * @return
		 */
		public static final boolean hasIceCreamSandwich() {
			return Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH;
		}

		/**
		 * Description（描述）:系统版本号是否为大于4.1（包含4.1系统），即API 16。<br/>
		 * Conditions（适用条件）:<br/>
		 * Execution flow（执行流程）:<br/>
		 * Usage（用法）:<br/>
		 * Cautions（注意事项）:<br/>
		 * 
		 * @return
		 */
		public static final boolean hasJellyBean() {
			return android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN;
		}
	}

	// ########################################################################################################
	// #### 算法相关
	// ########################################################################################################
	/**
	 * ClassName: Math <br/>
	 * Function: TODO 算法相关方法. <br/>
	 * Reason: TODO ADD REASON(可选). <br/>
	 * date: 2014年6月22日 下午11:18:29 <br/>
	 * 
	 * @author DavidZou -- spt_genius@hotmail.com
	 * @version AndroidUtils
	 */
	public static class Math {
	}

	// ########################################################################################################
	// #### 界面相关
	// ########################################################################################################
	/**
	 * ClassName: Screen <br/>
	 * Function: TODO 设备屏幕相关方法。 <br/>
	 * Reason: TODO ADD REASON(可选). <br/>
	 * date: 2014年6月22日 下午11:18:56 <br/>
	 * 
	 * @author DavidZou -- spt_genius@hotmail.com
	 * @version AndroidUtils
	 */
	public static class Screen {
		/**
		 * Description（描述）: 设置窗口无标题显示<br>
		 * Conditions（适用条件）:<br/>
		 * Execution flow（执行流程）:<br/>
		 * Usage（用法）:<br/>
		 * Cautions（注意事项）:<br/>
		 * 
		 * @param activity
		 */
		public static void setNoTitle(android.app.Activity activity) {
			activity.requestWindowFeature(android.view.Window.FEATURE_NO_TITLE);
		}

		/**
		 * Description（描述）: 设置窗体显示为全屏<br/>
		 * Conditions（适用条件）:<br/>
		 * Execution flow（执行流程）:<br/>
		 * Usage（用法）:<br/>
		 * Cautions（注意事项）:<br/>
		 * 
		 * @param window
		 */
		public static void setFullScreen(android.view.Window window) {
			window.setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN, android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
		}

		/**
		 * Description（描述）: 设置窗体始终点亮<br/>
		 * Conditions（适用条件）:<br/>
		 * Execution flow（执行流程）:<br/>
		 * Usage（用法）:<br/>
		 * Cautions（注意事项）:<br/>
		 * 
		 * @param window
		 */
		public static void setKeepScreen(android.view.Window window) {
			window.setFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON, android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		}

		/**
		 * Description（描述）: 设置窗体背景模糊<br/>
		 * Conditions（适用条件）:<br/>
		 * Execution flow（执行流程）:<br/>
		 * Usage（用法）:<br/>
		 * Cautions（注意事项）:<br/>
		 * 
		 * @param window
		 */
		@SuppressWarnings("deprecation")
        public static void setBlurScreen(android.view.Window window) {
			window.setFlags(android.view.WindowManager.LayoutParams.FLAG_BLUR_BEHIND, android.view.WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
		}

		/**
		 * Description（描述）:设定屏幕亮度<br>
		 * Conditions（适用条件）:<br/>
		 * Execution flow（执行流程）:<br/>
		 * Usage（用法）:<br/>
		 * Cautions（注意事项）:<br/>
		 * 
		 * @param window
		 * @param brightness brightness value: 0.0f-1.0f
		 */
		public static void setScreenBrightness(Window window, float brightness) {
			WindowManager.LayoutParams lp = window.getAttributes();
			lp.screenBrightness = brightness;
			window.setAttributes(lp);
		}
	}
	
	/** 
	 * ClassName: Package <br/> 
	 * Function: TODO 软件包信息内容. <br/> 
	 * Reason: TODO ADD REASON(Option). <br/> 
	 * date: Sep 9, 2014 <br/> 
	 * 
	 * @author DavidZou -- spt_genius@hotmail.com
	 * @version AndroidUtils 
	 */  
	public static class Package{
		/**
		 * Description(描述):<br/> 
		 * Conditions(适用条件):<br/> 
		 * Execution flow(执行流程):<br/> 
		 * Usage(用法):<br/> 
		 * Cautions(注意事项):<br/> 
		 * 
		 * @author DavidZou
		 * @param context
		 * @return 
		 */ 
		public static String getName(Context context){
			return context.getPackageName();
		}
		
		/**
		 * Description(描述): 跳转到市场<br/> 
		 * Conditions(适用条件):<br/> 
		 * Execution flow(执行流程):<br/> 
		 * Usage(用法):<br/> 
		 * Cautions(注意事项):<br/> 
		 * 
		 * @author DavidZou
		 * @param context
		 */ 
		public static void goMarket(Context context) {
			Uri uri = Uri.parse("market://details?id=" + context.getPackageName());
			Intent intent = new Intent(Intent.ACTION_VIEW, uri);
			intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(intent);
		}
	}

	/** 
	 * ClassName: Devices <br/> 
	 * Function: TODO 设备相关. <br/> 
	 * Reason: TODO ADD REASON(Option). <br/> 
	 * date: Sep 9, 2014 <br/> 
	 * 
	 * @author DavidZou -- spt_genius@hotmail.com
	 * @version AndroidUtils 
	 */  
	public static class Devices {
		/**
		 * Description(描述): 设备屏幕宽度<br/> 
		 * Conditions(适用条件):<br/> 
		 * Execution flow(执行流程):<br/> 
		 * Usage(用法):<br/> 
		 * Cautions(注意事项):<br/> 
		 * 
		 * @param context
		 * @return 
		 */ 
		public static int getWidth(Context context){
			return context.getResources().getDisplayMetrics().widthPixels;
		}
		
		/**
		 * Description(描述):设备屏幕高度<br/> 
		 * Conditions(适用条件):<br/> 
		 * Execution flow(执行流程):<br/> 
		 * Usage(用法):<br/> 
		 * Cautions(注意事项):<br/> 
		 * 
		 * @param context
		 * @return 
		 */ 
		public static int getHeight(Context context){
			return context.getResources().getDisplayMetrics().heightPixels;
		}
		
		/**
		 * Description(描述):<br/> 
		 * Conditions(适用条件):<br/> 
		 * Execution flow(执行流程):<br/> 
		 * Usage(用法):<br/> 
		 * Cautions(注意事项):<br/> 
		 * 
		 * @param context
		 * @return 
		 */ 
		public int getDpi(Context context){
			return context.getResources().getDisplayMetrics().densityDpi;
		}
	}
	
	/** 
	 * ClassName: View <br/> 
	 * Function: TODO 设备UI界面相关. <br/> 
	 * Reason: TODO 一些常用方法整理，减小代码的编写. <br/> 
	 * date: Oct 13, 2014 <br/> 
	 * 
	 * @author DavidZou -- spt_genius@hotmail.com
	 * @version AndroidUtils 
	 */  
	public static class View {
		public static void postUpdate(final android.widget.TextView view, final Object data){
			view.post(new Runnable() {
				@Override
				public void run() {
					view.setText(data.toString());
				}
			});
		}
		
		public static void postUpdate(final android.widget.ImageView view, final Object data){
			view.post(new Runnable() {
				@Override
				public void run() {
				}
			});
		}
	}
}