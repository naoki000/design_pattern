package com.designpattern.basic.factorymethod.code;

import com.designpattern.AbsMainCode;
import com.designpattern.basic.factorymethod.code.framework.Factory;
import com.designpattern.basic.factorymethod.code.framework.Product;
import com.designpattern.basic.factorymethod.code.idcard.IDCardFactory;

public class Main extends AbsMainCode {
    private static String TAG = Main.class.getSimpleName();

    @Override
    protected void main() {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("A");
        Product card2 = factory.create("B");
        card1.use();
        card2.use();
    }
}
