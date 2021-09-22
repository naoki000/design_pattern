package com.designpattern.multithread.activeobject;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.multithread.activeobject.code.Main;

import java.util.ArrayList;

public class ActiveObjectPattern extends AbsBaseDesignPatternActivity {
    private static String TAG = ActiveObjectPattern.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected ArrayList<String> summaryDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("自分固有のスレッドを持つだけではなく、外部から非同期メッセージを受け取って処理がかのうで、必要に応じて処理の結果を返す。\n" +
                "（Producer-consumer, Thread-Per-Message, Futureを使う）\n");
        strings.add("メソッド呼び出しをインスタンス化しキューとして蓄え、順序良く実行する");
        strings.add("処理を依頼する人(Client)と処理を実行する人(Servant)がいる。Servantが処理を実行するのに時間がかかったり、処理を実行できるタイミングが遅くなったとしてもClientに影響を出したくない\n" +
                "また、ClientからServantへの呼び出しだけではなく、実行結果をServantからClientに返すような双方向呼び出しにしたい。かつ、処理の依頼順序と処理の実行順序を独立させたいときに使う");
        strings.add("");
        return strings;
    }

    @Override
    protected ArrayList<String> meritDesc() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("非同期メッセージを処理できる能動的なオブジェクトを構成する");
        return strings;
    }
}
