package com.example.course.list;

import android.app.Activity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomListAdapter extends BaseAdapter{

	private Activity activity;
	
	private String[] objects;

	public CustomListAdapter(Activity activity, String[] obj) {
		this.activity = activity;
		this.objects = obj;
	}
	
	
	@Override
	public int getCount() {
		return objects.length;
	}

	@Override
	public Object getItem(int arg0) {
		return objects[arg0];
	}

	@Override
	public long getItemId(int arg0) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup arg2) {
		TextView tv = new TextView(activity);
		tv.setGravity(Gravity.CENTER);
		tv.setWidth(200);
		tv.setHeight(100);
		tv.setText(objects[position]);
		return tv;
	}

}
