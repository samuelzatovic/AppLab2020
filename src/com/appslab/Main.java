package com.appslab;

public class Main {

    public static void main(String[] args) {
        System.out.println(RPS("rock", "paper"));
    }
    public static String RPS(String player1, String player2)
    {
        if (player1.equals(player2))
            return "TIE";
        if (player1.equals("rock") && player2.equals("paper"))
            return "PLAYER 2 WINS";
        return "";

    }
}
