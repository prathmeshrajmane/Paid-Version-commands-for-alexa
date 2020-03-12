package com.echo.dot.guideforamazonecho.commandsforalexa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;


import android.widget.ImageButton;
import android.widget.ImageButton;


public class Main21Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);

        WebView wv;
        wv = (WebView) findViewById(R.id.myWebView);
        wv.loadUrl("file:///android_asset/super.html");
        wv.getSettings().setJavaScriptEnabled(true);



    }

}