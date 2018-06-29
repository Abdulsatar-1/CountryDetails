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

public class PohjoisAmerikkaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pohjois_amerikka);

        Button btUsa;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btUsa = (Button)findViewById(R.id.btUSA);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btUsa.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirryUSA = new Intent(PohjoisAmerikkaActivity.this, USAActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirryUSA);
            }
        });

        Button btKanada;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btKanada = (Button)findViewById(R.id.btKanada);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btKanada.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirryKanadaan = new Intent(PohjoisAmerikkaActivity.this, KanadaActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirryKanadaan);
            }
        });


        Button btKuubaan;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btKuubaan = (Button)findViewById(R.id.btKuuba);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btKuubaan.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirryKuubaan = new Intent(PohjoisAmerikkaActivity.this, KuubaActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirryKuubaan);
            }
        });

        Button btJamaika;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btJamaika = (Button)findViewById(R.id.btJamaika);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btJamaika.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirryJamikaan = new Intent(PohjoisAmerikkaActivity.this, JamaikaActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirryJamikaan);
            }
        });

        Button btBarbados;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btBarbados = (Button)findViewById(R.id.btBarbados);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btBarbados.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirryBarbados = new Intent(PohjoisAmerikkaActivity.this, BarbadosActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirryBarbados);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_pa, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {
            case R.id.Etusivu:
                Intent intent = new Intent(PohjoisAmerikkaActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Siirryttiin etusivulle", Toast.LENGTH_LONG).show();
        }

        switch (item.getItemId()) {
            case R.id.Eurooppa:
                Intent intent = new Intent(PohjoisAmerikkaActivity.this, EurooppaActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Siirryttiin eurooppaan", Toast.LENGTH_LONG).show();
        }

        switch (item.getItemId()) {
            case R.id.Aasia:
                Intent intent = new Intent(PohjoisAmerikkaActivity.this, AasiaActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Siirryttiin aasiaan", Toast.LENGTH_LONG).show();
        }

        switch (item.getItemId()) {
            case R.id.EA:
                Intent intent = new Intent(PohjoisAmerikkaActivity.this, EtelaAmerikkaActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Siirryttiin etelä-Amerikkan", Toast.LENGTH_LONG).show();
        }
        return false;
    }
}
