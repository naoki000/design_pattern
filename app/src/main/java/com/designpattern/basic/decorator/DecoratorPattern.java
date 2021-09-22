package com.designpattern.basic.decorator;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.basic.decorator.code.Main;

import java.util.ArrayList;

public class DecoratorPattern extends AbsBaseDesignPatternActivity {
    private static String TAG = DecoratorPattern.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("オブジェクトに対してどんどんデコレーション(飾り付け)を行う方式");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("中身を変えず機能追加が可能");
        strings.add("包まれるなかみを修正せず機能の塚が可能");
        strings.add("動的な機能追加が可能");
        return strings;
    }
}
