package com.aldringames.scjd.sbsp.common;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActiviy;

public class BaseActivity extends AppCompatActivity {
    
    private View mDecorView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	overridePendingTransition(0, 0);
	
	mDecorView = getWindow().getDecorView();
	mDecorView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
	    @Override
	    public void onSystemUiVisibilityChange(int visibility) {
		if ((visibility & View.SYSTEM_UI_FLAG_FULLSCREEN) == 0) {
		hideSystemUI();
            }
        });
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
	if (hasFocus) {
	    hideSystemBars();
	}
    }

    private void hideSystemBars() {
	decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }

}
