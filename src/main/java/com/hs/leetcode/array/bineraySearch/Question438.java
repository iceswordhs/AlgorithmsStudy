package com.hs.leetcode.array.bineraySearch;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/10 14:43
 */
public class Question438 {
    public static List<Integer> findAnagrams(String s, String p) {
        /**
         * 使用滑动窗口，维持一个长度与p相等的窗口，然后使用HashMap记录这个窗口内的各字符个数，
         * 同时当窗口移动时，添加窗口左端新加入的字符，移除窗口右端的字符
         */
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for(char c:p.toCharArray()){
            pCount[c - 'a']++;
        }
        List<Integer> res = new ArrayList<Integer>();
        int pLen = p.length();
        for(int i=0;i<s.length();i++){
            sCount[s.charAt(i) - 'a']++;
            if(i+1<pLen) continue;
            for(int j=0;j<26;j++){
                if(pCount[j] != sCount[j]) break;
                if(j==25) res.add(i+1 - pLen);
            }
            if(i+1>=pLen) sCount[s.charAt(i+1 -pLen) - 'a']--;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findAnagrams("fadsfasagergrhre", "dfa"));
    }
}
