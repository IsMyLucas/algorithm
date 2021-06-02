package com.lucas.algorithm;

import java.util.Arrays;
import java.util.List;

public class countMatches {

    /**
     * 1773. Count Items Matching a Rule
     * You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item.
     * You are also given a rule represented by two strings, ruleKey and ruleValue.
     *
     * The ith item is said to match the rule if one of the following is true:
     *
     * ruleKey == "type" and ruleValue == typei.
     * ruleKey == "color" and ruleValue == colori.
     * ruleKey == "name" and ruleValue == namei.
     * Return the number of items that match the given rule.
     *
     *
     * Example 1:
     * Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
     * Output: 1
     * Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
     *
     * Example 2:
     * Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
     * Output: 2
     * Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"].
     * Note that the item ["computer","silver","phone"] does not match.
     */
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int result = 0;
        int i = ruleKey.equals("type") ? 0 :ruleKey.equals("color") ? 1 : 2;

        for (List<String> list:items) {
            if (ruleValue.equals(list.get(i))){
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("phone","blue","pixel");
        List<String> list2 = Arrays.asList("computer","silver","phone");
        List<String> list3 = Arrays.asList("phone","gold","iphone");
        List<List<String>> items = Arrays.asList(list1,list2,list3);
        int res = countMatches(items,"type","phone");
        System.out.println(res);
    }
}
