package com.designpattern.builder.code;

//HTMLの処理は省略
public class HTMLBuilder implements Builder{
    static String TAG = HTMLBuilder.class.getSimpleName();

    private String buffer;

    @Override
    public void makeTitle(String title) {
        buffer = "html" +  buffer + title;
    }

    @Override
    public void makeString(String str) {
        buffer ="html" +  buffer + str;
    }

    @Override
    public void close() {
        buffer = "html" + buffer + "---end--";
    }

    public String getResult() {
        return buffer;
    }
}
