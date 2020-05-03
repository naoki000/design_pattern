package com.designpattern.state.code;

public class DayState implements State {
    private static String TAG = DayState.class.getSimpleName();

    private static DayState sInstance;

    private DayState() {
    }

    public static State getInstance() {
        if (sInstance == null) {
            sInstance = new DayState();
        }
        return sInstance;
    }

    public void doClock(IContext context, int hour) {
        if (hour < 9 || 17 <= hour) {
            //こうすることでstateないで別のstateに切り替えれる
            //状態遷移をいつするかをひとつのクラスにまとまっているのでいいが、
            //これは、ConcreteStateがほかのConcreteStateを知らなくてはいけないので、依存度が高くなってしまう。
            //良いこともあり悪いこともあるので注意
            //Context役だけが状態遷移こともできるが、ConcreteStateがすべての役を知らなくてはいけなくなり、ContextとStateの依存度が高くなるので注意
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(IContext context) {
        context.callSecurityCenter("day state do use");
    }

    @Override
    public void doAlarm(IContext context) {
        context.callSecurityCenter("day state do alarm");
    }

    @Override
    public void doPhone(IContext context) {
        context.recordLog("day state do phone");
    }

    public String toString() {
        return "day";
    }

}
