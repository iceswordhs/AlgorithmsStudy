package com.hs.leetcode.array.bineraySearch;

/**
 *
 *
 * @author huangshuai
 * @since 2025/11/29 16:24
 */
public class Question367 {
    /**
     * 和求平方根类似，都是使用二分法去判断其平方根是否是一个整数
     * 由于采用的是左闭右闭的写法，所以left=mid+1 right = mid-1，同时left>right时才退出，因为left=right时是有意义的
     */
    public static boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        int result = -1;
        while(true) {
            int mid = left + (right - left) / 2;
            if((long) mid*mid == num) {
                result = num;
                break;
            }else if((long) mid*mid < num) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
            if(left > right) break;
        }
        if(result == -1) return false;
        else return true;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(15));
    }
}
