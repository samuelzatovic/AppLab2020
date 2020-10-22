package com.appslab;

public class Main {

    public static void main(String[] args) {
        System.out.println(canCapture("H4", "H3"));
    }

    public static boolean canCapture(String a, String b) {

        {
            return a.charAt(0) == b.charAt(0) || a.charAt(1) == b.charAt(1);
        }
    }
}

