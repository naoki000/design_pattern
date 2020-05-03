package com.designpattern.decorator.code;

public abstract class Border extends Display {
    private static String TAG = Border.class.getSimpleName();

    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
