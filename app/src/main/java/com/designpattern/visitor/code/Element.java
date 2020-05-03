package com.designpattern.visitor.code;

public interface Element {
    String TAG = Element.class.getSimpleName();

    void accept(Visitor visitor);
}

