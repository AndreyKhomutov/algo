package leetcode.arrays.twoSum;

import java.util.HashMap;

//https://leetcode.com/problems/two-sum/

public class Solution {

    public static void main(String args[]) {
        int[] array = {1, 3, 7, 9, 2};
        int target = 11;
        int[] result = twoSum(array, target);
        for (int element : result) {
            System.out.println(element);
        }
    }
//optimized //T:O(N) S:O(N)
    private static int[] twoSum(int[] array, int target) {
        HashMap<Integer, Integer> results = new HashMap<>();
        for (int p1 = 0; p1 < array.length; p1++) {
            int numberToFind = target - array[p1];
            if (results.containsKey(array[p1])) {
                return new int[]{results.get(array[p1]), p1};
            } else {
                results.put(numberToFind, p1);
            }
        }
        return null;
    }
//Time:O(N^2) Space:O(1)
//    private static int[] twoSum(int[] array, int target) {
//        for (int p1 = 0; p1 < array.length; p1++) {
//            int numberToFind = target - array[p1];
//            for (int p2 = p1+1; p2 < array.length; p2++){
//                if (array[p2] == numberToFind){
//                    return  new int[]{p1, p2};
//                }
//            }
//        }
//        return null;
//    }

}
