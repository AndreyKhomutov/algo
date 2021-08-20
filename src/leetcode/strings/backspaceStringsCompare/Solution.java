package leetcode.strings.backspaceStringsCompare;

//https://leetcode.com/problems/backspace-string-compare/
public class Solution {
    public static void main(String[] args) {
//        String s = "ab#c", t = "ad#c";
        String s = "ab##", t = "c#d#"; //true
//        String s = "xywrrmp", t = "xywrrmu#p"; //true
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        return clean(s).equals(clean(t));
    }

    private static String clean(String s) {
        char[] chars = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = chars.length - 1; i >=0;) {
            if (chars[i]!='#'){
                result.append(chars[i]);
                i--;
            } else {
                int counter = 0;
                while (i>0 && chars[i]=='#') {
                    i--;
                    counter++;
                }
                i=i-counter;
            }
        }
        return result.reverse().toString();
    }
}
