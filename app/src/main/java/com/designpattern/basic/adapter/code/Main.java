package com.designpattern.basic.adapter.code;

import com.designpattern.AbsMainCode;

public class Main extends AbsMainCode {

    @Override
    protected void main() {
        //mainはprintbannerの仕組みを知らなくてもBannerをつかって表示できる
        IPrint p = new PrintBanner("hello");
        p.printWeak();
    }
}
