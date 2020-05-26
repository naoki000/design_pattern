package com.designpattern.basic.builder.code;

import android.util.Log;

import com.designpattern.AbsMainCode;

public class Main extends AbsMainCode {
    private static String TAG = Main.class.getSimpleName();

    @Override
    protected void main() {
        //directorは実際に動いてるのがHTMLかTEXTかを意識しない。

        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String res = textBuilder.getResult();
        Log.e(TAG, res);

        HTMLBuilder htmlBuilder = new HTMLBuilder();
        Director director2 = new Director(htmlBuilder);
        director2.construct();
        String res2 = htmlBuilder.getResult();
        Log.e(TAG, res2);
    }
}
