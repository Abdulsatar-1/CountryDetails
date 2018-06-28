package cas.satar.com.countrydetails;
/**
 * Author: Andulsatar Qaderzada 29.6.2016
 * Course: Android Programming
 * Haaga-Helia University of Applied Sciense
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());

        TextView textView = findViewById(R.id.dateTime);
        textView.setText(currentDate);




        // LUODAAN BUTTON PAINIKE
        Button btAasia;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btAasia = (Button) findViewById(R.id.btAasia);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btAasia.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirryAasiaan = new Intent(MainActivity.this, AasiaActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirryAasiaan);
            }
        });


        // LUODAAN BUTTON PAINIKE
        Button btEurooppa;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btEurooppa = (Button) findViewById(R.id.btEurooppa);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btEurooppa.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirryEuroppaan = new Intent(MainActivity.this, EurooppaActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirryEuroppaan);
            }
        });

        // LUODAAN BUTTON PAINIKE
        Button btPA;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btPA = (Button) findViewById(R.id.btPA);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btPA.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirryPohjoiAmerikkaan = new Intent(MainActivity.this, PohjoisAmerikkaActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirryPohjoiAmerikkaan);
            }
        });

        // LUODAAN BUTTON PAINIKE
        Button btEA;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btEA = (Button) findViewById(R.id.btEA);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btEA.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirryEtelaAmerikkaan = new Intent(MainActivity.this, EtelaAmerikkaActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirryEtelaAmerikkaan);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {
            case R.id.Aasia:
                Intent intent = new Intent(MainActivity.this, AasiaActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Siirryttiin aasiaan", Toast.LENGTH_LONG).show();
        }

        switch (item.getItemId()) {
            case R.id.Eurooppa:
                Intent intent = new Intent(MainActivity.this, EurooppaActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Siirryttiin eurooppaan", Toast.LENGTH_LONG).show();
        }

        switch (item.getItemId()) {
            case R.id.PA:
                Intent intent = new Intent(MainActivity.this, PohjoisAmerikkaActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Siirryttiin pohjois-Amerikkan", Toast.LENGTH_LONG).show();
        }

        switch (item.getItemId()) {
            case R.id.EA:
                Intent intent = new Intent(MainActivity.this, EtelaAmerikkaActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Siirryttiin etelä-Amerikkan", Toast.LENGTH_LONG).show();
        }

        return false;
    }
}


