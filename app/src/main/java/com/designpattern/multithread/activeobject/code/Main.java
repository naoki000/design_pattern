package com.designpattern.multithread.activeobject.code;

import com.designpattern.AbsMainCode;
import com.designpattern.multithread.activeobject.code.activeobject.ActiveObject;
import com.designpattern.multithread.activeobject.code.activeobject.ActiveObjectFactory;

public class Main extends AbsMainCode {
    private static String TAG = Main.class.getSimpleName();

    @Override
    protected void main() {
        ActiveObject activeObject = ActiveObjectFactory.createActiveObject();
        new MakerClientThread("Alice", activeObject).start();
        new MakerClientThread("Bobby", activeObject).start();
        new DisplayClientThread("Chris", activeObject).start();
    }
}
