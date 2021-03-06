package com.designpattern.basic.command.code.command;

import android.util.Log;

public class DrawCommand implements Command {
    static String TAG = DrawCommand.class.getSimpleName();

    protected IDrawable drawable;
    private int num;
    public DrawCommand(IDrawable drawable ,int num) {
        this.drawable = drawable;
        this.num = num;
    }

    @Override
    public void execute() {
        Log.e(TAG, "execute " + num) ;
        drawable.draw();
    }

    @Override
    public void print() {
        Log.e(TAG, "print " + num) ;

    }
}
