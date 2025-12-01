package com.hs.leetcode.array.bineraySearch;

/**
 *
 *
 * @author huangshuai
 * @since 2025/11/30 20:40
 */
public class Question26 {
    public static int removeDuplicates(int[] nums) {
        int slowPoint = 0;
        int length = 0;
        int t;
        for(int i = 0; i<nums.length; i++) {
            t = nums[slowPoint];
            if(nums[i] == t) {
                while(i < nums.length && nums[i] == t) {
                    i++;
                }
                nums[length] = nums[slowPoint];
                length++;
                slowPoint=i;
                i--;
            }else {
                length++;
                slowPoint++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1}));
    }
}
