package com.designpattern.command;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.command.code.Main;

import java.util.ArrayList;

public class CommandPatternActivity extends AbsBaseDesignPatternActivity {
    private static String TAG = CommandPatternActivity.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected void serDescription() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("命令を一つのクラスとして表現する方式");
        super.description(strings);
    }

    @Override
    protected void setMerit() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("命令が持つべき情報に注意、持たせる情報によって行える幅も増える");
        strings.add("履歴の保存もかのう");
        super.merit(strings);
    }
}
