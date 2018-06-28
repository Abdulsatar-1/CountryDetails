package cas.satar.com.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class SaksaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saksa);

        // LUO WEBNÄKYMÄ-OLIO
        WebView SaksaWebView;
        // XML-LAYOUTISTA WEBNÄKYMÄN VIITTAUKSEN HAKEMINEN JA TYYPPIMUUNNOS
        SaksaWebView = (WebView) findViewById(R.id.WebviewSaksa);
        // HTML-TIEDOSTON LATAAMINEN WEB NÄKYMÄÄN
        SaksaWebView.loadUrl("file:///android_asset/Saksa.html");
    }
}
