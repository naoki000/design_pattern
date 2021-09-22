package com.designpattern.basic.memento;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.basic.memento.code.Main;

import java.util.ArrayList;

public class MementoPattern extends AbsBaseDesignPatternActivity {
    private static String TAG = MementoPattern.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("カプセル化の破壊をすることなくインスタンスの状態を保存、復元を行う方式");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("");
        return strings;
    }
}
