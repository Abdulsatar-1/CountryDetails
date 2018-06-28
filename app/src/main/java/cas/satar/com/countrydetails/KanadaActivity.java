package cas.satar.com.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class KanadaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanada);

        // LUO WEBNÄKYMÄ-OLIO
        WebView KanadaWebView;
        // XML-LAYOUTISTA WEBNÄKYMÄN VIITTAUKSEN HAKEMINEN JA TYYPPIMUUNNOS
        KanadaWebView = (WebView) findViewById(R.id.WebviewKanada);
        // HTML-TIEDOSTON LATAAMINEN WEB NÄKYMÄÄN
        KanadaWebView.loadUrl("file:///android_asset/Kanada.html");
    }
}
