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

		//3�����ת����Activity
		final Intent main = new Intent(this, MainActivity.class); // Ҫת���Activity
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				startActivity(main); // �����µ�Activity
				WelcomePageActivity.this.finish();
			}
		};
		timer.schedule(task, 1000 * 3); // 8���ִ��
	}
}
