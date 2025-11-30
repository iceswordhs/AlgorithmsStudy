package com.hs.leetcode.array.bineraySearch;

import java.util.Arrays;

/**
 *
 *
 * @author huangshuai
 * @since 2025/11/29 16:36
 */
public class Question27 {
    /**
     * 思路：
     *
     * 其实很简单，复杂度至少是O(n)，也就是至少要把数组遍历一遍
     *
     * 同时又要求原地移除所有数值等于`val`的元素，很容易想到把不等于val的元素复制到等于val的下标处即可
     *
     * 使用inequateIndex来记录不等于val的元素的下标+1，也就是下一个不等于val的元素该放的位置
     */
    public static int removeElement(int[] nums, int val) {
        // 至少O(n)的复杂度
        int result = 0;
        int inequateIndex=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val){
                nums[inequateIndex] = nums[i];
                inequateIndex++;
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] rawArrary = {3, 2, 2, 3};
        System.out.println(removeElement(rawArrary, 2));
        System.out.printf(Arrays.toString(rawArrary));
    }
}
