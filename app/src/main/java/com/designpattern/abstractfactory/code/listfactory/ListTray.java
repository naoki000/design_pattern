package com.designpattern.abstractfactory.code.listfactory;

import com.designpattern.abstractfactory.code.factory.Item;
import com.designpattern.abstractfactory.code.factory.Tray;

import java.util.Iterator;

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
        this.caption = caption;
    }

    //itemの中身がListLinkなのかListTrayなのかを気にかける必要がない
    //itemの中身が実際何かを調べてswitch分やifぶんを使うプログラムを書いてはいけない
    //各itemの処理はそれぞれのクラス（サブクラスも含む）に任せるべき
    @Override
    public String makeHTML() {

        Iterator iterator = tray.iterator();
        String str = "";
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            str = str + (item.makeHTML());
        }
        return str;
    }
}
