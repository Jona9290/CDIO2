package com.company;


import java.util.Scanner;

public class Game {

    String Player1;
    String Player2;
    //DIE
    Die die1;
    Die die2;
    public Game() {
        die1 = new Die();
        die2 = new Die();

    }

    //12 fields
    int field1 = 2;
    int field2 = 3;
    int field3 = 4;
    int field4 = 5;
    int field5 = 6;
    int field6 = 7;
    int field7 = 8;
    int field8 = 9;
    int field9 = 10;
    int field10 = 11;
    int field11 = 12;

    int totalMoneyPlayer1;


  public void test() {
      int value1 = die1.roll();
      int value2 = die2.roll();
      int totalValue = value1+value2;
      System.out.println(Player1 + " has rolled a total of: "+ (totalValue));
        if(totalValue == field1) {
            System.out.println(Player1 + " Has therefore landed on Tower! Which grants him +250 coins!");
            int totalMoneyPlayer1;
            totalMoneyPlayer1 = moneyPlayer1 + 250;
            System.out.println(Player1 + "'s" + " status is now: "+ totalMoneyPlayer1);
        }
        else if(totalValue == field2) {
            System.out.println("Awww.. " + Player1 + " has unfortunately landed on a Crater, therefore losing -100 coins!");
            int totalMoneyplayer1;
            totalMoneyPlayer1 = moneyPlayer1 + totalValue;
            System.out.println(Player1 + "'s" + " status is now: "+ totalMoneyPlayer1);
        }
        else if(totalValue == field3) {
            System.out.println("Just outside the Palace gates " + Player1 + " luckily found +100 coins.");
            int totalMoneyplayer1 = moneyPlayer1 + +100;
            totalMoneyPlayer1 = moneyPlayer1 + 100;
            System.out.println(Player1 + "'s" + " status is now: "+ totalMoneyPlayer1);
        }
        else if(totalValue == field4) {
            System.out.println("One cold night " + Player1 + " was robbed of -20 coins by desert bandits.");
            int totalMoneyplayer1 = moneyPlayer1 - 20;
            totalMoneyPlayer1 = moneyPlayer1 - 10;
            System.out.println(Player1 + "'s" + " status is now: "+ totalMoneyPlayer1);
        }
        else if(totalValue == field5) {
            System.out.println("Inside the Walled city " + Player1 + " makes a good trade earning him +180 coins.");
            int totalMoneyplayer1 = moneyPlayer1 + 180;
            totalMoneyPlayer1 = moneyPlayer1 + 180;
            System.out.println(Player1 + "'s" + " status is now: "+ totalMoneyPlayer1);
        }
        else if(totalValue == field6) {
            System.out.println(Player1 + " gets no profit at the Monastery +0 coins.");
            int totalMoneyplayer1 = moneyPlayer1 + 0;
            totalMoneyPlayer1 = moneyPlayer1 + 0;
            System.out.println(Player1 + "'s" + " status is now: "+ totalMoneyPlayer1);
        }
        else if(totalValue == field7) {
            System.out.println("After exiting the black cave " + Player1 + " found -70 coins missing.");
            int totalMoneyplayer1 = moneyPlayer1 - 70;
            totalMoneyPlayer1 = moneyPlayer1 - 70;
            System.out.println(Player1 + "'s" + " status is now: "+ totalMoneyPlayer1);
        }
        else if(totalValue == field8) {

            System.out.println(Player1 + " found +60 coins on the table inside one of the huts on the mountain.");
            int totalMoneyplayer1 = moneyPlayer1 + 60;
            totalMoneyPlayer1 = moneyPlayer1 + 60;
            System.out.println(Player1 + "'s" + " status is now: "+ totalMoneyPlayer1);
        }
        else if(totalValue == field9) {
            System.out.println("Visiting the Werewall " + Player1 + " sadly lost -80 coins. But he gets an EXTRA TURN!");
            int totalMoneyplayer1 = moneyPlayer1 - 80;
            totalMoneyPlayer1 = moneyPlayer1 + -80;
            System.out.println(Player1 + "'s" + " status is now: "+ totalMoneyPlayer1);
        }
        else if(totalValue == field10) {
            System.out.println(Player1 + " drops -50 coins in the pit.");
            int totalMoneyplayer1 = moneyPlayer1 - 50;
            totalMoneyPlayer1 = moneyPlayer1 - 50;
            System.out.println(Player1 + "'s" + " status is now: "+ totalMoneyPlayer1);
        }
        else if(totalValue == field11) {
            System.out.println("WOOOW! " + Player1 + " discovered a GOLDMINE! Earning him +650 gold!");
            int totalMoneyplayer1 = moneyPlayer1 + 650;
            totalMoneyPlayer1 = moneyPlayer1 + 650;
            System.out.println(Player1 + "'s" + " status is now: "+ totalMoneyPlayer1);
        }
        if (totalMoneyPlayer1 >= 1030){
           System.out.println(Player1 + " has won");

        }
  }

    // Player money
    private final int max = 3000;
    private int moneyPlayer1 = 1000;
    private int moneyPlayer2 = 1000;
    public void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, Player 1 type your name.");
        String player1 = input.nextLine();

        System.out.println("Hello, Player 2 type your name.");
        String Player2 = input.nextLine();

        System.out.println(player1 + " and " + Player2 +" is now playing!");
        System.out.println("Both " + player1 + " and " + Player2 + " starts with 1000 coins");
        System.out.println(player1 + "'s" + " current status:" + moneyPlayer1 + "  " + Player2 + "'s" + " current status: " + moneyPlayer2);
        System.out.println(" ");
        System.out.println(Player1 + " press entet to roll the dice,");




    }

}

