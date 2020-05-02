package com.designpattern.templatemethod;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.templatemethod.code.Main;

import java.util.ArrayList;

public class TemplateMethodPatternActivity extends AbsBaseDesignPatternActivity {
    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected void serDescription() {
        ArrayList<String> strings = new ArrayList<String>() {};
        strings.add("スーパークラスで処理の枠組みを定め、サブクラスでその具体的内容を定める方式");
        strings.add("いわゆるオブジェクト指向のポリフォーリズム");
        super.description(strings);
    }

    @Override
    protected void setMerit() {
        ArrayList<String> strings = new ArrayList<String>() {};
        strings.add("ロジックの共通化ができる");
        super.merit(strings);
    }
}
