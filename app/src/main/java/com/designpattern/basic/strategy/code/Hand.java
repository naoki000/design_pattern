package com.designpattern.basic.strategy.code;

public class Hand {
    private static String TAG = Hand.class.getSimpleName();

    public static final Hand[] hand = {
            new Hand(0),
            new Hand(1),
            new Hand(2),
    };

    private static final String[] name = {
            "グー", "チョキ", "パー"
    };

    private int handValue;

    private Hand(int handvalue) {
        this.handValue = handvalue;
    }

    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handValue + 1) % 3 == h.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return name[handValue];
    }
}
