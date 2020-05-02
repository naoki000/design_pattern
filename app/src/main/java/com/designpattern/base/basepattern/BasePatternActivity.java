package com.designpattern.base.basepattern;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.base.basepattern.code.Main;

import java.util.ArrayList;

public class BasePatternActivity extends AbsBaseDesignPatternActivity {
    private static String TAG = BasePatternActivity.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected void serDescription() {
        ArrayList<String> strings = new ArrayList<String>() {};
        strings.add("");
        super.description(strings);
    }

    @Override
    protected void setMerit() {
        ArrayList<String> strings = new ArrayList<String>() {};
        strings.add("");
        super.merit(strings);
    }
}
