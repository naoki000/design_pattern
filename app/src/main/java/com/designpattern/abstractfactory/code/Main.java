package com.designpattern.abstractfactory.code;

import com.designpattern.AbsMainCode;
import com.designpattern.abstractfactory.code.factory.Factory;
import com.designpattern.abstractfactory.code.factory.Link;
import com.designpattern.abstractfactory.code.factory.Page;
import com.designpattern.abstractfactory.code.factory.Tray;

public class Main extends AbsMainCode {
    private static String TAG = Main.class.getSimpleName();

    @Override
    protected void main() {

        //簡単に別の工場を作ることができる！！
//        Factory factory = Factory.getFactory("com.designpattern.abstractfactory.code.listfactory.ListFactory");
        Factory factory = Factory.getFactory("com.designpattern.abstractfactory.code.tablefactory.TableFactory");

        Link asahi = factory.createL("asahi", "http.asahi");
        Link yomiuri = factory.createL("yomiuri", "http.yomiuri");

        Link yahoo = factory.createL("yahoo", "http.yahoo");

        Tray tray = factory.createT("newspaper");
        tray.add(asahi);
        tray.add(yomiuri);

        Tray trayyahoo = factory.createT("yahoo");
        trayyahoo.add(yahoo);

        Page page = factory.createP("LinkPage", "iwata");
        page.add(tray);
        page.add(trayyahoo);
        page.output();

    }
}
