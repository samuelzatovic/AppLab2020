package com.appslab;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkEnding("ahoj", "oj"));
    }
    public static boolean checkEnding(String a, String b)
    {
        return (a.endsWith(b));
    }
}
