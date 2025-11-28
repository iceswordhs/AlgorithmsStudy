package shiyiyue11.Nov_10;

/**
 * @author Hs
 * @Date 2021/11/10 22:22
 */

/**
 * 给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
 *
 * 在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
 *
 * 注意:
 * 假设字符串的长度不会超过 1010。
 *
 * 思路：计算出每个字符出现的个数，用ans表示结果
 *      然后如果一个字符出现了偶数次n，可以加上n
 *      如果一个字符出现了奇数次，就加上n/2*2
 *      如果一个字符出现了奇数次并且ans为偶数(即还没有遇见过出现奇数次的字符)，那么ans++
 */
public class leetcode_409 {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        int length = s.length();
        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            count[c]++;
        }

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (v % 2 == 1 && ans % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
}
