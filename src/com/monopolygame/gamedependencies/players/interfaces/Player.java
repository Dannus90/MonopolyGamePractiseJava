package com.monopolygame.gamedependencies.players.interfaces;

public interface Player {
    public void getPaid(int payment);

    public void payRent(int sumToPay);

    public void setCurrentTile(int newTile);

    public int getCurrentTile();

    public int getCredits();

    public String getName();
}
