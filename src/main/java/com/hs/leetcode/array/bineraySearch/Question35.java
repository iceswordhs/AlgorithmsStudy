package com.hs.leetcode.array.bineraySearch;

/**
 *
 *
 * @author huangshuai
 * @since 2025/11/27 09:10
 */
public class Question35 {
    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
     * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * 请必须使用时间复杂度为 O(log n) 的算法。
     */
    /**
     * 思路：
     *
     * 一共有4种情况，目标值要放在数组第一个，目标值等于数组值，目标值处于两个数组值之间，目标值要放在数组最后一个
     *
     * 这四种情况，
     *
     * 目标值要放在数组第一个时，循环结束前，窗口只包含一个元素，left=right，然后right会等于mid-1，则right会变为-1，而目标值要放在第0个位置，所以应返回right+1
     *
     * 目标值等于数组值，直接返回当前的mid坐标即可
     *
     * 目标值处于两个数组值之间，循环结束前，窗口包含两个元素，left和right，此时mid=right，然后left=mid+1=right，然后mid=right，然后right=mid-1，此时应放在right+1位置，返回right+1
     *
     * 目标值要放在数组最后一个，循环结束前，right=left=array.length-1，目标值要放在array.length位置，所以返回right+1
     */
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            }else if (nums[mid] > target) {
                right = mid - 1;
            }else return mid;
        }
        return right + 1;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{-1, 0, 3, 5, 9, 12}, 13));
//        System.out.println(searchInsert(new int[]{1}, 2));
    }
}
