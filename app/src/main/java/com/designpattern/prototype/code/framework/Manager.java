package com.designpattern.prototype.code.framework;

import java.util.HashMap;

//cloneするやつ
public class Manager {
    private static String TAG = Manager.class.getSimpleName();
    private HashMap showcase = new HashMap();

    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String protoname) {
        Product p = (Product) showcase.get(protoname);
        return p.createClone();
    }
}
