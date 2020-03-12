package com.echo.dot.guideforamazonecho.commandsforalexa;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageButton;


public class Main22Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        WebView wv;
        wv = (WebView) findViewById(R.id.myWebView);
        wv.loadUrl("file:///android_asset/tricks.html");
        wv.getSettings().setDomStorageEnabled(true);
        wv.getSettings().setJavaScriptEnabled(true);




    }

}