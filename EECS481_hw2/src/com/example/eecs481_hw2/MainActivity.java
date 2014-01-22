package com.example.eecs481_hw2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView text;
	private Button upButton;
	private Button downButton;
	private Button leftButton;
	private Button rightButton;
	private Button nameButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		
		text = (TextView) findViewById(R.id.textView1);
		upButton = (Button) findViewById(R.id.up_button);
		downButton = (Button) findViewById(R.id.down_button);
		leftButton = (Button) findViewById(R.id.left_button);
		rightButton = (Button) findViewById(R.id.right_button);
		nameButton = (Button) findViewById(R.id.name_button);
		
		upButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text.setText("player moved up");
			}
		});
		
		downButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text.setText("player moved down");
			}
		});
		
		leftButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text.setText("player moved left");
			}
		});
		
		rightButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text.setText("player moved right");
			}
		});
		
		nameButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text.setText("Hello Nick Augustyniak!");
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
