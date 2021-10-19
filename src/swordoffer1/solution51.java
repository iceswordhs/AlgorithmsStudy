package swordoffer1;

public class solution51 {
    //private static int[] nums={11,54,56,88,38,894,51};
    public int reversePairs(int[] nums) {
        int[] temp=new int[nums.length];
        int count=0;
        return reversePairs(nums,0,nums.length-1,temp);
    }

    private int reversePairs(int[] nums, int left, int right, int[] temp) {
        int count=0;
        if(left<right){
            int mid=left+(right-left)/2;
            int leftCount=reversePairs(nums,left,mid,temp);
            int rightCount=reversePairs(nums, mid+1, right, temp);
            if(nums[mid]<=nums[mid+1]){//当左右两边数组都是有序的，且右边最小大于等于左边最大说明整个数组有序，不需要再合并
                return leftCount+rightCount;
            }
            int margeCount=marge(nums,left,mid,right,temp);
            count=leftCount+rightCount+margeCount;
        }
        return count;
    }

    private int marge(int[] nums, int left, int mid, int right, int[] temp) {
        int count=0;
        int i=left;
        int j=mid+1;
        int t=0;
        while(i<=mid&&j<=right){
            if(nums[i]<=nums[j]){
                temp[t++]=nums[i++];
            }else {
                temp[t++]=nums[j++];
                count=count+mid-i+1;
            }
        }
        while (i<=mid){
            temp[t++]=nums[i++];
        }
        while(j<=right){
            temp[t++]=nums[j++];
        }
        t=0;
        while (left<=right){
            nums[left++]=temp[t++];
        }
        return count;
    }
}
