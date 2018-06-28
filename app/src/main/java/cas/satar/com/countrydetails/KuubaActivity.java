package cas.satar.com.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class KuubaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuuba);

        // LUO WEBNÄKYMÄ-OLIO
        WebView KuubaWebView;
        // XML-LAYOUTISTA WEBNÄKYMÄN VIITTAUKSEN HAKEMINEN JA TYYPPIMUUNNOS
        KuubaWebView = (WebView) findViewById(R.id.WebviewKuuba);
        // HTML-TIEDOSTON LATAAMINEN WEB NÄKYMÄÄN
        KuubaWebView.loadUrl("file:///android_asset/Kuuba.html");
    }
}
