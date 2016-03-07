package com.example.tisa.whack;

import android.content.Context;
import android.webkit.WebView;

/**
 * Created by Tisa on 2/8/2016.
 */

public class GifWebView extends WebView {

    public GifWebView(Context context, String path) {
        super(context);

        loadUrl(path);
    }
}
