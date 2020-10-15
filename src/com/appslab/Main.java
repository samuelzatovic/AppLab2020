package com.appslab;

public class Main {

    public static void main(String[] args) {
        System.out.println(RPS("paper", "scissors"));
    }
    public static String RPS(String player1, String player2)
    {
        if (player1.equals(player2))
            return "TIE";
        if (player1.equals("rock") && player2.equals("paper"))
            return "PLAYER 2 WINS";
        if (player1.equals("rock") && player2.equals("scissors"))
            return "PLAYER 1 WINS";
        if (player1.equals("paper") && player2.equals("rock"))
            return "PLAYER 1 WINS";
        if (player1.equals("paper") && player2.equals("scissors"))
            return "PLAYER 2 WINS";
        if (player1.equals("scissors") && player2.equals("rock"))
            return "PLAYER 2 WINS";
        if (player1.equals("scissors") && player2.equals("paper"))
            return "PLAYER 1 WINS";
        return "INVALID INPUT";
    }
}
