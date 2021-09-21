package com.designpattern.multithread.balking.code;

import com.designpattern.AbsMainCode;

public class Main extends AbsMainCode {

    @Override
    protected void main() {
        Data data = new Data("data.txt", "(empty)");
        new ChangerThread("ChangerThread", data).start();
        new SaverThread("SaverThread", data).start();
    }
}
