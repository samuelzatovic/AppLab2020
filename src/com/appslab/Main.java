package com.appslab;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 4, 2, 3, 19, 28, 142, 333};
        System.out.println(warOfNumbers(numbers));
    }
    public static boolean isNumOdd(int num){
        return num % 2 != 0;
    }
    public static int warOfNumbers(int[] numbers)
    {
        int even = 0, odd = 0;
        for (int number : numbers) {
            if (isNumOdd(number)) {
                odd += number;
            } else {
                even += number;
            }
        }
        return Math.abs(even - odd);
    }
}
