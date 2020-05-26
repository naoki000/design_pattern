package com.designpattern.basic.bridge.code;

interface DisplayImple {
    static String TAG = DisplayImple.class.getSimpleName();

    void rawOpen();

    void rawPrint();

    void rawClose();
}

