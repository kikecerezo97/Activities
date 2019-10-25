package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class activity3 extends AppCompatActivity {
    WebView browser;
    String BASE_URL="http://www.movilzona.es";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3);
        // Definimos el webView
        browser=(WebView)findViewById(R.id.webView);

        browser.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        // Cargamos la web
        browser.loadUrl(BASE_URL);
        browser.getSettings().setJavaScriptEnabled(true);//habilitar JavaScript ya que, de lo contrario, muchas webs cargarán mal.
        browser.getSettings().setBuiltInZoomControls(true); // Habilita el Zoom
        browser.getSettings().setDisplayZoomControls(false); // Oculta los botones de zoom, haciendo que solo funcione con gestos

    }
    /*
           Hacer que el botón «back» de nuestro smartphone vuelva a la página anterior

            */
    public void onBackPressed()
    {
        if (browser.canGoBack())
        {
            browser.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
