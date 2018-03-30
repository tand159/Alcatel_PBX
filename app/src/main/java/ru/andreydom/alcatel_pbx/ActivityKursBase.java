package ru.andreydom.alcatel_pbx;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class ActivityKursBase extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurs_base);

        WebView web = (WebView)findViewById(R.id.webview_kurs_base);
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebChromeClient(new WebChromeClient());
        web.loadUrl("file:///android_asset/www/index.html");
    }
}
