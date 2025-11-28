package yiyue1.Janu_04;

/**
 * @author Hs
 * @Date 2022/1/4 8:47
 */

/**
 * 实现strStr()函数。
 *
 * 给你两个字符串haystack 和 needle ，
 * 请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）
 * 如果不存在，则返回 -1 。
 *
 * 思路：使用KMP算法。
 * KMP算法：对于字符串比对，我们可以维护 对比串的 真前后缀
 * 比如对于aaabbab,它对应的数组是 0,1,2,0,0,1,0
 * 当i=0时，a没有真前缀和真后缀 所以是0
 * 当i=1时，aa的最长的一对真前缀和真后缀是a，所以是1
 * 当i=2时，aaa的最长的一对真前缀和真后缀是aa，所以是2
 * 当i=3时，aaab没有真前缀和真后缀，所以是0
 * 当i=4时，aaabb没有真前缀和真后缀，所以是0
 * 当i=5时，aaabba的最长真前缀和真后缀是a，所以是1，
 * 当i=6时，aaabbab没有最长真前缀和真后缀 所以是0
 *
 * 有了这个数组，当进行比对时，如果到了i=2发现不相同，直接让比对串needle跳转到 next[i]，即跳转到2，即跳转到第3个a处，
 * 但是被比对串haystack位置不变
 *
 * 时间复杂度：构建next数组的复杂度为m，进行比对的复杂度为n，时间复杂度为m+n，而原来为m*n
 *
 * 计算next数组：
 * 对于aaabbab来说，创建数组next[7]
 * 初始化i=1,j=0  遍历i < m  next[i]=j 这样就得到了next数组
 * next[0]必定为0，所以直接从1开始
 * i=1,j=0时，needle[i]=needle[j],j++,所以next[1]=1
 * i=2,j=1,needle[i]=needle[j],j++,所以next[2]=2
 * i=3,j=2,needle[i]!=needle[j],j=next[j-1]=1,但是needle[i]!=needle[j],所以j=next[j-1]=0,所以next[3]=0
 * i=4,j=0,needle[i]!=needle[j],next[4]=0
 * i=5,j=0,needle[i]=needle[j],j++,next[5]=1
 * i=6,j=1,needle[i]!=needle[j],j=next[j-1]=0,next[6]=0
 *
 * 所以得到了next 0,1,2,0,0,1,0
 *
 * 遍历haystack,每次匹配到相同的j++，不然就让j回退到next[j-1]的位置，直到j==m，或者遍历结束
 */
public class Leetcode_28 {
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
