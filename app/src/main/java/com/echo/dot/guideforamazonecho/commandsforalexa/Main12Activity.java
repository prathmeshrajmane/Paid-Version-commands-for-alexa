package com.echo.dot.guideforamazonecho.commandsforalexa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;


public class Main12Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        WebView wv;
        wv = (WebView) findViewById(R.id.myWebView);
        wv.loadUrl("file:///android_asset/facts.html");
        wv.getSettings().setJavaScriptEnabled(true);

        wv.getSettings().setBuiltInZoomControls(true);
    }
}