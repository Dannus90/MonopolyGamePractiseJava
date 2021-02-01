package com.monopolygame.gamedependencies;

public class Player {
    private final String name;
    private int currentTile;
    private int credits;
    private final boolean isComputer;

    public Player(String name, int currentTile, int credits, boolean isComputer) {
        this.name = name;
        this.currentTile = currentTile;
        this.credits = credits;
        this.isComputer = isComputer;
    }

    public void getPaid(int payment) {
        credits += payment;
    }

    public void payRent(int sumToPay) {
        credits -= sumToPay;
    }

    public void setCurrentTile(int currentTile) {
        this.currentTile = currentTile;
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

    public boolean getIsComputer() {
        return this.isComputer;
    }
}
