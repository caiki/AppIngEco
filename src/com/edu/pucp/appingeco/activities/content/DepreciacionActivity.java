package com.edu.pucp.appingeco.activities.content;

import com.example.appingeco3.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DepreciacionActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.depreciacion); 
		 TextView txtCambiado = (TextView)findViewById(R.id.depreciacionTextView01);
		 txtCambiado.setText( 
		"D�nde:\n"+
		"VLt : 	valor en libros del activo fijo o valor que muestra la contabilidad a la fecha �t�.\n"+
		"S: 	es la suma de los d�gitos que identifican a cada per�odo.\n"+
		"R: 	es el valor  de  recuperaci�n.\n"+
		"P: 	costo  inicial.\n"+
		"Dt :	es  la  depreciaci�n  acumulada y muestra los gastos de depreciaci�n acumulados de cada per�odo hasta la fecha �t�.");
		 TextView txtCambiado2 = (TextView)findViewById(R.id.depreciacionTextView03);
		 txtCambiado2.setText("ESCUDO TRIBUTARIO POR GASTOS DE DEPRECIACI�N= Gastos de Depreciaci�n* T\n"+
		"ESCUDO TRIBUTARIO POR GASTOS DE DEPRECIACI�N = dt * T\n"+
		"D�nde:\n"+
		"dt:	es el gasto de depreciaci�n en el per�odo �t�.\n"+
		"T: 	tasa del Impuesto a la Renta.");
}}
