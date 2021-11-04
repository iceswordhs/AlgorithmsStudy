package shiyiyue11.Nov_4;

/**
 * @author Hs
 * @Date 2021/11/4 20:00
 */

/**
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 *
 * 思路：用数组存储每个字符出现的次数，如果次数大于1返回false
 */
public class mianshi01 {
    public boolean isUnique(String astr) {
        int[] chars=new int[26];
        for(int i=0;i<astr.length();i++){
            chars[astr.charAt(i)-'a']++;
            if(chars[astr.charAt(i)-'a']>1) return false;
        }
        return true;
    }
}
