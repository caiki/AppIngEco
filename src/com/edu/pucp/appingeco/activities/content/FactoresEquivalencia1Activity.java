package com.edu.pucp.appingeco.activities.content;

import com.example.appingeco3.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
 
public class FactoresEquivalencia1Activity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.facts_equivalencia1);
		
		TextView txtCambiado1 = (TextView)findViewById(R.id.factsEqui2TextView1);
		txtCambiado1.setText("Donde:\n"+
		"P:valor presente de la serie de pagos uniforme.\n"+
		"A:monto constante desembolsado cada per�odo.\n"+
		"i:tasa de inter�s compuesta en cada per�odo.\n"+
		"n:cantidad de per�odos.\n"+
		"F:valor futuro de la serie de pagos uniforme");
	 
		
		
		
		
		
	}
}