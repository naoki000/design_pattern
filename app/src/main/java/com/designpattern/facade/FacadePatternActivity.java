package com.designpattern.facade;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.facade.code.Main;

import java.util.ArrayList;

public class FacadePatternActivity extends AbsBaseDesignPatternActivity {
    private static String TAG = FacadePatternActivity.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected void serDescription() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("複雑化した詳細をまとめ、高レベルなAPIを提供する");
        strings.add("窓口となり、複雑なクラスを正しい順番で呼ぶようにしてくれるメソッド");
        super.description(strings);
    }

    @Override
    protected void setMerit() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("複雑なものを単純化したいときに使える");
        strings.add("APIを少なくすること");
        super.merit(strings);
    }
}
