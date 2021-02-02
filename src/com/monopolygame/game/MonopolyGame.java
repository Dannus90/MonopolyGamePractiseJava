package com.monopolygame.game;

import com.monopolygame.gamedependencies.Dice;
import com.monopolygame.gamedependencies.players.Computer;
import com.monopolygame.gamedependencies.players.Human;
import com.monopolygame.gamedependencies.players.interfaces.Player;

import java.util.ArrayList;

public class MonopolyGame {
    private Dice d1;
    private Dice d2;
    private int numberOfPlayers;
    private ArrayList<Player> players;
    private UserInterFace ui;
    private int currentPlayerNumber;
    private Board board;

    public MonopolyGame(Dice d1, Dice d2, UserInterFace ui, Board board) {
        this.d1 = d1;
        this.d2 = d2;
        this.ui = ui;
        this.board = board;

        Computer computer1 = new Computer("Tamimosaurus", 0, 1000);
        Human player1 = new Human("Daniel", 0, 1000);

        players.add(computer1);
        players.add(player1);
    }

    public void startGame() {
        d1.roll();
        d2.roll();

        int firstValue = d1.getValue();
        int secondValue = d2.getValue();
    }

    private void play(Player player, Board board) {
        System.out.println("Temp");
    }
}
