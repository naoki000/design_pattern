package com.designpattern.singleton;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.singleton.code.Main;

import java.util.ArrayList;

public class SingletonPatternActivity extends AbsBaseDesignPatternActivity {
    private static String TAG = SingletonPatternActivity.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected void serDescription() {
        ArrayList<String> strings = new ArrayList<String>() {};
        strings.add("そのクラスのインスタンスが絶対に一つしかそんざいしなことを保証する方法");
        super.description(strings);
    }

    @Override
    protected void setMerit() {
        ArrayList<String> strings = new ArrayList<String>() {};
        strings.add("このパターンはAbstract Factory, Builder, Facade, Prototypeのパターンでよく使われる");
        super.merit(strings);
    }
}
