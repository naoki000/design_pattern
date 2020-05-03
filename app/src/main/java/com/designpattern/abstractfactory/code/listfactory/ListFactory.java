package com.designpattern.abstractfactory.code.listfactory;

import com.designpattern.abstractfactory.code.factory.Factory;
import com.designpattern.abstractfactory.code.factory.Link;
import com.designpattern.abstractfactory.code.factory.Page;
import com.designpattern.abstractfactory.code.factory.Tray;

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
