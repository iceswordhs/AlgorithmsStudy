package shiyiyue11.Nov_22;

/**
 * @author Hs
 * @Date 2021/11/22 20:48
 */

/**
 * 给你一个整数数组 nums ，设计算法来打乱一个没有重复元素的数组。
 *
 * 实现 Solution class:
 *
 * Solution(int[] nums) 使用整数数组 nums 初始化对象
 * int[] reset() 重设数组到它的初始状态并返回
 * int[] shuffle() 返回数组随机打乱后的结果
 *
 * 思路：洗牌法，遍历数组。对于第i个元素，让其与random.nextInt(length-i)交换
 *      用System.arraycopy深度复制原数组，以便复原
 */
public class leetcode_384 {
    //int[] numbers,nums;
    //int i=0,j=0;
    //public Solution(int[] nums) {
    //    this.nums=nums;
    //    numbers=new int[nums.length];
    //    System.arraycopy(nums,0,numbers,0,nums.length);
    //}
    //
    //public int[] reset() {
    //    return nums;
    //}
    //// 单纯使用random可能不太符合题意
    //// 使用洗牌算法
    //public int[] shuffle() {
    //    Random random=new Random();
    //    int index;
    //    for(int i=0;i<numbers.length;i++){
    //        index=i+random.nextInt(numbers.length-i);
    //        int t=numbers[i];
    //        numbers[i]=numbers[index];
    //        numbers[index]=t;
    //    }
    //    return numbers;
    //}
}
