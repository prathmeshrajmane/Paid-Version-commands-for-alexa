package com.echo.dot.guideforamazonecho.commandsforalexa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageButton;


import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main9Activity extends Activity {
    WebView myWebView;
    public static boolean flag = false;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myWebView = new WebView(this);
        myWebView.setLayerType(View.LAYER_TYPE_HARDWARE, null);


        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.loadUrl("file:///android_asset/Seasons.html");
        setContentView(myWebView);
        myWebView.setWebViewClient(new WebViewClient() {
            public void onPageFinished(WebView view, String url) {
                if (url.contains("#") && flag == false) {
                    myWebView.loadUrl(url);
                    flag = true;
                } else {
                    flag = false;
                }
            }


        });


    }
    public void onBackPressed() {
        if (myWebView.canGoBack()) {
            myWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
    }
}

