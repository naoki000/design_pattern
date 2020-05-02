package com.designpattern.templatemethod.code;

import android.util.Log;

public class CharDisplay extends AbsDisplay {
    private static String TAG = CharDisplay.class.getSimpleName();

    char c;
    CharDisplay(char c) {
        this.c = c;
    }

    public
    @Override
    void open() {
        Log.e(TAG, "<<");
    }

    @Override
    void print() {
        Log.e(TAG, " " + c + " ");
    }

    @Override
    void close() {
        Log.e(TAG, ">>");
    }
}
