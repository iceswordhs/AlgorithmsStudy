package com.hs.leetcode.array.bineraySearch;

/**
 *
 *
 * @author huangshuai
 * @since 2025/11/27 08:36
 */
public class Question704 {
    /**
     * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
     * 写一个函数搜索 nums 中的 target，如果 target 存在返回下标，否则返回 -1。
     */
    /**
     * 思路：使用左闭右闭写法  用mid记录中间值 当array[mid]小于`target`时，让right=mid-1。当array[mid]大于`target`时，让left=mid+1
     */
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            // int mid = (left + right) / 2;
            // 优化写法
            int mid = left + (right - left) / 2; // 防止溢出
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 12));
    }
}
