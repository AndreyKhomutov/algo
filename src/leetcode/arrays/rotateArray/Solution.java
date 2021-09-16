package leetcode.arrays.rotateArray;

import java.util.Arrays;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
public class Solution {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7};
        int k = 3; // [5,6,7,1,2,3,4]
        rotate(input, k);
        System.out.println();
        Arrays.stream(input).forEach(System.out::print);
    }

    public static void rotate(int[] nums, int k) {

    }
}
