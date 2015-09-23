package ir.aghaeizadeh.AndroidPersianCalenderTest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class AndroidPersianCalenderTestActivity extends Activity {
	/** Called when the activity is first created. */
	TextView tv1;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		tv1 = (TextView) findViewById(R.id.textView1);
		ir.aghaeizadeh.AndroidPersianCalenderTest.CalendarTool ct = new CalendarTool(
				2015, 5, 19);
		
		Log.i("FarzadTestLOG", ct.getGregorianDate());
		tv1.setText(ct.getIranianDate(true));
		
		/*
		 * Calendar c = Calendar.getInstance(); int seconds =
		 * c.get(Calendar.DATE); tv1.setText(Integer.toString(seconds));
		 */
	}
}