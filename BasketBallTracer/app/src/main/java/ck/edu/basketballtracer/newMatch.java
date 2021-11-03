package ck.edu.basketballtracer;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class newMatch extends AppCompatActivity {
    private Spinner spinnerModeSuivi;
    private Button butRetour;
    private Button butValider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_match_constraint);
        getSupportActionBar().hide();
        String[] equipes = new String[3];
        equipes[0] = "Equipe 1";
        equipes[1] = "Equipe 2";
        equipes[2] = "Les deux";
        this.spinnerModeSuivi = (Spinner) findViewById(R.id.modeSuiviBox);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,
                equipes);

        this.spinnerModeSuivi.setAdapter(adapter);

        butRetour = (Button) findViewById(R.id.buttonRetour);
        butValider = (Button) findViewById(R.id.buttonValider);

        butRetour.setBackgroundColor(Color.rgb(204,102,51));
        butValider.setBackgroundColor(Color.rgb(204,102,51));
    }

    public void redirectMain(View view){
        Intent monIntent = new Intent(newMatch.this, MainActivity.class);
        startActivity(monIntent);
    }

    public void redirectMatch(View view){
        Intent monIntent = new Intent(newMatch.this, oneTeam.class);
        startActivity(monIntent);
    }
}
