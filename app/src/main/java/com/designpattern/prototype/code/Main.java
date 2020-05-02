package com.designpattern.prototype.code;

import com.designpattern.AbsMainCode;
import com.designpattern.prototype.code.framework.Manager;
import com.designpattern.prototype.code.framework.MassageBox;
import com.designpattern.prototype.code.framework.Product;
import com.designpattern.prototype.code.framework.UnderLinePen;

public class Main extends AbsMainCode {
    private static String TAG = Main.class.getSimpleName();

    @Override
    protected void main() {
        //managerはシングルトン化して、ここのregisterはmangerでやって、EnumでTypeしてl25のように使う？
        Manager manager = new Manager();
        UnderLinePen upen = new UnderLinePen('~');
        MassageBox mbox = new MassageBox('*');
        MassageBox sbox = new MassageBox('/');

        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);
        ///////////////////////////

        Product p1 = manager.create("strong message");
        p1.use("hello");

        Product p2 = manager.create("warning box");
        p2.use("hello");

        Product p3 = manager.create("slash box");
        p3.use("hello");
    }
}
