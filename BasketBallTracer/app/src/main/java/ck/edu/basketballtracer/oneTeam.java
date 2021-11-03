package ck.edu.basketballtracer;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class oneTeam extends AppCompatActivity {
    private Button butRetour;
    private TextView timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oneteam);
        getSupportActionBar().hide();
        butRetour = (Button) findViewById(R.id.buttonRetour2);
        butRetour.setBackgroundColor(Color.rgb(204,102,51));
        timer = findViewById(R.id.timer);
        long duration = TimeUnit.MINUTES.toMillis(48);
        new CountDownTimer(duration, 1000) {
            @Override
            public void onTick(long l) {
                String sDuration = String.format(Locale.ENGLISH, "%02d : %02d"
                        , TimeUnit.MILLISECONDS.toMinutes(l)
                        , TimeUnit.MILLISECONDS.toSeconds(l) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(l)));
                timer.setText(sDuration);
            }

            @Override
            public void onFinish() {
                Toast.makeText(getApplicationContext(), "Fin du match !", Toast.LENGTH_LONG).show();
            }
        }.start();

    }

    public void redirectNewMatch(View view){
        Intent monIntent = new Intent(oneTeam.this, newMatch.class);
        startActivity(monIntent);
    }
}
