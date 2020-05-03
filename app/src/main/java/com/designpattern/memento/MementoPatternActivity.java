package com.designpattern.memento;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.memento.code.Main;

import java.util.ArrayList;

public class MementoPatternActivity extends AbsBaseDesignPatternActivity {
    private static String TAG = MementoPatternActivity.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected void serDescription() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("カプセル化の破壊をすることなくインスタンスの状態を保存、復元を行う方式");
        super.description(strings);
    }

    @Override
    protected void setMerit() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("");
        super.merit(strings);
    }
}
