package at.elektroschock.eyefood;

import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.view.*;

public class FoodView extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	MenuInflater inflater = getMenuInflater();
    	inflater.inflate(R.menu.food_menu, menu);
    	return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch(item.getItemId()) {
    	case R.id.upload:
    		Intent intent = new Intent(this, UploadView.class);
    		startActivity(intent);
    	}
    	return true;
    }
}