package leetcode.arrays.removeDublicates;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
class Solution {

    public static void main(String args[]) {
        int[] test = new int[]{1,1,2};
        int result = removeDuplicates(test);
        for (int ele : test){
            System.out.print(" " + ele);
        }
        System.out.println();
        System.out.println("result " + result);
    }


    public static int removeDuplicates(int[] nums) {
        int k = 1;
        int p = 1;
        for (int i = 1; i < nums.length; i++ ) {
            if (nums[i] != nums [i-1]) {
                k++;
                nums[p]=nums[i];
                p++;
            } else {

            }
        }
        return k;
    }
}