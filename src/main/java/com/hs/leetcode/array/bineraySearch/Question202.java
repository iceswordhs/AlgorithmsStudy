package com.hs.leetcode.array.bineraySearch;

import java.util.HashSet;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/12 23:51
 */
public class Question202 {
    public static boolean isHappy(int n) {
        /**
         * 思路：
         *
         * 注意过程可能无限循环，也就是可能出现已经出现的结果
         *
         * 使用hashset记录所有已经出现的结果，如果结果已经出现过就是进入了循环，如果已出现的结果不是1，说明不是快乐数
         */
        HashSet<Integer> set = new HashSet<>();
        int i = n;
        while(true){
            i=getSum(i);
            if(set.contains(i)){
                if(i==1) return true;
                else return false;
            }else set.add(i);
        }
    }
    public static int getSum(int n){
        int res = 0;
        int t = n;
        while(t>0){
            int i = t%10;
            res+=i*i;
            t=t/10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(1324));
    }
}
