package com.designpattern.basic.composite;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.basic.composite.code.Main;

import java.util.ArrayList;

public class CompositePattern extends AbsBaseDesignPatternActivity {
    private static String TAG = CompositePattern.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("容器と中身を同一視し、再帰的な構造を作る方式");
        strings.add("ファイルシステムのディレクトリのように入れ子の状態を認めるときに使える");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("複数と単数の同一視ともいう。複数個のものをあたかも一つのものであるかのように扱う");
        return strings;
    }
}
