package cas.satar.com.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class JamaikaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jamaika);

        // LUO WEBNÄKYMÄ-OLIO
        WebView JamaikaWebView;
        // XML-LAYOUTISTA WEBNÄKYMÄN VIITTAUKSEN HAKEMINEN JA TYYPPIMUUNNOS
        JamaikaWebView = (WebView) findViewById(R.id.WebviewJamaika);
        // HTML-TIEDOSTON LATAAMINEN WEB NÄKYMÄÄN
        JamaikaWebView.loadUrl("file:///android_asset/jamaica.html");
    }
}
