package com.designpattern.basic.madiator;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.basic.madiator.code.Main;

import java.util.ArrayList;

public class MediatorPattern extends AbsBaseDesignPatternActivity {
    private static String TAG = MediatorPattern.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        main.setContext(this);
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("メンバーはみんな相談役だけに報告し、メンバーへの支持は相談役だけが来るようにする方式");
        strings.add("多数のオブジェクトの間の調整を行わなければならないときに有効");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("機能を集約することで、デバッグが楽になる（今回でいうと、表示の有効無効に関するロジックはcolleagueChangedメソッドにしかない）");
        strings.add("オブジェクト指向では一極集中は避けるべきなことが多いが、処理によっては一部にまとめたいいこともある。何を分散させるべきか、集中させるべきか考える必要がある");
        return strings;
    }
}
