package twenty_days.day4;

/**
 * @author Hs
 * @Date 2021/10/6 20:10
 */

/**
 * 给定一个已按照 非递减顺序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。
 *
 * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
 *
 * 你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
 *
 * 思路：变量i从左遍历数组，变量j从右遍历数组，
 * 如果num[i]+num[j]==target，返回i+1,j+1
 * 如果num[i]+num[j]>target，j--
 * 如果num[i]+num[j]<target，i++
 */
public class liangshuzhihe167 {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0,j=numbers.length-1;i<j;){
            if((numbers[i]+numbers[j])==target){
                return new int[]{i+1,j+1};
            } else if((numbers[i]+numbers[j])>target){
                j--;
            } else{
                i++;
            }
        }
        return new int[0];
    }
}
