package com.designpattern.multithread.immutable.code;

import java.util.List;

public class WriterThread extends Thread {
    private final List<Integer> list;

    public WriterThread(List<Integer> list) {
        super("WriterThread");
        this.list = list;
    }

    public void run() {
        for (int i = 0; true; i++) {
            //明示的に呼び出しているの内部で良しなにやってくれてクラッシュしない
            list.add(i);
            list.remove(0);
        }
    }
}
