package com.designpattern.multithread.immutable;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.multithread.immutable.code.Main;

import java.util.ArrayList;

public class ImmutablePattern extends AbsBaseDesignPatternActivity {
    private static String TAG = ImmutablePattern.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("インスタンスの状態が変わらないことが保証されているクラス");
        strings.add("ex.Strings -> Stringsはインスタンスが保持している文字列は決して変わらない。つまりimmutableパターンでデザインされている");
        strings.add("基本的の方法はfinal修飾子をつけて更新できないインスタンスを作成する");
        strings.add("finalをつけると更新されない->状態が変わらないため、immutableな変数だといえる");
        strings.add("finalな修飾子をついているフィールドはsyncronizedする必要はない（当然）");
        strings.add("ArrayListはスレッドセーフではないので複数のスレッドから読み書きされる場合は注意-> Collection.synchronizedListを使う");


        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("排他制御する必要がないのでパフォーマンスが向上する");
        return strings;
    }
}
