package com.echo.dot.guideforamazonecho.commandsforalexa;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;




public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        WebView wv;
        wv = (WebView) findViewById(R.id.myWebView);
        wv.loadUrl("file:///android_asset/coro.html");
        wv.getSettings().setJavaScriptEnabled(true);




    }


}