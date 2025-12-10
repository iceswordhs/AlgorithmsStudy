package com.hs.leetcode.array.bineraySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/10 13:49
 */
public class Question49 {
    // public List<List<String>> groupAnagrams(String[] strs) {
    //     Map<String, List<String>> map = new HashMap();
    //     for (String str : strs) {
    //         char[] chars = str.toCharArray();
    //         Arrays.sort(chars);
    //         String key = Arrays.toString(chars);
    //         List<String> list = map.getOrDefault(key, new ArrayList<>());
    //         list.add(str);
    //         map.put(key, list);
    //     }
    //     return new ArrayList<>(map.values());
    // }
    //     public List<List<String>> groupAnagrams(String[] strs) { // 方法2 将每个字符串的各字符出现次数与字符连接起来
    //     HashMap<String, List<String>> map = new HashMap<>();
    //     for (String str : strs){
    //         int[] count = new int[26];
    //         for (char c : str.toCharArray()) {
    //             count[c - 'a']++;
    //         }
    //         StringBuilder sb = new StringBuilder();
    //         for (int i=0; i<26; i++){
    //             if (count[i] != 0){
    //                 sb.append((char)('a' + i)).append(count[i]);
    //             }
    //         }
    //         String key = sb.toString();
    //         List<String> list = map.getOrDefault(key, new ArrayList<>());
    //         list.add(str);
    //         map.put(key, list);
    //     }
    //     return new ArrayList<>(map.values());
    // }
    public static List<List<String>> groupAnagrams(String[] strs) {
        /**
         * 思路：
         *
         * 使用HashMap，每个词各字符的出现次数作为key，一个list作为value，将字符次数相同的字符串放入这个list
         */
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs){
            // char[]数组初始值是'\ u000'，也就是unicode值为0的字符
            // 使用chat数组是为了方便直接生成new String，这个比字符串拼接或者Array.toString快很多
            char[] count = new char[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            String key = new String(count);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"sdf", "dsa"}));
    }
}
