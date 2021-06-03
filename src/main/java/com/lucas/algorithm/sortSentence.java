package com.lucas.algorithm;

public class sortSentence {
    /**
     * 1859. Sorting the Sentence
     * A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
     * A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
     * For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
     * Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
     *
     * Example 1:
     * Input: s = "is2 sentence4 This1 a3"
     * Output: "This is a sentence"
     * Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
     *
     * Example 2:
     * Input: s = "Myself2 Me1 I4 and3"
     * Output: "Me Myself and I"
     * Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.
     */

    public static String sortSentence(String s) {
        StringBuilder res = new StringBuilder();
        String sub[] = new String[s.length()];
        String[] str = s.split(" ");
        for (String s1:str) {
            sub[s1.charAt(s1.length()-1) - '0'] = s1.substring(0,s1.length()-1);
        }
        int i = 1;
        for (;i < str.length; i++) {
            res.append(sub[i] + " ");
        }
        res.append(sub[i]);

        return res.toString();

//        String[] str = s.split(" ");                // Since the String contains only whitespaces, it's safe to split the String at them
//        String[] res = new String[str.length];      // This String array will hold the rearranged words
//        StringBuilder sb = new StringBuilder();     // Instead of using '+' operator to concat repeatedly, I have created a StringBuilder object which is more efficient
//        int i = 0;
//        for (String elem : str) {
//            i = (int) (elem.charAt(elem.length() - 1) - '0');  // This  will extract the digit present at the end of each String and store it in i (i = index of the word in res[])
//            res[i - 1] = elem.substring(0, elem.length() - 1); // This gives the substring of each String except for the digit in the end and stores the word at an appropriate index (i - 1) in res[]
//        }
//        //append the words from res[] to StringBuilder object to form a sentence
//        for (i = 0; i < res.length - 1; i++)
//            sb.append(res[i]).append(" ");
//        sb.append(res[i]);
//        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "is2 sentence4 This1 a3";
        String res = sortSentence(str);
        System.out.println(res);
    }
}
