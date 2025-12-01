package com.hs.leetcode.array.bineraySearch;

/**
 *
 *
 * @author huangshuai
 * @since 2025/11/30 20:50
 */
public class Question283 {
    public static void moveZeroes(int[] nums) {
        int slowPoint = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0){
                nums[slowPoint] = nums[i];
                slowPoint++;
            }
        }
        for(int i=slowPoint; i<nums.length; i++){
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,1,0,2,4,0,5});
    }
}
