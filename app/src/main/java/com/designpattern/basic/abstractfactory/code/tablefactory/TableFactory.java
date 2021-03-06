package com.designpattern.basic.abstractfactory.code.tablefactory;

import com.designpattern.basic.abstractfactory.code.factory.Factory;
import com.designpattern.basic.abstractfactory.code.factory.Link;
import com.designpattern.basic.abstractfactory.code.factory.Page;
import com.designpattern.basic.abstractfactory.code.factory.Tray;
//基本singleton

public class TableFactory extends Factory {
    private static String TAG = TableFactory.class.getSimpleName();


    @Override
    public Link createL(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createT(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createP(String title, String author) {
        return new TablePage(title, author);
    }
}
