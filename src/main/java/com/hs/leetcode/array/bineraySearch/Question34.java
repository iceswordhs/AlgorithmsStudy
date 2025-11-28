package com.hs.leetcode.array.bineraySearch;

/**
 *
 *
 * @author huangshuai
 * @since 2025/11/28 09:31
 */
public class Question34 {
    public static int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[]{-1, -1};
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target > mid) {

            }
        }
    }

    public static void main(String[] args) {
        System.out.println(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }
}
