package com.designpattern.multithread.activeobject.code.util.activeobject;

public class ActiveObjectFactory {
    public static ActiveObject createActiveObject() {
        return new ActiveObjectImpl();
    }
}
