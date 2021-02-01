package com.lucas.algorithm;

public class plusOne {

    /**
     * 66. Plus One
     *
     * Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
     * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
     * You may assume the integer does not contain any leading zero, except the number 0 itself.
     *
     * Example 1:
     * Input: digits = [1,2,3]
     * Output: [1,2,4]
     * Explanation: The array represents the integer 123.
     *
     * Example 2:
     * Input: digits = [4,3,2,1]
     * Output: [4,3,2,2]
     * Explanation: The array represents the integer 4321.
     *
     * Example 3:
     * Input: digits = [0]
     * Output: [1]
     */

    /**
     * plus one,时间复杂度最好请款O(1)，最坏情况O(n),空间复杂度最好情况O(1)，最坏情况O(n)
     * 对其整数数组加一
     * attention：不要忽略末尾位为9，和全是9的特殊数组。
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {

        int length = digits.length;
        for (int i=length-1;i>=0;i--){
            digits[i] = (digits[i]+1)%10;
            if(digits[i]!=0){
                return digits;
            }
        }
        int res[] = new int[length + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,9,1};
        for (int a:arr) {
            System.out.print(a);
        }
        System.out.println();
        int[] res = plusOne(arr);
        for (int a:res) {
            System.out.print(a);
        }
    }
}
