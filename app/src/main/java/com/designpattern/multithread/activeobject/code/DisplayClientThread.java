package com.designpattern.multithread.activeobject.code;

import com.designpattern.multithread.activeobject.code.activeobject.ActiveObject;

public class DisplayClientThread extends Thread {
    private final ActiveObject activeObject;
    public DisplayClientThread(String name, ActiveObject activeObject) {
        super(name);
        this.activeObject = activeObject;
    }
    public void run() {
        try {
            for (int i = 0; true; i++) {
                // �߂�l�̂Ȃ��Ăяo��
                //文字列を表示するという非同期メッセージを「ActiveObject」に送る
                String string = Thread.currentThread().getName() + " " + i;
                activeObject.displayString(string);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
        }
    }
}
