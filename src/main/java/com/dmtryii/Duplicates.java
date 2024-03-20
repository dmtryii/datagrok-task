package com.dmtryii;

import java.util.Arrays;

/*
    In an array of integers of length n + 1 (n > 1),
    every number in the range 1...n appears once except for one number which appears twice
    (so the array’s length is n+1). Write an efficient function that finds the number that appears twice.

    Examples:

    1,2,2,3 => 2
    1,2,3,3 => 3
    2,1,4,3,5,4 => 4

    int findDuplicate(int[] values)
 */

public class Duplicates {
    public static int findDuplicate(int[] values) {
        int n = values.length - 1;
        int sum = n * (n + 1) / 2;
        int actualSum = Arrays.stream(values).sum();
        return actualSum - sum;
    }
}
