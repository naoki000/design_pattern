package com.designpattern.basic.interpreter.code;

import android.util.Log;

import com.designpattern.AbsMainCode;

import java.util.ArrayList;

public class Main extends AbsMainCode {
    private static String TAG = Main.class.getSimpleName();

    ArrayList<String> list = new ArrayList();
    @Override
    protected void main() {
        list.add("program end");
        list.add("program go end");
        list.add("program go right go right go right go right end");
        list.add("program repeat 4 go right end end");
        list.add("program repeat 4 repeat 3 go right go left end right end end");

        try {
            for (String str: list) {
                Log.e(TAG, "text = " + str);
                Node node = new ProgramNode();
                node.parse(new Context(str));
                Log.e(TAG, "node = " + node);
            }
        } catch (ParseException e) {
            e.printStackTrace();
            Log.e(TAG, " error " + e.toString() );
        }
    }
}
