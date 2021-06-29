package com.lucas.algorithm.easyTwo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class uniqueMorseRepresentations {
    /**
     * 804. Unique Morse Code Words
     * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes,
     * as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
     * For convenience, the full table for the 26 letters of the English alphabet is given below:
     * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
     * Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example,
     * "cab" can be written as "-.-..--...", (which is the concatenation "-.-." + ".-" + "-..."). We'll call such a concatenation,
     * the transformation of a word.
     * Return the number of different transformations among all words we have.
     *
     * Example:
     * Input: words = ["gin", "zen", "gig", "msg"]
     * Output: 2
     * Explanation:
     * The transformation of each word is:
     * "gin" -> "--...-."
     * "zen" -> "--...-."
     * "gig" -> "--...--."
     * "msg" -> "--...--."
     *
     * There are 2 different transformations, "--...-." and "--...--.".
     */

    final String[] standard = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Map map = new HashMap();
        for (String word:words) {
            StringBuilder str = new StringBuilder();
            for (char c:word.toCharArray()) {
                str.append(standard[c-97]);
            }
            map.put(str.toString(),this);
        }
        return map.size();
    }

    public static void main(String[] args) {
        uniqueMorseRepresentations uniqueMorseRepresentations = new uniqueMorseRepresentations();
        String[] words = {"gin", "zen", "gig", "msg"};
        int res = uniqueMorseRepresentations.uniqueMorseRepresentations(words);
        System.out.println(res);
    }

}
