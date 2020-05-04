package com.designpattern.interpreter.code;

public class RepeatCommandNode implements Node {
    private static String TAG = RepeatCommandNode.class.getSimpleName();

    private Node commandListNode;
    private int num;
    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        num = context.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    public String toString() {
        return "[program" + commandListNode + "]";
    }
}
