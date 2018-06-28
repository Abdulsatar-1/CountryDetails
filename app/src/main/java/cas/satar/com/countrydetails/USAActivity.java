package cas.satar.com.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class USAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usa);

        // LUO WEBNÄKYMÄ-OLIO
        WebView USAWebView;
        // XML-LAYOUTISTA WEBNÄKYMÄN VIITTAUKSEN HAKEMINEN JA TYYPPIMUUNNOS
        USAWebView = (WebView) findViewById(R.id.WebviewUSA);
        // HTML-TIEDOSTON LATAAMINEN WEB NÄKYMÄÄN
        USAWebView.loadUrl("file:///android_asset/USA.html");
    }
}
