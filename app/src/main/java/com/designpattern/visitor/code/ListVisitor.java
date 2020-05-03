package com.designpattern.visitor.code;

import android.util.Log;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    private static String TAG = ListVisitor.class.getSimpleName();

    private String currentdir = "";

    ///////////訪れた時にしたい処理//////////////////
    @Override
    public void visit(File file) {
        Log.e(TAG, currentdir + "/" + file);
    }

    //この処理がすごく大事、ここで何度も再帰する
    ///////////訪れた時にしたい処理//////////////////
    @Override
    public void visit(Directory directory) {
        Log.e(TAG, currentdir + "/" + directory);
        String save = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            entry.accept(this);
        }
        currentdir = save;
    }
}
