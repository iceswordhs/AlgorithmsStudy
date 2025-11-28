package shiyiyue11.Nov_23;

/**
 * @author Hs
 * @Date 2021/11/23 18:08
 */

/**
 * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 *
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。
 * （例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 *
 * 思路1：双指针 同时遍历两个字符串，如果相等就后移，否则后移字符串t的位置
 *
 * 思路2：动态规划 dp[i][j]表示从第i个字符开始，最近的j字符，包括i
 */
public class leetcode_392 {
    // 双指针
    //public boolean isSubsequence(String s, String t) {
    //    int i=0,j=0;
    //    for(;i<s.length()&&j<t.length();i++,j++){
    //        while(s.charAt(i)!=t.charAt(j)){
    //            j++;
    //            if(j>=t.length()){
    //                return false;
    //            }
    //        }
    //    }
    //    if(i!=s.length()) return false;
    //    return true;
    //}
    // 动态规划
    public boolean isSubsequence(String s, String t) {
        int m=t.length();
        // dp[i][j]代表从第i个字符起，最近的j字符的位置 包括第i个字符
        int[][] dp=new int[m+1][26];
        for(int i=0;i<26;i++){
            dp[m][i]=m;
        }
        for(int i=m-1;i>=0;i--){
            for(int j=0;j<26;j++){
                if((t.charAt(i)-'a')==j)
                    dp[i][j]=i;
                else
                    dp[i][j]=dp[i+1][j];
            }
        }
        int current=0;
        for(int i=0;i<s.length();i++){
            // 从当前位置开始，最近的字符位置
            if(dp[current][s.charAt(i)-'a']==m)
                return false;
            current=dp[current][s.charAt(i)-'a']+1;
        }
        return true;
    }
}
