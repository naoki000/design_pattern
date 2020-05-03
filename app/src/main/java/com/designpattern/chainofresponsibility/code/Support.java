package com.designpattern.chainofresponsibility.code;

import android.util.Log;

public abstract class Support {
    private static String TAG = Support.class.getSimpleName();

    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }

    }

    protected void done(Trouble trouble) {
        Log.e(TAG, trouble + "is done by " + this);
    }

    protected void fail(Trouble trouble) {
        Log.e(TAG, trouble + "is not support  ");
    }

    protected abstract boolean resolve(Trouble trouble);
}
