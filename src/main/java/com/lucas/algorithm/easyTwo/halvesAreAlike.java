package com.lucas.algorithm.easyTwo;

import java.util.HashMap;
import java.util.Map;

public class halvesAreAlike {
    /**
     * 1704. Determine if String Halves Are Alike
     * You are given a string s of even length. Split this string into two halves of equal lengths,
     * and let a be the first half and b be the second half.
     * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
     * Notice that s contains uppercase and lowercase letters.
     * Return true if a and b are alike. Otherwise, return false.
     *
     * Example 1:
     * Input: s = "book"
     * Output: true
     * Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
     *
     * Example 2:
     * Input: s = "textbook"
     * Output: false
     * Explanation: a = "text" and b = "book". a has 1 vowel where as b has 2. Therefore, they are not alike.
     * Notice that the vowel o is counted twice.
     *
     * Example 3:
     * Input: s = "MerryChristmas"
     * Output: false
     *
     * Example 4:
     * Input: s = "AbCdEfGh"
     * Output: true
     */
    final String vowels = "aeoiuAEOIU";
    public boolean halvesAreAlike(String s) {
        int count = 0;
        int mid = s.length()/2;
        for (int i =0,j=mid; i<mid;i++,j++){
            if (vowels.indexOf(s.charAt(i)) >= 0) count++;
            if (vowels.indexOf(s.charAt(j)) >= 0) count--;
        }
        return count==0;
    }

    public static void main(String[] args) {
        String s= "book";
        halvesAreAlike h = new halvesAreAlike();
        System.out.println(h.halvesAreAlike(s));
    }
}
