package com.echo.dot.guideforamazonecho.commandsforalexa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;




public class Main13Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        WebView wv;
        wv = (WebView) findViewById(R.id.myWebView);
        wv.loadUrl("file:///android_asset/chr.html");
        wv.getSettings().setJavaScriptEnabled(true);

        wv.getSettings().setBuiltInZoomControls(true);



    }


}