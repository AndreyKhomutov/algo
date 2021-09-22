package leetcode.arrays.dublicate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
public class Solution {
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 7};
        System.out.println(containsDuplicate(test));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> test = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            test.add(nums[i]);
        }
        return test.size()!=nums.length;
    }
}
