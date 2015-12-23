package com.bulesea.app.activity;

import com.bulesea.app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class LoadingActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loading);

		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				Intent intent = new Intent(LoadingActivity.this, Whatsnew.class);
				startActivity(intent);
				LoadingActivity.this.finish();
				Toast.makeText(getApplicationContext(), "LoadingActivity", Toast.LENGTH_SHORT).show();
			}
		}, 200);
	}
}