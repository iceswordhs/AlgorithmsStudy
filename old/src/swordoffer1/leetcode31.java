package swordoffer1;

/**
 * @author Hs
 * @Date 2021/10/26 20:30
 */

/**
 * 实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列（即，组合出下一个更大的整数）。
 *
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 *
 * 必须 原地 修改，只允许使用额外常数空间。
 *
 * 思路：两遍扫描
 *      注意到下一个排列总是比当前排列要大，除非该排列已经是最大的排列
 *      我们希望找到一种方法：能够找到一个大于当前序列的序列，且变大幅度尽可能小
 *      为了实现这个方法，需要：
 *
 *      1.将左边的一个较小数(下标为i)与右边的一个较大数(下标为j)进行交换
 *      2.同时希望较小数尽量靠右，并且对交换完成后，较大数(下标为i)右边的排列(i+1,end)需要按照升序重新排列
 *      这样就能保证排列变大的同时，变大的幅度尽可能小
 *
 *      算法具体实现：
 *      对排列a，从后往前，寻找第一个升序对(i,i+1)，即a[i]<a[i+1]
 *      因为是第一个升序对，[i+1,n)一定是降序队列
 *      从[i+1,n)中找到第一个大于a[i]的元素j，交换a[i]和a[j]，
 *      此时可以证明[i+1,n)必为降序，将他们直接反转即可
 */
public class leetcode31 {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        if (i>=0){
            int t= nums.length-1;
            while(t>=i+1){
                if (nums[t]>nums[i]){
                    break;
                }
                t--;
            }
            swap(nums,i,t);
        }
        reverse(nums,i+1);// 如果nums原本就为最大排列，即降序排列，那么i=0，即翻转了整个排列
    }
    void swap(int[] nums,int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    void reverse(int[] nums,int start){
        int end=nums.length-1;
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}
