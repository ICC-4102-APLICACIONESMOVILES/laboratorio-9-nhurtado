package com.example.ing.lab10;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.webkit.JavascriptInterface;

/**
 * Created by ING on 05-06-2018.
 */

public class WebAppInterface {
    Context mContext;

    WebAppInterface (Context c){
        mContext = c;
    }

    @JavascriptInterface
    public void consoleMessage(String s){
        Log.d("Mytag",s);
    }

    @JavascriptInterface
    public void finishActivity(){
        Activity ac = (Activity) mContext;
        ac.finish();
    }

}
