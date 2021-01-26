package com.lucas.algorithm;

public class removeElement {

    /**
     * 27. Remove Element
     *
     * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
     * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
     * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
     *
     * Clarification:
     * Confused why the returned value is an integer but your answer is an array?
     * Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.
     * Internally you can think of this:
     *
     * // nums is passed in by reference. (i.e., without making a copy)
     * int len = removeElement(nums, val);
     * // any modification to nums in your function would be known by the caller.
     * // using the length returned by your function, it prints the first len elements.
     * for (int i = 0; i < len; i++) {
     *     print(nums[i]);
     * }
     *
     * Example 1:
     * Input: nums = [3,2,2,3], val = 3
     * Output: 2, nums = [2,2]
     * Explanation: Your function should return length = 2, with the first two elements of nums being 2.
     * It doesn't matter what you leave beyond the returned length. For example if you return 2 with nums = [2,2,3,3] or nums = [2,2,0,0], your answer will be accepted.
     *
     * Example 2:
     * Input: nums = [0,1,2,2,3,0,4,2], val = 2
     * Output: 5, nums = [0,1,4,0,3]
     * Explanation: Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4. Note that the order of those five elements can be arbitrary. It doesn't matter what values are set beyond the returned length.
     */

    /**
     * 移除元素，时间复杂度O(n),空间复杂度O(1)
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i=0;i<n;i++){
            while (nums[i]==val){
                if (nums[n-1] != val){
                    nums[i] = nums[n-1];
                }
                n--;
                if(i==n){
                    break;
                }
            }
        }
        return n;
    }

    /**
     * 移除元素，时间复杂度O(n),空间复杂度O(1)
     * 上面代码的精简版
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement2(int[] nums, int val) {
        int l = nums.length;
        for (int i=0; i<l; i++) {
            if (nums[i] == val) {
                nums[i--] = nums[l-- -1];//这行代码写的牛逼
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3,1,3,3,3,3,3};
        int len = removeElement(nums,3);
        System.out.println(len);
        for (int i =0;i<len;i++) {
            System.out.print(nums[i]+",");
        }
    }
}
