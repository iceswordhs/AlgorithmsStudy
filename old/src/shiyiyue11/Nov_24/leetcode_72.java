package shiyiyue11.Nov_24;

/**
 * @author Hs
 * @Date 2021/11/24 22:24
 */

/**
 * 给你两个单词word1 和word2，请你计算出将word1转换成word2 所使用的最少操作数。
 *
 * 你可以对一个单词进行如下三种操作：
 *
 * 插入一个字符
 * 删除一个字符
 * 替换一个字符
 *
 * 思路：动态规划
 * 看似有6种情况，即word1加一个字符、减一个字符、替换一个字符
 * word2也是如此
 * 但是word1加一个字符，等于word2减一个字符，word1减一个字符等于word2加一个字符，word1替换一个字符等于word2替换一个字符
 * 所以只有3种情况
 * 用dp[i][j]表示word1前i个字符和word2前j个字符变成相同需要的最少步数
 * 转移方程为 dp[i-1][j] 表示word1前i-1个字符和word2前j个字符相同需要多少步，对于word2来说只是加了一个和word1[j]相同的字符
 * 比如horse和ro，如果我们知道他们之间变成相同的字符串需要n步，那么horse和ros之间肯定不会超过n+1步
 * 所以dp[i][j]=dp[i-1][j]+1
 * dp[i][j-1]同理
 * dp[i-1][j-1]来说，假如有x步，如果第i个字符和第j个字符相同，那就不需要变，是x步，如果不相同，那就是x+1步
 * 共有3种情况，找他们的最小值即可
 *
 * 发现每一步只与前一步有关，变为一维数组
 */
public class leetcode_72 {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        // 有一个字符串为空串
            if (n * m == 0) {
            return n + m;
        }

        // DP 数组
        int[][] D = new int[n + 1][m + 1];

        // 边界状态初始化
            for (int i = 0; i < n + 1; i++) {
            D[i][0] = i;
        }
            for (int j = 0; j < m + 1; j++) {
            D[0][j] = j;
        }

        // 计算所有 DP 值
            for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                int case1 = D[i - 1][j] + 1;
                int case2 = D[i][j - 1] + 1;
                int case3 = D[i - 1][j - 1];
                if (word1.charAt(i - 1) != word2.charAt(j - 1)) {
                    case3 += 1;
                }
                D[i][j] = Math.min(case1, Math.min(case2, case3));
            }
        }
            return D[n][m];
    }
}
