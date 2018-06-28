package cas.satar.com.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class QatarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qatar);

        // LUO WEBNÄKYMÄ-OLIO
        WebView QatarWebView;
        // XML-LAYOUTISTA WEBNÄKYMÄN VIITTAUKSEN HAKEMINEN JA TYYPPIMUUNNOS
        QatarWebView = (WebView) findViewById(R.id.WebviewQatar);
        // HTML-TIEDOSTON LATAAMINEN WEB NÄKYMÄÄN
        QatarWebView.loadUrl("file:///android_asset/Qatar.html");
    }
}
