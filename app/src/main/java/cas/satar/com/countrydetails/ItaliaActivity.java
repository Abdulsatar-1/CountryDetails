package cas.satar.com.countrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ItaliaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italia);

        // LUO WEBNÄKYMÄ-OLIO
        WebView ItaliaWebView;
        // XML-LAYOUTISTA WEBNÄKYMÄN VIITTAUKSEN HAKEMINEN JA TYYPPIMUUNNOS
        ItaliaWebView = (WebView) findViewById(R.id.WebviewItalia);
        // HTML-TIEDOSTON LATAAMINEN WEB NÄKYMÄÄN
        ItaliaWebView.loadUrl("file:///android_asset/Italia.html");
    }
}
