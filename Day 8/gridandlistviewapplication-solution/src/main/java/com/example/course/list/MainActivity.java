package com.example.course.list;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.widget.ArrayAdapter;

import com.example.course.gridandlistviewapplication_solution.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        String [] values = new String[] {
        		"Android", "Windows", "Balckbarry",
        		"Android", "Windows", "Balckbarry",
        		"Android", "Windows", "Balckbarry",
        		"Android", "Windows", "Balckbarry",
        		"Ubuntu", "Linux", "Win 7"};
        
        LayoutInflater layoutInflater = getLayoutInflater();
        
        
        ArrayAdapter<String> adapter = 
        		new ArrayAdapter<String>(
        				this, 
        				android.R.layout.simple_list_item_single_choice, 
        				values);
        
        
        List<Person> persons = new ArrayList<Person>();
        
        Person person = new Person();
        person.name = "Goran";
        person.surname = "Belazelkovski";
        person.address = "Skopje";
        person.resourceId = R.mipmap.ic_launcher;
        
        persons.add(person);

        // This Adapter use Holder Pattern for performance
//        setListAdapter(new PerformanceAdapter(this, values));
        
        // This uses normal custom Adapter 
        setListAdapter(new CustomListAdapter(this, values));
        
        //This uses Array list adapter
//        setListAdapter(adapter);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    
}
