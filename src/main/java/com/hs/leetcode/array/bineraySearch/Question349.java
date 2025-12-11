package com.hs.leetcode.array.bineraySearch;

import java.util.HashSet;
import java.util.Set;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/11 23:38
 */
public class Question349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        /**
         * 思路：
         *
         * 用hashset或者使用哈希数组，因为num1，num2里面的值都小于1000，可以使用int[1020]来当作哈希数组
         */
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }
        int[] result = new int[set2.size()];
        int index = 0;
        for(Integer i:set2){
            result[index++] = i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(intersection(new int[]{2, 2, 3, 5}, new int[]{2, 3}));
    }
}
