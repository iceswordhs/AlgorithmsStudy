package swordoffer1;

/**
 * @author Hs
 * @Date 2021/10/27 21:38
 */

/**
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 *
 * 思路：字母总共只有26个，用一个int数组存储每个字母的个数
 *      然后从头遍历s。使用数组存储比使用hashMap效率更高
 */
public class solution50 {
    public char firstUniqChar(String s) {
        int[] nums=new int[26];
        char[] sarray = s.toCharArray();
        for(char c:sarray){
            nums[c-'a']++;
        }
        for (char c:sarray){
            if (nums[c-'a']==1) return c;
        }
        return ' ';
    }
}
