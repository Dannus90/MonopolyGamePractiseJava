package com.monopolygame.game;

import com.monopolygame.gamedependencies.Dice;
import com.monopolygame.gamedependencies.players.ComputerPlayer;
import com.monopolygame.gamedependencies.players.HumanPlayer;
import com.monopolygame.gamedependencies.players.PlayerBase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class MonopolyGame {
    private final Dice d1;
    private final Dice d2;
    private int numberOfPlayers;
    private ArrayList<PlayerBase> players = new ArrayList<PlayerBase>();
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

    private void play(PlayerBase player, Board board) {
        System.out.println("Temp");
    }

    /* private PlayerBase getWinningPlayer() {
        Optional<PlayerBase> winningPlayer = players.stream().max(Comparator.comparingInt(PlayerBase::getCredits));
        return winningPlayer;
    } */
}

