package leetcode.strings.backspaceStringsCompare;

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
        return clean(s).equals(clean(t));
    }

    //time O(N) space O(N)
    private static String clean(String s) {
        char[] chars = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= chars.length - 1; ) {
            if (chars[i]!='#') {
                result.append(chars[i]);
                i++;
            } else {
                if (result.length()!=0){
                    result.delete(result.length()-1, result.length());
                }
                i++;
            }
        }
        return result.toString();
    }
}
