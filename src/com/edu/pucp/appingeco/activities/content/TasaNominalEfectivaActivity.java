package com.edu.pucp.appingeco.activities.content;

import com.example.appingeco3.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TasaNominalEfectivaActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tasa_nom_y_efect);
		TextView txtCambiado   = (TextView)findViewById(R.id.tasNomEfecTextView1);
		txtCambiado.setText("Es la tasa referencial que por convenci�n se enuncia o nombra para realizar cualquier operaci�n financiera.");
		
		TextView txtCambiado1   = (TextView)findViewById(R.id.tasNomEfecTextView2);
		txtCambiado1.setText("Es la tasa de inter�s que s� considera el proceso de capitalizaci�n.");
		
		
		TextView txtCambiado2  = (TextView)findViewById(R.id.tasNomEfecTextView3);
		txtCambiado2.setText("Donde:\n"+
		"Iex = Tasa de inter�s efectiva requerida con per�odo de capitalizaci�n �x�.\n"+
		"Iey = Tasa de inter�s efectiva conocida con per�odo de capitalizaci�n �y�.\n"+
		"m = N�meros de per�odos de capitalizaci�n �y� comprendidos en el per�odo de capitalizaci�n �x�.");
	 
		
		 
		
	}
}
