package leetcode.arrays.buyAndSell;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
public class Solution {
    public static void main(String[] args) {
//        int[] input = {7,1,5,3,6,4};//7
        int[] input = {1,2,3,4,5};//4
        System.out.println(maxProfit(input));
    }

    public static int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]>prices[i-1]){
                result+=prices[i]-prices[i-1];
            }
        }
        return result;
    }
}
