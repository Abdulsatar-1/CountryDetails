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

public class AasiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aasia);



        // LUODAAN BUTTON PAINIKE
        Button btIntiaan;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btIntiaan = (Button)findViewById(R.id.btIntia);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btIntiaan.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirrySeuraavaan = new Intent(AasiaActivity.this, IntiaActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirrySeuraavaan);
            }
        });
        Button btKiinan;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btKiinan = (Button)findViewById(R.id.btKiina);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btKiinan.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirrySeuraavaan = new Intent(AasiaActivity.this, KiinaActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirrySeuraavaan);
            }
        });

        Button btAfg;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btAfg = (Button)findViewById(R.id.btAfg);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btAfg.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirrySeuraavaan = new Intent(AasiaActivity.this, AfganistanActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirrySeuraavaan);
            }
        });

        Button btDubaihin;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btDubaihin = (Button)findViewById(R.id.btdubai);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btDubaihin.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirryDubaihiin = new Intent(AasiaActivity.this, DubaiActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirryDubaihiin);
            }
        });

        Button btThaimaa;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btThaimaa = (Button)findViewById(R.id.btThailand);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btThaimaa.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirryThaimaan = new Intent(AasiaActivity.this, ThaimaaActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirryThaimaan);
            }
        });

        Button btQatar;
        // HAETAAN XML-TIEDOSTOSTA VIITTAUS BUTTONIIN
        btQatar = (Button)findViewById(R.id.btQatar);
        // LUODAAAN TAPAHTUMANKUUNTELIJA BUTTONILLE
        btQatar.setOnClickListener(new View.OnClickListener() {
            // ONCLICK METODISSA MÄÄRITETÄÄN MITÄ TAPAHTUU KUN PAINIKETTA PAINETAAN
            public void onClick(View v) {
                // LUODAAN INTENT OLIO
                Intent siirryQatariin = new Intent(AasiaActivity.this, QatarActivity.class);
                // KÄYNNISTETÄÄN TOINEN ACTIVITY
                startActivity(siirryQatariin);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_aasia, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {
            case R.id.Etusivu:
                Intent intent = new Intent(AasiaActivity.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Siirryttiin aasiaan", Toast.LENGTH_LONG).show();
        }

        switch (item.getItemId()) {
            case R.id.Eurooppa:
                Intent intent = new Intent(AasiaActivity.this, EurooppaActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Siirryttiin eurooppaan", Toast.LENGTH_LONG).show();
        }

        switch (item.getItemId()) {
            case R.id.PA:
                Intent intent = new Intent(AasiaActivity.this, PohjoisAmerikkaActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Siirryttiin pohjois-Amerikkan", Toast.LENGTH_LONG).show();
        }

        switch (item.getItemId()) {
            case R.id.EA:
                Intent intent = new Intent(AasiaActivity.this, EtelaAmerikkaActivity.class);
                startActivity(intent);
                Toast.makeText(this, "Siirryttiin etelä-Amerikkan", Toast.LENGTH_LONG).show();
        }
        return false;
    }
}
