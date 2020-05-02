package com.designpattern.builder;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.builder.code.Main;

import java.util.ArrayList;

public class BuilderPatternActivity extends AbsBaseDesignPatternActivity {
    private static String TAG = BuilderPatternActivity.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected void serDescription() {
        ArrayList<String> strings = new ArrayList<String>() {};
        strings.add("複雑な構造をもったものを作り上げるとき、一気に完成させるのは困難です。まず全体を構築している各部分を作り、段階を踏んで組み上げていくことになります。");
        strings.add("Builderパターンは、構造を持ったインスタンスを組み上げていく方式です。");
        super.description(strings);
    }

    @Override
    protected void setMerit() {
        ArrayList<String> strings = new ArrayList<String>() {};
        strings.add("誰が何を知っていいか使っていいかを意識してプログラムする");
        strings.add("MainはBuilderクラスのメソッドを意識することなくdirectorクラスのconstructだけ使うことで文書を作ることができる（間接的にBuilderが使われており、その中でHTMLなのかTextなのかはManは意識しなくていい）");
        strings.add("将来Builderが増えても、大丈夫なように設計する");
        super.merit(strings);
    }
}
