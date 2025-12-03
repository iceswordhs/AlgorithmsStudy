package com.hs.leetcode.array.bineraySearch;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/2 17:01
 */
public class Question209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        for(int j=0;j<nums.length;j++) {
            sum += nums[j];
            while(sum >= target){
                if(j-i+1 < minLength){
                    minLength = j-i+1;
                }
                sum = sum - nums[i];
                i++;
            }
        }
        if(minLength == Integer.MAX_VALUE) return 0;
        return minLength;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(8, new int[]{1, 23, 4, 5, 6}));
    }
}
