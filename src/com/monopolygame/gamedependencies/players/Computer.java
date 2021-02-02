package com.monopolygame.gamedependencies.players;

import com.monopolygame.gamedependencies.players.interfaces.Player;

public class Computer extends AbsPlayer {
    public Computer(String name, int currentTile, int credits) {
        super(name, currentTile, credits);
    }

    public boolean makeDecision(String type) {
        double randomNumber = Math.random();
        return randomNumber > 0.5;
    }
}
