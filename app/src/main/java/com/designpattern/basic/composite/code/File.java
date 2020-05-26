package com.designpattern.basic.composite.code;

import android.util.Log;

public class File extends Entry {
    private static String TAG = File.class.getSimpleName();

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        Log.e(TAG, prefix + "/" + this);

    }
}

