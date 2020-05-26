package com.designpattern.basic.singleton.code;

import android.util.Log;

public class Singleton {
    private static String TAG = Singleton.class.getSimpleName();

    private static Singleton sSingleton;

    //privateにして他のクラスからインスタンスを作れないようにする
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (sSingleton == null) {
            sSingleton = new Singleton();
        }
        return sSingleton;
    }

    public void print() {
        Log.e(TAG, "singleton call");
    }
}
