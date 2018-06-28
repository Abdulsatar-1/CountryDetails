package cas.satar.com.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class BrasiliaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brasilia);

        // LUO WEBNÄKYMÄ-OLIO
        WebView BrasiliaWebView;
        // XML-LAYOUTISTA WEBNÄKYMÄN VIITTAUKSEN HAKEMINEN JA TYYPPIMUUNNOS
       BrasiliaWebView  = (WebView) findViewById(R.id.WebviewBra);
        // HTML-TIEDOSTON LATAAMINEN WEB NÄKYMÄÄN
        BrasiliaWebView.loadUrl("file:///android_asset/Brasilia.html");
    }
}
