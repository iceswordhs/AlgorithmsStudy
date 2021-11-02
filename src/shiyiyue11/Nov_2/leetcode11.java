package shiyiyue11.Nov_2;

/**
 * @author Hs
 * @Date 2021/11/2 20:47
 */

/**
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器。
 *
 * 思路：双子针 左右指针较小的那个向中间移动，记录容器最大值
 */
public class leetcode11 {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int max=0;
        while(l<r){
            max=Math.max(max,Math.min(height[l],height[r])*(r-l));
            if(height[l]>height[r]) r--;
            else l++;
        }
        return max;
    }
}
