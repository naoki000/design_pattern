package com.designpattern.basic.command.code.command;

import android.util.Log;

public class DrawCanvas implements IDrawable {
    static String TAG = DrawCanvas.class.getSimpleName();

    private Command history;

    public DrawCanvas(Command history) {
        this.history = history;
    }

    public void paint(){
        history.execute();
    }

    @Override
    public void draw() {
        Log.e(TAG, "draw");
    }
}
