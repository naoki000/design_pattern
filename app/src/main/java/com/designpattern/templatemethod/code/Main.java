package com.designpattern.templatemethod.code;

import com.designpattern.AbsMainCode;

public class Main extends AbsMainCode {

    @Override
    protected void main() {
        AbsDisplay charDisp = new CharDisplay('A');
        charDisp.display();
    }
}
