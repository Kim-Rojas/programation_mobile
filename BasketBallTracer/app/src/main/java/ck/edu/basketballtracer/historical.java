package ck.edu.basketballtracer;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class historical extends AppCompatActivity {
    Button butRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.historical);
        getSupportActionBar().hide();
        butRetour = (Button) findViewById(R.id.buttonRetour);

        butRetour.setBackgroundColor(Color.rgb(204,102,51));
    }

    public void redirectMain(View view){
        Intent monIntent = new Intent(historical.this, MainActivity.class);
        startActivity(monIntent);
    }
}
