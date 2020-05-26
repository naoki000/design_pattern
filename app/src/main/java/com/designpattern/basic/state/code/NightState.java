package com.designpattern.basic.state.code;

public class NightState implements State {
    private static String TAG = NightState.class.getSimpleName();

    private static NightState sInstance;

    private NightState() {
    }

    public static State getInstance() {
        if (sInstance == null) {
            sInstance = new NightState();
        }
        return sInstance;
    }

    public void doClock(IContext context, int hour) {
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(IContext context) {
        context.callSecurityCenter("night state do use");
    }

    @Override
    public void doAlarm(IContext context) {
        context.callSecurityCenter("night state do alarm");
    }

    @Override
    public void doPhone(IContext context) {
        context.recordLog("night state do phone");
    }

    public String toString() {
        return "night";
    }

}
