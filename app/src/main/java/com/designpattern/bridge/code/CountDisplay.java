package com.designpattern.bridge.code;

public class CountDisplay extends Display {
    private static String TAG = CountDisplay.class.getSimpleName();

    public CountDisplay(DisplayImple imple) {
        super(imple);
    }

    public void multiDisplay(int time) {
        open();
        for (int i = 0; i < time; i++) {
            print();
        }
        close();
    }
}

