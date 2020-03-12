package com.echo.dot.guideforamazonecho.commandsforalexa;



import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageButton;


public class Main20Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);

        WebView wv;

        wv = (WebView) findViewById(R.id.myWebView);
        wv.loadUrl("file:///android_asset/book.html");
        wv.getSettings().setDomStorageEnabled(true);
        wv.getSettings().setJavaScriptEnabled(true);
        if (Build.VERSION.SDK_INT >= 19) {
            wv.setLayerType(View.LAYER_TYPE_HARDWARE, null);
        }
        else {
            wv.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        }

    }
}