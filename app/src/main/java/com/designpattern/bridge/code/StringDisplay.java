package com.designpattern.bridge.code;

import android.util.Log;

public class StringDisplay implements DisplayImple {
    static String TAG = StringDisplay.class.getSimpleName();

    public String string;
    public int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    private void printLine() {
        Log.e(TAG, "printLine " + width);
    }

    @Override
    public void rawPrint() {
        Log.e(TAG, "rawPrint " + string);
    }

    @Override
    public void rawClose() {
        printLine();
    }
}

