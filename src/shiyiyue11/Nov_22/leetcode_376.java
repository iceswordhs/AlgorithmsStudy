package shiyiyue11.Nov_22;

/**
 * @author Hs
 * @Date 2021/11/22 20:27
 */

/**
 * 如果连续数字之间的差严格地在正数和负数之间交替，则数字序列称为 摆动序列 。
 * 第一个差（如果存在的话）可能是正数或负数。仅有一个元素或者含两个不等元素的序列也视作摆动序列。
 *
 * 例如，[1, 7, 4, 9, 2, 5] 是一个 摆动序列 ，因为差值 (6, -3, 5, -7, 3)是正负交替出现的。
 *
 * 相反，[1, 4, 7, 2, 5]和[1, 7, 4, 5, 5] 不是摆动序列，
 * 第一个序列是因为它的前两个差值都是正数，第二个序列是因为它的最后一个差值为零。
 * 子序列 可以通过从原始序列中删除一些（也可以不删除）元素来获得，剩下的元素保持其原始顺序。
 *
 * 给你一个整数数组 nums ，返回 nums 中作为 摆动序列 的 最长子序列的长度 。
 *
 * 思路1：动态规划  用up数组记录结尾是升序的序列，用down记录结尾是降序的序列
 *       如果i和i-1是升序，就比较up[i-1]与down[i-1]+1的大小，然后让up等于其中较大的
 *
 * 思路2：用down记录最后两个数是下降关系的序列长度，用up记录最后两个数是上升关系的序列长度
 *       如果第i个数大于前一个数，那么就让最后两个数是上升关系的up=down+1
 *       如果第i个数小于前一个数，那么就让最后两个数是下降关系的down=dp+1
 *       如果这两个数是上升序列，就加上原来的下降序列,这样就保证了这必定是一个摇摆序列；
 *       那么up或down会不会因此变小呢，
 *       答案是不会，因为是摇摆序列，所以up和down不会相差超过1
 */
public class leetcode_376 {
    // 思路1：动态规划
    //public int wiggleMaxLength(int[] nums) {
    //    int n = nums.length;
    //    if (n < 2) {
    //        return n;
    //    }
    //    int[] up = new int[n];
    //    int[] down = new int[n];
    //    up[0] = down[0] = 1;
    //    for (int i = 1; i < n; i++) {
    //        if (nums[i] > nums[i - 1]) {
    //            up[i] = Math.max(up[i - 1], down[i - 1] + 1);
    //            down[i] = down[i - 1];
    //        } else if (nums[i] < nums[i - 1]) {
    //            up[i] = up[i - 1];
    //            down[i] = Math.max(up[i - 1] + 1, down[i - 1]);
    //        } else {
    //            up[i] = up[i - 1];
    //            down[i] = down[i - 1];
    //        }
    //    }
    //    return Math.max(up[n - 1], down[n - 1]);
    //}
    public int wiggleMaxLength(int[] nums) {
        // 使用up表示最后两个数是上升的序列 down表示最后两个数是下降序列
        int length=nums.length;
        if(length==0) return 0;
        int up=1,down=1;
        for(int i=1;i<length;i++){
            if(nums[i]>nums[i-1]){
                // 如果这两个数是上升序列，就加上原来的下降序列,这样就保证了这必定是一个摇摆序列；
                // 那么up会不会因此变小呢，答案是不会，因为摇摆序列，所以up和down不会相差超过1
                up=down+1;
            }else if(nums[i]<nums[i-1]){
                down=up+1;
            }
        }
        return Math.max(up,down);
    }
}
