package com.designpattern.basic.command;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.basic.command.code.Main;

import java.util.ArrayList;

public class CommandPattern extends AbsBaseDesignPatternActivity {
    private static String TAG = CommandPattern.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("命令を一つのクラスとして表現する方式");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("命令が持つべき情報に注意、持たせる情報によって行える幅も増える");
        strings.add("履歴の保存もかのう");
        return strings;
    }
}
