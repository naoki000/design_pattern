package com.designpattern.basic.singleton.code;

import com.designpattern.AbsMainCode;

public class Main extends AbsMainCode {
    private static String TAG = Main.class.getSimpleName();

    @Override
    protected void main() {
        Singleton singleton = Singleton.getInstance();

        singleton.print();
    }
}
