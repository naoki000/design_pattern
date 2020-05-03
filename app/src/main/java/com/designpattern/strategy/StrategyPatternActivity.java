package com.designpattern.strategy;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.strategy.code.Main;

import java.util.ArrayList;

public class StrategyPatternActivity extends AbsBaseDesignPatternActivity {
    private static String TAG = StrategyPatternActivity.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected void serDescription() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("アルゴリズムを切りかえ、同じ問題を別の方法で解くのを容易にするパターン");
        strings.add("委譲先を切り替えてアルゴリズムを切り替える");
        super.description(strings);
    }

    @Override
    protected void setMerit() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("Strategyの実装を増やせばアルゴリズムを切りかえが容易");
        strings.add("実行中に切り替えることもできる");
        super.merit(strings);
    }
}
