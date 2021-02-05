package com.lucas.algorithm;

public class interpret {
    /**
     * 1678. Goal Parser Interpretation
     *
     * You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)"
     * in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al".
     * The interpreted strings are then concatenated in the original order.
     * Given the string command, return the Goal Parser's interpretation of command.
     *
     * Example 1:
     * Input: command = "G()(al)"
     * Output: "Goal"
     * Explanation: The Goal Parser interprets the command as follows:
     * G -> G
     * () -> o
     * (al) -> al
     * The final concatenated result is "Goal".
     *
     * Example 2:
     * Input: command = "G()()()()(al)"
     * Output: "Gooooal"
     *
     * Example 3:
     * Input: command = "(al)G(al)()()G"
     * Output: "alGalooG"
     */

    public String interpret(String command) {
        String res = "";
        char[] c = command.toCharArray();
        int i =0;
        while(i<c.length){
            if (c[i] == '('){
                if (c[i+1] == ')') {
                    res = res + "o";
                    i+=2;
                }else{
                    i++;
                    while(c[i] != ')'){
                        res = res + c[i++];
                    }


                }
            }
        }


        return command;
    }
}
