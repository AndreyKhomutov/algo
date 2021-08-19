package leetcode.arrays.trappingRainWater;

//https://leetcode.com/problems/trapping-rain-water/
public class Solution {
    public static void main(String[] args) {
        int[] testArray = {0, 1, 0, 2, 1, 0, 3, 1, 0, 1, 2};
//        int[] testArray = {4,2,0,3,2,5}; //9
        System.out.println(getWaterUnitsAmount(testArray));
    }

    //time O(N) space O(1)
    private static int getWaterUnitsAmount(int[] height) {
        int result = 0;
        int leftWall = 0;
        int rightWall = 0;
        for (int lp = 0, rp = height.length - 1; lp != rp; ) {
            if (height[lp] <= height[rp]) {
                if (leftWall >= height[lp]) {
                    int h = leftWall - height[lp];
                    result = result + h;
                } else {
                    leftWall = height[lp];
                }
                lp++;
            } else {
                if (rightWall >= height[rp]) {
                    int h = rightWall - height[rp];
                    result = result + h;
                } else {
                    rightWall = height[rp];
                }
                rp--;
            }
        }
        return result;
    }

    //time O(N^2) space O(1)
//    private static int getWaterUnitsAmount(int[] height) {
//        int total = 0;
//        for (int i = 0; i < height.length; i++) {
//            int maxLeft = getLeft(i, height);
//            int maxRight = getRight(i, height);
//            int currentWater = Math.min(maxLeft, maxRight)-height[i];
//            if (currentWater>0){
//                total+=currentWater;
//            }
//        }
//        return total;
//    }

//    private static int getRight(int i, int[] testArray) {
//        int max = 0;
//        for (int j = i+1; j<testArray.length; j++) {
//            if (testArray[j]>max){
//                max = testArray[j];
//            }
//        }
//        return max;
//    }

//    private static int getLeft(int i, int[] testArray) {
//        int max = 0;
//        for(int j = i-1; j>=0; j--){
//            if (testArray[j]>max){
//                max = testArray[j];
//            }
//        }
//        return max;
//    }
}
