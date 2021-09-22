package com.designpattern.multithread.workerthread;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.multithread.workerthread.code.Main;

import java.util.ArrayList;

public class WorkerThreadPattern extends AbsBaseDesignPatternActivity {
    private static String TAG = WorkerThreadPattern.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("ワーカースレッドが仕事を一つずつ取りに行き、処理する。\n");
        strings.add("仕事が無い場合、ワーカースレッドは、新しい仕事が来るまで待つ");
        strings.add("ThreadPoolExecutorは、能動的にWorker数を調整してくれる\n" +
                "(仕事が増えたら増やし、減ってきたら減らす。)\n" +
                "Executorsクラスを使うのが一般的");

        strings.add("");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("Thread-per-messageは仕事実行ごとに新しいスレッドを起動する。しかしコンパターンでは、新しいスレッドを起動しない。\n");
        strings.add("これにより、スレッドを使いまわせ、リサイクルしてスループットを上げることが出来る\n" +
                "（実際に上がるかはスレッド起動の重さに依存）");
        strings.add("ワーカースレッドの数を多くすればするほど、平行に処理できる。\n" +
                "がメモリも増える");
        return strings;
    }
}
