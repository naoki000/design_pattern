package com.designpattern.strategy.code;

import android.util.Log;

import com.designpattern.AbsMainCode;

public class Main extends AbsMainCode {
    private static String TAG = Main.class.getSimpleName();

    @Override
    protected void main() {
        int seed1 = 1;
        int seed2 = 2;
        Player player1 = new Player("Taro", new WinningStrategy(seed1));
        Player player2 = new Player("Hana", new ProbStrategy(seed2));
        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                Log.e(TAG, "Winner:" + player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                Log.e(TAG, "Winner:" + player2);
                player1.lose();
                player2.win();
            } else {
                Log.e(TAG, "Even...");
                player1.even();
                player2.even();
            }
        }
        Log.e(TAG, "Total result:");
        Log.e(TAG, player1.toString());
        Log.e(TAG, player2.toString());
    }
}
