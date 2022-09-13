package com.aldringames.scjd.sbsp.common;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		overridePendingTransition(0, 0);
		View mDecorView = getWindow().getDecorView();
		mDecorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
										 | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
										 | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
										 | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
										 | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
	}
	
}
