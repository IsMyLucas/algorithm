package com.lucas.algorithm.easyOne;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class numIdenticalPairs {
    /**
     * 1512. Number of Good Pairs
     *
     * Given an array of integers nums.
     * A pair (i,j) is called good if nums[i] == nums[j] and i < j.
     * Return the number of good pairs.
     *
     * Example 1:
     * Input: nums = [1,2,3,1,1,3]
     * Output: 4
     * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
     *
     * Example 2:
     * Input: nums = [1,1,1,1]
     * Output: 6
     * Explanation: Each pair in the array are good.
     *
     * Example 3:
     * Input: nums = [1,2,3]
     * Output: 0
     */

    public static int numIdenticalPairs(int[] nums) {
        int res = 0;
        int[] temp = new int[101];
        for (int a:nums) temp[a]++;
        for (int a:temp) res += (a * (a - 1))/2;
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int res = numIdenticalPairs(nums);
        System.out.println(res);
    }
}
