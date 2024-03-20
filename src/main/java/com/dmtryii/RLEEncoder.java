package com.dmtryii;

/*
    Given a string of letters (without numbers),
    create a string encoding it by the rules where the first character is char itself,
    followed by a number indicating the number of letter repeats.

    Examples:

    ABBA => A1B2A1
    ATTTGC => A1T3G1C1

    string rle(string s)
 */

public class RLEEncoder {
    public static String rle(String s) {
        if (s == null || s.isEmpty()) return "";

        StringBuilder encoded = new StringBuilder();
        char currentChar = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) count++;
            else {
                encoded.append(currentChar).append(count);
                currentChar = s.charAt(i);
                count = 1;
            }
        }

        encoded.append(currentChar).append(count);

        return encoded.toString();
    }
}
