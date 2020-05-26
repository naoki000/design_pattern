package com.designpattern.basic.state.code;

public interface IContext {
    static String TAG = IContext.class.getSimpleName();

    void setClock(int hour);

    void changeState(State state);

    void callSecurityCenter(String msg);

    void recordLog(String msg);
}
