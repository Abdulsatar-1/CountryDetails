package cas.satar.com.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class KreikkaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kreikka);

        // LUO WEBNÄKYMÄ-OLIO
        WebView KreikkaWebView;
        // XML-LAYOUTISTA WEBNÄKYMÄN VIITTAUKSEN HAKEMINEN JA TYYPPIMUUNNOS
        KreikkaWebView = (WebView) findViewById(R.id.WebviewKreikka);
        // HTML-TIEDOSTON LATAAMINEN WEB NÄKYMÄÄN
        KreikkaWebView.loadUrl("file:///android_asset/Kreikka");
    }
}
