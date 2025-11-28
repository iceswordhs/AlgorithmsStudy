package twenty_days.day15;

/**
 * @author Hs
 * @Date 2021/10/16 18:57
 */

/**
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 *
 * 思路：遍历输入值的32位，当遍历第i位时，用1<<i与n进行与运算，可知此位是否为0
 */
public class wei1degeshu191 {
    public int hammingWeight(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                ret++;
            }
        }
        return ret;
    }
}
