package ck.edu.basketballtracer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private Spinner spinnerLanguage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        connexionToDB();
        String[] langues = new String[2];
        langues[0] = "Francais";
        langues[1] = "English";

        this.spinnerLanguage = (Spinner) findViewById(R.id.spinnerLang);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,
                langues);

        this.spinnerLanguage.setAdapter(adapter);
    }



    protected void connexionToDB(){
        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://10.0.2.2:3306/basketballtracer", "root", "");
                    System.out.println("Connexion main reussi");

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }}).start();
    }

    public void redirectNewMatch(View view){
        Intent monIntent = new Intent(MainActivity.this, newMatch.class);
        startActivity(monIntent);
    }

    public void redirectHistorical(View view){
        Intent monIntent = new Intent(MainActivity.this, historical.class);
        startActivity(monIntent);
    }

    public void redirectMap(View view){
        Intent monIntent = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(monIntent);
    }

    public void getLanguage(View view){
        Button bouton = (Button) findViewById(R.id.langue);
        String lang;

        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();

        if(spinnerLanguage.getSelectedItem().equals("Francais")){
            lang = "fr";
            changeLanguage(lang);

        } else {
            lang = "en";
            changeLanguage(lang);
        }

        //setButtonLanguage();
    }

    public void changeLanguage(String lang){
        Locale myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        Intent refresh = new Intent(this, MainActivity.class);
        startActivity(refresh);

        //finish();
    }

    public void setButtonLanguage(){
        Button bouton = (Button) findViewById(R.id.langue);

        if(bouton.equals("Francais") || bouton.equals("French")){
            bouton.setText("English");
        } else {
            bouton.setText("Francais");
        }
    }
}
