package com.dmtryii;

/*
    Given a sorted array of distinct integers and a target value, return the index if the target is found.
    If not, return the index where it would be if it were inserted in order.
    Is it possible to write an algorithm with O(log n) runtime complexity?

    Examples:

    Input: values = [1,3,5,6], target = 7. Output: 4
    Input: values = [1], target = 0. Output: 0

    int findIndex(int[] values, int target)
 */

public class SearchInsertPosition {
    public static int findIndex(int[] values, int target) {
        int left = 0;
        int right = values.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (values[mid] == target) {
                return mid;
            } else if (values[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}
