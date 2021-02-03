package com.monopolygame.gamedependencies.players;

public abstract class PlayerBase {
    private final String name;
    private int currentTile;
    private int credits;

    public PlayerBase(String name) {
        this.name = name;
        this.currentTile = 0;
        this.credits = 1000;
    }

    public void getPaid(int payment) {
        credits += payment;
    }

    public void payRent(int sumToPay) {
        credits -= sumToPay;
    }

    public void setCurrentTile(int newTile) {
        this.currentTile = newTile;
    }

    public int getCurrentTile() {
        return this.currentTile;
    }

    public int getCredits() {
        return this.credits;
    }

    public String getName() {
        return this.name;
    }
}

