package activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.clases.taller.taller1.R;

public class Main extends Activity {
	
	private Button btn1;
	private Context context;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		context = this;
		
		btn1 = (Button) findViewById(R.id.button1);
		
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Main.this, Resultado.class);
				
				Bundle bundle = new Bundle();
				bundle.putString("mensaje", "Este es una prueba.");
				
				intent.putExtra("extras", bundle);
				
				startActivity(intent);
			}
		});
		
	}
	
	

}
