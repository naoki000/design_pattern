package com.designpattern.basic.iterator;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.basic.iterator.code.Main;

import java.util.ArrayList;

public class IteratorPattern extends AbsBaseDesignPatternActivity {
    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("集合体の要素に対して、順番にアクセスする処理を行うための方式");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("実装とは切り離して数を数え上げることが可能。");
        strings.add("iteratorだとわかっていれば、hasNext(), next()を使うことで数を数え上げることができるため、実装されているクラスを気にすることなく実装に依存しない。");
        return strings;
    }
}
