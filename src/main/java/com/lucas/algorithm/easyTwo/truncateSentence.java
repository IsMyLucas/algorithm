package com.lucas.algorithm.easyTwo;

public class truncateSentence {
    /**
     * 1816. Truncate Sentence
     * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
     * Each of the words consists of only uppercase and lowercase English letters (no punctuation).
     * For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
     * You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.
     *
     * Example 1:
     * Input: s = "Hello how are you Contestant", k = 4
     * Output: "Hello how are you"
     * Explanation:
     * The words in s are ["Hello", "how" "are", "you", "Contestant"].
     * The first 4 words are ["Hello", "how", "are", "you"].
     * Hence, you should return "Hello how are you".
     *
     * Example 2:
     * Input: s = "What is the solution to this problem", k = 4
     * Output: "What is the solution"
     * Explanation:
     * The words in s are ["What", "is" "the", "solution", "to", "this", "problem"].
     * The first 4 words are ["What", "is", "the", "solution"].
     * Hence, you should return "What is the solution".
     *
     * Example 3:
     * Input: s = "chopper is not a tanuki", k = 5
     * Output: "chopper is not a tanuki"
     */

    public static String truncateSentence(String s, int k) {
//        StringBuilder res = new StringBuilder();
//        String[] result = s.split(" ");
//        int i = 0;
//        for (; i < k-1; i++) {
//            res.append(result[i] + " ");
//        }
//        res.append(result[i]);
//        return res.toString();

        int count = 0;
        int num = 0;
        for (char c:s.toCharArray()) {
            if (c == ' '){
                count++;
            }
            if (count >= k) break;
            num++;
        }

        return num<s.length()?s.substring(0,num):s;
    }

    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        String res = truncateSentence(s,4);
        System.out.println(res);
    }
}
