package com.appslab;

public class Main {

    public static void main(String[] args) {
    }
   public static boolean isPalindrome(String palindrome)
    {
        int i = 0, j = palindrome.length() - 1;
        while (i < j) {
            if (palindrome.charAt(i) != palindrome.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
