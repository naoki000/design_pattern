package com.designpattern.basic.templatemethod.code;

public abstract class AbsDisplay {

    abstract void open();

    abstract void print();

    abstract void close();

    void display() {
        open();

        print();

        close();
    }
}
