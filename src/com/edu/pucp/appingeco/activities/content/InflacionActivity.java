package com.edu.pucp.appingeco.activities.content;

import com.example.appingeco3.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class InflacionActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.inflacion);
		TextView txtCambiado = (TextView)findViewById(R.id.inflaTextView1);
		txtCambiado.setText("La inflaci�n es una subida duradera del nivel general de precios de los bienes y servicios de la econom�a."+
		"A partir del IPC (�ndice de Precios al Consumidor) la inflaci�n se determina as�:");
		
		TextView txtCambiado1 = (TextView)findViewById(R.id.inflaTextView2);
		txtCambiado1.setText("Deflactar un flujo de caja significa expresarlo en t�rminos de una moneda de poder adquisitivo constante, esta es la moneda real.");
	
	}
}
