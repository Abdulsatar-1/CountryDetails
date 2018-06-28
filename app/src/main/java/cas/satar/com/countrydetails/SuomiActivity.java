package cas.satar.com.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class SuomiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suomi);

        // LUO WEBNÄKYMÄ-OLIO
        WebView SuomiWebView;
        // XML-LAYOUTISTA WEBNÄKYMÄN VIITTAUKSEN HAKEMINEN JA TYYPPIMUUNNOS
        SuomiWebView = (WebView) findViewById(R.id.WebviewSuomi);
        // HTML-TIEDOSTON LATAAMINEN WEB NÄKYMÄÄN
        SuomiWebView.loadUrl("file:///android_asset/Suomi.html");
    }
}
