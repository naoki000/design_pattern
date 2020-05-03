package com.designpattern.observer.code;

interface Observer {
    String TAG = Observer.class.getSimpleName();

    void update(NumberGenerator generator);
}
