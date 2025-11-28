package shiyiyue11.Nov_7;

/**
 * @author Hs
 * @Date 2021/11/7 12:17
 */

/**
 * 给你一个整数数组 nums ，你可以对它进行一些操作。
 *
 * 每次操作中，选择任意一个 nums[i] ，删除它并获得 nums[i] 的点数。
 * 之后，你必须删除 所有 等于 nums[i] - 1 和 nums[i] + 1 的元素。
 *
 * 开始你拥有 0 个点数。返回你能通过这些操作获得的最大点数。
 *
 * 思路：用一个数组记录点数的个数，并按照点数的大小从小到大排列
 *      如[2,2,4,3,3,6,7],记为[{2:2},{3:2},{4:1},{6:1},{7:1}]
 *      然后就变成了小偷偷房屋问题，偷了某个节点，就不能偷相邻节点了
 */
public class leetcode_740 {
    public int deleteAndEarn(int[] nums) {
        int maxVal = 0;
        for (int val : nums) {
            maxVal = Math.max(maxVal, val);
        }
        int[] sum = new int[maxVal + 1];
        for (int val : nums) {
            sum[val] += val;
        }
        return rob(sum);
    }

    public int rob(int[] nums) {
        int size = nums.length;
        int first = nums[0], second = Math.max(nums[0], nums[1]);
        for (int i = 2; i < size; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }
}
