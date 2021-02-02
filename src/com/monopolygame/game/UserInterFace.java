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
        System.out.println("Please enter the player or computer name: ");
        Scanner sc = new Scanner(System.in);

        // Validate name input here later.
        String playerName = sc.nextLine();

        return playerName;
    }

    public void playerMoves(String playerName, int numberOfSteps) {
        String output = String.format("%s moves a total of %s steps.", playerName, numberOfSteps);
        System.out.println(output);
    }

    public void displayMaxRoundsVictory(String playerName, int credits) {

    }

    public boolean isHuman() {
        System.out.println("If the next player is a human press 1 other press 2: ");
        Scanner sc = new Scanner(System.in);

        int pickedNumber = 0;
        while(pickedNumber != 1 && pickedNumber != 2) {
            pickedNumber = sc.nextInt();
        }

        return pickedNumber == 1;
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

    public void payRent(int amount, String payingPlayer, String paidPlayer) {
        String output = String.format("%s had to pay %s %s credits", payingPlayer, paidPlayer, amount);
    }

    public void buyProperty(int amount, String playerName, String streetName) {
        String output = String.format("%s bought %s for a total of %s credits", playerName, streetName, amount);
        System.out.println(output);
    }

    public void displayBankrubtVictory(String winningPlayerName, String losingPlayerName, int credits) {

    }
}
