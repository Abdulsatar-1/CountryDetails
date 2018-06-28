package cas.satar.com.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class EspanjaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espanja);

        // LUO WEBNÄKYMÄ-OLIO
        WebView EspWebView;
        // XML-LAYOUTISTA WEBNÄKYMÄN VIITTAUKSEN HAKEMINEN JA TYYPPIMUUNNOS
        EspWebView = (WebView) findViewById(R.id.WebviewEspanja);
        // HTML-TIEDOSTON LATAAMINEN WEB NÄKYMÄÄN
        EspWebView.loadUrl("file:///android_asset/Espanja.html");
    }
}
