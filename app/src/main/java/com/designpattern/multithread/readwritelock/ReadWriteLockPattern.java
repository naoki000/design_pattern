package com.designpattern.multithread.readwritelock;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.multithread.readwritelock.code.Main;

import java.util.ArrayList;

public class ReadWriteLockPattern extends AbsBaseDesignPatternActivity {
    private static String TAG = ReadWriteLockPattern.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("書き込みと読み込み時の排他制御方法を分けるデザインパターン");
        strings.add("読み込み時はインスタンスの状態は変化しないが、書き込み時は変化する");
        strings.add("そのため読む処理と書く処理を分けて考え、複数個のスレッドが同時に読むことを認めるが読んでいる間は書き込みを禁止する");
        strings.add("読むためには読むためのロックを取得、書くためには書くためのロックを取得する");
        strings.add("java.util.concurrent.locks");
        strings.add("java.util.concurrent.locks.ReentrantReadWriteLock");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("パフォーマンスを向上する");
        strings.add("読む頻度が書く頻度よりも高いときに有効");
        return strings;
    }
}
