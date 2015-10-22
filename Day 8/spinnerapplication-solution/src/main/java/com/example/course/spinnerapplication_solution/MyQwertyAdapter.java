package com.example.course.spinnerapplication_solution;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyQwertyAdapter extends BaseAdapter {
	
	private String[]qwertyArray = null;
	private Context ctx = null;
	
	public MyQwertyAdapter(String[] qwertyArray, Context ctx) {
		super();
		this.qwertyArray = qwertyArray;
		this.ctx = ctx;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return qwertyArray.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return qwertyArray[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		TextView textView = new TextView(ctx);
		textView.setWidth(300);
		textView.setHeight(100);
		textView.setTextColor(Color.BLACK);
		textView.setGravity(Gravity.CENTER);
		textView.setText(qwertyArray[position]);
		
		return textView;
	}

}
