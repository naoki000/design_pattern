package com.designpattern.chainofresponsibility.code;

import com.designpattern.AbsMainCode;

public class Main extends AbsMainCode {
    private static String TAG = Main.class.getSimpleName();

    @Override
    protected void main() {
        Support alice = new NoSupport("Alice");
        Support a = new SpecialSupport("A");
        alice.setNext(a);

        alice.support(new Trouble(10));
    }
}
