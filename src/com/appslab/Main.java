package com.appslab;

public class Main {

    public static void main(String[] args) {
        double steps = 100;
        double length = 0.4;
        double height = 0.2;
        double totaldistance = (steps/height) * (length + height);
        System.out.println(totaldistance);
    }

}
