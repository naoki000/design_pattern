package com.designpattern.basic.prototype.code.framework;

import android.util.Log;

public class MassageBox implements Product {
    private static String TAG = MassageBox.class.getSimpleName();

    private char decochar;

    public MassageBox(char c) {
        this.decochar = c;
    }

    @Override
    public void use(String string) {
        Log.e(TAG, decochar + "massage box use " + string + " " + decochar);
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return p;
    }
}
