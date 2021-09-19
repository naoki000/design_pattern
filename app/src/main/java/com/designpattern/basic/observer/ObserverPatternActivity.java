package com.designpattern.basic.observer;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.basic.observer.code.Main;

import java.util.ArrayList;

public class ObserverPatternActivity extends AbsBaseDesignPatternActivity {
    private static String TAG = ObserverPatternActivity.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("状態変化に応じた処理を記述する方式");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("observerは必ずインタフェースを作るそれをGeneretorはそれを使ってobserverさせることで、交換可能性を上げることができる");
        return strings;
    }
}
