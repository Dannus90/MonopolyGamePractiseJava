package com.monopolygame.game;

import java.util.Scanner;

public class UserInterFace {
    public int getNumberOfPlayers() {
        System.out.println("Please enter the amount of players: ");
        Scanner sc = new Scanner(System.in);

        int numberOfPlayers = sc.nextInt();
        sc.close();

        return numberOfPlayers;
    }

    private String createPlayerName() {
        System.out.println("Please enter the player name: ");
        Scanner sc = new Scanner(System.in);

        String playerName = sc.nextLine();

        return playerName;
    }
}
