package com.dmtryii;

/*
    Given two arrays of numbers where each one contains unique values and is already sorted in ascending order,
    find the number of elements that belong to both arrays.

    int intersectionCount(int[] a, int[] b)
 */

public class Intersection {
    public static int intersectionCount(int[] a, int[] b) {
        int count = 0;
        int i = 0;
        int j = 0;

        int aLen = a.length;
        int bLen = b.length;

        while (i < aLen && j < bLen) {
            if (a[i] == b[j]) {
                count++;
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        return count;
    }
}
