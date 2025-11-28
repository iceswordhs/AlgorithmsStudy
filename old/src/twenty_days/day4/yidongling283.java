package twenty_days.day4;

/**
 * @author Hs
 * @Date 2021/10/6 19:56
 */

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 思路1：一个变量left记录数组当前第一个0的位置，一个变量right遍历数组，
 * 若nums[right]不为0，right++，left不变，否则交换两者，两者都++
 *
 * 思路2：变量count记录有几个0，不为零的位置就往前移count位，最后补count个0
 */
public class yidongling283 {
    //public void moveZeroes(int[] nums) {
    //    int left=0,right=0;
    //    while(right<nums.length){
    //        if(nums[right]!=0){
    //            swap(nums,left,right);
    //            left++;
    //        }
    //        right++;
    //    }
    //}
    //public void swap(int[] nums,int a,int b){
    //    int temp=nums[a];
    //    nums[a]=nums[b];
    //    nums[b]=temp;
    //}

    public void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }else{
                nums[i-count]=nums[i];
            }
        }
        for(int i=0;i<count;i++){
            nums[nums.length-1-i]=0;
        }
    }
}
