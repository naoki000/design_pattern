package com.designpattern.basic.decorator.code;

import com.designpattern.AbsMainCode;

public class Main extends AbsMainCode {
    private static String TAG = Main.class.getSimpleName();

    @Override
    protected void main() {
        Display d1 = new StringDisplay("hello");
        Display d2 = new SideBorder(d1, '#');
        Display d3 = new FullBorder(d2);

        d1.show();
        d2.show();
        d3.show();

        Display display =
                new SideBorder(
                        new SideBorder(
                                new FullBorder(
                                        new FullBorder(
                                                new SideBorder(
                                                        new FullBorder(
                                                                new StringDisplay("hello")
                                                        ), '*'
                                                )
                                        )
                                ), '/'
                        ), '@');
        display.show();
    }
}
