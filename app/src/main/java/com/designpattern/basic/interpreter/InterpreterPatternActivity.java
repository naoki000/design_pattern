package com.designpattern.basic.interpreter;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.basic.interpreter.code.Main;

import java.util.ArrayList;

public class InterpreterPatternActivity extends AbsBaseDesignPatternActivity {
    private static String TAG = InterpreterPatternActivity.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("プログラムが解決しようとしている問題を簡単なミニ言語で表現し解釈実行をする方式");
        strings.add("何らかの形式で書かれたファイルの中身を、「通訳」の役目を果たすプログラムで解析・表現する方式");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("Interpreterパターンを利用することで、規則の追加や変更が容易になります。\n" +
                "Interpreterパターンの特徴の1つに、「1つの規則を1つのクラスで表す」というものが挙げられます。つまり、新しい規則を追加する場合はNodeクラスのサブクラスを追加するだけで良くなります。\n" +
                "また、規則を修正する場合も、Nodeクラスのサブクラスを修正するだけになります。");
        strings.add("ミニ言語の構文をしっかり考える必要がある");
        return strings;
    }
}
