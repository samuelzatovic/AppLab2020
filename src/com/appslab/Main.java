package com.appslab;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        int[] multiplyByLength = {1, 0, 3, 3, 7, 2, 1};
        int length = multiplyByLength.length;
        for (int i = 0; i < multiplyByLength.length; i++) {
            multiplyByLength[i] = multiplyByLength[i] * length;
            System.out.println(multiplyByLength[i]);
    }
}
}