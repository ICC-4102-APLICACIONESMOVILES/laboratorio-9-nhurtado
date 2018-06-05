package com.example.ing.lab10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("http://demo.tutorialzine.com/2012/04/mobile-touch-gallery/");
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        WebAppInterface webAppInterface = new WebAppInterface(this);
        myWebView.addJavascriptInterface(webAppInterface,"android");
        webAppInterface.consoleMessage("dsa");

    }
    @Override
    public void onBackPressed() {
        Log.d("MyApp","Se apreto volver.");
        if (myWebView.canGoBack()) {
            myWebView.goBack();
        }
    }
}
