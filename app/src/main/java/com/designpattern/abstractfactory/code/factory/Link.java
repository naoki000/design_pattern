package com.designpattern.abstractfactory.code.factory;

public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.caption = caption;
        this.url = url;
    }
}
