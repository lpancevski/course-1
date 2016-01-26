package com.example.checkboxandradiogroupapp_solution;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton button = null;
    private RadioGroup radioGroup = null;

    private Button btnTestBox = null;
    private Button btnTestRadio = null;

    private CheckBox boxIOS = null;
    private CheckBox boxAndroid = null;
    private CheckBox boxWP8 = null;
    private CheckBox boxSymbian = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        // TODO Auto-generated method stub
        radioGroup = (RadioGroup) findViewById(R.id.rbgroup);

        int checkedRadioButtonId2 = radioGroup.getCheckedRadioButtonId();
        button = (RadioButton)findViewById(checkedRadioButtonId2);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                button = (RadioButton)findViewById(checkedId);
            }
        });

        boxIOS = (CheckBox)findViewById(R.id.boxios);
        boxIOS.setChecked(true);
        boxAndroid = (CheckBox)findViewById(R.id.boxandroid);
        boxWP8 = (CheckBox)findViewById(R.id.boxwp8);
        boxSymbian = (CheckBox)findViewById(R.id.boxsymbian);

        btnTestBox = (Button)findViewById(R.id.btntestbox);
        btnTestRadio = (Button)findViewById(R.id.btntestradio);

        btnTestBox.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String checkedElementsStatus = "IOS is:" + boxIOS.isChecked() +
                        " Android is:" + boxAndroid.isChecked() +
                        " WP8 is:" + boxWP8.isChecked() +
                        " Symbian is:" + boxSymbian.isChecked();


                Toast.makeText(MainActivity.this, checkedElementsStatus, Toast.LENGTH_SHORT).show();
            }
        });

        btnTestRadio.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, button.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
