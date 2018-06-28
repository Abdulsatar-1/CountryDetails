package cas.satar.com.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ArgentiinaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_argentiina);

        // LUO WEBNÄKYMÄ-OLIO
        WebView ArgentiinaWebView;
        // XML-LAYOUTISTA WEBNÄKYMÄN VIITTAUKSEN HAKEMINEN JA TYYPPIMUUNNOS
        ArgentiinaWebView  = (WebView) findViewById(R.id.WebviewARG);
        // HTML-TIEDOSTON LATAAMINEN WEB NÄKYMÄÄN
        ArgentiinaWebView.loadUrl("file:///android_asset/Argentiina.html");
    }
}
