package com.lucas.algorithm.easyOne;

public class defangIPaddr {
    /**
     *
     * 1108. Defanging an IP Address
     *
     * Given a valid (IPv4) IP address, return a defanged version of that IP address.
     * A defanged IP address replaces every period "." with "[.]".
     *
     * Example 1:
     * Input: address = "1.1.1.1"
     * Output: "1[.]1[.]1[.]1"
     *
     * Example 2:
     * Input: address = "255.100.50.0"
     * Output: "255[.]100[.]50[.]0"
     */

    /**
     * Defanging an IP Address,时间复杂度O(n),空间复杂度O(n)
     * @param address
     * @return
     */
    public static String defangIPaddr(String address) {
        address = address.replace(".","[.]");
        return address;
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
        System.out.println(defangIPaddr("255.100.50.0"));
    }
}