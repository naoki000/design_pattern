package com.designpattern.memento.code.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private static String TAG = Memento.class.getSimpleName();

    int money;
    ArrayList fruits;

    public int getMoney() {
        return money;
    }

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruits(String fruits) {
        this.fruits.add(fruits);
    }

    List getFruits() {
        return (List) fruits.clone();
    }
}
