package com.designpattern.multithread.guardedsuspension.code;

import com.designpattern.AbsMainCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main extends AbsMainCode {

    @Override
    protected void main() {
        RequestQueue requestQueue = new RequestQueue();
        new ClientThread(requestQueue, "Alice", 3141592L).start();
        new ServerThread(requestQueue, "Bobby", 6535897L).start();
    }
}
