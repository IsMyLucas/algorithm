package com.lucas.algorithm.easyOne;

import org.springframework.util.StopWatch;

public class countAndSay {

    /**
     * 38. Count and Say
     *
     * he count-and-say sequence is a sequence of digit strings defined by the recursive formula:
     *
     * countAndSay(1) = "1"
     * countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
     * To determine how you "say" a digit string, split it into the minimal number of groups so that each group is a contiguous section all of the same character.
     * Then for each group, say the number of characters, then say the character. To convert the saying into a digit string, replace the counts with a number and
     * concatenate every saying.
     * For example, the saying and conversion for digit string "3322251":
     * Given a positive integer n, return the nth term of the count-and-say sequence.
     *
     *
     * Example 1:
     * Input: n = 1
     * Output: "1"
     * Explanation: This is the base case.
     *
     * Example 2:
     * Input: n = 4
     * Output: "1211"
     * Explanation:
     * countAndSay(1) = "1"
     * countAndSay(2) = say "1" = one 1 = "11"
     * countAndSay(3) = say "11" = two 1's = "21"
     * countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
     */

    /**
     * 计数和演讲，时间复杂度大于O(n),小于O(n^2)，空间复杂度O(n)
     * @param n
     * @return
     */
    public static String countAndSay(int n) {
        if(n<=0) return "";
        String res = "1";
        char say;
        for (int i=1;i<n;i++){
            char[] c = res.toCharArray();
            res = "";
            int j = 1,count=1;
            say = c[0];
            while (j<c.length) {
                if(c[j] != say){
                    res = res + count + say;
                    count = 1;
                    say = c[j];
                }else{
                    count++;
                }
                j++;
            }
            res = res + count + say;
        }
        return res;
    }

    /**
     * 性能上比上面那个好
     * @param n
     * @return
     */
    public static String countAndSay1(int n) {
        StringBuilder curr=new StringBuilder("1");
        StringBuilder prev;
        int count;
        char say;
        for (int i=1;i<n;i++){
            prev=curr;
            curr=new StringBuilder();
            count=1;
            say=prev.charAt(0);

            for (int j=1,len=prev.length();j<len;j++){
                if (prev.charAt(j)!=say){
                    curr.append(count).append(say);
                    count=1;
                    say=prev.charAt(j);
                }
                else count++;
            }
            curr.append(count).append(say);
        }
        return curr.toString();
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("task1");
        System.out.println(countAndSay1(10));//1
        stopWatch.stop();
        stopWatch.start("task2");
        System.out.println(countAndSay(10));
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());

    }

}
