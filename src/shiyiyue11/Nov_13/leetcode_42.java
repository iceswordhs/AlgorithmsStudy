package shiyiyue11.Nov_13;

/**
 * @author Hs
 * @Date 2021/11/13 18:19
 */

import java.util.Deque;
import java.util.LinkedList;

/**
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 *
 * 思路1：单调队列 保持栈顶为栈中最大值，如果新入栈的元素t比栈底元素大old，就把栈底元素弹出，其能承载的水量为old*栈顶
 *
 * 思路2：双指针
 */
public class leetcode_42 {
    //
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) {
            return 0;
        }

        int[] leftMax = new int[n];//第i个元素左边的最大值
        leftMax[0] = height[0];
        for (int i = 1; i < n; ++i) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        int[] rightMax = new int[n];//第i个元素右边的最大值
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; --i) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int ans = 0;
        for (int i = 0; i < n; ++i) {
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return ans;
    }

    // 双子针
    //public int trap(int[] height) {
    //    int left = 0, right = height.length - 1;
    //    int ans = 0;
    //    int left_max = 0, right_max = 0;
    //    while (left < right) {
    //        if (height[left] < height[right]) {
    //            if (height[left] >= left_max) {
    //                left_max = height[left];
    //            } else {
    //                ans += (left_max - height[left]);
    //            }
    //            ++left;
    //        } else {
    //            if (height[right] >= right_max) {
    //                right_max = height[right];
    //            } else {
    //                ans += (right_max - height[right]);
    //            }
    //            --right;
    //        }
    //    }
    //    return ans;
    //}

}
