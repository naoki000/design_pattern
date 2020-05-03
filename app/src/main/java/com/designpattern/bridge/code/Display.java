package com.designpattern.bridge.code;

public class Display {
    private static String TAG = Display.class.getSimpleName();

    private DisplayImple imple;

    public Display(DisplayImple imple) {
        this.imple = imple;
    }

    //各処理はimpleの実装クラスに任せることで結びつきを緩くする
    public void open() {
        imple.rawOpen();
    }

    public void print() {
        imple.rawPrint();
    }

    public void close() {
        imple.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}

