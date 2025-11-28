package shiyiyue11.Nov_13;

/**
 * @author Hs
 * @Date 2021/11/13 17:05
 */

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 给你一个字符串 s 和一个字符串列表 wordDict 作为字典，判定s 是否可以由空格拆分为一个或多个在字典中出现的单词。
 *
 * 说明：拆分时可以重复使用字典中的单词。
 *
 * 思路1：动态规划  dp[i]表示s.substring(0,i-1)和s.substring(i)是否在字典中存在，
 *               即在第i个字符前切断一次是否满足要求
 *               遍历字符串，如果遇到可以切割的点，dp[i]=true
 * 思路2：DFS 对于字符串s，遍历他，
 *       如果前i个字符在字典中存在，就递归剩下的字符，否则回溯
 */
public class leetcode_139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        // 动态规划 记录第i个字符之前是否满足由字典组成，注意dp[0]=true
        //HashSet<String> strings=new HashSet<>(wordDict);
        //boolean[] dp=new boolean[s.length()+1];
        //dp[0]=true;
        //for(int i=1;i<=s.length();i++){
        //    for(int j=0;j<i;j++){
        //        if(dp[j]&&strings.contains(s.substring(j,i))){// 如果在i处可以切割
        //            dp[i]=true;
        //            break;
        //        }
        //    }
        //}
        //return dp[s.length()];

        // DFS+记忆化
        boolean[] visited=new boolean[s.length()+1];
        return dfs(s,0,wordDict,visited);
    }
    boolean dfs(String s,int start,List<String> wordDict,boolean[] visited){
        for (String string : wordDict) {
            int nextstart=start+string.length();
            if (nextstart>s.length()||visited[nextstart]){
                continue;
            }
            if (s.indexOf(string,start)==start){
                if (nextstart==s.length()||dfs(s,nextstart,wordDict,visited)){
                    return true;
                }
                visited[nextstart]=true;
            }
        }
        return false;
    }
}
