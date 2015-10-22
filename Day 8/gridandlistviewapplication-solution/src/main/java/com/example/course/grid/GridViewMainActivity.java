package com.example.course.grid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;


public class GridViewMainActivity extends Activity {

	private GridView gridView;
	
	String[] letters = new String[] {
			"A", "B", "C", "D", "E", "F", "G", "H", "I"
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.gridview_layout);
//		gridView = (GridView) findViewById(R.id.gridView1);
		gridView.setAdapter(new CustomStringAdapter(this, letters));
	}
}
