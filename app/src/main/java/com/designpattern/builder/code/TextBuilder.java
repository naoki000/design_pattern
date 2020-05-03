package com.designpattern.builder.code;

public class TextBuilder implements Builder {
    static String TAG = TextBuilder.class.getSimpleName();

    private String buffer;

    @Override
    public void makeTitle(String title) {
        buffer = buffer + title;
    }

    @Override
    public void makeString(String str) {
        buffer = buffer + str;
    }

    @Override
    public void close() {
        buffer = buffer + "---end--";
    }

    public String getResult() {
        return buffer;
    }
}
