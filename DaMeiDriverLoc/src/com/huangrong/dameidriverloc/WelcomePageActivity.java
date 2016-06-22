package com.huangrong.dameidriverloc;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class WelcomePageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome_page);

		//3秒后跳转至主Activity
		final Intent main = new Intent(this, MainActivity.class); // 要转向的Activity
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				startActivity(main); // 启动新的Activity
				WelcomePageActivity.this.finish();
			}
		};
		timer.schedule(task, 1000 * 3); // 8秒后执行
	}
}
