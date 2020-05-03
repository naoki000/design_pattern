package com.designpattern.bridge.code;

import com.designpattern.AbsMainCode;

public class Main extends AbsMainCode {
    private static String TAG = Main.class.getSimpleName();

    @Override
    protected void main() {
        Display d1 = new Display(new StringDisplay(" Display"));
        Display d2 = new CountDisplay(new StringDisplay("CountDisplay 1"));
        CountDisplay d3 = new CountDisplay(new StringDisplay("CountDisplay 2"));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }
}
