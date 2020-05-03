package com.designpattern.observer.code;

import com.designpattern.AbsMainCode;

public class Main extends AbsMainCode {
    private static String TAG = Main.class.getSimpleName();

    @Override
    protected void main() {
        NumberGenerator generator = new RandomNumberGenerator();
        //種類の違うObserverを実装することで、同じタイミングで異なる処理ができる！
        Observer observer1 = new DigitObserver();
        generator.addObserver(observer1);
        generator.execute();

    }
}
