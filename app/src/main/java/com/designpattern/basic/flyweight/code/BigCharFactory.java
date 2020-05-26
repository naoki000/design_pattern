package com.designpattern.basic.flyweight.code;

import android.util.Log;

import java.util.HashMap;

public class BigCharFactory {
    private static String TAG = BigCharFactory.class.getSimpleName();

    HashMap pool;
    private static BigCharFactory sSingleton;

    //privateにして他のクラスからインスタンスを作れないようにする
    private BigCharFactory() {
        pool = new HashMap();
    }

    public static BigCharFactory getInstance() {
        if (sSingleton == null) {
            sSingleton = new BigCharFactory();
        }
        return sSingleton;
    }

    public synchronized BigChar getBigChar(char charname) {
        BigChar bigChar = (BigChar) pool.get("" + charname);
        if (bigChar == null) {
            Log.e(TAG, "c = " + charname);
            bigChar = new BigChar(charname);
            pool.put("" + charname, bigChar);
        }
        return bigChar;
    }
}
