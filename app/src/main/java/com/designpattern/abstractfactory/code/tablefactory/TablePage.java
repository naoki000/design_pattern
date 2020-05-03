package com.designpattern.abstractfactory.code.tablefactory;

import com.designpattern.abstractfactory.code.factory.Item;
import com.designpattern.abstractfactory.code.factory.Page;

import java.util.Iterator;

public class TablePage extends Page {

    public TablePage(String title, String author) {
        super(title, author);
    }

    //itemの中身がListLinkなのかListTrayなのかを気にかける必要がない
    //itemの中身が実際何かを調べてswitch分やifぶんを使うプログラムを書いてはいけない
    //各itemの処理はそれぞれのクラス（サブクラスも含む）に任せるべき
    @Override
    public String makeHTML() {

        Iterator iterator = content.iterator();
        String str = "";
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            str = str + (item.makeHTML());
        }
        return "TablePage" + str;
    }
}
