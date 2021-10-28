package ck.edu.basketballtracer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        connexionToDB();
    }


    
    protected void connexionToDB(){
        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://10.0.2.2:3306/basketballtracer", "root", "");

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
}
