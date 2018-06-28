package cas.satar.com.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ThaimaaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thaimaa);

        // LUO WEBNÄKYMÄ-OLIO
        WebView ThaimaaWebView;
        // XML-LAYOUTISTA WEBNÄKYMÄN VIITTAUKSEN HAKEMINEN JA TYYPPIMUUNNOS
        ThaimaaWebView = (WebView) findViewById(R.id.WebviewThaimaa);
        // HTML-TIEDOSTON LATAAMINEN WEB NÄKYMÄÄN
        ThaimaaWebView.loadUrl("file:///android_asset/Thaimaa.html");
    }
}
