package activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.clases.taller.taller1.R;

public class Resultado extends Activity {

	private TextView txtMensaje;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_resultado);
		
		txtMensaje = (TextView) findViewById(R.id.txtMensaje);
		
		Intent intent = getIntent();
		Bundle bundle = intent.getBundleExtra("extras");
		
		String mensaje = bundle.getString("mensaje");
		
		txtMensaje.setText(bundle.getString("mensaje"));
		
		Toast toast = Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_SHORT);
		toast.show();
		
		Log.i("Taller1", mensaje);
		
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		
		Log.i("Taller", "Inicio");
	}

}
