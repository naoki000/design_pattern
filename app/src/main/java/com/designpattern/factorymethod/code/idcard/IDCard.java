package com.designpattern.factorymethod.code.idcard;

import android.util.Log;

import com.designpattern.factorymethod.code.framework.Product;

public class IDCard extends Product {
    private static String TAG = IDCard.class.getSimpleName();

    String owner;
    IDCard(String string) {
        owner = string;
    }

    @Override
    public void use() {
        Log.e(TAG, "use " + owner);
    }

    public String getOwner() {
        return owner;
    }
}
