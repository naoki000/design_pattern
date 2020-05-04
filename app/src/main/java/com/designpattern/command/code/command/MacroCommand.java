package com.designpattern.command.code.command;

import android.util.Log;

import java.util.Iterator;
import java.util.Stack;

public class MacroCommand implements Command {
    static String TAG = MacroCommand.class.getSimpleName();

    //スタックを使えば、これまでの描画をすべて持っており、描画履歴を保存することもできる！
    // -> 試しにclear時に描画履歴を表示するようにした
    private Stack commands = new Stack();

    @Override
    public void execute() {
        Iterator iterator = commands.iterator();
        while (iterator.hasNext()) {
            ((Command) iterator.next()).execute();
        }
    }

    @Override
    public void print() {
    }

    public void append(Command command) {
        if (command != this) {
            commands.push(command);
        }
    }

    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    public void clear() {
        while (!commands.empty()) {
            ((Command)commands.pop()).print();
        }

        commands.clear();
    }
}
