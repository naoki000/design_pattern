package com.designpattern.multithread.singlethread.code;

import android.util.Log;

public class Gate {
    private static String TAG = Gate.class.getSimpleName();

    private int counter = 0;
    private String name = "Nobody";
    private String address = "Nowhere";

    public synchronized void pass(String name, String address) {
        this.counter++;
        this.name = name;
        this.address = address;
        check();
    }

    public synchronized String toString() {
        return "No." + counter + ": " + name + ", " + address;
    }

    // このメソッドはpassからしか呼ばれず、name addressはprivateのためsynchronized
    //にしなくてよい
    private void check() {
        if (name.charAt(0) != address.charAt(0)) {
            Log.d(TAG, "***** BROKEN ***** " + toString());
        }
    }
}
