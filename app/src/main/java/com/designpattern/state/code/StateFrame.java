package com.designpattern.state.code;

import android.util.Log;

public class StateFrame implements IContext {
    private static String TAG = StateFrame.class.getSimpleName();

    //状態を持つフィールドはこれだけ！
    private State state = DayState.getInstance();

    @Override
    public void setClock(int hour) {
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        Log.e(TAG, state.getClass() + " callSecurityCenter  " + msg);
    }

    @Override
    public void recordLog(String msg) {
        Log.e(TAG, state.getClass() + " recordLog " + msg);
    }

    enum Type {
        doUse,
        doAlarm,
        doPhone
    }

    //actionを一個にすればすっきりする
    public void action(Type type) {
        if (type == Type.doUse) {
            state.doUse(this);
            return;
        }

        if (type == Type.doAlarm) {
            state.doAlarm(this);
            return;
        }

        if (type == Type.doPhone) {
            state.doPhone(this);
            return;
        }
    }
}
