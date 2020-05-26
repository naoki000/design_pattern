package com.designpattern.basic.state;

import com.designpattern.AbsBaseDesignPatternActivity;
import com.designpattern.AbsMainCode;
import com.designpattern.basic.state.code.Main;

import java.util.ArrayList;

public class StatePatternActivity extends AbsBaseDesignPatternActivity {
    private static String TAG = StatePatternActivity.class.getSimpleName();

    @Override
    protected AbsMainCode makeMainCode() {
        Main main = new Main();
        return main;
    }

    @Override
    protected void serDescription() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("状態をクラスとして表現し、クラスを切り替えることで、状態の変化を表す方式");
        strings.add("抽象メソッドとして宣言し、インタフェースとする");
        strings.add("具象メソッドとして実装し、個々のクラスを作成する");
        strings.add("このように状態に依存した処理を表現する");
        strings.add("状態遷移は誰が管理するべきかを注意する、これによって依存度が高くなるクラスがわかれるため、だれが状態を遷移するべきかを考える");

        super.description(strings);
    }

    @Override
    protected void setMerit() {
        ArrayList<String> strings = new ArrayList<String>() {
        };
        strings.add("新しい状態を追加するのが簡単");
        super.merit(strings);
    }
}
