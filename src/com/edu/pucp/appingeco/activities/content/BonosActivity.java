package com.edu.pucp.appingeco.activities.content;

import com.example.appingeco3.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class BonosActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.financia_bonos);
		TextView txtCambiado = (TextView)findViewById(R.id.bonosTextView1);
		 txtCambiado.setText("PC: precio de colocaci�n, precio de compra del adquiriente del bono o inversionista.\n"+
		"GE: gastos de emisi�n.\n"+
		"iB: tasa de inter�s del bono, tambi�n llamada tasa cup�n.\n"+
		"I:	 importe de los intereses del bono.\n"+
		"VN: valor nominal del bono.\n"+
		"R:	 valor de redenci�n.\n"+
		"n:  vida del bono.");	
	}
}
