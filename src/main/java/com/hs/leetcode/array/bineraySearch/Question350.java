package com.hs.leetcode.array.bineraySearch;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/11 23:53
 */
public class Question350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        /**
         * 用hashset或者使用哈希数组，因为num1，num2里面的值都小于1000，可以使用int[1020]来当作哈希数组
         *
         * 当两个数组出现次数都不为0时，想结果数组添加Math.min(numCount1,numCount2)个对应数字
         */
        int[] count1 = new int[1020];
        int[] count2 = new int[1020];
        for(int i=0;i<nums1.length;i++){
            count1[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++){
            count2[nums2[i]]++;
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<1020;i++){
            int countNum1 = count1[i];
            int countNum2 = count2[i];
            int min = Math.min(countNum1,countNum2);
            for(int j=0;j<min;j++){
                res.add(i);
            }
        }
        int[] result = new int[res.size()];
        int index = 0;
        for(Integer i:res){
            result[index++]=i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(intersect(new int[]{2, 2, 3, 5}, new int[]{2, 3}));
    }
}
