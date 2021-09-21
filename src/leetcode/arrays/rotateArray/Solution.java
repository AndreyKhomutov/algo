package leetcode.arrays.rotateArray;

import java.util.Arrays;
import java.util.stream.Collector;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
public class Solution {
    public static void main(String[] args) {
//        int[] input = {1, 2, 3, 4, 5, 6, 7};
//        int k = 3; // [5,6,7,1,2,3,4]
        int[] input = {1,2};
        int k = 5; // [5,6,7,1,2,3,4]
        rotate(input, k);
        System.out.println();
        Arrays.stream(input).forEach(System.out::print);
    }

    public static void rotate(int[] nums, int k) {
        if (k==nums.length){
            return;
        }
        while (k>nums.length){
            k=k-nums.length;
        }
        int[] temp = new int[k];
        for (int i = nums.length - k, j = 0; i < nums.length && i>0; i++, j++) {
            temp[j] = nums[i];
        }
        for (int i = nums.length-1; (i - k) >=0; i--) {
            nums[i]=nums[i-k];
        }
        for (int i = 0; i<k && i<nums.length-1; i++){
            nums[i]=temp[i];
        }
    }
}
