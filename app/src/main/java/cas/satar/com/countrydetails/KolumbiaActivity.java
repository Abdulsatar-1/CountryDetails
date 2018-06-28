package cas.satar.com.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class KolumbiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolumbia);
        // LUO WEBNÄKYMÄ-OLIO
        WebView KolumbiaWebView;
        // XML-LAYOUTISTA WEBNÄKYMÄN VIITTAUKSEN HAKEMINEN JA TYYPPIMUUNNOS
        KolumbiaWebView  = (WebView) findViewById(R.id.WebviewKOl);
        // HTML-TIEDOSTON LATAAMINEN WEB NÄKYMÄÄN
        KolumbiaWebView.loadUrl("file:///android_asset/Kolumbia.html");
    }
}
