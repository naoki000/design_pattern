package com.designpattern.multithread.balking;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.multithread.guardedsuspension.code.Main;

import java.util.ArrayList;

public class BalkingPattern extends AbsBaseDesignPatternActivity {
    private static String TAG = BalkingPattern.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("実装されては困る。必要ないとき処理の手前で中断する。");
        strings.add("ガード条件が満たされない場合待つことなくすぐ終了する");
        strings.add("balkする方法は、returnするかthrowする");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("あえて行う必要がない処理をskipすることでパフォーマンスを上げる");
        return strings;
    }
}
