package com.lucas.algorithm;

import static java.awt.AlphaComposite.XOR;

public class xorOperation {
    /**
     * 1486. XOR Operation in an Array
     * Given an integer n and an integer start.
     * Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.
     * Return the bitwise XOR of all elements of nums.
     *
     * Example 1:
     * Input: n = 5, start = 0
     * Output: 8
     * Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
     * Where "^" corresponds to bitwise XOR operator.
     *
     * Example 2:
     * Input: n = 4, start = 3
     * Output: 8
     * Explanation: Array nums is equal to [3, 5, 7, 9] where (3 ^ 5 ^ 7 ^ 9) = 8.
     *
     * Example 3:
     * Input: n = 1, start = 7
     * Output: 7
     *
     * Example 4:
     * Input: n = 10, start = 5
     * Output: 2
     */

    public static int xorOperation(int n, int start) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = res ^ ( start + i * 2);
        }
        return res;
    }

    public static void main(String[] args) {
        int res = xorOperation(4,3);
        System.out.println(res);
    }
}
