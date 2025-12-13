package com.hs.leetcode.array.bineraySearch;

import java.util.HashMap;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/14 00:34
 */
public class Question454 {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        /**
         * 思路：
         *
         * 本来是使用4层循环，但是这样，对于每一对i，j都要把所有的k+l计算一遍
         *
         * 使用hashmap存储i+j，k+l这样就相当于把On的4次方变成了On的2次方
         *
         * 至于为什么不存储3层的结果，是因为4是偶数，对于偶数层循环，缓存n/2层计算结果是最优的
         */
        HashMap<Integer,Integer> map = new HashMap<>();
        int res=0;
        for(int i:nums1){
            for(int j:nums2){
                int t = i+j;
                map.put(t, map.getOrDefault(t,0)+1);
            }
        }
        for(int i:nums3){
            for(int j:nums4){
                int t = i+j;
                if(map.containsKey(-t)){
                    res+=map.get(-t);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(fourSumCount(new int[]{}, new int[]{}, new int[]{}, new int[]{}));
    }
}
