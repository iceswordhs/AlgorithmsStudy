package shiyiyue11.Nov_9;

/**
 * @author Hs
 * @Date 2021/11/9 19:45
 */

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 思路：用t记录数组元素的和，当和为负值时t，用max记录t的最大值
 */
public class leetcode_53 {
    public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        int max=Integer.MIN_VALUE,t=0;
        for(int i=0;i<nums.length;i++){
            t+=nums[i];
            if(t>max) max=t;
            if(t<0) t=0;
        }
        return max;
    }
}
