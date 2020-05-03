package com.designpattern.adapter;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.adapter.code.Main;

import java.util.ArrayList;

public class AdapterPatternActivity extends AbsBaseDesignPatternActivity {
    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected void serDescription() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("「すでに提供されているもの」と「必要なもの」の間のずれを埋めるデザインパターン。Wrapperパターンとも呼ばれる。");
        strings.add("例：コンセントの交流100ボルト(すでに提供されているもの)を直流12ボルト(必要なもの)に変換するアダプター");
        strings.add("パターンはクラス(継承)によるものとインスタンス（委譲）によるものがある");
        super.description(strings);
    }

    @Override
    protected void setMerit() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("もともとのクラスを再利用するように実装をするべき（これまで使われてきた実績があるので)");
        strings.add("もととなるクラスには手を入れないため、既存クラスをもう一度実装しなおすということがなくなり、必要とするメソッド群を素早く作ることができます。");
        strings.add("もしバグが検出されたとしても、既存のクラスが十分にテストされているのであれば、以前のクラスには問題ないので、Adapter役のクラスを重点的に調べればよいことになるので、プログラムのチェックが楽になる");
        strings.add("バージョンの差などを埋める時などに使われる");

        super.merit(strings);
    }
}
