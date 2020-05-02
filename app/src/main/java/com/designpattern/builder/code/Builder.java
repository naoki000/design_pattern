package com.designpattern.builder.code;

public interface Builder {
    static String TAG = Builder.class.getSimpleName();

    void makeTitle(String title);
    void makeString(String str);
    void close();
}
