package com.designpattern.proxy;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.proxy.code.Main;

import java.util.ArrayList;

public class ProxyPatternActivity extends AbsBaseDesignPatternActivity {
    private static String TAG = ProxyPatternActivity.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected void serDescription() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("処理が重く、本人がやらなくてもいい処理を別の代理人に処理をまかせる方式");
        super.description(strings);
    }

    @Override
    protected void setMerit() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("実際に使うときまで余計な処理を省くことができる");
        strings.add("例えば初期化にすごい時間がかかるシステムでは、起動時にユーザの不満を感じさせないよう、実際に使うときなってから初めて初期化したほうがいい");
        strings.add("Printerに直接遅延評価の機能を追加することはできるが、機能を分けたほうがいいためしないようにする。これにより、クラスの見通しもよくなり、もし直接使いたかったら直接使うこともできる");
        super.merit(strings);
    }
}
