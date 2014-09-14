package cs.ualberta.ca.studentpick;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public void editStudents(MenuItem menu){
		Toast.makeText(this, "Edit Students", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(MainActivity.this, ListStudentsActivity.class);
		startActivity(intent);
	}
	public void bulkImport(MenuItem menu){
		Toast.makeText(this, "Bulk Import", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(MainActivity.this, BulkImportActivity.class);
		startActivity(intent);
	}
}
