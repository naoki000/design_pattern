package com.designpattern.basic.abstractfactory;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.basic.abstractfactory.code.Main;

import java.util.ArrayList;

public class AbstractFactoryPatternActivity extends AbsBaseDesignPatternActivity {
    private static String TAG = AbstractFactoryPatternActivity.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected void serDescription() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("抽象的な部品を組み合わせて抽象的な製品を作る");
        strings.add("部品の具体的な実装には注目せずインタフェースに注目し、そのインタフェースだけを使って部品を使って製品をまとめる");
        super.description(strings);
    }

    @Override
    protected void setMerit() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("抽象的なクラスを作ると、具体的な工場を作ることが簡単。追加するだけならMainを変更しなくていい");
        strings.add("新しい部品を追加するのは大変、最初にどのような部品がいるかを選定するのが重要、factoryではとても抽象的な内容にとどめておくべき");
        super.merit(strings);
    }
}
