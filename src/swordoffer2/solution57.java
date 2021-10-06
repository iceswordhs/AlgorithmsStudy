package swordoffer2;

public class solution57 {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i!=j){
             if(nums[i]<target-nums[j]){
                i++;
            }else if(nums[i]>target-nums[j]){
                j--;
            }else if(nums[i]==target-nums[j]){//此if一定要放到后面，因为出现的次数较少，放在前面会多进行很多判断，浪费大量时间
                return new int[]{nums[i],nums[j]};
            }
        }
        return new int[]{};
    }
}
