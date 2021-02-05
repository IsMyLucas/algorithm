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

    public static String interpret(String command) {
        String res = "";
        int i = 0;
        while(i<command.length()){
            if (command.charAt(i) == 'G'){
                res = res + "G";
            }else if(command.charAt(i) == '('){
                i++;
                if (command.charAt(i) == ')') {
                    res = res + "o";
                }else{
                    res = res + "al";
                }
            }
            i++;
        }
        return res;
    }
    public static String interpret1(String command) {
        StringBuilder S = new StringBuilder(command.length());
        for(int i = 0 ; i < command.length() ; i++){
            if(command.charAt(i)=='G') S.append('G');
            if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')') {S.append('o'); i++;}
                else{S.append("al"); i = i + 3;}
            }
        }
        return S.toString();
    }


    public static void main(String[] args) {

        System.out.println(interpret("G()(al)"));
        System.out.println(interpret("G()()()()(al)"));
        System.out.println(interpret("(al)G(al)()()G"));
    }
}
