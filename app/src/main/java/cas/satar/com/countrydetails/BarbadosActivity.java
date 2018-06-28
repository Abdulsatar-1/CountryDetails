package cas.satar.com.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class BarbadosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barbados);

        // LUO WEBNÄKYMÄ-OLIO
        WebView BarbadosWebView;
        // XML-LAYOUTISTA WEBNÄKYMÄN VIITTAUKSEN HAKEMINEN JA TYYPPIMUUNNOS
        BarbadosWebView = (WebView) findViewById(R.id.WebviewBarbados);
        // HTML-TIEDOSTON LATAAMINEN WEB NÄKYMÄÄN
        BarbadosWebView.loadUrl("file:///android_asset/Barbados.html");
    }
}
