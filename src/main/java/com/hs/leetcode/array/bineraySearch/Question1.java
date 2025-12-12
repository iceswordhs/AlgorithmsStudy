package com.hs.leetcode.array.bineraySearch;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/12 23:53
 */
public class Question1 {
    public static int[] twoSum(int[] nums, int target) {
        /**
         * 思路：
         *
         * 要找和为目标值target的两个整数，可以遍历数组，并找是否有target-num[i]的值
         */
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{1, 34, 55}, 23));
    }
}
