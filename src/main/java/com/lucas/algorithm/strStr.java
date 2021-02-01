package com.lucas.algorithm;

public class strStr {

    /**
     * 28. Implement strStr()
     *
     * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     * Clarification:
     * What should we return when needle is an empty string? This is a great question to ask during an interview.
     * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
     *
     * Example 1:
     * Input: haystack = "hello", needle = "ll"
     * Output: 2
     *
     * Example 2:
     * Input: haystack = "aaaaa", needle = "bba"
     * Output: -1
     *
     * Example 3:
     * Input: haystack = "", needle = ""
     * Output: 0
     */

    public static int strStr(String haystack, String needle) {
//        if(haystack == "" || needle == "") return 0;
//        int i=0,j=0;
//        int next[] = new int[100];
//        next(next,needle);
//        while(i<haystack.length()&&j<needle.length())
//        {
//            if(j==-1 || haystack.charAt(i)==needle.charAt(j))
//            {
//                i++;
//                j++;
//            }
//            else j=next[j];               //j回退。。。
//        }
//        if(j>=needle.length())
//            return (i-needle.length());         //匹配成功，返回子串的位置
//        else
//            return (-1);                  //没找到


        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
        }
    }

    public static void next(int next[],String str){
        char t[] = str.toCharArray();
        int j=0,k=-1;
        next[0]=-1;
        while(j<t.length-1)
        {
            if(k == -1 || t[j] == t[k])
            {
                j++;k++;
                next[j] = k;
            }
            else k = next[k];
        }
    }

    public static void main(String[] args) {
        String haystack = "hellodsafdagadaddfgas";
        String needle = "gadad";
        int res = strStr(haystack,needle);
        System.out.println(res);
    }
}
