package com.designpattern.multithread.future;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.multithread.future.code.Main;

import java.util.ArrayList;

public class FuturePattern extends AbsBaseDesignPatternActivity {
    private static String TAG = FuturePattern.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("実行結果を得るまで待つ代わりに引換券をもらい、実行結果を後で受け取る。\n");
        strings.add("別スレッドの処理した際の戻り値が欲しいときに使うパターン\n");
        strings.add("すぐに戻り値を取得できないので、戻り値を取得するためのチケットを取得し、あとでそのチケットを使って戻り値を取得する。");
        strings.add("Concurrent.Callableは戻り値のある処理の呼び出しに使う\n");
        strings.add("Futureパターンを実装しているutilに、ConcurrentFuture, FutureTaskクラスなどがある。\n");
        strings.add("");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("非同期処理の戻り値を取得できる。");
        strings.add("ioなど処理の重い処理を行う場合、その間の時間に空いているスレッドに処理を割り当てることでスループットが向上する");
        strings.add("");
        return strings;
    }
}
