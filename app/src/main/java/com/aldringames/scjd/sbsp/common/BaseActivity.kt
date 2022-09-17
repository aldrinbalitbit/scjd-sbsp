package com.aldringames.scjd.sbsp.common

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
	super.onCreate(savedInstanceState)
	overridePendingTransition(0, 0)
    }
}
