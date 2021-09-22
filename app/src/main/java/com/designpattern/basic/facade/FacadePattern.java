package com.designpattern.basic.facade;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.basic.facade.code.Main;

import java.util.ArrayList;

public class FacadePattern extends AbsBaseDesignPatternActivity {
    private static String TAG = FacadePattern.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("複雑化した詳細をまとめ、高レベルなAPIを提供する");
        strings.add("窓口となり、複雑なクラスを正しい順番で呼ぶようにしてくれるメソッド");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("複雑なものを単純化したいときに使える");
        strings.add("APIを少なくすること");
        return strings;
    }
}
