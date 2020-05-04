package com.designpattern.flyweight;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.flyweight.code.Main;

import java.util.ArrayList;

public class FlyweightPatternActivity extends AbsBaseDesignPatternActivity {
    private static String TAG = FlyweightPatternActivity.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected void serDescription() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("インスタンスをできるだけ共有させて無駄に生成しないようにする方式");
        strings.add("オブジェクトのメモリ使用量を減らすことができる");
        strings.add("再利用できるインスタンスが既に作ってあった場合はそれを利用する");
        super.description(strings);
    }

    @Override
    protected void setMerit() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("一つを変更するとその他すべてに変更できる。何を共有するべきかを考える必要がある");
        strings.add("共有させるデータはintrinsicなデータ（場所や状況によって依存しない、常に一定のデータ）を選ぶ");
        super.merit(strings);
    }
}
