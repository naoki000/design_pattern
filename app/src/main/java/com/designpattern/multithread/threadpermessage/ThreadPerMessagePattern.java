package com.designpattern.multithread.threadpermessage;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.multithread.threadpermessage.code.Main;

import java.util.ArrayList;

public class ThreadPerMessagePattern extends AbsBaseDesignPatternActivity {
    private static String TAG = ThreadPerMessagePattern.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("メッセージごとにスレッドを割り当て、各スレッドが処理を行う");
        strings.add("マルチスレッドのproxyパターンのようなもの");
        strings.add("ExecutorServiceやScheduledExecutorServiceなどいくつもutilクラスが存在");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("処理の順序を気にしないとき有効");
        strings.add("戻り地が不要なとき使える");
        strings.add("webサーバーで利用されている。連続して送る。送ったことはすぐわかり、実際には各スレッドが送信する");
        return strings;
    }
}
