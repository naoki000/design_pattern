package com.designpattern.multithread.visitor;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.multithread.visitor.code.Main;

import java.util.ArrayList;

public class SingleThreadExecutionPattern extends AbsBaseDesignPatternActivity {
    private static String TAG = SingleThreadExecutionPattern.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected void serDescription() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("一つのthreadしか実行できないよう制限をかける方法");
        super.description(strings);
    }

    @Override
    protected void setMerit() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("他のthreadに実行を邪魔されない");
        super.merit(strings);
    }
}
