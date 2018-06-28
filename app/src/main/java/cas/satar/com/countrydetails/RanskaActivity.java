package cas.satar.com.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class RanskaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranska);

        // LUO WEBNÄKYMÄ-OLIO
        WebView RanskaWebView;
        // XML-LAYOUTISTA WEBNÄKYMÄN VIITTAUKSEN HAKEMINEN JA TYYPPIMUUNNOS
        RanskaWebView = (WebView) findViewById(R.id.WebviewRanska);
        // HTML-TIEDOSTON LATAAMINEN WEB NÄKYMÄÄN
        RanskaWebView.loadUrl("file:///android_asset/Ranska.html");
    }
}
