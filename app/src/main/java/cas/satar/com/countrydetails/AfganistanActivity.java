package cas.satar.com.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AfganistanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afganistan);

        // LUO WEBNÄKYMÄ-OLIO
        WebView AFGWebView;
        // XML-LAYOUTISTA WEBNÄKYMÄN VIITTAUKSEN HAKEMINEN JA TYYPPIMUUNNOS
        AFGWebView = (WebView) findViewById(R.id.WebviewAFG);
        // HTML-TIEDOSTON LATAAMINEN WEB NÄKYMÄÄN
        AFGWebView.loadUrl("file:///android_asset/Afgsnistan.html");
    }
}
