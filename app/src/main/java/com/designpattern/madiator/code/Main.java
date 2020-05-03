package com.designpattern.madiator.code;

import android.app.Activity;
import android.content.Context;

import com.designpattern.AbsMainCode;

public class Main extends AbsMainCode {
    private static String TAG = Main.class.getSimpleName();

    private Context mContext;

    @Override
    protected void main() {
        new LogInFrame(mContext);
    }

    public void setContext(Activity context) {
        mContext = context;
    }
}
