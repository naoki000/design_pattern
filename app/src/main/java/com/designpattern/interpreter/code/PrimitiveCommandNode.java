package com.designpattern.interpreter.code;

public class PrimitiveCommandNode implements Node {
    private static String TAG = PrimitiveCommandNode.class.getSimpleName();

    private String name;
    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);
        if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
            throw  new ParseException(name + "is undefined");
        }
    }

    public String toString() {
        return name;
    }
}
