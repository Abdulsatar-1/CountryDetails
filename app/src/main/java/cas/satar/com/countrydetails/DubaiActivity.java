package cas.satar.com.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class DubaiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dubai);

        // LUO WEBNÄKYMÄ-OLIO
        WebView DUbaiWebView;
        // XML-LAYOUTISTA WEBNÄKYMÄN VIITTAUKSEN HAKEMINEN JA TYYPPIMUUNNOS
        DUbaiWebView = (WebView) findViewById(R.id.WebviewDubai);
        // HTML-TIEDOSTON LATAAMINEN WEB NÄKYMÄÄN
        DUbaiWebView.loadUrl("file:///android_asset/Dubai.html");
    }
}
