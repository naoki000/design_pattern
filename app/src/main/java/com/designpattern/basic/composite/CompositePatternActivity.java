package com.designpattern.basic.composite;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.basic.composite.code.Main;

import java.util.ArrayList;

public class CompositePatternActivity extends AbsBaseDesignPatternActivity {
    private static String TAG = CompositePatternActivity.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected void serDescription() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("容器と中身を同一視し、再帰的な構造を作る方式");
        strings.add("ファイルシステムのディレクトリのように入れ子の状態を認めるときに使える");
        super.description(strings);
    }

    @Override
    protected void setMerit() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("複数と単数の同一視ともいう。複数個のものをあたかも一つのものであるかのように扱う");
        super.merit(strings);
    }
}
