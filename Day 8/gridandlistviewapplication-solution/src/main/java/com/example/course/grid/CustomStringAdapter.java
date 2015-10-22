package com.example.course.grid;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class CustomStringAdapter extends BaseAdapter {

	Context ctx;
	String [] listString;
	
	public CustomStringAdapter(Context ctx, String[] listString) {
		this.ctx = ctx;
		this.listString = listString;
	}
	
	@Override
	public int getCount() {
		return listString.length;
	}

	@Override
	public Object getItem(int position) {
		return listString[position];
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		TextView tv = new TextView(ctx);
		tv.setWidth(50);
		tv.setHeight(50);
		tv.setText(listString[position]);
		return tv;
	}


}
