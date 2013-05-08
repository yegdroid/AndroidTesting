package com.redpatchtech.projectfortesting;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	private int counter = 1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void clickButton(View v)
	{
		TextView view = (TextView) findViewById(R.id.textView2);
		String text =  view.getText().toString();
		String newText = text + "Clicked" + counter++;
		view.setText(newText);
	}
}
