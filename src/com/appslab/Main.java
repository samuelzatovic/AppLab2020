package com.appslab;

public class Main {

    public static void main(String[] args)
    {
    }
    public static boolean equalSlices(int totalSlices, int recipients, int slices) {
        return recipients * slices <= totalSlices;
    }
}