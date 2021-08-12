package leetcode.arrays.waterCounter;

//https://leetcode.com/problems/container-with-most-water/
public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(waterCounter(array));
    }

    //Optimized Time:O(N^2) Space:O(1) with two shifting pointers
    public static int waterCounter(int[] height) {
        int maxValue = 0;
        int i = 0;
        int j = height.length - 1;
        while (i <= j) {
            int iElement = height[i];
            int jElement = height[j];
            int tempResult;
            int distance = j - i;
            if (iElement < jElement) {
                tempResult = iElement * distance;
                i++;
            } else {
                tempResult = jElement * distance;
                j--;
            }
            if (maxValue < tempResult) maxValue = tempResult;
        }
        return maxValue;
    }

    //Time:O(N^2) Space:O(1)
//    public static int waterCounter(int[] array) {
//        int maxValue = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                int result = Math.min(array[i], array[j]) * (j - i);
//                if (maxValue < result) maxValue = result;
//            }
//        }
//        return maxValue;
//    }

}
