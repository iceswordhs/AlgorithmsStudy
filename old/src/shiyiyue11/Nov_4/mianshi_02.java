package shiyiyue11.Nov_4;

/**
 * @author Hs
 * @Date 2021/11/4 20:01
 */

/**
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 *
 * 思路：用两个数组分别存储s1和s2出现的字符的个数
 *      比较两个数组，如果不同返回false，否则返回true
 */
public class mianshi_02 {
    public boolean CheckPermutation(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        int[] chars1=new int[26];
        int[] chars2=new int[26];
        for(int i=0;i<s1.length();i++){
            chars1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            chars2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(chars1[i]!=chars2[i]) return false;
        }
        return true;
    }
}
