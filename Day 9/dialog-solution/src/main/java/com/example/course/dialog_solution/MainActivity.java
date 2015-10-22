package com.example.course.dialog_solution;

import android.support.v7.app.AppCompatActivity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button1 = null;
    private Button button2 = null;

    private Dialog dialog1 = null;
    private Dialog dialog2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        button1 = (Button)findViewById(R.id.dialog1);
        button2 = (Button)findViewById(R.id.dialog2);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                initDialog1();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                initDialog2();
            }
        });
    }

    public void initDialog1() {
        dialog1 = new Dialog(MainActivity.this);
        dialog1.setTitle("First Dialog");

        LinearLayout holder = new LinearLayout(MainActivity.this);
        holder.setGravity(Gravity.CENTER);
        holder.setOrientation(LinearLayout.VERTICAL);

        TextView textView = new TextView(MainActivity.this);
        textView.setWidth(200);
        textView.setHeight(50);
        textView.setText("FIRST DIALOG");
        textView.setGravity(Gravity.CENTER);
        holder.addView(textView);

        Button buttonClose = new Button(MainActivity.this);
        buttonClose.setWidth(100);
        buttonClose.setHeight(50);
        buttonClose.setText("Close");
        buttonClose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                dialog1.dismiss();
            }
        });

        holder.addView(buttonClose);

        dialog1.setContentView(holder);

        dialog1.show();

    }

    public void initDialog2() {

        dialog2 = new Dialog(MainActivity.this);
//		dialog2.setTitle("Dialog 2");

        dialog2.setContentView(R.layout.dialog2);

        Button closeButton = (Button)dialog2.findViewById(R.id.buttoncolse2);
        closeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                dialog2.dismiss();
            }
        });

        dialog2.show();

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
