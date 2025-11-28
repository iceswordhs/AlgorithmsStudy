package shiyiyue11.Nov_22;

/**
 * @author Hs
 * @Date 2021/11/22 20:51
 */

/**
 * 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
 *
 * 子序列是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
 *
 * 思路：动态规划 dp[i]表示以第i个节点为结尾的递增序列长度，注意：第i个元素一定要选
 *      如果第i个元素大于前一个元素，dp[i]=dp[i-1]
 *      否则dp[i]=1
 */
public class leetcode_300 {
    public int lengthOfLIS(int[] nums) {
        int len=nums.length;
        if(len==0) return 0;
        int[] dp=new int[len];
        dp[0]=1;
        int max=1;
        for(int i=1;i<len;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}
