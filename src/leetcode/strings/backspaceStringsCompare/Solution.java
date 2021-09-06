package leetcode.strings.backspaceStringsCompare;

import java.util.Stack;

//https://leetcode.com/problems/backspace-string-compare/
public class Solution {
    public static void main(String[] args) {
//        String s = "ab#c", t = "ad#c";
//        String s = "ab##", t = "c#d#"; //true
//        String s = "xywrrmp", t = "xywrrmu#p"; //true
        String s = "a##c", t = "#a#c"; //true
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        return clean(s).equals(clean(t));
    }

    //time O(M+N) space O(M+N)
    private static String clean(String s) {
        Stack<Character> result = new Stack<>();
        for (char c : s.toCharArray()){
            if (c!='#') {
                result.push(c);
            } else {
                if (!result.empty())
                result.pop();
            }
        }
        return String.valueOf(result);
    }
}
