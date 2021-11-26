package shiyiyue11.Nov_26;

import java.util.HashMap;

/**
 * @author Hs
 * @Date 2021/11/26 21:04
 */

/**
 * 给定一个整数数组和一个整数k，
 * 判断数组中是否存在两个不同的索引i和j，
 * 使得nums [i] = nums [j]，并且 i 和 j的差的 绝对值 至多为 k。
 *
 * 思路：并查集
 */
public class leetcode_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if (temp.containsKey(nums[i])) {
                if (i - temp.get(nums[i]) <= k) {
                    return true;
                }
            }
            temp.put(nums[i], i);
        }
        return false;
    }
}
