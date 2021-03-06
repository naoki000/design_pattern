package com.designpattern.basic.interpreter.code;


public class ProgramNode implements Node {
    private static String TAG = ProgramNode.class.getSimpleName();

    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    public String toString() {
        return "[program" + commandListNode + "]";
    }
}
