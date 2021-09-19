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
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("一つのthreadしか実行できないよう制限をかける方法");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("他のthreadに実行を邪魔されない");
        return strings;
    }
}
