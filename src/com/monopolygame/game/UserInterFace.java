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

    public String createPlayerName() {
        System.out.println("Please enter the player name: ");
        Scanner sc = new Scanner(System.in);

        // Validate name input here later.
        String playerName = sc.nextLine();

        return playerName;
    }

    public void playerMoves(String name, int numberOfSteps) {
        System.out.println(name + " moves");
    }

    public void displayMaxRoundsVictory(String playerName, int credits) {

    }

    public void displayCreditChange(boolean creditsAdded, int amount, String playerName) {
        if(creditsAdded) {
            String output = String.format("%s earned a total of %s credits", playerName, amount);
            System.out.println(output);
        } else {
            String output = String.format("%s had to pay a total of %s credits", playerName, amount);
            System.out.println(output);
        }
    }

    public void displayBankrubtVictory(String winningPlayerName, String losingPlayerName, int credits) {

    }
}
