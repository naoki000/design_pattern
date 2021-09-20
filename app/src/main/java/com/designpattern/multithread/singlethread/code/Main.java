package com.designpattern.multithread.singlethread.code;

import com.designpattern.AbsMainCode;

public class Main extends AbsMainCode {

    @Override
    protected void main() {
        Gate gate = new Gate();
        new UserThread(gate, "Alice", "Alaska").start();
        new UserThread(gate, "Bobby", "Brazil").start();
        new UserThread(gate, "Chris", "Canada").start();
    }
}
