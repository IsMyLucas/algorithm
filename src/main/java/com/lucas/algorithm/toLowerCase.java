package com.lucas.algorithm;

public class toLowerCase {
    /**
     * 709. To Lower Case
     * Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
     *
     * Example 1:
     * Input: s = "Hello"
     * Output: "hello"
     *
     * Example 2:
     * Input: s = "here"
     * Output: "here"
     *
     * Example 3:
     * Input: s = "LOVELY"
     * Output: "lovely"
     */

    public String toLowerCase(String s) {
        StringBuilder res = new StringBuilder();
        for (char c:s.toCharArray()) {
            res.append((c>=65 && c<=90 ? (char)(c + 32) : c));
        }
        return res.toString();
    }
}
