package swordoffer1;

public class solution53_II {
    public int missingNumber(int[] nums) {
        if(nums[0]!=0)return 0;
        int left=0;
        int right=nums.length-1;
        int mid=left+(right-left)/2;
        while(left<=right){
            if(nums[mid]==mid){
                left=mid+1;
                mid=left+(right-left)/2;
            }else {
                right=mid-1;
                mid=left+(right-left)/2;
            }
        }
        return left;

    }
}
