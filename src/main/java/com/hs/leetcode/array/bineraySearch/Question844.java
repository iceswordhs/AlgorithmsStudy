package com.hs.leetcode.array.bineraySearch;

/**
 *
 *
 * @author huangshuai
 * @since 2025/12/1 18:06
 */
public class Question844 {
    /**
     * 思路：
     *
     * 双指针法，慢指针记录当前存在的未被删除的字符数，注意：遇到#时，慢指针要--，但是不能小于0
     */
    public static boolean backspaceCompare(String s, String t) {
        int slowPoint = 0;
        int sLength = 0;
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for(int i=0; i<sChars.length; i++) {
            if(sChars[i] == '#'){
                slowPoint = slowPoint <= 0 ? 0 : slowPoint - 1;
            }else{
                sChars[slowPoint] = sChars[i];
                slowPoint++;
            }
        }
        sLength = slowPoint;
        slowPoint = 0;
        int tLength = 0;
        for(int i=0; i<tChars.length; i++) {
            if(tChars[i] == '#'){
                slowPoint = slowPoint <= 0 ? 0 : slowPoint - 1;
            }else{
                tChars[slowPoint] = tChars[i];
                slowPoint++;
            }
        }
        tLength = slowPoint;
        if(sLength != tLength) {
            return false;
        }else{
            for(int i=0; i<tLength; i++) {
                if(sChars[i] != tChars[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("xywrrmp", "xywrrmu#p"));
    }
}
