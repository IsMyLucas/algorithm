package com.lucas.algorithm.easyOne;

import java.util.HashMap;
import java.util.Map;

public class countConsistentStrings {
    /**
     * 1684. Count the Number of Consistent Strings
     * You are given a string allowed consisting of distinct characters and an array of strings words.
     * A string is consistent if all characters in the string appear in the string allowed.
     * Return the number of consistent strings in the array words.
     *
     * Example 1:
     * Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
     * Output: 2
     * Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
     *
     * Example 2:
     * Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
     * Output: 7
     * Explanation: All strings are consistent.
     *
     * Example 3:
     * Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
     * Output: 4
     * Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
     */

    public int countConsistentStrings(String allowed, String[] words) {
        int res = 0;
        Map map = new HashMap();
        for (char c:allowed.toCharArray()) {
            map.put(c,this);
        }
        for (String word:words) {
            for (char s:word.toCharArray()) {
                if (map.get(s) == null){
                    res--;
                    break;
                }
            }
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        countConsistentStrings countConsistentStrings = new countConsistentStrings();
        //"fstqyienx"
        //["n","eeitfns","eqqqsfs","i","feniqis","lhoa","yqyitei","sqtn","kug","z","neqqis"]
        String allowed = "fstqyienx";
        String[] words = {"n","eeitfns","eqqqsfs","i","feniqis","lhoa","yqyitei","sqtn","kug","z","neqqis"};
        long start = System.currentTimeMillis();
        int res = countConsistentStrings.countConsistentStrings(allowed,words);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println(res);
    }
}
