package com.example.course.list;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.course.gridandlistviewapplication_solution.R;


public class MainActivityList extends Activity {

	
	private ListView listView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity_list);
		
		listView = (ListView) findViewById(R.id.listView);
		String [] values = new String[] {
        		"Android", "Windows", "Balckbarry",
        		"Ubuntu", "Linux", "Win 7"};
		
		listView.setAdapter(new PerformanceAdapter(this, values));
	}
}
