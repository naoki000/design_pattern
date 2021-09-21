package com.designpattern.multithread.guardedsuspension;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.multithread.guardedsuspension.code.Main;

import java.util.ArrayList;

public class GuardedSuspensionPatternActivity extends AbsBaseDesignPatternActivity {
    private static String TAG = GuardedSuspensionPatternActivity.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("処理の手前でスレッドを待たせる");
        strings.add("満たされていないと行けない条件（ガード条件）を定義する");
        strings.add("インスタンスの状態の変化を待っている。");
        strings.add("何のインスタンスの状態の変化を待っているかを考えることが重要。");
        strings.add("それがわかればいつnotifyするべきかもわかる。");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("スレッドを待たせることでインスタンスの安全性を担保する");
        return strings;
    }
}
