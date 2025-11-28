package shiyiyue11.Nov_9;

/**
 * @author Hs
 * @Date 2021/11/9 20:24
 */

/**
 * 给定一个由整数数组 A 表示的环形数组 C，求 C 的非空子数组的最大可能和。
 *
 * 在此处，环形数组意味着数组的末端将会与开头相连呈环状。
 * （形式上，当0 <= i < A.length 时 C[i] = A[i]，且当 i >= 0 时 C[i+A.length] = C[i]）
 *
 * 此外，子数组最多只能包含固定缓冲区 A 中的每个元素一次。
 * （形式上，对于子数组 C[i], C[i+1], ..., C[j]，不存在 i <= k1, k2 <= j 其中 k1 % A.length = k2 % A.length）
 *
 *
 * 思路：分为两种情况，最大子数组在中间，和最大子数组在两边
 *      最大子数组在中间就按正常方法，遍历取最大即可
 *      但是当最大子数组在两边时，如[5,-3,5]，需要取数组之和减去 数组中间最小子数组之和
 */
public class leetcode_918 {
    public int maxSubarraySumCircular(int[] nums) {
        int max=nums[0],min=nums[0],t1=0,t2=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            // 如果前面所有元素的和加上nums[i]本身大于nums[i]，说明前面的和是正数，可以抛弃
            t1=(t1+nums[i])>nums[i]?(t1+nums[i]):nums[i];
            // 如果前面所有元素的和加上nums[i]本身小于nums[i]，说明前面的和是负数，可以抛弃
            t2=(t2+nums[i])<nums[i]?(t2+nums[i]):nums[i];
            min=min<t2?min:t2;
            max=max>t1?max:t1;
        }
        if(max<0) return max;// 如果全员都是负数，返回最小的负数
        return max>(sum-min)?max:(sum-min);
    }
}
