package com.monopolygame.game;

import com.monopolygame.gamedependencies.Dice;
import com.monopolygame.gamedependencies.players.ComputerPlayer;
import com.monopolygame.gamedependencies.players.HumanPlayer;
import com.monopolygame.gamedependencies.players.PlayerBase;
import com.monopolygame.gamedependencies.players.interfaces.Player;

import java.util.ArrayList;

public class MonopolyGame {
    private final Dice d1;
    private final Dice d2;
    private int numberOfPlayers;
    private ArrayList<Player> players = new ArrayList<Player>();
    private UserInterFace ui;
    private int currentPlayerNumber;
    private Board board;

    public MonopolyGame(Dice d1, Dice d2, UserInterFace ui, Board board) {
        this.d1 = d1;
        this.d2 = d2;
        this.ui = ui;
        this.board = board;
    }

    public void startGame() {
        d1.roll();
        d2.roll();

        ComputerPlayer computer1 = new ComputerPlayer("Tamimosaurus");
        HumanPlayer player1 = new HumanPlayer("Daniel");
        ui.displayCreditChange(true, 500, computer1.getName());

        players.add(computer1);
        players.add(player1);

        int firstValue = d1.getValue();
        int secondValue = d2.getValue();
    }

    private void play(Player player, Board board) {
        System.out.println("Temp");
    }
}
