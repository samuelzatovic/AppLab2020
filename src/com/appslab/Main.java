package com.appslab;

public class Main {
    public static void main(String[] args) {
        System.out.println(equal(1, 1, 1));
    }
    public static int equal(int a, int b, int c)
    {
        if(a == b || a == c){
            if(b == c) return 3;
            return 2;}

        if(b == c) return 2;
        return 0;
    }
}

