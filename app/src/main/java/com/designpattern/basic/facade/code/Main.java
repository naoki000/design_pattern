package com.designpattern.basic.facade.code;

import com.designpattern.AbsMainCode;
import com.designpattern.basic.facade.code.pagemaker.PageMaker;

public class Main extends AbsMainCode {
    private static String TAG = Main.class.getSimpleName();

    @Override
    protected void main() {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
    }
}
