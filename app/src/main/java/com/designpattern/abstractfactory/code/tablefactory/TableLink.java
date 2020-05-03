package com.designpattern.abstractfactory.code.tablefactory;

import com.designpattern.abstractfactory.code.factory.Link;

public class TableLink extends Link {

    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "TableLink make HTML < " + caption + ">";
    }
}
