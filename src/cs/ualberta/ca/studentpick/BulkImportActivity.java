package cs.ualberta.ca.studentpick;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class BulkImportActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bulk_student_layout);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bulk_import, menu);
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
	
	public void addStudentsAction(View v){
		EditText view = (EditText) findViewById(R.id.bulkStudentText);
		//capturing the text from edittext - sending it to a character sequence
		String text = view.getText().toString();
		StudentListController st = new StudentListController();
		st.bulkImport(text);
		view.setText("");
		Toast.makeText(this, "THanks for the STudents", Toast.LENGTH_SHORT).show();
	}
}
