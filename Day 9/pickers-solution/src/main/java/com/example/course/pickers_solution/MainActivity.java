package com.example.course.pickers_solution;

import android.support.v7.app.AppCompatActivity;
import java.util.Calendar;
import java.util.Date;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    private Button showDatePickerDialog = null;
    private Button showTimePickerDialog = null;
    private TextView datePickerTextView = null;
    private DatePicker datePicker = null;
    private TimePicker timePicker = null;

    Calendar c = Calendar.getInstance();

    Date date = new Date();
    int currentYear = c.get(Calendar.YEAR);
    int currentMonth = c.get(Calendar.MONTH);
    int currentDay = c.get(Calendar.DAY_OF_MONTH);

    int currentHour = c.get(Calendar.HOUR_OF_DAY);
    int currentMinute = c.get(Calendar.MINUTE);

    String[] months = { "j", "f", "m", "a", "m", "j", "j", "a", "s", "o", "n",
            "d" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        // TODO Auto-generated method stub
        datePicker = (DatePicker) findViewById(R.id.datepickerview);
        datePicker.init(
                currentYear,
                currentMonth,
                currentDay, dateListener);

        timePicker = (TimePicker) findViewById(R.id.timepickerview);
        timePicker.setCurrentMinute(currentMinute);
        timePicker.setCurrentHour(currentHour);
        timePicker.setOnTimeChangedListener(timeListener);

        datePickerTextView = (TextView) findViewById(R.id.dateTextView);
        datePickerTextView.setGravity(Gravity.CENTER);

        showDatePickerDialog = (Button) findViewById(R.id.showdatedialog);
        showDatePickerDialog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                DatePickerDialog datePickerDialog =
                        new DatePickerDialog(MainActivity.this,
                                datePickerDialogListener,
                                currentYear,
                                currentMonth,
                                currentDay);

                datePickerDialog.show();

            }
        });
        showTimePickerDialog = (Button) findViewById(R.id.showtimedialog);
        showTimePickerDialog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TimePickerDialog timePickerDialog =
                        new TimePickerDialog(MainActivity.this, timePickerDialogListener,
                                currentHour, currentMinute, true);

                timePickerDialog.show();
            }
        });

    }

    DatePicker.OnDateChangedListener dateListener = new DatePicker.OnDateChangedListener() {

        @Override
        public void onDateChanged(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {
            // TODO Auto-generated method stub
            currentYear = year;
            currentMonth = monthOfYear;
            currentDay = dayOfMonth;

            datePickerTextView.setText(currentYear + "/" + currentMonth + "/"
                    + currentDay + " " + currentHour + ":" + currentMinute);

        }
    };

    DatePickerDialog.OnDateSetListener datePickerDialogListener = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            // TODO Auto-generated method stub
            currentYear = year;
            currentMonth = monthOfYear;
            currentDay = dayOfMonth;

            datePickerTextView.setText(currentYear + "/" + currentMonth + "/"
                    + currentDay + " " + currentHour + ":" + currentMinute);

            datePicker.updateDate(currentYear, currentMonth, currentDay);
        }
    };

    TimePicker.OnTimeChangedListener timeListener = new TimePicker.OnTimeChangedListener() {

        @Override
        public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
            // TODO Auto-generated method stub

            currentHour = hourOfDay;
            currentMinute = minute;

            datePickerTextView.setText(currentYear + "/" + currentMonth + "/"
                    + currentDay + " " + currentHour + ":" + currentMinute);
        }
    };

    TimePickerDialog.OnTimeSetListener timePickerDialogListener = new TimePickerDialog.OnTimeSetListener() {

        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            // TODO Auto-generated method stub
            currentHour = hourOfDay;
            currentMinute = minute;

            datePickerTextView.setText(currentYear + "/" + currentMonth + "/"
                    + currentDay + " " + currentHour + ":" + currentMinute);

            timePicker.setCurrentHour(currentHour);
            timePicker.setCurrentMinute(currentMinute);

        }
    };

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
