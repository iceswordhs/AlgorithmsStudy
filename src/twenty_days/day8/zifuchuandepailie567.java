package twenty_days.day8;

/**
 * @author Hs
 * @Date 2021/10/9 21:52
 */

/**
 * 给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。如果是，返回 true ；否则，返回 false 。
 *
 * 换句话说，s1 的排列之一是 s2 的 子串 。
 *
 * 思路：s1的排列是s2的子串，则表明s2的子串中有一个和s1的所有字符可以一一抵消
 */
public class zifuchuandepailie567 {
    //public boolean checkInclusion(String s1, String s2) {
    //    int n = s1.length(), m = s2.length();
    //    if (n > m) {
    //        return false;
    //    }
    //    int[] cnt1 = new int[26];
    //    int[] cnt2 = new int[26];
    //    for (int i = 0; i < n; ++i) {
    //        ++cnt1[s1.charAt(i) - 'a'];
    //        ++cnt2[s2.charAt(i) - 'a'];
    //    }
    //    if (Arrays.equals(cnt1, cnt2)) {
    //        return true;
    //    }
    //    for (int i = n; i < m; ++i) {
    //        ++cnt2[s2.charAt(i) - 'a'];
    //        --cnt2[s2.charAt(i - n) - 'a'];
    //        if (Arrays.equals(cnt1, cnt2)) {
    //            return true;
    //        }
    //    }
    //    return false;
    //}
}
