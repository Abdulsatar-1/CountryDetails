package cas.satar.com.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class UruguayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uruguay);

        // LUO WEBNÄKYMÄ-OLIO
        WebView UruWebView;
        // XML-LAYOUTISTA WEBNÄKYMÄN VIITTAUKSEN HAKEMINEN JA TYYPPIMUUNNOS
        UruWebView  = (WebView) findViewById(R.id.WebviewUru);
        // HTML-TIEDOSTON LATAAMINEN WEB NÄKYMÄÄN
        UruWebView.loadUrl("file:///android_asset/Uruguay.html");
    }
}
