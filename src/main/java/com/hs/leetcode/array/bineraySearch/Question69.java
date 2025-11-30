package com.hs.leetcode.array.bineraySearch;

/**
 *
 *
 * @author huangshuai
 * @since 2025/11/28 22:45
 */
public class Question69 {
    public static int mySqrt(int x) {
        int t = 0;
        int r = x;
        int result = -1;
        while(true) {
            int mid = t + (r-t)/2;
            if((long)mid * mid <= x) {
                result = mid;
                t = mid + 1;
            }else {
                r = mid - 1;
            }
            if(r < t) break;
        }
        return result;
    }
    public static void main(String[] args) {
//        System.out.println(mySqrt(4));
        System.out.println(mySqrt(100));
    }
}
