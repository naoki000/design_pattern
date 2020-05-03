package com.designpattern.chainofresponsibility;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.chainofresponsibility.code.Main;

import java.util.ArrayList;

public class ChainOfResponsibilityPatternActivity extends AbsBaseDesignPatternActivity {
    private static String TAG = ChainOfResponsibilityPatternActivity.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected void serDescription() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("複数のオブジェクトをチェーンのようにつないでおき、オブジェクト間を順次渡いて、目的のオブジェクトを決定する方式");
        strings.add("要求に対して処理ができるならする、できないなら次のオブジェクトに処理を任せる（たらいまわしする）");
        strings.add("柔軟性は高いが、処理が重くなるのは注意");
        super.description(strings);
    }

    @Override
    protected void setMerit() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("要求を出す人と、処理する人を緩やかに結び付け、独立性を損なわない");
        strings.add("動的に連鎖の形態を変えれる");
        super.merit(strings);
    }
}
