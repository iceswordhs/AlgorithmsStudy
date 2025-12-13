package com.hs.leetcode.array.bineraySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/14 00:35
 */
public class Question15 {
    public List<List<Integer>> threeSum(int[] nums) {
        /**
         * 思路：
         *
         * 将数组排序
         *
         * 依然还是在数组中找到 abc 使得a + b +c =0，我们这里相当于 a = nums[i]，b = nums[left]，c = nums[right]。
         *
         * 接下来如何移动left 和right呢， 如果nums[i] + nums[left] + nums[right] > 0 就说明 此时三数之和大了，因为数组是排序后了，所以right下标就应该向左移动，这样才能让三数之和小一些。
         */
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i=0; i<nums.length; i++){
            if (i>0&&nums[i]==nums[i-1]){ // 跳过重复元素
                continue;
            }
            int target = -nums[i];
            int l = i+1;
            int r = nums.length-1;
            while (l<r){
                int sum = nums[l] + nums[r];
                if (sum == target){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    r--;
                    l++;
                    while (l<r && nums[l] == nums[l-1]) l++;
                    while (l<r && nums[r] == nums[r+1]) r--;
                }else if (sum>target){
                    r--;
                } else {
                    l++;
                }
            }
        }
        return res;
    }
}
