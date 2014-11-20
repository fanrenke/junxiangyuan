package com.junxiangyuan.activity;

import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class BaseActivity extends ActionBarActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ActionBar actionBar = getSupportActionBar();
		actionBar.show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuItemCompat.setShowAsAction(
				menu.add("No.1").setIcon(android.R.drawable.ic_menu_rotate),
				MenuItemCompat.SHOW_AS_ACTION_IF_ROOM);
		MenuItemCompat.setShowAsAction(
				menu.add("No.2").setIcon(android.R.drawable.ic_menu_compass),
				MenuItemCompat.SHOW_AS_ACTION_IF_ROOM);
		MenuItemCompat.setShowAsAction(
				menu.add("No.3").setIcon(android.R.drawable.ic_menu_more),
				MenuItemCompat.SHOW_AS_ACTION_IF_ROOM);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem menu) {
		if (menu.getTitle() == "No.1") {
			Toast.makeText(getApplicationContext(),
					"You clicked first button.", Toast.LENGTH_SHORT).show();
		}
		if (menu.getTitle() == "No.2") {
			Toast.makeText(getApplicationContext(),
					"You clicked second button.", Toast.LENGTH_SHORT).show();
		}
		if (menu.getTitle() == "No.3") {
			Toast.makeText(getApplicationContext(),
					"You clicked third button.", Toast.LENGTH_SHORT).show();
		}
//		if (menu.getid ==  android.R.id.home){
//         // app icon in action bar clicked; go home  
//         Intent intent = new Intent(this, HomeActivity.class);  
//         intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);  
//         startActivity(intent);  
//		}
		return super.onOptionsItemSelected(menu);
	}
	
}
