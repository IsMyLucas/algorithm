package com.lucas.algorithm;

import org.springframework.util.StopWatch;

import java.util.ArrayList;
import java.util.List;

public class kidsWithCandies {
    /**
     * 1431. Kids With the Greatest Number of Candies
     *
     * Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.
     * For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number
     * of candies among them. Notice that multiple kids can have the greatest number of candies.
     *
     * Example 1:
     * Input: candies = [2,3,5,1,3], extraCandies = 3
     * Output: [true,true,true,false,true]
     * Explanation:
     * Kid 1 has 2 candies and if he or she receives all extra candies (3) will have 5 candies --- the greatest number of candies among the kids.
     * Kid 2 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids.
     * Kid 3 has 5 candies and this is already the greatest number of candies among the kids.
     * Kid 4 has 1 candy and even if he or she receives all extra candies will only have 4 candies.
     * Kid 5 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids.
     *
     * Example 2:
     * Input: candies = [4,2,1,1,2], extraCandies = 1
     * Output: [true,false,false,false,false]
     * Explanation: There is only 1 extra candy, therefore only kid 1 will have the greatest number of candies among the kids regardless
     * of who takes the extra candy.
     *
     * Example 3:
     * Input: candies = [12,1,12], extraCandies = 10
     * Output: [true,false,true]
     */

    /**
     * Kids With the Greatest Number of Candies,时间复杂度O(n),空间复杂度O(1)
     * @param candies
     * @param extraCandies
     * @return
     */
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = candies[0];
        for (int a:candies) {
            max = Math.max(max,a);
        }
        for (int a:candies) res.add(a+extraCandies>=max);
        return res;
    }

    /**
     * 效率比上面的方法好，上面那个的时间复杂度为O(2n),这个的时间复杂度为O(n+logn),但空间复杂度为O(n)
     * 找出最大值用了大根堆的方法，优于上面遍历全部的方法。
     * @param candies
     * @param extraCandies
     * @return
     */
    public static List<Boolean> kidsWithCandies1(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int len = candies.length;
        int[] temp = candies.clone();
        for (int i =(len-1)/2;i>=0;i--){
            if (2*i<len && temp[i]<temp[2*i]){
                temp[i] = temp[2*i];
            }
            if (2*i+1<len && temp[i]<temp[2*i+1]){
                temp[i] = temp[2*i+1];
            }
        }
        int max = temp[0];
        for (int a:candies) res.add(a+extraCandies>=max);
        return res;
    }



    public static void main(String[] args) {
        int candies[] = {1,5,4,2,7,8,3};//false,true,true,false,true,true,true,
        StopWatch stop = new StopWatch();
        stop.start("task1");
        List<Boolean> res = kidsWithCandies1(candies,5);
        stop.stop();
        stop.start("task2");
        List<Boolean> res1 = kidsWithCandies(candies,5);
        stop.stop();
        for (Boolean a:res) {
            System.out.print(a+",");
        }
        System.out.println(stop.prettyPrint());
    }
}
