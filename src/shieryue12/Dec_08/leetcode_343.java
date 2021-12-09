package shieryue12.Dec_08;

/**
 * @author Hs
 * @Date 2021/12/8 21:09
 */

/**
 * 给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
 *
 * 思路1：动态规划
 *
 * 思路2：数学 尽可能的多拆分出来几个3
 */
public class leetcode_343 {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            int curMax = 0;
            for (int j = 1; j < i; j++) {
                curMax = Math.max(curMax, Math.max(j * (i - j), j * dp[i - j]));
            }
            dp[i] = curMax;
        }
        return dp[n];
    }
}
