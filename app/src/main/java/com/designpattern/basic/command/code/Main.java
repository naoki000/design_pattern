package com.designpattern.basic.command.code;

import com.designpattern.AbsMainCode;
import com.designpattern.basic.command.code.command.Command;
import com.designpattern.basic.command.code.command.DrawCanvas;
import com.designpattern.basic.command.code.command.DrawCommand;
import com.designpattern.basic.command.code.command.MacroCommand;

public class Main extends AbsMainCode {
    private static String TAG = Main.class.getSimpleName();

    private MacroCommand history = new MacroCommand();
    private DrawCanvas canvas = new DrawCanvas(history);

    private void clearEvent() {
        history.clear();
    }

    private void eventStart(int n) {
        Command command = new DrawCommand(canvas, n);
        history.append(command);
        command.execute();
    }

    @Override
    protected void main() {
        eventStart(1);
        eventStart(2);
        eventStart(3);
        eventStart(4);
        clearEvent();
    }
}
