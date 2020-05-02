package com.designpattern.adapter.code;

import android.util.Log;

//すでに提供されているもの
public class Banner {

    private static String TAG = Banner.class.getSimpleName();
    private String string;

    public Banner(String str) {
        string = str;
    }

    public void showWithParen() {
        Log.e(TAG, "(" + string + ")");
    }
}
