package com.avik.checklist;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

// testing something in git
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId())
		{
		case R.id.addTask:
			//Log.d("Mainactivity", "add a new task");
			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder.setTitle("Add a task");
			builder.setMessage("Write a task");
			final EditText inputfield = new EditText(this);
			builder.setView(inputfield);
			builder.setPositiveButton("Add", new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					Log.d("MainActivity", inputfield.getText().toString());
				}
			});
			builder.setNegativeButton("Cancel", null);
			builder.create().show();
			return true;
		default:
			return false;
		}
		// TODO Auto-generated method stub
		//return super.onOptionsItemSelected(item);
	}
	
	
	

}
