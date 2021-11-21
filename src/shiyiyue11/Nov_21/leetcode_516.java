package shiyiyue11.Nov_21;

/**
 * @author Hs
 * @Date 2021/11/21 18:17
 */

/**
 *给你一个字符串 s ，找出其中最长的回文子序列，并返回该序列的长度。
 *
 * 子序列定义为：不改变剩余字符顺序的情况下，删除某些字符或者不删除任何字符形成的一个序列。
 *
 * 思路：动态规划 dp[i][j]表示i-j区间中最大的回文子序列
 *      注意顺序
 */
public class leetcode_516 {
    public int longestPalindromeSubseq(String s) {
        if (s == null) return 0;
        char[] arr = s.toCharArray();
        int len = arr.length;
        int[][] dp = new int[len][len];
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else {
                    if (arr[i] == arr[j]) {
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    } else {
                        dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                    }

                }
            }
        }

        return dp[0][len - 1];
    }
}
