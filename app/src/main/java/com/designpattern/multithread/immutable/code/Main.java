package com.designpattern.multithread.immutable.code;

import com.designpattern.AbsMainCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main extends AbsMainCode {

    @Override
    protected void main() {
        final List<Integer> list = Collections.synchronizedList(new ArrayList<Integer>());
//        List<Integer> list = new ArrayList<Integer>(); -> 複数スレッドから同時に読み書きはダメ
//        final List<Integer> list = new CopyOnWriteArrayList<Integer>();　-> 書くときｃｏｐｙされる。ので書く処理が多いとパフォーマンスがわるい。読みばかりあるとき使える

        new WriterThread(list).start();
        new ReaderThread(list).start();
    }
}
