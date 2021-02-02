package com.monopolygame.gamedependencies.players;

public class ComputerPlayer extends PlayerBase {
    public ComputerPlayer(String name) {
        super(name);
    }

    public boolean makeDecision(String type) {
        double randomNumber = Math.random();
        return randomNumber > 0.5;
    }
}
