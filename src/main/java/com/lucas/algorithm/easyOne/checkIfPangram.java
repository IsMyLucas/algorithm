package com.lucas.algorithm.easyOne;

public class checkIfPangram {
    /**
     * 1832. Check if the Sentence Is Pangram
     * A pangram is a sentence where every letter of the English alphabet appears at least once.
     * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
     *
     * Example 1:
     * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
     * Output: true
     * Explanation: sentence contains at least one of every letter of the English alphabet.
     *
     * Example 2:
     * Input: sentence = "leetcode"
     * Output: false
     */

    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) return false;
        boolean res[] = new boolean[26];
        int i = 0;
        for (char c:sentence.toCharArray()) {
            if (res [c-97] == false){
                res [c-97] = true;
                i++;
            }
        }
        if (i < 26){
            return false;
        }
        return true;
    }
}
