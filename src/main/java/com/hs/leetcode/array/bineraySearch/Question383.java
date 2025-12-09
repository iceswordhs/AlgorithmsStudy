package com.hs.leetcode.array.bineraySearch;

import java.util.HashMap;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/10 00:07
 */
public class Question383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        /**
         * 思路：
         *
         * 类似上题，判断ransomNote中的字符数目是否小于等于magazine字符数即可
         */
        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            int n = smap.getOrDefault(ransomNote.charAt(i),0);
            smap.put(ransomNote.charAt(i),n+1);
        }
        for(int i=0;i<magazine.length();i++){
            int n = tmap.getOrDefault(magazine.charAt(i),0);
            tmap.put(magazine.charAt(i),n+1);
        }
        for(Character c:smap.keySet()){
            if(tmap.getOrDefault(c,0) < (int)smap.get(c)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("asfasf", "afs"));
    }
}
