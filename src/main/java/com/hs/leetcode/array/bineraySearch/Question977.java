package com.hs.leetcode.array.bineraySearch;

import java.util.Arrays;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/1 19:03
 */
public class Question977 {

//    public static int[] sortedSquares(int[] nums) {
//        int leftPoint = 0;
//        int rightPoint = 0;
//        int[] result = new int[nums.length];
//        int minIndex=0;
//        int t=Integer.MAX_VALUE;
//        for(int i = 0;i<nums.length; i++){
//            if(nums[i] * nums[i] < t){
//                minIndex = i;
//                t = nums[i] * nums[i];
//            }
//        }
//        leftPoint = minIndex-1;
//        rightPoint = minIndex;
//        for(int i = 0;i<nums.length; i++){
//            if(leftPoint<0 && rightPoint>nums.length) {
//                break;
//            }else if(leftPoint<0){
//                result[i] = nums[rightPoint] * nums[rightPoint];
//                rightPoint++;
//            }else if(rightPoint>=nums.length){
//                result[i] = nums[leftPoint] * nums[leftPoint];
//                leftPoint--;
//            }else if(nums[rightPoint] * nums[rightPoint] <= nums[leftPoint] * nums[leftPoint]){
//                result[i] = nums[rightPoint] * nums[rightPoint];
//                rightPoint++;
//            }else{
//                result[i] = nums[leftPoint] * nums[leftPoint];
//                leftPoint--;
//            }
//        }
//        return result;
//    }

    /**
     * 思路：
     *
     * 使用两个指针，分别从左右开始遍历nums，将较大的选出，放到结果数组的最后
     */
    public static int[] sortedSquares(int[] nums) {
        int leftPoint = 0;
        int rightPoint = nums.length-1;
        int[] result = new int[nums.length];
        int index = nums.length - 1;
        while(leftPoint <= rightPoint){
            int left = nums[leftPoint] * nums[leftPoint];
            int right = nums[rightPoint] * nums[rightPoint];
            if(left <= right){
                result[index] = right;
                rightPoint--;
            }else{
                result[index] = left;
                leftPoint++;
            }
            index--;
        }
        return result;
    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-3, -1, 0, 3, 5})));
    }
}
