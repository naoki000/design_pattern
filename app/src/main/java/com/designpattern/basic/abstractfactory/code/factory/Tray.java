package com.designpattern.basic.abstractfactory.code.factory;

import java.util.ArrayList;

public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
        this.caption = caption;
    }

    public void add(Item item) {
        tray.add(item);
    }
}
