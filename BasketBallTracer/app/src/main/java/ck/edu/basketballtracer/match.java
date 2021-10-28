package ck.edu.basketballtracer;

import android.content.Intent;
import android.database.MatrixCursor;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class match extends AppCompatActivity {
    private Button butRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.match);
        getSupportActionBar().hide();
        butRetour = (Button) findViewById(R.id.buttonRetour2);

        butRetour.setBackgroundColor(Color.rgb(204,102,51));
    }

    public void redirectNewMatch(View view){
        Intent monIntent = new Intent(match.this, newMatch.class);
        startActivity(monIntent);
    }
}
