package yiyue1.Janu_04;

/**
 * @author Hs
 * @Date 2022/1/4 17:09
 */

/**
 * 给定两个字符串a 和 b，寻找重复叠加字符串 a 的最小次数，使得字符串 b 成为叠加后的字符串 a 的子串，如果不存在则返回 -1。
 *
 * 注意：字符串 "abc"重复叠加 0 次是 ""，重复叠加 1 次是"abc"，重复叠加 2 次是"abcabc"
 *
 */
public class LeetCode_686 {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int ans=0;
        while(sb.length()<b.length()&&++ans>0) sb.append(a);
        sb.append(a);
        int idx=strStr(sb.toString(),b);
        if(idx==-1) return -1;
        return idx+b.length()>a.length()*ans?ans+1:ans;
    }
    public int strStr(String haystack, String needle) {
        int n=haystack.length(),m=needle.length();
        if(m==0) return 0;

        char[] hays=haystack.toCharArray();
        char[] need=needle.toCharArray();
        // 构建next数组
        int[] next=new int[m];
        for(int i=1,j=0;i<m;i++){
            while(j>0&&need[i]!=need[j]) j=next[j-1];

            if(need[i]==need[j]) j++;

            next[i]=j;
        }
        // 使用next数组进行比对
        for(int i=0,j=0;i<n;i++){
            // 当对应的字符不相同时，j回退到next[j-1]
            while(j>0&&hays[i]!=need[j]) j=next[j-1];
            // 如果对应的字符相同，即匹配串长度+1,即j++
            if(hays[i]==need[j]) j++;
            // 当匹配到相同的长度为m时，即needle所有的字符都被匹配成功，返回
            if(j==m) return i-m+1;
        }
        // 当haystack遍历完之后也没有返回，说明haystack中没有needle，返回-1
        return -1;
    }
}
