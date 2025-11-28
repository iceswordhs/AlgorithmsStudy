package swordoffer1;

/**
 * @author Hs
 * @Date 2021/10/29 20:05
 */

import java.util.Arrays;

/**
 * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 *
 * 思路：此题求拼接起来的最小数字，本质上是一个排序问题。设数组 numsnums 中任意两数字的字符串为 xx 和 yy ，则规定 排序判断规则 为：
 *
 * 若拼接字符串 x + y > y + xx+y>y+x ，则 xx “大于” yy ；
 * 反之，若 x + y < y + xx+y<y+x ，则 xx “小于” yy ；
 * x “小于” yy 代表：排序完成后，数组中 xx 应在 yy 左边；“大于” 则反之。
 *
 * 字符串 xy < yx , yz < zy ，需证明 xz < zx 一定成立。
 *
 * 设十进制数 x, y, z 分别有 a, b, c 位，则有：
 * （左边是字符串拼接，右边是十进制数计算，两者等价）
 * xy = x * 10^b + y
 * yx = y * 10^a + x
 *
 * 则 xy < yx 可转化为：
 * x * 10^b + y < y * 10^a + x
 * x (10^b - 1) < y (10^a - 1)
 * x / (10^a - 1) < y / (10^b - 1)     ①
 *
 * 同理， 可将 yz < zy 转化为：
 * y / (10^b - 1) < z / (10^c - 1)     ②
 *
 * 将 ① ② 合并，整理得：
 * x / (10^a - 1) < y / (10^b - 1) < z / (10^c - 1)
 * x / (10^a - 1) < z / (10^c - 1)
 * x (10^c - 1) < z (10^a - 1)
 * x * 10^c + z < z * 10^a + x
 * ∴  可推出 xz < zx ，传递性证毕
 */
public class solution45 {
        public String minNumber(int[] nums) {
            String[] strs = new String[nums.length];
            for(int i = 0; i < nums.length; i++)
                strs[i] = String.valueOf(nums[i]);
            Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));
            StringBuilder res = new StringBuilder();
            for(String s : strs)
                res.append(s);
            return res.toString();
        }
}
