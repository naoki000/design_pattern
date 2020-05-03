package com.designpattern.strategy.code;

public interface Strategy {
    String TAG = Strategy.class.getSimpleName();

    Hand nextHand();

    void study(boolean win);
}
