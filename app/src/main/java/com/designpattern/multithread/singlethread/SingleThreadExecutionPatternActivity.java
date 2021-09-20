package com.designpattern.multithread.singlethread;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.multithread.singlethread.code.Main;

import java.util.ArrayList;

public class SingleThreadExecutionPatternActivity extends AbsBaseDesignPatternActivity {
    private static String TAG = SingleThreadExecutionPatternActivity.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("一つのthreadしか実行できないよう制限をかける方法");
        strings.add("syncronizedをつけて一つのスレッドが実行しているときは待つ");
        strings.add("javaにはsyncronizedメソッドがいくつかある(java.util.Collections)");
        strings.add("マルチスレッドの時、複数うスレッドからアクセスされる場合、状態が変化するとき、安全性を保つとき使う");
        strings.add("特に状態が変化しないときはImmutableパターンを使うべき");
        strings.add("デッドロックを起こしやすいの注意");
        strings.add("パフォーマンスを低下するため使用するときは注意（ロック取得に時間がかかるため）");

        strings.add("syncronizedを見たら何を守っているかを考える");
        strings.add("複数スレッドから共有されるフィールドにアクセスするメソッドにはすべてsynchronizedする必要があるので注意（なのでパフォーマンスも悪い）");

        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("他のthreadに実行を邪魔されない");
        strings.add("複数のthreadからアクセスされる場合に有効");
        return strings;
    }
}
