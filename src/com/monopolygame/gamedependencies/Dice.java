package com.monopolygame.gamedependencies;

public class Dice {
    private int value;

    public void roll() {
        value = (int)Math.floor(Math.random() * 6) + 1;
    }

    public int getValue() {
        return value;
    }
}
