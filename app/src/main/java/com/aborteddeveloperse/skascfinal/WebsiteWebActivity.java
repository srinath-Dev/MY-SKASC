package com.aborteddeveloperse.skascfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;

import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class WebsiteWebActivity extends AppCompatActivity {

    private WebView mwebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website_web);

        mwebView = (WebView) findViewById(R.id.webViewWebsite);
        WebSettings webSettings = mwebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        //improve webView performance
        mwebView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        mwebView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        mwebView.getSettings().setAppCacheEnabled(true);
        mwebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webSettings.setUseWideViewPort(true);
        webSettings.setSavePassword(true);
        webSettings.setSaveFormData(true);
        webSettings.setEnableSmoothTransition(true);
        webSettings.setCacheMode(WebSettings.LOAD_DEFAULT);
        webSettings.setCacheMode(WebSettings.LOAD_DEFAULT);
        webSettings.setAppCacheEnabled(true);
        webSettings.setAppCacheMaxSize(100 * 1000 * 1000);

        mwebView.loadUrl("http://skasc.ac.in/");
        //force links open in webview only
        mwebView.setWebViewClient(new MyWebviewClient());


    }
    public class MyWebviewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if (Uri.parse(url).getHost().equals("http://skasc.ac.in/")) {
                //open url contents in webview
                return false;
            } else {
                //here open external links in external browser or app
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));


                return false;
            }

        }

        ProgressDialog pd = null;

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            pd = new ProgressDialog(WebsiteWebActivity.this);

            super.onPageStarted(view, url, favicon);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            pd.dismiss();
            super.onPageFinished(view, url);
        }



    }
}
