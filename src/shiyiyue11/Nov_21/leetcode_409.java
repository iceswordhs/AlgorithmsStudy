package shiyiyue11.Nov_21;

/**
 * @author Hs
 * @Date 2021/11/23 20:51
 */

/**
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 *
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 *
 * 思路：记录每个字符出现的次数，如果出现的次数是偶数就全部加上，否则如果总个数是奇数就加上次数-1，如果当前总个数是偶数，就加上这个奇数
 */
public class leetcode_409 {
    public int longestPalindrome(String s) {
        int[] chars=new int[52];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                chars[s.charAt(i)-'a']++;
            }else{
                chars[s.charAt(i)-'A'+26]++;
            }
        }
        int length=0,max=0;
        for(int i=0;i<52;i++){
            if((chars[i]&1)==0){
                length+=chars[i];
            }else{
                if((length&1)==0){
                    length+=chars[i];
                }else{
                    length+=chars[i]-1;
                }
            }
        }
        return length;
    }
}
