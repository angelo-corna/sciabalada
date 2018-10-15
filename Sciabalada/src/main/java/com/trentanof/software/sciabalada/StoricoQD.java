package com.trentanof.software.sciabalada;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class StoricoQD extends Activity {
	
	RelativeLayout rl;
	RadioGroup rg;
	final Context context = this;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_storico);

		// Get the message from the intent
		Intent intent = getIntent();
		String logStorico = intent.getStringExtra(PartitaScala40QD.EXTRA_MESSAGE);

		TextView storico = (TextView) findViewById(R.id.storico);
		storico.setText(logStorico);

	}

}