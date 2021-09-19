package com.designpattern.basic.strategy;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.basic.strategy.code.Main;

import java.util.ArrayList;

public class StrategyPatternActivity extends AbsBaseDesignPatternActivity {
    private static String TAG = StrategyPatternActivity.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("アルゴリズムを切りかえ、同じ問題を別の方法で解くのを容易にするパターン");
        strings.add("委譲先を切り替えてアルゴリズムを切り替える");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("Strategyの実装を増やせばアルゴリズムを切りかえが容易");
        strings.add("実行中に切り替えることもできる");
        return strings;
    }
}
