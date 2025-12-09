package com.hs.leetcode.array.bineraySearch;

import java.util.HashMap;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/10 00:08
 */
public class Question242 {
    public static boolean isAnagram(String s, String t) {
        /**
         * 思路：
         * 使用哈希表统计两个字符串各字符个数是否相等即可
         */
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            int n = smap.getOrDefault(s.charAt(i),0);
            smap.put(s.charAt(i),n+1);
            n = tmap.getOrDefault(t.charAt(i),0);
            tmap.put(t.charAt(i),n+1);
        }
        for(Character c:smap.keySet()){
            if(smap.get(c) != (int)tmap.getOrDefault(c,0)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("afasdfasf", "fasfaga"));
    }
}
