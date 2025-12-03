package com.hs.leetcode.array.bineraySearch;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/3 21:36
 */
public class Question76 {
    /**
     * `map.get(...)` 返回的是 `Integer` 对象！！！！
     *
     * 所以直接使用 == 去判断是不对的。 **只有需要基本类型的地方才会触发自动拆箱！！！**
     *
     * if (map.get(sChars[i]) == sCharCountMap.get(sChars[i]))  由于==两边都返回的是Integer类型，所以**不会触发自动拆箱**
     *
     * 思路：
     *
     * 使用两个哈希表，一个哈希表map存储t中字符个数，另一个哈希表sCharsMap存储窗口内字符个数
     *
     * 然后当两个哈希表中对应元素个数相等时valid++，如果valid等于map.size，就说明窗口内
     *
     * 在滑动窗口移动时动态维护它。这就破坏了滑动窗口的核心思想——**增量更新**，而不是“找到一个窗口就从头再来”。
     */
    public static String minWindow(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<tChars.length; i++) {
            int count = map.getOrDefault(tChars[i], 0);
            map.put(tChars[i], count+1);
        }
        int leftPoint = 0;
        String result = "";
        int valid = 0;
        Map<Character, Integer> sCharCountMap = new HashMap<Character, Integer>();
        for(int i=0;i<sChars.length; i++) {
            if(map.containsKey(sChars[i])){
                sCharCountMap.put(sChars[i], sCharCountMap.getOrDefault(sChars[i], 0)+1);
                if(map.get(sChars[i]).equals(sCharCountMap.get(sChars[i]))) {
                    valid++;
                }
            }

            while(valid == map.size()){
                if(result.equals("") || result.length() > i-leftPoint+1){
                    result = s.substring(leftPoint, i+1);
                }

                char leftChar = sChars[leftPoint];

                if(sCharCountMap.containsKey(sChars[leftPoint])){
                    int sCharCount = sCharCountMap.get(sChars[leftPoint]);
                    sCharCountMap.put(sChars[leftPoint],sCharCount-1);
                    if(sCharCount-1 < map.get(sChars[leftPoint])){
                        valid--;
                    }
                }
                leftPoint++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }
}
