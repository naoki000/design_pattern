package com.designpattern.multithread.immutable.code;

import android.util.Log;

import java.util.List;

public class ReaderThread extends Thread {
    private static String TAG = ReaderThread.class.getSimpleName();

    private final List<Integer> list;

    public ReaderThread(List<Integer> list) {
        super("ReaderThread");
        this.list = list;
    }

    public void run() {
        while (true) {
            //読むときイテレータで回してるのでsynchronizedして同期化する
            //これをしないとjava.util.ConcurrentModificationException発生
            synchronized (list) {
                for (int n : list) {
                    Log.d(TAG, "n = " + n);
                }
            }
        }
    }
}