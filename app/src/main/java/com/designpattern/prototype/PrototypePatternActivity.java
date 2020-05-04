package com.designpattern.prototype;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.prototype.code.Main;

import java.util.ArrayList;

public class PrototypePatternActivity extends AbsBaseDesignPatternActivity {
    private static String TAG = PrototypePatternActivity.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected void serDescription() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("クラスからインスタンスを作るのではなく、インスタンスをコピーして新しいインスタンスを作成する方式");
        strings.add("「種類が多すぎてクラスにまとめられない場合」、「クラスからインスタンス生成が難しい場合」、「フレームワークと生成するインスタンスを分けたい場合」に有効");
        strings.add("現在のインスタンスと同じ状態の別のインスタンスを作る(cloneする)");
        strings.add("このパタンはshallow copyなので注意（配列とかあったら同じものを指してしまう）");
        super.description(strings);
    }

    @Override
    protected void setMerit() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("部品の再利用の観点から、部品として独立させなくてはならないクラスはソース中に書かれてはいけない（切り離して再利用することができなくなるため");
        super.merit(strings);
    }
}
