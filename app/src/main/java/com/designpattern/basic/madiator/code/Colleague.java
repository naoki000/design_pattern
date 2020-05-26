package com.designpattern.basic.madiator.code;

interface Colleague {
    static String TAG = Colleague.class.getSimpleName();

    void setMediator(Mediator mediator);

    void setColleagueEnable(boolean b);
}