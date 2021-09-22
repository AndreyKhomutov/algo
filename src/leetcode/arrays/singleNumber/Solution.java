package leetcode.arrays.singleNumber;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
public class Solution {
    public static void main(String[] args) {
//        int[] nums = {2,2,1};//1
        int[] nums = {4,1,2,1,2};//4
//        int[] nums = {1};//1
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hash_table = new HashMap<>();

        for (int i : nums) {
            System.out.println("aaa i = " + i);
            hash_table.put(i, hash_table.getOrDefault(i, 0) + 1);
        }
        System.out.println("hash_table.size() " + hash_table.size());
        System.out.println(hash_table.toString());
        for (int i : nums) {
            System.out.println("zzz i = " + i);
            if (hash_table.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }

    //    public static int singleNumber(int[] nums) {
    //        Set<Integer> temp = new HashSet<>();
    //        for (int num : nums) {
    //            if (temp.contains(num)) {
    //                temp.remove(num);
    //            } else {
    //                temp.add(num);
    //            }
    //        }
    //        return (int) temp.toArray()[0];
    //    }
}
