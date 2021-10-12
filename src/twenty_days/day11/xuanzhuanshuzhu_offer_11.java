package twenty_days.day11;

/**
 * @author Hs
 * @Date 2021/10/12 21:41
 */

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  
 *
 * 思路：二分
 * if(numbers[mid]>numbers[right])// mid在左递增中，那么旋转点在mid+1，right中  left=mid+1;// 因为旋转点不可能为第一位
 * else if(numbers[mid]<numbers[right]){// mid在右递增中，旋转点在left-mid中  right=mid;
 * else mid既可能在左递增也可能在右递增 right--缩小范围
 */
public class xuanzhuanshuzhu_offer_11 {
    public int minArray(int[] numbers) {
        int mid=0;
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            mid= (left + right) / 2;
            if(numbers[mid]>numbers[right])// mid在左递增中，那么旋转点在mid+1，right中
            {
                left=mid+1;// 因为旋转点不可能为第一位
            }else if(numbers[mid]<numbers[right]){// mid在右递增中，旋转点在left-mid中
                right=mid;
            } else{
                right--;
            }
        }
        return numbers[left];
    }
}
