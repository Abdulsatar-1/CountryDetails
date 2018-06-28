package cas.satar.com.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class IntiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toinen);

        // LUO WEBNÄKYMÄ-OLIO
        WebView IntiaWebView;
        // XML-LAYOUTISTA WEBNÄKYMÄN VIITTAUKSEN HAKEMINEN JA TYYPPIMUUNNOS
        IntiaWebView = (WebView) findViewById(R.id.WebviewIntia);
        // HTML-TIEDOSTON LATAAMINEN WEB NÄKYMÄÄN
        IntiaWebView.loadUrl("file:///android_asset/Intia.html");

    }
}
