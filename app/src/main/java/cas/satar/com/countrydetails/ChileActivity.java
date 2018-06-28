package cas.satar.com.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ChileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chile);

        // LUO WEBNÄKYMÄ-OLIO
        WebView ChileWebView;
        // XML-LAYOUTISTA WEBNÄKYMÄN VIITTAUKSEN HAKEMINEN JA TYYPPIMUUNNOS
        ChileWebView  = (WebView) findViewById(R.id.WebviewChile);
        // HTML-TIEDOSTON LATAAMINEN WEB NÄKYMÄÄN
        ChileWebView.loadUrl("file:///android_asset/Chile.html");
    }
}
