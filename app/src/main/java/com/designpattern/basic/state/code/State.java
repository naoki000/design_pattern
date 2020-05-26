package com.designpattern.basic.state.code;

public interface State extends Cloneable {
    static String TAG = State.class.getSimpleName();

    void doClock(IContext context, int hour);

    void doUse(IContext context);

    void doAlarm(IContext context);

    void doPhone(IContext context);
}
