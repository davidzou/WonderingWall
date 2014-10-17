package com.wonderingwall.WonderingWallSample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
	public static final String JSON = "{\"name\"=\"davidzou\", \"pwd\"=\"1234\", \"age\"=12, \"gender\"=\"male\", \"friends\"=[\"em\", \"fred\", \"king\"]}";
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	
	public void onClickButton(View view){
		Intent intent = new Intent(MainActivity.this, SecondActivity.class);
		startActivity(intent);
	}
}
