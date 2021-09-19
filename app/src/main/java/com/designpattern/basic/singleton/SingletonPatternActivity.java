package com.designpattern.basic.singleton;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.basic.singleton.code.Main;

import java.util.ArrayList;

public class SingletonPatternActivity extends AbsBaseDesignPatternActivity {
    private static String TAG = SingletonPatternActivity.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("そのクラスのインスタンスが絶対に一つしかそんざいしなことを保証する方法");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("このパターンはAbstract Factory, Builder, Facade, Prototypeのパターンでよく使われる");
        return strings;
    }
}
