package com.example.course.menus_and_actionbar_solution;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button = null;
    ListView listView = null;
    ActionMode mActionMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Action Bar");

        getWindow().
                getDecorView().
                setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_HOME
                | ActionBar.DISPLAY_SHOW_TITLE | ActionBar.DISPLAY_SHOW_CUSTOM);

        button = (Button) findViewById(R.id.buttonMenu);
        registerForContextMenu(button);
    }


    // Options menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(
                        this, "Option Item 1 clicked", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.item2:
                readMail();
                Toast.makeText(
                        this, "Option Item 2 clicked", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.item3:
                loginToFacebook();
                Toast.makeText(
                        this, "Option Item 3 clicked", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.item4:
                loginToTwitter();
                Toast.makeText(
                        this, "Option Item 4 clicked", Toast.LENGTH_SHORT)
                        .show();
                break;

            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void loginToTwitter() {
        // TODO Auto-generated method stub

    }

    private void loginToFacebook() {
        // TODO Auto-generated method stub

    }

    private void readMail() {
        // TODO Auto-generated method stub

    }

    // Contextual action mode
    public void contextualMenu(View v) {
        openContextMenu(v);
    }

    //Creating a floating context menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.setHeaderTitle("Title");
        menu.setHeaderIcon(getResources().getDrawable(R.mipmap.ic_launcher));
        menu.add(0, 1, 0, "Option 1");
        menu.add(0, 2, 1, "Option 2");
        menu.add(0, 3, 2, "Option 3");
        menu.add(0, 4, 3, "Option 4");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Toast.makeText(this,
                        "Item 1 selected",
                        Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this,
                        "Item 2 selected",
                        Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this,
                        "Item 3 selected",
                        Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
        return super.onContextItemSelected(item);
    }


    //Pop-up menu
    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(new OnMenuItemClickListener() {

            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item1:
                        Toast.makeText(MainActivity.this,
                                "Item 1 selected",
                                Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.item2:
                        Toast.makeText(MainActivity.this,
                                "Item 2 selected",
                                Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        return false;
                }
            }
        });
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_main, popup.getMenu());
        popup.show();
    }

}
