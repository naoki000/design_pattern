package com.designpattern.interpreter.code;

public interface Node {
    static String TAG = Node.class.getSimpleName();
    void parse(Context context) throws ParseException;
}
