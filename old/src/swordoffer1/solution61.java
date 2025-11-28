package swordoffer1;

import java.util.Arrays;

public class solution61 {
    public boolean isStraight(int[] nums) {
        int k=0;
        Arrays.sort(nums);
        for(int i=0;i<4;i++){
            if(nums[i]==0)k++;
            else if(nums[i]==nums[i+1])return false;
        }
        return nums[4]-nums[k]<5;//最大值减最小值
    }
}
