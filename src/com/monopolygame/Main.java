package com.monopolygame;

import com.monopolygame.game.Board;
import com.monopolygame.game.MonopolyGame;
import com.monopolygame.game.UserInterFace;
import com.monopolygame.gamedependencies.Dice;

public class Main {
    public static void main(String[] args) {
        MonopolyGame monopolyGame = new MonopolyGame(new Dice(), new Dice(), new UserInterFace(), new Board());

        monopolyGame.startGame();
    }
}
