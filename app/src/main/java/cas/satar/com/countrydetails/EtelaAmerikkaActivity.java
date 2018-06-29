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

public class EtelaAmerikkaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etela_amerikka);

        // LUODAAN BUTTON PAINIKE
        Button btBrasiliaan;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btBrasiliaan = (Button)findViewById(R.id.btBrasilia);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btBrasiliaan.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirrybrasiliaan = new Intent(EtelaAmerikkaActivity.this, BrasiliaActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirrybrasiliaan);
            }
        });

        // LUODAAN BUTTON PAINIKE
        Button btArgentiina;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btArgentiina = (Button)findViewById(R.id.btArg);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btArgentiina.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirryargentinaan = new Intent(EtelaAmerikkaActivity.this, ArgentiinaActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirryargentinaan);
            }
        });

        // LUODAAN BUTTON PAINIKE
        Button btKOLUMBIa;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btKOLUMBIa = (Button)findViewById(R.id.btKolumbia);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btKOLUMBIa.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirryKolumbiaan = new Intent(EtelaAmerikkaActivity.this, KolumbiaActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirryKolumbiaan);
            }
        });

        // LUODAAN BUTTON PAINIKE
        Button bturuguayin;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        bturuguayin = (Button)findViewById(R.id.btUru);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        bturuguayin.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirryuruguayin = new Intent(EtelaAmerikkaActivity.this, UruguayActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirryuruguayin);
            }
        });

        // LUODAAN BUTTON PAINIKE
        Button btChile;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btChile = (Button)findViewById(R.id.btChile);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btChile.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirryChileen = new Intent(EtelaAmerikkaActivity.this, ChileActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirryChileen);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_ea, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {
            case R.id.Etusivu:
                Intent intent = new Intent(EtelaAmerikkaActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Siirryttiin etusivulle", Toast.LENGTH_LONG).show();
        }

        switch (item.getItemId()) {
            case R.id.Eurooppa:
                Intent intent = new Intent(EtelaAmerikkaActivity.this, EurooppaActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Siirryttiin eurooppaan", Toast.LENGTH_LONG).show();
        }

        switch (item.getItemId()) {
            case R.id.PA:
                Intent intent = new Intent(EtelaAmerikkaActivity.this, PohjoisAmerikkaActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Siirryttiin pohjois-Amerikkan", Toast.LENGTH_LONG).show();
        }

        switch (item.getItemId()) {
            case R.id.Aasia:
                Intent intent = new Intent(EtelaAmerikkaActivity.this, AasiaActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Siirryttiin aasiaan", Toast.LENGTH_LONG).show();
        }
        return false;
    }
}
