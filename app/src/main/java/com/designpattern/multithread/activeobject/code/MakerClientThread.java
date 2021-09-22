package com.designpattern.multithread.activeobject.code;

import com.designpattern.multithread.activeobject.code.activeobject.ActiveObject;
import com.designpattern.multithread.activeobject.code.activeobject.Result;

public class MakerClientThread extends Thread {
    private final ActiveObject activeObject;
    private final char fillchar;
    public MakerClientThread(String name, ActiveObject activeObject) {
        super(name);
        this.activeObject = activeObject;
        this.fillchar = name.charAt(0);
    }
    public void run() {
        try {
            for (int i = 0; true; i++) {
                //文字列を作成という非同期メッセージを「ActiveObject」に送る
                Result<String> result = activeObject.makeString(i, fillchar);
                Thread.sleep(10);
                String value = result.getResultValue();
                System.out.println(Thread.currentThread().getName() + ": value = " + value);
            }
        } catch (InterruptedException e) {
        }
    }
}
