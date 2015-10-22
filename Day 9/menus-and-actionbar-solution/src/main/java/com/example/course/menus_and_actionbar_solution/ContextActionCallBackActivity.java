package com.example.course.menus_and_actionbar_solution;

import android.app.Activity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


/**
 * Contextual action bar
 *
 */
public class ContextActionCallBackActivity extends Activity {

	private Button button = null;
	ListView listView = null;
	ActionMode mActionMode;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.context_action);
		button = (Button) findViewById(R.id.buttonMenu);
		button.setOnLongClickListener(new View.OnLongClickListener() {
		    // Called when the user long-clicks on someView
		    public boolean onLongClick(View view) {
		        
				if (mActionMode != null) {
		            return false;
		        }

		        // Start the CAB using the ActionMode.Callback defined above
		        mActionMode = ContextActionCallBackActivity.this.startActionMode(mActionModeCallback);
		        view.setSelected(true);
		        return true;
		    }
		});
		
		
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
					this, "Item 1 clicked", Toast.LENGTH_SHORT)
					.show();
			break;
		case R.id.item2:
			readMail();
			Toast.makeText(
					this, "Item 2 clicked", Toast.LENGTH_SHORT)
					.show();
			break;
		case R.id.item3:
			loginToFacebook();
			Toast.makeText(
					this, "Item 3 clicked", Toast.LENGTH_SHORT)
					.show();
			break;
		case R.id.item4:
			loginToTwitter();
			Toast.makeText(
					this, "Item 4 clicked", Toast.LENGTH_SHORT)
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
	
	
	private ActionMode.Callback mActionModeCallback = new ActionMode.Callback() {

	    // Called when the action mode is created; startActionMode() was called
	    @Override
	    public boolean onCreateActionMode(ActionMode mode, Menu menu) {
	        // Inflate a menu resource providing context menu items
	        MenuInflater inflater = mode.getMenuInflater();
	        inflater.inflate(R.menu.menu_main, menu);
	        return true;
	    }

	    // Called each time the action mode is shown. Always called after onCreateActionMode, but
	    // may be called multiple times if the mode is invalidated.
	    @Override
	    public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
	        return false; // Return false if nothing is done
	    }

	    // Called when the user selects a contextual menu item
	    @Override
	    public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
	        switch (item.getItemId()) {
	            case R.id.item1:
	                mode.finish(); // Action picked, so close the CAB
	                return true;
	            default:
	                return false;
	        }
	    }

	    // Called when the user exits the action mode
	    @Override
	    public void onDestroyActionMode(ActionMode mode) {
	        mActionMode = null;
	    }
	};
}
