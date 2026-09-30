package com.gprc.practice;
import android.app.*;
import android.os.*;
import android.webkit.*;
import android.view.*;
public class MainActivity extends Activity {
 @Override public void onCreate(Bundle b){super.onCreate(b);
  WebView w=new WebView(this); w.getSettings().setJavaScriptEnabled(true);
  w.getSettings().setDomStorageEnabled(true); w.setWebViewClient(new WebViewClient());
  setContentView(w); w.loadUrl("file:///android_asset/index.html");
 }
}