package shiyiyue11.Nov_25;

import java.util.Arrays;

/**
 * @author Hs
 * @Date 2021/11/25 20:40
 */
public class leetcode_377 {
    public int combinationSum4(int[] nums, int target) {
        int length=nums.length;
        // dp[i][j]表示target为i的时候，前j个数共有多少种情况组成它
        int[][] dp=new int[target+1][length];
        for(int i=0;i<length;i++){
            dp[0][i]=1;
        }//只有没有任何数才能是0，所以只有一种情况

            for(int i=1;i<=target;i++){
                for(int j=0;j<length;j++){
                if(i==nums[j]) dp[i][j]++;
                if(j>=1)dp[i][j]+=dp[i][j-1];
                if(i>nums[j]) dp[i][j]+=dp[i-nums[j]][j];
            }
        }
        for (int[] ints: dp){
            System.out.println(Arrays.toString(ints));
        }

        return dp[target][length-1];
    }
}
