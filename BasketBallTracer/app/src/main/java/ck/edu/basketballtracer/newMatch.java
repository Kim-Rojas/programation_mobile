package ck.edu.basketballtracer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class newMatch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_match_constraint);
        getSupportActionBar().hide();
    }

    public void redirectMain(View view){
        Intent monIntent = new Intent(newMatch.this, MainActivity.class);
        startActivity(monIntent);
    }
}
