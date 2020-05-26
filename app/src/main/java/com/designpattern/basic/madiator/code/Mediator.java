package com.designpattern.basic.madiator.code;

interface Mediator {
    static String TAG = Mediator.class.getSimpleName();

    void createColleagues();

    void colleagueChanged();
}

