package com.lucas.algorithm.easyOne;

public class balancedStringSplit {
    /**
     * 1221. Split a String in Balanced Strings
     * Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
     * Given a balanced string s, split it in the maximum amount of balanced strings.
     * Return the maximum amount of split balanced strings.
     *
     * Example 1:
     * Input: s = "RLRRLLRLRL"
     * Output: 4
     * Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
     *
     * Example 2:
     * Input: s = "RLLLLRRRLR"
     * Output: 3
     * Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.
     *
     * Example 3:
     * Input: s = "LLLLRRRR"
     * Output: 1
     * Explanation: s can be split into "LLLLRRRR".
     *
     * Example 4:
     * Input: s = "RLRRRLLRLL"
     * Output: 2
     * Explanation: s can be split into "RL", "RRRLLRLL", since each substring contains an equal number of 'L' and 'R'
     */

    public static int balancedStringSplit(String s) {
        int res = 0;
        int i = 0;
        int j = 0;
        for (char c:s.toCharArray()) {
            if (c=='R'){
                i++;
            }else if (c=='L'){
                j++;
            }
            if (i == j){
                res++;
                i=0;
                j=0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int res = balancedStringSplit("RLRRLLRLRL");
        System.out.println(res);
    }
}
