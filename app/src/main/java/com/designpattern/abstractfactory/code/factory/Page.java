package com.designpattern.abstractfactory.code.factory;

import android.util.Log;

import java.util.ArrayList;

public abstract class Page {
    private static String TAG = Page.class.getSimpleName();

    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        Log.e(TAG, makeHTML());
    }

    public abstract String makeHTML();
}
