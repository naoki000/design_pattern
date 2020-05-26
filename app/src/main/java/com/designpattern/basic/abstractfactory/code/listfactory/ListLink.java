package com.designpattern.basic.abstractfactory.code.listfactory;

import com.designpattern.basic.abstractfactory.code.factory.Link;

public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "make HTML < " + caption + ">";
    }
}
