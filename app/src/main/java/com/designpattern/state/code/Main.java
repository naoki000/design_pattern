package com.designpattern.state.code;

import com.designpattern.AbsMainCode;

public class Main extends AbsMainCode {
    private static String TAG = Main.class.getSimpleName();

    @Override
    protected void main() {
        //mainは今どのstateであるかを気にすることなくStateを利用できる

        StateFrame stateFrame = new StateFrame();
        stateFrame.setClock(10);
        stateFrame.action(StateFrame.Type.doUse);
        stateFrame.action(StateFrame.Type.doPhone);
        stateFrame.action(StateFrame.Type.doAlarm);

        stateFrame.setClock(20);
        stateFrame.action(StateFrame.Type.doUse);
        stateFrame.action(StateFrame.Type.doPhone);
        stateFrame.action(StateFrame.Type.doAlarm);
    }
}
