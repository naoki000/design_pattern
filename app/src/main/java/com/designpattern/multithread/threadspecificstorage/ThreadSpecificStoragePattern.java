package com.designpattern.multithread.threadspecificstorage;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.multithread.threadspecificstorage.code.Main;

import java.util.ArrayList;

public class ThreadSpecificStoragePattern extends AbsBaseDesignPatternActivity {
    private static String TAG = ThreadSpecificStoragePattern.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("入り口は一つでも、内部ではスレッド固有の領域が用意されているパターン");
        strings.add("ThreadLocalを使うことでスレッド内に固有の情報を格納できる（コード上はスレッドごとのインスタンスを用意しなくて良い）\n");
        strings.add("");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("シングルスレッドで動作することを想定しているオブジェクトをマルチスレッドで利用した時使える\n");
        strings.add("workerThreadパターンとはいっしょに使えない");
        strings.add("他のスレッドからアクセスされる心配がない");
        strings.add("");
        return strings;
    }
}
