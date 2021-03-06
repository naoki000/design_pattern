package com.designpattern.basic.abstractfactory.code.listfactory;

import com.designpattern.basic.abstractfactory.code.factory.Factory;
import com.designpattern.basic.abstractfactory.code.factory.Link;
import com.designpattern.basic.abstractfactory.code.factory.Page;
import com.designpattern.basic.abstractfactory.code.factory.Tray;

//基本singleton
public class ListFactory extends Factory {
    private static String TAG = ListFactory.class.getSimpleName();


    @Override
    public Link createL(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createT(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createP(String title, String author) {
        return new ListPage(title, author);
    }
}
