package twenty_days.day16;

/**
 * @author Hs
 * @Date 2021/10/17 17:13
 */

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 思路：
 * 任何数与0进行异或运算都是其本身；
 * 任何数与自己进行异或操作时，结果都是0
 * 异或操作满足交换律
 */
public class zhichuxianyicideshuzhi136 {
    public int singleNumber(int[] nums) {
        int x=0;
        for (int num : nums) {
            x=x^num;
        }
        return x;
    }
}
