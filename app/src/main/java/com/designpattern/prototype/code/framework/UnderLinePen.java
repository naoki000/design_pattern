package com.designpattern.prototype.code.framework;

import android.util.Log;

public class UnderLinePen implements Product {
    private static String TAG = UnderLinePen.class.getSimpleName();

    private char decochar;

    public UnderLinePen(char c) {
        this.decochar = c;
    }

    @Override
    public void use(String string) {
        Log.e(TAG, decochar + "UnderLinePen box use " + string + " " + decochar);
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
