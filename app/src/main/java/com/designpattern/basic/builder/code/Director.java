package com.designpattern.basic.builder.code;

public class Director {
    private static String TAG = Director.class.getSimpleName();
    private Builder builder;

    Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("Geeting");
        builder.makeString("おはよう");

        builder.close();
    }
}
