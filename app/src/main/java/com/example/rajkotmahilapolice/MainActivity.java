package com.example.rajkotmahilapolice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        webView = (WebView)findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());


        webView.loadUrl("https://mahilapolice.000webhostapp.com/");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowFileAccess(true);

        }
        @Override
        public void onBackPressed() {
            if(webView.canGoBack()){
                webView.goBack();
            }else {

                super.onBackPressed();
            }
        }

}
