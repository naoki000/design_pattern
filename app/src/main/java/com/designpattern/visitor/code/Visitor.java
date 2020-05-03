package com.designpattern.visitor.code;

public abstract class Visitor {
    private static String TAG = Visitor.class.getSimpleName();

    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}

