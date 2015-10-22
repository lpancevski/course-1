package com.example.course.spinnerapplication_solution;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PersonAdapter extends BaseAdapter {

	List<Person> persons = new ArrayList<Person>();
	Activity activity;
	
	public PersonAdapter(Activity activity, List<Person> persons) {
		this.persons = persons;
		this.activity = activity;
	}
	
	@Override
	public int getCount() {
		return persons.size();
	}

	@Override
	public Person getItem(int arg0) {
		return persons.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup arg2) {
		View rowView = convertView;
		if (rowView == null) {
			LayoutInflater inflater = activity.getLayoutInflater();
			rowView = inflater.inflate(R.layout.person_layout, null);
			ViewHolder viewHolder = new ViewHolder();
			viewHolder.name = (TextView) rowView.findViewById(R.id.name);
			viewHolder.surname = (TextView) rowView.findViewById(R.id.surname);
			viewHolder.address = (TextView) rowView.findViewById(R.id.address);
			viewHolder.image = (ImageView) rowView.findViewById(R.id.icon);
			rowView.setTag(viewHolder);
		}
		ViewHolder holder = (ViewHolder) rowView.getTag();
		Person person = persons.get(position);
		
		holder.name.setText(person.name);
		holder.surname.setText(person.surname);
		holder.address.setText(person.address);
		
		holder.image.setImageResource(person.resourceId);
		
		
		return rowView;
	}

	static class ViewHolder {
		public TextView name;
		public TextView surname;
		public TextView address;
		public ImageView image;
	}

	public void remove(int pos) {
		persons.remove(pos);
		notifyDataSetChanged();
	}
}
