package com.designpattern.basic.visitor;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.basic.visitor.code.Main;

import java.util.ArrayList;

public class VisitorPattern extends AbsBaseDesignPatternActivity {
    private static String TAG = VisitorPattern.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("データ構造と処理を分離する");
        strings.add("主体である訪問者クラスがデータ構造をめぐりながら処理を行う。");
        strings.add("データ構造はcompositeパターンを使う（ディレクトリを渡り歩く）");
        strings.add("データを持つElementとそれを渡り歩くVisitorの二つのインタフェースを実装する");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("データ構造と、処理を分離することができることで、部品としての独立性を高める");
        strings.add("ConcreteVisitor(今回でいうListVisitor)の追加は簡単。具体的な処理はこれに任せているので、ほかの処理を変更修正する必要がないから");
        strings.add("ConcreteElement(今回でいうDirectoryとFile)の追加は困難。Entryクラスのサブクラスとしてdeviceクラスを作ると、Visitorクラスはvisit(Device)メソッドを作らなくてはならず、ConcreteVisitorすべてに実装しなければいけないから");
        return strings;
    }
}
