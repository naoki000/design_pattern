package com.designpattern.basic.observer.code;

import android.util.Log;

public class DigitObserver implements Observer {
    private static String TAG = DigitObserver.class.getSimpleName();

    @Override
    public void update(NumberGenerator generator) {
        Log.e(TAG, generator.toString());
    }
}
