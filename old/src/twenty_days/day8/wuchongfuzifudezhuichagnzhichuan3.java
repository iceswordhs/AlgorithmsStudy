package twenty_days.day8;

/**
 * @author Hs
 * @Date 2021/10/9 20:52
 */

import java.util.HashSet;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 思路：滑动窗口，一个指针left指向前面，一个指针right指向后面
 * left不动，right一直后移，直到right+1处的字符与set中字符重合
 * 此时，不断后移left，每移动一次都将left-1处的字符移出set，并判断set中是否依旧有字符与right+1处字符重合
 * 如果有，继续后移left，直到没有重合或到达字符串末尾
 */
public class wuchongfuzifudezhuichagnzhichuan3 {
    public static void main(String[] args) {
        String s="abcabcbb";
        int i = lengthOfLongestSubstring(s);

    }
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int right=-1,max=0;//right初始需要为-1，否则不会添加第一个字符到set中
        for (int left=0;left<s.length();left++){
            if (left!=0){
                //滑动窗口向右移一位
                set.remove(s.charAt(left-1));
            }
            while (right+1<s.length()&&!set.contains(s.charAt(right+1))){
                set.add(s.charAt(right+1));
                right++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}
