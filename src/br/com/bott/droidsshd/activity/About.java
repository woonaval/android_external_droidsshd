/**
 * 
 */
package br.com.bott.droidsshd.activity;

import br.com.bott.droidsshd.R;
import br.com.bott.droidsshd.system.Base;
import br.com.bott.droidsshd.system.Util;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

/**
 * @author tpruvot
 * 
 */
public class About extends Activity {

	private static final String TAG = "DroidSSHd-About";

	private Button buttonOk;
	private TextView textAbout;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (Base.getContext() == null) {
			Base.initialize(getBaseContext());
		} else {
			Base.refresh();
		}
		// requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.about);
		
		textAbout = (TextView) findViewById(R.id.text_about);
		
		buttonOk = (Button) findViewById(R.id.button_about_ok);
		buttonOk.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				setResult(RESULT_CANCELED, getIntent());
				finish();
				finishActivity(R.string.activity_about);
			}
		});

	}

}

