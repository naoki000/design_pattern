package com.designpattern.multithread.singlethread.code;

import android.util.Log;

public class UserThread extends Thread {
    private static String TAG = UserThread.class.getSimpleName();

    private final Gate gate;
    private final String myname;
    private final String myaddress;

    public UserThread(Gate gate, String myname, String myaddress) {
        this.gate = gate;
        this.myname = myname;
        this.myaddress = myaddress;
    }

    public void run() {
        Log.d(TAG, myname + " BEGIN");
        while (true) {
            gate.pass(myname, myaddress);
        }
    }
}
