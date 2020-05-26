package com.designpattern.basic.chainofresponsibility.code;

import android.util.Log;

public class NoSupport extends Support {
    private static String TAG = NoSupport.class.getSimpleName();

    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        Log.e(TAG, "nosupport");
        return false;
    }
}
