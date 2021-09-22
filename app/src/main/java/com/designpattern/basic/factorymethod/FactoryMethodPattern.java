package com.designpattern.basic.factorymethod;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.basic.factorymethod.code.Main;

import java.util.ArrayList;

public class FactoryMethodPattern extends AbsBaseDesignPatternActivity {
    private static String TAG = FactoryMethodPattern.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("インスタンス生成に、Template Methodパターンを適用したパターン");
        strings.add("インスタンスの作り方をスーパークラスで定め、具体的な生成処理はサブクラス側で行う方式");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("frameworkパッケージという、インスタンスを作る枠組みをつくれば、これを再利用してまったく違うインスタンスを、同じframeworkパッケージを用いて実装できる");
        strings.add("frameworkパッケージは、idcardパッケージを参照していないので、依存していないクラスを作ることが重要");
        return strings;
    }
}
