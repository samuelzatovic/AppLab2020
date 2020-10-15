package com.appslab;

import java.util.Arrays;
import java.util.DuplicateFormatFlagsException;

public class Main {

    public static void main(String[] args)
    {
        int[] array = {44, 32, 86, 19};
        System.out.println(DifferenceMaxMin(array));
    }
    public static int DifferenceMaxMin(int[] array)
    {
        Arrays.sort(array);
        return array[array.length - 1] - array[0];
    }
}
