package com.edu.pucp.appingeco.activities.content;

import com.example.appingeco3.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class FactoresEquivalencia2Activity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.facts_equivalencia2);
		
		TextView txtCambiado  = (TextView)findViewById(R.id.factsEqui3TextView1);
		txtCambiado.setText("Donde:\n"+
		"P:valor presente de la serie tri�ngulo de pagos.\n"+
		"G:cambio aritm�tico constante del monto de un per�odo al siguiente."+
		"(Tambi�n llamada la gradiente lineal o gradiente aritm�tica).\n"+
		"i:tasa de inter�s compuesta en cada per�odo.\n" +
		"n:cantidad de per�odos.\n"+
		"A*:monto inicial en el primer per�odo.\n"+
		"g:porcentaje de aumento o disminuci�n de un per�odo al siguiente.");
	}
}
