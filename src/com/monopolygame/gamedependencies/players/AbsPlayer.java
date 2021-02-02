package com.monopolygame.gamedependencies.players;

import com.monopolygame.gamedependencies.players.interfaces.Player;

public abstract class AbsPlayer implements Player {
    private final String name;
    private int currentTile;
    private int credits;

    public AbsPlayer(String name, int currentTile, int credits) {
        this.name = name;
        this.currentTile = currentTile;
        this.credits = credits;
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

