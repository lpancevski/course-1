package com.example.course.scrollableapplication_solution;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private LinearLayout hsvChildLayout;
    private LinearLayout svChildLayout;

    private String[]categories = {"Food", "Drink", "Vegetables", "Car", "Vehicles", "Test1", "Test2", "Test3", "Test4"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {

        hsvChildLayout = (LinearLayout)findViewById(R.id.hsvchild);
        svChildLayout = (LinearLayout)findViewById(R.id.svchild);

        for (int i = 0; i < categories.length; i++) {

            LinearLayout childLayout  = new LinearLayout(MainActivity.this);
            LinearLayout.LayoutParams ll = new LinearLayout.LayoutParams(100, 100);
            childLayout.setLayoutParams(ll);
            childLayout.setBackgroundColor(Color.RED);
            childLayout.setOrientation(LinearLayout.VERTICAL);
            childLayout.setGravity(Gravity.CENTER);

            TextView view = new TextView(MainActivity.this);
            view.setWidth(80);
            view.setHeight(50);
            view.setTextColor(Color.BLACK);
            view.setText(""+categories[i]);
            view.setTextSize(12);
            view.setGravity(Gravity.CENTER);

            childLayout.setTag(i);

            childLayout.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    TextView view = new TextView(MainActivity.this);
                    view.setWidth(20);
                    view.setHeight(50);
                    view.setTextColor(Color.BLACK);

                    Integer index = (Integer)v.getTag();

                    view.setText(""+categories[index.intValue()]);
                    view.setGravity(Gravity.CENTER);
                    view.setTag(index);

                    view.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                            // TODO Auto-generated method stub
                            Toast.makeText(MainActivity.this, categories[((Integer) v.getTag()).intValue()], Toast.LENGTH_SHORT).show();
                        }
                    });

                    svChildLayout.addView(view);
                }
            });

            childLayout.addView(view);

            hsvChildLayout.addView(childLayout);

        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
