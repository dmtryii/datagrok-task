package com.dmtryii;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
    Write an efficient function that checks whether any permutation of an input string is a palindrome.
    Note that the function is not a palindrome check (see example 2).

    Examples:

    "civic" should return True
    "ivicc" should return True  (because “civic” is a permutation of “ivicc”)
    "civil" should return False
    "livci" should return False

    bool isPalindromable(string s)
 */

public class Palindrome {
    public static boolean isPalindromable(String s) {
        Map<Character, Long> charFrequency = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return charFrequency.values().stream()
                .filter(frequency -> frequency % 2 != 0)
                .count() <= 1;
    }
}
