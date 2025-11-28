package swordoffer1;

/**
 * @author Hs
 * @Date 2021/10/27 19:02
 */

/**
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 *
 * 要求时间复杂度为O(n)。
 *
 * 思路：前缀和
 *      max存储子数组的最大值
 *      遍历数组，用sum存储子数组的和，
 *      如果sum>max,max=sum,
 *      当sum<0时，让sum=0
 */
public class solution42 {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int num:nums){
            sum+=num;
            if(sum>max) max=sum;
            if(sum<0) sum=0;
        }
        return max;
    }
}
