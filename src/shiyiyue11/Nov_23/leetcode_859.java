package shiyiyue11.Nov_23;

/**
 * @author Hs
 * @Date 2021/11/23 20:17
 */

/**
 * 给你两个字符串 s 和 goal ，只要我们可以通过交换 s 中的两个字母得到与 goal 相等的结果，就返回 true ；否则返回 false 。
 *
 * 交换字母的定义是：取两个下标 i 和 j （下标从 0 开始）且满足 i != j ，接着交换 s[i] 和 s[j] 处的字符。
 *
 * 例如，在 "abcd" 中交换下标 0 和下标 2 的元素可以生成 "cbad" 。
 *
 * 思路：如果两个字符串相等就判断是否有相同的字符
 *      否则记录第一个和第二个不同的字符，如果有第三个不同的字符就返回false
 *      判断是否只有一个不同的字符，如果是，返回false
 *      比较这两个不同的字符
 */
public class leetcode_859 {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        int first=-1,second=-1;

        int i=0;
        if(s.equals(goal)){
            int[] chars=new int[26];
            for(int x=0;x<s.length();x++){
                chars[s.charAt(x)-'a']++;
                if(chars[s.charAt(x)-'a']>1) return true;
            }
        }
        for(;i<s.length();i++){
            if(s.charAt(i)==goal.charAt(i)){
                continue;
            }
            if(first==-1){
                first=i;
            }else if(second==-1){
                second=i;
            }else return false;
        }

        if(first==-1||second==-1) return false;
        if(s.charAt(first)!=goal.charAt(second)) return false;
        if(s.charAt(second)!=goal.charAt(first)) return false;
        return true;
    }
}
