package com.designpattern.chainofresponsibility.code;

import android.util.Log;

public class SpecialSupport extends Support {
    private static String TAG = SpecialSupport.class.getSimpleName();

    public SpecialSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        Log.e(TAG, "SpecialSupport");
        return true;
    }
}
