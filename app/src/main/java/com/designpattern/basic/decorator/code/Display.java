package com.designpattern.basic.decorator.code;

import android.util.Log;

public abstract class Display {
    private static String TAG = Display.class.getSimpleName();

    public abstract int getColumns();

    public abstract int getRows();

    public abstract String getRowText(int row);

    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            Log.e(TAG, getRowText(i));
        }
    }
}
