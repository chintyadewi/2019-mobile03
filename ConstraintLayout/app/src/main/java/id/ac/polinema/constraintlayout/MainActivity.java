package id.ac.polinema.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void nextPage(View view){
		Intent i = new Intent(MainActivity.this, LatihanRelative.class);
		startActivity(i);
	}
}
