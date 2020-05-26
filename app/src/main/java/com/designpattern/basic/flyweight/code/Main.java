package com.designpattern.basic.flyweight.code;

import com.designpattern.AbsMainCode;

public class Main extends AbsMainCode {
    private static String TAG = Main.class.getSimpleName();

    @Override
    protected void main() {
        BigString bigString = new BigString("123112595495492");
        bigString.print();
    }
}
