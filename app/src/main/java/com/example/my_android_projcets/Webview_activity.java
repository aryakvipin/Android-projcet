package com.example.my_android_projcets;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Webview_activity extends AppCompatActivity {
     EditText editText;
     Button  button;
     WebView webviw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        editText=(EditText)findViewById(R.id.edittext2);
        button=(Button) findViewById(R.id.button2);
        webviw=(WebView) findViewById(R.id.web);
        webviw.setWebViewClient(new WebViewClient());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = editText.getText().toString();
                webviw.getSettings().setLoadsImagesAutomatically(true);
                webviw.getSettings().setJavaScriptEnabled(true);
                webviw.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webviw.loadUrl("https://www."+url+".com");

            }
        });
    }
}