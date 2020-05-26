package com.designpattern.basic.bridge;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.basic.bridge.code.Main;

import java.util.ArrayList;

public class BridgePatternActivity extends AbsBaseDesignPatternActivity {
    private static String TAG = BridgePatternActivity.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected void serDescription() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("「昨日のクラス階層」と「実装のクラス階層」を分けその橋渡しをする");
        strings.add("機能のクラスの階層・・・スーパークラスで基本的な機能を持っていて、サブクラスで新しい機能を追加する場合の階層");
        strings.add("実装クラスの階層・・・スーパークラスで抽象メソッドによってインターフェースを規定していて、サブクラスで具象メソッドによってそのインターフェースを実装する場合の階層");
        strings.add("サブクラスをつくとき、機能を追加しているのか、実装を行おうとしているかを考えて実装するとき、二つのクラスの階層を分ける時に行う");
        super.description(strings);
    }

    @Override
    protected void setMerit() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("、Bridgeパターンの特徴は機能クラスの階層と実装クラスの階層を分けている点にあります。この2つのクラス階層を分けておけば、それぞれのクラス階層を独立に拡張することができます。\n" +
                "機能を追加したければ、機能のクラス階層にクラスを追加します。このとき、実装クラス階層は全く修正する必要はありません。しかも、追加した機能はすべての実装で利用できることになります。\n" +
                "サンプルプログラムでは、CountDisplayクラスやRandomCountDisplayクラスを追加することが、機能追加にあたります。" +
                "このように、Bridgeパターンではクラスの拡張を見通しよく行うことができます。");
        super.merit(strings);
    }
}
