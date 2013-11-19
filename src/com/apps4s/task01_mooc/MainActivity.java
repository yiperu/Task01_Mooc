package com.apps4s.task01_mooc;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Creamos el listView
		ListView lista = (ListView)findViewById(R.id.listViewTiendas);
		ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.tiendas, android.R.layout.simple_spinner_dropdown_item);
		adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		lista.setAdapter(adaptador);
		
		lista.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Intent intento = new Intent(MainActivity.this,DetalleActivity.class);
				startActivity(intento);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
