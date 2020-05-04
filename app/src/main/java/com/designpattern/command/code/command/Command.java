package com.designpattern.command.code.command;

public interface Command {
    static String TAG = Command.class.getSimpleName();
    void execute();
    void print();
}
