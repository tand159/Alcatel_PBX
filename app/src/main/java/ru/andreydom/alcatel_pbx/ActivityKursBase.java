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

        // установка черного цвета фона для комфортной работы (по умолчанию – белый)
        /*web.setBackgroundColor(android.R.color.black);             - раньше было */
        web.setBackgroundColor(getResources().getColor(android.R.color.white));

        web.getSettings().setJavaScriptEnabled(true);
        web.setWebChromeClient(new WebChromeClient());
        //web.loadUrl("file:///android_asset/www/index.html");         //- отображение рисунка через WebView
        web.loadUrl("file:///android_asset/img_kurs_base_001.png");

        // Включаем поддержку масштабирования
        web.getSettings().setSupportZoom(true);
        web.getSettings().setBuiltInZoomControls(true);

        // больше места для нашей картинки
        web.setPadding(0, 0, 0, 0);

        // полосы прокрутки – внутри изображения, увеличение места для просмотра
        //web.setScrollbarFadingEnabled(true);
        //web.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);


    }
}
