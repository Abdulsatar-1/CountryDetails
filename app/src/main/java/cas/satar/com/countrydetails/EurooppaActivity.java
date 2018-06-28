package cas.satar.com.countrydetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EurooppaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eurooppa);

        // LUODAAN BUTTON PAINIKE
        Button btSuomeen;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btSuomeen = (Button)findViewById(R.id.btSuomi);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btSuomeen.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirrySuomeen = new Intent(EurooppaActivity.this, SuomiActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirrySuomeen);
            }
        });

        // LUODAAN BUTTON PAINIKE
        Button btSaksan;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btSaksan = (Button)findViewById(R.id.btSaksa);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btSaksan.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirrySaksaan = new Intent(EurooppaActivity.this, SaksaActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirrySaksaan);
            }
        });

        // LUODAAN BUTTON PAINIKE
        Button btRanskan;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btRanskan = (Button)findViewById(R.id.btRanska);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btRanskan.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirryRanskaan = new Intent(EurooppaActivity.this, RanskaActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirryRanskaan);
            }
        });

        // LUODAAN BUTTON PAINIKE
        Button btItaliaan;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btItaliaan = (Button)findViewById(R.id.btItalia);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btItaliaan.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirryItaliaan = new Intent(EurooppaActivity.this, ItaliaActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirryItaliaan);
            }
        });

        Button btKreikka;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btKreikka = (Button)findViewById(R.id.btKreikka);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btKreikka.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirryKreikkaan = new Intent(EurooppaActivity.this, KreikkaActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirryKreikkaan);
            }
        });

        Button btEspanja;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btEspanja = (Button)findViewById(R.id.btEspanja);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btEspanja.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirryEspanjaan = new Intent(EurooppaActivity.this, EspanjaActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirryEspanjaan);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_eurooppa, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {
            case R.id.Etusivu:
                Intent intent = new Intent(EurooppaActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Siirryttiin etusivulle", Toast.LENGTH_LONG).show();
        }

        switch (item.getItemId()) {
            case R.id.Aasia:
                Intent intent = new Intent(EurooppaActivity.this, AasiaActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Siirryttiin aasiaan", Toast.LENGTH_LONG).show();
        }

        switch (item.getItemId()) {
            case R.id.PA:
                Intent intent = new Intent(EurooppaActivity.this, PohjoisAmerikkaActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Siirryttiin pohjois-Amerikkan", Toast.LENGTH_LONG).show();
        }

        switch (item.getItemId()) {
            case R.id.EA:
                Intent intent = new Intent(EurooppaActivity.this, EtelaAmerikkaActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Siirryttiin etelä-Amerikkan", Toast.LENGTH_LONG).show();
        }

        return false;
    }


}
