package com.example.course.alertdialogapplication_solution;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button buttonForNormalDialog = null;
    private Button buttonForItemsDialog = null;
    private Button buttonForMultipleChoiceDialog = null;
    private Button buttonForCustomLayoutDialog = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        buttonForNormalDialog = (Button)findViewById(R.id.btnNormalDialog);
        buttonForItemsDialog = (Button)findViewById(R.id.btnItemsDialog);
        buttonForMultipleChoiceDialog = (Button)findViewById(R.id.btnMultipleChoiceDialog);
        buttonForCustomLayoutDialog = (Button)findViewById(R.id.btnCustomLayoutDialog);

        buttonForNormalDialog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("Alert Dialog Title");
                alertDialog.setMessage("Alert Dialog Message");

                alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "OK Button is pressed", Toast.LENGTH_SHORT).show();
                    }
                })

                        .setNegativeButton("Cancel", null);

                alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub

                    }
                });

                alertDialog.show();
            }
        });

        buttonForItemsDialog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);

                alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "OK Button is pressed", Toast.LENGTH_SHORT).show();
                    }
                })
                        .setNegativeButton("Cancel", null);
                alertDialog.setItems(new String[] {"a","b"} , new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alertDialog.show();
            }
        });

        buttonForMultipleChoiceDialog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final ArrayList mSelectedItems = new ArrayList();
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);

                alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "OK Button is pressed", Toast.LENGTH_SHORT).show();
                    }
                })
                        .setNegativeButton("Cancel", null);

                alertDialog.setMultiChoiceItems(new String[] {"Red","Black","White"} , null, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which,
                                        boolean isChecked) {
                        if (isChecked) {
                            // If the user checked the item, add it to the selected items
                        } else if (mSelectedItems.contains(which)) {
                            // Else, if the item is already in the array, remove it
                            mSelectedItems.remove(Integer.valueOf(which));
                        }
                    }
                });
                alertDialog.show();
            }
        });

        buttonForCustomLayoutDialog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);

                alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        Toast.makeText(MainActivity.this, "OK Button is pressed", Toast.LENGTH_SHORT).show();
                    }
                })
                        .setNegativeButton("Cancel", null);

                LayoutInflater inflater = MainActivity.this.getLayoutInflater();

                alertDialog.setView(inflater.inflate(R.layout.custom_dialog_layout, null))
                        // Add action buttons
                        .setPositiveButton("SignIn", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                // sign in the user ...
                            }
                        })
                        .setNegativeButton("Cancel", null);
                alertDialog.show();
            }
        });



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
