package com.hs.leetcode.array.bineraySearch;

import java.util.Arrays;
import java.util.List;

/**
 *
 *
 * @author huangshuai
 * @since 2025/11/28 09:31
 */
public class Question34 {
    public static int[] searchRange(int[] nums, int target) {
        int leftBorder = searchLeftBorder(nums, target);
        int rightBorder = searchRightBorder(nums, target);
        if (leftBorder == -2 || rightBorder == -2) return new int[]{-1, -1};
        else if (rightBorder - leftBorder >= 2) return new int[]{leftBorder+1, rightBorder-1};
        else return new int[]{-1, -1};
    }

    public static int searchLeftBorder(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int leftBorder = -2;
        // 寻找左边界，就要在target == nums[mid]时移动right，令right=mid-1，然后让leftBorder=right，这样
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target <= nums[mid]) { //target位于左区间
                right = mid - 1;
                leftBorder = right;
            }else {
                left = mid + 1;// [2,2,2,3,3] 2
            }
        }
        return leftBorder;
    }

    public static int searchRightBorder(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int rightBorder = -2;
        // 寻找右边界，就要在target == nums[mid]时移动left，令left=mid+1，然后让leftBorder=left，这样
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target < nums[mid]) { //target位于左区间
                right = mid - 1;
            }else {
                left = mid + 1;// [2,2] 3
                rightBorder = left;
            }
        }
        return rightBorder;
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
        System.out.println(Arrays.toString(searchRange(new int[]{2, 2}, 3)));
//        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 1)));
//        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 1)));
    }
}
